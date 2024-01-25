import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "[Lclient!we;")
	public static final Class11_Sub2_Sub6_Sub2[] aClass11_Sub2_Sub6_Sub2Array1 = new Class11_Sub2_Sub6_Sub2[32768];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)V")
	public static void method4291(@OriginalArg(0) int arg0) {
		Static227.anInt4589 = arg0;
		Static120.aClass21_78.method857();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	public static void method4292() {
		Static48.aClass21_84.method844(5);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZIZII)V")
	public static void method4294(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && arg2 == Static171.anInt3574 && Static145.anInt3091 == arg3 && (Static75.anInt3288 == Static284.anInt6477 || Static150.method4956())) {
			return;
		}
		Static171.anInt3574 = arg2;
		Static145.anInt3091 = arg3;
		Static75.anInt3288 = Static284.anInt6477;
		if (Static150.method4956()) {
			Static75.anInt3288 = 0;
		}
		if (arg1) {
			Static44.method1064(28);
		} else {
			Static44.method1064(25);
		}
		Static291.method5127(true, Static313.aClass106_210.method2927(Static254.anInt5172), Static24.aClass33_1);
		@Pc(65) int local65 = Static50.anInt1271;
		Static50.anInt1271 = (Static171.anInt3574 - (Static311.anInt5653 >> 4)) * 8;
		@Pc(76) int local76 = Static299.anInt4036;
		Static299.anInt4036 = (Static145.anInt3091 - (Static189.anInt3820 >> 4)) * 8;
		Static266.aClass1_Sub4_Sub15_3 = Static269.method3043(Static171.anInt3574 * 8, Static145.anInt3091 * 8);
		Static134.aClass86_1 = null;
		@Pc(100) int local100 = Static50.anInt1271 - local65;
		@Pc(105) int local105 = Static299.anInt4036 - local76;
		@Pc(120) int local120;
		@Pc(128) int local128;
		if (arg1) {
			Static277.anInt5394 = 0;
			local120 = (Static311.anInt5653 - 1) * 128;
			@Pc(126) int local126 = Static189.anInt3820 * 128 - 128;
			for (local128 = 0; local128 < 32768; local128++) {
				@Pc(134) Class11_Sub2_Sub6_Sub2 local134 = aClass11_Sub2_Sub6_Sub2Array1[local128];
				if (local134 != null) {
					local134.anInt6729 -= local100 * 128;
					local134.anInt6726 -= local105 * 128;
					if (local134.anInt6729 >= 0 && local134.anInt6729 <= local120 && local134.anInt6726 >= 0 && local126 >= local134.anInt6726) {
						@Pc(183) boolean local183 = true;
						for (@Pc(185) int local185 = 0; local185 < 10; local185++) {
							local134.anIntArray505[local185] -= local100;
							local134.anIntArray504[local185] -= local105;
							if (local134.anIntArray505[local185] < 0 || local134.anIntArray505[local185] >= Static311.anInt5653 || local134.anIntArray504[local185] < 0 || local134.anIntArray504[local185] >= Static189.anInt3820) {
								local183 = false;
							}
						}
						if (local183) {
							Static81.anIntArray143[Static277.anInt5394++] = local128;
						} else {
							aClass11_Sub2_Sub6_Sub2Array1[local128].method5906(null);
							aClass11_Sub2_Sub6_Sub2Array1[local128] = null;
						}
					} else {
						aClass11_Sub2_Sub6_Sub2Array1[local128].method5906(null);
						aClass11_Sub2_Sub6_Sub2Array1[local128] = null;
					}
				}
			}
		} else {
			for (local120 = 0; local120 < 32768; local120++) {
				@Pc(274) Class11_Sub2_Sub6_Sub2 local274 = aClass11_Sub2_Sub6_Sub2Array1[local120];
				if (local274 != null) {
					for (local128 = 0; local128 < 10; local128++) {
						local274.anIntArray505[local128] -= local100;
						local274.anIntArray504[local128] -= local105;
					}
					local274.anInt6729 -= local100 * 128;
					local274.anInt6726 -= local105 * 128;
				}
			}
		}
		for (local120 = 0; local120 < 2048; local120++) {
			@Pc(328) Class11_Sub2_Sub6_Sub1 local328 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local120];
			if (local328 != null) {
				for (local128 = 0; local128 < 10; local128++) {
					local328.anIntArray505[local128] -= local100;
					local328.anIntArray504[local128] -= local105;
				}
				local328.anInt6726 -= local105 * 128;
				local328.anInt6729 -= local100 * 128;
			}
		}
		Static51.method1229(local100, local105);
		for (@Pc(387) Class1_Sub20 local387 = (Class1_Sub20) Static75.aClass42_19.method1543(); local387 != null; local387 = (Class1_Sub20) Static75.aClass42_19.method1551()) {
			local387.anInt2716 -= local100;
			local387.anInt2698 -= local105;
			if (local387.anInt2716 < 0 || local387.anInt2698 < 0 || local387.anInt2716 >= Static311.anInt5653 || local387.anInt2698 >= Static189.anInt3820) {
				local387.method6045();
			}
		}
		Static116.anInt2537 = 0;
		if (Static237.anInt2678 != 0) {
			Static237.anInt2678 -= local100;
			Static97.anInt2177 -= local105;
		}
		if (arg1) {
			Static14.anInt4971 -= local100 * 128;
			Static319.anInt6112 -= local100;
			Static144.anInt3083 -= local100;
			Static260.anInt5192 -= local105 * 128;
			Static116.anInt2536 -= local105;
			Static129.anInt2807 -= local105;
			if (Math.abs(local100) > Static311.anInt5653 || Math.abs(local105) > Static189.anInt3820) {
				Static119.method2539();
			}
		} else if (Static50.anInt1273 == 4) {
			Static78.anInt1750 -= local100 * 128;
			Static53.anInt1374 -= local105 * 128;
			Static138.anInt2972 -= local105 * 128;
			Static98.anInt2254 -= local100 * 128;
		} else {
			Static50.anInt1273 = 1;
		}
		Static31.method821();
		Static161.method3064();
		Static42.aClass42_3.method1542();
		Static356.aClass42_46.method1542();
		Static299.aClass195_8.method5297();
		Static191.method5771();
	}
}
