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
public final class Class37 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
	private boolean aBoolean233 = true;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt871 = arg0;
			this.anInt872 = arg1;
			this.anIntArray233 = new int[arg0 * arg1];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method540();
			arg3.prepareImage(this.anImage1, this);
			this.method540();
			arg3.prepareImage(this.anImage1, this);
			this.method540();
			arg3.prepareImage(this.anImage1, this);
			this.method538();
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("55661, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public void method538() {
		try {
			Class1_Sub1_Sub2.method453(this.anInt872, this.anIntArray233, this.anInt871, this.aBoolean234);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("7654, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
	public void method539(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.method540();
			arg0.drawImage(this.anImage1, arg2, arg1, this);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("28614, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt871, this.anInt872);
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
	private synchronized void method540() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt871, this.anInt872, this.aColorModel1, this.anIntArray233, 0, this.anInt871);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
