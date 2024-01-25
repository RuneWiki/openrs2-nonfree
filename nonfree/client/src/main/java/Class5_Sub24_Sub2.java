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

@OriginalClass("client!hr")
public final class Class5_Sub24_Sub2 extends Class5_Sub24 implements ImageProducer {

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!hr", name = "B", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!hr", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
	@Override
	public void method3659(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		super.anInt4055 = arg2;
		super.anInt4053 = arg0;
		this.aCanvas9 = arg1;
		super.anIntArray204 = new int[super.anInt4053 * super.anInt4055];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas9.createImage(this);
		this.method3664();
		this.aCanvas9.prepareImage(this.anImage2, this.aCanvas9);
		this.method3664();
		this.aCanvas9.prepareImage(this.anImage2, this.aCanvas9);
		this.method3664();
		this.aCanvas9.prepareImage(this.anImage2, this.aCanvas9);
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
	private synchronized void method3664() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4055, super.anInt4053, this.aColorModel1, super.anIntArray204, 0, super.anInt4055);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hr", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
	@Override
	public void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method3668(arg4, arg0, arg3, arg2);
		@Pc(15) Shape local15 = arg1.getClip();
		arg1.clipRect(arg6, arg5, arg4, arg3);
		arg1.drawImage(this.anImage2, arg6 - arg2, -arg0 + arg5, this.aCanvas9);
		arg1.setClip(local15);
	}

	@OriginalMember(owner = "client!hr", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!hr", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4055, super.anInt4053);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V")
	private synchronized void method3668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg1, arg0, arg2, this.aColorModel1, super.anIntArray204, super.anInt4055 * arg1 + arg3, super.anInt4055);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
