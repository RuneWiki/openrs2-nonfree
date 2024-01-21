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
import sign.signlink;

@OriginalClass("client!HGHKUVEK")
public final class Class17 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!HGHKUVEK", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!HGHKUVEK", name = "a", descriptor = "I")
	private int anInt262 = 36073;

	@OriginalMember(owner = "client!HGHKUVEK", name = "c", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!HGHKUVEK", name = "d", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!HGHKUVEK", name = "b", descriptor = "[I")
	public int[] anIntArray80;

	@OriginalMember(owner = "client!HGHKUVEK", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!HGHKUVEK", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!HGHKUVEK", name = "<init>", descriptor = "(BLjava/awt/Component;II)V")
	public Class17(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt263 = arg2;
			this.anInt264 = arg3;
			this.anIntArray80 = new int[arg2 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg1.createImage(this);
			this.method156();
			arg1.prepareImage(this.anImage1, this);
			this.method156();
			arg1.prepareImage(this.anImage1, this);
			this.method156();
			arg1.prepareImage(this.anImage1, this);
			this.method154();
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("77529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGHKUVEK", name = "a", descriptor = "(I)V")
	public void method154() {
		try {
			Class3_Sub3_Sub3.method547(this.anInt263, this.anInt264, this.anIntArray80);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("43315, " + 1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGHKUVEK", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method155(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.method156();
			arg0.drawImage(this.anImage1, arg1, arg2, this);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("95924, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -331 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGHKUVEK", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt263, this.anInt264);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!HGHKUVEK", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!HGHKUVEK", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!HGHKUVEK", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!HGHKUVEK", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!HGHKUVEK", name = "a", descriptor = "()V")
	private synchronized void method156() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt263, this.anInt264, this.aColorModel1, this.anIntArray80, 0, this.anInt263);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!HGHKUVEK", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
