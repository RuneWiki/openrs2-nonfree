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

@OriginalClass("client!fd")
public final class Class2_Sub17_Sub1 extends Class2_Sub17 implements ImageProducer {

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	private synchronized void method2341() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4543, super.anInt4544, this.aColorModel1, super.anIntArray302, 0, super.anInt4543);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
	@Override
	public void method3778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method2343(arg0, arg2, arg1, arg4);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg1, arg0, arg2, arg4);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas3);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!fd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	@Override
	public void method3777(@OriginalArg(2) Graphics arg0) {
		this.method2341();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method3774(@OriginalArg(1) Canvas arg0) {
		this.aCanvas3 = arg0;
		super.anInt4543 = this.aCanvas3.getSize().width;
		super.anInt4544 = this.aCanvas3.getSize().height;
		super.anIntArray302 = new int[super.anInt4544 * super.anInt4543];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas3.createImage(this);
		this.method2341();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
		this.method2341();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
		this.method2341();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBII)V")
	private synchronized void method2343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg1, arg3, this.aColorModel1, super.anIntArray302, super.anInt4543 * arg0 + arg2, super.anInt4543);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!fd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4543, super.anInt4544);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!fd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
