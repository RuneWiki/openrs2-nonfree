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

@OriginalClass("client!rc")
public final class Class6_Sub7_Sub2 extends Class6_Sub7 implements ImageProducer {

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!rc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!rc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	@Override
	public void method4871(@OriginalArg(0) Graphics arg0) {
		this.method4881();
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	private synchronized void method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg2, arg0, this.aColorModel1, super.anIntArray395, arg1 + arg3 * super.anInt5817, super.anInt5817);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	@Override
	public void method4868(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4877(arg4, arg1, arg3, arg2);
		@Pc(21) Shape local21 = arg0.getClip();
		arg0.clipRect(arg1, arg2, arg3, arg4);
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
		arg0.setClip(local21);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method4874(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = arg0;
		super.anInt5817 = this.aCanvas4.getSize().width;
		super.anInt5821 = this.aCanvas4.getSize().height;
		super.anIntArray395 = new int[super.anInt5817 * super.anInt5821];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas4.createImage(this);
		this.method4881();
		this.aCanvas4.prepareImage(this.anImage3, this.aCanvas4);
		this.method4881();
		this.aCanvas4.prepareImage(this.anImage3, this.aCanvas4);
		this.method4881();
		this.aCanvas4.prepareImage(this.anImage3, this.aCanvas4);
	}

	@OriginalMember(owner = "client!rc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
	private synchronized void method4881() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5817, super.anInt5821, this.aColorModel1, super.anIntArray395, 0, super.anInt5817);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!rc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5817, super.anInt5821);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}
}
