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

@OriginalClass("client!BEVLZSVU")
public final class Class6 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!BEVLZSVU", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!BEVLZSVU", name = "a", descriptor = "I")
	private int anInt48 = 826;

	@OriginalMember(owner = "client!BEVLZSVU", name = "b", descriptor = "Z")
	private boolean aBoolean23 = true;

	@OriginalMember(owner = "client!BEVLZSVU", name = "d", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!BEVLZSVU", name = "e", descriptor = "I")
	private int anInt50;

	@OriginalMember(owner = "client!BEVLZSVU", name = "c", descriptor = "[I")
	public int[] anIntArray12;

	@OriginalMember(owner = "client!BEVLZSVU", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!BEVLZSVU", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!BEVLZSVU", name = "<init>", descriptor = "(IILjava/awt/Component;Z)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) boolean arg3) {
		try {
			this.anInt49 = arg1;
			this.anInt50 = arg0;
			this.anIntArray12 = new int[arg1 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method57();
			arg2.prepareImage(this.anImage1, this);
			this.method57();
			arg2.prepareImage(this.anImage1, this);
			this.method57();
			arg2.prepareImage(this.anImage1, this);
			this.method55();
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("41158, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BEVLZSVU", name = "a", descriptor = "(I)V")
	public void method55() {
		try {
			Class5_Sub1_Sub1.method544(this.anInt50, this.anInt49, this.anIntArray12);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("67636, " + -214 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BEVLZSVU", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method56(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		try {
			this.method57();
			arg1.drawImage(this.anImage1, arg2, arg0, this);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("48144, " + -71 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BEVLZSVU", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt49, this.anInt50);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!BEVLZSVU", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!BEVLZSVU", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!BEVLZSVU", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!BEVLZSVU", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!BEVLZSVU", name = "a", descriptor = "()V")
	private synchronized void method57() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt49, this.anInt50, this.aColorModel1, this.anIntArray12, 0, this.anInt49);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!BEVLZSVU", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
