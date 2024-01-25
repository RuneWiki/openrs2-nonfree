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

@OriginalClass("client!go")
public final class Class4_Sub14_Sub2 extends Class4_Sub14 implements ImageProducer {

	@OriginalMember(owner = "client!go", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!go", name = "M", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!go", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!go", name = "S", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!go", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3640, super.anInt3636);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
	@Override
	public void method2878(@OriginalArg(1) Graphics arg0) {
		this.method2885();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method2877(@OriginalArg(0) Canvas arg0) {
		this.aCanvas6 = arg0;
		super.anInt3640 = this.aCanvas6.getSize().width;
		super.anInt3636 = this.aCanvas6.getSize().height;
		super.anIntArray179 = new int[super.anInt3640 * super.anInt3636];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas6.createImage(this);
		this.method2885();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method2885();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
		this.method2885();
		this.aCanvas6.prepareImage(this.anImage2, this.aCanvas6);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg1, arg0, arg2, this.aColorModel1, super.anIntArray179, arg1 * super.anInt3640 + arg3, super.anInt3640);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method2884(arg2, arg4, arg0, arg1);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg1, arg4, arg2, arg0);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas6);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	private synchronized void method2885() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3640, super.anInt3636, this.aColorModel1, super.anIntArray179, 0, super.anInt3640);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!go", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!go", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!go", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!go", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}
}
