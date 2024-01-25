import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class92 {

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "B")
	public final byte aByte38;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "[I")
	public final int[] anIntArray189;

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "[I")
	public final int[] anIntArray187;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "[I")
	public final int[] anIntArray188;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "S")
	public final short aShort27;

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "S")
	public final short aShort28;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "S")
	public final short aShort29;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "[S")
	public final short[] aShortArray31;

	@OriginalMember(owner = "client!fba", name = "m", descriptor = "[S")
	public final short[] aShortArray32;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "[S")
	public final short[] aShortArray30;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte39 = (byte) arg1;
		this.aByte38 = (byte) arg0;
		this.anIntArray189 = new int[4];
		this.anIntArray187 = new int[4];
		this.anIntArray188 = new int[4];
		this.anIntArray188[0] = arg2;
		this.anIntArray188[2] = arg4;
		this.anIntArray188[1] = arg3;
		this.anIntArray188[3] = arg5;
		this.anIntArray189[1] = arg7;
		this.anIntArray189[3] = arg9;
		this.anIntArray189[0] = arg6;
		this.anIntArray189[2] = arg8;
		this.anIntArray187[0] = arg10;
		this.anIntArray187[1] = arg11;
		this.anIntArray187[3] = arg13;
		this.aShort27 = (short) (arg2 >> Static276.anInt5846);
		this.anIntArray187[2] = arg12;
		this.aShort28 = (short) (arg4 >> Static276.anInt5846);
		this.aShort30 = (short) (arg10 >> Static276.anInt5846);
		this.aShort29 = (short) (arg12 >> Static276.anInt5846);
		this.aShortArray31 = new short[4];
		this.aShortArray32 = new short[4];
		this.aShortArray30 = new short[4];
	}
}
