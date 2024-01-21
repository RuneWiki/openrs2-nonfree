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

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt858 = arg1;
			this.anInt859 = arg3;
			this.anIntArray231 = new int[arg1 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method526();
			arg2.prepareImage(this.anImage1, this);
			this.method526();
			arg2.prepareImage(this.anImage1, this);
			this.method526();
			arg2.prepareImage(this.anImage1, this);
			this.method524();
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("66557, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method524() {
		try {
			Class1_Sub1_Sub2.method434(this.anInt858, this.anIntArray231, this.anInt859);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("17704, " + 6745 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 == 0) {
				this.method526();
				arg2.drawImage(this.anImage1, arg0, arg1, this);
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("79298, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt858, this.anInt859);
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
			this.anImageConsumer1.setPixels(0, 0, this.anInt858, this.anInt859, this.aColorModel1, this.anIntArray231, 0, this.anInt858);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
