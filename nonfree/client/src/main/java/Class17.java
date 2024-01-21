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

@OriginalClass("client!IVIFZQBK")
public final class Class17 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!IVIFZQBK", name = "a", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!IVIFZQBK", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!IVIFZQBK", name = "b", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!IVIFZQBK", name = "d", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!IVIFZQBK", name = "e", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!IVIFZQBK", name = "c", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!IVIFZQBK", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!IVIFZQBK", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!IVIFZQBK", name = "<init>", descriptor = "(IILjava/awt/Component;I)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt396 = arg0;
			this.anInt397 = arg1;
			this.anIntArray69 = new int[arg0 * arg1];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method220();
			arg2.prepareImage(this.anImage1, this);
			this.method220();
			arg2.prepareImage(this.anImage1, this);
			this.method220();
			arg2.prepareImage(this.anImage1, this);
			this.method218();
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("55701, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IVIFZQBK", name = "a", descriptor = "(I)V")
	public void method218() {
		try {
			Class1_Sub1_Sub1.method487(this.anInt397, this.anInt396, this.anIntArray69);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("61030, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IVIFZQBK", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method219(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		try {
			this.method220();
			arg1.drawImage(this.anImage1, arg2, arg0, this);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("99028, " + arg0 + ", " + 23680 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IVIFZQBK", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt396, this.anInt397);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!IVIFZQBK", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!IVIFZQBK", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!IVIFZQBK", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!IVIFZQBK", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!IVIFZQBK", name = "a", descriptor = "()V")
	private synchronized void method220() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt396, this.anInt397, this.aColorModel1, this.anIntArray69, 0, this.anInt396);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!IVIFZQBK", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
