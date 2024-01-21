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

@OriginalClass("client!EDCVNWGU")
public final class Class12 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!EDCVNWGU", name = "i", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!EDCVNWGU", name = "a", descriptor = "I")
	private int anInt230 = 3;

	@OriginalMember(owner = "client!EDCVNWGU", name = "b", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!EDCVNWGU", name = "c", descriptor = "I")
	private int anInt231 = -3747;

	@OriginalMember(owner = "client!EDCVNWGU", name = "d", descriptor = "I")
	private int anInt232 = -212;

	@OriginalMember(owner = "client!EDCVNWGU", name = "f", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!EDCVNWGU", name = "g", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!EDCVNWGU", name = "e", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!EDCVNWGU", name = "h", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!EDCVNWGU", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!EDCVNWGU", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
	public Class12(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt233 = arg3;
			this.anInt234 = arg2;
			this.anIntArray36 = new int[arg3 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method184();
			arg0.prepareImage(this.anImage1, this);
			this.method184();
			arg0.prepareImage(this.anImage1, this);
			this.method184();
			arg0.prepareImage(this.anImage1, this);
			this.method182(this.anInt231);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("52959, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDCVNWGU", name = "a", descriptor = "(I)V")
	public void method182(@OriginalArg(0) int arg0) {
		try {
			Class1_Sub1_Sub3.method509(this.anInt233, this.anInt234, this.anIntArray36);
			if (arg0 != -3747) {
				this.aBoolean60 = !this.aBoolean60;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("53310, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDCVNWGU", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		try {
			this.method184();
			arg2.drawImage(this.anImage1, arg1, arg0, this);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("28556, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDCVNWGU", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt233, this.anInt234);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!EDCVNWGU", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!EDCVNWGU", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!EDCVNWGU", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!EDCVNWGU", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!EDCVNWGU", name = "a", descriptor = "()V")
	private synchronized void method184() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt233, this.anInt234, this.aColorModel1, this.anIntArray36, 0, this.anInt233);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!EDCVNWGU", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
