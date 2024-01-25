import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public final class Class38 {

	@OriginalMember(owner = "client!bha", name = "c", descriptor = "[I")
	public final int[] anIntArray31 = new int[4];

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "[I")
	public final int[] anIntArray32 = new int[4];

	@OriginalMember(owner = "client!bha", name = "m", descriptor = "[I")
	public final int[] anIntArray33 = new int[4];

	@OriginalMember(owner = "client!bha", name = "i", descriptor = "B")
	public final byte aByte9;

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "B")
	public final byte aByte8;

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "S")
	public final short aShort4;

	@OriginalMember(owner = "client!bha", name = "h", descriptor = "S")
	public final short aShort5;

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "S")
	public final short aShort2;

	@OriginalMember(owner = "client!bha", name = "l", descriptor = "[S")
	public final short[] aShortArray4;

	@OriginalMember(owner = "client!bha", name = "r", descriptor = "[S")
	public final short[] aShortArray6;

	@OriginalMember(owner = "client!bha", name = "p", descriptor = "[S")
	public final short[] aShortArray5;

	@OriginalMember(owner = "client!bha", name = "d", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte9 = (byte) arg0;
		this.aByte8 = (byte) arg1;
		this.anIntArray32[3] = arg5;
		this.anIntArray32[1] = arg3;
		this.anIntArray32[0] = arg2;
		this.anIntArray32[2] = arg4;
		this.anIntArray31[3] = arg9;
		this.anIntArray31[2] = arg8;
		this.anIntArray31[1] = arg7;
		this.anIntArray31[0] = arg6;
		this.anIntArray33[3] = arg13;
		this.anIntArray33[2] = arg12;
		this.anIntArray33[0] = arg10;
		this.anIntArray33[1] = arg11;
		this.aShort4 = (short) (arg2 >> Static588.anInt9672);
		this.aShort5 = (short) (arg4 >> Static588.anInt9672);
		this.aShort2 = (short) (arg10 >> Static588.anInt9672);
		this.aShortArray4 = new short[4];
		this.aShortArray6 = new short[4];
		this.aShortArray5 = new short[4];
		this.aShort3 = (short) (arg12 >> Static588.anInt9672);
	}
}
