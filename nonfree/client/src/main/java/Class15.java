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

@OriginalClass("client!HVBGFDBD")
public final class Class15 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!HVBGFDBD", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!HVBGFDBD", name = "a", descriptor = "I")
	private int anInt179 = 45981;

	@OriginalMember(owner = "client!HVBGFDBD", name = "b", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!HVBGFDBD", name = "d", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!HVBGFDBD", name = "e", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!HVBGFDBD", name = "c", descriptor = "[I")
	public int[] anIntArray43;

	@OriginalMember(owner = "client!HVBGFDBD", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!HVBGFDBD", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!HVBGFDBD", name = "<init>", descriptor = "(Ljava/awt/Component;III)V")
	public Class15(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.anInt180 = arg3;
			this.anInt181 = arg1;
			this.anIntArray43 = new int[arg3 * arg1];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg0.createImage(this);
			this.method123();
			arg0.prepareImage(this.anImage1, this);
			this.method123();
			if (arg2 != this.anInt179) {
				this.aBoolean57 = !this.aBoolean57;
			}
			arg0.prepareImage(this.anImage1, this);
			this.method123();
			arg0.prepareImage(this.anImage1, this);
			this.method121();
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("39254, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HVBGFDBD", name = "a", descriptor = "(I)V")
	public void method121() {
		try {
			Class6_Sub1_Sub1.method550(this.anIntArray43, this.anInt180, this.anInt181);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("39951, " + -5281 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HVBGFDBD", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method122(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.method123();
			arg0.drawImage(this.anImage1, arg3, arg2, this);
			@Pc(13) boolean local13 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("63659, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HVBGFDBD", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt180, this.anInt181);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!HVBGFDBD", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!HVBGFDBD", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!HVBGFDBD", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!HVBGFDBD", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!HVBGFDBD", name = "a", descriptor = "()V")
	private synchronized void method123() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt180, this.anInt181, this.aColorModel1, this.anIntArray43, 0, this.anInt180);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!HVBGFDBD", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
