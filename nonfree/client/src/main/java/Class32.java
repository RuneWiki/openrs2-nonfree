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

@OriginalClass("client!PRSDKOTZ")
public final class Class32 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!PRSDKOTZ", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!PRSDKOTZ", name = "a", descriptor = "Z")
	private boolean aBoolean124 = true;

	@OriginalMember(owner = "client!PRSDKOTZ", name = "c", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!PRSDKOTZ", name = "d", descriptor = "I")
	private int anInt496;

	@OriginalMember(owner = "client!PRSDKOTZ", name = "b", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!PRSDKOTZ", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!PRSDKOTZ", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!PRSDKOTZ", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt495 = arg2;
			this.anInt496 = arg1;
			this.anIntArray108 = new int[arg2 * arg1];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method298();
			arg3.prepareImage(this.anImage1, this);
			this.method298();
			arg3.prepareImage(this.anImage1, this);
			this.method298();
			arg3.prepareImage(this.anImage1, this);
			this.method296();
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("1958, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRSDKOTZ", name = "a", descriptor = "(I)V")
	public void method296() {
		try {
			Class2_Sub1_Sub2.method473(this.anInt495, this.anInt496, this.anIntArray108);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("60032, " + -181 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRSDKOTZ", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	public void method297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		try {
			this.method298();
			arg2.drawImage(this.anImage1, arg0, arg1, this);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("38860, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 108 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PRSDKOTZ", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt495, this.anInt496);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!PRSDKOTZ", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!PRSDKOTZ", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!PRSDKOTZ", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!PRSDKOTZ", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!PRSDKOTZ", name = "a", descriptor = "()V")
	private synchronized void method298() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt495, this.anInt496, this.aColorModel1, this.anIntArray108, 0, this.anInt495);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!PRSDKOTZ", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
