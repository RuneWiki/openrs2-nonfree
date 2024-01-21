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

@OriginalClass("client!IOGVZQTL")
public final class Class20 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!IOGVZQTL", name = "a", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!IOGVZQTL", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!IOGVZQTL", name = "b", descriptor = "Z")
	private boolean aBoolean83 = true;

	@OriginalMember(owner = "client!IOGVZQTL", name = "d", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!IOGVZQTL", name = "e", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!IOGVZQTL", name = "c", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!IOGVZQTL", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!IOGVZQTL", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!IOGVZQTL", name = "<init>", descriptor = "(IILjava/awt/Component;Z)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) boolean arg3) {
		try {
			this.anInt235 = arg0;
			this.anInt236 = arg1;
			this.anIntArray53 = new int[arg0 * arg1];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			if (arg3) {
				throw new NullPointerException();
			}
			this.anImage1 = arg2.createImage(this);
			this.method232();
			arg2.prepareImage(this.anImage1, this);
			this.method232();
			arg2.prepareImage(this.anImage1, this);
			this.method232();
			arg2.prepareImage(this.anImage1, this);
			this.method230(this.anInt234);
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("47041, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOGVZQTL", name = "a", descriptor = "(I)V")
	public void method230(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.aBoolean83 = !this.aBoolean83;
			}
			Class2_Sub1_Sub1.method273(this.anIntArray53, this.anInt236, this.anInt235);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("94414, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOGVZQTL", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	public void method231(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		try {
			this.method232();
			arg1.drawImage(this.anImage1, arg2, arg0, this);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("3099, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -47 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOGVZQTL", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt235, this.anInt236);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!IOGVZQTL", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!IOGVZQTL", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!IOGVZQTL", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!IOGVZQTL", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!IOGVZQTL", name = "a", descriptor = "()V")
	private synchronized void method232() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt235, this.anInt236, this.aColorModel1, this.anIntArray53, 0, this.anInt235);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!IOGVZQTL", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
