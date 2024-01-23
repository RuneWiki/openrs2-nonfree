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

@OriginalClass("client!bo")
public final class Class5_Sub1 extends Class5 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!bo", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)V")
	private synchronized void method416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg3, arg0, arg2, arg1, this.aColorModel1, this.anIntArray230, this.anInt2266 * arg0 + arg3, this.anInt2266);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bo", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method1713(@OriginalArg(0) Graphics arg0) {
		this.method418();
		arg0.drawImage(this.anImage3, 0, 0, this);
	}

	@OriginalMember(owner = "client!bo", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V")
	private synchronized void method418() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt2266, this.anInt2263, this.aColorModel1, this.anIntArray230, 0, this.anInt2266);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	@Override
	public void method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		this.method416(arg0, arg1, arg2, arg4);
		@Pc(21) Shape local21 = arg3.getClip();
		arg3.clipRect(arg4, arg0, arg2, arg1);
		arg3.drawImage(this.anImage3, 0, 0, this);
		arg3.setClip(local21);
	}

	@OriginalMember(owner = "client!bo", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	@Override
	public void method1712(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt2263 = arg2;
		this.anIntArray230 = new int[arg2 * arg1 + 1];
		this.anInt2266 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = arg0.createImage(this);
		this.method418();
		arg0.prepareImage(this.anImage3, this);
		this.method418();
		arg0.prepareImage(this.anImage3, this);
		this.method418();
		arg0.prepareImage(this.anImage3, this);
		this.method1716();
	}

	@OriginalMember(owner = "client!bo", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt2266, this.anInt2263);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!bo", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!bo", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
