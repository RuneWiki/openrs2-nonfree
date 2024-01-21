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

@OriginalClass("client!g")
public final class Class7_Sub2 extends Class7 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!g", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	@Override
	public void method1186(@OriginalArg(0) Graphics arg0) {
		this.method1188();
		arg0.drawImage(super.anImage3, 0, 0, this);
	}

	@OriginalMember(owner = "client!g", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
	private synchronized void method1188() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt1518, super.anInt1520, this.aColorModel1, super.anIntArray130, 0, super.anInt1518);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		super.anInt1518 = arg2;
		super.anIntArray130 = new int[arg2 * arg0 + 1];
		super.anInt1520 = arg0;
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		super.anImage3 = arg1.createImage(this);
		this.method1188();
		arg1.prepareImage(super.anImage3, this);
		this.method1188();
		arg1.prepareImage(super.anImage3, this);
		this.method1188();
		arg1.prepareImage(super.anImage3, this);
		this.method1185();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method1184(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1191(arg3, arg1, arg4, arg2);
		@Pc(18) Shape local18 = arg0.getClip();
		arg0.clipRect(arg1, arg4, arg3, arg2);
		arg0.drawImage(super.anImage3, 0, 0, this);
		arg0.setClip(local18);
	}

	@OriginalMember(owner = "client!g", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (arg0 == this.anImageConsumer1) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!g", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIII)V")
	private synchronized void method1191(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg1, arg2, arg0, arg3, this.aColorModel1, super.anIntArray130, super.anInt1518 * arg2 + arg1, super.anInt1518);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!g", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.anImageConsumer1;
	}

	@OriginalMember(owner = "client!g", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt1518, super.anInt1520);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!g", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
