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

@OriginalClass("client!DTPUNZHN")
public final class Class11 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!DTPUNZHN", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!DTPUNZHN", name = "b", descriptor = "I")
	private int anInt98;

	@OriginalMember(owner = "client!DTPUNZHN", name = "c", descriptor = "I")
	private int anInt99;

	@OriginalMember(owner = "client!DTPUNZHN", name = "a", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!DTPUNZHN", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!DTPUNZHN", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!DTPUNZHN", name = "<init>", descriptor = "(BIILjava/awt/Component;)V")
	public Class11(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt98 = arg2;
			this.anInt99 = arg1;
			this.anIntArray34 = new int[arg2 * arg1];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			if (arg0 != 26) {
				throw new NullPointerException();
			}
			this.method72();
			arg3.prepareImage(this.anImage1, this);
			this.method72();
			arg3.prepareImage(this.anImage1, this);
			this.method72();
			arg3.prepareImage(this.anImage1, this);
			this.method70();
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("75847, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DTPUNZHN", name = "a", descriptor = "(I)V")
	public void method70() {
		try {
			Class8_Sub1_Sub2.method545(this.anInt98, this.anInt99, this.anIntArray34);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("12238, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DTPUNZHN", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method71(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		try {
			this.method72();
			arg1.drawImage(this.anImage1, arg0, arg2, this);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("16292, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DTPUNZHN", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt98, this.anInt99);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!DTPUNZHN", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!DTPUNZHN", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!DTPUNZHN", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!DTPUNZHN", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!DTPUNZHN", name = "a", descriptor = "()V")
	private synchronized void method72() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt98, this.anInt99, this.aColorModel1, this.anIntArray34, 0, this.anInt98);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!DTPUNZHN", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
