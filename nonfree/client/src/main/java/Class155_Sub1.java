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

@OriginalClass("client!ms")
public final class Class155_Sub1 extends Class155 implements ImageProducer {

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public static int anInt3939 = 0;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ms", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ms", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 65)
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt5642, super.anInt5646);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ms", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 240)
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!ms", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 248)
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)V", line = 255)
	private synchronized void method3919(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg2, arg1, this.aColorModel1, super.anIntArray385, arg3 * super.anInt5642 + arg0, super.anInt5642);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 276)
	@Override
	public void method5152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method3919(arg1, arg0, arg4, arg2);
		@Pc(23) Shape local23 = arg3.getClip();
		arg3.clipRect(arg1, arg2, arg4, arg0);
		arg3.drawImage(this.anImage2, 0, 0, this.aCanvas4);
		arg3.setClip(local23);
	}

	@OriginalMember(owner = "client!ms", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 293)
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V", line = 305)
	private synchronized void method3920() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt5642, super.anInt5646, this.aColorModel1, super.anIntArray385, 0, super.anInt5642);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 336)
	@Override
	public void method5151(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = arg0;
		super.anInt5642 = this.aCanvas4.getSize().width;
		super.anInt5646 = this.aCanvas4.getSize().height;
		super.anIntArray385 = new int[super.anInt5646 * super.anInt5642];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage2 = this.aCanvas4.createImage(this);
		this.method3920();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method3920();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
		this.method3920();
		this.aCanvas4.prepareImage(this.anImage2, this.aCanvas4);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 360)
	@Override
	public void method5153(@OriginalArg(0) Graphics arg0) {
		this.method3920();
		arg0.drawImage(this.anImage2, 0, 0, this.aCanvas4);
	}

	@OriginalMember(owner = "client!ms", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 376)
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
