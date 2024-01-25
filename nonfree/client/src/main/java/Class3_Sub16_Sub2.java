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

@OriginalClass("client!tv")
public final class Class3_Sub16_Sub2 extends Class3_Sub16 implements ImageProducer {

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIII)V")
	private synchronized void method7953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg0, arg2, arg1, this.aColorModel1, super.anIntArray582, super.anInt9296 * arg0 + arg3, super.anInt9296);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	private synchronized void method7955() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9296, super.anInt9294, this.aColorModel1, super.anIntArray582, 0, super.anInt9296);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tv", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tv", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9296, super.anInt9294);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V")
	@Override
	public void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Graphics arg5, @OriginalArg(7) int arg6) {
		this.method7953(arg6, arg1, arg0, arg2);
		@Pc(13) Shape local13 = arg5.getClip();
		arg5.clipRect(arg4, arg3, arg0, arg1);
		arg5.drawImage(this.anImage3, arg4 - arg2, -arg6 + arg3, this.aCanvas12);
		arg5.setClip(local13);
	}

	@OriginalMember(owner = "client!tv", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!tv", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIBLjava/awt/Canvas;)V")
	@Override
	public void method7950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2) {
		this.aCanvas12 = arg2;
		super.anInt9294 = arg0;
		super.anInt9296 = arg1;
		super.anIntArray582 = new int[super.anInt9294 * super.anInt9296];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas12.createImage(this);
		this.method7955();
		this.aCanvas12.prepareImage(this.anImage3, this.aCanvas12);
		this.method7955();
		this.aCanvas12.prepareImage(this.anImage3, this.aCanvas12);
		this.method7955();
		this.aCanvas12.prepareImage(this.anImage3, this.aCanvas12);
	}

	@OriginalMember(owner = "client!tv", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}
}
