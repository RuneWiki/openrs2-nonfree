import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class252 {

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "[I")
	public final int[] anIntArray472 = new int[4];

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "[I")
	public final int[] anIntArray473 = new int[4];

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "B")
	public final byte aByte84;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
	public final int[] anIntArray474;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "S")
	public final short aShort88;

	@OriginalMember(owner = "client!mv", name = "n", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "S")
	public final short aShort89;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "[S")
	public final short[] aShortArray114;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "[S")
	public final short[] aShortArray112;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "[S")
	public final short[] aShortArray113;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte84 = (byte) arg0;
		this.aByte85 = (byte) arg1;
		this.anIntArray474 = new int[4];
		this.anIntArray474[1] = arg3;
		this.anIntArray474[0] = arg2;
		this.anIntArray474[2] = arg4;
		this.anIntArray474[3] = arg5;
		this.anIntArray473[1] = arg7;
		this.anIntArray473[3] = arg9;
		this.anIntArray473[0] = arg6;
		this.anIntArray473[2] = arg8;
		this.anIntArray472[2] = arg12;
		this.anIntArray472[1] = arg11;
		this.aShort88 = (short) (arg2 >> Static260.anInt4053);
		this.anIntArray472[0] = arg10;
		this.anIntArray472[3] = arg13;
		this.aShort87 = (short) (arg4 >> Static260.anInt4053);
		this.aShort89 = (short) (arg10 >> Static260.anInt4053);
		this.aShortArray114 = new short[4];
		this.aShortArray112 = new short[4];
		this.aShort90 = (short) (arg12 >> Static260.anInt4053);
		this.aShortArray113 = new short[4];
	}
}
