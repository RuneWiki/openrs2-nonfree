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

@OriginalClass("client!faa")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 implements ImageProducer {

	@OriginalMember(owner = "client!faa", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!faa", name = "C", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!faa", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!faa", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!faa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!faa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3250, super.anInt3251);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	@Override
	public void method2650(@OriginalArg(0) Graphics arg0) {
		this.method2653();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas9);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method2651(@OriginalArg(0) Canvas arg0) {
		this.aCanvas9 = arg0;
		super.anInt3250 = this.aCanvas9.getSize().width;
		super.anInt3251 = this.aCanvas9.getSize().height;
		super.anIntArray117 = new int[super.anInt3250 * super.anInt3251];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas9.createImage(this);
		this.method2653();
		this.aCanvas9.prepareImage(this.anImage2, this.aCanvas9);
		this.method2653();
		this.aCanvas9.prepareImage(this.anImage2, this.aCanvas9);
		this.method2653();
		this.aCanvas9.prepareImage(this.anImage2, this.aCanvas9);
	}

	@OriginalMember(owner = "client!faa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V")
	private synchronized void method2653() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3250, super.anInt3251, this.aColorModel1, super.anIntArray117, 0, super.anInt3250);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg2, arg1, arg3, this.aColorModel1, super.anIntArray117, arg0 + super.anInt3250 * arg2, super.anInt3250);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!faa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!faa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method2648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.method2654(arg1, arg4, arg0, arg2);
		@Pc(15) Shape local15 = arg3.getClip();
		arg3.clipRect(arg1, arg0, arg4, arg2);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas9);
		arg3.setClip(local15);
	}
}
