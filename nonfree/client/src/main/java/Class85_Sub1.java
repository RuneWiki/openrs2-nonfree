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

@OriginalClass("client!gq")
public final class Class85_Sub1 extends Class85 implements ImageProducer {

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!gq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg0, arg2, arg1, this.aColorModel1, super.anIntArray311, super.anInt2372 * arg0 + arg3, super.anInt2372);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method2520(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt2372 = this.aCanvas2.getSize().width;
		super.anInt2369 = this.aCanvas2.getSize().height;
		super.anIntArray311 = new int[super.anInt2372 * super.anInt2369];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas2.createImage(this);
		this.method2197();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method2197();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method2197();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method2524(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2193(arg1, arg3, arg4, arg2);
		@Pc(21) Shape local21 = arg0.getClip();
		arg0.clipRect(arg2, arg1, arg4, arg3);
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
		arg0.setClip(local21);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2521(@OriginalArg(3) Graphics arg0) {
		this.method2197();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!gq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
	private synchronized void method2197() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2372, super.anInt2369, this.aColorModel1, super.anIntArray311, 0, super.anInt2372);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!gq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!gq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2372, super.anInt2369);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!gq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
