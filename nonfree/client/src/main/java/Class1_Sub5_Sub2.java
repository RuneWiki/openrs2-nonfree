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

@OriginalClass("client!hl")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 implements ImageProducer {

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!hl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!hl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3325, super.anInt3326);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	@Override
	public void method2908(@OriginalArg(1) Canvas arg0) {
		this.aCanvas6 = arg0;
		super.anInt3325 = this.aCanvas6.getSize().width;
		super.anInt3326 = this.aCanvas6.getSize().height;
		super.anIntArray309 = new int[super.anInt3326 * super.anInt3325];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas6.createImage(this);
		this.method2915();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method2915();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method2915();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	private synchronized void method2915() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3325, super.anInt3326, this.aColorModel1, super.anIntArray309, 0, super.anInt3325);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method2909(@OriginalArg(2) Graphics arg0) {
		this.method2915();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIIII)V")
	private synchronized void method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg0, arg2, arg1, this.aColorModel1, super.anIntArray309, arg0 * super.anInt3325 + arg3, super.anInt3325);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!hl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!hl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method2910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.method2916(arg2, arg0, arg4, arg1);
		@Pc(15) Shape local15 = arg3.getClip();
		arg3.clipRect(arg1, arg2, arg4, arg0);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas6);
		arg3.setClip(local15);
	}
}
