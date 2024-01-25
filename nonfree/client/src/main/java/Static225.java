import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Lclient!la;")
	public static Class208 aClass208_55;

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
	public static int anInt3671;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "[I")
	public static int[] anIntArray209 = new int[4];

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "J")
	public static long aLong110 = 0L;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFFFIBFF)F")
	public static float method3215(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg2 - arg1;
		@Pc(17) float local17 = arg0 - arg6;
		@Pc(21) float local21 = arg3 - arg5;
		@Pc(30) float local30 = 0.0F;
		@Pc(32) float local32 = 0.0F;
		@Pc(34) float local34 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(44) float local44 = arg1 + local7 * local12;
			@Pc(50) float local50 = local7 * local17 + arg6;
			@Pc(56) float local56 = local21 * local7 + arg5;
			@Pc(61) int local61 = (int) local44 >> 9;
			@Pc(66) int local66 = (int) local56 >> 9;
			if (local61 > 0 && local66 > 0 && Static544.anInt9261 > local61 && Static282.anInt4887 > local66) {
				@Pc(96) int local96 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145;
				if (local96 < 3 && (Static220.aByteArrayArrayArray14[1][local61][local66] & 0x2) != 0) {
					local96++;
				}
				@Pc(124) int local124 = Static220.aClass22Array2[local96].method8032((int) local44, (int) local56);
				if (local50 > (float) local124) {
					if (arg4 < 2) {
						return local7;
					}
					return method3215(local50, local30, local44, local56, arg4 - 1, local34, local32) * 0.1F + local7 - 0.1F;
				}
			}
			local30 = local44;
			local32 = local50;
			local7 += 0.1F;
			local34 = local56;
		}
		return -1.0F;
	}
}
