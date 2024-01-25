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

@OriginalClass("client!aca")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 implements ImageProducer {

	@OriginalMember(owner = "client!aca", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!aca", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!aca", name = "G", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!aca", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!aca", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!aca", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIII)V")
	private synchronized void method211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray656, arg3 + arg2 * super.anInt9945, super.anInt9945);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
	private synchronized void method212() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9945, super.anInt9943, this.aColorModel1, super.anIntArray656, 0, super.anInt9945);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!aca", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method8074(@OriginalArg(0) Graphics arg0) {
		this.method212();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!aca", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9945, super.anInt9943);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method8080(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt9945 = this.aCanvas1.getSize().width;
		super.anInt9943 = this.aCanvas1.getSize().height;
		super.anIntArray656 = new int[super.anInt9943 * super.anInt9945];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method212();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method212();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method212();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}

	@OriginalMember(owner = "client!aca", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method211(arg1, arg0, arg2, arg4);
		@Pc(17) Shape local17 = arg3.getClip();
		arg3.clipRect(arg4, arg2, arg1, arg0);
		arg3.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg3.setClip(local17);
	}
}
