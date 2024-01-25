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

@OriginalClass("client!up")
public final class Class1_Sub26_Sub2 extends Class1_Sub26 implements ImageProducer {

	@OriginalMember(owner = "client!up", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!up", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!up", name = "A", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas17;

	@OriginalMember(owner = "client!up", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method7344(@OriginalArg(3) Graphics arg0) {
		this.method7350();
		arg0.drawImage(this.anImage13, 0, 0, this.aCanvas17);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZIILjava/awt/Graphics;II)V")
	@Override
	public void method7345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7349(arg0, arg4, arg3, arg1);
		@Pc(13) Shape local13 = arg2.getClip();
		arg2.clipRect(arg0, arg4, arg1, arg3);
		arg2.drawImage(this.anImage13, 0, 0, this.aCanvas17);
		arg2.setClip(local13);
	}

	@OriginalMember(owner = "client!up", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!up", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt8991, super.anInt8988);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!up", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!up", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7342(@OriginalArg(1) Canvas arg0) {
		this.aCanvas17 = arg0;
		super.anInt8991 = this.aCanvas17.getSize().width;
		super.anInt8988 = this.aCanvas17.getSize().height;
		super.anIntArray683 = new int[super.anInt8988 * super.anInt8991];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage13 = this.aCanvas17.createImage(this);
		this.method7350();
		this.aCanvas17.prepareImage(this.anImage13, this.aCanvas17);
		this.method7350();
		this.aCanvas17.prepareImage(this.anImage13, this.aCanvas17);
		this.method7350();
		this.aCanvas17.prepareImage(this.anImage13, this.aCanvas17);
	}

	@OriginalMember(owner = "client!up", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BIIII)V")
	private synchronized void method7349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg3, arg2, this.aColorModel1, super.anIntArray683, arg0 + super.anInt8991 * arg1, super.anInt8991);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	private synchronized void method7350() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt8991, super.anInt8988, this.aColorModel1, super.anIntArray683, 0, super.anInt8991);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
