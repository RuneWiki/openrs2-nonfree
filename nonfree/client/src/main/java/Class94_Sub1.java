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

@OriginalClass("client!hp")
public final class Class94_Sub1 extends Class94 implements ImageProducer {

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!hp", name = "q", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!hp", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg2, arg0, this.aColorModel1, super.anIntArray521, arg1 + super.anInt6580 * arg3, super.anInt6580);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method5462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4) {
		this.method2450(arg0, arg1, arg3, arg2);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg1, arg2, arg3, arg0);
		arg4.drawImage(this.anImage1, 0, 0, this.aCanvas5);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!hp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!hp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5464(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = arg0;
		super.anInt6580 = this.aCanvas5.getSize().width;
		super.anInt6579 = this.aCanvas5.getSize().height;
		super.anIntArray521 = new int[super.anInt6579 * super.anInt6580];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas5.createImage(this);
		this.method2454();
		this.aCanvas5.prepareImage(this.anImage1, this.aCanvas5);
		this.method2454();
		this.aCanvas5.prepareImage(this.anImage1, this.aCanvas5);
		this.method2454();
		this.aCanvas5.prepareImage(this.anImage1, this.aCanvas5);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method5463(@OriginalArg(1) Graphics arg0) {
		this.method2454();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!hp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6580, super.anInt6579);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	private synchronized void method2454() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6580, super.anInt6579, this.aColorModel1, super.anIntArray521, 0, super.anInt6580);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
