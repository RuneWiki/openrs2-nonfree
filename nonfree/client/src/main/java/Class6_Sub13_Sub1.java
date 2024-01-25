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

@OriginalClass("client!ef")
public final class Class6_Sub13_Sub1 extends Class6_Sub13 implements ImageProducer {

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method4479(@OriginalArg(0) Graphics arg0) {
		this.method1908();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
	private synchronized void method1908() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5409, super.anInt5412, this.aColorModel1, super.anIntArray420, 0, super.anInt5409);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method4478(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt5409 = this.aCanvas2.getSize().width;
		super.anInt5412 = this.aCanvas2.getSize().height;
		super.anIntArray420 = new int[super.anInt5412 * super.anInt5409];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas2.createImage(this);
		this.method1908();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
		this.method1908();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
		this.method1908();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
	}

	@OriginalMember(owner = "client!ef", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ef", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
	@Override
	public void method4477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method1911(arg2, arg0, arg4, arg1);
		@Pc(21) Shape local21 = arg3.getClip();
		arg3.clipRect(arg4, arg2, arg1, arg0);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas2);
		arg3.setClip(local21);
	}

	@OriginalMember(owner = "client!ef", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5409, super.anInt5412);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ef", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
	private synchronized void method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg3, arg1, this.aColorModel1, super.anIntArray420, arg0 * super.anInt5409 + arg2, super.anInt5409);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ef", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
