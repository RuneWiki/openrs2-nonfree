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

@OriginalClass("client!em")
public final class Class3_Sub16_Sub1 extends Class3_Sub16 implements ImageProducer {

	@OriginalMember(owner = "client!em", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!em", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!em", name = "O", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!em", name = "U", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!em", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!em", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7443, super.anInt7442);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	@Override
	public void method5825(@OriginalArg(2) Graphics arg0) {
		this.method1706();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5831(@OriginalArg(1) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt7443 = this.aCanvas1.getSize().width;
		super.anInt7442 = this.aCanvas1.getSize().height;
		super.anIntArray562 = new int[super.anInt7443 * super.anInt7442];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method1706();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method1706();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method1706();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}

	@OriginalMember(owner = "client!em", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!em", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
	private synchronized void method1706() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7443, super.anInt7442, this.aColorModel1, super.anIntArray562, 0, super.anInt7443);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5830(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1707(arg2, arg1, arg3, arg4);
		@Pc(21) Shape local21 = arg0.getClip();
		arg0.clipRect(arg1, arg3, arg4, arg2);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg0.setClip(local21);
	}

	@OriginalMember(owner = "client!em", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
	private synchronized void method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg3, arg0, this.aColorModel1, super.anIntArray562, arg1 + super.anInt7443 * arg2, super.anInt7443);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
