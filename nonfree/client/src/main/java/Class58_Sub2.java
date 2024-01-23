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

@OriginalClass("client!mn")
public final class Class58_Sub2 extends Class58 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!mn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt3438, this.anInt3446);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	@Override
	public void method2974(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray289 = new int[arg1 * arg2 + 1];
		this.anInt3446 = arg1;
		this.anInt3438 = arg2;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage4 = arg0.createImage(this);
		this.method2979();
		arg0.prepareImage(this.anImage4, this);
		this.method2979();
		arg0.prepareImage(this.anImage4, this);
		this.method2979();
		arg0.prepareImage(this.anImage4, this);
		this.method2968();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2967(@OriginalArg(3) Graphics arg0) {
		this.method2979();
		arg0.drawImage(this.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V")
	private synchronized void method2978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg1, arg2, this.aColorModel1, this.anIntArray289, arg3 * this.anInt3438 + arg0, this.anInt3438);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
	private synchronized void method2979() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt3438, this.anInt3446, this.aColorModel1, this.anIntArray289, 0, this.anInt3438);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!mn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!mn", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!mn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!mn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V")
	@Override
	public void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method2978(arg2, arg4, arg1, arg0);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg2, arg0, arg4, arg1);
		arg3.drawImage(this.anImage4, 0, 0, this);
		arg3.setClip(local13);
	}
}
