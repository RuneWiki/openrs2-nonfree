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

@OriginalClass("client!hs")
public final class Class1_Sub17_Sub1 extends Class1_Sub17 implements ImageProducer {

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!hs", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!hs", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt7727, super.anInt7726);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!hs", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	@Override
	public void method5957(@OriginalArg(0) Graphics arg0) {
		this.method2472();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
	private synchronized void method2472() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt7727, super.anInt7726, this.aColorModel1, super.anIntArray581, 0, super.anInt7727);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method5953(@OriginalArg(0) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt7727 = this.aCanvas2.getSize().width;
		super.anInt7726 = this.aCanvas2.getSize().height;
		super.anIntArray581 = new int[super.anInt7727 * super.anInt7726];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas2.createImage(this);
		this.method2472();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method2472();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method2472();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
	}

	@OriginalMember(owner = "client!hs", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!hs", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method5956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2473(arg0, arg1, arg4, arg3);
		@Pc(13) Shape local13 = arg2.getClip();
		arg2.clipRect(arg0, arg4, arg1, arg3);
		arg2.drawImage(this.anImage2, 0, 0, this.aCanvas2);
		arg2.setClip(local13);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg2, arg1, arg3, this.aColorModel1, super.anIntArray581, arg2 * super.anInt7727 + arg0, super.anInt7727);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
