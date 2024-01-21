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
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt854 = 9;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(BIILjava/awt/Component;)V")
	public Class35(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt855 = arg1;
			this.anInt856 = arg2;
			this.anIntArray231 = new int[arg1 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method526();
			arg3.prepareImage(this.anImage1, this);
			this.method526();
			arg3.prepareImage(this.anImage1, this);
			this.method526();
			arg3.prepareImage(this.anImage1, this);
			if (arg0 != 8) {
				for (@Pc(62) int local62 = 1; local62 > 0; local62++) {
				}
			}
			this.method524(this.anInt854);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("61607, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method524(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 9 || arg0 > 9) {
				this.aBoolean206 = !this.aBoolean206;
			}
			Class1_Sub1_Sub2.method434(this.anInt855, this.anIntArray231, this.anInt856);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("34627, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method526();
			arg2.drawImage(this.anImage1, arg1, arg0, this);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("82523, " + arg0 + ", " + -183 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt855, this.anInt856);
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
			this.anImageConsumer1.setPixels(0, 0, this.anInt855, this.anInt856, this.aColorModel1, this.anIntArray231, 0, this.anInt855);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
