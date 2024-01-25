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

@OriginalClass("client!kq")
public final class Class2_Sub21_Sub1 extends Class2_Sub21 implements ImageProducer {

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!kq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9341, super.anInt9342);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!kq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!kq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIB)V")
	private synchronized void method4026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg3, arg2, this.aColorModel1, super.anIntArray761, super.anInt9341 * arg0 + arg1, super.anInt9341);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method7766(@OriginalArg(1) Graphics arg0) {
		this.method4029();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method7767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method4026(arg1, arg3, arg0, arg2);
		@Pc(18) Shape local18 = arg4.getClip();
		arg4.clipRect(arg3, arg1, arg2, arg0);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas5);
		arg4.setClip(local18);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7764(@OriginalArg(1) Canvas arg0) {
		this.aCanvas5 = arg0;
		super.anInt9341 = this.aCanvas5.getSize().width;
		super.anInt9342 = this.aCanvas5.getSize().height;
		super.anIntArray761 = new int[super.anInt9341 * super.anInt9342];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas5.createImage(this);
		this.method4029();
		this.aCanvas5.prepareImage(this.anImage2, this.aCanvas5);
		this.method4029();
		this.aCanvas5.prepareImage(this.anImage2, this.aCanvas5);
		this.method4029();
		this.aCanvas5.prepareImage(this.anImage2, this.aCanvas5);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
	private synchronized void method4029() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9341, super.anInt9342, this.aColorModel1, super.anIntArray761, 0, super.anInt9341);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
