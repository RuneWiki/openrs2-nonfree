import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Z")
	public static boolean method975() {
		return Static6.aBoolean1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
	public static void method976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass30_Sub3_3 != null) {
			local7.aClass30_Sub3_3 = null;
		}
		if (local7.aClass30_Sub3_2 != null) {
			local7.aClass30_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
	public static void method977() {
		for (@Pc(11) int local11 = 0; local11 < Static113.anInt2513; local11++) {
			@Pc(17) Class45 local17 = Static117.aClass45Array1[local11];
			@Pc(19) boolean local19 = false;
			@Pc(147) int local147;
			if (local17.aClass1_Sub19_Sub4_2 == null) {
				local17.anInt1514--;
				if (local17.anInt1514 >= (local17.aByte35 == 2 ? -1500 : -10)) {
					if (local17.aByte35 == 1 && local17.aClass112_1 == null) {
						local17.aClass112_1 = Static463.method2688(Static125.aClass211_33, local17.anInt1509, 0);
						if (local17.aClass112_1 == null) {
							continue;
						}
						local17.anInt1514 += local17.aClass112_1.method2691();
					} else if (local17.aByte35 == 2 && (local17.aClass1_Sub6_1 == null || local17.aClass1_Sub12_Sub1_2 == null)) {
						if (local17.aClass1_Sub6_1 == null) {
							local17.aClass1_Sub6_1 = Static40.method761(Static68.aClass211_20, local17.anInt1509);
						}
						if (local17.aClass1_Sub6_1 == null) {
							continue;
						}
						if (local17.aClass1_Sub12_Sub1_2 == null) {
							local17.aClass1_Sub12_Sub1_2 = local17.aClass1_Sub6_1.method760(new int[] { 22050 });
							if (local17.aClass1_Sub12_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local17.anInt1514 < 0) {
						if (local17.anInt1512 == 0) {
							local147 = local17.anInt1513 * Static12.aClass34_Sub1_1.anInt7173 >> 8;
						} else {
							@Pc(137) int local137 = local17.anInt1512 >> 24 & 0x3;
							if (Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 == local137) {
								@Pc(156) int local156 = (local17.anInt1512 & 0xFF) << 7;
								@Pc(163) int local163 = local17.anInt1512 >> 16 & 0xFF;
								@Pc(173) int local173 = (local163 << 7) + 64 - Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490;
								if (local173 < 0) {
									local173 = -local173;
								}
								@Pc(188) int local188 = local17.anInt1512 >> 8 & 0xFF;
								@Pc(198) int local198 = (local188 << 7) + 64 - Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488;
								if (local198 < 0) {
									local198 = -local198;
								}
								@Pc(213) int local213 = local173 + local198 - 128;
								if (local213 > local156) {
									local17.anInt1514 = -99999;
									continue;
								}
								if (local213 < 0) {
									local213 = 0;
								}
								local147 = local17.anInt1513 * Static12.aClass34_Sub1_1.anInt7175 * (local156 - local213) / local156 >> 8;
							} else {
								local147 = 0;
							}
						}
						if (local147 > 0) {
							@Pc(264) Class1_Sub12_Sub1 local264 = null;
							if (local17.aByte35 == 1) {
								local264 = local17.aClass112_1.method2690().method3716(Static441.aClass233_1);
							} else if (local17.aByte35 == 2) {
								local264 = local17.aClass1_Sub12_Sub1_2;
							}
							@Pc(290) Class1_Sub19_Sub4 local290 = local17.aClass1_Sub19_Sub4_2 = Static468.method5825(local264, local147);
							local290.method5828(local17.anInt1511 - 1);
							Static12.aClass1_Sub19_Sub2_1.method3187(local290);
						}
					}
				} else {
					local19 = true;
				}
			} else if (!local17.aClass1_Sub19_Sub4_2.method6175()) {
				local19 = true;
			}
			if (local19) {
				Static113.anInt2513--;
				for (local147 = local11; local147 < Static113.anInt2513; local147++) {
					Static117.aClass45Array1[local147] = Static117.aClass45Array1[local147 + 1];
				}
				local11--;
			}
		}
		if (Static180.aBoolean240 && !Static97.method1687()) {
			if (Static12.aClass34_Sub1_1.anInt7157 != 0 && Static71.anInt1878 != -1) {
				Static199.method3194(Static362.aClass211_75, Static12.aClass34_Sub1_1.anInt7157, Static71.anInt1878);
			}
			Static180.aBoolean240 = false;
		} else if (Static12.aClass34_Sub1_1.anInt7157 != 0 && Static71.anInt1878 != -1 && !Static97.method1687()) {
			Static32.method677(Static276.aClass177_75);
			Static433.aClass1_Sub3_Sub1_11.method1197(Static71.anInt1878);
			Static71.anInt1878 = -1;
		}
	}
}
