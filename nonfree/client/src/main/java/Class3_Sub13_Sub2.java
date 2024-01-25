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

@OriginalClass("client!kl")
public final class Class3_Sub13_Sub2 extends Class3_Sub13 implements ImageProducer {

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!kl", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!kl", name = "N", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
	private synchronized void method4826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg3, arg1, this.aColorModel1, super.anIntArray475, arg2 + arg0 * super.anInt5276, super.anInt5276);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5276, super.anInt5275);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	@Override
	public void method4822(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aCanvas7 = arg0;
		super.anInt5276 = arg1;
		super.anInt5275 = arg2;
		super.anIntArray475 = new int[super.anInt5276 * super.anInt5275];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage13 = this.aCanvas7.createImage(this);
		this.method4831();
		this.aCanvas7.prepareImage(this.anImage13, this.aCanvas7);
		this.method4831();
		this.aCanvas7.prepareImage(this.anImage13, this.aCanvas7);
		this.method4831();
		this.aCanvas7.prepareImage(this.anImage13, this.aCanvas7);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
	@Override
	public void method4824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Graphics arg5, @OriginalArg(6) int arg6) {
		this.method4826(arg1, arg3, arg4, arg0);
		@Pc(26) Shape local26 = arg5.getClip();
		arg5.clipRect(arg6, arg2, arg0, arg3);
		arg5.drawImage(this.anImage13, arg6 - arg4, -arg1 + arg2, this.aCanvas7);
		arg5.setClip(local26);
	}

	@OriginalMember(owner = "client!kl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!kl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	private synchronized void method4831() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5276, super.anInt5275, this.aColorModel1, super.anIntArray475, 0, super.anInt5276);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
