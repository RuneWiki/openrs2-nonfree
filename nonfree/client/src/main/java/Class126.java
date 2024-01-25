import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class Class126 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	protected int anInt8917 = 0;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	protected int anInt8918 = 0;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "[F")
	protected final float[] aFloatArray69 = new float[5000];

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	protected volatile int anInt8915 = 0;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	protected volatile int anInt8919 = 0;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "[Ljava/lang/Object;")
	protected final Object[] anObjectArray36 = new Object[5000];

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "[B")
	protected final byte[] aByteArray112 = new byte[5000];

	static {
		new Class88("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(FIILclient!sa;Z)V")
	public abstract void method7339(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class215 arg2, @OriginalArg(4) boolean arg3);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public abstract void method7340(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public abstract void method7341();

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public abstract void method7342();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!bo;)V")
	public abstract void method7343(@OriginalArg(1) Class37 arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZLclient!bo;)V")
	public abstract void method7344(@OriginalArg(1) Class37 arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
	public abstract void method7345(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!bo;Z)V")
	public abstract void method7347(@OriginalArg(0) Class37 arg0);
}
