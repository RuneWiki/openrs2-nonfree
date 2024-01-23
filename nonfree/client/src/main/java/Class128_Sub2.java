import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class128_Sub2 extends Class128 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIBI)V")
	private synchronized void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg0, arg2, this.aColorModel1, this.anIntArray549, arg1 + this.anInt5227 * arg3, this.anInt5227);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	@Override
	public void method4291(@OriginalArg(3) Graphics arg0) {
		this.method4301();
		arg0.drawImage(this.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
	private synchronized void method4301() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt5227, this.anInt5230, this.aColorModel1, this.anIntArray549, 0, this.anInt5227);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method4294(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray549 = new int[arg2 * arg1 + 1];
		this.anInt5227 = arg2;
		this.anInt5230 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage4 = arg0.createImage(this);
		this.method4301();
		arg0.prepareImage(this.anImage4, this);
		this.method4301();
		arg0.prepareImage(this.anImage4, this);
		this.method4301();
		arg0.prepareImage(this.anImage4, this);
		this.method4293();
	}

	@OriginalMember(owner = "client!sk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!sk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt5227, this.anInt5230);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method4295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		this.method4298(arg3, arg2, arg1, arg0);
		@Pc(13) Shape local13 = arg4.getClip();
		arg4.clipRect(arg2, arg0, arg3, arg1);
		arg4.drawImage(this.anImage4, 0, 0, this);
		arg4.setClip(local13);
	}

	@OriginalMember(owner = "client!sk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!sk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!sk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
