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

@OriginalClass("client!tn")
public final class Class3_Sub19_Sub2 extends Class3_Sub19 implements ImageProducer {

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	static {
		new Class318("", 73);
	}

	@OriginalMember(owner = "client!tn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
	private synchronized void method6865() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt8143, super.anInt8145, this.aColorModel1, super.anIntArray623, 0, super.anInt8143);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt8143, super.anInt8145);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)V")
	private synchronized void method6866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg1, arg2, arg0, this.aColorModel1, super.anIntArray623, arg3 + super.anInt8143 * arg1, super.anInt8143);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method6861(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = arg0;
		super.anInt8143 = this.aCanvas11.getSize().width;
		super.anInt8145 = this.aCanvas11.getSize().height;
		super.anIntArray623 = new int[super.anInt8145 * super.anInt8143];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage12 = this.aCanvas11.createImage(this);
		this.method6865();
		this.aCanvas11.prepareImage(this.anImage12, this.aCanvas11);
		this.method6865();
		this.aCanvas11.prepareImage(this.anImage12, this.aCanvas11);
		this.method6865();
		this.aCanvas11.prepareImage(this.anImage12, this.aCanvas11);
	}

	@OriginalMember(owner = "client!tn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method6860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method6866(arg1, arg0, arg2, arg4);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg4, arg0, arg2, arg1);
		arg3.drawImage(this.anImage12, 0, 0, this.aCanvas11);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	@Override
	public void method6858(@OriginalArg(3) Graphics arg0) {
		this.method6865();
		arg0.drawImage(this.anImage12, 0, 0, this.aCanvas11);
	}
}
