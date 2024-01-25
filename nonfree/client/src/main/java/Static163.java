import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
	public static int anInt3412;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_51 = new Class322(106, 4);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Z")
	public static boolean method3216(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
	public static void method3217() {
		Static158.aClass245_1.method5972();
		Static471.aClass255_5.method6209();
		Static664.aClass319_2.method7622();
		Static290.aClass163_5.method4118();
		Static221.aClass164_1.method4151();
		Static149.aClass244_1.method5961();
		Static444.aClass68_3.method1284();
		Static655.aClass172_2.method4450();
		Static61.aClass335_1.method7989();
		Static469.aClass47_1.method677();
		Static582.aClass367_1.method8574();
		Static338.aClass159_1.method4068();
		Static551.aClass392_1.method8911();
		Static599.aClass306_2.method7373();
		Static508.aClass190_3.method4696();
		Static431.aClass156_1.method4048();
		Static521.aClass20_21.method247();
		Static227.aClass298_1.method7253();
		Static276.aClass350_1.method8255();
		Static378.aClass90_1.method2203();
		Static319.aClass337_2.method8061();
		Static143.aClass296_2.method7214();
		Static597.aClass313_2.method7518();
		Static41.method530();
		Static285.method4703();
		Static131.method2541();
		Static240.method4228();
		Static421.method6432();
		Static324.aClass359_45.method8511();
		Static22.aClass359_38.method8511();
		Static488.aClass359_54.method8511();
		Static200.aClass359_23.method8511();
		Static301.aClass359_43.method8511();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(FIFFFFFI)F")
	public static float method3218(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg0 - arg3;
		@Pc(17) float local17 = arg4 - arg2;
		@Pc(21) float local21 = arg5 - arg6;
		@Pc(23) float local23 = 0.0F;
		@Pc(25) float local25 = 0.0F;
		@Pc(27) float local27 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(44) float local44 = local7 * local12 + arg3;
			@Pc(50) float local50 = local7 * local17 + arg2;
			@Pc(56) float local56 = local7 * local21 + arg6;
			@Pc(61) int local61 = (int) local44 >> 9;
			@Pc(66) int local66 = (int) local56 >> 9;
			if (local61 > 0 && local66 > 0 && Static29.anInt380 > local61 && Static327.anInt5650 > local66) {
				@Pc(89) int local89 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135;
				if (local89 < 3 && (Static272.aByteArrayArrayArray2[1][local61][local66] & 0x2) != 0) {
					local89++;
				}
				@Pc(119) int local119 = Static524.aClass96Array2[local89].method8077((int) local44, (int) local56);
				if (local50 > (float) local119) {
					if (arg1 < 2) {
						return local7;
					}
					return method3218(local44, arg1 - 1, local25, local23, local50, local56, local27) * 0.1F + local7 - 0.1F;
				}
			}
			local27 = local56;
			local23 = local44;
			local7 += 0.1F;
			local25 = local50;
		}
		return -1.0F;
	}
}
