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

@OriginalClass("client!tb")
public final class Class45_Sub1 extends Class45 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Lclient!qc;")
	public static Class47 aClass47_21 = new Class47(500);

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Lclient!o;")
	public static Class40 aClass40_617 = Static12.method257("Ok");

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "Lclient!o;")
	public static Class40 aClass40_618 = Static12.method257("System update in: ");

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "Lclient!o;")
	public static Class40 aClass40_619 = Static12.method257("Loading interfaces )2 ");

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "Lclient!o;")
	public static Class40 aClass40_620 = Static12.method257("p11_full");

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Lclient!od;")
	public static Class44 aClass44_7 = new Class44();

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "Lclient!o;")
	public static Class40 aClass40_621 = Static12.method257("To switch to a members)2only world:*6n1(Y Logout and return to the world selection page)3*6n2(Y Choose one of the members world with a gold star next to it(Ws name)3*6n*6nIf you prefer you can continue to use this world)1*6nbut members only features will be unavailable here)3");

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
	public static int anInt2170 = 0;

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "Lclient!o;")
	public static Class40 aClass40_622 = Static12.method257("@cr2@");

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!tb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 589)
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILjava/awt/Component;I)V", line = 602)
	@Override
	public void method1473(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		super.anInt2152 = arg2;
		super.anIntArray471 = new int[arg0 * arg2 + 1];
		super.anInt2148 = arg0;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage5 = arg1.createImage(this);
		this.method1481();
		arg1.prepareImage(super.anImage5, this);
		this.method1481();
		arg1.prepareImage(super.anImage5, this);
		this.method1481();
		arg1.prepareImage(super.anImage5, this);
		this.method1476();
	}

	@OriginalMember(owner = "client!tb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 633)
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2148, super.anInt2152);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 659)
	private synchronized void method1481() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2148, super.anInt2152, this.aColorModel1, super.anIntArray471, 0, super.anInt2148);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 675)
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 691)
	@Override
	public void method1474(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1481();
		arg0.drawImage(super.anImage5, arg1, arg2, this);
	}

	@OriginalMember(owner = "client!tb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 711)
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 733)
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 748)
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
