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

@OriginalClass("client!MVSFNVJP")
public final class Class25 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!MVSFNVJP", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!MVSFNVJP", name = "a", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!MVSFNVJP", name = "b", descriptor = "I")
	private int anInt417 = -408;

	@OriginalMember(owner = "client!MVSFNVJP", name = "d", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!MVSFNVJP", name = "e", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!MVSFNVJP", name = "c", descriptor = "[I")
	public int[] anIntArray86;

	@OriginalMember(owner = "client!MVSFNVJP", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!MVSFNVJP", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!MVSFNVJP", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
	public Class25(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt418 = arg2;
			this.anInt419 = arg1;
			this.anIntArray86 = new int[arg2 * arg1];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method304();
			arg0.prepareImage(this.anImage1, this);
			this.method304();
			arg0.prepareImage(this.anImage1, this);
			this.method304();
			arg0.prepareImage(this.anImage1, this);
			this.method302(this.aBoolean108);
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("67916, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVSFNVJP", name = "a", descriptor = "(Z)V")
	public void method302(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.aBoolean108 = !this.aBoolean108;
			}
			Class4_Sub1_Sub2.method491(this.anIntArray86, this.anInt419, this.anInt418);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("48873, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVSFNVJP", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method304();
			arg2.drawImage(this.anImage1, arg0, arg1, this);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("62332, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVSFNVJP", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt418, this.anInt419);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!MVSFNVJP", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!MVSFNVJP", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!MVSFNVJP", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!MVSFNVJP", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!MVSFNVJP", name = "a", descriptor = "()V")
	private synchronized void method304() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt418, this.anInt419, this.aColorModel1, this.anIntArray86, 0, this.anInt418);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!MVSFNVJP", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
