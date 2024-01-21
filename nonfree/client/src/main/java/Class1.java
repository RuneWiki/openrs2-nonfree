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

@OriginalClass("client!AKBGAGNS")
public final class Class1 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!AKBGAGNS", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!AKBGAGNS", name = "a", descriptor = "B")
	private byte aByte1 = 73;

	@OriginalMember(owner = "client!AKBGAGNS", name = "b", descriptor = "I")
	private int anInt1 = -826;

	@OriginalMember(owner = "client!AKBGAGNS", name = "c", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!AKBGAGNS", name = "e", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!AKBGAGNS", name = "f", descriptor = "I")
	private int anInt3;

	@OriginalMember(owner = "client!AKBGAGNS", name = "d", descriptor = "[I")
	public int[] anIntArray1;

	@OriginalMember(owner = "client!AKBGAGNS", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!AKBGAGNS", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!AKBGAGNS", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
	public Class1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt2 = arg3;
			this.anInt3 = arg0;
			this.anIntArray1 = new int[arg3 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method3();
			arg2.prepareImage(this.anImage1, this);
			this.method3();
			arg2.prepareImage(this.anImage1, this);
			this.method3();
			arg2.prepareImage(this.anImage1, this);
			this.method1(this.aByte1);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("26716, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKBGAGNS", name = "a", descriptor = "(B)V")
	public void method1(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == this.aByte1) {
				Class2_Sub1_Sub3.method352(this.anIntArray1, this.anInt2, this.anInt3);
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("55473, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKBGAGNS", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	public void method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method3();
			arg2.drawImage(this.anImage1, arg1, arg0, this);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("26182, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKBGAGNS", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt2, this.anInt3);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!AKBGAGNS", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!AKBGAGNS", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!AKBGAGNS", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!AKBGAGNS", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!AKBGAGNS", name = "a", descriptor = "()V")
	private synchronized void method3() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt2, this.anInt3, this.aColorModel1, this.anIntArray1, 0, this.anInt2);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!AKBGAGNS", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
