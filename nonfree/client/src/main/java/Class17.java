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

@OriginalClass("client!IUZTBIWV")
public final class Class17 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!IUZTBIWV", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!IUZTBIWV", name = "a", descriptor = "I")
	private int anInt308 = 7;

	@OriginalMember(owner = "client!IUZTBIWV", name = "c", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!IUZTBIWV", name = "d", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!IUZTBIWV", name = "b", descriptor = "[I")
	public int[] anIntArray114;

	@OriginalMember(owner = "client!IUZTBIWV", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!IUZTBIWV", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!IUZTBIWV", name = "<init>", descriptor = "(Ljava/awt/Component;IBI)V")
	public Class17(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt309 = arg1;
			this.anInt310 = arg3;
			@Pc(14) boolean local14 = false;
			this.anIntArray114 = new int[arg1 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method231();
			arg0.prepareImage(this.anImage1, this);
			this.method231();
			arg0.prepareImage(this.anImage1, this);
			this.method231();
			arg0.prepareImage(this.anImage1, this);
			this.method229();
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("39690, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUZTBIWV", name = "a", descriptor = "(B)V")
	public void method229() {
		try {
			Class1_Sub1_Sub2.method456(this.anInt309, this.anIntArray114, this.anInt310);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("47482, " + 4 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUZTBIWV", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		try {
			this.method231();
			arg2.drawImage(this.anImage1, arg0, arg1, this);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("42445, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IUZTBIWV", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt309, this.anInt310);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!IUZTBIWV", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!IUZTBIWV", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!IUZTBIWV", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!IUZTBIWV", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!IUZTBIWV", name = "a", descriptor = "()V")
	private synchronized void method231() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt309, this.anInt310, this.aColorModel1, this.anIntArray114, 0, this.anInt309);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!IUZTBIWV", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
