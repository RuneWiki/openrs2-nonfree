import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
	public static int anInt4792;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_181 = new Class179(14, 0);

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_182 = new Class179(129, -1);

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Z")
	public static boolean aBoolean303 = false;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFFIIFFF)F")
	public static float method4079(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(16) float local16 = arg0 - arg1;
		@Pc(21) float local21 = arg6 - arg4;
		@Pc(26) float local26 = arg5 - arg2;
		@Pc(28) float local28 = 0.0F;
		@Pc(30) float local30 = 0.0F;
		@Pc(32) float local32 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(40) float local40 = local7 * local16 + arg1;
			@Pc(46) float local46 = arg4 + local21 * local7;
			@Pc(52) float local52 = local7 * local26 + arg2;
			@Pc(57) int local57 = (int) local40 >> 9;
			@Pc(62) int local62 = (int) local52 >> 9;
			if (local57 > 0 && local62 > 0 && local57 < Static491.anInt9856 && local62 < Static393.anInt6574) {
				@Pc(85) int local85 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140;
				if (local85 < 3 && (Static90.aByteArrayArrayArray2[1][local57][local62] & 0x2) != 0) {
					local85++;
				}
				@Pc(109) int local109 = Static64.aClass12Array1[local85].method7854((int) local52, (int) local40);
				if (local46 > (float) local109) {
					if (arg3 < 2) {
						return local7;
					}
					return local7 + method4079(local40, local28, local32, arg3 + -1, local30, local52, local46) * 0.1F - 0.1F;
				}
			}
			local30 = local46;
			local7 += 0.1F;
			local28 = local40;
			local32 = local52;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)Z")
	public static boolean method4080() {
		Static102.anInt1886++;
		Static459.aBoolean513 = true;
		return true;
	}
}
