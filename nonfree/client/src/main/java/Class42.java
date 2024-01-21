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

@OriginalClass("client!XBLPPVAP")
public final class Class42 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!XBLPPVAP", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!XBLPPVAP", name = "b", descriptor = "I")
	private int anInt617;

	@OriginalMember(owner = "client!XBLPPVAP", name = "c", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!XBLPPVAP", name = "a", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!XBLPPVAP", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!XBLPPVAP", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!XBLPPVAP", name = "<init>", descriptor = "(Ljava/awt/Component;IIZ)V")
	public Class42(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			this.anInt617 = arg1;
			this.anInt618 = arg2;
			this.anIntArray170 = new int[arg1 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method427();
			arg0.prepareImage(this.anImage1, this);
			this.method427();
			arg0.prepareImage(this.anImage1, this);
			this.method427();
			arg0.prepareImage(this.anImage1, this);
			this.method425();
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("35120, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBLPPVAP", name = "a", descriptor = "(I)V")
	public void method425() {
		try {
			Class2_Sub1_Sub1.method431(this.anInt617, this.anInt618, this.anIntArray170);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("60834, " + 422 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBLPPVAP", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	public void method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		try {
			this.method427();
			arg2.drawImage(this.anImage1, arg1, arg0, this);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("87559, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBLPPVAP", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt617, this.anInt618);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!XBLPPVAP", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!XBLPPVAP", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!XBLPPVAP", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!XBLPPVAP", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!XBLPPVAP", name = "a", descriptor = "()V")
	private synchronized void method427() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt617, this.anInt618, this.aColorModel1, this.anIntArray170, 0, this.anInt617);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!XBLPPVAP", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
