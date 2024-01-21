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

@OriginalClass("client!ISZGOOMR")
public final class Class19 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!ISZGOOMR", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!ISZGOOMR", name = "a", descriptor = "Z")
	private boolean aBoolean64 = true;

	@OriginalMember(owner = "client!ISZGOOMR", name = "c", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!ISZGOOMR", name = "d", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!ISZGOOMR", name = "b", descriptor = "[I")
	public int[] anIntArray56;

	@OriginalMember(owner = "client!ISZGOOMR", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!ISZGOOMR", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ISZGOOMR", name = "<init>", descriptor = "(IBLjava/awt/Component;I)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt214 = arg3;
			this.anInt215 = arg0;
			this.anIntArray56 = new int[arg3 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method132();
			arg2.prepareImage(this.anImage1, this);
			this.method132();
			arg2.prepareImage(this.anImage1, this);
			this.method132();
			arg2.prepareImage(this.anImage1, this);
			this.method130();
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("6856, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ISZGOOMR", name = "a", descriptor = "(Z)V")
	public void method130() {
		try {
			Class10_Sub1_Sub1.method494(this.aBoolean64, this.anInt214, this.anInt215, this.anIntArray56);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("24943, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ISZGOOMR", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) boolean arg3) {
		try {
			if (!arg3) {
				this.method132();
				arg2.drawImage(this.anImage1, arg1, arg0, this);
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("97525, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ISZGOOMR", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt214, this.anInt215);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!ISZGOOMR", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!ISZGOOMR", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!ISZGOOMR", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!ISZGOOMR", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!ISZGOOMR", name = "a", descriptor = "()V")
	private synchronized void method132() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt214, this.anInt215, this.aColorModel1, this.anIntArray56, 0, this.anInt214);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!ISZGOOMR", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
