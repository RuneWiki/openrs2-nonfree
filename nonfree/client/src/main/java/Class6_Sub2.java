import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
	public int anInt6065;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "B")
	public byte aByte86;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	public int anInt6061;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
	public int anInt6062;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
	public int anInt6067;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "S")
	public short aShort85;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Z")
	public final boolean aBoolean419;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "S")
	public short aShort84;

	static {
		new Class242("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aByte86 = (byte) arg0;
		this.aShort83 = (short) arg7;
		this.aShort82 = (short) arg4;
		this.anInt6061 = arg3;
		this.anInt6062 = arg1;
		this.anInt6067 = arg2;
		this.aByte85 = arg9;
		this.aShort85 = (short) arg6;
		this.aBoolean419 = arg8;
		this.aShort84 = (short) arg5;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V")
	public void method4749() {
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)I")
	public abstract int method4752();
}
