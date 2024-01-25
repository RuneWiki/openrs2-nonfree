import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
	public static int anInt5850;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
	public static int anInt5851;

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
	public static int anInt5852;

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_106 = new Class215(39, 8);

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "[I")
	public static final int[] anIntArray338 = new int[2048];

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
	public static int anInt5853 = 0;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5049(@OriginalArg(0) Class20 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static487.aBoolean676) {
			local7 = Static465.method7210();
			local9 = Static207.method4090();
		}
		@Pc(21) int local21 = local7 + anInt5852;
		@Pc(25) int local25 = Static332.anInt6717 + local9;
		@Pc(27) int local27 = Static278.anInt5905;
		@Pc(31) int local31 = Static589.anInt10431 - 3;
		Static307.method5436(Static278.anInt5905, local7 + anInt5852, arg0, Static588.aClass351_26.method8691(Static476.anInt8915), local9 + Static332.anInt6717, Static589.anInt10431);
		@Pc(57) int local57 = local7 + Static628.aClass9_1.method803();
		@Pc(68) int local68 = local9 + Static628.aClass9_1.method800();
		@Pc(72) int local72;
		@Pc(77) Class2_Sub6_Sub3 local77;
		@Pc(93) int local93;
		@Pc(283) int local283;
		@Pc(164) Class2_Sub6_Sub21 local164;
		@Pc(271) Class2_Sub6_Sub3 local271;
		if (Static374.aBoolean539) {
			local72 = 0;
			for (local164 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6008(); local164 != null; local164 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6000()) {
				local93 = local72 * 16 + local25 + 33;
				if (local57 > local7 + anInt5852 && local57 < Static278.anInt5905 + local7 + anInt5852 && local93 - 13 < local68 && local68 < local93 + 4 && (local164.anInt10705 > 1 || ((Class2_Sub6_Sub3) local164.aClass211_12.aClass2_Sub6_48.aClass2_Sub6_66).aBoolean219)) {
					arg0.aa(anInt5852 + local7, local93 + -12, Static278.anInt5905, 16, 255 - Static329.anInt6645 << 24 | Static573.anInt10252, 1);
				}
				local72++;
			}
			if (Static532.aClass2_Sub6_Sub21_1 != null) {
				local72 = 0;
				Static307.method5436(Static40.anInt1336, Static202.anInt4656, arg0, Static532.aClass2_Sub6_Sub21_1.aString106, Static169.anInt731, Static440.anInt8157);
				for (local271 = (Class2_Sub6_Sub3) Static532.aClass2_Sub6_Sub21_1.aClass211_12.method6008(); local271 != null; local271 = (Class2_Sub6_Sub3) Static532.aClass2_Sub6_Sub21_1.aClass211_12.method6000()) {
					local283 = local72 * 16 + Static169.anInt731 + 20 + 13;
					if (Static202.anInt4656 < local57 && Static202.anInt4656 + Static40.anInt1336 > local57 && local68 > local283 - 13 && local283 + 4 > local68 && local271.aBoolean219) {
						arg0.aa(Static202.anInt4656, local283 - 12, Static40.anInt1336, 16, 255 - Static329.anInt6645 << 24 | Static573.anInt10252, 1);
					}
					local72++;
				}
				Static315.method5495(Static202.anInt4656, Static40.anInt1336, Static440.anInt8157, Static169.anInt731, arg0);
			}
		} else {
			local72 = 0;
			for (local77 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local77 != null; local77 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
				local93 = (Static298.anInt6262 - local72 - 1) * 16 + local25 + 13 + 20;
				if (anInt5852 + local7 < local57 && anInt5852 + local7 + Static278.anInt5905 > local57 && local93 - 13 < local68 && local93 + 4 > local68 && local77.aBoolean219) {
					arg0.aa(local7 + anInt5852, local93 + -12, Static278.anInt5905, 16, 255 - Static329.anInt6645 << 24 | Static573.anInt10252, 1);
				}
				local72++;
			}
		}
		Static315.method5495(anInt5852 + local7, Static278.anInt5905, Static589.anInt10431, Static332.anInt6717 + local9, arg0);
		if (Static374.aBoolean539) {
			local72 = 0;
			for (local164 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6008(); local164 != null; local164 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6000()) {
				local93 = local9 + Static332.anInt6717 + local72 * 16 + 13 + 20;
				local72++;
				if (local164.anInt10705 == 1) {
					Static608.method8912(Static332.anInt6717 + local9, Static327.anInt6611 | 0xFF000000, local93, arg0, (Class2_Sub6_Sub3) local164.aClass211_12.aClass2_Sub6_48.aClass2_Sub6_66, Static278.anInt5905, local68, Static569.anInt10209 | 0xFF000000, Static589.anInt10431, anInt5852 + local7, local57);
				} else {
					Static286.method5209(Static569.anInt10209 | 0xFF000000, local93, local164, local57, Static278.anInt5905, Static327.anInt6611 | 0xFF000000, local68, arg0, Static332.anInt6717 + local9, local7 + anInt5852, Static589.anInt10431);
				}
			}
			if (Static532.aClass2_Sub6_Sub21_1 != null) {
				local72 = 0;
				for (local271 = (Class2_Sub6_Sub3) Static532.aClass2_Sub6_Sub21_1.aClass211_12.method6008(); local271 != null; local271 = (Class2_Sub6_Sub3) Static532.aClass2_Sub6_Sub21_1.aClass211_12.method6000()) {
					local283 = local72 * 16 + Static169.anInt731 + 13 + 20;
					local72++;
					Static608.method8912(Static169.anInt731, Static327.anInt6611 | 0xFF000000, local283, arg0, local271, Static40.anInt1336, local68, Static569.anInt10209 | 0xFF000000, Static440.anInt8157, Static202.anInt4656, local57);
				}
				Static103.method2669(Static40.anInt1336, Static169.anInt731, Static202.anInt4656, Static440.anInt8157);
			}
		} else {
			local72 = 0;
			for (local77 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local77 != null; local77 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
				local93 = local25 + (Static298.anInt6262 + -1 + -local72) * 16 + 20 + 13;
				local72++;
				Static608.method8912(local25, Static327.anInt6611 | 0xFF000000, local93, arg0, local77, local27, local68, Static569.anInt10209 | 0xFF000000, local31, local21, local57);
			}
		}
		Static103.method2669(Static278.anInt5905, Static332.anInt6717 + local9, local7 + anInt5852, Static589.anInt10431);
	}
}
