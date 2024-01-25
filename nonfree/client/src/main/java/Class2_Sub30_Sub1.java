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

@OriginalClass("client!mi")
public final class Class2_Sub30_Sub1 extends Class2_Sub30 implements ImageProducer {

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!mi", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method4498(@OriginalArg(1) Graphics arg0) {
		this.method3190();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method3192(arg0, arg2, arg1, arg3);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg0, arg3, arg1, arg2);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas2);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!mi", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	private synchronized void method3190() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5721, super.anInt5719, this.aColorModel1, super.anIntArray502, 0, super.anInt5721);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mi", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
	private synchronized void method3192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg2, arg1, this.aColorModel1, super.anIntArray502, super.anInt5721 * arg3 + arg0, super.anInt5721);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mi", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method4495(@OriginalArg(1) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt5721 = this.aCanvas2.getSize().width;
		super.anInt5719 = this.aCanvas2.getSize().height;
		super.anIntArray502 = new int[super.anInt5721 * super.anInt5719];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas2.createImage(this);
		this.method3190();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method3190();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method3190();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
	}

	@OriginalMember(owner = "client!mi", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5721, super.anInt5719);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!mi", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
