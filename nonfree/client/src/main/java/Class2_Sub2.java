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

@OriginalClass("client!pa")
public final class Class2_Sub2 extends Class2 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!pa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!pa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!pa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2031, super.anInt2034);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	private synchronized void method1328() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2031, super.anInt2034, this.aColorModel1, super.anIntArray228, 0, super.anInt2031);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		super.anInt2034 = arg1;
		super.anIntArray228 = new int[arg0 * arg1 + 1];
		super.anInt2031 = arg0;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage3 = arg2.createImage(this);
		this.method1328();
		arg2.prepareImage(super.anImage3, this);
		this.method1328();
		arg2.prepareImage(super.anImage3, this);
		this.method1328();
		arg2.prepareImage(super.anImage3, this);
		this.method1318();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method1322(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1328();
		arg0.drawImage(super.anImage3, arg1, arg2, this);
	}

	@OriginalMember(owner = "client!pa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!pa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}
}
