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

@OriginalClass("client!o")
public final class Class119_Sub1 extends Class119 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZII)V")
	private synchronized void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg0, arg3, this.aColorModel1, this.anIntArray437, arg2 + this.anInt4949 * arg1, this.anInt4949);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!o", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt4949, this.anInt4946);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
	@Override
	public void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2902(arg3, arg4, arg0, arg1);
		@Pc(19) Shape local19 = arg2.getClip();
		arg2.clipRect(arg0, arg4, arg3, arg1);
		arg2.drawImage(this.anImage4, 0, 0, this);
		arg2.setClip(local19);
	}

	@OriginalMember(owner = "client!o", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!o", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	private synchronized void method2906() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt4949, this.anInt4946, this.aColorModel1, this.anIntArray437, 0, this.anInt4949);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method3931(@OriginalArg(0) Graphics arg0) {
		this.method2906();
		arg0.drawImage(this.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!o", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method3927(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt4949 = arg2;
		this.anIntArray437 = new int[arg0 * arg2 + 1];
		this.anInt4946 = arg0;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage4 = arg1.createImage(this);
		this.method2906();
		arg1.prepareImage(this.anImage4, this);
		this.method2906();
		arg1.prepareImage(this.anImage4, this);
		this.method2906();
		arg1.prepareImage(this.anImage4, this);
		this.method3926();
	}

	@OriginalMember(owner = "client!o", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!o", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
