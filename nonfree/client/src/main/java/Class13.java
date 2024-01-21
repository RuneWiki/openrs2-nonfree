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

@OriginalClass("client!HZYGKZDT")
public final class Class13 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!HZYGKZDT", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!HZYGKZDT", name = "b", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!HZYGKZDT", name = "c", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!HZYGKZDT", name = "a", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!HZYGKZDT", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!HZYGKZDT", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!HZYGKZDT", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
	public Class13(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt133 = arg1;
			this.anInt134 = arg3;
			this.anIntArray22 = new int[arg1 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method189();
			@Pc(33) int local33 = 45 / arg2;
			arg0.prepareImage(this.anImage1, this);
			this.method189();
			arg0.prepareImage(this.anImage1, this);
			this.method189();
			arg0.prepareImage(this.anImage1, this);
			this.method187();
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("98264, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HZYGKZDT", name = "a", descriptor = "(I)V")
	public void method187() {
		try {
			Class4_Sub1_Sub1.method543(this.anIntArray22, this.anInt134, this.anInt133);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("1009, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HZYGKZDT", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method188(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		try {
			this.method189();
			arg1.drawImage(this.anImage1, arg2, arg0, this);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("53526, " + arg0 + ", " + -895 + ", " + arg1 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HZYGKZDT", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt133, this.anInt134);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!HZYGKZDT", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!HZYGKZDT", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!HZYGKZDT", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!HZYGKZDT", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!HZYGKZDT", name = "a", descriptor = "()V")
	private synchronized void method189() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt133, this.anInt134, this.aColorModel1, this.anIntArray22, 0, this.anInt133);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!HZYGKZDT", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
