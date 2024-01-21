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

@OriginalClass("client!VFZXUVTW")
public final class Class40 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!VFZXUVTW", name = "b", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!VFZXUVTW", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!VFZXUVTW", name = "a", descriptor = "I")
	private int anInt672 = 2;

	@OriginalMember(owner = "client!VFZXUVTW", name = "d", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!VFZXUVTW", name = "e", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!VFZXUVTW", name = "c", descriptor = "[I")
	public int[] anIntArray179;

	@OriginalMember(owner = "client!VFZXUVTW", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!VFZXUVTW", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!VFZXUVTW", name = "<init>", descriptor = "(IIBLjava/awt/Component;)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt674 = arg1;
			this.anInt675 = arg0;
			this.anIntArray179 = new int[arg1 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method498();
			arg3.prepareImage(this.anImage1, this);
			if (arg2 != 4) {
				this.anInt672 = -203;
			}
			this.method498();
			arg3.prepareImage(this.anImage1, this);
			this.method498();
			arg3.prepareImage(this.anImage1, this);
			this.method496();
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("13212, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VFZXUVTW", name = "a", descriptor = "(B)V")
	public void method496() {
		try {
			Class8_Sub1_Sub2.method548(this.anInt675, this.anInt674, this.anIntArray179);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("19048, " + 3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VFZXUVTW", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method498();
			arg2.drawImage(this.anImage1, arg1, arg0, this);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("98883, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VFZXUVTW", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt674, this.anInt675);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!VFZXUVTW", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!VFZXUVTW", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!VFZXUVTW", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!VFZXUVTW", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!VFZXUVTW", name = "a", descriptor = "()V")
	private synchronized void method498() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt674, this.anInt675, this.aColorModel1, this.anIntArray179, 0, this.anInt674);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!VFZXUVTW", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
