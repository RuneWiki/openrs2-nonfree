import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class51 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	protected int anInt2674 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	protected int anInt2672 = 0;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "[F")
	protected final float[] aFloatArray8 = new float[5000];

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	protected volatile int anInt2676 = 0;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	protected volatile int anInt2673 = 0;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray4 = new Object[5000];

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "[B")
	protected final byte[] aByteArray46 = new byte[5000];

	static {
		new Class221("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ui;I)V")
	public abstract void method2508(@OriginalArg(0) Class227 arg0);

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	public abstract void method2510();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	public abstract void method2511(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIFLclient!dh;Z)V")
	public abstract void method2512(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ui;B)V")
	public abstract void method2513(@OriginalArg(0) Class227 arg0);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!ui;)V")
	public abstract void method2514(@OriginalArg(1) Class227 arg0);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
	public abstract void method2515();

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)V")
	public abstract void method2516(@OriginalArg(1) int arg0);
}
