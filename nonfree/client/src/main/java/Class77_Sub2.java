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

@OriginalClass("client!rt")
public final class Class77_Sub2 extends Class77 implements ImageProducer {

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!rt", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!rt", name = "D", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!rt", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5040(@OriginalArg(1) Canvas arg0) {
		this.aCanvas4 = arg0;
		super.anInt5685 = this.aCanvas4.getSize().width;
		super.anInt5690 = this.aCanvas4.getSize().height;
		super.anIntArray499 = new int[super.anInt5690 * super.anInt5685];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas4.createImage(this);
		this.method5049();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method5049();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method5049();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
	}

	@OriginalMember(owner = "client!rt", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!rt", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5685, super.anInt5690);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method5044(@OriginalArg(3) Graphics arg0) {
		this.method5049();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!rt", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	private synchronized void method5049() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5685, super.anInt5690, this.aColorModel1, super.anIntArray499, 0, super.anInt5685);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method5043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method5050(arg4, arg0, arg1, arg2);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg2, arg4, arg0, arg1);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas4);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!rt", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!rt", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIZI)V")
	private synchronized void method5050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg0, arg1, arg2, this.aColorModel1, super.anIntArray499, arg3 + arg0 * super.anInt5685, super.anInt5685);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
