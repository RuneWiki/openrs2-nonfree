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

@OriginalClass("client!qc")
public final class Class37_Sub1 extends Class37 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!qc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2053, super.anInt2052);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!qc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	private synchronized void method1429() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2053, super.anInt2052, this.aColorModel1, super.anIntArray304, 0, super.anInt2053);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method1464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		super.anInt2053 = arg0;
		super.anIntArray304 = new int[arg0 * arg1 + 1];
		super.anInt2052 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage5 = arg2.createImage(this);
		this.method1429();
		arg2.prepareImage(super.anImage5, this);
		this.method1429();
		arg2.prepareImage(super.anImage5, this);
		this.method1429();
		arg2.prepareImage(super.anImage5, this);
		this.method1459();
	}

	@OriginalMember(owner = "client!qc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method1457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		this.method1429();
		arg2.drawImage(super.anImage5, arg0, arg1, this);
	}
}
