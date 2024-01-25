import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public final class Class309 {

	@OriginalMember(owner = "client!sia", name = "k", descriptor = "[I")
	public final int[] anIntArray568 = new int[4];

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "B")
	public final byte aByte126;

	@OriginalMember(owner = "client!sia", name = "l", descriptor = "[I")
	public final int[] anIntArray569;

	@OriginalMember(owner = "client!sia", name = "d", descriptor = "B")
	public final byte aByte127;

	@OriginalMember(owner = "client!sia", name = "h", descriptor = "[I")
	public final int[] anIntArray567;

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "S")
	public final short aShort120;

	@OriginalMember(owner = "client!sia", name = "g", descriptor = "S")
	public final short aShort121;

	@OriginalMember(owner = "client!sia", name = "j", descriptor = "S")
	public final short aShort122;

	@OriginalMember(owner = "client!sia", name = "m", descriptor = "S")
	public final short aShort123;

	@OriginalMember(owner = "client!sia", name = "n", descriptor = "[S")
	public final short[] aShortArray131;

	@OriginalMember(owner = "client!sia", name = "i", descriptor = "[S")
	public final short[] aShortArray130;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "[S")
	public final short[] aShortArray129;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte126 = (byte) arg0;
		this.anIntArray569 = new int[4];
		this.aByte127 = (byte) arg1;
		this.anIntArray567 = new int[4];
		this.anIntArray568[2] = arg4;
		this.anIntArray568[1] = arg3;
		this.anIntArray568[3] = arg5;
		this.anIntArray568[0] = arg2;
		this.anIntArray569[3] = arg9;
		this.anIntArray569[0] = arg6;
		this.anIntArray569[1] = arg7;
		this.anIntArray569[2] = arg8;
		this.aShort120 = (short) (arg2 >> Static308.anInt5834);
		this.anIntArray567[1] = arg11;
		this.anIntArray567[2] = arg12;
		this.anIntArray567[0] = arg10;
		this.anIntArray567[3] = arg13;
		this.aShort121 = (short) (arg4 >> Static308.anInt5834);
		this.aShort122 = (short) (arg10 >> Static308.anInt5834);
		this.aShort123 = (short) (arg12 >> Static308.anInt5834);
		this.aShortArray131 = new short[4];
		this.aShortArray130 = new short[4];
		this.aShortArray129 = new short[4];
	}
}
