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

@OriginalClass("client!mq")
public final class Class5_Sub17_Sub1 extends Class5_Sub17 implements ImageProducer {

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!mq", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!mq", name = "H", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILjava/awt/Graphics;ZII)V")
	@Override
	public void method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method3370(arg0, arg4, arg3, arg1);
		@Pc(18) Shape local18 = arg2.getClip();
		arg2.clipRect(arg1, arg0, arg3, arg4);
		arg2.drawImage(this.anImage2, 0, 0, this.aCanvas3);
		arg2.setClip(local18);
	}

	@OriginalMember(owner = "client!mq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	private synchronized void method3368() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5326, super.anInt5324, this.aColorModel1, super.anIntArray386, 0, super.anInt5326);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5326, super.anInt5324);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!mq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method4121(@OriginalArg(1) Canvas arg0) {
		this.aCanvas3 = arg0;
		super.anInt5326 = this.aCanvas3.getSize().width;
		super.anInt5324 = this.aCanvas3.getSize().height;
		super.anIntArray386 = new int[super.anInt5324 * super.anInt5326];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas3.createImage(this);
		this.method3368();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
		this.method3368();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
		this.method3368();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	@Override
	public void method4119(@OriginalArg(2) Graphics arg0) {
		this.method3368();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)V")
	private synchronized void method3370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg0, arg2, arg1, this.aColorModel1, super.anIntArray386, arg3 + arg0 * super.anInt5326, super.anInt5326);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!mq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
