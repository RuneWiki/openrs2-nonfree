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

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "B")
	private byte aByte38 = -41;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "B")
	private byte aByte39 = 107;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
	public Class37(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt887 = arg3;
			this.anInt888 = arg0;
			this.anIntArray235 = new int[arg3 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg1.createImage(this);
			this.method576();
			arg1.prepareImage(this.anImage1, this);
			this.method576();
			arg1.prepareImage(this.anImage1, this);
			this.method576();
			arg1.prepareImage(this.anImage1, this);
			this.method574(this.aByte38);
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("56196, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public void method574(@OriginalArg(0) byte arg0) {
		try {
			Class1_Sub1_Sub2.method451(this.anIntArray235, this.anInt887, this.anInt888);
			if (arg0 != -41) {
				this.anInt886 = 183;
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("79977, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	public void method575(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aByte39 != 107) {
				this.anInt886 = -25;
			}
			this.method576();
			arg1.drawImage(this.anImage1, arg0, arg2, this);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("42310, " + arg0 + ", " + 107 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt887, this.anInt888);
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
	private synchronized void method576() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt887, this.anInt888, this.aColorModel1, this.anIntArray235, 0, this.anInt887);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!rb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
