import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!ka;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Lclient!ei;")
	public static Class94 aClass94_24;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "[Lclient!mca;")
	public static Class210[] aClass210Array1;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	public static int anInt9611;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
	public static int anInt9612 = -1;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
	public static int method7404() {
		return Static306.anInt6119;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method7405(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static277.anInt5771 = 0;
		Static459.anInt8207 = 0;
		Static472.anInt8979++;
		for (@Pc(15) int local15 = 0; local15 < Static137.anIntArray143[local5]; local15++) {
			if (!Static568.method8014(Static48.aClass21_Sub1ArrayArray4[local5][local15], arg0, arg1, arg2, arg3)) {
				Static136.method2447(Static48.aClass21_Sub1ArrayArray4[local5][local15]);
				if (Static48.aClass21_Sub1ArrayArray4[local5][local15].anInt10557 != -1) {
					Static562.aClass21_Sub1Array2[Static277.anInt5771++] = Static48.aClass21_Sub1ArrayArray4[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static254.anIntArray281[local5]; local61++) {
			if (!Static568.method8014(Static338.aClass21_Sub1ArrayArray2[local5][local61], arg0, arg1, arg2, arg3)) {
				Static136.method2447(Static338.aClass21_Sub1ArrayArray2[local5][local61]);
				if (Static338.aClass21_Sub1ArrayArray2[local5][local61].anInt10557 != -1) {
					Static378.aClass21_Sub1Array1[Static459.anInt8207++] = Static338.aClass21_Sub1ArrayArray2[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static27.anIntArray195[local5]; local107++) {
			if (!Static568.method8014(Static375.aClass21_Sub1ArrayArray3[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static375.aClass21_Sub1ArrayArray3[local5][local107].method8229()) {
					Static136.method2447(Static375.aClass21_Sub1ArrayArray3[local5][local107]);
					if (Static375.aClass21_Sub1ArrayArray3[local5][local107].anInt10557 != -1) {
						Static378.aClass21_Sub1Array1[Static459.anInt8207++] = Static375.aClass21_Sub1ArrayArray3[local5][local107];
					}
				} else {
					Static136.method2447(Static375.aClass21_Sub1ArrayArray3[local5][local107]);
					if (Static375.aClass21_Sub1ArrayArray3[local5][local107].anInt10557 != -1) {
						Static562.aClass21_Sub1Array2[Static277.anInt5771++] = Static375.aClass21_Sub1ArrayArray3[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static496.anInt9339; local190++) {
				if (!Static568.method8014(Static80.aClass21_Sub1_Sub1Array1[local190], arg0, arg1, arg2, arg3)) {
					Static136.method2447(Static80.aClass21_Sub1_Sub1Array1[local190]);
					if (Static80.aClass21_Sub1_Sub1Array1[local190].anInt10557 != -1) {
						if (Static80.aClass21_Sub1_Sub1Array1[local190].method8229()) {
							Static378.aClass21_Sub1Array1[Static459.anInt8207++] = Static80.aClass21_Sub1_Sub1Array1[local190];
						} else {
							Static562.aClass21_Sub1Array2[Static277.anInt5771++] = Static80.aClass21_Sub1_Sub1Array1[local190];
						}
					}
				}
			}
		}
		if (Static277.anInt5771 > 0) {
			Static233.method3768(Static562.aClass21_Sub1Array2, 0, Static277.anInt5771 - 1);
			for (local190 = 0; local190 < Static277.anInt5771; local190++) {
				Static436.method6475(Static562.aClass21_Sub1Array2[local190]);
			}
		}
		if (Static505.aBoolean639) {
			Static299.aClass7_12.method7852(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static570.anInt10306; local190 < Static218.anInt4559; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static339.aBooleanArrayArray8.length;
				if (Static175.anInt3714 + Static339.aBooleanArrayArray8.length > Static10.anInt812) {
					local278 -= Static175.anInt3714 + Static339.aBooleanArrayArray8.length - Static10.anInt812;
				}
				local298 = Static339.aBooleanArrayArray8[0].length;
				if (Static36.anInt1228 + Static339.aBooleanArrayArray8[0].length > Static255.anInt5209) {
					local298 -= Static36.anInt1228 + Static339.aBooleanArrayArray8[0].length - Static255.anInt5209;
				}
				local319 = Static586.aBooleanArrayArray12;
				if (Static202.aBoolean290) {
					if (Static406.aBoolean566) {
						local319 = Static375.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static406.anInt7855; local329 < local278; local329++) {
						local336 = local329 + Static175.anInt3714 - Static406.anInt7855;
						for (local338 = Static118.anInt2706; local338 < local298; local338++) {
							if (Static339.aBooleanArrayArray8[local329][local338] && !Static351.method5319(local190, local336, local338 + Static36.anInt1228 - Static118.anInt2706)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static406.aBoolean566) {
					Static255.aClass115Array2[local190].method8053(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static315.anInt6311; local329++) {
						Static112.aClass203Array1[local329].method4826(new Class21_Sub2(local190 + 1));
					}
				} else if (Static353.aBoolean469) {
					Static255.aClass115Array2[local190].method8056(Static465.anInt8858, Static78.anInt1933, Static30.anInt1124, Static586.aBooleanArrayArray12, true, Static409.anInt7964);
				} else {
					Static255.aClass115Array2[local190].method8053(Static465.anInt8858, Static78.anInt1933, Static30.anInt1124, Static586.aBooleanArrayArray12, true);
				}
			} else {
				local278 = Static339.aBooleanArrayArray8.length;
				if (Static175.anInt3714 + Static339.aBooleanArrayArray8.length > Static10.anInt812) {
					local278 -= Static175.anInt3714 + Static339.aBooleanArrayArray8.length - Static10.anInt812;
				}
				local298 = Static339.aBooleanArrayArray8[0].length;
				if (Static36.anInt1228 + Static339.aBooleanArrayArray8[0].length > Static255.anInt5209) {
					local298 -= Static36.anInt1228 + Static339.aBooleanArrayArray8[0].length - Static255.anInt5209;
				}
				local319 = Static586.aBooleanArrayArray12;
				if (Static202.aBoolean290) {
					if (Static406.aBoolean566) {
						local319 = Static375.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static406.anInt7855; local329 < local278; local329++) {
						local336 = local329 + Static175.anInt3714 - Static406.anInt7855;
						for (local338 = Static118.anInt2706; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static339.aBooleanArrayArray8[local329][local338]) {
								@Pc(357) int local357 = local338 + Static36.anInt1228 - Static118.anInt2706;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static571.aClass182ArrayArrayArray3[local359][local336][local357] != null && Static571.aClass182ArrayArrayArray3[local359][local336][local357].aByte93 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static351.method5319(local190, local336, local357)) {
											local319[local329][local338] = true;
											break;
										}
										local319[local329][local338] = false;
										break;
									}
								}
							}
						}
					}
				}
				if (Static406.aBoolean566) {
					Static255.aClass115Array2[local190].method8053(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static315.anInt6311; local329++) {
						Static112.aClass203Array1[local329].method4826(new Class21_Sub2(local190 + 1));
					}
				} else if (Static353.aBoolean469) {
					Static255.aClass115Array2[local190].method8056(Static465.anInt8858, Static78.anInt1933, Static30.anInt1124, Static586.aBooleanArrayArray12, false, Static409.anInt7964);
				} else {
					Static255.aClass115Array2[local190].method8053(Static465.anInt8858, Static78.anInt1933, Static30.anInt1124, Static586.aBooleanArrayArray12, false);
				}
			}
		}
		if (Static459.anInt8207 > 0) {
			Static196.method3224(Static378.aClass21_Sub1Array1, 0, Static459.anInt8207 - 1);
			for (local278 = 0; local278 < Static459.anInt8207; local278++) {
				Static436.method6475(Static378.aClass21_Sub1Array1[local278]);
			}
		}
	}
}
