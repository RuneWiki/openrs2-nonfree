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

@OriginalClass("client!sa")
public final class Class86_Sub2 extends Class86 implements ImageProducer {

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	@Override
	public void method4806(@OriginalArg(2) Graphics arg0) {
		this.method4819();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method4811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method4821(arg0, arg1, arg2, arg4);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg1, arg4, arg2, arg0);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas5);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!sa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method4813(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		super.anInt5409 = this.aCanvas5.getSize().width;
		super.anInt5411 = this.aCanvas5.getSize().height;
		super.anIntArray683 = new int[super.anInt5411 * super.anInt5409];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas5.createImage(this);
		this.method4819();
		this.aCanvas5.prepareImage(this.anImage2, this.aCanvas5);
		this.method4819();
		this.aCanvas5.prepareImage(this.anImage2, this.aCanvas5);
		this.method4819();
		this.aCanvas5.prepareImage(this.anImage2, this.aCanvas5);
	}

	@OriginalMember(owner = "client!sa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!sa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5409, super.anInt5411);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
	private synchronized void method4819() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5409, super.anInt5411, this.aColorModel1, super.anIntArray683, 0, super.anInt5409);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBII)V")
	private synchronized void method4821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg2, arg0, this.aColorModel1, super.anIntArray683, arg1 + super.anInt5409 * arg3, super.anInt5409);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!sa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
