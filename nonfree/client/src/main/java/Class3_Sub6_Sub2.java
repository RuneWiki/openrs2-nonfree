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

@OriginalClass("client!eu")
public final class Class3_Sub6_Sub2 extends Class3_Sub6 implements ImageProducer {

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!eu", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!eu", name = "L", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!eu", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!eu", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	@Override
	public void method2204(@OriginalArg(2) Graphics arg0) {
		this.method2215();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!eu", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!eu", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2588, super.anInt2586);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIB)V")
	private synchronized void method2213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg1, arg0, arg2, this.aColorModel1, super.anIntArray259, arg3 + super.anInt2588 * arg1, super.anInt2588);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!eu", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)V")
	private synchronized void method2215() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2588, super.anInt2586, this.aColorModel1, super.anIntArray259, 0, super.anInt2588);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method2207(@OriginalArg(1) Canvas arg0) {
		this.aCanvas4 = arg0;
		super.anInt2588 = this.aCanvas4.getSize().width;
		super.anInt2586 = this.aCanvas4.getSize().height;
		super.anIntArray259 = new int[super.anInt2588 * super.anInt2586];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas4.createImage(this);
		this.method2215();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method2215();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method2215();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZIIIILjava/awt/Graphics;)V")
	@Override
	public void method2206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method2213(arg1, arg3, arg0, arg2);
		@Pc(19) Shape local19 = arg4.getClip();
		arg4.clipRect(arg2, arg3, arg1, arg0);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas4);
		arg4.setClip(local19);
	}
}
