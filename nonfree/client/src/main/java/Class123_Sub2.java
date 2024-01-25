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

@OriginalClass("client!qo")
public final class Class123_Sub2 extends Class123 implements ImageProducer {

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	private synchronized void method4321() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4907, super.anInt4906, this.aColorModel1, super.anIntArray969, 0, super.anInt4907);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method4318(@OriginalArg(1) Canvas arg0) {
		this.aCanvas5 = arg0;
		super.anInt4907 = this.aCanvas5.getSize().width;
		super.anInt4906 = this.aCanvas5.getSize().height;
		super.anIntArray969 = new int[super.anInt4907 * super.anInt4906];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas5.createImage(this);
		this.method4321();
		this.aCanvas5.prepareImage(this.anImage2, this.aCanvas5);
		this.method4321();
		this.aCanvas5.prepareImage(this.anImage2, this.aCanvas5);
		this.method4321();
		this.aCanvas5.prepareImage(this.anImage2, this.aCanvas5);
	}

	@OriginalMember(owner = "client!qo", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
	@Override
	public void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4324(arg2, arg3, arg0, arg4);
		@Pc(17) Shape local17 = arg1.getClip();
		arg1.clipRect(arg2, arg0, arg3, arg4);
		arg1.drawImage(this.anImage2, 0, 0, this.aCanvas5);
		arg1.setClip(local17);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
	private synchronized void method4324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg2, arg1, arg3, this.aColorModel1, super.anIntArray969, arg0 + super.anInt4907 * arg2, super.anInt4907);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qo", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!qo", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4907, super.anInt4906);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method4319(@OriginalArg(3) Graphics arg0) {
		this.method4321();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas5);
	}

	@OriginalMember(owner = "client!qo", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
