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

@OriginalClass("client!rb")
public final class Class36 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/awt/Component;IZI)V")
	public Class36(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt873 = arg1;
			this.anInt874 = arg3;
			this.anIntArray224 = new int[arg1 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method547();
			arg0.prepareImage(this.anImage1, this);
			this.method547();
			arg0.prepareImage(this.anImage1, this);
			this.method547();
			arg0.prepareImage(this.anImage1, this);
			this.method545();
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("64992, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public void method545() {
		try {
			Class1_Sub1_Sub2.method432(this.anInt874, this.anInt873, this.anIntArray224);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("91869, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method546(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		try {
			this.method547();
			arg1.drawImage(this.anImage1, arg0, arg2, this);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("81813, " + arg0 + ", " + -49767 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt873, this.anInt874);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!rb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!rb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()V")
	private synchronized void method547() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt873, this.anInt874, this.aColorModel1, this.anIntArray224, 0, this.anInt873);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
