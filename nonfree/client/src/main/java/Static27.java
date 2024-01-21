import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "Lclient!h;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_165 = Static65.method1172("Texturen geladen)3");

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!kb;")
	public static Class46 aClass46_166 = Static65.method1172("<)4col> x");

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
	public static int anInt610 = 0;

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
	public static int anInt614 = -2;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
	public static void method443() {
		aClass33_1 = null;
		aClass46_166 = null;
		aClass46_165 = null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI)V")
	public static void method445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static133.aClass3_Sub4_Sub1_3.method233(231);
		Static133.aClass3_Sub4_Sub1_3.method215(arg1);
		Static133.aClass3_Sub4_Sub1_3.method170(arg0);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([BIBI)I")
	public static int method446(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = arg2; local17 < arg1; local17++) {
			local7 = local7 >>> 8 ^ Class67.anIntArray340[(arg0[local17] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZIII)V")
	public static void method447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static46.anInt1263 = 0;
		@Pc(76) int local76;
		for (@Pc(9) int local9 = -1; local9 < Static174.anInt3804 + Static180.anInt3971; local9++) {
			@Pc(27) Class3_Sub2_Sub1_Sub1 local27;
			if (local9 == -1) {
				local27 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1;
			} else if (local9 < Static180.anInt3971) {
				local27 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[Static127.anIntArray338[local9]];
			} else {
				local27 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[Static42.anIntArray106[local9 - Static180.anInt3971]];
			}
			if (local27 != null && local27.method1161()) {
				@Pc(56) Class3_Sub2_Sub16 local56;
				if (local27 instanceof Class3_Sub2_Sub1_Sub1_Sub2) {
					local56 = ((Class3_Sub2_Sub1_Sub1_Sub2) local27).aClass3_Sub2_Sub16_1;
					if (local56.anIntArray428 != null) {
						local56 = local56.method2747();
					}
					if (local56 == null) {
						continue;
					}
				}
				if (local9 >= Static180.anInt3971) {
					local56 = ((Class3_Sub2_Sub1_Sub1_Sub2) local27).aClass3_Sub2_Sub16_1;
					if (local56.anIntArray428 != null) {
						local56 = local56.method2747();
					}
					if (local56.anInt3811 >= 0 && Static60.aClass3_Sub2_Sub3_Sub3Array4.length > local56.anInt3811) {
						Static19.method363(local27, local27.method1167() + 15);
						if (Static24.anInt561 > -1) {
							Static60.aClass3_Sub2_Sub3_Sub3Array4[local56.anInt3811].method1880(Static24.anInt561 + arg2 - 12, Static33.anInt920 + -30 + arg0);
						}
					}
					if (Static34.anInt955 == 1 && Static133.anInt3123 == Static42.anIntArray106[local9 - Static180.anInt3971] && Static20.anInt512 % 20 < 10) {
						Static19.method363(local27, local27.method1167() + 15);
						if (Static24.anInt561 > -1) {
							Static101.aClass3_Sub2_Sub3_Sub3Array9[0].method1880(Static24.anInt561 + arg2 - 12, arg0 + -28 - -Static33.anInt920);
						}
					}
				} else {
					local76 = 30;
					@Pc(79) Class3_Sub2_Sub1_Sub1_Sub1 local79 = (Class3_Sub2_Sub1_Sub1_Sub1) local27;
					if (local79.anInt890 != -1 || local79.anInt902 != -1) {
						Static19.method363(local27, local27.method1167() + 15);
						if (Static24.anInt561 > -1) {
							if (local79.anInt890 != -1) {
								Static95.aClass3_Sub2_Sub3_Sub3Array6[local79.anInt890].method1880(Static24.anInt561 + arg2 - 12, arg0 + Static33.anInt920 + -30);
								local76 += 25;
							}
							if (local79.anInt902 != -1) {
								Static60.aClass3_Sub2_Sub3_Sub3Array4[local79.anInt902].method1880(arg2 + Static24.anInt561 - 12, -local76 + arg0 + Static33.anInt920);
								local76 += 25;
							}
						}
					}
					if (local9 >= 0 && Static34.anInt955 == 10 && Static56.anInt1517 == Static127.anIntArray338[local9]) {
						Static19.method363(local27, local27.method1167() + 15);
						if (Static24.anInt561 > -1) {
							Static101.aClass3_Sub2_Sub3_Sub3Array9[1].method1880(arg2 + Static24.anInt561 - 12, -local76 + Static33.anInt920 + arg0);
						}
					}
				}
				if (local27.aClass46_590 != null && (Static180.anInt3971 <= local9 || Static151.anInt3416 == 0 || Static151.anInt3416 == 3 || Static151.anInt3416 == 1 && Static39.method2899(((Class3_Sub2_Sub1_Sub1_Sub1) local27).aClass46_233))) {
					Static19.method363(local27, local27.method1167());
					if (Static24.anInt561 > -1 && Static46.anInt1263 < Static112.anInt2654) {
						Static112.anIntArray296[Static46.anInt1263] = Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method813(local27.aClass46_590) / 2;
						Static112.anIntArray297[Static46.anInt1263] = Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.anInt1152;
						Static112.anIntArray293[Static46.anInt1263] = Static24.anInt561;
						Static112.anIntArray292[Static46.anInt1263] = Static33.anInt920;
						Static112.anIntArray298[Static46.anInt1263] = local27.anInt1716;
						Static112.anIntArray295[Static46.anInt1263] = local27.anInt1694;
						Static112.anIntArray294[Static46.anInt1263] = local27.anInt1730;
						Static112.aClass46Array15[Static46.anInt1263] = local27.aClass46_590;
						Static46.anInt1263++;
					}
				}
				if (local27.anInt1721 > Static20.anInt512) {
					Static19.method363(local27, local27.method1167() + 15);
					if (Static24.anInt561 > -1) {
						Static103.method2210(Static24.anInt561 + arg2 - 15, Static33.anInt920 + (arg0 - 3), local27.anInt1704, 5, 65280);
						Static103.method2210(Static24.anInt561 + arg2 + local27.anInt1704 - 15, Static33.anInt920 + -3 + arg0, 30 - local27.anInt1704, 5, 16711680);
					}
				}
				for (local76 = 0; local76 < 4; local76++) {
					if (Static20.anInt512 < local27.anIntArray162[local76]) {
						Static19.method363(local27, local27.method1167() / 2);
						if (Static24.anInt561 > -1) {
							if (local76 == 1) {
								Static33.anInt920 -= 20;
							}
							if (local76 == 2) {
								Static24.anInt561 -= 15;
								Static33.anInt920 -= 10;
							}
							if (local76 == 3) {
								Static33.anInt920 -= 10;
								Static24.anInt561 += 15;
							}
							Static100.aClass3_Sub2_Sub3_Sub3Array8[local27.anIntArray161[local76]].method1880(arg2 + Static24.anInt561 - 12, Static33.anInt920 + (arg0 - 12));
							Static178.aClass3_Sub2_Sub3_Sub1_Sub1_5.method805(Static57.method1068(local27.anIntArray159[local76]), arg2 + Static24.anInt561 - 1, Static33.anInt920 + 3 + arg0, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(508) int local508 = 0; local508 < Static46.anInt1263; local508++) {
			local76 = Static112.anIntArray293[local508];
			@Pc(523) int local523 = Static112.anIntArray292[local508];
			@Pc(527) int local527 = Static112.anIntArray296[local508];
			@Pc(531) int local531 = Static112.anIntArray297[local508];
			@Pc(533) boolean local533 = true;
			while (local533) {
				local533 = false;
				for (@Pc(539) int local539 = 0; local539 < local508; local539++) {
					if (local523 + 2 > Static112.anIntArray292[local539] + -Static112.anIntArray297[local539] && local523 - local531 < Static112.anIntArray292[local539] - -2 && Static112.anIntArray293[local539] + Static112.anIntArray296[local539] > -local527 + local76 && Static112.anIntArray293[local539] - Static112.anIntArray296[local539] < local527 + local76 && Static112.anIntArray292[local539] - Static112.anIntArray297[local539] < local523) {
						local533 = true;
						local523 = Static112.anIntArray292[local539] - Static112.anIntArray297[local539];
					}
				}
			}
			Static24.anInt561 = Static112.anIntArray293[local508];
			Static33.anInt920 = Static112.anIntArray292[local508] = local523;
			@Pc(636) Class46 local636 = Static112.aClass46Array15[local508];
			if (Static158.anInt3511 == 0) {
				@Pc(654) int local654 = 16776960;
				if (Static112.anIntArray298[local508] < 6) {
					local654 = Static34.anIntArray78[Static112.anIntArray298[local508]];
				}
				if (Static112.anIntArray298[local508] == 6) {
					local654 = Static42.anInt1175 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static112.anIntArray298[local508] == 7) {
					local654 = Static42.anInt1175 % 20 >= 10 ? 65535 : 255;
				}
				if (Static112.anIntArray298[local508] == 8) {
					local654 = Static42.anInt1175 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(729) int local729;
				if (Static112.anIntArray298[local508] == 9) {
					local729 = 150 - Static112.anIntArray294[local508];
					if (local729 < 50) {
						local654 = local729 * 1280 + 16711680;
					} else if (local729 < 100) {
						local654 = 16776960 - (local729 - 50) * 327680;
					} else if (local729 < 150) {
						local654 = local729 * 5 + 65280 - 500;
					}
				}
				if (Static112.anIntArray298[local508] == 10) {
					local729 = 150 - Static112.anIntArray294[local508];
					if (local729 < 50) {
						local654 = local729 * 5 + 16711680;
					} else if (local729 < 100) {
						local654 = 16711935 - (local729 - 50) * 327680;
					} else if (local729 < 150) {
						local654 = local729 * 327680 + 500 + 255 - local729 * 5 - 32768000;
					}
				}
				if (Static112.anIntArray298[local508] == 11) {
					local729 = 150 - Static112.anIntArray294[local508];
					if (local729 < 50) {
						local654 = 16777215 - local729 * 327685;
					} else if (local729 < 100) {
						local654 = local729 * 327685 + 65280 - 16384250;
					} else if (local729 < 150) {
						local654 = 49545215 - local729 * 327680;
					}
				}
				if (Static112.anIntArray295[local508] == 0) {
					Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method805(local636, Static24.anInt561 + arg2, arg0 + Static33.anInt920, local654, 0);
				}
				if (Static112.anIntArray295[local508] == 1) {
					Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method806(local636, Static24.anInt561 + arg2, arg0 + Static33.anInt920, local654, Static42.anInt1175);
				}
				if (Static112.anIntArray295[local508] == 2) {
					Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method810(local636, Static24.anInt561 + arg2, arg0 - -Static33.anInt920, local654, Static42.anInt1175);
				}
				if (Static112.anIntArray295[local508] == 3) {
					Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method807(local636, Static24.anInt561 + arg2, arg0 + Static33.anInt920, local654, Static42.anInt1175, 150 - Static112.anIntArray294[local508]);
				}
				if (Static112.anIntArray295[local508] == 4) {
					local729 = (150 - Static112.anIntArray294[local508]) * (Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method813(local636) + 100) / 150;
					Static103.method2217(arg2 + Static24.anInt561 - 50, arg0, arg2 + Static24.anInt561 + 50, arg3 + arg0);
					Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method821(local636, arg2 + Static24.anInt561 + 50 - local729, arg0 - -Static33.anInt920, local654, 0);
					Static103.method2215(arg2, arg0, arg2 + arg1, arg3 + arg0);
				}
				if (Static112.anIntArray295[local508] == 5) {
					local729 = 150 - Static112.anIntArray294[local508];
					@Pc(1040) int local1040 = 0;
					Static103.method2217(arg2, Static33.anInt920 + arg0 - Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.anInt1152 - 1, arg1 + arg2, Static33.anInt920 + arg0 + 5);
					if (local729 < 25) {
						local1040 = local729 - 25;
					} else if (local729 > 125) {
						local1040 = local729 - 125;
					}
					Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method805(local636, Static24.anInt561 + arg2, Static33.anInt920 + arg0 + local1040, local654, 0);
					Static103.method2215(arg2, arg0, arg1 + arg2, arg3 + arg0);
				}
			} else {
				Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method805(local636, arg2 + Static24.anInt561, arg0 - -Static33.anInt920, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)I")
	public static int method448() {
		return Static160.anInt3569++;
	}
}
