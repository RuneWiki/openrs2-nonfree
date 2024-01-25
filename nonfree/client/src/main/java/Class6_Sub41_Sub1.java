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

@OriginalClass("client!oka")
public final class Class6_Sub41_Sub1 extends Class6_Sub41 implements ImageProducer {

	@OriginalMember(owner = "client!oka", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!oka", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!oka", name = "G", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!oka", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!oka", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9945, super.anInt9947);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!oka", name = "c", descriptor = "(B)V")
	private synchronized void method6594() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9945, super.anInt9947, this.aColorModel1, super.anIntArray653, 0, super.anInt9945);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!oka", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method8628(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt9947 = arg1;
		this.aCanvas9 = arg0;
		super.anInt9945 = arg2;
		super.anIntArray653 = new int[super.anInt9945 * super.anInt9947];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage13 = this.aCanvas9.createImage(this);
		this.method6594();
		this.aCanvas9.prepareImage(this.anImage13, this.aCanvas9);
		this.method6594();
		this.aCanvas9.prepareImage(this.anImage13, this.aCanvas9);
		this.method6594();
		this.aCanvas9.prepareImage(this.anImage13, this.aCanvas9);
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	@Override
	public void method8629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method6597(arg2, arg6, arg5, arg1);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg0, arg3, arg2, arg6);
		arg4.drawImage(this.anImage13, arg0 - arg1, -arg5 + arg3, this.aCanvas9);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!oka", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!oka", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!oka", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(IBIII)V")
	private synchronized void method6597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray653, super.anInt9945 * arg2 + arg3, super.anInt9945);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
