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

@OriginalClass("client!kl")
public final class Class3_Sub2 extends Class3 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!kl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt3335, this.anInt3337);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!kl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!kl", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	@Override
	public void method2410(@OriginalArg(3) Graphics arg0) {
		this.method2420();
		arg0.drawImage(this.anImage3, 0, 0, this);
	}

	@OriginalMember(owner = "client!kl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	private synchronized void method2420() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt3335, this.anInt3337, this.aColorModel1, this.anIntArray307, 0, this.anInt3335);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method2412(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt3337 = arg1;
		this.anInt3335 = arg2;
		this.anIntArray307 = new int[arg1 * arg2 + 1];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = arg0.createImage(this);
		this.method2420();
		arg0.prepareImage(this.anImage3, this);
		this.method2420();
		arg0.prepareImage(this.anImage3, this);
		this.method2420();
		arg0.prepareImage(this.anImage3, this);
		this.method2413();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIBII)V")
	private synchronized void method2422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg1, arg3, this.aColorModel1, this.anIntArray307, arg2 + this.anInt3335 * arg0, this.anInt3335);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
	@Override
	public void method2414(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2422(arg1, arg3, arg2, arg4);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg2, arg1, arg3, arg4);
		arg0.drawImage(this.anImage3, 0, 0, this);
		arg0.setClip(local13);
	}
}
