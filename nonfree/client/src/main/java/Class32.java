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
public final class Class32 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Z")
	private boolean aBoolean158 = false;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Z")
	private boolean aBoolean159 = true;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	private int anInt667;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(ILjava/awt/Component;II)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt669 = arg0;
			this.anInt670 = arg2;
			this.anIntArray197 = new int[arg0 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg1.createImage(this);
			this.method457();
			arg1.prepareImage(this.anImage1, this);
			this.method457();
			arg1.prepareImage(this.anImage1, this);
			this.method457();
			arg1.prepareImage(this.anImage1, this);
			this.method455();
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("66457, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method455() {
		try {
			Class1_Sub3_Sub2.method350(this.anIntArray197, this.anInt669, this.anInt670, (byte) 6);
			if (this.anInt668 > 0 || this.anInt668 < 0) {
				this.aBoolean159 = !this.aBoolean159;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("70802, " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method457();
			arg2.drawImage(this.anImage1, arg1, arg0, this);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("61756, " + arg0 + ", " + arg1 + ", " + -715 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt669, this.anInt670);
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
	private synchronized void method457() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt669, this.anInt670, this.aColorModel1, this.anIntArray197, 0, this.anInt669);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
