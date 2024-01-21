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

@OriginalClass("client!YQSLUNUN")
public final class Class50 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!YQSLUNUN", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!YQSLUNUN", name = "a", descriptor = "B")
	private byte aByte44 = 1;

	@OriginalMember(owner = "client!YQSLUNUN", name = "c", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!YQSLUNUN", name = "d", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!YQSLUNUN", name = "b", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!YQSLUNUN", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!YQSLUNUN", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!YQSLUNUN", name = "<init>", descriptor = "(ILjava/awt/Component;IB)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			this.anInt834 = arg2;
			this.anInt835 = arg0;
			this.anIntArray209 = new int[arg2 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg1.createImage(this);
			this.method564();
			arg1.prepareImage(this.anImage1, this);
			this.method564();
			arg1.prepareImage(this.anImage1, this);
			this.method564();
			arg1.prepareImage(this.anImage1, this);
			this.method562();
			if (arg3 != this.aByte44) {
				throw new NullPointerException();
			}
			@Pc(63) boolean local63 = false;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("57159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YQSLUNUN", name = "a", descriptor = "(I)V")
	public void method562() {
		try {
			Class1_Sub1_Sub2.method537(this.anInt834, this.anIntArray209, this.anInt835);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("93265, " + 823 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YQSLUNUN", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method563(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			this.method564();
			arg1.drawImage(this.anImage1, arg3, arg0, this);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("22977, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YQSLUNUN", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt834, this.anInt835);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!YQSLUNUN", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!YQSLUNUN", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!YQSLUNUN", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!YQSLUNUN", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!YQSLUNUN", name = "a", descriptor = "()V")
	private synchronized void method564() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt834, this.anInt835, this.aColorModel1, this.anIntArray209, 0, this.anInt834);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!YQSLUNUN", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
