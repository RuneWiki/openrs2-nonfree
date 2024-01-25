import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class308 {

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "B")
	public final byte aByte106;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "B")
	public final byte aByte107;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "[I")
	public final int[] anIntArray506;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "[I")
	public final int[] anIntArray505;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
	public final int[] anIntArray504;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "S")
	public final short aShort131;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "S")
	public final short aShort134;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "S")
	public final short aShort132;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[S")
	public final short[] aShortArray127;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "S")
	public final short aShort133;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "[S")
	public final short[] aShortArray126;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "[S")
	public final short[] aShortArray128;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte106 = (byte) arg1;
		this.aByte107 = (byte) arg0;
		this.anIntArray506 = new int[4];
		this.anIntArray505 = new int[4];
		this.anIntArray504 = new int[4];
		this.anIntArray506[2] = arg4;
		this.anIntArray506[3] = arg5;
		this.anIntArray506[0] = arg2;
		this.anIntArray506[1] = arg3;
		this.anIntArray505[3] = arg9;
		this.anIntArray505[2] = arg8;
		this.anIntArray505[0] = arg6;
		this.anIntArray505[1] = arg7;
		this.aShort131 = (short) (arg2 >> Static315.anInt5369);
		this.anIntArray504[0] = arg10;
		this.anIntArray504[2] = arg12;
		this.anIntArray504[1] = arg11;
		this.anIntArray504[3] = arg13;
		this.aShort134 = (short) (arg4 >> Static315.anInt5369);
		this.aShort132 = (short) (arg10 >> Static315.anInt5369);
		this.aShortArray127 = new short[4];
		this.aShort133 = (short) (arg12 >> Static315.anInt5369);
		this.aShortArray126 = new short[4];
		this.aShortArray128 = new short[4];
	}
}
