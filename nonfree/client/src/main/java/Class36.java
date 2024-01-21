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

@OriginalClass("client!SKZHQGHX")
public final class Class36 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!SKZHQGHX", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!SKZHQGHX", name = "a", descriptor = "I")
	private int anInt591 = 322;

	@OriginalMember(owner = "client!SKZHQGHX", name = "c", descriptor = "I")
	private int anInt592;

	@OriginalMember(owner = "client!SKZHQGHX", name = "d", descriptor = "I")
	private int anInt593;

	@OriginalMember(owner = "client!SKZHQGHX", name = "b", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!SKZHQGHX", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!SKZHQGHX", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!SKZHQGHX", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt592 = arg2;
			this.anInt593 = arg0;
			this.anIntArray119 = new int[arg2 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method393();
			arg3.prepareImage(this.anImage1, this);
			this.method393();
			arg3.prepareImage(this.anImage1, this);
			this.method393();
			arg3.prepareImage(this.anImage1, this);
			this.method391();
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("51159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SKZHQGHX", name = "a", descriptor = "(I)V")
	public void method391() {
		try {
			Class3_Sub1_Sub1.method537(this.anIntArray119, this.anInt592, this.anInt593);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("59762, " + 9133 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SKZHQGHX", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method393();
			arg2.drawImage(this.anImage1, arg0, arg1, this);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("99938, " + arg0 + ", " + -30916 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SKZHQGHX", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt592, this.anInt593);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!SKZHQGHX", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!SKZHQGHX", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!SKZHQGHX", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!SKZHQGHX", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!SKZHQGHX", name = "a", descriptor = "()V")
	private synchronized void method393() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt592, this.anInt593, this.aColorModel1, this.anIntArray119, 0, this.anInt592);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!SKZHQGHX", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
