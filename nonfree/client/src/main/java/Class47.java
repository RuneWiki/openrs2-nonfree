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

@OriginalClass("client!YJGBGRIO")
public final class Class47 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!YJGBGRIO", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!YJGBGRIO", name = "a", descriptor = "I")
	private int anInt809 = 45144;

	@OriginalMember(owner = "client!YJGBGRIO", name = "b", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!YJGBGRIO", name = "d", descriptor = "I")
	private int anInt810;

	@OriginalMember(owner = "client!YJGBGRIO", name = "e", descriptor = "I")
	private int anInt811;

	@OriginalMember(owner = "client!YJGBGRIO", name = "c", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!YJGBGRIO", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!YJGBGRIO", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!YJGBGRIO", name = "<init>", descriptor = "(Ljava/awt/Component;ZII)V")
	public Class47(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt810 = arg2;
			this.anInt811 = arg3;
			this.anIntArray203 = new int[arg2 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method558();
			arg0.prepareImage(this.anImage1, this);
			this.method558();
			arg0.prepareImage(this.anImage1, this);
			this.method558();
			arg0.prepareImage(this.anImage1, this);
			this.method556();
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("65463, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YJGBGRIO", name = "a", descriptor = "(Z)V")
	public void method556() {
		try {
			Class4_Sub1_Sub2.method482(this.anIntArray203, this.anInt810, this.anInt811);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("84161, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YJGBGRIO", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method558();
			arg2.drawImage(this.anImage1, arg0, arg1, this);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("63017, " + arg0 + ", " + arg1 + ", " + -41725 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YJGBGRIO", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt810, this.anInt811);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!YJGBGRIO", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!YJGBGRIO", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!YJGBGRIO", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!YJGBGRIO", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!YJGBGRIO", name = "a", descriptor = "()V")
	private synchronized void method558() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt810, this.anInt811, this.aColorModel1, this.anIntArray203, 0, this.anInt810);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!YJGBGRIO", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
