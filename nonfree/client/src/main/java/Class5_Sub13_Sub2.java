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

@OriginalClass("client!jp")
public final class Class5_Sub13_Sub2 extends Class5_Sub13 implements ImageProducer {

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!jp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/awt/Graphics;IBIIII)V")
	@Override
	public void method4489(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.method4493(arg5, arg2, arg6, arg4);
		@Pc(13) Shape local13 = arg1.getClip();
		arg1.clipRect(arg0, arg3, arg6, arg4);
		arg1.drawImage(this.anImage12, arg0 - arg5, -arg2 + arg3, this.aCanvas7);
		arg1.setClip(local13);
	}

	@OriginalMember(owner = "client!jp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4955, super.anInt4957);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIII)V")
	private synchronized void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg2, arg3, this.aColorModel1, super.anIntArray271, arg1 * super.anInt4955 + arg0, super.anInt4955);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
	@Override
	public void method4490(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2) {
		this.aCanvas7 = arg1;
		super.anInt4955 = arg2;
		super.anInt4957 = arg0;
		super.anIntArray271 = new int[super.anInt4957 * super.anInt4955];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage12 = this.aCanvas7.createImage(this);
		this.method4494();
		this.aCanvas7.prepareImage(this.anImage12, this.aCanvas7);
		this.method4494();
		this.aCanvas7.prepareImage(this.anImage12, this.aCanvas7);
		this.method4494();
		this.aCanvas7.prepareImage(this.anImage12, this.aCanvas7);
	}

	@OriginalMember(owner = "client!jp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	private synchronized void method4494() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4955, super.anInt4957, this.aColorModel1, super.anIntArray271, 0, super.anInt4955);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!jp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}
}
