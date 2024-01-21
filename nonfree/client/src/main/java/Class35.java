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

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	private int anInt815 = -328;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	private int anInt816 = -884;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IZLjava/awt/Component;I)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt817 = arg0;
			this.anInt818 = arg3;
			this.anIntArray228 = new int[arg0 * arg3];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method518();
			arg2.prepareImage(this.anImage1, this);
			this.method518();
			arg2.prepareImage(this.anImage1, this);
			this.method518();
			arg2.prepareImage(this.anImage1, this);
			this.method516();
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("85190, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method516() {
		try {
			Class1_Sub1_Sub2.method430(this.anIntArray228, this.anInt818, this.anInt817);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("5154, " + -328 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		try {
			this.method518();
			arg2.drawImage(this.anImage1, arg0, arg1, this);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("36829, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -884 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt817, this.anInt818);
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
	private synchronized void method518() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt817, this.anInt818, this.aColorModel1, this.anIntArray228, 0, this.anInt817);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!qb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
