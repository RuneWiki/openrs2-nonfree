import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public final class Class153 {

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "[I")
	public final int[] anIntArray248 = new int[4];

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "B")
	public final byte aByte60;

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "[I")
	public final int[] anIntArray249;

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "[I")
	public final int[] anIntArray247;

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "[S")
	public final short[] aShortArray45;

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "[S")
	public final short[] aShortArray46;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "[S")
	public final short[] aShortArray44;

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte61 = (byte) arg0;
		this.aByte60 = (byte) arg1;
		this.anIntArray249 = new int[4];
		this.anIntArray247 = new int[4];
		this.anIntArray248[3] = arg5;
		this.anIntArray248[1] = arg3;
		this.anIntArray248[2] = arg4;
		this.anIntArray248[0] = arg2;
		this.anIntArray249[0] = arg6;
		this.anIntArray249[3] = arg9;
		this.anIntArray249[1] = arg7;
		this.anIntArray249[2] = arg8;
		this.anIntArray247[2] = arg12;
		this.anIntArray247[0] = arg10;
		this.anIntArray247[3] = arg13;
		this.aShort50 = (short) (arg2 >> Static485.anInt8241);
		this.anIntArray247[1] = arg11;
		this.aShort51 = (short) (arg4 >> Static485.anInt8241);
		this.aShort53 = (short) (arg10 >> Static485.anInt8241);
		this.aShortArray45 = new short[4];
		this.aShortArray46 = new short[4];
		this.aShortArray44 = new short[4];
		this.aShort52 = (short) (arg12 >> Static485.anInt8241);
	}
}
