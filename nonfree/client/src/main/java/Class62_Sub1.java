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

@OriginalClass("client!gf")
public final class Class62_Sub1 extends Class62 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!gf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!gf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	private synchronized void method1269() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt5648, this.anInt5651, this.aColorModel1, this.anIntArray519, 0, this.anInt5648);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
	private synchronized void method1271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg0, arg2, this.aColorModel1, this.anIntArray519, arg3 * this.anInt5648 + arg1, this.anInt5648);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILjava/awt/Component;I)V")
	@Override
	public void method4463(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt5651 = arg2;
		this.anInt5648 = arg0;
		this.anIntArray519 = new int[arg0 * arg2 + 1];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage3 = arg1.createImage(this);
		this.method1269();
		arg1.prepareImage(this.anImage3, this);
		this.method1269();
		arg1.prepareImage(this.anImage3, this);
		this.method1269();
		arg1.prepareImage(this.anImage3, this);
		this.method4468();
	}

	@OriginalMember(owner = "client!gf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method4466(@OriginalArg(3) Graphics arg0) {
		this.method1269();
		arg0.drawImage(this.anImage3, 0, 0, this);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method4469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(5) int arg4) {
		this.method1271(arg2, arg0, arg4, arg1);
		@Pc(13) Shape local13 = arg3.getClip();
		arg3.clipRect(arg0, arg1, arg2, arg4);
		arg3.drawImage(this.anImage3, 0, 0, this);
		arg3.setClip(local13);
	}

	@OriginalMember(owner = "client!gf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!gf", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!gf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt5648, this.anInt5651);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}
}
