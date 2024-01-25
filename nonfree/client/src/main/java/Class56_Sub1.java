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

@OriginalClass("client!ep")
public final class Class56_Sub1 extends Class56 implements ImageProducer {

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method2990(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt3197 = this.aCanvas2.getSize().width;
		super.anInt3198 = this.aCanvas2.getSize().height;
		super.anIntArray271 = new int[super.anInt3198 * super.anInt3197];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas2.createImage(this);
		this.method1805();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
		this.method1805();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
		this.method1805();
		this.aCanvas2.prepareImage(this.anImage1, this.aCanvas2);
	}

	@OriginalMember(owner = "client!ep", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3197, super.anInt3198);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII)V")
	private synchronized void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg3, arg2, this.aColorModel1, super.anIntArray271, arg0 + arg1 * super.anInt3197, super.anInt3197);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
	private synchronized void method1805() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3197, super.anInt3198, this.aColorModel1, super.anIntArray271, 0, super.anInt3197);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZIILjava/awt/Graphics;)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method1804(arg1, arg0, arg3, arg2);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg1, arg0, arg2, arg3);
		arg4.drawImage(this.anImage1, 0, 0, this.aCanvas2);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!ep", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2987(@OriginalArg(3) Graphics arg0) {
		this.method1805();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!ep", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!ep", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ep", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
