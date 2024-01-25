import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class4_Sub12_Sub1 extends Class4_Sub12 implements ImageProducer {

	@OriginalMember(owner = "client!dfa", name = "p", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!dfa", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!dfa", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!dfa", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg3, arg1, arg0, this.aColorModel1, super.anIntArray376, super.anInt7426 * arg3 + arg2, super.anInt7426);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!dfa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7426, super.anInt7429);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
	private synchronized void method2069() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7426, super.anInt7429, this.aColorModel1, super.anIntArray376, 0, super.anInt7426);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method6129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.method2067(arg0, arg4, arg2, arg1);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg2, arg1, arg4, arg0);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas6);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method6130(@OriginalArg(0) Graphics arg0) {
		this.method2069();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!dfa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!dfa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method6131(@OriginalArg(1) Canvas arg0) {
		this.aCanvas6 = arg0;
		super.anInt7426 = this.aCanvas6.getSize().width;
		super.anInt7429 = this.aCanvas6.getSize().height;
		super.anIntArray376 = new int[super.anInt7426 * super.anInt7429];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas6.createImage(this);
		this.method2069();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method2069();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method2069();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
	}
}
