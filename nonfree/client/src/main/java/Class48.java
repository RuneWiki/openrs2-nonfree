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

@OriginalClass("client!YOIXICCU")
public final class Class48 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!YOIXICCU", name = "b", descriptor = "I")
	private int anInt761;

	@OriginalMember(owner = "client!YOIXICCU", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!YOIXICCU", name = "d", descriptor = "I")
	private int anInt762;

	@OriginalMember(owner = "client!YOIXICCU", name = "e", descriptor = "I")
	private int anInt763;

	@OriginalMember(owner = "client!YOIXICCU", name = "c", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!YOIXICCU", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!YOIXICCU", name = "a", descriptor = "I")
	private int anInt760;

	@OriginalMember(owner = "client!YOIXICCU", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!YOIXICCU", name = "<init>", descriptor = "(IBLjava/awt/Component;I)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt762 = arg0;
			this.anInt763 = arg3;
			this.anIntArray207 = new int[arg0 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method505();
			arg2.prepareImage(this.anImage1, this);
			this.method505();
			arg2.prepareImage(this.anImage1, this);
			this.method505();
			arg2.prepareImage(this.anImage1, this);
			this.method503();
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("6700, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YOIXICCU", name = "a", descriptor = "(I)V")
	public void method503() {
		try {
			Class1_Sub1_Sub3.method512(196, this.anInt763, this.anInt762, this.anIntArray207);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("97786, " + 16595 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YOIXICCU", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method504(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.method505();
			arg0.drawImage(this.anImage1, arg2, arg1, this);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("28521, " + arg0 + ", " + arg1 + ", " + -52 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YOIXICCU", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt762, this.anInt763);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!YOIXICCU", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!YOIXICCU", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!YOIXICCU", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!YOIXICCU", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!YOIXICCU", name = "a", descriptor = "()V")
	private synchronized void method505() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt762, this.anInt763, this.aColorModel1, this.anIntArray207, 0, this.anInt762);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!YOIXICCU", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
