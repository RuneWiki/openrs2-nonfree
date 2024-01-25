import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class292 {

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "B")
	public final byte aByte107;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "B")
	public final byte aByte106;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
	public final int[] anIntArray508;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
	public final int[] anIntArray507;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "[I")
	public final int[] anIntArray506;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "S")
	public final short aShort103;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "[S")
	public final short[] aShortArray95;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "S")
	public final short aShort101;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "[S")
	public final short[] aShortArray96;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "[S")
	public final short[] aShortArray97;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte107 = (byte) arg0;
		this.aByte106 = (byte) arg1;
		this.anIntArray508 = new int[4];
		this.anIntArray507 = new int[4];
		this.anIntArray506 = new int[4];
		this.anIntArray507[1] = arg3;
		this.anIntArray507[3] = arg5;
		this.anIntArray507[0] = arg2;
		this.anIntArray507[2] = arg4;
		this.anIntArray508[0] = arg6;
		this.anIntArray508[1] = arg7;
		this.anIntArray508[2] = arg8;
		this.anIntArray508[3] = arg9;
		this.aShort102 = (short) (arg2 >> Static273.anInt4424);
		this.anIntArray506[1] = arg11;
		this.anIntArray506[0] = arg10;
		this.anIntArray506[2] = arg12;
		this.anIntArray506[3] = arg13;
		this.aShort103 = (short) (arg4 >> Static273.anInt4424);
		this.aShort104 = (short) (arg10 >> Static273.anInt4424);
		this.aShortArray95 = new short[4];
		this.aShort101 = (short) (arg12 >> Static273.anInt4424);
		this.aShortArray96 = new short[4];
		this.aShortArray97 = new short[4];
	}
}
