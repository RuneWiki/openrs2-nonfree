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

@OriginalClass("client!ft")
public final class Class1_Sub11_Sub1 extends Class1_Sub11 implements ImageProducer {

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ft", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ft", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ft", name = "J", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIII)V")
	private synchronized void method1794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg1, arg0, arg2, this.aColorModel1, super.anIntArray512, arg1 * super.anInt6235 + arg3, super.anInt6235);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method5037(@OriginalArg(1) Graphics arg0) {
		this.method1798();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5038(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1794(arg4, arg2, arg1, arg3);
		@Pc(15) Shape local15 = arg0.getClip();
		arg0.clipRect(arg3, arg2, arg4, arg1);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg0.setClip(local15);
	}

	@OriginalMember(owner = "client!ft", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!ft", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ft", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ft", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6235, super.anInt6233);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
	private synchronized void method1798() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6235, super.anInt6233, this.aColorModel1, super.anIntArray512, 0, super.anInt6235);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method5036(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt6235 = this.aCanvas1.getSize().width;
		super.anInt6233 = this.aCanvas1.getSize().height;
		super.anIntArray512 = new int[super.anInt6233 * super.anInt6235];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method1798();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method1798();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method1798();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}
}
