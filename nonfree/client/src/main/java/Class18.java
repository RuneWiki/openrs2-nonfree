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

@OriginalClass("client!KJGJRATW")
public final class Class18 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!KJGJRATW", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!KJGJRATW", name = "a", descriptor = "I")
	private int anInt207 = 357;

	@OriginalMember(owner = "client!KJGJRATW", name = "c", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!KJGJRATW", name = "d", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!KJGJRATW", name = "b", descriptor = "[I")
	public int[] anIntArray98;

	@OriginalMember(owner = "client!KJGJRATW", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!KJGJRATW", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!KJGJRATW", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
	public Class18(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt208 = arg2;
			this.anInt209 = arg3;
			this.anIntArray98 = new int[arg2 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method191();
			arg0.prepareImage(this.anImage1, this);
			this.method191();
			arg0.prepareImage(this.anImage1, this);
			this.method191();
			arg0.prepareImage(this.anImage1, this);
			this.method189();
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("61878, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJGJRATW", name = "a", descriptor = "(I)V")
	public void method189() {
		try {
			Class1_Sub1_Sub2.method553(this.anIntArray98, this.anInt208, this.anInt209);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("40981, " + -439 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJGJRATW", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3) {
		try {
			this.method191();
			@Pc(5) boolean local5 = false;
			arg3.drawImage(this.anImage1, arg2, arg1, this);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("97225, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJGJRATW", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt208, this.anInt209);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!KJGJRATW", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!KJGJRATW", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!KJGJRATW", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!KJGJRATW", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!KJGJRATW", name = "a", descriptor = "()V")
	private synchronized void method191() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt208, this.anInt209, this.aColorModel1, this.anIntArray98, 0, this.anInt208);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!KJGJRATW", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
