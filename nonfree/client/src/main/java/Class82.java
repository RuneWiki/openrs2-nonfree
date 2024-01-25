import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class82 {

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
	public final int[] anIntArray149 = new int[4];

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
	public final int[] anIntArray151 = new int[4];

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "B")
	public final byte aByte38;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
	public final int[] anIntArray150;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "S")
	public final short aShort21;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "S")
	public final short aShort20;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[S")
	public final short[] aShortArray32;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "[S")
	public final short[] aShortArray31;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "[S")
	public final short[] aShortArray33;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte39 = (byte) arg0;
		this.aByte38 = (byte) arg1;
		this.anIntArray150 = new int[4];
		this.anIntArray150[0] = arg2;
		this.anIntArray150[1] = arg3;
		this.anIntArray150[3] = arg5;
		this.anIntArray150[2] = arg4;
		this.anIntArray151[0] = arg6;
		this.anIntArray151[2] = arg8;
		this.anIntArray151[3] = arg9;
		this.anIntArray151[1] = arg7;
		this.anIntArray149[1] = arg11;
		this.aShort21 = (short) (arg2 >> Static151.anInt3896);
		this.anIntArray149[3] = arg13;
		this.anIntArray149[0] = arg10;
		this.anIntArray149[2] = arg12;
		this.aShort20 = (short) (arg4 >> Static151.anInt3896);
		this.aShort23 = (short) (arg10 >> Static151.anInt3896);
		this.aShort22 = (short) (arg12 >> Static151.anInt3896);
		this.aShortArray32 = new short[4];
		this.aShortArray31 = new short[4];
		this.aShortArray33 = new short[4];
	}
}
