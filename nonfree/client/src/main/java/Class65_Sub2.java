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

@OriginalClass("client!kd")
public final class Class65_Sub2 extends Class65 implements ImageProducer {

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method2525(@OriginalArg(1) Canvas arg0) {
		this.aCanvas3 = arg0;
		super.anInt2990 = this.aCanvas3.getSize().width;
		super.anInt2988 = this.aCanvas3.getSize().height;
		super.anIntArray199 = new int[super.anInt2988 * super.anInt2990];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas3.createImage(this);
		this.method2527();
		this.aCanvas3.prepareImage(this.anImage3, this.aCanvas3);
		this.method2527();
		this.aCanvas3.prepareImage(this.anImage3, this.aCanvas3);
		this.method2527();
		this.aCanvas3.prepareImage(this.anImage3, this.aCanvas3);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	@Override
	public void method2526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.method2528(arg4, arg0, arg1, arg2);
		@Pc(18) Shape local18 = arg3.getClip();
		arg3.clipRect(arg1, arg4, arg2, arg0);
		arg3.drawImage(this.anImage3, 0, 0, this.aCanvas3);
		arg3.setClip(local18);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method2523(@OriginalArg(2) Graphics arg0) {
		this.method2527();
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas3);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	private synchronized void method2527() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2990, super.anInt2988, this.aColorModel1, super.anIntArray199, 0, super.anInt2990);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg3, arg1, this.aColorModel1, super.anIntArray199, super.anInt2990 * arg0 + arg2, super.anInt2990);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2990, super.anInt2988);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!kd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}
}
