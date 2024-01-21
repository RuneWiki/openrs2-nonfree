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

@OriginalClass("client!DRNBRPSO")
public final class Class8 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!DRNBRPSO", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!DRNBRPSO", name = "a", descriptor = "I")
	private int anInt78 = 42850;

	@OriginalMember(owner = "client!DRNBRPSO", name = "c", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!DRNBRPSO", name = "d", descriptor = "I")
	private int anInt80;

	@OriginalMember(owner = "client!DRNBRPSO", name = "b", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!DRNBRPSO", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!DRNBRPSO", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!DRNBRPSO", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt79 = arg1;
			this.anInt80 = arg0;
			this.anIntArray24 = new int[arg1 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method45();
			arg2.prepareImage(this.anImage1, this);
			this.method45();
			arg2.prepareImage(this.anImage1, this);
			this.method45();
			arg2.prepareImage(this.anImage1, this);
			this.method43();
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("55939, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DRNBRPSO", name = "a", descriptor = "(I)V")
	public void method43() {
		try {
			Class6_Sub1_Sub3.method544(this.anInt80, this.anInt79, this.anIntArray24);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("74187, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DRNBRPSO", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method44(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		try {
			this.method45();
			arg1.drawImage(this.anImage1, arg0, arg2, this);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("91923, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DRNBRPSO", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt79, this.anInt80);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!DRNBRPSO", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!DRNBRPSO", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!DRNBRPSO", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!DRNBRPSO", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!DRNBRPSO", name = "a", descriptor = "()V")
	private synchronized void method45() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt79, this.anInt80, this.aColorModel1, this.anIntArray24, 0, this.anInt79);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!DRNBRPSO", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
