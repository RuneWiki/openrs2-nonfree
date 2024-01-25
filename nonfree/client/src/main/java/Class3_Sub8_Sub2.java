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

@OriginalClass("client!iu")
public final class Class3_Sub8_Sub2 extends Class3_Sub8 implements ImageProducer {

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!iu", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!iu", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!iu", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!iu", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!iu", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3342, super.anInt3346);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!iu", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!iu", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2872(@OriginalArg(1) Graphics arg0) {
		this.method2878();
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	private synchronized void method2878() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3342, super.anInt3346, this.aColorModel1, super.anIntArray197, 0, super.anInt3342);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIBII)V")
	private synchronized void method2880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg3, arg2, this.aColorModel1, super.anIntArray197, arg0 + arg1 * super.anInt3342, super.anInt3342);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4) {
		this.method2880(arg0, arg2, arg1, arg3);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg0, arg2, arg3, arg1);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas4);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method2876(@OriginalArg(1) Canvas arg0) {
		this.aCanvas4 = arg0;
		super.anInt3342 = this.aCanvas4.getSize().width;
		super.anInt3346 = this.aCanvas4.getSize().height;
		super.anIntArray197 = new int[super.anInt3342 * super.anInt3346];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas4.createImage(this);
		this.method2878();
		this.aCanvas4.prepareImage(this.anImage3, this.aCanvas4);
		this.method2878();
		this.aCanvas4.prepareImage(this.anImage3, this.aCanvas4);
		this.method2878();
		this.aCanvas4.prepareImage(this.anImage3, this.aCanvas4);
	}
}
