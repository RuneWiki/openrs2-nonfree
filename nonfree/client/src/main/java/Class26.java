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

@OriginalClass("client!MEXICRKY")
public final class Class26 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!MEXICRKY", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!MEXICRKY", name = "a", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!MEXICRKY", name = "b", descriptor = "I")
	private int anInt442 = -921;

	@OriginalMember(owner = "client!MEXICRKY", name = "c", descriptor = "Z")
	private boolean aBoolean83 = true;

	@OriginalMember(owner = "client!MEXICRKY", name = "e", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!MEXICRKY", name = "f", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!MEXICRKY", name = "d", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!MEXICRKY", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!MEXICRKY", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!MEXICRKY", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt443 = arg2;
			this.anInt444 = arg0;
			this.anIntArray104 = new int[arg2 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method281();
			arg3.prepareImage(this.anImage1, this);
			this.method281();
			arg3.prepareImage(this.anImage1, this);
			this.method281();
			arg3.prepareImage(this.anImage1, this);
			this.method279();
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("16400, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MEXICRKY", name = "a", descriptor = "(I)V")
	public void method279() {
		try {
			Class1_Sub2_Sub1.method530(this.anIntArray104, this.anInt443, this.anInt444);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("70141, " + -921 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MEXICRKY", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public void method280(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
			this.method281();
			arg0.drawImage(this.anImage1, arg1, arg2, this);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("57546, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MEXICRKY", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt443, this.anInt444);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!MEXICRKY", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!MEXICRKY", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!MEXICRKY", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!MEXICRKY", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!MEXICRKY", name = "a", descriptor = "()V")
	private synchronized void method281() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt443, this.anInt444, this.aColorModel1, this.anIntArray104, 0, this.anInt443);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!MEXICRKY", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
