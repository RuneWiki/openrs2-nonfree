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

@OriginalClass("client!TRQPVNER")
public final class Class42 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!TRQPVNER", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!TRQPVNER", name = "a", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!TRQPVNER", name = "b", descriptor = "I")
	private int anInt624 = 722;

	@OriginalMember(owner = "client!TRQPVNER", name = "c", descriptor = "Z")
	private boolean aBoolean182 = true;

	@OriginalMember(owner = "client!TRQPVNER", name = "e", descriptor = "I")
	private int anInt625;

	@OriginalMember(owner = "client!TRQPVNER", name = "f", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!TRQPVNER", name = "d", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!TRQPVNER", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!TRQPVNER", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!TRQPVNER", name = "<init>", descriptor = "(IZLjava/awt/Component;I)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt625 = arg0;
			this.anInt626 = arg3;
			this.anIntArray168 = new int[arg0 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method422();
			arg2.prepareImage(this.anImage1, this);
			this.method422();
			arg2.prepareImage(this.anImage1, this);
			this.method422();
			arg2.prepareImage(this.anImage1, this);
			this.method420();
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("12145, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TRQPVNER", name = "a", descriptor = "(I)V")
	public void method420() {
		try {
			Class2_Sub1_Sub1.method480(this.anIntArray168, this.anInt626, this.anInt625);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("56213, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TRQPVNER", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3) {
		try {
			this.method422();
			arg2.drawImage(this.anImage1, arg0, arg3, this);
			@Pc(13) boolean local13 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("84410, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TRQPVNER", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt625, this.anInt626);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!TRQPVNER", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!TRQPVNER", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!TRQPVNER", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!TRQPVNER", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!TRQPVNER", name = "a", descriptor = "()V")
	private synchronized void method422() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt625, this.anInt626, this.aColorModel1, this.anIntArray168, 0, this.anInt625);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!TRQPVNER", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
