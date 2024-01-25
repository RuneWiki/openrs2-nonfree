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

@OriginalClass("client!in")
public final class Class3_Sub28_Sub1 extends Class3_Sub28 implements ImageProducer {

	@OriginalMember(owner = "client!in", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!in", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!in", name = "H", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!in", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	@Override
	public void method6898(@OriginalArg(1) Graphics arg0) {
		this.method3588();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
	private synchronized void method3588() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt8304, super.anInt8302, this.aColorModel1, super.anIntArray531, 0, super.anInt8304);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!in", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
	@Override
	public void method6900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method3589(arg4, arg0, arg3, arg1);
		@Pc(21) Shape local21 = arg2.getClip();
		arg2.clipRect(arg1, arg0, arg4, arg3);
		arg2.drawImage(this.anImage2, 0, 0, this.aCanvas6);
		arg2.setClip(local21);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method6899(@OriginalArg(0) Canvas arg0) {
		this.aCanvas6 = arg0;
		super.anInt8304 = this.aCanvas6.getSize().width;
		super.anInt8302 = this.aCanvas6.getSize().height;
		super.anIntArray531 = new int[super.anInt8302 * super.anInt8304];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas6.createImage(this);
		this.method3588();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method3588();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method3588();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
	}

	@OriginalMember(owner = "client!in", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt8304, super.anInt8302);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIII)V")
	private synchronized void method3589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg1, arg0, arg2, this.aColorModel1, super.anIntArray531, super.anInt8304 * arg1 + arg3, super.anInt8304);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!in", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!in", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}
}
