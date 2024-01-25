import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class314 {

	@OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
	public final int[] anIntArray486 = new int[4];

	@OriginalMember(owner = "client!te", name = "k", descriptor = "[I")
	public final int[] anIntArray487 = new int[4];

	@OriginalMember(owner = "client!te", name = "r", descriptor = "B")
	public final byte aByte114;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "[I")
	public final int[] anIntArray488;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "B")
	public final byte aByte113;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "S")
	public final short aShort103;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "[S")
	public final short[] aShortArray120;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "[S")
	public final short[] aShortArray121;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "[S")
	public final short[] aShortArray122;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte114 = (byte) arg1;
		this.anIntArray488 = new int[4];
		this.aByte113 = (byte) arg0;
		this.anIntArray487[0] = arg2;
		this.anIntArray487[3] = arg5;
		this.anIntArray487[2] = arg4;
		this.anIntArray487[1] = arg3;
		this.anIntArray486[1] = arg7;
		this.anIntArray486[3] = arg9;
		this.anIntArray486[2] = arg8;
		this.anIntArray486[0] = arg6;
		this.aShort106 = (short) (arg2 >> Static145.anInt3093);
		this.anIntArray488[0] = arg10;
		this.anIntArray488[3] = arg13;
		this.anIntArray488[2] = arg12;
		this.anIntArray488[1] = arg11;
		this.aShort103 = (short) (arg4 >> Static145.anInt3093);
		this.aShort105 = (short) (arg10 >> Static145.anInt3093);
		this.aShortArray120 = new short[4];
		this.aShort104 = (short) (arg12 >> Static145.anInt3093);
		this.aShortArray121 = new short[4];
		this.aShortArray122 = new short[4];
	}
}
