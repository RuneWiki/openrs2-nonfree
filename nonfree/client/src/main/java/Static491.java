import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "[Lclient!f;")
	public static Class39[] aClass39Array13;

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
	public static int anInt5542;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "[I")
	public static final int[] anIntArray411 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method4639(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static223.anInt4187 = 0;
		Static524.anInt8650 = 0;
		Static83.anInt1807++;
		for (@Pc(15) int local15 = 0; local15 < Static26.anIntArray39[local5]; local15++) {
			if (!Static64.method1028(Static3.aClass6_Sub1ArrayArray1[local5][local15], arg0, arg1, arg2, arg3)) {
				Static433.method6131(Static3.aClass6_Sub1ArrayArray1[local5][local15]);
				if (Static3.aClass6_Sub1ArrayArray1[local5][local15].anInt8758 != -1) {
					Static208.aClass6_Sub1Array1[Static223.anInt4187++] = Static3.aClass6_Sub1ArrayArray1[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static142.anIntArray179[local5]; local61++) {
			if (!Static64.method1028(Static312.aClass6_Sub1ArrayArray3[local5][local61], arg0, arg1, arg2, arg3)) {
				Static433.method6131(Static312.aClass6_Sub1ArrayArray3[local5][local61]);
				if (Static312.aClass6_Sub1ArrayArray3[local5][local61].anInt8758 != -1) {
					Static546.aClass6_Sub1Array2[Static524.anInt8650++] = Static312.aClass6_Sub1ArrayArray3[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static53.anIntArray64[local5]; local107++) {
			if (!Static64.method1028(Static54.aClass6_Sub1ArrayArray2[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static54.aClass6_Sub1ArrayArray2[local5][local107].method7318()) {
					Static433.method6131(Static54.aClass6_Sub1ArrayArray2[local5][local107]);
					if (Static54.aClass6_Sub1ArrayArray2[local5][local107].anInt8758 != -1) {
						Static546.aClass6_Sub1Array2[Static524.anInt8650++] = Static54.aClass6_Sub1ArrayArray2[local5][local107];
					}
				} else {
					Static433.method6131(Static54.aClass6_Sub1ArrayArray2[local5][local107]);
					if (Static54.aClass6_Sub1ArrayArray2[local5][local107].anInt8758 != -1) {
						Static208.aClass6_Sub1Array1[Static223.anInt4187++] = Static54.aClass6_Sub1ArrayArray2[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static2.anInt11; local190++) {
				if (!Static64.method1028(Static497.aClass6_Sub1_Sub1Array1[local190], arg0, arg1, arg2, arg3)) {
					Static433.method6131(Static497.aClass6_Sub1_Sub1Array1[local190]);
					if (Static497.aClass6_Sub1_Sub1Array1[local190].anInt8758 != -1) {
						if (Static497.aClass6_Sub1_Sub1Array1[local190].method7318()) {
							Static546.aClass6_Sub1Array2[Static524.anInt8650++] = Static497.aClass6_Sub1_Sub1Array1[local190];
						} else {
							Static208.aClass6_Sub1Array1[Static223.anInt4187++] = Static497.aClass6_Sub1_Sub1Array1[local190];
						}
					}
				}
			}
		}
		if (Static223.anInt4187 > 0) {
			Static554.method7584(Static208.aClass6_Sub1Array1, 0, Static223.anInt4187 - 1);
			for (local190 = 0; local190 < Static223.anInt4187; local190++) {
				Static112.method1678(Static208.aClass6_Sub1Array1[local190]);
			}
		}
		if (Static222.aBoolean341) {
			Static356.aClass100_8.method6188(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static526.anInt8653; local190 < Static89.anInt8689; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static557.aBooleanArrayArray9.length;
				if (Static151.anInt3037 + Static557.aBooleanArrayArray9.length > Static496.anInt8369) {
					local278 -= Static151.anInt3037 + Static557.aBooleanArrayArray9.length - Static496.anInt8369;
				}
				local298 = Static557.aBooleanArrayArray9[0].length;
				if (Static99.anInt2048 + Static557.aBooleanArrayArray9[0].length > Static357.anInt6390) {
					local298 -= Static99.anInt2048 + Static557.aBooleanArrayArray9[0].length - Static357.anInt6390;
				}
				local319 = Static282.aBooleanArrayArray4;
				if (Static206.aBoolean325) {
					if (Static293.aBoolean419) {
						local319 = Static430.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static253.anInt4696; local329 < local278; local329++) {
						local336 = local329 + Static151.anInt3037 - Static253.anInt4696;
						for (local338 = Static565.anInt9254; local338 < local298; local338++) {
							if (Static557.aBooleanArrayArray9[local329][local338] && !Static563.method7642(local190, local336, local338 + Static99.anInt2048 - Static565.anInt9254)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static293.aBoolean419) {
					Static421.aClass67Array7[local190].method6715(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static427.anInt7297; local329++) {
						Static140.aClass72Array1[local329].method1354(new Class6_Sub10(local190 + 1));
					}
				} else if (Static316.aBoolean473) {
					Static421.aClass67Array7[local190].method6712(Static350.anInt6287, Static148.anInt3061, Static74.anInt1648, Static282.aBooleanArrayArray4, true, Static542.anInt8841);
				} else {
					Static421.aClass67Array7[local190].method6715(Static350.anInt6287, Static148.anInt3061, Static74.anInt1648, Static282.aBooleanArrayArray4, true);
				}
			} else {
				local278 = Static557.aBooleanArrayArray9.length;
				if (Static151.anInt3037 + Static557.aBooleanArrayArray9.length > Static496.anInt8369) {
					local278 -= Static151.anInt3037 + Static557.aBooleanArrayArray9.length - Static496.anInt8369;
				}
				local298 = Static557.aBooleanArrayArray9[0].length;
				if (Static99.anInt2048 + Static557.aBooleanArrayArray9[0].length > Static357.anInt6390) {
					local298 -= Static99.anInt2048 + Static557.aBooleanArrayArray9[0].length - Static357.anInt6390;
				}
				local319 = Static282.aBooleanArrayArray4;
				if (Static206.aBoolean325) {
					if (Static293.aBoolean419) {
						local319 = Static430.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static253.anInt4696; local329 < local278; local329++) {
						local336 = local329 + Static151.anInt3037 - Static253.anInt4696;
						for (local338 = Static565.anInt9254; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static557.aBooleanArrayArray9[local329][local338]) {
								@Pc(357) int local357 = local338 + Static99.anInt2048 - Static565.anInt9254;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static389.aClass346ArrayArrayArray2[local359][local336][local357] != null && Static389.aClass346ArrayArrayArray2[local359][local336][local357].aByte121 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static563.method7642(local190, local336, local357)) {
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
				if (Static293.aBoolean419) {
					Static421.aClass67Array7[local190].method6715(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static427.anInt7297; local329++) {
						Static140.aClass72Array1[local329].method1354(new Class6_Sub10(local190 + 1));
					}
				} else if (Static316.aBoolean473) {
					Static421.aClass67Array7[local190].method6712(Static350.anInt6287, Static148.anInt3061, Static74.anInt1648, Static282.aBooleanArrayArray4, false, Static542.anInt8841);
				} else {
					Static421.aClass67Array7[local190].method6715(Static350.anInt6287, Static148.anInt3061, Static74.anInt1648, Static282.aBooleanArrayArray4, false);
				}
			}
		}
		if (Static524.anInt8650 > 0) {
			Static386.method5689(Static546.aClass6_Sub1Array2, 0, Static524.anInt8650 - 1);
			for (local278 = 0; local278 < Static524.anInt8650; local278++) {
				Static112.method1678(Static546.aClass6_Sub1Array2[local278]);
			}
		}
	}
}
