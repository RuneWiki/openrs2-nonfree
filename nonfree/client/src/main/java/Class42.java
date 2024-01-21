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

@OriginalClass("client!VOQVBLJN")
public final class Class42 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!VOQVBLJN", name = "f", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!VOQVBLJN", name = "a", descriptor = "I")
	private int anInt655 = 5;

	@OriginalMember(owner = "client!VOQVBLJN", name = "c", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!VOQVBLJN", name = "d", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!VOQVBLJN", name = "b", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!VOQVBLJN", name = "e", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!VOQVBLJN", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!VOQVBLJN", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt656 = arg2;
			this.anInt657 = arg0;
			this.anIntArray193 = new int[arg2 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method469();
			arg3.prepareImage(this.anImage1, this);
			this.method469();
			arg3.prepareImage(this.anImage1, this);
			this.method469();
			arg3.prepareImage(this.anImage1, this);
			if (arg1 < this.anInt655 || arg1 > this.anInt655) {
				throw new NullPointerException();
			}
			this.method467((byte) 6);
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("29213, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VOQVBLJN", name = "a", descriptor = "(B)V")
	public void method467(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			Class3_Sub1_Sub2.method549(this.anInt656, this.anIntArray193, this.anInt657);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("13664, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VOQVBLJN", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method469();
			arg2.drawImage(this.anImage1, arg0, arg1, this);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("64829, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VOQVBLJN", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt656, this.anInt657);
		arg0.setProperties((Hashtable) null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!VOQVBLJN", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!VOQVBLJN", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!VOQVBLJN", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!VOQVBLJN", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!VOQVBLJN", name = "a", descriptor = "()V")
	private synchronized void method469() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt656, this.anInt657, this.aColorModel1, this.anIntArray193, 0, this.anInt656);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!VOQVBLJN", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
