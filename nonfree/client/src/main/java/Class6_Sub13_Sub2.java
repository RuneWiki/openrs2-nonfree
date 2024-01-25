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

@OriginalClass("client!sn")
public final class Class6_Sub13_Sub2 extends Class6_Sub13 implements ImageProducer {

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!sn", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!sn", name = "K", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!sn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
	@Override
	public void method7245(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7250(arg2, arg3, arg0, arg4);
		@Pc(13) Shape local13 = arg1.getClip();
		arg1.clipRect(arg3, arg0, arg2, arg4);
		arg1.drawImage(this.anImage3, 0, 0, this.aCanvas13);
		arg1.setClip(local13);
	}

	@OriginalMember(owner = "client!sn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIZ)V")
	private synchronized void method7250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg0, arg3, this.aColorModel1, super.anIntArray729, super.anInt8669 * arg2 + arg1, super.anInt8669);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!sn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "(I)V")
	private synchronized void method7252() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt8669, super.anInt8670, this.aColorModel1, super.anIntArray729, 0, super.anInt8669);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method7246(@OriginalArg(1) Graphics arg0) {
		this.method7252();
		arg0.drawImage(this.anImage3, 0, 0, this.aCanvas13);
	}

	@OriginalMember(owner = "client!sn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt8669, super.anInt8670);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7241(@OriginalArg(1) Canvas arg0) {
		this.aCanvas13 = arg0;
		super.anInt8669 = this.aCanvas13.getSize().width;
		super.anInt8670 = this.aCanvas13.getSize().height;
		super.anIntArray729 = new int[super.anInt8670 * super.anInt8669];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = this.aCanvas13.createImage(this);
		this.method7252();
		this.aCanvas13.prepareImage(this.anImage3, this.aCanvas13);
		this.method7252();
		this.aCanvas13.prepareImage(this.anImage3, this.aCanvas13);
		this.method7252();
		this.aCanvas13.prepareImage(this.anImage3, this.aCanvas13);
	}
}
