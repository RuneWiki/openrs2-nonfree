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

@OriginalClass("client!BVMYRJQC")
public final class Class10 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!BVMYRJQC", name = "a", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!BVMYRJQC", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!BVMYRJQC", name = "b", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!BVMYRJQC", name = "d", descriptor = "I")
	private int anInt69;

	@OriginalMember(owner = "client!BVMYRJQC", name = "e", descriptor = "I")
	private int anInt70;

	@OriginalMember(owner = "client!BVMYRJQC", name = "c", descriptor = "[I")
	public int[] anIntArray18;

	@OriginalMember(owner = "client!BVMYRJQC", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!BVMYRJQC", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!BVMYRJQC", name = "<init>", descriptor = "(ILjava/awt/Component;ZI)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt69 = arg3;
			this.anInt70 = arg0;
			this.anIntArray18 = new int[arg3 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg1.createImage(this);
			this.method46();
			arg1.prepareImage(this.anImage1, this);
			this.method46();
			arg1.prepareImage(this.anImage1, this);
			this.method46();
			arg1.prepareImage(this.anImage1, this);
			this.method44();
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("79110, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVMYRJQC", name = "a", descriptor = "(I)V")
	public void method44() {
		try {
			Class5_Sub1_Sub2.method330(this.anIntArray18, this.anInt69, this.anInt70);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("29338, " + 2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVMYRJQC", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method45(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.method46();
			arg0.drawImage(this.anImage1, arg1, arg2, this);
			if (arg3 != 44451) {
				this.anInt68 = 13;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("19062, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVMYRJQC", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt69, this.anInt70);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!BVMYRJQC", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!BVMYRJQC", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!BVMYRJQC", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!BVMYRJQC", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!BVMYRJQC", name = "a", descriptor = "()V")
	private synchronized void method46() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt69, this.anInt70, this.aColorModel1, this.anIntArray18, 0, this.anInt69);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!BVMYRJQC", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
