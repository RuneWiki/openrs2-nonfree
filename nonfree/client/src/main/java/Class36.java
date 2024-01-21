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

@OriginalClass("client!TWKZMYGD")
public final class Class36 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!TWKZMYGD", name = "g", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!TWKZMYGD", name = "a", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!TWKZMYGD", name = "b", descriptor = "I")
	private int anInt666 = 341;

	@OriginalMember(owner = "client!TWKZMYGD", name = "d", descriptor = "I")
	private int anInt667;

	@OriginalMember(owner = "client!TWKZMYGD", name = "e", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!TWKZMYGD", name = "c", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!TWKZMYGD", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!TWKZMYGD", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!TWKZMYGD", name = "<init>", descriptor = "(IIBLjava/awt/Component;)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Component arg3) {
		try {
			this.anInt667 = arg1;
			this.anInt668 = arg0;
			this.anIntArray145 = new int[arg1 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg3.createImage(this);
			this.method505();
			arg3.prepareImage(this.anImage1, this);
			this.method505();
			arg3.prepareImage(this.anImage1, this);
			this.method505();
			arg3.prepareImage(this.anImage1, this);
			this.method503();
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("53675, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TWKZMYGD", name = "a", descriptor = "(Z)V")
	public void method503() {
		try {
			Class1_Sub1_Sub2.method400(this.anInt667, this.anIntArray145, this.anInt668);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("12860, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TWKZMYGD", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
	public void method504(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3) {
		try {
			@Pc(6) boolean local6 = false;
			this.method505();
			arg3.drawImage(this.anImage1, arg2, arg1, this);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("22708, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TWKZMYGD", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt667, this.anInt668);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!TWKZMYGD", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!TWKZMYGD", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!TWKZMYGD", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!TWKZMYGD", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "client!TWKZMYGD", name = "a", descriptor = "()V")
	private synchronized void method505() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt667, this.anInt668, this.aColorModel1, this.anIntArray145, 0, this.anInt667);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!TWKZMYGD", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
