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

@OriginalClass("client!eb")
public final class Class53_Sub2 extends Class53 implements ImageProducer {

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	@Override
	public void method1388(@OriginalArg(0) Graphics arg0) {
		this.method1391();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!eb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!eb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt1581, super.anInt1579);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!eb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	private synchronized void method1391() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt1581, super.anInt1579, this.aColorModel1, super.anIntArray73, 0, super.anInt1581);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!eb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZIII)V")
	private synchronized void method1394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg3, arg0, arg1, this.aColorModel1, super.anIntArray73, arg2 + arg3 * super.anInt1581, super.anInt1581);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method1384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.method1394(arg2, arg1, arg0, arg4);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg0, arg4, arg2, arg1);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas2);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	@Override
	public void method1386(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt1581 = this.aCanvas2.getSize().width;
		super.anInt1579 = this.aCanvas2.getSize().height;
		super.anIntArray73 = new int[super.anInt1579 * super.anInt1581];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas2.createImage(this);
		this.method1391();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method1391();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method1391();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
	}

	@OriginalMember(owner = "client!eb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
