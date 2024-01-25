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

@OriginalClass("client!r")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 implements ImageProducer {

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!r", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!r", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	private synchronized void method4873() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt6118, super.anInt6119, this.aColorModel1, super.anIntArray512, 0, super.anInt6118);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!r", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!r", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method4868(@OriginalArg(0) Canvas arg0) {
		this.aCanvas7 = arg0;
		super.anInt6118 = this.aCanvas7.getSize().width;
		super.anInt6119 = this.aCanvas7.getSize().height;
		super.anIntArray512 = new int[super.anInt6118 * super.anInt6119];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage8 = this.aCanvas7.createImage(this);
		this.method4873();
		this.aCanvas7.prepareImage(this.anImage8, this.aCanvas7);
		this.method4873();
		this.aCanvas7.prepareImage(this.anImage8, this.aCanvas7);
		this.method4873();
		this.aCanvas7.prepareImage(this.anImage8, this.aCanvas7);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.method4875(arg2, arg1, arg4, arg0);
		@Pc(24) Shape local24 = arg3.getClip();
		arg3.clipRect(arg0, arg4, arg2, arg1);
		arg3.drawImage(this.anImage8, 0, 0, this.aCanvas7);
		arg3.setClip(local24);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method4869(@OriginalArg(0) Graphics arg0) {
		this.method4873();
		arg0.drawImage(this.anImage8, 0, 0, this.aCanvas7);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	private synchronized void method4875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg2, arg0, arg1, this.aColorModel1, super.anIntArray512, arg3 + arg2 * super.anInt6118, super.anInt6118);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!r", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt6118, super.anInt6119);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!r", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}
}
