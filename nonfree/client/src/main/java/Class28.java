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

@OriginalClass("client!PKTDMNAV")
public final class Class28 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!PKTDMNAV", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!PKTDMNAV", name = "a", descriptor = "I")
	private int anInt536 = 317;

	@OriginalMember(owner = "client!PKTDMNAV", name = "b", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!PKTDMNAV", name = "d", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!PKTDMNAV", name = "e", descriptor = "I")
	private int anInt538;

	@OriginalMember(owner = "client!PKTDMNAV", name = "c", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!PKTDMNAV", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!PKTDMNAV", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!PKTDMNAV", name = "<init>", descriptor = "(ILjava/awt/Component;IB)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			this.anInt537 = arg0;
			this.anInt538 = arg2;
			this.anIntArray124 = new int[arg0 * arg2];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg1.createImage(this);
			this.method358();
			arg1.prepareImage(this.anImage1, this);
			this.method358();
			arg1.prepareImage(this.anImage1, this);
			this.method358();
			arg1.prepareImage(this.anImage1, this);
			this.method356();
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("26906, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKTDMNAV", name = "a", descriptor = "(Z)V")
	public void method356() {
		try {
			Class6_Sub2_Sub2.method514(this.aBoolean146, this.anIntArray124, this.anInt538, this.anInt537);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("31007, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKTDMNAV", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
	public void method357(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		try {
			this.method358();
			arg2.drawImage(this.anImage1, arg1, arg0, this);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("24673, " + -122 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKTDMNAV", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt537, this.anInt538);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!PKTDMNAV", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!PKTDMNAV", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!PKTDMNAV", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!PKTDMNAV", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!PKTDMNAV", name = "a", descriptor = "()V")
	private synchronized void method358() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt537, this.anInt538, this.aColorModel1, this.anIntArray124, 0, this.anInt537);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!PKTDMNAV", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
