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

@OriginalClass("client!tc")
public final class Class5_Sub34_Sub2 extends Class5_Sub34 implements ImageProducer {

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas14;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!tc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7959, super.anInt7960);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!tc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
	@Override
	public void method6470(@OriginalArg(1) Canvas arg0) {
		this.aCanvas14 = arg0;
		super.anInt7959 = this.aCanvas14.getSize().width;
		super.anInt7960 = this.aCanvas14.getSize().height;
		super.anIntArray603 = new int[super.anInt7959 * super.anInt7960];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas14.createImage(this);
		this.method6478();
		this.aCanvas14.prepareImage(this.anImage2, this.aCanvas14);
		this.method6478();
		this.aCanvas14.prepareImage(this.anImage2, this.aCanvas14);
		this.method6478();
		this.aCanvas14.prepareImage(this.anImage2, this.aCanvas14);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZII)V")
	private synchronized void method6476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg3, arg0, arg1, this.aColorModel1, super.anIntArray603, arg3 * super.anInt7959 + arg2, super.anInt7959);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	private synchronized void method6478() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7959, super.anInt7960, this.aColorModel1, super.anIntArray603, 0, super.anInt7959);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method6473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method6476(arg1, arg4, arg2, arg0);
		@Pc(19) Shape local19 = arg3.getClip();
		arg3.clipRect(arg2, arg0, arg1, arg4);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas14);
		arg3.setClip(local19);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method6471(@OriginalArg(1) Graphics arg0) {
		this.method6478();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas14);
	}
}
