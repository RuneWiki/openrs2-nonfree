import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "Lclient!wea;")
	public static Class370 aClass370_6;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
	public static int anInt9455;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[FI)[F")
	public static float[] method7862(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static653.method7720(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Z")
	public static boolean method7863(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method7866(@OriginalArg(1) Class20 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static487.aBoolean676) {
			local7 = Static465.method7210();
			local9 = Static207.method4090();
		}
		Static477.method7478(Static278.anInt5905, Static332.anInt6717 + local9, arg0, Static274.anInt5852 + local7, Static589.anInt10431);
		Static571.aClass68_12.method8107(Static588.aClass351_26.method8691(Static476.anInt8915), -10660793, local9 + Static332.anInt6717 + 14, local7 + Static274.anInt5852 + 3, -1);
		@Pc(64) int local64 = Static628.aClass9_1.method803() + local7;
		@Pc(70) int local70 = local9 + Static628.aClass9_1.method800();
		@Pc(74) int local74;
		@Pc(91) int local91;
		if (Static374.aBoolean539) {
			local74 = 0;
			for (@Pc(79) Class2_Sub6_Sub21 local79 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6008(); local79 != null; local79 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6000()) {
				local91 = local9 + Static332.anInt6717 + local74 * 16 + 31;
				local74++;
				if (local79.anInt10705 == 1) {
					Static608.method8912(local9 + Static332.anInt6717, -256, local91, arg0, (Class2_Sub6_Sub3) local79.aClass211_12.aClass2_Sub6_48.aClass2_Sub6_66, Static278.anInt5905, local70, -1, Static589.anInt10431, Static274.anInt5852 + local7, local64);
				} else {
					Static286.method5209(-1, local91, local79, local64, Static278.anInt5905, -256, local70, arg0, Static332.anInt6717 + local9, Static274.anInt5852 - -local7, Static589.anInt10431);
				}
			}
			if (Static532.aClass2_Sub6_Sub21_1 != null) {
				Static477.method7478(Static40.anInt1336, Static169.anInt731, arg0, Static202.anInt4656, Static440.anInt8157);
				local74 = 0;
				Static571.aClass68_12.method8107(Static532.aClass2_Sub6_Sub21_1.aString106, -10660793, Static169.anInt731 + 14, Static202.anInt4656 + 3, -1);
				for (@Pc(179) Class2_Sub6_Sub3 local179 = (Class2_Sub6_Sub3) Static532.aClass2_Sub6_Sub21_1.aClass211_12.method6008(); local179 != null; local179 = (Class2_Sub6_Sub3) Static532.aClass2_Sub6_Sub21_1.aClass211_12.method6000()) {
					@Pc(189) int local189 = Static169.anInt731 + local74 * 16 + 31;
					local74++;
					Static608.method8912(Static169.anInt731, -256, local189, arg0, local179, Static40.anInt1336, local70, -1, Static440.anInt8157, Static202.anInt4656, local64);
				}
				Static103.method2669(Static40.anInt1336, Static169.anInt731, Static202.anInt4656, Static440.anInt8157);
			}
		} else {
			local74 = 0;
			for (@Pc(226) Class2_Sub6_Sub3 local226 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local226 != null; local226 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
				local91 = local9 + Static332.anInt6717 + (-local74 + -1 + Static298.anInt6262) * 16 + 31;
				Static608.method8912(local9 + Static332.anInt6717, -256, local91, arg0, local226, Static278.anInt5905, local70, -1, Static589.anInt10431, Static274.anInt5852 + local7, local64);
				local74++;
			}
		}
		Static103.method2669(Static278.anInt5905, Static332.anInt6717 + local9, Static274.anInt5852 + local7, Static589.anInt10431);
	}
}
