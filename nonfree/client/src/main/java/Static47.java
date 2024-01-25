import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	public static int anInt1080;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	public static int anInt1077 = 0;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/String;")
	public static String aString35 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/lang/String;")
	public static final String aString36 = "yellow:";

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	public static int anInt1095 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1076() {
		for (@Pc(1) int local1 = -1; local1 < Static334.anInt6370 + Static338.anInt6419; local1++) {
			@Pc(6) Class5_Sub3_Sub3 local6;
			if (local1 < 0) {
				local6 = Static130.aClass5_Sub3_Sub3_Sub1_1;
			} else if (local1 < Static334.anInt6370) {
				local6 = Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local1]];
			} else {
				local6 = Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local1 - Static334.anInt6370]];
			}
			if (local6.anInt4915 >= 0) {
				@Pc(32) int local32 = local6.method4541();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt5050 & 0x7F) != 0 || (local6.anInt5047 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt5050 & 0x7F) != 64 || (local6.anInt5047 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt5050 >> 7;
					local73 = local6.anInt5047 >> 7;
					if (local6.anInt4915 > Static172.anIntArrayArray60[local68][local73]) {
						Static172.anIntArrayArray60[local68][local73] = local6.anInt4915;
						Static171.anIntArrayArray35[local68][local73] = 1;
					} else if (local6.anInt4915 == Static172.anIntArrayArray60[local68][local73]) {
						local109 = Static171.anIntArrayArray35[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt5050 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt5047 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt5050 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt5047 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt4915 > Static172.anIntArrayArray60[local151][local154]) {
								Static172.anIntArrayArray60[local151][local154] = local6.anInt4915;
								Static171.anIntArrayArray35[local151][local154] = 1;
							} else if (local6.anInt4915 == Static172.anIntArrayArray60[local151][local154]) {
								local109 = Static171.anIntArrayArray35[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1078() {
		for (@Pc(1) int local1 = 0; local1 < Static48.anInt1107; local1++) {
			@Pc(6) int[] local6 = Static172.anIntArrayArray60[local1];
			for (@Pc(8) int local8 = 0; local8 < Static337.anInt6402; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	public static void method1080() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(36) int local36;
		@Pc(40) int local40;
		if (Static351.anInt6505 == 175) {
			local14 = Static232.aClass1_Sub7_Sub1_4.method3141();
			local22 = (local14 >> 4 & 0x7) + Static346.anInt6469;
			local28 = (local14 & 0x7) + Static194.anInt3963;
			local32 = Static232.aClass1_Sub7_Sub1_4.method3115();
			local36 = Static232.aClass1_Sub7_Sub1_4.method3141();
			local40 = Static232.aClass1_Sub7_Sub1_4.method3115();
			if (local22 >= 0 && local28 >= 0 && Static48.anInt1107 > local22 && local28 < Static337.anInt6402) {
				local60 = local22 * 128 + 64;
				local66 = local28 * 128 + 64;
				@Pc(87) Class5_Sub3_Sub4 local87 = new Class5_Sub3_Sub4(local32, local40, Static215.anInt4246, Static285.anInt5511, local60, Static16.method362(local60, local66, Static285.anInt5511) - local36, local66, local22, local22, local28, local28);
				Static294.aClass195_46.method5018(new Class1_Sub1_Sub14(local87));
			}
		} else if (Static351.anInt6505 == 22) {
			local14 = Static232.aClass1_Sub7_Sub1_4.method3141();
			local22 = Static346.anInt6469 + (local14 >> 4 & 0x7);
			local28 = Static194.anInt3963 + (local14 & 0x7);
			local32 = Static232.aClass1_Sub7_Sub1_4.method3115();
			local36 = Static232.aClass1_Sub7_Sub1_4.method3115();
			local40 = Static232.aClass1_Sub7_Sub1_4.method3115();
			if (Static52.aClass26_4 != null && local22 >= 0 && local28 >= 0 && local22 < Static48.anInt1107 && local28 < Static337.anInt6402) {
				@Pc(166) Class1_Sub39 local166 = (Class1_Sub39) Static52.aClass26_4.method870((long) (local22 | Static285.anInt5511 << 28 | local28 << 14));
				if (local166 != null) {
					for (@Pc(174) Class1_Sub28 local174 = (Class1_Sub28) local166.aClass195_47.method5029(); local174 != null; local174 = (Class1_Sub28) local166.aClass195_47.method5021()) {
						if ((local32 & 0x7FFF) == local174.anInt4495 && local36 == local174.anInt4493) {
							local174.method5710();
							local174.anInt4493 = local40;
							Static113.method2083(Static285.anInt5511, local22, local174, local28);
							break;
						}
					}
					Static300.method5117(local22, Static285.anInt5511, local28);
				}
			}
		} else if (Static351.anInt6505 == 198) {
			Static232.aClass1_Sub7_Sub1_4.method3141();
			local14 = Static232.aClass1_Sub7_Sub1_4.method3141();
			local22 = (local14 >> 4 & 0x7) + Static346.anInt6469;
			local28 = (local14 & 0x7) + Static194.anInt3963;
			local32 = Static232.aClass1_Sub7_Sub1_4.method3115();
			local36 = Static232.aClass1_Sub7_Sub1_4.method3141();
			local40 = Static232.aClass1_Sub7_Sub1_4.method3137();
			@Pc(259) String local259 = Static232.aClass1_Sub7_Sub1_4.method3134();
			Static102.method1915(local36, local28, local32, local22, local40, local259);
		} else if (Static351.anInt6505 == 35) {
			local14 = Static232.aClass1_Sub7_Sub1_4.method3115();
			local22 = Static232.aClass1_Sub7_Sub1_4.method3100();
			local28 = Static346.anInt6469 + (local22 >> 4 & 0x7);
			local32 = (local22 & 0x7) + Static194.anInt3963;
			if (local28 >= 0 && local32 >= 0 && Static48.anInt1107 > local28 && Static337.anInt6402 > local32) {
				@Pc(321) Class1_Sub39 local321 = (Class1_Sub39) Static52.aClass26_4.method870((long) (local32 << 14 | Static285.anInt5511 << 28 | local28));
				if (local321 != null) {
					for (@Pc(329) Class1_Sub28 local329 = (Class1_Sub28) local321.aClass195_47.method5029(); local329 != null; local329 = (Class1_Sub28) local321.aClass195_47.method5021()) {
						if ((local14 & 0x7FFF) == local329.anInt4495) {
							local329.method5710();
							break;
						}
					}
					if (local321.aClass195_47.method5017()) {
						local321.method5710();
					}
					Static300.method5117(local28, Static285.anInt5511, local32);
				}
			}
		} else {
			@Pc(420) int local420;
			@Pc(426) int local426;
			@Pc(438) int local438;
			@Pc(442) int local442;
			@Pc(430) int local430;
			@Pc(434) int local434;
			if (Static351.anInt6505 == 189) {
				local14 = Static232.aClass1_Sub7_Sub1_4.method3141();
				local22 = Static346.anInt6469 * 2 + (local14 >> 4 & 0xF);
				local28 = Static194.anInt3963 * 2 + (local14 & 0xF);
				local32 = Static232.aClass1_Sub7_Sub1_4.method3130() + local22;
				local36 = Static232.aClass1_Sub7_Sub1_4.method3130() + local28;
				local40 = Static232.aClass1_Sub7_Sub1_4.method3090();
				local60 = Static232.aClass1_Sub7_Sub1_4.method3090();
				local66 = Static232.aClass1_Sub7_Sub1_4.method3115();
				local420 = Static232.aClass1_Sub7_Sub1_4.method3130();
				local426 = Static232.aClass1_Sub7_Sub1_4.method3141() * 4;
				local430 = Static232.aClass1_Sub7_Sub1_4.method3115();
				local434 = Static232.aClass1_Sub7_Sub1_4.method3115();
				local438 = Static232.aClass1_Sub7_Sub1_4.method3141();
				local442 = Static232.aClass1_Sub7_Sub1_4.method3141();
				if (local438 == 255) {
					local438 = -1;
				}
				if (local22 >= 0 && local28 >= 0 && local22 < 208 && local28 < 208 && local32 >= 0 && local36 >= 0 && local32 < 208 && local36 < 208 && local66 != 65535) {
					local28 = local28 * 64;
					local32 *= 64;
					local36 *= 64;
					local22 *= 64;
					if (local40 != 0) {
						@Pc(520) int local520;
						@Pc(525) Class5_Sub3_Sub3 local525;
						@Pc(510) int local510;
						@Pc(514) int local514;
						if (local40 < 0) {
							local510 = -local40 - 1;
							local514 = local510 & 0x7FF;
							local520 = local510 >> 11 & 0xF;
							if (Static69.anInt1424 == local514) {
								local525 = Static130.aClass5_Sub3_Sub3_Sub1_1;
							} else {
								local525 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local514];
							}
						} else {
							local510 = local40 - 1;
							local514 = local510 & 0x7FF;
							local520 = local510 >> 11 & 0xF;
							local525 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local514];
						}
						if (local525 != null) {
							@Pc(557) Class45 local557 = local525.method4533();
							if (local557.anIntArrayArray9 != null && local557.anIntArrayArray9[local520] != null) {
								local514 = local557.anIntArrayArray9[local520][0];
								@Pc(579) int local579 = local557.anIntArrayArray9[local520][2];
								@Pc(584) int local584 = local525.aClass11_7.method322();
								@Pc(588) int local588 = Class1_Sub1_Sub16.anIntArray587[local584];
								@Pc(592) int local592 = Class1_Sub1_Sub16.anIntArray586[local584];
								@Pc(602) int local602 = local579 * local588 + local514 * local592 >> 15;
								@Pc(613) int local613 = local579 * local592 - local588 * local514 >> 15;
								local22 += local602;
								local420 -= local557.anIntArrayArray9[local520][1];
								local28 += local613;
							}
						}
					}
					@Pc(658) Class5_Sub3_Sub1 local658 = new Class5_Sub3_Sub1(local66, Static285.anInt5511, local22, local28, Static16.method362(local22, local28, Static285.anInt5511) - local420, Static215.anInt4246 + local430, Static215.anInt4246 + local434, local438, local442, local60, local426);
					local658.method1780(Static16.method362(local32, local36, Static285.anInt5511) - local426, local36, local32, local430 + Static215.anInt4246);
					Static49.aClass195_6.method5018(new Class1_Sub1_Sub13(local658));
				}
			} else {
				@Pc(834) Class5_Sub3_Sub1 local834;
				if (Static351.anInt6505 == 6) {
					local14 = Static232.aClass1_Sub7_Sub1_4.method3141();
					local22 = (local14 >> 4 & 0xF) + Static346.anInt6469 * 2;
					local28 = (local14 & 0xF) + Static194.anInt3963 * 2;
					local32 = Static232.aClass1_Sub7_Sub1_4.method3130() + local22;
					local36 = local28 + Static232.aClass1_Sub7_Sub1_4.method3130();
					local40 = Static232.aClass1_Sub7_Sub1_4.method3090();
					local60 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local66 = Static232.aClass1_Sub7_Sub1_4.method3141() * 4;
					local420 = Static232.aClass1_Sub7_Sub1_4.method3141() * 4;
					local426 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local430 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local434 = Static232.aClass1_Sub7_Sub1_4.method3141();
					if (local434 == 255) {
						local434 = -1;
					}
					local438 = Static232.aClass1_Sub7_Sub1_4.method3141();
					if (local22 >= 0 && local28 >= 0 && local22 < 208 && local28 < 208 && local32 >= 0 && local36 >= 0 && local32 < 208 && local36 < 208 && local60 != 65535) {
						local32 *= 64;
						local22 *= 64;
						local28 *= 64;
						local36 *= 64;
						local834 = new Class5_Sub3_Sub1(local60, Static285.anInt5511, local22, local28, Static16.method362(local22, local28, Static285.anInt5511) - local66, local426 + Static215.anInt4246, Static215.anInt4246 + local430, local434, local438, local40, local420);
						local834.method1780(Static16.method362(local32, local36, Static285.anInt5511) - local420, local36, local32, local426 + Static215.anInt4246);
						Static49.aClass195_6.method5018(new Class1_Sub1_Sub13(local834));
					}
				} else if (Static351.anInt6505 == 176) {
					local14 = Static232.aClass1_Sub7_Sub1_4.method3141();
					local22 = (local14 >> 4 & 0x7) + Static346.anInt6469;
					local28 = Static194.anInt3963 + (local14 & 0x7);
					local32 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local36 = Static232.aClass1_Sub7_Sub1_4.method3115();
					if (local22 >= 0 && local28 >= 0 && local22 < Static48.anInt1107 && Static337.anInt6402 > local28) {
						Static113.method2083(Static285.anInt5511, local22, new Class1_Sub28(local36, local32), local28);
						Static300.method5117(local22, Static285.anInt5511, local28);
					}
				} else if (Static351.anInt6505 == 133) {
					local14 = Static232.aClass1_Sub7_Sub1_4.method3100();
					local22 = local14 >> 2;
					local28 = local14 & 0x3;
					local32 = Static6.anIntArray19[local22];
					local36 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local40 = Static232.aClass1_Sub7_Sub1_4.method3094();
					local60 = Static346.anInt6469 + (local40 >> 4 & 0x7);
					local66 = Static194.anInt3963 + (local40 & 0x7);
					if (local60 >= 0 && local66 >= 0 && Static48.anInt1107 > local60 && Static337.anInt6402 > local66) {
						Static95.method1778(local36, local22, local66, local32, local60, Static285.anInt5511, -1, 0, local28);
					}
				} else if (Static351.anInt6505 == 226) {
					local14 = Static232.aClass1_Sub7_Sub1_4.method3115();
					local22 = Static232.aClass1_Sub7_Sub1_4.method3141();
					Static126.method2405(local14).method4912(local22);
				} else if (Static351.anInt6505 == 95) {
					local14 = Static232.aClass1_Sub7_Sub1_4.method3141();
					local22 = (local14 >> 4 & 0x7) + Static346.anInt6469;
					local28 = Static194.anInt3963 + (local14 & 0x7);
					local32 = Static232.aClass1_Sub7_Sub1_4.method3115();
					if (local32 == 65535) {
						local32 = -1;
					}
					local36 = Static232.aClass1_Sub7_Sub1_4.method3141();
					local40 = local36 >> 4 & 0xF;
					local60 = local36 & 0x7;
					local66 = Static232.aClass1_Sub7_Sub1_4.method3141();
					local420 = Static232.aClass1_Sub7_Sub1_4.method3141();
					if (local22 >= 0 && local28 >= 0 && Static48.anInt1107 > local22 && Static337.anInt6402 > local28) {
						local426 = local40 + 1;
						if (Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0] >= local22 - local426 && Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0] <= local22 + local426 && Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0] >= local28 - local426 && Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0] <= local426 + local28 && Static8.anInt201 != 0 && local60 > 0 && Static46.anInt1004 < 50 && local32 != -1) {
							Static252.anIntArray630[Static46.anInt1004] = local32;
							Static23.anIntArray78[Static46.anInt1004] = local60;
							Static148.anIntArray636[Static46.anInt1004] = local66;
							Static103.aClass81Array1[Static46.anInt1004] = null;
							Static134.anIntArray313[Static46.anInt1004] = local40 + (local28 << 8) + (local22 << 16);
							Static131.anIntArray308[Static46.anInt1004] = local420;
							Static46.anInt1004++;
						}
					}
				} else if (Static351.anInt6505 == 186) {
					local14 = Static232.aClass1_Sub7_Sub1_4.method3141();
					local22 = local14 >> 2;
					local28 = local14 & 0x3;
					local32 = Static6.anIntArray19[local22];
					local36 = Static232.aClass1_Sub7_Sub1_4.method3101();
					if (local36 == 65535) {
						local36 = -1;
					}
					local40 = Static232.aClass1_Sub7_Sub1_4.method3100();
					local60 = Static346.anInt6469 + (local40 >> 4 & 0x7);
					local66 = Static194.anInt3963 + (local40 & 0x7);
					Static268.method4678(local36, local60, local22, local66, Static285.anInt5511, local32, local28);
				} else if (Static351.anInt6505 == 82) {
					local14 = Static232.aClass1_Sub7_Sub1_4.method3100();
					local22 = Static346.anInt6469 + (local14 >> 4 & 0x7);
					local28 = (local14 & 0x7) + Static194.anInt3963;
					local32 = Static232.aClass1_Sub7_Sub1_4.method3147();
					local36 = Static232.aClass1_Sub7_Sub1_4.method3101();
					local40 = Static232.aClass1_Sub7_Sub1_4.method3147();
					if (local22 >= 0 && local28 >= 0 && local22 < Static48.anInt1107 && Static337.anInt6402 > local28 && Static69.anInt1424 != local40) {
						Static113.method2083(Static285.anInt5511, local22, new Class1_Sub28(local32, local36), local28);
						Static300.method5117(local22, Static285.anInt5511, local28);
					}
				} else if (Static351.anInt6505 == 25) {
					local14 = Static232.aClass1_Sub7_Sub1_4.method3100();
					local22 = local14 >> 2;
					local28 = local14 & 0x3;
					local32 = Static6.anIntArray19[local22];
					local36 = Static232.aClass1_Sub7_Sub1_4.method3100();
					local40 = (local36 >> 4 & 0x7) + Static346.anInt6469;
					local60 = (local36 & 0x7) + Static194.anInt3963;
					if (local40 >= 0 && local60 >= 0 && local40 < Static48.anInt1107 && Static337.anInt6402 > local60) {
						Static95.method1778(-1, local22, local60, local32, local40, Static285.anInt5511, -1, 0, local28);
					}
				} else {
					if (Static351.anInt6505 == 218) {
						@Pc(1393) byte local1393 = Static232.aClass1_Sub7_Sub1_4.method3120();
						local22 = Static232.aClass1_Sub7_Sub1_4.method3112();
						local28 = (local22 >> 4 & 0x7) + Static346.anInt6469;
						local32 = Static194.anInt3963 + (local22 & 0x7);
						local36 = Static232.aClass1_Sub7_Sub1_4.method3123();
						@Pc(1419) byte local1419 = Static232.aClass1_Sub7_Sub1_4.method3130();
						local60 = Static232.aClass1_Sub7_Sub1_4.method3115();
						local66 = Static232.aClass1_Sub7_Sub1_4.method3094();
						local420 = local66 >> 2;
						local426 = local66 & 0x3;
						@Pc(1439) byte local1439 = Static232.aClass1_Sub7_Sub1_4.method3143();
						@Pc(1443) byte local1443 = Static232.aClass1_Sub7_Sub1_4.method3093();
						local438 = Static232.aClass1_Sub7_Sub1_4.method3147();
						local442 = Static232.aClass1_Sub7_Sub1_4.method3115();
						if (!Static34.aClass2_6.method3305()) {
							Static187.method3639(local28, local426, local438, local1393, local1443, local420, local442, local32, local60, local36, local1419, local1439);
						}
					}
					if (Static351.anInt6505 == 8) {
						local14 = Static232.aClass1_Sub7_Sub1_4.method3141();
						local22 = Static346.anInt6469 + (local14 >> 4 & 0x7);
						local28 = Static194.anInt3963 + (local14 & 0x7);
						local32 = Static232.aClass1_Sub7_Sub1_4.method3130() + local22;
						local36 = local28 + Static232.aClass1_Sub7_Sub1_4.method3130();
						local40 = Static232.aClass1_Sub7_Sub1_4.method3090();
						local60 = Static232.aClass1_Sub7_Sub1_4.method3115();
						local66 = Static232.aClass1_Sub7_Sub1_4.method3141() * 4;
						local420 = Static232.aClass1_Sub7_Sub1_4.method3141() * 4;
						local426 = Static232.aClass1_Sub7_Sub1_4.method3115();
						local430 = Static232.aClass1_Sub7_Sub1_4.method3115();
						local434 = Static232.aClass1_Sub7_Sub1_4.method3141();
						if (local434 == 255) {
							local434 = -1;
						}
						local438 = Static232.aClass1_Sub7_Sub1_4.method3141();
						if (local22 >= 0 && local28 >= 0 && local22 < Static48.anInt1107 && local28 < Static337.anInt6402 && local32 >= 0 && local36 >= 0 && Static48.anInt1107 > local32 && Static337.anInt6402 > local36 && local60 != 65535) {
							local36 = local36 * 128 + 64;
							local28 = local28 * 128 + 64;
							local22 = local22 * 128 + 64;
							local32 = local32 * 128 + 64;
							local834 = new Class5_Sub3_Sub1(local60, Static285.anInt5511, local22, local28, Static16.method362(local22, local28, Static285.anInt5511) - local66, Static215.anInt4246 + local426, local430 + Static215.anInt4246, local434, local438, local40, local420);
							local834.method1780(Static16.method362(local32, local36, Static285.anInt5511) - local420, local36, local32, Static215.anInt4246 + local426);
							Static49.aClass195_6.method5018(new Class1_Sub1_Sub13(local834));
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!aa;ILclient!rg;I)V")
	public static void method1081(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class177 arg3) {
		if (arg3.anInt5208 == 2) {
			for (@Pc(68) int local68 = arg0; local68 <= arg2; local68++) {
				@Pc(77) int local77 = arg3.anIntArray668[local68] - 1;
				if (local77 != -1) {
					@Pc(108) boolean local108;
					if (Static243.anInt4739 == 1 && Static114.anInt2289 == local68 && Static84.anInt1651 == arg3.anInt5219) {
						local108 = Static37.method945(arg3.anIntArray667[local68], arg1, 2, local77, null, 0, arg3.anInt5178) == null;
						if (local108) {
							Static38.aClass195_37.method5018(new Class1_Sub8(local77, arg3.anIntArray667[local68], 2, 0, arg3.anInt5178, false));
						}
					} else {
						local108 = Static37.method945(arg3.anIntArray667[local68], arg1, 1, local77, null, -13623264, arg3.anInt5178) == null;
						if (local108) {
							Static38.aClass195_37.method5018(new Class1_Sub8(local77, arg3.anIntArray667[local68], 1, -13623264, arg3.anInt5178, false));
						}
					}
				}
			}
		} else if (arg3.anInt5208 == 5) {
			@Pc(42) boolean local42 = Static37.method945(arg3.anInt5253, arg1, arg3.anInt5220, arg3.anInt5252, arg3.aBoolean435 ? Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1 : null, arg3.anInt5227 | 0xFF000000, arg3.anInt5178) == null;
			if (local42) {
				Static38.aClass195_37.method5018(new Class1_Sub8(arg3.anInt5252, arg3.anInt5253, arg3.anInt5220, arg3.anInt5227 | 0xFF000000, arg3.anInt5178, arg3.aBoolean435));
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!rg;IIIIIIIII)V")
	public static void method1082(@OriginalArg(0) Class177[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class177 local6 = arg0[local1];
			if (local6 != null && local6.anInt5236 == arg1) {
				@Pc(17) int local17 = local6.anInt5201 + arg6;
				@Pc(22) int local22 = local6.anInt5177 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt5208 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt5179;
					@Pc(45) int local45 = local22 + local6.anInt5209;
					if (local6.anInt5208 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (!local6.aBoolean445 || local6.anInt5208 == 0 || local6.aBoolean434 || method1096(local6).anInt5507 != 0 || local6 == Static66.aClass177_3 || local6.anInt5204 == 1338) {
					if (!local6.aBoolean445 || !method1090(local6)) {
						if (local6 == Static317.aClass177_22) {
							Static20.aBoolean43 = true;
							Static125.anInt2466 = local17;
							Static334.anInt6366 = local22;
						}
						if (!local6.aBoolean445 || local6.aBoolean433 || local28 < local32 && local30 < local34) {
							if (local6.anInt5208 == 0) {
								if (!local6.aBoolean445 && method1090(local6) && Static118.aClass177_17 != local6) {
									continue;
								}
								if (local6.aBoolean443 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
									for (@Pc(175) Class1_Sub19 local175 = (Class1_Sub19) Static138.aClass195_31.method5029(); local175 != null; local175 = (Class1_Sub19) Static138.aClass195_31.method5021()) {
										if (local175.aBoolean275) {
											local175.method5710();
											local175.aClass177_9.aBoolean430 = false;
										}
									}
									if (Static40.anInt4331 == 0) {
										Static317.aClass177_22 = null;
										Static66.aClass177_3 = null;
									}
									Static112.anInt4022 = 0;
									Static350.aBoolean585 = false;
									Static33.aBoolean73 = false;
									if (!Static179.aBoolean310) {
										Static198.method3732();
									}
								}
							}
							@Pc(223) boolean local223;
							if (Static179.anInt3693 >= local28 && Static295.anInt5742 >= local30 && Static179.anInt3693 < local32 && Static295.anInt5742 < local34) {
								local223 = true;
							} else {
								local223 = false;
							}
							if (!Static179.aBoolean310 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static93.method1726(arg9 - local22, local6, arg8 - local17);
							}
							if (local6.aBoolean445) {
								@Pc(254) boolean local254 = false;
								if (Static151.anInt3836 == 1 && local223) {
									local254 = true;
								}
								@Pc(263) boolean local263 = false;
								if (Static269.anInt5189 == 1 && Static179.anInt3690 >= local28 && Static178.anInt3687 >= local30 && Static179.anInt3690 < local32 && Static178.anInt3687 < local34) {
									local263 = true;
								}
								@Pc(285) int local285;
								@Pc(374) int local374;
								if (local6.aByteArray84 != null) {
									for (local285 = 0; local285 < local6.aByteArray84.length; local285++) {
										if (Static220.aBooleanArray24[local6.aByteArray84[local285]]) {
											if (local6.anIntArray665 == null || Static215.anInt4246 >= local6.anIntArray665[local285]) {
												@Pc(316) byte local316 = local6.aByteArray85[local285];
												if (local316 == 0 || ((local316 & 0x8) == 0 || !Static220.aBooleanArray24[86] && !Static220.aBooleanArray24[82] && !Static220.aBooleanArray24[81]) && ((local316 & 0x2) == 0 || Static220.aBooleanArray24[86]) && ((local316 & 0x1) == 0 || Static220.aBooleanArray24[82]) && ((local316 & 0x4) == 0 || Static220.aBooleanArray24[81])) {
													Static259.method4567(-1, local6.anInt5219, local285 + 1, "");
													local374 = local6.anIntArray666[local285];
													if (local6.anIntArray665 == null) {
														local6.anIntArray665 = new int[local6.aByteArray84.length];
													}
													if (local374 == 0) {
														local6.anIntArray665[local285] = Integer.MAX_VALUE;
													} else {
														local6.anIntArray665[local285] = Static215.anInt4246 + local374;
													}
												}
											}
										} else if (local6.anIntArray665 != null) {
											local6.anIntArray665[local285] = 0;
										}
									}
								}
								if (local263) {
									Static56.method1213(local6, Static178.anInt3687 - local22, Static179.anInt3690 - local17);
								}
								if (Static317.aClass177_22 != null && Static317.aClass177_22 != local6 && local223 && method1096(local6).method4892()) {
									Static184.aClass177_11 = local6;
								}
								if (local6 == Static66.aClass177_3) {
									Static313.aBoolean531 = true;
									Static194.anInt3964 = local17;
									Static111.anInt2273 = local22;
								}
								if (local6.aBoolean434 || local6.anInt5204 != 0) {
									@Pc(455) Class1_Sub19 local455;
									if (local223 && Static325.anInt4689 != 0 && local6.anObjectArray35 != null) {
										local455 = new Class1_Sub19();
										local455.aBoolean275 = true;
										local455.aClass177_9 = local6;
										local455.anInt3150 = Static325.anInt4689;
										local455.anObjectArray3 = local6.anObjectArray35;
										Static138.aClass195_31.method5018(local455);
									}
									if (Static317.aClass177_22 != null || Static46.aClass177_2 != null || Static179.aBoolean310 || local6.anInt5204 != 1400 && Static112.anInt4022 > 0) {
										local263 = false;
										local254 = false;
										local223 = false;
									}
									@Pc(612) int local612;
									if (local6.anInt5204 != 0) {
										if (local6.anInt5204 == 1337 || local6.anInt5204 == 1403) {
											Static40.aClass177_15 = local6;
											if (Static92.aClass32_1 != null) {
												Static92.aClass32_1.method1036(local6.anInt5209, Static34.aClass2_6);
											}
											if (local6.anInt5204 == 1337) {
												if (!Static179.aBoolean310 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
													Static296.method5071(Static34.aClass2_6, arg8, arg9);
													for (@Pc(540) Class15_Sub7 local540 = (Class15_Sub7) Static233.aClass175_5.method4669(); local540 != null; local540 = (Class15_Sub7) Static233.aClass175_5.method4673()) {
														if (arg8 >= local540.anInt4717 && arg8 < local540.anInt4720 && arg9 >= local540.anInt4719 && arg9 < local540.anInt4718) {
															Static198.method3732();
															Static216.method3964(local540.aClass5_Sub3_Sub3_1);
														}
													}
												}
												Static81.method1557(local22, local6, local17);
												continue;
											}
										}
										@Pc(651) int local651;
										if (local6.anInt5204 == 1338) {
											if (local6.method4686(Static34.aClass2_6) == null || Static298.anInt5959 != 0 && Static298.anInt5959 != 3 || Static179.aBoolean310 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
												continue;
											}
											local285 = arg8 - local17;
											local612 = arg9 - local22;
											local374 = local6.anIntArray669[local612];
											if (local285 < local374 || local285 > local374 + local6.anIntArray664[local612]) {
												continue;
											}
											local285 -= local6.anInt5179 / 2;
											local612 -= local6.anInt5209 / 2;
											if (Static81.anInt1609 == 4) {
												local651 = (int) Static304.aFloat110 & 0x3FFF;
											} else {
												local651 = (int) Static304.aFloat110 + Static277.anInt6206 & 0x3FFF;
											}
											@Pc(663) int local663 = Class1_Sub1_Sub16.anIntArray587[local651];
											@Pc(667) int local667 = Class1_Sub1_Sub16.anIntArray586[local651];
											if (Static81.anInt1609 != 4) {
												local663 = local663 * (Static311.anInt5996 + 256) >> 8;
												local667 = local667 * (Static311.anInt5996 + 256) >> 8;
											}
											@Pc(696) int local696 = local612 * local663 + local285 * local667 >> 15;
											@Pc(706) int local706 = local612 * local667 - local285 * local663 >> 15;
											@Pc(717) int local717;
											@Pc(725) int local725;
											if (Static81.anInt1609 == 4) {
												local717 = (Static339.anInt6426 >> 7) + (local696 >> 2);
												local725 = (Static230.anInt4531 >> 7) - (local706 >> 2);
											} else {
												@Pc(734) int local734 = (Static130.aClass5_Sub3_Sub3_Sub1_1.method4541() - 1) * 64;
												local717 = (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 - local734 >> 7) + (local696 >> 2);
												local725 = (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 - local734 >> 7) - (local706 >> 2);
											}
											if (Static89.aBoolean156 && (Static95.anInt1903 & 0x40) != 0) {
												@Pc(767) Class177 local767 = Static323.method5412(Static90.anInt1762, Static99.anInt1953);
												if (local767 == null) {
													Static149.method2393();
												} else {
													Static164.method3162(Static181.anInt3761, local725, " ->", 1L, 3, local717, Static21.aString15);
												}
												continue;
											}
											if (Static341.anInt2259 == 1) {
												Static164.method3162(-1, local725, "", 1L, 12, local717, Static343.aString197);
											}
											Static164.method3162(-1, local725, "", 1L, 11, local717, Static331.aString252);
											continue;
										}
										if (local6.anInt5204 == 1400) {
											Static346.aClass177_25 = local6;
											if (local223) {
												Static350.aBoolean585 = true;
											}
											if (local263) {
												local285 = (int) ((double) (Static179.anInt3690 - local17 - local6.anInt5179 / 2) * 2.0D / (double) Static342.aFloat37);
												local612 = (int) -((double) (Static178.anInt3687 - local22 - local6.anInt5209 / 2) * 2.0D / (double) Static342.aFloat37);
												local374 = Static90.anInt1760 + local285 + Static342.anInt2144;
												local651 = Static185.anInt1061 + local612 + Static342.anInt2150;
												@Pc(864) Class1_Sub1_Sub12 local864 = Static242.method4296();
												if (local864 == null) {
													continue;
												}
												@Pc(869) int[] local869 = new int[3];
												local864.method2742(local374, local651, local869);
												if (local869 != null) {
													if (Static220.aBooleanArray24[82] && Static180.anInt3759 > 0) {
														Static263.method4607(local869[2], local869[1], local869[0]);
														continue;
													}
													Static33.aBoolean73 = true;
													Static154.anInt3085 = local869[0];
													Static310.anInt5982 = local869[1];
													Static25.anInt709 = local869[2];
												}
												Static112.anInt4022 = 1;
												Static253.aBoolean409 = false;
												Static318.anInt6103 = Static179.anInt3693;
												Static313.anInt6037 = Static295.anInt5742;
												continue;
											}
											if (local254 && Static112.anInt4022 > 0) {
												if (Static112.anInt4022 == 1 && (Static318.anInt6103 != Static179.anInt3693 || Static313.anInt6037 != Static295.anInt5742)) {
													Static332.anInt6365 = Static90.anInt1760;
													Static183.anInt3811 = Static185.anInt1061;
													Static112.anInt4022 = 2;
												}
												if (Static112.anInt4022 == 2) {
													Static253.aBoolean409 = true;
													Static12.method316(Static332.anInt6365 + (int) ((double) (Static318.anInt6103 - Static179.anInt3693) * 2.0D / (double) Static342.aFloat38));
													Static312.method5692(Static183.anInt3811 - (int) ((double) (Static313.anInt6037 - Static295.anInt5742) * 2.0D / (double) Static342.aFloat38));
												}
												continue;
											}
											if (Static112.anInt4022 > 0 && !Static253.aBoolean409) {
												if ((Static77.anInt1554 == 1 || Static154.method2926()) && Static277.anInt6207 > 2) {
													Static278.method4805(2);
												} else if (Static285.method4901()) {
													Static278.method4805(1);
												}
											}
											Static112.anInt4022 = 0;
											continue;
										}
										if (local6.anInt5204 == 1401) {
											if (local254) {
												Static30.method858(local6.anInt5209, local6.anInt5179, Static179.anInt3693 - local17, Static295.anInt5742 - local22);
											}
											continue;
										}
										if (local6.anInt5204 == 1406) {
											Static99.method1807(local17, local6, local22);
											continue;
										}
									}
									if (!local6.aBoolean446 && local263) {
										local6.aBoolean446 = true;
										if (local6.anObjectArray34 != null) {
											local455 = new Class1_Sub19();
											local455.aBoolean275 = true;
											local455.aClass177_9 = local6;
											local455.anInt3144 = Static179.anInt3690 - local17;
											local455.anInt3150 = Static178.anInt3687 - local22;
											local455.anObjectArray3 = local6.anObjectArray34;
											Static138.aClass195_31.method5018(local455);
										}
									}
									if (local6.aBoolean446 && local254 && local6.anObjectArray27 != null) {
										local455 = new Class1_Sub19();
										local455.aBoolean275 = true;
										local455.aClass177_9 = local6;
										local455.anInt3144 = Static179.anInt3693 - local17;
										local455.anInt3150 = Static295.anInt5742 - local22;
										local455.anObjectArray3 = local6.anObjectArray27;
										Static138.aClass195_31.method5018(local455);
									}
									if (local6.aBoolean446 && !local254) {
										local6.aBoolean446 = false;
										if (local6.anObjectArray31 != null) {
											local455 = new Class1_Sub19();
											local455.aBoolean275 = true;
											local455.aClass177_9 = local6;
											local455.anInt3144 = Static179.anInt3693 - local17;
											local455.anInt3150 = Static295.anInt5742 - local22;
											local455.anObjectArray3 = local6.anObjectArray31;
											Static120.aClass195_21.method5018(local455);
										}
									}
									if (local254 && local6.anObjectArray9 != null) {
										local455 = new Class1_Sub19();
										local455.aBoolean275 = true;
										local455.aClass177_9 = local6;
										local455.anInt3144 = Static179.anInt3693 - local17;
										local455.anInt3150 = Static295.anInt5742 - local22;
										local455.anObjectArray3 = local6.anObjectArray9;
										Static138.aClass195_31.method5018(local455);
									}
									if (!local6.aBoolean430 && local223) {
										local6.aBoolean430 = true;
										if (local6.anObjectArray22 != null) {
											local455 = new Class1_Sub19();
											local455.aBoolean275 = true;
											local455.aClass177_9 = local6;
											local455.anInt3144 = Static179.anInt3693 - local17;
											local455.anInt3150 = Static295.anInt5742 - local22;
											local455.anObjectArray3 = local6.anObjectArray22;
											Static138.aClass195_31.method5018(local455);
										}
									}
									if (local6.aBoolean430 && local223 && local6.anObjectArray26 != null) {
										local455 = new Class1_Sub19();
										local455.aBoolean275 = true;
										local455.aClass177_9 = local6;
										local455.anInt3144 = Static179.anInt3693 - local17;
										local455.anInt3150 = Static295.anInt5742 - local22;
										local455.anObjectArray3 = local6.anObjectArray26;
										Static138.aClass195_31.method5018(local455);
									}
									if (local6.aBoolean430 && !local223) {
										local6.aBoolean430 = false;
										if (local6.anObjectArray8 != null) {
											local455 = new Class1_Sub19();
											local455.aBoolean275 = true;
											local455.aClass177_9 = local6;
											local455.anInt3144 = Static179.anInt3693 - local17;
											local455.anInt3150 = Static295.anInt5742 - local22;
											local455.anObjectArray3 = local6.anObjectArray8;
											Static120.aClass195_21.method5018(local455);
										}
									}
									if (local6.anObjectArray7 != null) {
										local455 = new Class1_Sub19();
										local455.aClass177_9 = local6;
										local455.anObjectArray3 = local6.anObjectArray7;
										Static17.aClass195_1.method5018(local455);
									}
									@Pc(1361) Class1_Sub19 local1361;
									if (local6.anObjectArray24 != null && Static351.anInt6506 > local6.anInt5251) {
										if (local6.anIntArray663 == null || Static351.anInt6506 - local6.anInt5251 > 32) {
											local455 = new Class1_Sub19();
											local455.aClass177_9 = local6;
											local455.anObjectArray3 = local6.anObjectArray24;
											Static138.aClass195_31.method5018(local455);
										} else {
											label692: for (local285 = local6.anInt5251; local285 < Static351.anInt6506; local285++) {
												local612 = Static259.anIntArray639[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray663.length; local374++) {
													if (local6.anIntArray663[local374] == local612) {
														local1361 = new Class1_Sub19();
														local1361.aClass177_9 = local6;
														local1361.anObjectArray3 = local6.anObjectArray24;
														Static138.aClass195_31.method5018(local1361);
														break label692;
													}
												}
											}
										}
										local6.anInt5251 = Static351.anInt6506;
									}
									if (local6.anObjectArray18 != null && Static49.anInt1122 > local6.anInt5232) {
										if (local6.anIntArray672 == null || Static49.anInt1122 - local6.anInt5232 > 32) {
											local455 = new Class1_Sub19();
											local455.aClass177_9 = local6;
											local455.anObjectArray3 = local6.anObjectArray18;
											Static138.aClass195_31.method5018(local455);
										} else {
											label672: for (local285 = local6.anInt5232; local285 < Static49.anInt1122; local285++) {
												local612 = Static86.anIntArray212[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray672.length; local374++) {
													if (local6.anIntArray672[local374] == local612) {
														local1361 = new Class1_Sub19();
														local1361.aClass177_9 = local6;
														local1361.anObjectArray3 = local6.anObjectArray18;
														Static138.aClass195_31.method5018(local1361);
														break label672;
													}
												}
											}
										}
										local6.anInt5232 = Static49.anInt1122;
									}
									if (local6.anObjectArray32 != null && Static82.anInt1643 > local6.anInt5272) {
										if (local6.anIntArray661 == null || Static82.anInt1643 - local6.anInt5272 > 32) {
											local455 = new Class1_Sub19();
											local455.aClass177_9 = local6;
											local455.anObjectArray3 = local6.anObjectArray32;
											Static138.aClass195_31.method5018(local455);
										} else {
											label652: for (local285 = local6.anInt5272; local285 < Static82.anInt1643; local285++) {
												local612 = Static161.anIntArray371[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray661.length; local374++) {
													if (local6.anIntArray661[local374] == local612) {
														local1361 = new Class1_Sub19();
														local1361.aClass177_9 = local6;
														local1361.anObjectArray3 = local6.anObjectArray32;
														Static138.aClass195_31.method5018(local1361);
														break label652;
													}
												}
											}
										}
										local6.anInt5272 = Static82.anInt1643;
									}
									if (local6.anObjectArray11 != null && Static49.anInt1116 > local6.anInt5270) {
										if (local6.anIntArray659 == null || Static49.anInt1116 - local6.anInt5270 > 32) {
											local455 = new Class1_Sub19();
											local455.aClass177_9 = local6;
											local455.anObjectArray3 = local6.anObjectArray11;
											Static138.aClass195_31.method5018(local455);
										} else {
											label632: for (local285 = local6.anInt5270; local285 < Static49.anInt1116; local285++) {
												local612 = Static40.anIntArray554[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray659.length; local374++) {
													if (local6.anIntArray659[local374] == local612) {
														local1361 = new Class1_Sub19();
														local1361.aClass177_9 = local6;
														local1361.anObjectArray3 = local6.anObjectArray11;
														Static138.aClass195_31.method5018(local1361);
														break label632;
													}
												}
											}
										}
										local6.anInt5270 = Static49.anInt1116;
									}
									if (local6.anObjectArray23 != null && Static297.anInt5772 > local6.anInt5235) {
										if (local6.anIntArray671 == null || Static297.anInt5772 - local6.anInt5235 > 32) {
											local455 = new Class1_Sub19();
											local455.aClass177_9 = local6;
											local455.anObjectArray3 = local6.anObjectArray23;
											Static138.aClass195_31.method5018(local455);
										} else {
											label612: for (local285 = local6.anInt5235; local285 < Static297.anInt5772; local285++) {
												local612 = Static213.anIntArray539[local285 & 0x1F];
												for (local374 = 0; local374 < local6.anIntArray671.length; local374++) {
													if (local6.anIntArray671[local374] == local612) {
														local1361 = new Class1_Sub19();
														local1361.aClass177_9 = local6;
														local1361.anObjectArray3 = local6.anObjectArray23;
														Static138.aClass195_31.method5018(local1361);
														break label612;
													}
												}
											}
										}
										local6.anInt5235 = Static297.anInt5772;
									}
									if (Static125.anInt2465 > local6.anInt5205 && local6.anObjectArray12 != null) {
										local455 = new Class1_Sub19();
										local455.aClass177_9 = local6;
										local455.anObjectArray3 = local6.anObjectArray12;
										Static138.aClass195_31.method5018(local455);
									}
									if (Static152.anInt3055 > local6.anInt5205 && local6.anObjectArray17 != null) {
										local455 = new Class1_Sub19();
										local455.aClass177_9 = local6;
										local455.anObjectArray3 = local6.anObjectArray17;
										Static138.aClass195_31.method5018(local455);
									}
									if (Static80.anInt1599 > local6.anInt5205 && local6.anObjectArray20 != null) {
										local455 = new Class1_Sub19();
										local455.aClass177_9 = local6;
										local455.anObjectArray3 = local6.anObjectArray20;
										Static138.aClass195_31.method5018(local455);
									}
									if (Static304.anInt5851 > local6.anInt5205 && local6.anObjectArray15 != null) {
										local455 = new Class1_Sub19();
										local455.aClass177_9 = local6;
										local455.anObjectArray3 = local6.anObjectArray15;
										Static138.aClass195_31.method5018(local455);
									}
									if (Static332.anInt6357 > local6.anInt5205 && local6.anObjectArray25 != null) {
										local455 = new Class1_Sub19();
										local455.aClass177_9 = local6;
										local455.anObjectArray3 = local6.anObjectArray25;
										Static138.aClass195_31.method5018(local455);
									}
									local6.anInt5205 = Static119.anInt2038;
									if (local6.anObjectArray30 != null) {
										for (local285 = 0; local285 < Static184.anInt3829; local285++) {
											@Pc(1829) Class1_Sub19 local1829 = new Class1_Sub19();
											local1829.aClass177_9 = local6;
											local1829.anInt3145 = Static81.anIntArray185[local285];
											local1829.anInt3148 = Static184.anIntArray454[local285];
											local1829.anObjectArray3 = local6.anObjectArray30;
											Static138.aClass195_31.method5018(local1829);
										}
									}
									if (Static186.aBoolean329 && local6.anObjectArray28 != null) {
										local455 = new Class1_Sub19();
										local455.aClass177_9 = local6;
										local455.anObjectArray3 = local6.anObjectArray28;
										Static138.aClass195_31.method5018(local455);
									}
								}
								if (local6.anInt5208 == 5 && local6.anInt5216 != -1) {
									local6.method4692().method1036(local6.anInt5209, Static34.aClass2_6);
								}
							}
							if (!local6.aBoolean445 && Static317.aClass177_22 == null && Static46.aClass177_2 == null && !Static179.aBoolean310) {
								if ((local6.anInt5197 >= 0 || local6.anInt5240 != 0) && Static179.anInt3693 >= local28 && Static295.anInt5742 >= local30 && Static179.anInt3693 < local32 && Static295.anInt5742 < local34) {
									if (local6.anInt5197 >= 0) {
										Static118.aClass177_17 = arg0[local6.anInt5197];
									} else {
										Static118.aClass177_17 = local6;
									}
								}
								if (local6.anInt5208 == 8 && Static179.anInt3693 >= local28 && Static295.anInt5742 >= local30 && Static179.anInt3693 < local32 && Static295.anInt5742 < local34) {
									Static232.aClass177_23 = local6;
								}
								if (local6.anInt5262 > local6.anInt5209) {
									Static238.method4251(local6.anInt5262, local6.anInt5209, local17 + local6.anInt5179, Static295.anInt5742, Static179.anInt3693, local6, local22);
								}
							}
							Static275.method4784(arg3, arg2, local6, arg5, local17, arg4, local22);
							if (local6.anInt5208 == 0) {
								method1082(arg0, local6.anInt5219, local28, local30, local32, local34, local17 - local6.anInt5221, local22 - local6.anInt5182, arg8, arg9);
								if (local6.aClass177Array2 != null) {
									method1082(local6.aClass177Array2, local6.anInt5219, local28, local30, local32, local34, local17 - local6.anInt5221, local22 - local6.anInt5182, arg8, arg9);
								}
								@Pc(2026) Class1_Sub9 local2026 = (Class1_Sub9) Static348.aClass26_20.method870((long) local6.anInt5219);
								if (local2026 != null) {
									if (local2026.anInt1106 == 0 && !Static179.aBoolean310 && local223 && !Static25.aBoolean62) {
										Static198.method3732();
									}
									Static224.method4106(arg9, local34, local2026.anInt1104, local28, local22, local32, arg8, local17, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static275.method4784(arg3, arg2, local6, arg5, local17, arg4, local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1083() {
		@Pc(14) boolean local14 = Static331.anInt6338 == 1 && Static334.anInt6370 > 200 || Static331.anInt6338 == 0 && Static334.anInt6370 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static334.anInt6370; local16++) {
			@Pc(23) Class5_Sub3_Sub3_Sub1 local23 = Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local16]];
			if (local23.method3065()) {
				local23.method4584();
				if (local23.aShort75 >= 0 && local23.aShort77 >= 0 && local23.aShort78 < Static48.anInt1107 && local23.aShort76 < Static337.anInt6402) {
					local23.aBoolean285 = local23.aBoolean412 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean413) {
						local62++;
					}
					if (local23.anInt4926 > Static215.anInt4246) {
						local62 += 2;
					}
					local62 += 5 - local23.method4541() << 2;
					if (Static310.anInt5979 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt4915 = local62 + 1;
				} else {
					local23.anInt4915 = -1;
				}
			} else {
				local23.anInt4915 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static338.anInt6419; local98++) {
			@Pc(105) Class5_Sub3_Sub3_Sub2 local105 = Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local98]];
			if (local105.method4552() && local105.aClass122_1.method3563()) {
				local105.method4584();
				if (local105.aShort75 >= 0 && local105.aShort77 >= 0 && local105.aShort78 < Static48.anInt1107 && local105.aShort76 < Static337.anInt6402) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean413) {
						local141++;
					}
					if (local105.anInt4926 > Static215.anInt4246) {
						local141 += 2;
					}
					local141 += 5 - local105.method4541() << 2;
					if (Static310.anInt5979 == 0) {
						if (local105.aClass122_1.aBoolean328) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static310.anInt5979 == 1) {
						if (local105.aClass122_1.aBoolean328) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass122_1.aBoolean326) {
						local141 += 512;
					} else if (!local105.aClass122_1.aBoolean325) {
						local141 += 256;
					}
					local105.anInt4915 = local141 + 1;
				} else {
					local105.anInt4915 = -1;
				}
			} else {
				local105.anInt4915 = -1;
			}
		}
		for (local62 = 0; local62 < Static135.aClass136Array1.length; local62++) {
			@Pc(207) Class136 local207 = Static135.aClass136Array1[local62];
			if (local207 != null) {
				if (local207.anInt4068 == 1) {
					@Pc(218) Class5_Sub3_Sub3_Sub2 local218 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local207.anInt4063];
					if (local218 != null && local218.anInt4915 >= 0) {
						local218.anInt4915 += 1024;
					}
				} else if (local207.anInt4068 == 10) {
					@Pc(239) Class5_Sub3_Sub3_Sub1 local239 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local207.anInt4063];
					if (local239 != null && local239.anInt4915 >= 0) {
						local239.anInt4915 += 1024;
					}
				}
			}
		}
		Static130.aClass5_Sub3_Sub3_Sub1_1.anInt4915 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1084() {
		@Pc(7) int local7 = Static139.aBoolean248 ? Static334.anInt6370 : Static334.anInt6370 + Static338.anInt6419;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class5_Sub3_Sub3 local14;
			if (local9 < 0) {
				local14 = Static130.aClass5_Sub3_Sub3_Sub1_1;
			} else if (local9 < Static334.anInt6370) {
				local14 = Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local9]];
			} else {
				local14 = Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local9 - Static334.anInt6370]];
			}
			local14.anInt4924 = 0;
			if (local14.anInt4915 < 0) {
				local14.aBoolean413 = false;
			} else {
				@Pc(47) int local47 = local14.method4541();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt5050 & 0x7F) != 0 || (local14.anInt5047 & 0x7F) != 0) {
						local14.aBoolean413 = false;
						continue;
					}
				} else if ((local14.anInt5050 & 0x7F) != 64 || (local14.anInt5047 & 0x7F) != 64) {
					local14.aBoolean413 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt5050 >> 7;
					local94 = local14.anInt5047 >> 7;
					if (local14.anInt4915 != Static172.anIntArrayArray60[local89][local94]) {
						local14.aBoolean413 = true;
						continue;
					}
					if (Static171.anIntArrayArray35[local89][local94] > 1) {
						local119 = Static171.anIntArrayArray35[local89][local94]--;
						local14.aBoolean413 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt5050 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt5047 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt5050 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt5047 + local89 >> 7;
					if (!Static33.method880(local94, local148, local14.anInt4915, local162, local155)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt4915 == Static172.anIntArrayArray60[local173][local176]) {
									local119 = Static171.anIntArrayArray35[local173][local176]--;
								}
							}
						}
						local14.aBoolean413 = true;
						continue;
					}
				}
				if (local14 instanceof Class5_Sub3_Sub3_Sub1 && local14.anInterface8_3 != null && Static215.anInt4246 >= local14.anInt4982 && Static215.anInt4246 < local14.anInt4983) {
					((Class5_Sub3_Sub3_Sub1) local14).aBoolean285 = false;
				}
				local14.aBoolean413 = false;
				local14.anInt5046 = Static16.method362(local14.anInt5050, local14.anInt5047, Static285.anInt5511);
				Static313.method5285(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZIII)V")
	public static void method1085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static337.anInt6414 = arg5;
		Static93.anInt1786 = arg0;
		Static231.anInt4532 = arg3;
		Static273.anInt5338 = arg1;
		Static164.anInt3419 = arg4;
		if (arg2 && Static164.anInt3419 >= 100) {
			Static221.anInt4363 = Static93.anInt1786 * 128 + 64;
			Static164.anInt3425 = Static231.anInt4532 * 128 + 64;
			Static194.anInt3958 = Static16.method362(Static221.anInt4363, Static164.anInt3425, Static285.anInt5511) - Static273.anInt5338;
		}
		Static81.anInt1609 = 2;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	public static void method1089(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static138.aClass204ArrayArrayArray1 = Static198.aClass204ArrayArrayArray2;
			Static7.aClass41Array1 = Static236.aClass41Array4;
		} else {
			Static138.aClass204ArrayArrayArray1 = Static269.aClass204ArrayArrayArray3;
			Static7.aClass41Array1 = Static288.aClass41Array5;
		}
		Static56.anInt1240 = Static138.aClass204ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!rg;)Z")
	public static boolean method1090(@OriginalArg(0) Class177 arg0) {
		if (Static25.aBoolean62) {
			if (method1096(arg0).anInt5507 != 0) {
				return false;
			}
			if (arg0.anInt5208 == 0) {
				return false;
			}
		}
		return arg0.aBoolean432;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method1091() {
		Static268.anInt5172 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static338.anInt6419; local3++) {
			@Pc(10) Class5_Sub3_Sub3_Sub2 local10 = Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local3]];
			if (local10.aBoolean413 && local10.method4542() != -1) {
				@Pc(28) int local28 = (local10.method4541() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt5050 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt5047 - local28 >> 7;
				@Pc(48) Class5_Sub3_Sub3 local48 = Static66.method1368(local42, Static285.anInt5511, local35);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt4920;
					if (local48 instanceof Class5_Sub3_Sub3_Sub2) {
						local53 += 2048;
					}
					if (local48.anInt4924 == 0 && local48.method4542() != -1) {
						Static144.anIntArray333[Static268.anInt5172] = local53;
						Static201.anIntArray484[Static268.anInt5172] = local53;
						Static268.anInt5172++;
						local48.anInt4924++;
					}
					Static144.anIntArray333[Static268.anInt5172] = local53;
					Static201.anIntArray484[Static268.anInt5172] = local10.anInt4920 + 2048;
					Static268.anInt5172++;
					local48.anInt4924++;
				}
			}
		}
		Static92.method1722(Static268.anInt5172 - 1, Static201.anIntArray484, Static144.anIntArray333, 0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!rg;)Lclient!rg;")
	public static Class177 method1092(@OriginalArg(0) Class177 arg0) {
		@Pc(4) int local4 = method1096(arg0).method4891();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static140.method2694(arg0.anInt5236);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Lclient!ui;")
	public static Class1_Sub38 method1093(@OriginalArg(0) int arg0) {
		return (Class1_Sub38) Static338.aClass26_33.method870((long) arg0);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method1094() {
		@Pc(7) int local7 = Static139.aBoolean248 ? Static334.anInt6370 : Static334.anInt6370 + Static338.anInt6419;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class5_Sub3_Sub3 local14;
			if (local9 < 0) {
				local14 = Static130.aClass5_Sub3_Sub3_Sub1_1;
			} else if (local9 < Static334.anInt6370) {
				local14 = Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local9]];
			} else {
				local14 = Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local9 - Static334.anInt6370]];
			}
			if (local14.anInt4915 >= 0) {
				@Pc(40) int local40 = local14.method4541();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt5050 & 0x7F) == 0 && (local14.anInt5047 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt5050 & 0x7F) == 64 && (local14.anInt5047 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class5_Sub3_Sub3_Sub1 && local14.anInterface8_3 != null && Static215.anInt4246 >= local14.anInt4982 && Static215.anInt4246 < local14.anInt4983) {
					((Class5_Sub3_Sub3_Sub1) local14).aBoolean285 = false;
				}
				local14.anInt5046 = Static16.method362(local14.anInt5050, local14.anInt5047, Static285.anInt5511);
				Static313.method5285(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!rg;)Lclient!sj;")
	public static Class1_Sub35 method1096(@OriginalArg(0) Class177 arg0) {
		@Pc(13) Class1_Sub35 local13 = (Class1_Sub35) Static324.aClass26_31.method870(((long) arg0.anInt5219 << 32) + (long) arg0.anInt5239);
		return local13 == null ? arg0.aClass1_Sub35_11 : local13;
	}
}
