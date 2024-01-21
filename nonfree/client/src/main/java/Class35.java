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

@OriginalClass("client!qb")
public final class Class35 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	private int anInt841 = 328;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt842 = 25737;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/awt/Component;BII)V")
	public Class35(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(15) boolean local15 = false;
			this.anInt843 = arg3;
			this.anInt844 = arg2;
			this.anIntArray231 = new int[arg3 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method526();
			arg0.prepareImage(this.anImage1, this);
			this.method526();
			arg0.prepareImage(this.anImage1, this);
			this.method526();
			arg0.prepareImage(this.anImage1, this);
			this.method524(this.anInt841);
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("27529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method524(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 38 / arg0;
			Class1_Sub1_Sub2.method434(this.anIntArray231, this.anInt844, this.anInt843, 234);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("229, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
	public void method525(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.method526();
			arg0.drawImage(this.anImage1, arg1, arg2, this);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("80261, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt843, this.anInt844);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!qb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!qb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!qb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
	private synchronized void method526() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt843, this.anInt844, this.aColorModel1, this.anIntArray231, 0, this.anInt843);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
