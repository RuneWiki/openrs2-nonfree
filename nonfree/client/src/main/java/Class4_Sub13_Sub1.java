import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class4_Sub13_Sub1 extends Class4_Sub13 implements ImageProducer {

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel1;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer1;

	static {
		new Class15("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	@Override
	public void method3733(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		super.anInt4694 = this.aCanvas1.getSize().width;
		super.anInt4695 = this.aCanvas1.getSize().height;
		super.anIntArray380 = new int[super.anInt4695 * super.anInt4694];
		this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
		this.anImage1 = this.aCanvas1.createImage(this);
		this.method1633();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method1633();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
		this.method1633();
		this.aCanvas1.prepareImage(this.anImage1, this.aCanvas1);
	}

	@OriginalMember(owner = "client!fi", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)V")
	private synchronized void method1633() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, super.anInt4694, super.anInt4695, this.aColorModel1, super.anIntArray380, 0, super.anInt4694);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V")
	private synchronized void method1634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(arg2, arg0, arg1, arg3, this.aColorModel1, super.anIntArray380, arg2 + arg0 * super.anInt4694, super.anInt4694);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method3735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1634(arg1, arg3, arg0, arg4);
		@Pc(13) Shape local13 = arg2.getClip();
		arg2.clipRect(arg0, arg1, arg3, arg4);
		arg2.drawImage(this.anImage1, 0, 0, this.aCanvas1);
		arg2.setClip(local13);
	}

	@OriginalMember(owner = "client!fi", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(super.anInt4694, super.anInt4695);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method3731(@OriginalArg(1) Graphics arg0) {
		this.method1633();
		arg0.drawImage(this.anImage1, 0, 0, this.aCanvas1);
	}

	@OriginalMember(owner = "client!fi", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
