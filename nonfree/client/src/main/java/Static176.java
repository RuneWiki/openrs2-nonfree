import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "[B")
	public static final byte[] aByteArray52 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	public static volatile int anInt3626 = 0;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "[I")
	public static final int[] anIntArray493 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "([IB[III)V")
	public static void method3281(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(16) int local16 = (arg2 + arg3) / 2;
		@Pc(18) int local18 = arg3;
		@Pc(22) int local22 = arg1[local16];
		arg1[local16] = arg1[arg2];
		arg1[arg2] = local22;
		@Pc(36) int local36 = arg0[local16];
		arg0[local16] = arg0[arg2];
		arg0[arg2] = local36;
		for (@Pc(48) int local48 = arg3; local48 < arg2; local48++) {
			if (arg1[local48] < (local48 & 0x1) + local22) {
				@Pc(66) int local66 = arg1[local48];
				arg1[local48] = arg1[local18];
				arg1[local18] = local66;
				@Pc(80) int local80 = arg0[local48];
				arg0[local48] = arg0[local18];
				arg0[local18++] = local80;
			}
		}
		arg1[arg2] = arg1[local18];
		arg1[local18] = local22;
		arg0[arg2] = arg0[local18];
		arg0[local18] = local36;
		method3281(arg0, arg1, local18 - 1, arg3);
		method3281(arg0, arg1, arg2, local18 + 1);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)I")
	public static int method3282(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
