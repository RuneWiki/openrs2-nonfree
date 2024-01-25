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

@OriginalClass("client!lm")
public final class Class1_Sub30_Sub1 extends Class1_Sub30 implements ImageProducer {

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIBI)V")
	private synchronized void method3368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg2, arg3, this.aColorModel1, super.anIntArray338, super.anInt5159 * arg1 + arg0, super.anInt5159);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!lm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	@Override
	public void method4041(@OriginalArg(0) Graphics arg0) {
		this.method3369();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	private synchronized void method3369() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5159, super.anInt5157, this.aColorModel1, super.anIntArray338, 0, super.anInt5159);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	@Override
	public void method4040(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method3368(arg2, arg3, arg4, arg1);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg2, arg3, arg4, arg1);
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas3);
		arg0.setClip(local13);
	}

	@OriginalMember(owner = "client!lm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	@Override
	public void method4039(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		super.anInt5159 = this.aCanvas3.getSize().width;
		super.anInt5157 = this.aCanvas3.getSize().height;
		super.anIntArray338 = new int[super.anInt5157 * super.anInt5159];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas3.createImage(this);
		this.method3369();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
		this.method3369();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
		this.method3369();
		this.aCanvas3.prepareImage(this.anImage2, this.aCanvas3);
	}

	@OriginalMember(owner = "client!lm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5159, super.anInt5157);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}
}
