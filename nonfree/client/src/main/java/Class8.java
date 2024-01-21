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

@OriginalClass("client!ESGPTMPA")
public final class Class8 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!ESGPTMPA", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ESGPTMPA", name = "a", descriptor = "I")
	private int anInt288 = 8;

	@OriginalMember(owner = "client!ESGPTMPA", name = "b", descriptor = "I")
	private int anInt289 = 550;

	@OriginalMember(owner = "client!ESGPTMPA", name = "d", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!ESGPTMPA", name = "e", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!ESGPTMPA", name = "c", descriptor = "[I")
	public int[] anIntArray42;

	@OriginalMember(owner = "client!ESGPTMPA", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ESGPTMPA", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ESGPTMPA", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt290 = arg1;
			this.anInt291 = arg0;
			this.anIntArray42 = new int[arg1 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method135();
			arg2.prepareImage(this.anImage1, this);
			if (arg3 <= 0) {
				this.anInt288 = -493;
			}
			this.method135();
			arg2.prepareImage(this.anImage1, this);
			this.method135();
			arg2.prepareImage(this.anImage1, this);
			this.method133();
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("42907, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ESGPTMPA", name = "a", descriptor = "(B)V")
	public void method133() {
		try {
			Class1_Sub1_Sub2.method512(this.anIntArray42, this.anInt291, this.anInt290);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("86183, " + 59 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ESGPTMPA", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	public void method134(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.method135();
			arg0.drawImage(this.anImage1, arg2, arg1, this);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("21819, " + arg0 + ", " + 19 + ", " + arg1 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ESGPTMPA", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt290, this.anInt291);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ESGPTMPA", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ESGPTMPA", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ESGPTMPA", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ESGPTMPA", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!ESGPTMPA", name = "a", descriptor = "()V")
	private synchronized void method135() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt290, this.anInt291, this.aColorModel1, this.anIntArray42, 0, this.anInt290);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ESGPTMPA", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
