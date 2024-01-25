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

@OriginalClass("client!af")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 implements ImageProducer {

	@OriginalMember(owner = "client!af", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!af", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!af", name = "J", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!af", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!af", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!af", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	@Override
	public void method151(@OriginalArg(3) Graphics arg0) {
		this.method157();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas2);
	}

	@OriginalMember(owner = "client!af", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	@Override
	public void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Graphics arg4) {
		this.method159(arg1, arg0, arg2, arg3);
		@Pc(19) Shape local19 = arg4.getClip();
		arg4.clipRect(arg3, arg0, arg2, arg1);
		arg4.drawImage(this.anImage2, 0, 0, this.aCanvas2);
		arg4.setClip(local19);
	}

	@OriginalMember(owner = "client!af", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt132, super.anInt131);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!af", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
	private synchronized void method157() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt132, super.anInt131, this.aColorModel1, super.anIntArray15, 0, super.anInt132);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method152(@OriginalArg(1) Canvas arg0) {
		this.aCanvas2 = arg0;
		super.anInt132 = this.aCanvas2.getSize().width;
		super.anInt131 = this.aCanvas2.getSize().height;
		super.anIntArray15 = new int[super.anInt132 * super.anInt131];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas2.createImage(this);
		this.method157();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method157();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
		this.method157();
		this.aCanvas2.prepareImage(this.anImage2, this.aCanvas2);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
	private synchronized void method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg1, arg2, arg0, this.aColorModel1, super.anIntArray15, arg3 + super.anInt132 * arg1, super.anInt132);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
