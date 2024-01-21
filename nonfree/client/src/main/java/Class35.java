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
public final class Class35 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt840 = 2;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt841 = arg2;
			this.anInt842 = arg0;
			this.anIntArray228 = new int[arg2 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			if (arg1 < this.anInt840 || arg1 > this.anInt840) {
				for (@Pc(38) int local38 = 1; local38 > 0; local38++) {
				}
			}
			this.anImage1 = arg3.createImage(this);
			this.method519();
			arg3.prepareImage(this.anImage1, this);
			this.method519();
			arg3.prepareImage(this.anImage1, this);
			this.method519();
			arg3.prepareImage(this.anImage1, this);
			this.method517(this.aBoolean205);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("89349, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public void method517(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			Class1_Sub1_Sub2.method431(this.anInt841, this.anInt842, this.anIntArray228);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("55405, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public void method518(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		try {
			this.method519();
			arg1.drawImage(this.anImage1, arg0, arg2, this);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("57669, " + arg0 + ", " + arg1 + ", " + 76 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt841, this.anInt842);
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
	private synchronized void method519() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt841, this.anInt842, this.aColorModel1, this.anIntArray228, 0, this.anInt841);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
