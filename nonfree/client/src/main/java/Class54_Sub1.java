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

@OriginalClass("client!ei")
public final class Class54_Sub1 extends Class54 implements ImageProducer {

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ei", name = "G", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method1855(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt2044 = this.aCanvas2.getSize().width;
		super.anInt2043 = this.aCanvas2.getSize().height;
		super.anIntArray119 = new int[super.anInt2043 * super.anInt2044];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas2.createImage(this);
		this.method1740();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
		this.method1740();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
		this.method1740();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
	@Override
	public void method1857(@OriginalArg(1) Graphics arg0) {
		this.method1740();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	private synchronized void method1740() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2044, super.anInt2043, this.aColorModel1, super.anIntArray119, 0, super.anInt2044);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ei", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ei", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2044, super.anInt2043);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIZ)V")
	private synchronized void method1743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg2, arg1, arg3, this.aColorModel1, super.anIntArray119, arg2 * super.anInt2044 + arg0, super.anInt2044);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ei", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ei", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method1743(arg1, arg0, arg3, arg2);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg1, arg3, arg0, arg2);
		arg4.drawImage(this.anImage1, 0, 0, this.aCanvas2);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!ei", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}
}
