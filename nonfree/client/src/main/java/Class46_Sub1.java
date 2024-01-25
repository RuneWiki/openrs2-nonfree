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

@OriginalClass("client!df")
public final class Class46_Sub1 extends Class46 implements ImageProducer {

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2194(@OriginalArg(1) Graphics arg0) {
		this.method1069();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!df", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2198(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1070(arg3, arg2, arg4, arg0);
		@Pc(13) Shape local13 = arg1.getClip();
		arg1.clipRect(arg4, arg2, arg0, arg3);
		arg1.drawImage(this.anImage2, 0, 0, this.aCanvas1);
		arg1.setClip(local13);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	private synchronized void method1069() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2297, super.anInt2302, this.aColorModel1, super.anIntArray262, 0, super.anInt2297);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!df", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2297, super.anInt2302);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!df", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIBI)V")
	private synchronized void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg3, arg0, this.aColorModel1, super.anIntArray262, arg2 + super.anInt2297 * arg1, super.anInt2297);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!df", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!df", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method2196(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt2297 = this.aCanvas1.getSize().width;
		super.anInt2302 = this.aCanvas1.getSize().height;
		super.anIntArray262 = new int[super.anInt2297 * super.anInt2302];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas1.createImage(this);
		this.method1069();
		this.aCanvas1.prepareImage(this.anImage2, this.aCanvas1);
		this.method1069();
		this.aCanvas1.prepareImage(this.anImage2, this.aCanvas1);
		this.method1069();
		this.aCanvas1.prepareImage(this.anImage2, this.aCanvas1);
	}
}
