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

@OriginalClass("client!pf")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 implements ImageProducer {

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
	@Override
	public void method4707(@OriginalArg(3) Graphics arg0) {
		this.method4710();
		arg0.drawImage(this.anImage4, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	private synchronized void method4710() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5670, super.anInt5666, this.aColorModel1, super.anIntArray458, 0, super.anInt5670);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V")
	private synchronized void method4712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg1, arg2, arg0, this.aColorModel1, super.anIntArray458, arg3 + arg1 * super.anInt5670, super.anInt5670);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIBILjava/awt/Graphics;)V")
	@Override
	public void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method4712(arg0, arg2, arg3, arg1);
		@Pc(21) Shape local21 = arg4.getClip();
		arg4.clipRect(arg1, arg2, arg3, arg0);
		arg4.drawImage(this.anImage4, 0, 0, this.aCanvas6);
		arg4.setClip(local21);
	}

	@OriginalMember(owner = "client!pf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5670, super.anInt5666);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	@Override
	public void method4705(@OriginalArg(1) Canvas arg0) {
		this.aCanvas6 = arg0;
		super.anInt5670 = this.aCanvas6.getSize().width;
		super.anInt5666 = this.aCanvas6.getSize().height;
		super.anIntArray458 = new int[super.anInt5666 * super.anInt5670];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage4 = this.aCanvas6.createImage(this);
		this.method4710();
		this.aCanvas6.prepareImage(this.anImage4, this.aCanvas6);
		this.method4710();
		this.aCanvas6.prepareImage(this.anImage4, this.aCanvas6);
		this.method4710();
		this.aCanvas6.prepareImage(this.anImage4, this.aCanvas6);
	}

	@OriginalMember(owner = "client!pf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!pf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}
}
