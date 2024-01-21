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

@OriginalClass("client!c")
public final class Class6_Sub1 extends Class6 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!c", name = "pb", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!c", name = "ub", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!c", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!c", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!c", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Component;BI)V")
	@Override
	public void method2065(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		super.anInt2987 = arg0;
		super.anInt2986 = arg2;
		super.anIntArray467 = new int[arg2 * arg0 + 1];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg1.createImage(this);
		this.method291();
		arg1.prepareImage(super.anImage4, this);
		this.method291();
		arg1.prepareImage(super.anImage4, this);
		this.method291();
		arg1.prepareImage(super.anImage4, this);
		this.method2069();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		this.method291();
		arg2.drawImage(super.anImage4, arg0, arg1, this);
	}

	@OriginalMember(owner = "client!c", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2987, super.anInt2986);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!c", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!c", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	private synchronized void method291() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2987, super.anInt2986, this.aColorModel1, super.anIntArray467, 0, super.anInt2987);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
