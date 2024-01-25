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

@OriginalClass("client!l")
public final class Class2_Sub26_Sub1 extends Class2_Sub26 implements ImageProducer {

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!l", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		this.aCanvas4 = arg1;
		super.anInt6570 = arg0;
		super.anInt6571 = arg2;
		super.anIntArray482 = new int[super.anInt6570 * super.anInt6571];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage13 = this.aCanvas4.createImage(this);
		this.method4207();
		this.aCanvas4.prepareImage(this.anImage13, this.aCanvas4);
		this.method4207();
		this.aCanvas4.prepareImage(this.anImage13, this.aCanvas4);
		this.method4207();
		this.aCanvas4.prepareImage(this.anImage13, this.aCanvas4);
	}

	@OriginalMember(owner = "client!l", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBLjava/awt/Graphics;IIII)V")
	@Override
	public void method5617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method4206(arg0, arg4, arg6, arg1);
		@Pc(19) Shape local19 = arg2.getClip();
		arg2.clipRect(arg3, arg5, arg1, arg4);
		arg2.drawImage(this.anImage13, arg3 - arg0, arg5 + -arg6, this.aCanvas4);
		arg2.setClip(local19);
	}

	@OriginalMember(owner = "client!l", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6571, super.anInt6570);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIII)V")
	private synchronized void method4206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg2, arg3, arg1, this.aColorModel1, super.anIntArray482, super.anInt6571 * arg2 + arg0, super.anInt6571);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
	private synchronized void method4207() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6571, super.anInt6570, this.aColorModel1, super.anIntArray482, 0, super.anInt6571);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!l", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!l", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!l", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}
}
