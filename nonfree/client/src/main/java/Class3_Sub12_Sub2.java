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

@OriginalClass("client!mn")
public final class Class3_Sub12_Sub2 extends Class3_Sub12 implements ImageProducer {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage17;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	private synchronized void method5832() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6770, super.anInt6771, this.aColorModel1, super.anIntArray406, 0, super.anInt6770);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V")
	private synchronized void method5834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg2, arg3, this.aColorModel1, super.anIntArray406, arg0 + super.anInt6770 * arg1, super.anInt6770);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
	@Override
	public void method5830(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		this.method5834(arg3, arg6, arg1, arg5);
		@Pc(21) Shape local21 = arg0.getClip();
		arg0.clipRect(arg4, arg2, arg1, arg5);
		arg0.drawImage(this.anImage17, arg4 - arg3, arg2 - arg6, this.aCanvas10);
		arg0.setClip(local21);
	}

	@OriginalMember(owner = "client!mn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6770, super.anInt6771);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!mn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	@Override
	public void method5831(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		super.anInt6771 = arg2;
		this.aCanvas10 = arg1;
		super.anInt6770 = arg0;
		super.anIntArray406 = new int[super.anInt6770 * super.anInt6771];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage17 = this.aCanvas10.createImage(this);
		this.method5832();
		this.aCanvas10.prepareImage(this.anImage17, this.aCanvas10);
		this.method5832();
		this.aCanvas10.prepareImage(this.anImage17, this.aCanvas10);
		this.method5832();
		this.aCanvas10.prepareImage(this.anImage17, this.aCanvas10);
	}
}
