import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class148 {

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "[I")
	public final int[] anIntArray251 = new int[4];

	@OriginalMember(owner = "client!hv", name = "h", descriptor = "B")
	public final byte aByte50;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "[I")
	public final int[] anIntArray250;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "[I")
	public final int[] anIntArray252;

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "B")
	public final byte aByte51;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "S")
	public final short aShort40;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "S")
	public final short aShort38;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "[S")
	public final short[] aShortArray58;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "[S")
	public final short[] aShortArray59;

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "[S")
	public final short[] aShortArray60;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte50 = (byte) arg0;
		this.anIntArray250 = new int[4];
		this.anIntArray252 = new int[4];
		this.aByte51 = (byte) arg1;
		this.anIntArray252[0] = arg2;
		this.anIntArray252[1] = arg3;
		this.anIntArray252[2] = arg4;
		this.anIntArray252[3] = arg5;
		this.anIntArray250[0] = arg6;
		this.anIntArray250[3] = arg9;
		this.anIntArray250[2] = arg8;
		this.anIntArray250[1] = arg7;
		this.anIntArray251[1] = arg11;
		this.anIntArray251[0] = arg10;
		this.aShort40 = (short) (arg2 >> Static134.anInt2822);
		this.anIntArray251[2] = arg12;
		this.anIntArray251[3] = arg13;
		this.aShort41 = (short) (arg4 >> Static134.anInt2822);
		this.aShort38 = (short) (arg10 >> Static134.anInt2822);
		this.aShort39 = (short) (arg12 >> Static134.anInt2822);
		this.aShortArray58 = new short[4];
		this.aShortArray59 = new short[4];
		this.aShortArray60 = new short[4];
	}
}
