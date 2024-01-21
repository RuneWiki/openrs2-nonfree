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

@OriginalClass("client!HURULSIZ")
public final class Class17 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!HURULSIZ", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!HURULSIZ", name = "c", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!HURULSIZ", name = "d", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!HURULSIZ", name = "b", descriptor = "[I")
	public int[] anIntArray87;

	@OriginalMember(owner = "client!HURULSIZ", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!HURULSIZ", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!HURULSIZ", name = "a", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!HURULSIZ", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt251 = arg1;
			this.anInt252 = arg0;
			this.anIntArray87 = new int[arg1 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method197();
			arg2.prepareImage(this.anImage1, this);
			this.method197();
			arg2.prepareImage(this.anImage1, this);
			this.method197();
			arg2.prepareImage(this.anImage1, this);
			this.method195();
			if (arg3 != 0) {
				this.anInt250 = -62;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("87081, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HURULSIZ", name = "a", descriptor = "(I)V")
	public void method195() {
		try {
			Class2_Sub1_Sub2.method545(this.anInt252, this.anInt251, this.anIntArray87);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("91638, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HURULSIZ", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method196(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.method197();
			arg0.drawImage(this.anImage1, arg1, arg2, this);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("4379, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HURULSIZ", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt251, this.anInt252);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!HURULSIZ", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!HURULSIZ", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!HURULSIZ", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!HURULSIZ", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!HURULSIZ", name = "a", descriptor = "()V")
	private synchronized void method197() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt251, this.anInt252, this.aColorModel1, this.anIntArray87, 0, this.anInt251);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!HURULSIZ", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
