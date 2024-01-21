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

@OriginalClass("client!YZGYDKDO")
public final class Class48 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!YZGYDKDO", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!YZGYDKDO", name = "b", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!YZGYDKDO", name = "c", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!YZGYDKDO", name = "a", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!YZGYDKDO", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!YZGYDKDO", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!YZGYDKDO", name = "<init>", descriptor = "(Ljava/awt/Component;IIB)V")
	public Class48(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			this.anInt828 = arg1;
			this.anInt829 = arg2;
			this.anIntArray205 = new int[arg1 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method557();
			arg0.prepareImage(this.anImage1, this);
			this.method557();
			arg0.prepareImage(this.anImage1, this);
			this.method557();
			arg0.prepareImage(this.anImage1, this);
			this.method555();
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("18146, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZGYDKDO", name = "a", descriptor = "(I)V")
	public void method555() {
		try {
			Class1_Sub1_Sub2.method346(this.anInt828, this.anInt829, this.anIntArray205);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("62379, " + -186 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZGYDKDO", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method556(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.method557();
			@Pc(5) boolean local5 = false;
			arg0.drawImage(this.anImage1, arg3, arg1, this);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("28361, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZGYDKDO", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt828, this.anInt829);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!YZGYDKDO", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!YZGYDKDO", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!YZGYDKDO", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!YZGYDKDO", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!YZGYDKDO", name = "a", descriptor = "()V")
	private synchronized void method557() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt828, this.anInt829, this.aColorModel1, this.anIntArray205, 0, this.anInt828);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!YZGYDKDO", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
