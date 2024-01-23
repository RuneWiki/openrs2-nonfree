import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
	public static int anInt4402;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
	public static int anInt4399 = 0;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
	public static int anInt4400 = 0;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "Z")
	public static boolean aBoolean355 = true;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
	public static int anInt4413 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILclient!eh;IJIIII)Z")
	public static boolean method3348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static34.method537(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(Z)V")
	public static void method3351() {
		for (@Pc(12) int local12 = 0; local12 < Static156.anInt3156; local12++) {
			@Pc(19) int local19 = Static157.anIntArray497[local12]--;
			if (Static157.anIntArray497[local12] >= -10) {
				@Pc(97) Class104 local97 = Static55.aClass104Array1[local12];
				if (local97 == null) {
					local97 = Static308.method2415(Static207.aClass132_72, Static113.anIntArray188[local12], 0);
					if (local97 == null) {
						continue;
					}
					Static157.anIntArray497[local12] += local97.method2416();
					Static55.aClass104Array1[local12] = local97;
				}
				if (Static157.anIntArray497[local12] < 0) {
					@Pc(144) int local144;
					if (Static102.anIntArray151[local12] == 0) {
						local144 = Static52.anIntArray81[local12] * Static172.anInt3426 >> 8;
					} else {
						@Pc(154) int local154 = (Static102.anIntArray151[local12] & 0xFF) * 128;
						@Pc(162) int local162 = Static102.anIntArray151[local12] >> 16 & 0xFF;
						@Pc(170) int local170 = Static102.anIntArray151[local12] >> 8 & 0xFF;
						@Pc(180) int local180 = local170 * 128 + 64 - Static21.aClass36_Sub3_Sub1_1.anInt4118;
						if (local180 < 0) {
							local180 = -local180;
						}
						@Pc(198) int local198 = local162 * 128 + 64 - Static21.aClass36_Sub3_Sub1_1.anInt4117;
						if (local198 < 0) {
							local198 = -local198;
						}
						@Pc(210) int local210 = local198 + local180 - 128;
						if (local210 > local154) {
							Static157.anIntArray497[local12] = -100;
							continue;
						}
						if (local210 < 0) {
							local210 = 0;
						}
						local144 = (local154 - local210) * Static106.anInt2205 * Static52.anIntArray81[local12] / local154 >> 8;
					}
					if (local144 > 0) {
						@Pc(248) Class8_Sub20_Sub1 local248 = local97.method2417().method3542(Static224.aClass75_1);
						@Pc(253) Class8_Sub8_Sub4 local253 = Static309.method3729(local248, local144);
						local253.method3716(Static42.anIntArray64[local12] - 1);
						Static84.aClass8_Sub8_Sub1_1.method834(local253);
					}
					Static157.anIntArray497[local12] = -100;
				}
			} else {
				Static156.anInt3156--;
				for (@Pc(36) int local36 = local12; local36 < Static156.anInt3156; local36++) {
					Static113.anIntArray188[local36] = Static113.anIntArray188[local36 + 1];
					Static55.aClass104Array1[local36] = Static55.aClass104Array1[local36 + 1];
					Static42.anIntArray64[local36] = Static42.anIntArray64[local36 + 1];
					Static157.anIntArray497[local36] = Static157.anIntArray497[local36 + 1];
					Static102.anIntArray151[local36] = Static102.anIntArray151[local36 + 1];
					Static52.anIntArray81[local36] = Static52.anIntArray81[local36 + 1];
				}
				local12--;
			}
		}
		if (Static140.aBoolean230 && !Static177.method1353()) {
			if (Static275.anInt5409 != 0 && Static236.anInt4769 != -1) {
				Static15.method283(Static88.aClass132_35, Static275.anInt5409, Static236.anInt4769);
			}
			Static140.aBoolean230 = false;
		} else if (Static275.anInt5409 != 0 && Static236.anInt4769 != -1 && !Static177.method1353()) {
			Static66.aClass8_Sub2_Sub1_4.method2398(33);
			Static66.aClass8_Sub2_Sub1_4.method2330(Static236.anInt4769);
			Static236.anInt4769 = -1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLclient!cm;I)V")
	public static void method3354(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub1_Sub5 arg1) {
		@Pc(9) int local9;
		if (Static116.aBoolean188 || arg0) {
			local9 = Static13.anInt356;
			@Pc(15) int local15 = local9 * 956 / 503;
			Static93.aClass8_Sub1_Sub7_4.method2808((Static250.anInt4959 - local15) / 2, 0, local15, local9);
			Static235.aClass43_1.method4298(Static250.anInt4959 / 2 - Static235.aClass43_1.anInt5710 / 2, 18);
		}
		arg1.method2040(Static206.aString151, Static250.anInt4959 / 2, Static13.anInt356 / 2 - 26, 16777215, -1);
		local9 = Static13.anInt356 / 2 - 18;
		if (Static116.aBoolean188) {
			Static126.method2004(Static250.anInt4959 / 2 - 152, local9, 304, 34, 9179409);
			Static126.method2004(Static250.anInt4959 / 2 - 151, local9 + 1, 302, 32, 0);
			Static126.method1994(Static250.anInt4959 / 2 - 150, local9 + 2, Static109.anInt2272 * 3, 30, 9179409);
			Static126.method1994(Static109.anInt2272 * 3 + Static250.anInt4959 / 2 - 150, local9 + 2, 300 - Static109.anInt2272 * 3, 30, 0);
		} else {
			Static103.method1669(Static250.anInt4959 / 2 - 152, local9, 304, 34, 9179409);
			Static103.method1669(Static250.anInt4959 / 2 - 151, local9 - -1, 302, 32, 0);
			Static103.method1664(Static250.anInt4959 / 2 - 150, local9 + 2, Static109.anInt2272 * 3, 30, 9179409);
			Static103.method1664(Static109.anInt2272 * 3 + Static250.anInt4959 / 2 - 150, local9 + 2, 300 - Static109.anInt2272 * 3, 30, 0);
		}
		arg1.method2040(Static180.aString125, Static250.anInt4959 / 2, Static13.anInt356 / 2 + 4, 16777215, -1);
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	public static void method3356() {
		if (Static247.anInt5536 == 0 || Static247.anInt5536 == 5) {
			return;
		}
		try {
			if (++Static62.anInt5014 > 2000) {
				if (Static95.aClass92_4 != null) {
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
				}
				if (Static272.anInt5358 >= 1) {
					Static247.anInt5536 = 0;
					Static130.anInt2600 = -5;
					return;
				}
				Static62.anInt5014 = 0;
				Static272.anInt5358++;
				if (Static159.anInt3248 == Static2.anInt8) {
					Static159.anInt3248 = Static190.anInt3820;
				} else {
					Static159.anInt3248 = Static2.anInt8;
				}
				Static247.anInt5536 = 1;
			}
			if (Static247.anInt5536 == 1) {
				Static39.aClass163_4 = Static199.aClass17_3.method445(Static224.aString162, Static159.anInt3248);
				Static247.anInt5536 = 2;
			}
			if (Static247.anInt5536 == 2) {
				if (Static39.aClass163_4.anInt5259 == 2) {
					throw new IOException();
				}
				if (Static39.aClass163_4.anInt5259 != 1) {
					return;
				}
				Static95.aClass92_4 = new Class92((Socket) Static39.aClass163_4.anObject7, Static199.aClass17_3);
				Static39.aClass163_4 = null;
				@Pc(105) long local105 = Static222.aLong165 = Static31.method513(Static20.aString18);
				Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
				@Pc(115) int local115 = (int) (local105 >> 16 & 0x1FL);
				Static66.aClass8_Sub2_Sub1_4.method2340(14);
				Static66.aClass8_Sub2_Sub1_4.method2340(local115);
				Static95.aClass92_4.method2178(Static66.aClass8_Sub2_Sub1_4.aByteArray24, 2);
				if (Static153.aClass111_2 != null) {
					Static153.aClass111_2.method4153();
				}
				if (Static79.aClass111_1 != null) {
					Static79.aClass111_1.method4153();
				}
				@Pc(147) int local147 = Static95.aClass92_4.method2177();
				if (Static153.aClass111_2 != null) {
					Static153.aClass111_2.method4153();
				}
				if (Static79.aClass111_1 != null) {
					Static79.aClass111_1.method4153();
				}
				if (local147 != 0) {
					Static247.anInt5536 = 0;
					Static130.anInt2600 = local147;
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
					return;
				}
				Static247.anInt5536 = 3;
			}
			if (Static247.anInt5536 == 3) {
				if (Static95.aClass92_4.method2175() < 8) {
					return;
				}
				Static95.aClass92_4.method2182(0, 8, Static275.aClass8_Sub2_Sub1_6.aByteArray24);
				@Pc(195) int[] local195 = new int[4];
				Static275.aClass8_Sub2_Sub1_6.anInt2955 = 0;
				Static263.aLong187 = Static275.aClass8_Sub2_Sub1_6.method2347();
				local195[1] = (int) (Math.random() * 9.9999999E7D);
				Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
				local195[2] = (int) (Static263.aLong187 >> 32);
				local195[3] = (int) Static263.aLong187;
				local195[0] = (int) (Math.random() * 9.9999999E7D);
				Static66.aClass8_Sub2_Sub1_4.method2340(10);
				Static66.aClass8_Sub2_Sub1_4.method2330(local195[0]);
				Static66.aClass8_Sub2_Sub1_4.method2330(local195[1]);
				Static66.aClass8_Sub2_Sub1_4.method2330(local195[2]);
				Static66.aClass8_Sub2_Sub1_4.method2330(local195[3]);
				Static66.aClass8_Sub2_Sub1_4.method2378(Static31.method513(Static20.aString18));
				Static66.aClass8_Sub2_Sub1_4.method2331(Static31.aString31);
				Static66.aClass8_Sub2_Sub1_4.method2343(Static102.aBigInteger1, Static297.aBigInteger2);
				Static269.aClass8_Sub2_Sub1_5.anInt2955 = 0;
				if (Static23.anInt618 == 40) {
					Static269.aClass8_Sub2_Sub1_5.method2340(18);
				} else {
					Static269.aClass8_Sub2_Sub1_5.method2340(16);
				}
				Static269.aClass8_Sub2_Sub1_5.method2333(Static66.aClass8_Sub2_Sub1_4.anInt2955 + Static114.method1850(Static73.aString61) + 163);
				Static269.aClass8_Sub2_Sub1_5.method2330(544);
				Static269.aClass8_Sub2_Sub1_5.method2340(Static197.anInt3907);
				Static269.aClass8_Sub2_Sub1_5.method2340(Static218.aBoolean362 ? 1 : 0);
				Static269.aClass8_Sub2_Sub1_5.method2340(1);
				Static269.aClass8_Sub2_Sub1_5.method2340(Static99.method1585());
				Static269.aClass8_Sub2_Sub1_5.method2333(Static250.anInt4959);
				Static269.aClass8_Sub2_Sub1_5.method2333(Static13.anInt356);
				Static269.aClass8_Sub2_Sub1_5.method2340(Static215.anInt4429);
				Static294.method4289(Static269.aClass8_Sub2_Sub1_5);
				Static269.aClass8_Sub2_Sub1_5.method2331(Static73.aString61);
				Static269.aClass8_Sub2_Sub1_5.method2330(Static270.anInt5329);
				Static269.aClass8_Sub2_Sub1_5.method2330(Static248.method3685());
				Static49.aBoolean75 = true;
				Static269.aClass8_Sub2_Sub1_5.method2333(Static182.anInt3573);
				Static269.aClass8_Sub2_Sub1_5.method2330(Static230.aClass132_78.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static97.aClass132_38.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static279.aClass132_90.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static81.aClass132_33.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static207.aClass132_72.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static157.aClass132_92.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static88.aClass132_35.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static28.aClass132_9.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static145.aClass132_55.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static84.aClass132_34.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static210.aClass132_75.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static246.aClass132_84.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static206.aClass132_71.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static35.aClass132_13.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static89.aClass132_36.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static245.aClass132_83.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static299.aClass132_93.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static222.aClass132_76.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static195.aClass132_54.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static269.aClass132_88.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static231.aClass132_79.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static123.aClass132_43.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static31.aClass132_11.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static172.aClass132_61.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static204.aClass132_70.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static136.aClass132_50.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static204.aClass132_69.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static52.aClass132_17.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2330(Static249.aClass132_86.method3173());
				Static269.aClass8_Sub2_Sub1_5.method2380(Static66.aClass8_Sub2_Sub1_4.anInt2955, Static66.aClass8_Sub2_Sub1_4.aByteArray24);
				Static95.aClass92_4.method2178(Static269.aClass8_Sub2_Sub1_5.aByteArray24, Static269.aClass8_Sub2_Sub1_5.anInt2955);
				Static66.aClass8_Sub2_Sub1_4.method2387(local195);
				for (@Pc(559) int local559 = 0; local559 < 4; local559++) {
					local195[local559] += 50;
				}
				Static275.aClass8_Sub2_Sub1_6.method2387(local195);
				Static247.anInt5536 = 4;
			}
			if (Static247.anInt5536 == 4) {
				if (Static95.aClass92_4.method2175() < 1) {
					return;
				}
				@Pc(596) int local596 = Static95.aClass92_4.method2177();
				if (local596 == 21) {
					Static247.anInt5536 = 7;
				} else if (local596 == 29) {
					Static247.anInt5536 = 10;
				} else if (local596 == 1) {
					Static247.anInt5536 = 5;
					Static130.anInt2600 = local596;
					return;
				} else if (local596 == 2) {
					Static247.anInt5536 = 8;
				} else if (local596 == 15) {
					Static130.anInt2600 = local596;
					Static247.anInt5536 = 0;
					return;
				} else if (local596 == 23 && Static272.anInt5358 < 1) {
					Static272.anInt5358++;
					Static247.anInt5536 = 1;
					Static62.anInt5014 = 0;
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
					return;
				} else {
					Static247.anInt5536 = 0;
					Static130.anInt2600 = local596;
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
					return;
				}
			}
			if (Static247.anInt5536 == 6) {
				Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
				Static66.aClass8_Sub2_Sub1_4.method2398(17);
				Static95.aClass92_4.method2178(Static66.aClass8_Sub2_Sub1_4.aByteArray24, Static66.aClass8_Sub2_Sub1_4.anInt2955);
				Static247.anInt5536 = 4;
				return;
			}
			if (Static247.anInt5536 == 7) {
				if (Static95.aClass92_4.method2175() >= 1) {
					Static125.anInt2489 = (Static95.aClass92_4.method2177() + 3) * 60;
					Static247.anInt5536 = 0;
					Static130.anInt2600 = 21;
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
					return;
				}
				return;
			}
			if (Static247.anInt5536 == 10) {
				if (Static95.aClass92_4.method2175() < 1) {
					return;
				}
				Static3.anInt4885 = Static95.aClass92_4.method2177();
				Static247.anInt5536 = 0;
				Static130.anInt2600 = 29;
				Static95.aClass92_4.method2176();
				Static95.aClass92_4 = null;
				return;
			}
			if (Static247.anInt5536 == 8) {
				if (Static95.aClass92_4.method2175() < 14) {
					return;
				}
				Static95.aClass92_4.method2182(0, 14, Static275.aClass8_Sub2_Sub1_6.aByteArray24);
				Static275.aClass8_Sub2_Sub1_6.anInt2955 = 0;
				Static94.anInt1962 = Static275.aClass8_Sub2_Sub1_6.method2334();
				Static115.anInt2352 = Static275.aClass8_Sub2_Sub1_6.method2334();
				Static176.aBoolean291 = Static275.aClass8_Sub2_Sub1_6.method2334() == 1;
				Static139.aBoolean229 = Static275.aClass8_Sub2_Sub1_6.method2334() == 1;
				Static293.aBoolean478 = Static275.aClass8_Sub2_Sub1_6.method2334() == 1;
				Static176.aBoolean292 = Static275.aClass8_Sub2_Sub1_6.method2334() == 1;
				Static159.aBoolean273 = Static275.aClass8_Sub2_Sub1_6.method2334() == 1;
				Static34.anInt765 = Static275.aClass8_Sub2_Sub1_6.method2375();
				Static288.aBoolean98 = Static275.aClass8_Sub2_Sub1_6.method2334() == 1;
				Static65.aBoolean466 = Static275.aClass8_Sub2_Sub1_6.method2334() == 1;
				Static120.method1939(Static65.aBoolean466);
				Static264.method4228(Static65.aBoolean466);
				if (!Static218.aBoolean362) {
					if (Static176.aBoolean291 && !Static293.aBoolean478 || Static288.aBoolean98) {
						try {
							Static304.method1290(Static199.aClass17_3.anApplet1, "zap");
						} catch (@Pc(882) Throwable local882) {
						}
					} else {
						try {
							Static304.method1290(Static199.aClass17_3.anApplet1, "unzap");
						} catch (@Pc(872) Throwable local872) {
						}
					}
				}
				try {
					Static304.method1290(Static199.aClass17_3.anApplet1, "loggedin");
				} catch (@Pc(890) Throwable local890) {
				}
				Static277.anInt5667 = Static275.aClass8_Sub2_Sub1_6.method2388();
				Static68.anInt1687 = Static275.aClass8_Sub2_Sub1_6.method2375();
				Static247.anInt5536 = 9;
			}
			if (Static247.anInt5536 == 9) {
				if (Static95.aClass92_4.method2175() >= Static68.anInt1687) {
					Static275.aClass8_Sub2_Sub1_6.anInt2955 = 0;
					Static95.aClass92_4.method2182(0, Static68.anInt1687, Static275.aClass8_Sub2_Sub1_6.aByteArray24);
					Static130.anInt2600 = 2;
					Static247.anInt5536 = 0;
					Static211.method3312();
					Static250.anInt4960 = -1;
					Static266.method4009(false);
					Static277.anInt5667 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(936) IOException local936) {
			if (Static95.aClass92_4 != null) {
				Static95.aClass92_4.method2176();
				Static95.aClass92_4 = null;
			}
			if (Static272.anInt5358 < 1) {
				if (Static159.anInt3248 == Static2.anInt8) {
					Static159.anInt3248 = Static190.anInt3820;
				} else {
					Static159.anInt3248 = Static2.anInt8;
				}
				Static247.anInt5536 = 1;
				Static62.anInt5014 = 0;
				Static272.anInt5358++;
			} else {
				Static247.anInt5536 = 0;
				Static130.anInt2600 = -4;
			}
		}
	}
}
