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

@OriginalClass("client!ji")
public final class Class2_Sub26_Sub1 extends Class2_Sub26 implements ImageProducer {

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ji", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ji", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt10486, super.anInt10482);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
	@Override
	public void method8913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		super.anInt10486 = arg0;
		super.anInt10482 = arg1;
		this.aCanvas7 = arg2;
		super.anIntArray741 = new int[super.anInt10486 * super.anInt10482];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas7.createImage(this);
		this.method4405();
		this.aCanvas7.prepareImage(this.anImage1, this.aCanvas7);
		this.method4405();
		this.aCanvas7.prepareImage(this.anImage1, this.aCanvas7);
		this.method4405();
		this.aCanvas7.prepareImage(this.anImage1, this.aCanvas7);
	}

	@OriginalMember(owner = "client!ji", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIB)V")
	private synchronized void method4403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg2, arg3, this.aColorModel1, super.anIntArray741, arg1 * super.anInt10486 + arg0, super.anInt10486);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ji", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ji", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V")
	@Override
	public void method8911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Graphics arg5, @OriginalArg(7) int arg6) {
		this.method4403(arg4, arg1, arg6, arg2);
		@Pc(23) Shape local23 = arg5.getClip();
		arg5.clipRect(arg0, arg3, arg6, arg2);
		arg5.drawImage(this.anImage1, arg0 - arg4, -arg1 + arg3, this.aCanvas7);
		arg5.setClip(local23);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	private synchronized void method4405() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt10486, super.anInt10482, this.aColorModel1, super.anIntArray741, 0, super.anInt10486);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
