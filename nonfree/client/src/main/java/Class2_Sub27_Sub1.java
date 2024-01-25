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

@OriginalClass("client!il")
public final class Class2_Sub27_Sub1 extends Class2_Sub27 implements ImageProducer {

	@OriginalMember(owner = "client!il", name = "o", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!il", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!il", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!il", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!il", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7426, super.anInt7427);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	private synchronized void method3987() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7426, super.anInt7427, this.aColorModel1, super.anIntArray501, 0, super.anInt7426);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!il", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!il", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIZILjava/awt/Graphics;I)V")
	@Override
	public void method6242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Graphics arg5, @OriginalArg(7) int arg6) {
		this.method3989(arg2, arg1, arg3, arg0);
		@Pc(13) Shape local13 = arg5.getClip();
		arg5.clipRect(arg4, arg6, arg2, arg1);
		arg5.drawImage(this.anImage11, arg4 - arg3, arg6 - arg0, this.aCanvas6);
		arg5.setClip(local13);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/awt/Canvas;IB)V")
	@Override
	public void method6243(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		super.anInt7426 = arg2;
		super.anInt7427 = arg0;
		this.aCanvas6 = arg1;
		super.anIntArray501 = new int[super.anInt7426 * super.anInt7427];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage11 = this.aCanvas6.createImage(this);
		this.method3987();
		this.aCanvas6.prepareImage(this.anImage11, this.aCanvas6);
		this.method3987();
		this.aCanvas6.prepareImage(this.anImage11, this.aCanvas6);
		this.method3987();
		this.aCanvas6.prepareImage(this.anImage11, this.aCanvas6);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V")
	private synchronized void method3989(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg3, arg0, arg1, this.aColorModel1, super.anIntArray501, arg3 * super.anInt7426 + arg2, super.anInt7426);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
