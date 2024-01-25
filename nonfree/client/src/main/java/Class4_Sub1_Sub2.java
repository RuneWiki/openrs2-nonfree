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

@OriginalClass("client!uba")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 implements ImageProducer {

	@OriginalMember(owner = "client!uba", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage15;

	@OriginalMember(owner = "client!uba", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!uba", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!uba", name = "A", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas16;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method7319(@OriginalArg(2) Graphics arg0) {
		this.method7322();
		arg0.drawImage(this.anImage15, 0, 0, this.aCanvas16);
	}

	@OriginalMember(owner = "client!uba", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIII)V")
	private synchronized void method7321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg3, arg0, this.aColorModel1, super.anIntArray680, super.anInt8906 * arg1 + arg2, super.anInt8906);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
	private synchronized void method7322() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt8906, super.anInt8905, this.aColorModel1, super.anIntArray680, 0, super.anInt8906);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!uba", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!uba", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!uba", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!uba", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt8906, super.anInt8905);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method7321(arg0, arg1, arg3, arg2);
		@Pc(19) Shape local19 = arg4.getClip();
		arg4.clipRect(arg3, arg1, arg2, arg0);
		arg4.drawImage(this.anImage15, 0, 0, this.aCanvas16);
		arg4.setClip(local19);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7320(@OriginalArg(1) Canvas arg0) {
		this.aCanvas16 = arg0;
		super.anInt8906 = this.aCanvas16.getSize().width;
		super.anInt8905 = this.aCanvas16.getSize().height;
		super.anIntArray680 = new int[super.anInt8905 * super.anInt8906];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage15 = this.aCanvas16.createImage(this);
		this.method7322();
		this.aCanvas16.prepareImage(this.anImage15, this.aCanvas16);
		this.method7322();
		this.aCanvas16.prepareImage(this.anImage15, this.aCanvas16);
		this.method7322();
		this.aCanvas16.prepareImage(this.anImage15, this.aCanvas16);
	}
}
