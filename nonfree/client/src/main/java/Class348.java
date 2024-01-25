import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class348 {

	@OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
	public final int[] anIntArray507 = new int[4];

	@OriginalMember(owner = "client!th", name = "l", descriptor = "B")
	public final byte aByte132;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "B")
	public final byte aByte133;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
	public final int[] anIntArray508;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "[I")
	public final int[] anIntArray506;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "S")
	public final short aShort114;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "S")
	public final short aShort115;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "S")
	public final short aShort116;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[S")
	public final short[] aShortArray149;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "[S")
	public final short[] aShortArray148;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "S")
	public final short aShort113;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "[S")
	public final short[] aShortArray147;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte132 = (byte) arg0;
		this.aByte133 = (byte) arg1;
		this.anIntArray508 = new int[4];
		this.anIntArray506 = new int[4];
		this.anIntArray508[0] = arg2;
		this.anIntArray508[1] = arg3;
		this.anIntArray508[2] = arg4;
		this.anIntArray508[3] = arg5;
		this.anIntArray506[2] = arg8;
		this.anIntArray506[3] = arg9;
		this.anIntArray506[1] = arg7;
		this.anIntArray506[0] = arg6;
		this.anIntArray507[0] = arg10;
		this.anIntArray507[1] = arg11;
		this.aShort114 = (short) (arg2 >> Static170.anInt3602);
		this.anIntArray507[3] = arg13;
		this.anIntArray507[2] = arg12;
		this.aShort115 = (short) (arg4 >> Static170.anInt3602);
		this.aShort116 = (short) (arg10 >> Static170.anInt3602);
		this.aShortArray149 = new short[4];
		this.aShortArray148 = new short[4];
		this.aShort113 = (short) (arg12 >> Static170.anInt3602);
		this.aShortArray147 = new short[4];
	}
}
