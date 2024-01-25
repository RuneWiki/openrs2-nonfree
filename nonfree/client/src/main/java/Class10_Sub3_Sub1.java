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

@OriginalClass("client!be")
public final class Class10_Sub3_Sub1 extends Class10_Sub3 implements ImageProducer {

	@OriginalMember(owner = "client!be", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
	private synchronized void method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg2, arg0, this.aColorModel1, super.anIntArray476, arg1 + super.anInt4833 * arg3, super.anInt4833);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!be", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method3890(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt4833 = this.aCanvas2.getSize().width;
		super.anInt4831 = this.aCanvas2.getSize().height;
		super.anIntArray476 = new int[super.anInt4833 * super.anInt4831];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas2.createImage(this);
		this.method364();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
		this.method364();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
		this.method364();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	private synchronized void method364() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4833, super.anInt4831, this.aColorModel1, super.anIntArray476, 0, super.anInt4833);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!be", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!be", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method3891(@OriginalArg(3) Graphics arg0) {
		this.method364();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!be", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method3893(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method362(arg2, arg3, arg1, arg4);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas2);
		arg0.setClip(local13);
	}

	@OriginalMember(owner = "client!be", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4833, super.anInt4831);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}
}
