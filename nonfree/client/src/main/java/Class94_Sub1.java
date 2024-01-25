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

@OriginalClass("client!io")
public final class Class94_Sub1 extends Class94 implements ImageProducer {

	@OriginalMember(owner = "client!io", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!io", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!io", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!io", name = "K", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!io", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!io", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
	@Override
	public void method4041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method2818(arg0, arg2, arg1, arg4);
		@Pc(18) Shape local18 = arg3.getClip();
		arg3.clipRect(arg2, arg0, arg1, arg4);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas1);
		arg3.setClip(local18);
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(Z)V")
	private synchronized void method2816() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4359, super.anInt4354, this.aColorModel1, super.anIntArray350, 0, super.anInt4359);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method4039(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt4359 = this.aCanvas1.getSize().width;
		super.anInt4354 = this.aCanvas1.getSize().height;
		super.anIntArray350 = new int[super.anInt4354 * super.anInt4359];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas1.createImage(this);
		this.method2816();
		this.aCanvas1.prepareImage(this.anImage2, this.aCanvas1);
		this.method2816();
		this.aCanvas1.prepareImage(this.anImage2, this.aCanvas1);
		this.method2816();
		this.aCanvas1.prepareImage(this.anImage2, this.aCanvas1);
	}

	@OriginalMember(owner = "client!io", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg2, arg3, this.aColorModel1, super.anIntArray350, arg1 + arg0 * super.anInt4359, super.anInt4359);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!io", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4359, super.anInt4354);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!io", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	@Override
	public void method4040(@OriginalArg(1) Graphics arg0) {
		this.method2816();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas1);
	}
}
