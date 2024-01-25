import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "Lclient!aq;")
	public static Class20 aClass20_2;

	@OriginalMember(owner = "client!lj", name = "K", descriptor = "[I")
	public static final int[] anIntArray122 = new int[32];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(FIZFFFFF)F")
	public static float method1550(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(20) float local20 = 0.0F;
		@Pc(24) float local24 = arg2 - arg3;
		@Pc(28) float local28 = arg6 - arg5;
		@Pc(33) float local33 = arg0 - arg4;
		@Pc(35) float local35 = 0.0F;
		@Pc(37) float local37 = 0.0F;
		@Pc(39) float local39 = 0.0F;
		while (local20 < 1.1F) {
			@Pc(47) float local47 = arg3 + local24 * local20;
			@Pc(53) float local53 = local28 * local20 + arg5;
			@Pc(59) float local59 = arg4 + local20 * local33;
			@Pc(64) int local64 = (int) local47 >> 9;
			@Pc(69) int local69 = (int) local59 >> 9;
			if (local64 > 0 && local69 > 0 && local64 < Static399.anInt7121 && Static24.anInt345 > local69) {
				@Pc(89) int local89 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127;
				if (local89 < 3 && (Static546.aByteArrayArrayArray18[1][local64][local69] & 0x2) != 0) {
					local89++;
				}
				@Pc(116) int local116 = Static518.aClass91Array2[local89].method7725((int) local47, (int) local59);
				if ((float) local116 < local53) {
					if (arg1 < 2) {
						return local20;
					}
					return local20 + method1550(local59, arg1 + -1, local47, local35, local39, local37, local53) * 0.1F - 0.1F;
				}
			}
			local20 += 0.1F;
			local35 = local47;
			local37 = local53;
			local39 = local59;
		}
		return -1.0F;
	}
}
