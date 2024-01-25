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

@OriginalClass("client!w")
public final class Class4_Sub12_Sub2 extends Class4_Sub12 implements ImageProducer {

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!w", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!w", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!w", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIBLjava/awt/Graphics;III)V")
	@Override
	public void method8687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method8690(arg1, arg2, arg5, arg0);
		@Pc(17) Shape local17 = arg3.getClip();
		arg3.clipRect(arg4, arg6, arg1, arg2);
		arg3.drawImage(this.anImage13, arg4 - arg0, -arg5 + arg6, this.aCanvas13);
		arg3.setClip(local17);
	}

	@OriginalMember(owner = "client!w", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt10264, super.anInt10265);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!w", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	private synchronized void method8689() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt10264, super.anInt10265, this.aColorModel1, super.anIntArray710, 0, super.anInt10264);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;BII)V")
	@Override
	public void method8686(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt10264 = arg1;
		super.anInt10265 = arg2;
		this.aCanvas13 = arg0;
		super.anIntArray710 = new int[super.anInt10265 * super.anInt10264];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage13 = this.aCanvas13.createImage(this);
		this.method8689();
		this.aCanvas13.prepareImage(this.anImage13, this.aCanvas13);
		this.method8689();
		this.aCanvas13.prepareImage(this.anImage13, this.aCanvas13);
		this.method8689();
		this.aCanvas13.prepareImage(this.anImage13, this.aCanvas13);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V")
	private synchronized void method8690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray710, super.anInt10264 * arg2 + arg3, super.anInt10264);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
