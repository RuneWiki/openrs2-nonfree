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

@OriginalClass("client!pb")
public final class Class27 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	private int anInt491 = 604;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	private boolean aBoolean101 = true;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	private int anInt492;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	private int anInt493;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		this.anInt492 = arg2;
		this.anInt493 = arg0;
		this.anIntArray165 = new int[arg2 * arg0];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = arg3.createImage(this);
		this.method361();
		arg3.prepareImage(this.anImage1, this);
		this.method361();
		arg3.prepareImage(this.anImage1, this);
		this.method361();
		arg3.prepareImage(this.anImage1, this);
		this.method359();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public void method359() {
		Class1_Sub3_Sub2.method266(this.aBoolean101, this.anInt492, this.anIntArray165, this.anInt493);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Graphics;II)V")
	public void method360(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method361();
		arg0.drawImage(this.anImage1, arg1, arg2, this);
	}

	@OriginalMember(owner = "client!pb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt492, this.anInt493);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!pb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!pb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()V")
	private synchronized void method361() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt492, this.anInt493, this.aColorModel1, this.anIntArray165, 0, this.anInt492);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!pb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
