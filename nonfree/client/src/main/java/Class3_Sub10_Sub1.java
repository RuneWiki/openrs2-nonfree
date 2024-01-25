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

@OriginalClass("client!ed")
public final class Class3_Sub10_Sub1 extends Class3_Sub10 implements ImageProducer {

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	private synchronized void method1625() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2900, super.anInt2898, this.aColorModel1, super.anIntArray176, 0, super.anInt2900);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ed", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ed", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIBI)V")
	private synchronized void method1626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg0, arg2, this.aColorModel1, super.anIntArray176, super.anInt2900 * arg3 + arg1, super.anInt2900);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2182(@OriginalArg(1) Graphics arg0) {
		this.method1625();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!ed", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method2183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method1626(arg1, arg0, arg2, arg3);
		@Pc(20) Shape local20 = arg4.getClip();
		arg4.clipRect(arg0, arg3, arg1, arg2);
		arg4.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg4.setClip(local20);
	}

	@OriginalMember(owner = "client!ed", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2900, super.anInt2898);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method2181(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt2900 = this.aCanvas1.getSize().width;
		super.anInt2898 = this.aCanvas1.getSize().height;
		super.anIntArray176 = new int[super.anInt2898 * super.anInt2900];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method1625();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method1625();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method1625();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}
}
