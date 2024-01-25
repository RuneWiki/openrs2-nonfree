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

@OriginalClass("client!bt")
public final class Class30_Sub1 extends Class30 implements ImageProducer {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!bt", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!bt", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method4460(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method470(arg4, arg2, arg3, arg0);
		@Pc(13) Shape local13 = arg1.getClip();
		arg1.clipRect(arg3, arg2, arg0, arg4);
		arg1.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg1.setClip(local13);
	}

	@OriginalMember(owner = "client!bt", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	private synchronized void method467() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5277, super.anInt5276, this.aColorModel1, super.anIntArray411, 0, super.anInt5277);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bt", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	@Override
	public void method4463(@OriginalArg(0) Graphics arg0) {
		this.method467();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIZ)V")
	private synchronized void method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg3, arg0, this.aColorModel1, super.anIntArray411, arg2 + super.anInt5277 * arg1, super.anInt5277);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bt", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!bt", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5277, super.anInt5276);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!bt", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method4462(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt5277 = this.aCanvas1.getSize().width;
		super.anInt5276 = this.aCanvas1.getSize().height;
		super.anIntArray411 = new int[super.anInt5276 * super.anInt5277];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method467();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method467();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method467();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}
}
