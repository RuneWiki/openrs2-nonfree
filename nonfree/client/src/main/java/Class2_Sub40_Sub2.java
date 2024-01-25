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

@OriginalClass("client!qv")
public final class Class2_Sub40_Sub2 extends Class2_Sub40 implements ImageProducer {

	@OriginalMember(owner = "client!qv", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!qv", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qv", name = "H", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIII)V")
	private synchronized void method7512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg3, arg0, this.aColorModel1, super.anIntArray602, arg1 + arg2 * super.anInt8472, super.anInt8472);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qv", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt8472, super.anInt8471);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!qv", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	private synchronized void method7514() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt8472, super.anInt8471, this.aColorModel1, super.anIntArray602, 0, super.anInt8472);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
	@Override
	public void method7509(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method7512(arg6, arg5, arg2, arg3);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg1, arg4, arg3, arg6);
		arg0.drawImage(this.anImage13, arg1 - arg5, -arg2 + arg4, this.aCanvas9);
		arg0.setClip(local13);
	}

	@OriginalMember(owner = "client!qv", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!qv", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method7508(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt8472 = arg1;
		this.aCanvas9 = arg0;
		super.anInt8471 = arg2;
		super.anIntArray602 = new int[super.anInt8471 * super.anInt8472];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage13 = this.aCanvas9.createImage(this);
		this.method7514();
		this.aCanvas9.prepareImage(this.anImage13, this.aCanvas9);
		this.method7514();
		this.aCanvas9.prepareImage(this.anImage13, this.aCanvas9);
		this.method7514();
		this.aCanvas9.prepareImage(this.anImage13, this.aCanvas9);
	}

	@OriginalMember(owner = "client!qv", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
