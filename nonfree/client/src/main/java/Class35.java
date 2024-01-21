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

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "B")
	private byte aByte32 = 4;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt836 = arg0;
			this.anInt837 = arg2;
			this.anIntArray231 = new int[arg0 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method526();
			arg3.prepareImage(this.anImage1, this);
			this.method526();
			arg3.prepareImage(this.anImage1, this);
			this.method526();
			arg3.prepareImage(this.anImage1, this);
			this.method524((byte) 4);
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("37095, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public void method524(@OriginalArg(0) byte arg0) {
		try {
			Class1_Sub1_Sub2.method434(this.anInt836, 501, this.anInt837, this.anIntArray231);
			if (this.aByte32 == 4) {
				@Pc(13) boolean local13 = false;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("18701, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public void method525(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			this.method526();
			arg0.drawImage(this.anImage1, arg2, arg1, this);
			@Pc(14) boolean local14 = false;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("69972, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt836, this.anInt837);
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
	private synchronized void method526() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt836, this.anInt837, this.aColorModel1, this.anIntArray231, 0, this.anInt836);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
