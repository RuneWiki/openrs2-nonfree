import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class22_Sub2 extends Class22 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!kd", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!kd", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	private synchronized void method1074() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt1799, super.anInt1797, this.aColorModel1, super.anIntArray223, 0, super.anInt1799);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!kd", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	@Override
	public void method1065(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1074();
		arg0.drawImage(super.anImage3, arg2, arg1, this);
	}

	@OriginalMember(owner = "client!kd", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt1799, super.anInt1797);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		super.anInt1799 = arg1;
		super.anInt1797 = arg0;
		super.anIntArray223 = new int[arg0 * arg1 + 1];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage3 = arg2.createImage(this);
		this.method1074();
		arg2.prepareImage(super.anImage3, this);
		this.method1074();
		arg2.prepareImage(super.anImage3, this);
		this.method1074();
		arg2.prepareImage(super.anImage3, this);
		this.method1068();
	}

	@OriginalMember(owner = "client!kd", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}
}
