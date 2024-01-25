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

@OriginalClass("client!uf")
public final class Class168_Sub2 extends Class168 implements ImageProducer {

	@OriginalMember(owner = "client!uf", name = "E", descriptor = "[I")
	public static final int[] anIntArray620 = new int[4096];

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage39;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray620[local4] = Static349.method5816(local4);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method5332(@OriginalArg(3) Graphics arg0) {
		this.method5337();
		arg0.drawImage(this.anImage39, 0, 0, this.aCanvas7);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5329(@OriginalArg(1) Canvas arg0) {
		this.aCanvas7 = arg0;
		super.anInt6161 = this.aCanvas7.getSize().width;
		super.anInt6167 = this.aCanvas7.getSize().height;
		super.anIntArray619 = new int[super.anInt6167 * super.anInt6161];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage39 = this.aCanvas7.createImage(this);
		this.method5337();
		this.aCanvas7.prepareImage(this.anImage39, this.aCanvas7);
		this.method5337();
		this.aCanvas7.prepareImage(this.anImage39, this.aCanvas7);
		this.method5337();
		this.aCanvas7.prepareImage(this.anImage39, this.aCanvas7);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	private synchronized void method5337() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6161, super.anInt6167, this.aColorModel1, super.anIntArray619, 0, super.anInt6161);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
	@Override
	public void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5339(arg1, arg4, arg3, arg0);
		@Pc(15) Shape local15 = arg2.getClip();
		arg2.clipRect(arg3, arg0, arg4, arg1);
		arg2.drawImage(this.anImage39, 0, 0, this.aCanvas7);
		arg2.setClip(local15);
	}

	@OriginalMember(owner = "client!uf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIIII)V")
	private synchronized void method5339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg3, arg1, arg0, this.aColorModel1, super.anIntArray619, arg2 + super.anInt6161 * arg3, super.anInt6161);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!uf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!uf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6161, super.anInt6167);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!uf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}
}
