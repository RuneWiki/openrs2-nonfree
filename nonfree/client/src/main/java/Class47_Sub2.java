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

@OriginalClass("client!mk")
public final class Class47_Sub2 extends Class47 implements ImageProducer {

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V")
	private synchronized void method3705() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4082, super.anInt4083, this.aColorModel1, super.anIntArray370, 0, super.anInt4082);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4082, super.anInt4083);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIB)V")
	private synchronized void method3707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg2, arg1, this.aColorModel1, super.anIntArray370, arg0 + arg3 * super.anInt4082, super.anInt4082);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method3697(@OriginalArg(1) Canvas arg0) {
		this.aCanvas4 = arg0;
		super.anInt4082 = this.aCanvas4.getSize().width;
		super.anInt4083 = this.aCanvas4.getSize().height;
		super.anIntArray370 = new int[super.anInt4082 * super.anInt4083];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas4.createImage(this);
		this.method3705();
		this.aCanvas4.prepareImage(this.anImage3, this.aCanvas4);
		this.method3705();
		this.aCanvas4.prepareImage(this.anImage3, this.aCanvas4);
		this.method3705();
		this.aCanvas4.prepareImage(this.anImage3, this.aCanvas4);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method3702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method3707(arg1, arg2, arg3, arg0);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg1, arg0, arg3, arg2);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas4);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	@Override
	public void method3696(@OriginalArg(2) Graphics arg0) {
		this.method3705();
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!mk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!mk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}
}
