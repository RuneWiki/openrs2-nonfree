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

@OriginalClass("client!lfa")
public final class Class3_Sub31_Sub2 extends Class3_Sub31 implements ImageProducer {

	@OriginalMember(owner = "client!lfa", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!lfa", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!lfa", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!lfa", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!lfa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!lfa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIBII)V")
	private synchronized void method5153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg2, arg3, this.aColorModel1, super.anIntArray346, arg1 * super.anInt6047 + arg0, super.anInt6047);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6047, super.anInt6048);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!lfa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
	@Override
	public void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method5153(arg4, arg2, arg5, arg0);
		@Pc(13) Shape local13 = arg1.getClip();
		arg1.clipRect(arg3, arg6, arg5, arg0);
		arg1.drawImage(this.anImage3, arg3 - arg4, arg6 - arg2, this.aCanvas9);
		arg1.setClip(local13);
	}

	@OriginalMember(owner = "client!lfa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
	private synchronized void method5155() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6047, super.anInt6048, this.aColorModel1, super.anIntArray346, 0, super.anInt6047);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	@Override
	public void method5152(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas9 = arg1;
		super.anInt6047 = arg2;
		super.anInt6048 = arg0;
		super.anIntArray346 = new int[super.anInt6047 * super.anInt6048];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas9.createImage(this);
		this.method5155();
		this.aCanvas9.prepareImage(this.anImage3, this.aCanvas9);
		this.method5155();
		this.aCanvas9.prepareImage(this.anImage3, this.aCanvas9);
		this.method5155();
		this.aCanvas9.prepareImage(this.anImage3, this.aCanvas9);
	}
}
