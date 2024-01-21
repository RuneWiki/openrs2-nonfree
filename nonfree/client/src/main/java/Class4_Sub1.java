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
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1 extends Class4 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "[I")
	public static int[] anIntArray40 = new int[32];

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	static {
		@Pc(19) int local19 = 2;
		for (@Pc(21) int local21 = 0; local21 < 32; local21++) {
			anIntArray40[local21] = local19 - 1;
			local19 += local19;
		}
	}

	@OriginalMember(owner = "client!ac", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	private synchronized void method190() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2234, super.anInt2232, this.aColorModel1, super.anIntArray283, 0, super.anInt2234);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1525(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		this.method190();
		arg1.drawImage(super.anImage4, arg0, arg2, this);
	}

	@OriginalMember(owner = "client!ac", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!ac", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2234, super.anInt2232);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1522(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		super.anIntArray283 = new int[arg0 * arg2 + 1];
		super.anInt2234 = arg0;
		super.anInt2232 = arg2;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg1.createImage(this);
		this.method190();
		arg1.prepareImage(super.anImage4, this);
		this.method190();
		arg1.prepareImage(super.anImage4, this);
		this.method190();
		arg1.prepareImage(super.anImage4, this);
		this.method1527();
	}

	@OriginalMember(owner = "client!ac", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
