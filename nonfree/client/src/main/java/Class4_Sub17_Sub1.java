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

@OriginalClass("client!hn")
public final class Class4_Sub17_Sub1 extends Class4_Sub17 implements ImageProducer {

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	@Override
	public void method4041(@OriginalArg(2) Graphics arg0) {
		this.method2275();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V")
	private synchronized void method2275() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5254, super.anInt5253, this.aColorModel1, super.anIntArray452, 0, super.anInt5254);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5254, super.anInt5253);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg1, arg2, this.aColorModel1, super.anIntArray452, arg3 * super.anInt5254 + arg0, super.anInt5254);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
	@Override
	public void method4038(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2276(arg3, arg4, arg2, arg1);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg3, arg1, arg4, arg2);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas4);
		arg0.setClip(local13);
	}

	@OriginalMember(owner = "client!hn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!hn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method4042(@OriginalArg(1) Canvas arg0) {
		this.aCanvas4 = arg0;
		super.anInt5254 = this.aCanvas4.getSize().width;
		super.anInt5253 = this.aCanvas4.getSize().height;
		super.anIntArray452 = new int[super.anInt5254 * super.anInt5253];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas4.createImage(this);
		this.method2275();
		this.aCanvas4.prepareImage(this.anImage1, this.aCanvas4);
		this.method2275();
		this.aCanvas4.prepareImage(this.anImage1, this.aCanvas4);
		this.method2275();
		this.aCanvas4.prepareImage(this.anImage1, this.aCanvas4);
	}

	@OriginalMember(owner = "client!hn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}
}
