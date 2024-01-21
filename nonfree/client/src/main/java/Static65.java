import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
	public static int anInt1962;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!m;")
	public static Class3_Sub11 aClass3_Sub11_22 = new Class3_Sub11(new byte[5000]);

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Lclient!he;")
	private static Class26 aClass26_963 = Static6.method100("This computers address has been blocked");

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_961 = aClass26_963;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_962 = Static6.method100("null");

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
	public static int anInt1955 = 0;

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "Lclient!he;")
	private static Class26 aClass26_964 = Static6.method100("cyan:");

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lclient!he;")
	public static Class26 aClass26_965 = Static6.method100("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "Lclient!he;")
	public static Class26 aClass26_966 = aClass26_964;

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "Lclient!he;")
	public static Class26 aClass26_967 = Static6.method100(" <col=ffffff>");

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "Lclient!he;")
	public static Class26 aClass26_968 = aClass26_964;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method1266() {
		@Pc(3) boolean local3 = true;
		Static131.method2264(false);
		Static117.anInt3072 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static133.aByteArrayArray3.length; local14++) {
			if (Static91.anIntArray301[local14] != -1 && Static133.aByteArrayArray3[local14] == null) {
				Static133.aByteArrayArray3[local14] = Static42.aClass16_Sub1_6.method566(Static91.anIntArray301[local14], 0);
				if (Static133.aByteArrayArray3[local14] == null) {
					local3 = false;
					Static117.anInt3072++;
				}
			}
			if (Static101.anIntArray334[local14] != -1 && Static33.aByteArrayArray7[local14] == null) {
				Static33.aByteArrayArray7[local14] = Static42.aClass16_Sub1_6.method578(Static38.anIntArrayArray12[local14], Static101.anIntArray334[local14], 0);
				if (Static33.aByteArrayArray7[local14] == null) {
					Static117.anInt3072++;
					local3 = false;
				}
			}
		}
		if (!local3) {
			Static100.anInt3231 = 1;
			return;
		}
		Static125.anInt3207 = 0;
		local3 = true;
		@Pc(127) int local127;
		@Pc(116) int local116;
		for (@Pc(97) int local97 = 0; local97 < Static133.aByteArrayArray3.length; local97++) {
			@Pc(103) byte[] local103 = Static33.aByteArrayArray7[local97];
			if (local103 != null) {
				local116 = (Static75.anIntArray205[local97] & 0xFF) * 64 - Static56.anInt1700;
				local127 = (Static75.anIntArray205[local97] >> 8) * 64 - Static10.anInt286;
				if (Static114.aBoolean166) {
					local116 = 10;
					local127 = 10;
				}
				local3 &= Static110.method2005(local116, local127, local103);
			}
		}
		if (!local3) {
			Static100.anInt3231 = 2;
			return;
		}
		if (Static100.anInt3231 != 0) {
			Static30.method555(true, Static119.method2136(new Class26[] { Static11.aClass26_167, Static86.aClass26_1193 }));
		}
		method1267();
		Static102.method1900();
		method1267();
		Static62.aClass69_1.method2052();
		method1267();
		System.gc();
		for (@Pc(181) int local181 = 0; local181 < 4; local181++) {
			Static93.aClass4Array1[local181].method80();
		}
		for (local127 = 0; local127 < 4; local127++) {
			for (local116 = 0; local116 < 104; local116++) {
				for (@Pc(204) int local204 = 0; local204 < 104; local204++) {
					Static74.aByteArrayArrayArray5[local127][local116][local204] = 0;
				}
			}
		}
		method1267();
		Static121.method2167();
		local116 = Static133.aByteArrayArray3.length;
		Static78.method1364();
		Static131.method2264(true);
		@Pc(250) int local250;
		@Pc(263) int local263;
		@Pc(274) int local274;
		@Pc(385) int local385;
		@Pc(327) int local327;
		@Pc(374) int local374;
		if (!Static114.aBoolean166) {
			@Pc(278) byte[] local278;
			for (local250 = 0; local250 < local116; local250++) {
				local263 = (Static75.anIntArray205[local250] >> 8) * 64 - Static10.anInt286;
				local274 = (Static75.anIntArray205[local250] & 0xFF) * 64 - Static56.anInt1700;
				local278 = Static133.aByteArrayArray3[local250];
				if (local278 != null) {
					method1267();
					Static96.method1774(local263, local274, Static93.aClass4Array1, (Static95.anInt2596 - 6) * 8, local278, (Static88.anInt2447 - 6) * 8);
				}
			}
			for (local263 = 0; local263 < local116; local263++) {
				local274 = (Static75.anIntArray205[local263] >> 8) * 64 - Static10.anInt286;
				local327 = (Static75.anIntArray205[local263] & 0xFF) * 64 - Static56.anInt1700;
				@Pc(331) byte[] local331 = Static133.aByteArrayArray3[local263];
				if (local331 == null && Static95.anInt2596 < 800) {
					method1267();
					Static18.method276(64, local327, 64, local274);
				}
			}
			Static131.method2264(true);
			for (local274 = 0; local274 < local116; local274++) {
				local278 = Static33.aByteArrayArray7[local274];
				if (local278 != null) {
					local374 = (Static75.anIntArray205[local274] >> 8) * 64 - Static10.anInt286;
					local385 = (Static75.anIntArray205[local274] & 0xFF) * 64 - Static56.anInt1700;
					method1267();
					Static56.method1135(local278, Static62.aClass69_1, Static93.aClass4Array1, local385, local374);
				}
			}
		}
		@Pc(440) int local440;
		@Pc(452) int local452;
		if (Static114.aBoolean166) {
			@Pc(434) int local434;
			@Pc(462) int local462;
			@Pc(464) int local464;
			for (local250 = 0; local250 < 4; local250++) {
				method1267();
				for (local263 = 0; local263 < 13; local263++) {
					for (local274 = 0; local274 < 13; local274++) {
						@Pc(416) boolean local416 = false;
						local374 = Static130.anIntArrayArrayArray7[local250][local263][local274];
						if (local374 != -1) {
							local434 = local374 >> 3 & 0x7FF;
							local440 = local374 >> 1 & 0x3;
							local385 = local374 >> 24 & 0x3;
							local452 = local374 >> 14 & 0x3FF;
							local462 = local434 / 8 + (local452 / 8 << 8);
							for (local464 = 0; local464 < Static75.anIntArray205.length; local464++) {
								if (Static75.anIntArray205[local464] == local462 && Static133.aByteArrayArray3[local464] != null) {
									Static15.method265((local452 & 0x7) * 8, local385, Static93.aClass4Array1, Static133.aByteArrayArray3[local464], local440, local263 * 8, (local434 & 0x7) * 8, local274 * 8, local250);
									local416 = true;
									break;
								}
							}
						}
						if (!local416) {
							Static87.method1623(local250, local274 * 8, local263 * 8);
						}
					}
				}
			}
			for (local263 = 0; local263 < 13; local263++) {
				for (local274 = 0; local274 < 13; local274++) {
					local327 = Static130.anIntArrayArrayArray7[0][local263][local274];
					if (local327 == -1) {
						Static18.method276(8, local274 * 8, 8, local263 * 8);
					}
				}
			}
			Static131.method2264(true);
			for (local274 = 0; local274 < 4; local274++) {
				method1267();
				for (local327 = 0; local327 < 13; local327++) {
					for (local374 = 0; local374 < 13; local374++) {
						local385 = Static130.anIntArrayArrayArray7[local274][local327][local374];
						if (local385 != -1) {
							local452 = local385 >> 1 & 0x3;
							local440 = local385 >> 24 & 0x3;
							local434 = local385 >> 14 & 0x3FF;
							local462 = local385 >> 3 & 0x7FF;
							local464 = (local434 / 8 << 8) + local462 / 8;
							for (@Pc(645) int local645 = 0; local645 < Static75.anIntArray205.length; local645++) {
								if (Static75.anIntArray205[local645] == local464 && Static33.aByteArrayArray7[local645] != null) {
									Static52.method1087(local452, local327 * 8, (local462 & 0x7) * 8, Static33.aByteArrayArray7[local645], local440, local374 * 8, local274, (local434 & 0x7) * 8, Static93.aClass4Array1, Static62.aClass69_1);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static131.method2264(true);
		Static102.method1900();
		method1267();
		Static90.method1665(Static93.aClass4Array1, Static62.aClass69_1);
		Static131.method2264(true);
		local250 = Static32.anInt1043;
		if (Static132.anInt3270 < local250) {
			local250 = Static132.anInt3270;
		}
		if (Static132.anInt3270 - 1 > local250) {
		}
		if (Static98.aBoolean151) {
			Static62.aClass69_1.method2064(Static32.anInt1043);
		} else {
			Static62.aClass69_1.method2064(0);
		}
		for (local263 = 0; local263 < 104; local263++) {
			for (local274 = 0; local274 < 104; local274++) {
				Static102.method1899(local274, local263);
			}
		}
		method1267();
		Static10.method164();
		Static16.aClass66_6.method1971();
		if (Static44.aFrame1 != null) {
			Static107.aClass3_Sub11_Sub1_3.method1029(174);
			Static107.aClass3_Sub11_Sub1_3.method1001(1057001181);
		}
		if (!Static114.aBoolean166) {
			local274 = (Static88.anInt2447 - 6) / 8;
			local327 = (Static88.anInt2447 + 6) / 8;
			local374 = (Static95.anInt2596 - 6) / 8;
			local385 = (Static95.anInt2596 + 6) / 8;
			for (local440 = local274 - 1; local440 <= local327 + 1; local440++) {
				for (local452 = local374 - 1; local452 <= local385 + 1; local452++) {
					if (local440 < local274 || local440 > local327 || local452 < local374 || local452 > local385) {
						Static42.aClass16_Sub1_6.method565(Static119.method2136(new Class26[] { Static31.aClass26_1482, Static122.method2170(local440), Static2.aClass26_5, Static122.method2170(local452) }));
						Static42.aClass16_Sub1_6.method565(Static119.method2136(new Class26[] { Static23.aClass26_727, Static122.method2170(local440), Static2.aClass26_5, Static122.method2170(local452) }));
					}
				}
			}
		}
		Static4.method62(30);
		method1267();
		Static23.method875();
		Static107.aClass3_Sub11_Sub1_3.method1029(203);
		Static4.method63();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public static void method1267() {
		if (Static42.aClass43_2 != null) {
			Static42.aClass43_2.method1914();
		}
		if (Static19.aClass43_1 != null) {
			Static19.aClass43_1.method1914();
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
	public static void method1268() {
		aClass26_968 = null;
		aClass26_966 = null;
		aClass26_964 = null;
		aClass26_965 = null;
		aClass26_967 = null;
		aClass26_961 = null;
		aClass3_Sub11_22 = null;
		aClass26_963 = null;
		aClass26_962 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!we;I)V")
	public static void method1269(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static78.aBoolean105) {
			Static67.method1926(arg0);
			return;
		}
		if (Static102.anInt2770 == 1 && Static59.anInt1803 >= 715 && Static19.anInt514 >= 453) {
			Static55.aBoolean87 = !Static55.aBoolean87;
			if (Static55.aBoolean87) {
				Static109.method1996();
			} else {
				Static133.method377(Static14.aClass26_209, Static55.aClass26_831, Static89.aClass16_Sub1_12);
			}
		}
		if (Static89.anInt2466 == 5) {
			return;
		}
		Static20.anInt587++;
		if (Static89.anInt2466 != 10) {
			return;
		}
		if (Static40.anInt1264 != 2 && Static27.anInt978 == 0) {
			if (Static102.anInt2770 == 1 && Static59.anInt1803 >= 5 && Static59.anInt1803 <= 105 && Static19.anInt514 >= 463 && Static19.anInt514 <= 498) {
				Static131.method2258();
				return;
			}
			if (Static70.aClass64_2 != null) {
				Static131.method2258();
			}
		}
		@Pc(115) int local115 = Static59.anInt1803;
		@Pc(117) int local117 = Static102.anInt2770;
		@Pc(119) int local119 = Static19.anInt514;
		if (Static90.anInt2491 == 0) {
			if (local117 == 1 && local115 >= 227 && local115 <= 377 && local119 >= 271 && local119 <= 311) {
				Static21.anInt820 = 0;
				Static90.anInt2491 = 3;
			}
			if (local117 == 1 && local115 >= 387 && local115 <= 537 && local119 >= 271 && local119 <= 311) {
				Static21.anInt820 = 0;
				Static55.aClass26_830 = Static17.aClass26_259;
				Static55.aClass26_833 = Static131.aClass26_1770;
				Static90.anInt2491 = 2;
				Static55.aClass26_834 = Static131.aClass26_1811;
				return;
			}
		} else if (Static90.anInt2491 == 2) {
			@Pc(262) short local262 = 231;
			@Pc(263) int local263 = local262 + 30;
			if (local117 == 1 && local119 >= 246 && local119 < 261) {
				Static21.anInt820 = 0;
			}
			local263 += 15;
			if (local117 == 1 && local119 >= 261 && local119 < 276) {
				Static21.anInt820 = 1;
			}
			local263 += 15;
			if (local117 == 1 && local115 >= 227 && local115 <= 377 && local119 >= 301 && local119 <= 341) {
				Static55.aClass26_832 = Static55.aClass26_832.method830().method853();
				if (Static55.aClass26_832.method839() == 0) {
					Static63.method1249(Static10.aClass26_159, Static131.aClass26_1808, Static131.aClass26_1771);
					return;
				}
				if (Static55.aClass26_829.method839() == 0) {
					Static63.method1249(Static105.aClass26_1539, Static131.aClass26_1791, Static131.aClass26_1793);
					return;
				}
				Static63.method1249(Static16.aClass26_252, Static131.aClass26_1804, Static131.aClass26_1798);
				Static4.method62(20);
				return;
			}
			if (local117 == 1 && local115 >= 387 && local115 <= 537 && local119 >= 301 && local119 <= 341) {
				Static90.anInt2491 = 0;
				Static55.aClass26_829 = Static55.aClass26_831;
				Static55.aClass26_832 = Static55.aClass26_831;
			}
			while (true) {
				while (Static85.method1490()) {
					@Pc(428) boolean local428 = false;
					for (@Pc(430) int local430 = 0; local430 < Static9.aClass26_142.method839(); local430++) {
						if (Static76.anInt2094 == Static9.aClass26_142.method848(local430)) {
							local428 = true;
							break;
						}
					}
					if (Static21.anInt820 == 0) {
						if (Static91.anInt2510 == 85 && Static55.aClass26_832.method839() > 0) {
							Static55.aClass26_832 = Static55.aClass26_832.method843(0, Static55.aClass26_832.method839() - 1);
						}
						if (Static91.anInt2510 == 84 || Static91.anInt2510 == 80) {
							Static21.anInt820 = 1;
						}
						if (local428 && Static55.aClass26_832.method839() < 12) {
							Static55.aClass26_832 = Static55.aClass26_832.method852(Static76.anInt2094);
						}
					} else if (Static21.anInt820 == 1) {
						if (Static91.anInt2510 == 85 && Static55.aClass26_829.method839() > 0) {
							Static55.aClass26_829 = Static55.aClass26_829.method843(0, Static55.aClass26_829.method839() - 1);
						}
						if (Static91.anInt2510 == 84 || Static91.anInt2510 == 80) {
							Static21.anInt820 = 0;
						}
						if (Static18.anInt437 == 2 && Static91.anInt2510 == 84) {
							Static55.aClass26_832 = Static55.aClass26_832.method830().method853();
							if (Static55.aClass26_832.method839() == 0) {
								Static63.method1249(Static10.aClass26_159, Static131.aClass26_1808, Static131.aClass26_1771);
								return;
							}
							if (Static55.aClass26_829.method839() == 0) {
								Static63.method1249(Static105.aClass26_1539, Static131.aClass26_1791, Static131.aClass26_1793);
								return;
							}
							Static63.method1249(Static16.aClass26_252, Static131.aClass26_1804, Static131.aClass26_1798);
							Static4.method62(20);
							return;
						}
						if (local428 && Static55.aClass26_829.method839() < 20) {
							Static55.aClass26_829 = Static55.aClass26_829.method852(Static76.anInt2094);
						}
					}
				}
				return;
			}
		} else if (Static90.anInt2491 == 3 && local117 == 1 && local115 >= 307 && local115 <= 457 && local119 >= 301 && local119 <= 341) {
			Static90.anInt2491 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)I")
	public static int method1270() {
		return Static3.anInt72++;
	}
}
