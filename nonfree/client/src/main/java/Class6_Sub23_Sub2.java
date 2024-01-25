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

@OriginalClass("client!qm")
public final class Class6_Sub23_Sub2 extends Class6_Sub23 implements ImageProducer {

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method6171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6177(arg0, arg3, arg4, arg1);
		@Pc(13) Shape local13 = arg2.getClip();
		arg2.clipRect(arg0, arg3, arg1, arg4);
		arg2.drawImage(this.anImage13, 0, 0, this.aCanvas12);
		arg2.setClip(local13);
	}

	@OriginalMember(owner = "client!qm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7481, super.anInt7484);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BIIII)V")
	private synchronized void method6177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg1, arg3, arg2, this.aColorModel1, super.anIntArray539, arg1 * super.anInt7481 + arg0, super.anInt7481);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public void method6173(@OriginalArg(1) Graphics arg0) {
		this.method6178();
		arg0.drawImage(this.anImage13, 0, 0, this.aCanvas12);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method6170(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = arg0;
		super.anInt7481 = this.aCanvas12.getSize().width;
		super.anInt7484 = this.aCanvas12.getSize().height;
		super.anIntArray539 = new int[super.anInt7481 * super.anInt7484];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage13 = this.aCanvas12.createImage(this);
		this.method6178();
		this.aCanvas12.prepareImage(this.anImage13, this.aCanvas12);
		this.method6178();
		this.aCanvas12.prepareImage(this.anImage13, this.aCanvas12);
		this.method6178();
		this.aCanvas12.prepareImage(this.anImage13, this.aCanvas12);
	}

	@OriginalMember(owner = "client!qm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	private synchronized void method6178() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7481, super.anInt7484, this.aColorModel1, super.anIntArray539, 0, super.anInt7481);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!qm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}
}
