import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!faa", name = "E", descriptor = "[I")
	public static int[] anIntArray135;

	@OriginalMember(owner = "client!faa", name = "F", descriptor = "I")
	public static int anInt2960;

	@OriginalMember(owner = "client!faa", name = "D", descriptor = "Lclient!oo;")
	public static final Class242 aClass242_5 = new Class242();

	@OriginalMember(owner = "client!faa", name = "L", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_64 = new Class56(90, 12);

	@OriginalMember(owner = "client!faa", name = "M", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 + arg2;
		@Pc(12) int local12 = arg4 + arg0;
		@Pc(17) int local17 = arg1 + arg3;
		if (!Static591.method7907(arg5, arg5, local12, local7, local17, local17, arg1, local12, local12)) {
			return false;
		} else if (Static591.method7907(local7, arg5, local12, local7, arg1, local17, arg1, local12, local12)) {
			if (Static565.anInt9225 > arg5) {
				if (!Static591.method7907(arg5, arg5, arg4, arg5, arg1, local17, local17, local12, local12)) {
					return false;
				}
				if (!Static591.method7907(arg5, arg5, arg4, arg5, arg1, arg1, local17, local12, arg4)) {
					return false;
				}
			} else if (!Static591.method7907(local7, local7, arg4, local7, arg1, local17, local17, local12, local12)) {
				return false;
			} else if (!Static591.method7907(local7, local7, arg4, local7, arg1, arg1, local17, local12, arg4)) {
				return false;
			}
			if (Static316.anInt5406 <= arg1) {
				if (!Static591.method7907(arg5, arg5, arg4, local7, local17, local17, local17, local12, local12)) {
					return false;
				}
				if (!Static591.method7907(local7, arg5, arg4, local7, local17, local17, local17, local12, arg4)) {
					return false;
				}
			} else if (!Static591.method7907(arg5, arg5, arg4, local7, arg1, arg1, arg1, local12, local12)) {
				return false;
			} else if (!Static591.method7907(local7, arg5, arg4, local7, arg1, arg1, arg1, local12, arg4)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method2671(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static90.anInt1894 = 0;
		Static122.anInt2802 = 0;
		Static414.anInt7057++;
		for (@Pc(15) int local15 = 0; local15 < Static279.anIntArray622[local5]; local15++) {
			if (!Static527.method7028(Static417.aClass41_Sub2ArrayArray1[local5][local15], arg0, arg1, arg2, arg3)) {
				Static568.method7644(Static417.aClass41_Sub2ArrayArray1[local5][local15]);
				if (Static417.aClass41_Sub2ArrayArray1[local5][local15].anInt9439 != -1) {
					Static516.aClass41_Sub2Array2[Static90.anInt1894++] = Static417.aClass41_Sub2ArrayArray1[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static462.anIntArray496[local5]; local61++) {
			if (!Static527.method7028(Static548.aClass41_Sub2ArrayArray3[local5][local61], arg0, arg1, arg2, arg3)) {
				Static568.method7644(Static548.aClass41_Sub2ArrayArray3[local5][local61]);
				if (Static548.aClass41_Sub2ArrayArray3[local5][local61].anInt9439 != -1) {
					Static390.aClass41_Sub2Array1[Static122.anInt2802++] = Static548.aClass41_Sub2ArrayArray3[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static505.anIntArray524[local5]; local107++) {
			if (!Static527.method7028(Static533.aClass41_Sub2ArrayArray2[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static533.aClass41_Sub2ArrayArray2[local5][local107].method7851()) {
					Static568.method7644(Static533.aClass41_Sub2ArrayArray2[local5][local107]);
					if (Static533.aClass41_Sub2ArrayArray2[local5][local107].anInt9439 != -1) {
						Static390.aClass41_Sub2Array1[Static122.anInt2802++] = Static533.aClass41_Sub2ArrayArray2[local5][local107];
					}
				} else {
					Static568.method7644(Static533.aClass41_Sub2ArrayArray2[local5][local107]);
					if (Static533.aClass41_Sub2ArrayArray2[local5][local107].anInt9439 != -1) {
						Static516.aClass41_Sub2Array2[Static90.anInt1894++] = Static533.aClass41_Sub2ArrayArray2[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static460.anInt6105; local190++) {
				if (!Static527.method7028(Static294.aClass41_Sub2_Sub1Array7[local190], arg0, arg1, arg2, arg3)) {
					Static568.method7644(Static294.aClass41_Sub2_Sub1Array7[local190]);
					if (Static294.aClass41_Sub2_Sub1Array7[local190].anInt9439 != -1) {
						if (Static294.aClass41_Sub2_Sub1Array7[local190].method7851()) {
							Static390.aClass41_Sub2Array1[Static122.anInt2802++] = Static294.aClass41_Sub2_Sub1Array7[local190];
						} else {
							Static516.aClass41_Sub2Array2[Static90.anInt1894++] = Static294.aClass41_Sub2_Sub1Array7[local190];
						}
					}
				}
			}
		}
		if (Static90.anInt1894 > 0) {
			Static57.method1010(Static516.aClass41_Sub2Array2, 0, Static90.anInt1894 - 1);
			for (local190 = 0; local190 < Static90.anInt1894; local190++) {
				Static265.method4043(Static516.aClass41_Sub2Array2[local190]);
			}
		}
		if (Static12.aBoolean593) {
			Static511.aClass45_12.method7413(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static164.anInt3319; local190 < Static459.anInt7698; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static562.aBooleanArrayArray7.length;
				if (Static325.anInt5509 + Static562.aBooleanArrayArray7.length > Static155.anInt3254) {
					local278 -= Static325.anInt5509 + Static562.aBooleanArrayArray7.length - Static155.anInt3254;
				}
				local298 = Static562.aBooleanArrayArray7[0].length;
				if (Static553.anInt8803 + Static562.aBooleanArrayArray7[0].length > Static39.anInt747) {
					local298 -= Static553.anInt8803 + Static562.aBooleanArrayArray7[0].length - Static39.anInt747;
				}
				local319 = Static387.aBooleanArrayArray2;
				if (Static512.aBoolean635) {
					if (Static74.aBoolean149) {
						local319 = Static128.aBooleanArrayArrayArray1[local190];
					}
					for (local329 = Static497.anInt8088; local329 < local278; local329++) {
						local336 = local329 + Static325.anInt5509 - Static497.anInt8088;
						for (local338 = Static65.anInt1512; local338 < local298; local338++) {
							if (Static562.aBooleanArrayArray7[local329][local338] && !Static238.method3671(local336, local190, local338 + Static553.anInt8803 - Static65.anInt1512)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static74.aBoolean149) {
					Static68.aClass34Array1[local190].method6526(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static89.anInt1889; local329++) {
						Static12.aClass187Array2[local329].method4390(new Class41_Sub6(local190 + 1));
					}
				} else if (Static167.aBoolean262) {
					Static68.aClass34Array1[local190].method6529(Static5.anInt120, Static394.anInt6891, Static453.anInt7589, Static387.aBooleanArrayArray2, true, Static566.anInt9218);
				} else {
					Static68.aClass34Array1[local190].method6526(Static5.anInt120, Static394.anInt6891, Static453.anInt7589, Static387.aBooleanArrayArray2, true);
				}
			} else {
				local278 = Static562.aBooleanArrayArray7.length;
				if (Static325.anInt5509 + Static562.aBooleanArrayArray7.length > Static155.anInt3254) {
					local278 -= Static325.anInt5509 + Static562.aBooleanArrayArray7.length - Static155.anInt3254;
				}
				local298 = Static562.aBooleanArrayArray7[0].length;
				if (Static553.anInt8803 + Static562.aBooleanArrayArray7[0].length > Static39.anInt747) {
					local298 -= Static553.anInt8803 + Static562.aBooleanArrayArray7[0].length - Static39.anInt747;
				}
				local319 = Static387.aBooleanArrayArray2;
				if (Static512.aBoolean635) {
					if (Static74.aBoolean149) {
						local319 = Static128.aBooleanArrayArrayArray1[local190];
					}
					for (local329 = Static497.anInt8088; local329 < local278; local329++) {
						local336 = local329 + Static325.anInt5509 - Static497.anInt8088;
						for (local338 = Static65.anInt1512; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static562.aBooleanArrayArray7[local329][local338]) {
								@Pc(357) int local357 = local338 + Static553.anInt8803 - Static65.anInt1512;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static309.aClass299ArrayArrayArray3[local359][local336][local357] != null && Static309.aClass299ArrayArrayArray3[local359][local336][local357].aByte101 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static238.method3671(local336, local190, local357)) {
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
				if (Static74.aBoolean149) {
					Static68.aClass34Array1[local190].method6526(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static89.anInt1889; local329++) {
						Static12.aClass187Array2[local329].method4390(new Class41_Sub6(local190 + 1));
					}
				} else if (Static167.aBoolean262) {
					Static68.aClass34Array1[local190].method6529(Static5.anInt120, Static394.anInt6891, Static453.anInt7589, Static387.aBooleanArrayArray2, false, Static566.anInt9218);
				} else {
					Static68.aClass34Array1[local190].method6526(Static5.anInt120, Static394.anInt6891, Static453.anInt7589, Static387.aBooleanArrayArray2, false);
				}
			}
		}
		if (Static122.anInt2802 > 0) {
			Static295.method4383(Static390.aClass41_Sub2Array1, 0, Static122.anInt2802 - 1);
			for (local278 = 0; local278 < Static122.anInt2802; local278++) {
				Static265.method4043(Static390.aClass41_Sub2Array1[local278]);
			}
		}
	}
}
