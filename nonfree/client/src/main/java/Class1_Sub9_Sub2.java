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

@OriginalClass("client!tf")
public final class Class1_Sub9_Sub2 extends Class1_Sub9 implements ImageProducer {

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas28;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!tf", name = "N", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	static {
		new Class158("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!tf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	private synchronized void method5366() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7029, super.anInt7027, this.aColorModel1, super.anIntArray667, 0, super.anInt7029);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method5363(@OriginalArg(1) Canvas arg0) {
		this.aCanvas28 = arg0;
		super.anInt7029 = this.aCanvas28.getSize().width;
		super.anInt7027 = this.aCanvas28.getSize().height;
		super.anIntArray667 = new int[super.anInt7027 * super.anInt7029];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas28.createImage(this);
		this.method5366();
		this.aCanvas28.prepareImage(this.anImage3, this.aCanvas28);
		this.method5366();
		this.aCanvas28.prepareImage(this.anImage3, this.aCanvas28);
		this.method5366();
		this.aCanvas28.prepareImage(this.anImage3, this.aCanvas28);
	}

	@OriginalMember(owner = "client!tf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
	private synchronized void method5369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg0, arg3, this.aColorModel1, super.anIntArray667, super.anInt7029 * arg1 + arg2, super.anInt7029);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method5360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5369(arg1, arg3, arg4, arg0);
		@Pc(13) Shape local13 = arg2.getClip();
		arg2.clipRect(arg4, arg3, arg1, arg0);
		arg2.drawImage(this.anImage3, 0, 0, this.aCanvas28);
		arg2.setClip(local13);
	}

	@OriginalMember(owner = "client!tf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZLjava/awt/Graphics;)V")
	@Override
	public void method5361(@OriginalArg(3) Graphics arg0) {
		this.method5366();
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas28);
	}

	@OriginalMember(owner = "client!tf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7029, super.anInt7027);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}
}
