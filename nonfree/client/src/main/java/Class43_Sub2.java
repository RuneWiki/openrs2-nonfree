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

@OriginalClass("client!vc")
public final class Class43_Sub2 extends Class43 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2198(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2206(arg2, arg0, arg4, arg3);
		@Pc(9) Shape local9 = arg1.getClip();
		arg1.clipRect(arg0, arg3, arg4, arg2);
		arg1.drawImage(super.anImage4, 0, 0, this);
		arg1.setClip(local9);
	}

	@OriginalMember(owner = "client!vc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt3160, super.anInt3162);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!vc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	@Override
	public void method2192(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anIntArray452 = new int[arg1 * arg2 + 1];
		super.anInt3162 = arg2;
		super.anInt3160 = arg1;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage4 = arg0.createImage(this);
		this.method2208();
		arg0.prepareImage(super.anImage4, this);
		this.method2208();
		arg0.prepareImage(super.anImage4, this);
		this.method2208();
		arg0.prepareImage(super.anImage4, this);
		this.method2194();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIBI)V")
	private synchronized void method2206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg3, arg2, arg0, this.aColorModel1, super.anIntArray452, arg1 + arg3 * super.anInt3160, super.anInt3160);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!vc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method2199(@OriginalArg(0) Graphics arg0) {
		this.method2208();
		arg0.drawImage(super.anImage4, 0, 0, this);
	}

	@OriginalMember(owner = "client!vc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	private synchronized void method2208() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt3160, super.anInt3162, this.aColorModel1, super.anIntArray452, 0, super.anInt3160);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!vc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}
}
