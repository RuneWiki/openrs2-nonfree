import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jea", name = "o", descriptor = "[Lclient!sf;")
	public static Class41_Sub1[] aClass41_Sub1Array4;

	@OriginalMember(owner = "client!jea", name = "p", descriptor = "I")
	public static int anInt4278;

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_53 = new Class187(53, 8);

	@OriginalMember(owner = "client!jea", name = "r", descriptor = "I")
	public static int anInt4279 = -1;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(FIFFIFFF)F")
	public static float method3791(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(12) float local12 = 0.0F;
		@Pc(17) float local17 = arg6 - arg3;
		@Pc(22) float local22 = arg5 - arg4;
		@Pc(26) float local26 = arg0 - arg2;
		@Pc(28) float local28 = 0.0F;
		@Pc(30) float local30 = 0.0F;
		@Pc(32) float local32 = 0.0F;
		while (local12 < 1.1F) {
			@Pc(40) float local40 = arg3 + local17 * local12;
			@Pc(46) float local46 = local12 * local22 + arg4;
			@Pc(52) float local52 = arg2 + local12 * local26;
			@Pc(57) int local57 = (int) local40 >> 9;
			@Pc(62) int local62 = (int) local52 >> 9;
			if (local57 > 0 && local62 > 0 && local57 < Static124.anInt2150 && Static64.anInt1015 > local62) {
				@Pc(78) int local78 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149;
				if (local78 < 3 && (Static317.aByteArrayArrayArray13[1][local57][local62] & 0x2) != 0) {
					local78++;
				}
				@Pc(104) int local104 = Static230.aClass88Array2[local78].method8753((int) local40, (int) local52);
				if (local46 > (float) local104) {
					if (arg1 < 2) {
						return local12;
					}
					return method3791(local52, arg1 - 1, local32, local28, local30, local46, local40) * 0.1F + local12 - 0.1F;
				}
			}
			local30 = local46;
			local28 = local40;
			local12 += 0.1F;
			local32 = local52;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIII)V")
	public static void method3792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class5_Sub2_Sub4 local14 = Static257.method3597(4, (long) arg2);
		local14.method2438();
		local14.anInt2749 = arg0;
		local14.anInt2751 = arg3;
		local14.anInt2740 = arg1;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
	public static void method3793() {
		Static608.aClass124_98 = new Class124();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)Z")
	public static boolean method3795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static260.method3619(arg1, arg0) || Static394.method5729(arg0, arg1);
	}
}
