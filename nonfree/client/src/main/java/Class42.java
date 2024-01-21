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

@OriginalClass("client!WOKQCNXG")
public final class Class42 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!WOKQCNXG", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!WOKQCNXG", name = "a", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!WOKQCNXG", name = "c", descriptor = "I")
	private int anInt755;

	@OriginalMember(owner = "client!WOKQCNXG", name = "d", descriptor = "I")
	private int anInt756;

	@OriginalMember(owner = "client!WOKQCNXG", name = "b", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!WOKQCNXG", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!WOKQCNXG", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!WOKQCNXG", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt755 = arg0;
			this.anInt756 = arg1;
			this.anIntArray203 = new int[arg0 * arg1];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method543();
			arg3.prepareImage(this.anImage1, this);
			this.method543();
			arg3.prepareImage(this.anImage1, this);
			this.method543();
			@Pc(52) int local52 = 38 / arg2;
			arg3.prepareImage(this.anImage1, this);
			this.method541();
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("61381, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WOKQCNXG", name = "a", descriptor = "(I)V")
	public void method541() {
		try {
			Class3_Sub1_Sub4.method432(this.anInt755, this.anIntArray203, this.anInt756);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("43972, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WOKQCNXG", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method542(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		try {
			this.method543();
			arg1.drawImage(this.anImage1, arg2, arg0, this);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("29358, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WOKQCNXG", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt755, this.anInt756);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!WOKQCNXG", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!WOKQCNXG", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!WOKQCNXG", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!WOKQCNXG", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!WOKQCNXG", name = "a", descriptor = "()V")
	private synchronized void method543() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt755, this.anInt756, this.aColorModel1, this.anIntArray203, 0, this.anInt755);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!WOKQCNXG", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
