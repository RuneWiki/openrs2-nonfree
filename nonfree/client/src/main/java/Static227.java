import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method2971() {
		for (@Pc(7) int local7 = 0; local7 < Static208.anInt3488; local7++) {
			@Pc(13) Class64 local13 = Static147.aClass64Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(141) int local141;
			if (local13.aClass2_Sub1_Sub3_1 == null) {
				local13.anInt1808--;
				if (local13.anInt1808 >= (local13.aByte21 == 2 ? -1500 : -10)) {
					if (local13.aByte21 == 1 && local13.aClass106_1 == null) {
						local13.aClass106_1 = Static465.method2204(Static427.aClass54_115, local13.anInt1809, 0);
						if (local13.aClass106_1 == null) {
							continue;
						}
						local13.anInt1808 += local13.aClass106_1.method2203();
					} else if (local13.aByte21 == 2 && (local13.aClass2_Sub31_1 == null || local13.aClass2_Sub22_Sub1_1 == null)) {
						if (local13.aClass2_Sub31_1 == null) {
							local13.aClass2_Sub31_1 = Static262.method3518(Static217.aClass54_64, local13.anInt1809);
						}
						if (local13.aClass2_Sub31_1 == null) {
							continue;
						}
						if (local13.aClass2_Sub22_Sub1_1 == null) {
							local13.aClass2_Sub22_Sub1_1 = local13.aClass2_Sub31_1.method3512(new int[] { 22050 });
							if (local13.aClass2_Sub22_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local13.anInt1808 < 0) {
						if (local13.anInt1807 == 0) {
							local141 = local13.anInt1805 * Static2.aClass148_Sub1_1.anInt3778 >> 8;
						} else {
							@Pc(150) int local150 = local13.anInt1807 >> 24 & 0x3;
							if (local150 == Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91) {
								@Pc(165) int local165 = (local13.anInt1807 & 0xFF) << 7;
								@Pc(172) int local172 = local13.anInt1807 >> 16 & 0xFF;
								@Pc(182) int local182 = (local172 << 7) + 64 - Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833;
								if (local182 < 0) {
									local182 = -local182;
								}
								@Pc(197) int local197 = local13.anInt1807 >> 8 & 0xFF;
								@Pc(207) int local207 = (local197 << 7) + 64 - Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835;
								if (local207 < 0) {
									local207 = -local207;
								}
								@Pc(222) int local222 = local182 + local207 - 128;
								if (local222 > local165) {
									local13.anInt1808 = -99999;
									continue;
								}
								if (local222 < 0) {
									local222 = 0;
								}
								local141 = (local165 - local222) * Static2.aClass148_Sub1_1.anInt3790 * local13.anInt1805 / local165 >> 8;
							} else {
								local141 = 0;
							}
						}
						if (local141 > 0) {
							@Pc(259) Class2_Sub22_Sub1 local259 = null;
							if (local13.aByte21 == 1) {
								local259 = local13.aClass106_1.method2206().method2159(Static162.aClass243_1);
							} else if (local13.aByte21 == 2) {
								local259 = local13.aClass2_Sub22_Sub1_1;
							}
							@Pc(285) Class2_Sub1_Sub3 local285 = local13.aClass2_Sub1_Sub3_1 = Static462.method1593(local259, local141);
							local285.method1598(local13.anInt1810 - 1);
							Static421.aClass2_Sub1_Sub4_2.method3232(local285);
						}
					}
				} else {
					local15 = true;
				}
			} else if (!local13.aClass2_Sub1_Sub3_1.method5702()) {
				local15 = true;
			}
			if (local15) {
				Static208.anInt3488--;
				for (local141 = local7; local141 < Static208.anInt3488; local141++) {
					Static147.aClass64Array1[local141] = Static147.aClass64Array1[local141 + 1];
				}
				local7--;
			}
		}
		if (Static372.aBoolean448 && !Static208.method2800()) {
			if (Static2.aClass148_Sub1_1.anInt3792 != 0 && Static246.anInt3968 != -1) {
				Static216.method2861(Static120.aClass54_36, Static246.anInt3968, Static2.aClass148_Sub1_1.anInt3792);
			}
			Static372.aBoolean448 = false;
		} else if (Static2.aClass148_Sub1_1.anInt3792 != 0 && Static246.anInt3968 != -1 && !Static208.method2800()) {
			Static29.method451(Static266.aClass102_128);
			Static456.aClass2_Sub13_Sub2_2.method3569(Static246.anInt3968);
			Static246.anInt3968 = -1;
		}
	}
}
