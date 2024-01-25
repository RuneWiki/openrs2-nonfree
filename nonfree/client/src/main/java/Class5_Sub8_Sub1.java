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

@OriginalClass("client!bba")
public final class Class5_Sub8_Sub1 extends Class5_Sub8 implements ImageProducer {

	@OriginalMember(owner = "client!bba", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!bba", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!bba", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!bba", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/awt/Canvas;BI)V")
	@Override
	public void method7712(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas1 = arg1;
		super.anInt9181 = arg0;
		super.anInt9183 = arg2;
		super.anIntArray507 = new int[super.anInt9181 * super.anInt9183];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method448();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method448();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method448();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
	private synchronized void method448() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9183, super.anInt9181, this.aColorModel1, super.anIntArray507, 0, super.anInt9183);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method449(arg5, arg3, arg2, arg6);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg1, arg0, arg3, arg6);
		arg4.drawImage(this.anImage1, arg1 - arg2, arg0 - arg5, this.aCanvas1);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(BIIII)V")
	private synchronized void method449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg1, arg3, this.aColorModel1, super.anIntArray507, arg2 + arg0 * super.anInt9183, super.anInt9183);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bba", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!bba", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!bba", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9183, super.anInt9181);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!bba", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!bba", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
