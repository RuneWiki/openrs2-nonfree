import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class342 {

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
	public final int[] anIntArray704 = new int[4];

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "B")
	public final byte aByte122;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "[I")
	public final int[] anIntArray706;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
	public final int[] anIntArray705;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "B")
	public final byte aByte121;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "S")
	public final short aShort127;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "S")
	public final short aShort126;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "S")
	public final short aShort129;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "[S")
	public final short[] aShortArray143;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[S")
	public final short[] aShortArray144;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "[S")
	public final short[] aShortArray145;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "S")
	public final short aShort128;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte122 = (byte) arg0;
		this.anIntArray706 = new int[4];
		this.anIntArray705 = new int[4];
		this.aByte121 = (byte) arg1;
		this.anIntArray706[0] = arg2;
		this.anIntArray706[1] = arg3;
		this.anIntArray706[3] = arg5;
		this.anIntArray706[2] = arg4;
		this.anIntArray704[1] = arg7;
		this.anIntArray704[3] = arg9;
		this.anIntArray704[2] = arg8;
		this.anIntArray704[0] = arg6;
		this.anIntArray705[1] = arg11;
		this.aShort127 = (short) (arg2 >> Static351.anInt5832);
		this.anIntArray705[0] = arg10;
		this.anIntArray705[2] = arg12;
		this.anIntArray705[3] = arg13;
		this.aShort126 = (short) (arg4 >> Static351.anInt5832);
		this.aShort129 = (short) (arg10 >> Static351.anInt5832);
		this.aShortArray143 = new short[4];
		this.aShortArray144 = new short[4];
		this.aShortArray145 = new short[4];
		this.aShort128 = (short) (arg12 >> Static351.anInt5832);
	}
}
