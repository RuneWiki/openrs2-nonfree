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
public final class Class1_Sub12_Sub2 extends Class1_Sub12 implements ImageProducer {

	@OriginalMember(owner = "client!in", name = "J", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!in", name = "X", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method2584(@OriginalArg(0) Canvas arg0) {
		this.aCanvas6 = arg0;
		super.anInt3188 = this.aCanvas6.getSize().width;
		super.anInt3186 = this.aCanvas6.getSize().height;
		super.anIntArray237 = new int[super.anInt3186 * super.anInt3188];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas6.createImage(this);
		this.method2591();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method2591();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method2591();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method2580(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2588(arg3, arg1, arg2, arg4);
		@Pc(21) Shape local21 = arg0.getClip();
		arg0.clipRect(arg2, arg3, arg1, arg4);
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas6);
		arg0.setClip(local21);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg1, arg3, this.aColorModel1, super.anIntArray237, arg2 + arg0 * super.anInt3188, super.anInt3188);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!in", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	@Override
	public void method2585(@OriginalArg(0) Graphics arg0) {
		this.method2591();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!in", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
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

	@OriginalMember(owner = "client!in", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3188, super.anInt3186);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V")
	private synchronized void method2591() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3188, super.anInt3186, this.aColorModel1, super.anIntArray237, 0, super.anInt3188);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
