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

@OriginalClass("client!ZTWZAULT")
public final class Class49 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!ZTWZAULT", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ZTWZAULT", name = "b", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!ZTWZAULT", name = "c", descriptor = "I")
	private int anInt804;

	@OriginalMember(owner = "client!ZTWZAULT", name = "a", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!ZTWZAULT", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ZTWZAULT", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ZTWZAULT", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt803 = arg2;
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			this.anInt804 = arg3;
			this.anIntArray209 = new int[arg2 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg1.createImage(this);
			this.method565();
			arg1.prepareImage(this.anImage1, this);
			this.method565();
			arg1.prepareImage(this.anImage1, this);
			this.method565();
			arg1.prepareImage(this.anImage1, this);
			this.method563();
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("92891, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTWZAULT", name = "a", descriptor = "(I)V")
	public void method563() {
		try {
			Class2_Sub1_Sub3.method383(this.anInt804, this.anIntArray209, this.anInt803);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("79304, " + -19705 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTWZAULT", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
	public void method564(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.method565();
			arg0.drawImage(this.anImage1, arg1, arg2, this);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("22624, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTWZAULT", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt803, this.anInt804);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ZTWZAULT", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ZTWZAULT", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ZTWZAULT", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ZTWZAULT", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!ZTWZAULT", name = "a", descriptor = "()V")
	private synchronized void method565() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt803, this.anInt804, this.aColorModel1, this.anIntArray209, 0, this.anInt803);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ZTWZAULT", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
