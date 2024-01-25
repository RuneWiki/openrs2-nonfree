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

@OriginalClass("client!gj")
public final class Class75_Sub1 extends Class75 implements ImageProducer {

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!gj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method3579(@OriginalArg(3) Graphics arg0) {
		this.method2052();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!gj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3952, super.anInt3950);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!gj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!gj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
	@Override
	public void method3581(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2051(arg4, arg0, arg2, arg3);
		@Pc(13) Shape local13 = arg1.getClip();
		arg1.clipRect(arg0, arg4, arg3, arg2);
		arg1.drawImage(this.anImage2, 0, 0, this.aCanvas1);
		arg1.setClip(local13);
	}

	@OriginalMember(owner = "client!gj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg3, arg2, this.aColorModel1, super.anIntArray549, arg1 + arg0 * super.anInt3952, super.anInt3952);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method3582(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt3952 = this.aCanvas1.getSize().width;
		super.anInt3950 = this.aCanvas1.getSize().height;
		super.anIntArray549 = new int[super.anInt3950 * super.anInt3952];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas1.createImage(this);
		this.method2052();
		this.aCanvas1.prepareImage(this.anImage2, this.aCanvas1);
		this.method2052();
		this.aCanvas1.prepareImage(this.anImage2, this.aCanvas1);
		this.method2052();
		this.aCanvas1.prepareImage(this.anImage2, this.aCanvas1);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
	private synchronized void method2052() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3952, super.anInt3950, this.aColorModel1, super.anIntArray549, 0, super.anInt3952);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
