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

@OriginalClass("client!hi")
public final class Class42_Sub1 extends Class42 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIILjava/awt/Component;)V")
	@Override
	public void method3933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt4984 = arg0;
		this.anInt4983 = arg1;
		this.anIntArray391 = new int[arg0 * arg1 + 1];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage4 = arg2.createImage(this);
		this.method1791();
		arg2.prepareImage(this.anImage4, this);
		this.method1791();
		arg2.prepareImage(this.anImage4, this);
		this.method1791();
		arg2.prepareImage(this.anImage4, this);
		this.method3934();
	}

	@OriginalMember(owner = "client!hi", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!hi", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!hi", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt4984, this.anInt4983);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!hi", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
	private synchronized void method1788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg3, arg0, this.aColorModel1, this.anIntArray391, arg1 + arg2 * this.anInt4984, this.anInt4984);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V")
	@Override
	public void method3930(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1788(arg0, arg4, arg2, arg3);
		@Pc(17) Shape local17 = arg1.getClip();
		arg1.clipRect(arg4, arg2, arg3, arg0);
		arg1.drawImage(this.anImage4, 0, 0, this);
		arg1.setClip(local17);
	}

	@OriginalMember(owner = "client!hi", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
	private synchronized void method1791() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt4984, this.anInt4983, this.aColorModel1, this.anIntArray391, 0, this.anInt4984);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method3931(@OriginalArg(0) Graphics arg0) {
		this.method1791();
		arg0.drawImage(this.anImage4, 0, 0, this);
	}
}
