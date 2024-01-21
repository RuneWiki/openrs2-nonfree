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

@OriginalClass("client!TZRNBMTC")
public final class Class32 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!TZRNBMTC", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!TZRNBMTC", name = "a", descriptor = "I")
	private int anInt688 = 263;

	@OriginalMember(owner = "client!TZRNBMTC", name = "b", descriptor = "I")
	private int anInt689 = 609;

	@OriginalMember(owner = "client!TZRNBMTC", name = "c", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!TZRNBMTC", name = "e", descriptor = "I")
	private int anInt690;

	@OriginalMember(owner = "client!TZRNBMTC", name = "f", descriptor = "I")
	private int anInt691;

	@OriginalMember(owner = "client!TZRNBMTC", name = "d", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!TZRNBMTC", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!TZRNBMTC", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!TZRNBMTC", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt690 = arg0;
			this.anInt691 = arg2;
			this.anIntArray171 = new int[arg0 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg1.createImage(this);
			this.method461();
			arg1.prepareImage(this.anImage1, this);
			this.method461();
			arg1.prepareImage(this.anImage1, this);
			this.method461();
			arg1.prepareImage(this.anImage1, this);
			this.method459();
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("41793, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TZRNBMTC", name = "a", descriptor = "(B)V")
	public void method459() {
		try {
			Class3_Sub1_Sub3.method427(this.anInt690, this.anInt691, this.anIntArray171);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("21251, " + -56 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TZRNBMTC", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method461();
			arg2.drawImage(this.anImage1, arg1, arg0, this);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("54958, " + 584 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TZRNBMTC", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt690, this.anInt691);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!TZRNBMTC", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!TZRNBMTC", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!TZRNBMTC", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!TZRNBMTC", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!TZRNBMTC", name = "a", descriptor = "()V")
	private synchronized void method461() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt690, this.anInt691, this.aColorModel1, this.anIntArray171, 0, this.anInt690);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!TZRNBMTC", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
