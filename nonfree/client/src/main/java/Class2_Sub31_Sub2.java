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

@OriginalClass("client!kc")
public final class Class2_Sub31_Sub2 extends Class2_Sub31 implements ImageProducer {

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V")
	private synchronized void method5146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg3, arg0, this.aColorModel1, super.anIntArray340, arg2 * super.anInt5956 + arg1, super.anInt5956);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	private synchronized void method5148() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5956, super.anInt5959, this.aColorModel1, super.anIntArray340, 0, super.anInt5956);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5956, super.anInt5959);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!kc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V")
	@Override
	public void method5142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method5146(arg2, arg1, arg6, arg5);
		@Pc(26) Shape local26 = arg3.getClip();
		arg3.clipRect(arg4, arg0, arg5, arg2);
		arg3.drawImage(this.anImage3, arg4 - arg1, -arg6 + arg0, this.aCanvas6);
		arg3.setClip(local26);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
	@Override
	public void method5139(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt5959 = arg2;
		super.anInt5956 = arg1;
		this.aCanvas6 = arg0;
		super.anIntArray340 = new int[super.anInt5956 * super.anInt5959];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas6.createImage(this);
		this.method5148();
		this.aCanvas6.prepareImage(this.anImage3, this.aCanvas6);
		this.method5148();
		this.aCanvas6.prepareImage(this.anImage3, this.aCanvas6);
		this.method5148();
		this.aCanvas6.prepareImage(this.anImage3, this.aCanvas6);
	}

	@OriginalMember(owner = "client!kc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
