import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.io.File;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class1_Sub11_Sub2 extends Class1_Sub11 implements ImageProducer {

	@OriginalMember(owner = "client!wf", name = "I", descriptor = "Ljava/lang/String;")
	public static final String aString104;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString103;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString104 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString103 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		local1.toLowerCase();
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!wf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)V")
	private synchronized void method7780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg0, arg3, arg2, arg1, this.aColorModel1, super.anIntArray602, arg0 + super.anInt9558 * arg3, super.anInt9558);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!wf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!wf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7780(arg3, arg4, arg1, arg0);
		@Pc(13) Shape local13 = arg2.getClip();
		arg2.clipRect(arg3, arg0, arg1, arg4);
		arg2.drawImage(this.anImage13, 0, 0, this.aCanvas13);
		arg2.setClip(local13);
	}

	@OriginalMember(owner = "client!wf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt9558, super.anInt9561);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
	@Override
	public void method7779(@OriginalArg(0) Graphics arg0) {
		this.method7782();
		arg0.drawImage(this.anImage13, 0, 0, this.aCanvas13);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	private synchronized void method7782() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt9558, super.anInt9561, this.aColorModel1, super.anIntArray602, 0, super.anInt9558);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!wf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	@Override
	public void method7777(@OriginalArg(1) Canvas arg0) {
		this.aCanvas13 = arg0;
		super.anInt9558 = this.aCanvas13.getSize().width;
		super.anInt9561 = this.aCanvas13.getSize().height;
		super.anIntArray602 = new int[super.anInt9558 * super.anInt9561];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage13 = this.aCanvas13.createImage(this);
		this.method7782();
		this.aCanvas13.prepareImage(this.anImage13, this.aCanvas13);
		this.method7782();
		this.aCanvas13.prepareImage(this.anImage13, this.aCanvas13);
		this.method7782();
		this.aCanvas13.prepareImage(this.anImage13, this.aCanvas13);
	}
}
