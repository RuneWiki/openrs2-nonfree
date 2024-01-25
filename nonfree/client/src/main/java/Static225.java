import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	public static int anInt3592 = 0;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
	public static final int[] anIntArray201 = new int[1];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIB)I")
	public static int method3192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class242.anIntArray383[arg3 * 8192 / arg2] >> 1;
		return (arg0 * local21 >> 16) + (arg1 * (65536 - local21) >> 16);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(10) int local10 = arg1; local10 <= arg4; local10++) {
			for (@Pc(13) int local13 = arg3; local13 <= arg2; local13++) {
				if (arg0 == Static54.anIntArrayArray68[local10][local13] && Static244.anIntArrayArray36[local10][local13] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
