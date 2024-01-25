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

@OriginalClass("client!uq")
public final class Class123_Sub2 extends Class123 implements ImageProducer {

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!uq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5332(@OriginalArg(1) Canvas arg0) {
		this.aCanvas5 = arg0;
		super.anInt5985 = this.aCanvas5.getSize().width;
		super.anInt5987 = this.aCanvas5.getSize().height;
		super.anIntArray643 = new int[super.anInt5985 * super.anInt5987];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas5.createImage(this);
		this.method5340();
		this.aCanvas5.prepareImage(this.anImage3, this.aCanvas5);
		this.method5340();
		this.aCanvas5.prepareImage(this.anImage3, this.aCanvas5);
		this.method5340();
		this.aCanvas5.prepareImage(this.anImage3, this.aCanvas5);
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V")
	private synchronized void method5340() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5985, super.anInt5987, this.aColorModel1, super.anIntArray643, 0, super.anInt5985);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!uq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5985, super.anInt5987);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!uq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method5342(arg3, arg0, arg2, arg1);
		@Pc(18) Shape local18 = arg4.getClip();
		arg4.clipRect(arg0, arg3, arg2, arg1);
		arg4.drawImage(this.anImage3, 0, 0, this.aCanvas5);
		arg4.setClip(local18);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIII)V")
	private synchronized void method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg0, arg2, arg3, this.aColorModel1, super.anIntArray643, arg1 + arg0 * super.anInt5985, super.anInt5985);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!uq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	@Override
	public void method5336(@OriginalArg(3) Graphics arg0) {
		this.method5340();
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!uq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
