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

@OriginalClass("client!ar")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 implements ImageProducer {

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ar", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ar", name = "K", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ar", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)V")
	private synchronized void method462() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2079, super.anInt2078, this.aColorModel1, super.anIntArray169, 0, super.anInt2079);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method463(arg1, arg4, arg0, arg3);
		@Pc(13) Shape local13 = arg2.getClip();
		arg2.clipRect(arg1, arg3, arg4, arg0);
		arg2.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg2.setClip(local13);
	}

	@OriginalMember(owner = "client!ar", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2079, super.anInt2078);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method1801(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt2079 = this.aCanvas1.getSize().width;
		super.anInt2078 = this.aCanvas1.getSize().height;
		super.anIntArray169 = new int[super.anInt2078 * super.anInt2079];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method462();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method462();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method462();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method1800(@OriginalArg(1) Graphics arg0) {
		this.method462();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBIII)V")
	private synchronized void method463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg1, arg2, this.aColorModel1, super.anIntArray169, arg0 + arg3 * super.anInt2079, super.anInt2079);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ar", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}
}
