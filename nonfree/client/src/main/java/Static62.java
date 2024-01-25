import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "[S")
	public static short[] aShortArray14;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_26 = new Class40(85, 6);

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
	public static final int anInt1000 = -1;

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	public static void method799() {
		for (@Pc(3) int local3 = 0; local3 < Static231.anInt3927; local3++) {
			@Pc(11) Class172 local11 = Static103.aClass172Array7[local3];
			@Pc(13) boolean local13 = false;
			@Pc(145) int local145;
			if (local11.aClass6_Sub19_Sub2_3 == null) {
				local11.anInt4244--;
				if (local11.anInt4244 < (local11.method3645() ? -1500 : -10)) {
					local13 = true;
				} else {
					if (local11.aByte56 == 1 && local11.aClass309_1 == null) {
						local11.aClass309_1 = Static590.method6852(Static527.aClass251_147, local11.anInt4242, 0);
						if (local11.aClass309_1 == null) {
							continue;
						}
						local11.anInt4244 += local11.aClass309_1.method6849();
					} else if (local11.method3645() && (local11.aClass6_Sub50_3 == null || local11.aClass6_Sub12_Sub1_3 == null)) {
						if (local11.aClass6_Sub50_3 == null) {
							local11.aClass6_Sub50_3 = Static531.method7391(Static509.aClass251_142, local11.anInt4242);
						}
						if (local11.aClass6_Sub50_3 == null) {
							continue;
						}
						if (local11.aClass6_Sub12_Sub1_3 == null) {
							local11.aClass6_Sub12_Sub1_3 = local11.aClass6_Sub50_3.method7394(new int[] { 22050 });
							if (local11.aClass6_Sub12_Sub1_3 == null) {
								continue;
							}
						}
					}
					if (local11.anInt4244 < 0) {
						if (local11.anInt4249 == 0) {
							local145 = (local11.aByte56 == 3 ? Static480.aClass6_Sub37_Sub1_1.anInt6049 : Static480.aClass6_Sub37_Sub1_1.anInt6047) * local11.anInt4245 >> 8;
						} else {
							@Pc(154) int local154 = local11.anInt4249 >> 24 & 0x3;
							if (local154 == Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103) {
								@Pc(165) int local165 = (local11.anInt4249 & 0xFF) << 9;
								@Pc(172) int local172 = local11.anInt4249 >> 16 & 0xFF;
								@Pc(182) int local182 = (local172 << 9) + 256 - Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222;
								if (local182 < 0) {
									local182 = -local182;
								}
								@Pc(197) int local197 = local11.anInt4249 >> 8 & 0xFF;
								@Pc(206) int local206 = (local197 << 9) + 256 - Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218;
								if (local206 < 0) {
									local206 = -local206;
								}
								@Pc(217) int local217 = local182 + local206 - 512;
								if (local217 > local165) {
									local11.anInt4244 = -99999;
									continue;
								}
								if (local217 < 0) {
									local217 = 0;
								}
								local145 = (local165 - local217) * Static480.aClass6_Sub37_Sub1_1.anInt6058 * local11.anInt4245 / local165 >> 8;
							} else {
								local145 = 0;
							}
						}
						if (local145 > 0) {
							@Pc(256) Class6_Sub12_Sub1 local256 = null;
							if (local11.aByte56 == 1) {
								local256 = local11.aClass309_1.method6851().method4741(Static246.aClass21_1);
							} else if (local11.method3645()) {
								local256 = local11.aClass6_Sub12_Sub1_3;
							}
							@Pc(284) Class6_Sub19_Sub2 local284 = local11.aClass6_Sub19_Sub2_3 = Static583.method2815(local256, local145);
							local284.method2845(local11.anInt4248 - 1);
							Static144.aClass6_Sub19_Sub3_2.method6425(local284);
						}
					}
				}
			} else if (!local11.aClass6_Sub19_Sub2_3.method7848()) {
				local13 = true;
			}
			if (local13) {
				Static231.anInt3927--;
				for (local145 = local3; local145 < Static231.anInt3927; local145++) {
					Static103.aClass172Array7[local145] = Static103.aClass172Array7[local145 + 1];
				}
				local3--;
			}
		}
		if (Static150.aBoolean182 && !Static181.method2731()) {
			if (Static480.aClass6_Sub37_Sub1_1.anInt6060 != 0 && Static524.anInt8993 != -1) {
				Static483.method6704(Static375.aClass251_107, Static480.aClass6_Sub37_Sub1_1.anInt6060, Static524.anInt8993);
			}
			Static150.aBoolean182 = false;
		} else if (Static480.aClass6_Sub37_Sub1_1.anInt6060 != 0 && Static524.anInt8993 != -1 && !Static181.method2731()) {
			Static136.method2051(Static327.aClass160_77);
			Static218.aClass6_Sub14_Sub2_1.method5990(Static524.anInt8993);
			Static524.anInt8993 = -1;
		}
	}
}
