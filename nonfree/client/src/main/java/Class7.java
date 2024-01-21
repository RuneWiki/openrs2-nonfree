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

@OriginalClass("client!CMFQLMCT")
public final class Class7 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!CMFQLMCT", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!CMFQLMCT", name = "a", descriptor = "Z")
	private boolean aBoolean26 = true;

	@OriginalMember(owner = "client!CMFQLMCT", name = "c", descriptor = "I")
	private int anInt77;

	@OriginalMember(owner = "client!CMFQLMCT", name = "d", descriptor = "I")
	private int anInt78;

	@OriginalMember(owner = "client!CMFQLMCT", name = "b", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!CMFQLMCT", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!CMFQLMCT", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!CMFQLMCT", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt77 = arg0;
			this.anInt78 = arg2;
			this.anIntArray22 = new int[arg0 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg1.createImage(this);
			@Pc(34) int local34 = 38 / arg3;
			this.method94();
			arg1.prepareImage(this.anImage1, this);
			this.method94();
			arg1.prepareImage(this.anImage1, this);
			this.method94();
			arg1.prepareImage(this.anImage1, this);
			this.method92();
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("21303, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMFQLMCT", name = "a", descriptor = "(Z)V")
	public void method92() {
		try {
			Class1_Sub1_Sub1.method546(this.anIntArray22, this.anInt77, this.anInt78);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("26168, " + true + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMFQLMCT", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
	public void method93(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.method94();
			arg0.drawImage(this.anImage1, arg2, arg1, this);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("98837, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMFQLMCT", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt77, this.anInt78);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!CMFQLMCT", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!CMFQLMCT", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!CMFQLMCT", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!CMFQLMCT", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!CMFQLMCT", name = "a", descriptor = "()V")
	private synchronized void method94() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt77, this.anInt78, this.aColorModel1, this.anIntArray22, 0, this.anInt77);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!CMFQLMCT", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
