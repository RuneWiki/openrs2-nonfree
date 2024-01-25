import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "Lclient!qh;")
	public static Class3_Sub11 aClass3_Sub11_2;

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
	public static int anInt5878 = 0;

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_8 = new Class158(2, 4, 4, 0);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!r;IIIIIIZZ)V")
	public static void method5083(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static482.aClass43_12 = arg0;
		Static138.anInt2946 = arg1;
		Static495.aBoolean622 = Static138.anInt2946 > 1 && Static482.aClass43_12.method7153();
		Static458.anInt7508 = 9;
		Static511.anInt8116 = 0x1 << Static458.anInt7508;
		Static122.anInt2780 = Static511.anInt8116 >> 1;
		Math.sqrt((double) (Static122.anInt2780 * Static122.anInt2780 + Static122.anInt2780 * Static122.anInt2780));
		Static499.anInt7950 = 4;
		Static411.anInt6927 = arg2;
		Static157.anInt3168 = arg3;
		Static266.anInt4982 = arg4;
		Static426.aClass25_1 = Static35.method620();
		Static265.method4348();
		Static106.aClass63ArrayArrayArray1 = new Class63[4][Static411.anInt6927][Static157.anInt3168];
		Static374.aClass139Array17 = new Class139[4];
		if (arg5) {
			Static309.anIntArrayArray10 = new int[Static411.anInt6927][Static157.anInt3168];
			Static218.aByteArrayArray12 = new byte[Static411.anInt6927][Static157.anInt3168];
			Static466.aShortArrayArray83 = new short[Static411.anInt6927][Static157.anInt3168];
			Static492.aClass63ArrayArrayArray3 = new Class63[1][Static411.anInt6927][Static157.anInt3168];
			Static168.aClass139Array22 = new Class139[1];
		} else {
			Static309.anIntArrayArray10 = null;
			Static218.aByteArrayArray12 = null;
			Static466.aShortArrayArray83 = null;
			Static492.aClass63ArrayArrayArray3 = null;
			Static168.aClass139Array22 = null;
		}
		if (arg6) {
			Static548.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static569.aClass258Array1 = new Class258[65535];
			Static302.aBooleanArray31 = new boolean[65535];
			Static218.anInt4299 = 0;
		} else {
			Static548.aLongArrayArrayArray1 = null;
			Static569.aClass258Array1 = null;
			Static302.aBooleanArray31 = null;
			Static218.anInt4299 = 0;
		}
		Static226.method3890(false);
		Static499.aClass9_Sub1ArrayArray3 = new Class9_Sub1[2][];
		Static499.aClass9_Sub1ArrayArray3[0] = new Class9_Sub1[Static425.anIntArray561[0]];
		Static499.aClass9_Sub1ArrayArray3[1] = new Class9_Sub1[Static425.anIntArray561[1]];
		Static332.anIntArray459 = new int[2];
		Static239.aClass9_Sub1ArrayArray2 = new Class9_Sub1[2][];
		Static239.aClass9_Sub1ArrayArray2[0] = new Class9_Sub1[Static113.anIntArray190[0]];
		Static239.aClass9_Sub1ArrayArray2[1] = new Class9_Sub1[Static113.anIntArray190[1]];
		Static343.anIntArray471 = new int[2];
		Static225.aClass9_Sub1ArrayArray1 = new Class9_Sub1[2][];
		Static225.aClass9_Sub1ArrayArray1[0] = new Class9_Sub1[Static183.anIntArray305[0]];
		Static225.aClass9_Sub1ArrayArray1[1] = new Class9_Sub1[Static183.anIntArray305[1]];
		Static1.anIntArray1 = new int[2];
		Static381.aClass9_Sub1Array2 = new Class9_Sub1[10000];
		Static48.anInt1029 = 0;
		Static85.aClass9_Sub1Array1 = new Class9_Sub1[5000];
		Static350.anInt8132 = 0;
		Static288.aClass9_Sub1_Sub1Array1 = new Class9_Sub1_Sub1[5000];
		Static472.anInt7698 = 0;
		Static356.aBooleanArrayArray5 = new boolean[Static266.anInt4982 + Static266.anInt4982 + 1][Static266.anInt4982 + Static266.anInt4982 + 1];
		Static197.aBooleanArrayArray1 = new boolean[Static266.anInt4982 + Static266.anInt4982 + 2][Static266.anInt4982 + Static266.anInt4982 + 2];
		if (Static495.aBoolean622) {
			Static385.aBooleanArrayArrayArray2 = new boolean[4][Static266.anInt4982 + Static266.anInt4982 + 1][Static266.anInt4982 + Static266.anInt4982 + 1];
			Static48.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static488.aClass313Array1 != null) {
				Static474.method6507();
			}
			Static488.aClass313Array1 = new Class313[Static138.anInt2946];
			Static482.aClass43_12.method7157(Static488.aClass313Array1.length + 1);
			Static482.aClass43_12.method7141(0);
			for (@Pc(247) int local247 = 0; local247 < Static488.aClass313Array1.length; local247++) {
				Static488.aClass313Array1[local247] = new Class313(local247 + 1, Static482.aClass43_12);
				(new Thread(Static488.aClass313Array1[local247], "wr" + local247)).start();
			}
			@Pc(282) byte local282;
			if (Static138.anInt2946 == 2) {
				local282 = 4;
				Static77.anInt1994 = 2;
			} else if (Static138.anInt2946 == 3) {
				local282 = 6;
				Static77.anInt1994 = 3;
			} else {
				local282 = 8;
				Static77.anInt1994 = 4;
			}
			Static366.aClass66Array1 = new Class66[local282];
			for (@Pc(302) int local302 = 0; local302 < local282; local302++) {
				Static366.aClass66Array1[local302] = new Class66(Static479.aStringArrayArray1[Static138.anInt2946 - 2][local302]);
			}
		} else {
			Static77.anInt1994 = 1;
		}
		Static228.anIntArray130 = new int[Static77.anInt1994 - 1];
		Static188.anIntArray309 = new int[Static77.anInt1994 - 1];
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method5084(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static48.anInt1029 = 0;
		Static350.anInt8132 = 0;
		Static3.anInt50++;
		for (@Pc(15) int local15 = 0; local15 < Static332.anIntArray459[local5]; local15++) {
			if (!Static364.method6744(Static499.aClass9_Sub1ArrayArray3[local5][local15], arg0, arg1, arg2, arg3)) {
				Static287.method4544(Static499.aClass9_Sub1ArrayArray3[local5][local15]);
				if (Static499.aClass9_Sub1ArrayArray3[local5][local15].anInt8976 != -1) {
					Static381.aClass9_Sub1Array2[Static48.anInt1029++] = Static499.aClass9_Sub1ArrayArray3[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static343.anIntArray471[local5]; local61++) {
			if (!Static364.method6744(Static239.aClass9_Sub1ArrayArray2[local5][local61], arg0, arg1, arg2, arg3)) {
				Static287.method4544(Static239.aClass9_Sub1ArrayArray2[local5][local61]);
				if (Static239.aClass9_Sub1ArrayArray2[local5][local61].anInt8976 != -1) {
					Static85.aClass9_Sub1Array1[Static350.anInt8132++] = Static239.aClass9_Sub1ArrayArray2[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static1.anIntArray1[local5]; local107++) {
			if (!Static364.method6744(Static225.aClass9_Sub1ArrayArray1[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static225.aClass9_Sub1ArrayArray1[local5][local107].method7473()) {
					Static287.method4544(Static225.aClass9_Sub1ArrayArray1[local5][local107]);
					if (Static225.aClass9_Sub1ArrayArray1[local5][local107].anInt8976 != -1) {
						Static85.aClass9_Sub1Array1[Static350.anInt8132++] = Static225.aClass9_Sub1ArrayArray1[local5][local107];
					}
				} else {
					Static287.method4544(Static225.aClass9_Sub1ArrayArray1[local5][local107]);
					if (Static225.aClass9_Sub1ArrayArray1[local5][local107].anInt8976 != -1) {
						Static381.aClass9_Sub1Array2[Static48.anInt1029++] = Static225.aClass9_Sub1ArrayArray1[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static472.anInt7698; local190++) {
				if (!Static364.method6744(Static288.aClass9_Sub1_Sub1Array1[local190], arg0, arg1, arg2, arg3)) {
					Static287.method4544(Static288.aClass9_Sub1_Sub1Array1[local190]);
					if (Static288.aClass9_Sub1_Sub1Array1[local190].anInt8976 != -1) {
						if (Static288.aClass9_Sub1_Sub1Array1[local190].method7473()) {
							Static85.aClass9_Sub1Array1[Static350.anInt8132++] = Static288.aClass9_Sub1_Sub1Array1[local190];
						} else {
							Static381.aClass9_Sub1Array2[Static48.anInt1029++] = Static288.aClass9_Sub1_Sub1Array1[local190];
						}
					}
				}
			}
		}
		if (Static48.anInt1029 > 0) {
			Static545.method7253(Static381.aClass9_Sub1Array2, 0, Static48.anInt1029 - 1);
			for (local190 = 0; local190 < Static48.anInt1029; local190++) {
				Static217.method3786(Static381.aClass9_Sub1Array2[local190]);
			}
		}
		if (Static21.aBoolean44) {
			Static482.aClass43_12.method7149(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static137.anInt2940; local190 < Static499.anInt7950; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static356.aBooleanArrayArray5.length;
				if (Static269.anInt5039 + Static356.aBooleanArrayArray5.length > Static411.anInt6927) {
					local278 -= Static269.anInt5039 + Static356.aBooleanArrayArray5.length - Static411.anInt6927;
				}
				local298 = Static356.aBooleanArrayArray5[0].length;
				if (Static115.anInt2655 + Static356.aBooleanArrayArray5[0].length > Static157.anInt3168) {
					local298 -= Static115.anInt2655 + Static356.aBooleanArrayArray5[0].length - Static157.anInt3168;
				}
				local319 = Static197.aBooleanArrayArray1;
				if (Static231.aBoolean340) {
					if (Static495.aBoolean622) {
						local319 = Static385.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static383.anInt6590; local329 < local278; local329++) {
						local336 = local329 + Static269.anInt5039 - Static383.anInt6590;
						for (local338 = Static17.anInt271; local338 < local298; local338++) {
							if (Static356.aBooleanArrayArray5[local329][local338] && !Static477.method6554(local336, local190, local338 + Static115.anInt2655 - Static17.anInt271)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static495.aBoolean622) {
					Static29.aClass139Array6[local190].method6882(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static138.anInt2946; local329++) {
						Static366.aClass66Array1[local329].method2154(new Class9_Sub5(local190 + 1));
					}
				} else if (Static102.aBoolean84) {
					Static29.aClass139Array6[local190].method6887(Static210.anInt4205, Static12.anInt136, Static266.anInt4982, Static197.aBooleanArrayArray1, true, Static235.anInt4458);
				} else {
					Static29.aClass139Array6[local190].method6882(Static210.anInt4205, Static12.anInt136, Static266.anInt4982, Static197.aBooleanArrayArray1, true);
				}
			} else {
				local278 = Static356.aBooleanArrayArray5.length;
				if (Static269.anInt5039 + Static356.aBooleanArrayArray5.length > Static411.anInt6927) {
					local278 -= Static269.anInt5039 + Static356.aBooleanArrayArray5.length - Static411.anInt6927;
				}
				local298 = Static356.aBooleanArrayArray5[0].length;
				if (Static115.anInt2655 + Static356.aBooleanArrayArray5[0].length > Static157.anInt3168) {
					local298 -= Static115.anInt2655 + Static356.aBooleanArrayArray5[0].length - Static157.anInt3168;
				}
				local319 = Static197.aBooleanArrayArray1;
				if (Static231.aBoolean340) {
					if (Static495.aBoolean622) {
						local319 = Static385.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static383.anInt6590; local329 < local278; local329++) {
						local336 = local329 + Static269.anInt5039 - Static383.anInt6590;
						for (local338 = Static17.anInt271; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static356.aBooleanArrayArray5[local329][local338]) {
								@Pc(357) int local357 = local338 + Static115.anInt2655 - Static17.anInt271;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static554.aClass63ArrayArrayArray4[local359][local336][local357] != null && Static554.aClass63ArrayArrayArray4[local359][local336][local357].aByte37 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static477.method6554(local336, local190, local357)) {
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
				if (Static495.aBoolean622) {
					Static29.aClass139Array6[local190].method6882(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static138.anInt2946; local329++) {
						Static366.aClass66Array1[local329].method2154(new Class9_Sub5(local190 + 1));
					}
				} else if (Static102.aBoolean84) {
					Static29.aClass139Array6[local190].method6887(Static210.anInt4205, Static12.anInt136, Static266.anInt4982, Static197.aBooleanArrayArray1, false, Static235.anInt4458);
				} else {
					Static29.aClass139Array6[local190].method6882(Static210.anInt4205, Static12.anInt136, Static266.anInt4982, Static197.aBooleanArrayArray1, false);
				}
			}
		}
		if (Static350.anInt8132 > 0) {
			Static449.method6270(Static85.aClass9_Sub1Array1, 0, Static350.anInt8132 - 1);
			for (local278 = 0; local278 < Static350.anInt8132; local278++) {
				Static217.method3786(Static85.aClass9_Sub1Array1[local278]);
			}
		}
	}
}
