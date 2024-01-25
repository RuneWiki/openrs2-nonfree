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

@OriginalClass("client!qo")
public final class Class193_Sub1 extends Class193 implements ImageProducer {

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qo", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5586, super.anInt5585);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method4807(@OriginalArg(1) Canvas arg0) {
		this.aCanvas5 = arg0;
		super.anInt5586 = this.aCanvas5.getSize().width;
		super.anInt5585 = this.aCanvas5.getSize().height;
		super.anIntArray645 = new int[super.anInt5586 * super.anInt5585];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas5.createImage(this);
		this.method4427();
		this.aCanvas5.prepareImage(this.anImage1, this.aCanvas5);
		this.method4427();
		this.aCanvas5.prepareImage(this.anImage1, this.aCanvas5);
		this.method4427();
		this.aCanvas5.prepareImage(this.anImage1, this.aCanvas5);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	private synchronized void method4427() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5586, super.anInt5585, this.aColorModel1, super.anIntArray645, 0, super.anInt5586);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
	@Override
	public void method4805(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4430(arg3, arg2, arg4, arg1);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg4, arg2, arg1, arg3);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas5);
		arg0.setClip(local13);
	}

	@OriginalMember(owner = "client!qo", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!qo", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	@Override
	public void method4808(@OriginalArg(3) Graphics arg0) {
		this.method4427();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
	private synchronized void method4430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg3, arg0, this.aColorModel1, super.anIntArray645, arg2 + arg1 * super.anInt5586, super.anInt5586);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qo", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
