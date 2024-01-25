import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class296 {

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "[I")
	public final int[] anIntArray657 = new int[4];

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "B")
	public final byte aByte130;

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "B")
	public final byte aByte131;

	@OriginalMember(owner = "client!rca", name = "m", descriptor = "[I")
	public final int[] anIntArray659;

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "[I")
	public final int[] anIntArray658;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "S")
	public final short aShort91;

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "S")
	public final short aShort93;

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "S")
	public final short aShort92;

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "[S")
	public final short[] aShortArray133;

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "[S")
	public final short[] aShortArray134;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "[S")
	public final short[] aShortArray135;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte130 = (byte) arg0;
		this.aByte131 = (byte) arg1;
		this.anIntArray659 = new int[4];
		this.anIntArray658 = new int[4];
		this.anIntArray658[3] = arg5;
		this.anIntArray658[1] = arg3;
		this.anIntArray658[0] = arg2;
		this.anIntArray658[2] = arg4;
		this.anIntArray657[3] = arg9;
		this.anIntArray657[0] = arg6;
		this.anIntArray657[1] = arg7;
		this.anIntArray657[2] = arg8;
		this.aShort91 = (short) (arg2 >> Static579.anInt9935);
		this.anIntArray659[3] = arg13;
		this.anIntArray659[0] = arg10;
		this.anIntArray659[1] = arg11;
		this.anIntArray659[2] = arg12;
		this.aShort93 = (short) (arg4 >> Static579.anInt9935);
		this.aShort92 = (short) (arg10 >> Static579.anInt9935);
		this.aShortArray133 = new short[4];
		this.aShortArray134 = new short[4];
		this.aShort90 = (short) (arg12 >> Static579.anInt9935);
		this.aShortArray135 = new short[4];
	}
}
