import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class337 {

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "B")
	public final byte aByte140;

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "[I")
	public final int[] anIntArray547;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "[I")
	public final int[] anIntArray546;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "B")
	public final byte aByte139;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "[I")
	public final int[] anIntArray545;

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "S")
	public final short aShort112;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "S")
	public final short aShort111;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "S")
	public final short aShort114;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "[S")
	public final short[] aShortArray127;

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "S")
	public final short aShort113;

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "[S")
	public final short[] aShortArray125;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "[S")
	public final short[] aShortArray126;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte140 = (byte) arg0;
		this.anIntArray547 = new int[4];
		this.anIntArray546 = new int[4];
		this.aByte139 = (byte) arg1;
		this.anIntArray545 = new int[4];
		this.anIntArray546[1] = arg3;
		this.anIntArray546[3] = arg5;
		this.anIntArray546[2] = arg4;
		this.anIntArray546[0] = arg2;
		this.anIntArray547[3] = arg9;
		this.anIntArray547[0] = arg6;
		this.anIntArray547[1] = arg7;
		this.anIntArray547[2] = arg8;
		this.anIntArray545[3] = arg13;
		this.aShort112 = (short) (arg2 >> Static611.anInt10115);
		this.anIntArray545[0] = arg10;
		this.anIntArray545[2] = arg12;
		this.anIntArray545[1] = arg11;
		this.aShort111 = (short) (arg4 >> Static611.anInt10115);
		this.aShort114 = (short) (arg10 >> Static611.anInt10115);
		this.aShortArray127 = new short[4];
		this.aShort113 = (short) (arg12 >> Static611.anInt10115);
		this.aShortArray125 = new short[4];
		this.aShortArray126 = new short[4];
	}
}
