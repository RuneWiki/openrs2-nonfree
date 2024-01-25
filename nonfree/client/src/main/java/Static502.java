import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Z")
	public static boolean method6781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static333.anInt6046; local1++) {
			@Pc(6) Class197 local6 = Static291.aClass197Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt5441 == 1) {
				local15 = local6.anInt5440 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt5439 + (local6.anInt5437 * local15 >> 8);
					local37 = local6.anInt5438 + (local6.anInt5444 * local15 >> 8);
					local47 = local6.anInt5429 + (local6.anInt5431 * local15 >> 8);
					local57 = local6.anInt5445 + (local6.anInt5436 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5441 == 2) {
				local15 = arg0 - local6.anInt5440;
				if (local15 > 0) {
					local27 = local6.anInt5439 + (local6.anInt5437 * local15 >> 8);
					local37 = local6.anInt5438 + (local6.anInt5444 * local15 >> 8);
					local47 = local6.anInt5429 + (local6.anInt5431 * local15 >> 8);
					local57 = local6.anInt5445 + (local6.anInt5436 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5441 == 3) {
				local15 = local6.anInt5439 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt5440 + (local6.anInt5433 * local15 >> 8);
					local37 = local6.anInt5448 + (local6.anInt5435 * local15 >> 8);
					local47 = local6.anInt5429 + (local6.anInt5431 * local15 >> 8);
					local57 = local6.anInt5445 + (local6.anInt5436 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5441 == 4) {
				local15 = arg2 - local6.anInt5439;
				if (local15 > 0) {
					local27 = local6.anInt5440 + (local6.anInt5433 * local15 >> 8);
					local37 = local6.anInt5448 + (local6.anInt5435 * local15 >> 8);
					local47 = local6.anInt5429 + (local6.anInt5431 * local15 >> 8);
					local57 = local6.anInt5445 + (local6.anInt5436 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt5441 == 5) {
				local15 = arg1 - local6.anInt5429;
				if (local15 > 0) {
					local27 = local6.anInt5440 + (local6.anInt5433 * local15 >> 8);
					local37 = local6.anInt5448 + (local6.anInt5435 * local15 >> 8);
					local47 = local6.anInt5439 + (local6.anInt5437 * local15 >> 8);
					local57 = local6.anInt5438 + (local6.anInt5444 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I[[[BIBII)V")
	private static void method6782(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static31.anInt4658++;
		Static371.anInt6583 = 0;
		@Pc(14) int local14;
		@Pc(17) int local17;
		for (@Pc(7) int local7 = Static128.anInt2923; local7 < Static107.anInt2060; local7++) {
			@Pc(12) Class276[][] local12 = Static270.aClass276ArrayArrayArray2[local7];
			for (local14 = Static257.anInt5018; local14 < Static68.anInt8339; local14++) {
				for (local17 = Static571.anInt9347; local17 < Static319.anInt5798; local17++) {
					@Pc(24) Class276 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static211.aBooleanArrayArray2[local14 + Static156.anInt3342 - Static213.anInt8691][local17 + Static156.anInt3342 - Static117.anInt2704] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean525 = true;
							local24.aBoolean526 = true;
							if (local24.aClass267_3 == null) {
								local24.aBoolean524 = false;
							} else {
								local24.aBoolean524 = true;
							}
							Static371.anInt6583++;
						} else {
							local24.aBoolean525 = false;
							local24.aBoolean526 = false;
							local24.aByte84 = 0;
							if (local14 >= Static213.anInt8691 - 16 && local14 <= Static213.anInt8691 + 16 && local17 >= Static117.anInt2704 - 16 && local17 <= Static117.anInt2704 + 16 && (local24.aClass4_Sub5_2 != null || local24.aClass4_Sub5_3 != null || local24.aClass4_Sub2_3 != null || local24.aClass4_Sub2_2 != null || local24.aClass4_Sub3_2 != null || local24.aClass267_3 != null)) {
								Static476.aClass1_1.method7674(local24);
							}
						}
					}
				}
			}
		}
		for (@Pc(140) int local140 = Static128.anInt2923; local140 < Static107.anInt2060; local140++) {
			if (Static394.aClass14_11.method6876() && local140 >= arg2 && arg1 != null) {
				local14 = Static211.aBooleanArrayArray2.length;
				if (Static257.anInt5018 + Static211.aBooleanArrayArray2.length > Static401.anInt7022) {
					local14 -= Static257.anInt5018 + Static211.aBooleanArrayArray2.length - Static401.anInt7022;
				}
				local17 = Static211.aBooleanArrayArray2[0].length;
				if (Static571.anInt9347 + Static211.aBooleanArrayArray2[0].length > Static555.anInt9182) {
					local17 -= Static571.anInt9347 + Static211.aBooleanArrayArray2[0].length - Static555.anInt9182;
				}
				@Pc(193) int local193 = Static599.anInt9633;
				while (true) {
					if (local193 >= local14) {
						Static476.aClass1_1.method7671(true, local140, Static133.aClass59Array3[local140]);
						break;
					}
					@Pc(200) int local200 = local193 + Static257.anInt5018 - Static599.anInt9633;
					for (@Pc(202) int local202 = Static493.anInt8291; local202 < local17; local202++) {
						Static472.aBooleanArrayArray8[local193][local202] = false;
						if (Static211.aBooleanArrayArray2[local193][local202]) {
							@Pc(221) int local221 = local202 + Static571.anInt9347 - Static493.anInt8291;
							for (@Pc(223) int local223 = local140; local223 >= 0; local223--) {
								if (Static270.aClass276ArrayArrayArray2[local223][local200][local221] != null && Static270.aClass276ArrayArrayArray2[local223][local200][local221].aByte85 == local140) {
									Static472.aBooleanArrayArray8[local193][local202] = Static270.aClass276ArrayArrayArray2[local223][local200][local221].aBoolean525;
									break;
								}
							}
						}
					}
					local193++;
				}
			} else {
				Static476.aClass1_1.method7671(false, local140, Static133.aClass59Array3[local140]);
			}
			Static476.aClass1_1.method7677();
		}
		if (!Static51.method1128(true)) {
			Static51.method1128(false);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[F)[F")
	public static float[] method6784(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static601.method2935(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILclient!d;)V")
	public static void method6785(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1) {
		Static133.aClass59Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!oa;IILclient!q;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method6790(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class54 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static394.aClass14_11 = arg0;
		Static233.anInt4741 = arg1;
		Static81.aClass54_4 = arg3;
		Static129.aBoolean209 = Static394.aClass14_11.method6847() > 0;
		Static213.anInt8691 = arg4 >> Static339.anInt6128;
		Static117.anInt2704 = arg6 >> Static339.anInt6128;
		Static170.anInt3628 = arg4;
		Static478.anInt8129 = arg6;
		Static573.anInt9415 = arg5;
		Static257.anInt5018 = Static213.anInt8691 - Static156.anInt3342;
		if (Static257.anInt5018 < 0) {
			Static599.anInt9633 = -Static257.anInt5018;
			Static257.anInt5018 = 0;
		} else {
			Static599.anInt9633 = 0;
		}
		Static571.anInt9347 = Static117.anInt2704 - Static156.anInt3342;
		if (Static571.anInt9347 < 0) {
			Static493.anInt8291 = -Static571.anInt9347;
			Static571.anInt9347 = 0;
		} else {
			Static493.anInt8291 = 0;
		}
		Static68.anInt8339 = Static213.anInt8691 + Static156.anInt3342;
		if (Static68.anInt8339 > Static401.anInt7022) {
			Static68.anInt8339 = Static401.anInt7022;
		}
		Static319.anInt5798 = Static117.anInt2704 + Static156.anInt3342;
		if (Static319.anInt5798 > Static555.anInt9182) {
			Static319.anInt5798 = Static555.anInt9182;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static156.anInt3342 + Static156.anInt3342 + 2; local74++) {
			for (local77 = 0; local77 < Static156.anInt3342 + Static156.anInt3342 + 2; local77++) {
				local84 = Static213.anInt8691 + local74 - Static156.anInt3342;
				local90 = Static117.anInt2704 + local77 - Static156.anInt3342;
				if (local84 >= 0 && local90 >= 0 && local84 < Static401.anInt7022 && local90 < Static555.anInt9182) {
					@Pc(104) int local104 = local84 << Static339.anInt6128;
					@Pc(108) int local108 = local90 << Static339.anInt6128;
					@Pc(124) int local124 = Static273.aClass59Array4[Static273.aClass59Array4.length - 1].JA(local84, local90) - (0x3E8 << Static339.anInt6128 - 7);
					@Pc(144) int local144 = Static49.aClass59Array2 == null ? Static273.aClass59Array4[0].JA(local84, local90) + Static112.anInt2178 : Static49.aClass59Array2[0].JA(local84, local90) + Static112.anInt2178;
					Static472.aBooleanArrayArray8[local74][local77] = Static394.aClass14_11.FA(local104, local124, local108, local104, local144, local108);
				} else {
					Static472.aBooleanArrayArray8[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static156.anInt3342 + Static156.anInt3342 + 1; local77++) {
			for (local84 = 0; local84 < Static156.anInt3342 + Static156.anInt3342 + 1; local84++) {
				Static211.aBooleanArrayArray2[local77][local84] = Static472.aBooleanArrayArray8[local77][local84] || Static472.aBooleanArrayArray8[local77 + 1][local84] || Static472.aBooleanArrayArray8[local77][local84 + 1] || Static472.aBooleanArrayArray8[local77 + 1][local84 + 1];
			}
		}
		Static534.anIntArray650 = arg8;
		Static46.anIntArray48 = arg9;
		Static143.anIntArray190 = arg10;
		Static565.anIntArray492 = arg11;
		Static462.anIntArray581 = arg12;
		Static472.method6552();
		Static172.method3193(Static394.aClass14_11);
		for (@Pc(261) Class98_Sub8 local261 = (Class98_Sub8) Static98.aClass40_2.method1132(); local261 != null; local261 = (Class98_Sub8) Static98.aClass40_2.method1129()) {
			local261.method7855();
			Static225.method4018(local261);
		}
		if (Static129.aBoolean209) {
			for (local90 = 0; local90 < Static573.anInt9406; local90++) {
				Static478.aClass78Array1[local90].method1923(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static394.aClass14_11.method6850(0);
			if (Static476.aClass1_1 == null || Static476.aClass1_1 instanceof Class1_Sub2) {
				Static476.aClass1_1 = new Class1_Sub1();
			}
		} else if (Static476.aClass1_1 == null || Static476.aClass1_1 instanceof Class1_Sub1) {
			Static476.aClass1_1 = new Class1_Sub2();
		}
		Static476.aClass1_1.method7672(arg2);
		Static476.aClass1_1.method7677();
		if (Static48.aClass276ArrayArrayArray1 != null) {
			Static428.method6156(true);
			Static476.aClass1_1.method7678(22);
			method6782(arg2, null, 0, (byte) 0, arg15, arg16);
			Static476.aClass1_1.method7677();
			Static476.aClass1_1.method7678(23);
			Static428.method6156(false);
		}
		method6782(arg2, arg7, arg13, arg14, arg15, arg16);
		Static476.aClass1_1.method7677();
		Static476.aClass1_1.method7673();
		Static476.aClass1_1.method7677();
		if (arg2 > 1) {
			Static394.aClass14_11.method6873(0);
		}
		Static394.aClass14_11.method6869(0, null);
	}
}
