import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class Class137 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	protected int anInt5409 = 0;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray34 = new Object[5000];

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	protected int anInt5410 = 0;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "[B")
	protected final byte[] aByteArray79 = new byte[5000];

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	protected volatile int anInt5412 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	protected volatile int anInt5408 = 0;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "[F")
	protected final float[] aFloatArray25 = new float[5000];

	static {
		new Class57("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IFLclient!pl;ZI)V")
	public abstract void method4816(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ct;I)V")
	public abstract void method4818(@OriginalArg(0) Class48 arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)V")
	public abstract void method4819(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public abstract void method4820();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public abstract void method4821();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLclient!ct;)V")
	public abstract void method4822(@OriginalArg(1) Class48 arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!ct;)V")
	public abstract void method4823(@OriginalArg(1) Class48 arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method4825(@OriginalArg(1) int arg0);
}
