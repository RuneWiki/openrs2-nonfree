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

@OriginalClass("client!pf")
public final class Class3_Sub23_Sub1 extends Class3_Sub23 implements ImageProducer {

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	static {
		new Class239("", 76);
	}

	@OriginalMember(owner = "client!pf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBII)V")
	private synchronized void method6515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray504, super.anInt8162 * arg2 + arg3, super.anInt8162);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
	@Override
	public void method6869(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method6515(arg0, arg6, arg2, arg3);
		@Pc(13) Shape local13 = arg1.getClip();
		arg1.clipRect(arg5, arg4, arg0, arg6);
		arg1.drawImage(this.anImage1, arg5 - arg3, arg4 - arg2, this.aCanvas10);
		arg1.setClip(local13);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	private synchronized void method6517() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt8162, super.anInt8164, this.aColorModel1, super.anIntArray504, 0, super.anInt8162);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	@Override
	public void method6871(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas10 = arg1;
		super.anInt8164 = arg2;
		super.anInt8162 = arg0;
		super.anIntArray504 = new int[super.anInt8164 * super.anInt8162];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas10.createImage(this);
		this.method6517();
		this.aCanvas10.prepareImage(this.anImage1, this.aCanvas10);
		this.method6517();
		this.aCanvas10.prepareImage(this.anImage1, this.aCanvas10);
		this.method6517();
		this.aCanvas10.prepareImage(this.anImage1, this.aCanvas10);
	}

	@OriginalMember(owner = "client!pf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt8162, super.anInt8164);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!pf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!pf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}
}
