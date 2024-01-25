import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class50 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "B")
	public final byte aByte29;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "[I")
	public final int[] anIntArray86;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "[I")
	public final int[] anIntArray85;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "[I")
	public final int[] anIntArray87;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "B")
	public final byte aByte30;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "S")
	public final short aShort20;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "S")
	public final short aShort21;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "[S")
	public final short[] aShortArray17;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "[S")
	public final short[] aShortArray18;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "[S")
	public final short[] aShortArray19;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte29 = (byte) arg1;
		this.anIntArray86 = new int[4];
		this.anIntArray85 = new int[4];
		this.anIntArray87 = new int[4];
		this.aByte30 = (byte) arg0;
		this.anIntArray85[2] = arg4;
		this.anIntArray85[3] = arg5;
		this.anIntArray85[1] = arg3;
		this.anIntArray85[0] = arg2;
		this.anIntArray86[3] = arg9;
		this.anIntArray86[0] = arg6;
		this.anIntArray86[1] = arg7;
		this.anIntArray86[2] = arg8;
		this.aShort22 = (short) (arg2 >> Static378.anInt6665);
		this.anIntArray87[0] = arg10;
		this.anIntArray87[3] = arg13;
		this.anIntArray87[1] = arg11;
		this.anIntArray87[2] = arg12;
		this.aShort20 = (short) (arg4 >> Static378.anInt6665);
		this.aShort21 = (short) (arg10 >> Static378.anInt6665);
		this.aShortArray17 = new short[4];
		this.aShortArray18 = new short[4];
		this.aShortArray19 = new short[4];
		this.aShort23 = (short) (arg12 >> Static378.anInt6665);
	}
}
