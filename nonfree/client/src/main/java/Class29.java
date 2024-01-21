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

@OriginalClass("client!NUXCAHZM")
public final class Class29 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!NUXCAHZM", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!NUXCAHZM", name = "a", descriptor = "I")
	private int anInt412 = -47299;

	@OriginalMember(owner = "client!NUXCAHZM", name = "c", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!NUXCAHZM", name = "d", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!NUXCAHZM", name = "b", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!NUXCAHZM", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!NUXCAHZM", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!NUXCAHZM", name = "<init>", descriptor = "(IIZLjava/awt/Component;)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt413 = arg1;
			this.anInt414 = arg0;
			this.anIntArray64 = new int[arg1 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method341();
			arg3.prepareImage(this.anImage1, this);
			this.method341();
			arg3.prepareImage(this.anImage1, this);
			this.method341();
			arg3.prepareImage(this.anImage1, this);
			this.method339();
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("80385, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXCAHZM", name = "a", descriptor = "(I)V")
	public void method339() {
		try {
			Class8_Sub1_Sub1.method502(this.anInt414, this.anInt413, this.anIntArray64);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("16013, " + 1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXCAHZM", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method340(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			this.method341();
			arg0.drawImage(this.anImage1, arg1, arg2, this);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("14631, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -47890 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXCAHZM", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt413, this.anInt414);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!NUXCAHZM", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!NUXCAHZM", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!NUXCAHZM", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!NUXCAHZM", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!NUXCAHZM", name = "a", descriptor = "()V")
	private synchronized void method341() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt413, this.anInt414, this.aColorModel1, this.anIntArray64, 0, this.anInt413);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!NUXCAHZM", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
