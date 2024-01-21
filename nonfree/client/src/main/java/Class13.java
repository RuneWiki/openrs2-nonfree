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

@OriginalClass("client!GYXQUUFC")
public final class Class13 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!GYXQUUFC", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!GYXQUUFC", name = "a", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!GYXQUUFC", name = "c", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!GYXQUUFC", name = "d", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!GYXQUUFC", name = "b", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!GYXQUUFC", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!GYXQUUFC", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!GYXQUUFC", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt207 = arg2;
			this.anInt208 = arg1;
			this.anIntArray40 = new int[arg2 * arg1];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method159();
			arg3.prepareImage(this.anImage1, this);
			this.method159();
			arg3.prepareImage(this.anImage1, this);
			this.method159();
			arg3.prepareImage(this.anImage1, this);
			this.method157(this.aBoolean58);
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("20938, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYXQUUFC", name = "a", descriptor = "(Z)V")
	public void method157(@OriginalArg(0) boolean arg0) {
		try {
			Class3_Sub1_Sub2.method516(this.anIntArray40, this.anInt207, this.anInt208);
			if (!arg0) {
				;
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("59408, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYXQUUFC", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method158(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		try {
			this.method159();
			arg1.drawImage(this.anImage1, arg2, arg0, this);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GYXQUUFC", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt207, this.anInt208);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!GYXQUUFC", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!GYXQUUFC", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!GYXQUUFC", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!GYXQUUFC", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!GYXQUUFC", name = "a", descriptor = "()V")
	private synchronized void method159() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt207, this.anInt208, this.aColorModel1, this.anIntArray40, 0, this.anInt207);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!GYXQUUFC", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
