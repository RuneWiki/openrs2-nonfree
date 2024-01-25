import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "Lclient!mea;")
	public static Class221 aClass221_2;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_19 = new Class70(55, -1);

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method1724(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static157.anInt2854 = 0;
		Static404.anInt7075 = 0;
		Static465.anInt7972++;
		for (@Pc(15) int local15 = 0; local15 < Static11.anIntArray12[local5]; local15++) {
			if (!Static525.method7245(Static34.aClass8_Sub3ArrayArray4[local5][local15], arg0, arg1, arg2, arg3)) {
				Static213.method3335(Static34.aClass8_Sub3ArrayArray4[local5][local15]);
				if (Static34.aClass8_Sub3ArrayArray4[local5][local15].anInt9367 != -1) {
					Static547.aClass8_Sub3Array2[Static157.anInt2854++] = Static34.aClass8_Sub3ArrayArray4[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static437.anIntArray588[local5]; local61++) {
			if (!Static525.method7245(Static471.aClass8_Sub3ArrayArray3[local5][local61], arg0, arg1, arg2, arg3)) {
				Static213.method3335(Static471.aClass8_Sub3ArrayArray3[local5][local61]);
				if (Static471.aClass8_Sub3ArrayArray3[local5][local61].anInt9367 != -1) {
					Static72.aClass8_Sub3Array1[Static404.anInt7075++] = Static471.aClass8_Sub3ArrayArray3[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static583.anIntArray731[local5]; local107++) {
			if (!Static525.method7245(Static88.aClass8_Sub3ArrayArray2[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static88.aClass8_Sub3ArrayArray2[local5][local107].method7620()) {
					Static213.method3335(Static88.aClass8_Sub3ArrayArray2[local5][local107]);
					if (Static88.aClass8_Sub3ArrayArray2[local5][local107].anInt9367 != -1) {
						Static72.aClass8_Sub3Array1[Static404.anInt7075++] = Static88.aClass8_Sub3ArrayArray2[local5][local107];
					}
				} else {
					Static213.method3335(Static88.aClass8_Sub3ArrayArray2[local5][local107]);
					if (Static88.aClass8_Sub3ArrayArray2[local5][local107].anInt9367 != -1) {
						Static547.aClass8_Sub3Array2[Static157.anInt2854++] = Static88.aClass8_Sub3ArrayArray2[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static16.anInt203; local190++) {
				if (!Static525.method7245(Static410.aClass8_Sub3_Sub3Array1[local190], arg0, arg1, arg2, arg3)) {
					Static213.method3335(Static410.aClass8_Sub3_Sub3Array1[local190]);
					if (Static410.aClass8_Sub3_Sub3Array1[local190].anInt9367 != -1) {
						if (Static410.aClass8_Sub3_Sub3Array1[local190].method7620()) {
							Static72.aClass8_Sub3Array1[Static404.anInt7075++] = Static410.aClass8_Sub3_Sub3Array1[local190];
						} else {
							Static547.aClass8_Sub3Array2[Static157.anInt2854++] = Static410.aClass8_Sub3_Sub3Array1[local190];
						}
					}
				}
			}
		}
		if (Static157.anInt2854 > 0) {
			Static504.method4692(Static547.aClass8_Sub3Array2, 0, Static157.anInt2854 - 1);
			for (local190 = 0; local190 < Static157.anInt2854; local190++) {
				Static464.method6401(Static547.aClass8_Sub3Array2[local190]);
			}
		}
		if (Static38.aBoolean55) {
			Static402.aClass134_11.method6953(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static567.anInt9400; local190 < Static175.anInt9133; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static44.aBooleanArrayArray1.length;
				if (Static562.anInt9353 + Static44.aBooleanArrayArray1.length > Static27.anInt373) {
					local278 -= Static562.anInt9353 + Static44.aBooleanArrayArray1.length - Static27.anInt373;
				}
				local298 = Static44.aBooleanArrayArray1[0].length;
				if (Static426.anInt7375 + Static44.aBooleanArrayArray1[0].length > Static507.anInt8645) {
					local298 -= Static426.anInt7375 + Static44.aBooleanArrayArray1[0].length - Static507.anInt8645;
				}
				local319 = Static228.aBooleanArrayArray2;
				if (Static401.aBoolean564) {
					if (Static514.aBoolean677) {
						local319 = Static587.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static424.anInt7346; local329 < local278; local329++) {
						local336 = local329 + Static562.anInt9353 - Static424.anInt7346;
						for (local338 = Static304.anInt5269; local338 < local298; local338++) {
							if (Static44.aBooleanArrayArray1[local329][local338] && !Static548.method7005(local190, local336, local338 + Static426.anInt7375 - Static304.anInt5269)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static514.aBoolean677) {
					Static199.aClass47Array1[local190].method7553(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static503.anInt8607; local329++) {
						Static465.aClass160Array1[local329].method3426(new Class8_Sub10(local190 + 1));
					}
				} else if (Static257.aBoolean350) {
					Static199.aClass47Array1[local190].method7551(Static258.anInt4643, Static312.anInt5339, Static240.anInt4447, Static228.aBooleanArrayArray2, true, Static125.anInt2499);
				} else {
					Static199.aClass47Array1[local190].method7553(Static258.anInt4643, Static312.anInt5339, Static240.anInt4447, Static228.aBooleanArrayArray2, true);
				}
			} else {
				local278 = Static44.aBooleanArrayArray1.length;
				if (Static562.anInt9353 + Static44.aBooleanArrayArray1.length > Static27.anInt373) {
					local278 -= Static562.anInt9353 + Static44.aBooleanArrayArray1.length - Static27.anInt373;
				}
				local298 = Static44.aBooleanArrayArray1[0].length;
				if (Static426.anInt7375 + Static44.aBooleanArrayArray1[0].length > Static507.anInt8645) {
					local298 -= Static426.anInt7375 + Static44.aBooleanArrayArray1[0].length - Static507.anInt8645;
				}
				local319 = Static228.aBooleanArrayArray2;
				if (Static401.aBoolean564) {
					if (Static514.aBoolean677) {
						local319 = Static587.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static424.anInt7346; local329 < local278; local329++) {
						local336 = local329 + Static562.anInt9353 - Static424.anInt7346;
						for (local338 = Static304.anInt5269; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static44.aBooleanArrayArray1[local329][local338]) {
								@Pc(357) int local357 = local338 + Static426.anInt7375 - Static304.anInt5269;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static292.aClass39ArrayArrayArray2[local359][local336][local357] != null && Static292.aClass39ArrayArrayArray2[local359][local336][local357].aByte21 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static548.method7005(local190, local336, local357)) {
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
				if (Static514.aBoolean677) {
					Static199.aClass47Array1[local190].method7553(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static503.anInt8607; local329++) {
						Static465.aClass160Array1[local329].method3426(new Class8_Sub10(local190 + 1));
					}
				} else if (Static257.aBoolean350) {
					Static199.aClass47Array1[local190].method7551(Static258.anInt4643, Static312.anInt5339, Static240.anInt4447, Static228.aBooleanArrayArray2, false, Static125.anInt2499);
				} else {
					Static199.aClass47Array1[local190].method7553(Static258.anInt4643, Static312.anInt5339, Static240.anInt4447, Static228.aBooleanArrayArray2, false);
				}
			}
		}
		if (Static404.anInt7075 > 0) {
			Static8.method97(Static72.aClass8_Sub3Array1, 0, Static404.anInt7075 - 1);
			for (local278 = 0; local278 < Static404.anInt7075; local278++) {
				Static464.method6401(Static72.aClass8_Sub3Array1[local278]);
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIII)V")
	public static void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(11, arg2);
		local8.method6594();
		local8.anInt8204 = arg1;
		local8.anInt8208 = arg0;
	}
}
