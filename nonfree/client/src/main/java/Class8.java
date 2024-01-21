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

@OriginalClass("client!ERQSZFRT")
public final class Class8 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!ERQSZFRT", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ERQSZFRT", name = "a", descriptor = "I")
	private int anInt179 = -10495;

	@OriginalMember(owner = "client!ERQSZFRT", name = "c", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!ERQSZFRT", name = "d", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!ERQSZFRT", name = "b", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!ERQSZFRT", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ERQSZFRT", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ERQSZFRT", name = "<init>", descriptor = "(IILjava/awt/Component;B)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) byte arg3) {
		try {
			this.anInt180 = arg1;
			this.anInt181 = arg0;
			this.anIntArray38 = new int[arg1 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method60();
			@Pc(36) boolean local36 = false;
			arg2.prepareImage(this.anImage1, this);
			this.method60();
			arg2.prepareImage(this.anImage1, this);
			this.method60();
			arg2.prepareImage(this.anImage1, this);
			this.method58();
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("24941, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ERQSZFRT", name = "a", descriptor = "(Z)V")
	public void method58() {
		try {
			Class6_Sub2_Sub2.method547(this.anInt181, this.anInt180, this.anIntArray38);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("11147, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ERQSZFRT", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	public void method59(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.method60();
			arg0.drawImage(this.anImage1, arg2, arg1, this);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("90215, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ERQSZFRT", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt180, this.anInt181);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ERQSZFRT", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ERQSZFRT", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ERQSZFRT", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ERQSZFRT", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!ERQSZFRT", name = "a", descriptor = "()V")
	private synchronized void method60() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt180, this.anInt181, this.aColorModel1, this.anIntArray38, 0, this.anInt180);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ERQSZFRT", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
