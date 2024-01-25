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

@OriginalClass("client!tn")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 implements ImageProducer {

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!tn", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!tn", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!tn", name = "F", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5822(@OriginalArg(1) Canvas arg0) {
		this.aCanvas6 = arg0;
		super.anInt7514 = this.aCanvas6.getSize().width;
		super.anInt7512 = this.aCanvas6.getSize().height;
		super.anIntArray501 = new int[super.anInt7514 * super.anInt7512];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas6.createImage(this);
		this.method5350();
		this.aCanvas6.prepareImage(this.anImage1, this.aCanvas6);
		this.method5350();
		this.aCanvas6.prepareImage(this.anImage1, this.aCanvas6);
		this.method5350();
		this.aCanvas6.prepareImage(this.anImage1, this.aCanvas6);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method5825(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5349(arg1, arg3, arg4, arg2);
		@Pc(19) Shape local19 = arg0.getClip();
		arg0.clipRect(arg2, arg1, arg4, arg3);
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas6);
		arg0.setClip(local19);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBIII)V")
	private synchronized void method5349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg0, arg2, arg1, this.aColorModel1, super.anIntArray501, arg3 + super.anInt7514 * arg0, super.anInt7514);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7514, super.anInt7512);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!tn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method5826(@OriginalArg(3) Graphics arg0) {
		this.method5350();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas6);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V")
	private synchronized void method5350() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7514, super.anInt7512, this.aColorModel1, super.anIntArray501, 0, super.anInt7514);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}
}
