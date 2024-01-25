import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class372 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "B")
	public final byte aByte128;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "[I")
	public final int[] anIntArray618;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "[I")
	public final int[] anIntArray619;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
	public final int[] anIntArray617;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "B")
	public final byte aByte129;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "S")
	public final short aShort125;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "S")
	public final short aShort124;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "S")
	public final short aShort123;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[S")
	public final short[] aShortArray149;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "[S")
	public final short[] aShortArray150;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "[S")
	public final short[] aShortArray151;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "S")
	public final short aShort122;

	static {
		new Class165("", 73);
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte128 = (byte) arg1;
		this.anIntArray618 = new int[4];
		this.anIntArray619 = new int[4];
		this.anIntArray617 = new int[4];
		this.aByte129 = (byte) arg0;
		this.anIntArray618[1] = arg3;
		this.anIntArray618[3] = arg5;
		this.anIntArray618[2] = arg4;
		this.anIntArray618[0] = arg2;
		this.anIntArray617[1] = arg7;
		this.anIntArray617[0] = arg6;
		this.anIntArray617[2] = arg8;
		this.anIntArray617[3] = arg9;
		this.aShort125 = (short) (arg2 >> Static172.anInt4156);
		this.anIntArray619[2] = arg12;
		this.anIntArray619[0] = arg10;
		this.anIntArray619[3] = arg13;
		this.anIntArray619[1] = arg11;
		this.aShort124 = (short) (arg4 >> Static172.anInt4156);
		this.aShort123 = (short) (arg10 >> Static172.anInt4156);
		this.aShortArray149 = new short[4];
		this.aShortArray150 = new short[4];
		this.aShortArray151 = new short[4];
		this.aShort122 = (short) (arg12 >> Static172.anInt4156);
	}
}
