import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
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

@OriginalClass("client!wa")
public final class Class62_Sub2 extends Class62 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!wa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3025, super.anInt3026);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	private synchronized void method1995() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3025, super.anInt3026, this.aColorModel1, super.anIntArray402, 0, super.anInt3025);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!wa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!wa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!wa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method1992(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1998(arg3, arg1, arg4, arg2);
		@Pc(19) Shape local19 = arg0.getClip();
		arg0.clipRect(arg4, arg1, arg2, arg3);
		arg0.drawImage(super.anImage4, 0, 0, this);
		arg0.setClip(local19);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
	@Override
	public void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		super.anInt3025 = arg0;
		super.anIntArray402 = new int[arg0 * arg2 + 1];
		super.anInt3026 = arg2;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg1.createImage(this);
		this.method1995();
		arg1.prepareImage(super.anImage4, this);
		this.method1995();
		arg1.prepareImage(super.anImage4, this);
		this.method1995();
		arg1.prepareImage(super.anImage4, this);
		this.method1989();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1990(@OriginalArg(2) Graphics arg0) {
		this.method1995();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!wa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIIII)V")
	private synchronized void method1998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg1, arg3, arg0, this.aColorModel1, super.anIntArray402, arg2 + super.anInt3025 * arg1, super.anInt3025);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
