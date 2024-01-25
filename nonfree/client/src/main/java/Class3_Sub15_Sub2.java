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

@OriginalClass("client!ml")
public final class Class3_Sub15_Sub2 extends Class3_Sub15 implements ImageProducer {

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!ml", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6369, super.anInt6370);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	private synchronized void method5524() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6369, super.anInt6370, this.aColorModel1, super.anIntArray488, 0, super.anInt6369);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBII)V")
	private synchronized void method5525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg2, arg3, this.aColorModel1, super.anIntArray488, arg1 + arg0 * super.anInt6369, super.anInt6369);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ml", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	@Override
	public void method5519(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas6 = arg1;
		super.anInt6369 = arg2;
		super.anInt6370 = arg0;
		super.anIntArray488 = new int[super.anInt6370 * super.anInt6369];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas6.createImage(this);
		this.method5524();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method5524();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method5524();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
	}

	@OriginalMember(owner = "client!ml", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIILjava/awt/Graphics;IIII)V")
	@Override
	public void method5522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method5525(arg4, arg0, arg6, arg5);
		@Pc(13) Shape local13 = arg2.getClip();
		arg2.clipRect(arg3, arg1, arg6, arg5);
		arg2.drawImage(this.anImage2, arg3 - arg0, -arg4 + arg1, this.aCanvas6);
		arg2.setClip(local13);
	}

	@OriginalMember(owner = "client!ml", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
