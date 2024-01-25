import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class60 {

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "[I")
	public final int[] anIntArray122 = new int[4];

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "B")
	public final byte aByte26;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "[I")
	public final int[] anIntArray121;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "[I")
	public final int[] anIntArray123;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "B")
	public final byte aByte27;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "S")
	public final short aShort15;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "S")
	public final short aShort14;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "S")
	public final short aShort13;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "[S")
	public final short[] aShortArray24;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "[S")
	public final short[] aShortArray26;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "[S")
	public final short[] aShortArray25;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte26 = (byte) arg0;
		this.anIntArray121 = new int[4];
		this.anIntArray123 = new int[4];
		this.aByte27 = (byte) arg1;
		this.anIntArray122[3] = arg5;
		this.anIntArray122[2] = arg4;
		this.anIntArray122[1] = arg3;
		this.anIntArray122[0] = arg2;
		this.anIntArray123[0] = arg6;
		this.anIntArray123[2] = arg8;
		this.anIntArray123[3] = arg9;
		this.anIntArray123[1] = arg7;
		this.anIntArray121[2] = arg12;
		this.aShort15 = (short) (arg2 >> Static391.anInt10262);
		this.anIntArray121[1] = arg11;
		this.anIntArray121[3] = arg13;
		this.anIntArray121[0] = arg10;
		this.aShort14 = (short) (arg4 >> Static391.anInt10262);
		this.aShort16 = (short) (arg10 >> Static391.anInt10262);
		this.aShort13 = (short) (arg12 >> Static391.anInt10262);
		this.aShortArray24 = new short[4];
		this.aShortArray26 = new short[4];
		this.aShortArray25 = new short[4];
	}
}
