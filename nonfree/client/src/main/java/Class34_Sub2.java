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

@OriginalClass("client!lf")
public final class Class34_Sub2 extends Class34 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZIII)V")
	private synchronized void method1640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg3, arg0, this.aColorModel1, super.anIntArray240, super.anInt2138 * arg2 + arg1, super.anInt2138);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!lf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!lf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1633(@OriginalArg(2) Graphics arg0) {
		this.method1645();
		arg0.drawImage(super.anImage21, 0, 0, this);
	}

	@OriginalMember(owner = "client!lf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt2138, super.anInt2142);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method1637(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1640(arg3, arg4, arg2, arg1);
		@Pc(13) Shape local13 = arg0.getClip();
		arg0.clipRect(arg4, arg2, arg1, arg3);
		arg0.drawImage(super.anImage21, 0, 0, this);
		arg0.setClip(local13);
	}

	@OriginalMember(owner = "client!lf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method1632(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		super.anInt2142 = arg2;
		super.anIntArray240 = new int[arg0 * arg2 + 1];
		super.anInt2138 = arg0;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage21 = arg1.createImage(this);
		this.method1645();
		arg1.prepareImage(super.anImage21, this);
		this.method1645();
		arg1.prepareImage(super.anImage21, this);
		this.method1645();
		arg1.prepareImage(super.anImage21, this);
		this.method1636();
	}

	@OriginalMember(owner = "client!lf", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	private synchronized void method1645() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt2138, super.anInt2142, this.aColorModel1, super.anIntArray240, 0, super.anInt2138);
			this.anImageConsumer1.imageComplete(2);
		}
	}
}
