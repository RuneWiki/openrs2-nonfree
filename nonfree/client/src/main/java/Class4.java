import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public final class Class4 {

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "[I")
	public final int[] anIntArray5;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "[I")
	public final int[] anIntArray3;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "B")
	public final byte aByte3;

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "[I")
	public final int[] anIntArray4;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "S")
	public final short aShort1;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "S")
	public final short aShort2;

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "[S")
	public final short[] aShortArray3;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "[S")
	public final short[] aShortArray2;

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "[S")
	public final short[] aShortArray1;

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "S")
	public final short aShort4;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte2 = (byte) arg0;
		this.anIntArray5 = new int[4];
		this.anIntArray3 = new int[4];
		this.aByte3 = (byte) arg1;
		this.anIntArray4 = new int[4];
		this.anIntArray5[1] = arg3;
		this.anIntArray5[2] = arg4;
		this.anIntArray5[0] = arg2;
		this.anIntArray5[3] = arg5;
		this.anIntArray4[1] = arg7;
		this.anIntArray4[3] = arg9;
		this.anIntArray4[0] = arg6;
		this.anIntArray4[2] = arg8;
		this.anIntArray3[0] = arg10;
		this.anIntArray3[2] = arg12;
		this.aShort1 = (short) (arg2 >> Static162.anInt2830);
		this.anIntArray3[3] = arg13;
		this.anIntArray3[1] = arg11;
		this.aShort2 = (short) (arg4 >> Static162.anInt2830);
		this.aShort3 = (short) (arg10 >> Static162.anInt2830);
		this.aShortArray3 = new short[4];
		this.aShortArray2 = new short[4];
		this.aShortArray1 = new short[4];
		this.aShort4 = (short) (arg12 >> Static162.anInt2830);
	}
}
