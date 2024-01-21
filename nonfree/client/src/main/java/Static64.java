import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_17;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!mb;")
	public static Class42 aClass42_47;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!kb;")
	public static Class9 aClass9_31;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!mb;")
	public static Class42 aClass42_48;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "Lclient!nd;")
	public static Class3_Sub1_Sub10 aClass3_Sub1_Sub10_1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
	public static int[] anIntArray183 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public static int anInt1756 = 500;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!v;")
	public static Class62 aClass62_769 = Static45.method753("@gre@");

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!v;")
	public static Class62 aClass62_770 = Static45.method753("");

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_771 = Static45.method753("Sprites geladen)3");

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Lclient!v;")
	public static Class62 aClass62_772 = Static45.method753("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[Lclient!v;")
	public static Class62[] aClass62Array10 = new Class62[200];

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!v;")
	public static Class62 aClass62_773 = Static45.method753(":chalreq:");

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_774 = Static45.method753("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "Lclient!v;")
	public static Class62 aClass62_775 = Static45.method753("(X100(U(Y");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1077() {
		aClass62_775 = null;
		aClass62_769 = null;
		anIntArray183 = null;
		aClass62_772 = null;
		aClass3_Sub1_Sub10_1 = null;
		aClass62_774 = null;
		aClass62_770 = null;
		aClass3_Sub1_Sub1_Sub1_17 = null;
		aClass42_47 = null;
		aClass42_48 = null;
		aClass9_31 = null;
		aClass62_771 = null;
		aClass62_773 = null;
		aClass62Array10 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z")
	public static boolean method1078(@OriginalArg(0) int arg0) {
		if (!Static36.method666(arg0)) {
			return false;
		}
		@Pc(13) boolean local13 = false;
		@Pc(17) Class3_Sub1_Sub6[] local17 = Static65.aClass3_Sub1_Sub6ArrayArray1[arg0];
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Class3_Sub1_Sub6 local25 = local17[local19];
			if (local25 != null && local25.anInt924 == 6) {
				@Pc(50) int local50;
				if (local25.anInt912 != -1 || local25.anInt913 != -1) {
					@Pc(45) boolean local45 = Static4.method162(local25);
					if (local45) {
						local50 = local25.anInt913;
					} else {
						local50 = local25.anInt912;
					}
					if (local50 != -1) {
						@Pc(62) Class3_Sub1_Sub11 local62 = Static41.method705(local50);
						local25.anInt880 += Static54.anInt2739;
						label50: while (true) {
							do {
								do {
									if (local25.anInt880 <= local62.anIntArray231[local25.anInt935]) {
										break label50;
									}
									local25.anInt880 -= local62.anIntArray231[local25.anInt935];
									local13 = true;
									local25.anInt935++;
								} while (local25.anInt935 < local62.anIntArray232.length);
								local25.anInt935 -= local62.anInt2016;
							} while (local25.anInt935 >= 0 && local25.anInt935 < local62.anIntArray232.length);
							local25.anInt935 = 0;
						}
					}
				}
				if (local25.anInt901 != 0) {
					@Pc(144) int local144 = local25.anInt901 >> 16;
					local50 = local25.anInt901 << 16 >> 16;
					@Pc(155) int local155 = local144 * Static54.anInt2739;
					local13 = true;
					local50 *= Static54.anInt2739;
					local25.anInt891 = local50 + local25.anInt891 & 0x7FF;
					local25.anInt911 = local25.anInt911 + local155 & 0x7FF;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public static void method1082() {
		Static2.anInt53 = 0;
		@Pc(84) int local84;
		for (@Pc(14) int local14 = -1; local14 < Static91.anInt2431 + Static39.anInt1159; local14++) {
			@Pc(32) Class3_Sub1_Sub3_Sub1 local32;
			if (local14 == -1) {
				local32 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1;
			} else if (local14 < Static91.anInt2431) {
				local32 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[Static6.anIntArray21[local14]];
			} else {
				local32 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[Static16.anIntArray52[local14 - Static91.anInt2431]];
			}
			if (local32 != null && local32.method1153()) {
				@Pc(61) Class3_Sub1_Sub4 local61;
				if (local32 instanceof Class3_Sub1_Sub3_Sub1_Sub2) {
					local61 = ((Class3_Sub1_Sub3_Sub1_Sub2) local32).aClass3_Sub1_Sub4_1;
					if (local61.anIntArray49 != null) {
						local61 = local61.method443();
					}
					if (local61 == null) {
						continue;
					}
				}
				if (Static91.anInt2431 <= local14) {
					local61 = ((Class3_Sub1_Sub3_Sub1_Sub2) local32).aClass3_Sub1_Sub4_1;
					if (local61.anInt663 >= 0 && local61.anInt663 < Static39.aClass3_Sub1_Sub1_Sub4Array25.length) {
						Static7.method174(local32, local32.anInt1850 + 15);
						if (Static4.anInt186 > -1) {
							Static39.aClass3_Sub1_Sub1_Sub4Array25[local61.anInt663].method1751(Static4.anInt186 - 12, Static96.anInt2562 + -30);
						}
					}
					if (Static31.anInt983 == 1 && Static99.anInt2598 == Static16.anIntArray52[local14 - Static91.anInt2431] && Static12.anInt451 % 20 < 10) {
						Static7.method174(local32, local32.anInt1850 + 15);
						if (Static4.anInt186 > -1) {
							Static49.aClass3_Sub1_Sub1_Sub4Array28[0].method1751(Static4.anInt186 - 12, Static96.anInt2562 + -28);
						}
					}
				} else {
					@Pc(82) Class3_Sub1_Sub3_Sub1_Sub1 local82 = (Class3_Sub1_Sub3_Sub1_Sub1) local32;
					local84 = 30;
					if (local82.anInt1345 != -1 || local82.anInt1347 != -1) {
						Static7.method174(local32, local32.anInt1850 + 15);
						if (Static4.anInt186 > -1) {
							if (local82.anInt1345 != -1) {
								Static19.aClass3_Sub1_Sub1_Sub4Array58[local82.anInt1345].method1751(Static4.anInt186 - 12, Static96.anInt2562 + -30);
								local84 += 25;
							}
							if (local82.anInt1347 != -1) {
								Static39.aClass3_Sub1_Sub1_Sub4Array25[local82.anInt1347].method1751(Static4.anInt186 - 12, -local84 + Static96.anInt2562);
								local84 += 25;
							}
						}
					}
					if (local14 >= 0 && Static31.anInt983 == 10 && Static56.anInt1569 == Static6.anIntArray21[local14]) {
						Static7.method174(local32, local32.anInt1850 + 15);
						if (Static4.anInt186 > -1) {
							Static49.aClass3_Sub1_Sub1_Sub4Array28[1].method1751(Static4.anInt186 - 12, Static96.anInt2562 - local84);
						}
					}
				}
				if (local32.aClass62_810 != null && (local14 >= Static91.anInt2431 || Static72.anInt1948 == 0 || Static72.anInt1948 == 3 || Static72.anInt1948 == 1 && method1085(((Class3_Sub1_Sub3_Sub1_Sub1) local32).aClass62_570))) {
					Static7.method174(local32, local32.anInt1850);
					if (Static4.anInt186 > -1 && Static102.anInt2651 > Static2.anInt53) {
						Static102.anIntArray288[Static2.anInt53] = Static86.aClass3_Sub1_Sub1_Sub3_11.method1484(local32.aClass62_810) / 2;
						Static102.anIntArray289[Static2.anInt53] = Static86.aClass3_Sub1_Sub1_Sub3_11.anInt2360;
						Static102.anIntArray286[Static2.anInt53] = Static4.anInt186;
						Static102.anIntArray291[Static2.anInt53] = Static96.anInt2562;
						Static102.anIntArray287[Static2.anInt53] = local32.anInt1860;
						Static102.anIntArray293[Static2.anInt53] = local32.anInt1841;
						Static102.anIntArray290[Static2.anInt53] = local32.anInt1835;
						Static102.aClass62Array13[Static2.anInt53] = local32.aClass62_810;
						Static2.anInt53++;
					}
				}
				if (Static12.anInt451 < local32.anInt1864) {
					Static7.method174(local32, local32.anInt1850 + 15);
					if (Static4.anInt186 > -1) {
						local84 = local32.anInt1842 * 30 / local32.anInt1831;
						if (local84 > 30) {
							local84 = 30;
						}
						Static97.method1733(Static4.anInt186 - 15, Static96.anInt2562 + -3, local84, 5, 65280);
						Static97.method1733(Static4.anInt186 + local84 - 15, Static96.anInt2562 + -3, 30 - local84, 5, 16711680);
					}
				}
				for (local84 = 0; local84 < 4; local84++) {
					if (Static12.anInt451 < local32.anIntArray199[local84]) {
						Static7.method174(local32, local32.anInt1850 / 2);
						if (Static4.anInt186 > -1) {
							if (local84 == 1) {
								Static96.anInt2562 -= 20;
							}
							if (local84 == 2) {
								Static4.anInt186 -= 15;
								Static96.anInt2562 -= 10;
							}
							if (local84 == 3) {
								Static4.anInt186 += 15;
								Static96.anInt2562 -= 10;
							}
							Static51.aClass3_Sub1_Sub1_Sub4Array49[local32.anIntArray197[local84]].method1751(Static4.anInt186 - 12, Static96.anInt2562 + -12);
							Static71.aClass3_Sub1_Sub1_Sub3_8.method1486(Static99.method1662(local32.anIntArray196[local84]), Static4.anInt186, Static96.anInt2562 + 4, 0);
							Static71.aClass3_Sub1_Sub1_Sub3_8.method1486(Static99.method1662(local32.anIntArray196[local84]), Static4.anInt186 - 1, Static96.anInt2562 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(511) int local511 = 0; local511 < Static2.anInt53; local511++) {
			local84 = Static102.anIntArray286[local511];
			@Pc(521) int local521 = Static102.anIntArray288[local511];
			@Pc(525) int local525 = Static102.anIntArray291[local511];
			@Pc(529) int local529 = Static102.anIntArray289[local511];
			@Pc(531) boolean local531 = true;
			while (local531) {
				local531 = false;
				for (@Pc(537) int local537 = 0; local537 < local511; local537++) {
					if (Static102.anIntArray291[local537] - Static102.anIntArray289[local537] < local525 - -2 && Static102.anIntArray291[local537] + 2 > -local529 + local525 && Static102.anIntArray288[local537] + Static102.anIntArray286[local537] > local84 - local521 && local521 + local84 > Static102.anIntArray286[local537] - Static102.anIntArray288[local537] && local525 > Static102.anIntArray291[local537] - Static102.anIntArray289[local537]) {
						local525 = Static102.anIntArray291[local537] - Static102.anIntArray289[local537];
						local531 = true;
					}
				}
			}
			Static4.anInt186 = Static102.anIntArray286[local511];
			Static96.anInt2562 = Static102.anIntArray291[local511] = local525;
			@Pc(639) Class62 local639 = Static102.aClass62Array13[local511];
			if (Static51.anInt2322 == 0) {
				@Pc(643) int local643 = 16776960;
				if (Static102.anIntArray287[local511] < 6) {
					local643 = Static22.anIntArray57[Static102.anIntArray287[local511]];
				}
				if (Static102.anIntArray287[local511] == 6) {
					local643 = Static71.anInt1937 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static102.anIntArray287[local511] == 7) {
					local643 = Static71.anInt1937 % 20 >= 10 ? 65535 : 255;
				}
				if (Static102.anIntArray287[local511] == 8) {
					local643 = Static71.anInt1937 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(718) int local718;
				if (Static102.anIntArray287[local511] == 9) {
					local718 = 150 - Static102.anIntArray290[local511];
					if (local718 < 50) {
						local643 = local718 * 1280 + 16711680;
					} else if (local718 < 100) {
						local643 = 16776960 - (local718 - 50) * 327680;
					} else if (local718 < 150) {
						local643 = (local718 - 100) * 5 + 65280;
					}
				}
				if (Static102.anIntArray287[local511] == 10) {
					local718 = 150 - Static102.anIntArray290[local511];
					if (local718 < 50) {
						local643 = local718 * 5 + 16711680;
					} else if (local718 < 100) {
						local643 = 16711935 + 16384000 - local718 * 327680;
					} else if (local718 < 150) {
						local643 = (local718 - 100) * 327680 + 255 - (local718 - 100) * 5;
					}
				}
				if (Static102.anIntArray287[local511] == 11) {
					local718 = 150 - Static102.anIntArray290[local511];
					if (local718 < 50) {
						local643 = 16777215 - local718 * 327685;
					} else if (local718 < 100) {
						local643 = (local718 - 50) * 327685 + 65280;
					} else if (local718 < 150) {
						local643 = 16777215 - (local718 - 100) * 327680;
					}
				}
				if (Static102.anIntArray293[local511] == 0) {
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(local639, Static4.anInt186, Static96.anInt2562 + 1, 0);
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(local639, Static4.anInt186, Static96.anInt2562, local643);
				}
				if (Static102.anIntArray293[local511] == 1) {
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1476(local639, Static4.anInt186, Static96.anInt2562 + 1, 0, Static71.anInt1937);
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1476(local639, Static4.anInt186, Static96.anInt2562, local643, Static71.anInt1937);
				}
				if (Static102.anIntArray293[local511] == 2) {
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1481(local639, Static4.anInt186, Static96.anInt2562 + 1, 0, Static71.anInt1937);
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1481(local639, Static4.anInt186, Static96.anInt2562, local643, Static71.anInt1937);
				}
				if (Static102.anIntArray293[local511] == 3) {
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1472(local639, Static4.anInt186, Static96.anInt2562 + 1, 0, Static71.anInt1937, 150 - Static102.anIntArray290[local511]);
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1472(local639, Static4.anInt186, Static96.anInt2562, local643, Static71.anInt1937, 150 - Static102.anIntArray290[local511]);
				}
				@Pc(988) int local988;
				if (Static102.anIntArray293[local511] == 4) {
					local718 = Static86.aClass3_Sub1_Sub1_Sub3_11.method1484(local639);
					local988 = (local718 + 100) * (150 - Static102.anIntArray290[local511]) / 150;
					Static97.method1728(Static4.anInt186 - 50, 0, Static4.anInt186 + 50, 334);
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1475(local639, Static4.anInt186 + 50 - local988, Static96.anInt2562 + 1, 0);
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1475(local639, Static4.anInt186 + 50 - local988, Static96.anInt2562, local643);
					Static97.method1729();
				}
				if (Static102.anIntArray293[local511] == 5) {
					local718 = 150 - Static102.anIntArray290[local511];
					Static97.method1728(0, Static96.anInt2562 - Static86.aClass3_Sub1_Sub1_Sub3_11.anInt2360 - 1, 512, Static96.anInt2562 + 5);
					local988 = 0;
					if (local718 < 25) {
						local988 = local718 - 25;
					} else if (local718 > 125) {
						local988 = local718 - 125;
					}
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(local639, Static4.anInt186, local988 + Static96.anInt2562 + 1, 0);
					Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(local639, Static4.anInt186, local988 + Static96.anInt2562, local643);
					Static97.method1729();
				}
			} else {
				Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(local639, Static4.anInt186, Static96.anInt2562 + 1, 0);
				Static86.aClass3_Sub1_Sub1_Sub3_11.method1486(local639, Static4.anInt186, Static96.anInt2562, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1083() {
		Static109.aClass2_1.method1326();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static63.aLongArray30[local6] = 0L;
		}
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static58.aLongArray18[local18] = 0L;
		}
		Static6.anInt209 = 0;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)Z")
	public static boolean method1084() {
		@Pc(3) long local3 = System.currentTimeMillis();
		@Pc(9) int local9 = (int) (local3 - Static90.aLong72);
		Static90.aLong72 = local3;
		if (local9 > 200) {
			local9 = 200;
		}
		Static28.anInt889 += local9;
		if (Static7.anInt228 == 0 && Static102.anInt2650 == 0 && Static62.anInt1716 == 0 && Static98.anInt2584 == 0) {
			return true;
		} else if (Static94.aClass41_4 == null) {
			return false;
		} else {
			try {
				if (Static28.anInt889 > 30000) {
					throw new IOException();
				}
				@Pc(60) Class3_Sub1_Sub10 local60;
				@Pc(65) Class3_Sub8 local65;
				while (Static102.anInt2650 < 20 && Static98.anInt2584 > 0) {
					local60 = (Class3_Sub1_Sub10) Static46.aClass43_6.method1087();
					local65 = new Class3_Sub8(4);
					local65.method1806(1);
					local65.method1794((int) local60.aLong81);
					Static94.aClass41_4.method1033(local65.aByteArray26, 4);
					Static41.aClass43_4.method1081(local60.aLong81, local60);
					Static98.anInt2584--;
					Static102.anInt2650++;
				}
				while (Static7.anInt228 < 20 && Static62.anInt1716 > 0) {
					local60 = (Class3_Sub1_Sub10) Static22.aClass40_1.method983();
					local65 = new Class3_Sub8(4);
					local65.method1806(0);
					local65.method1794((int) local60.aLong81);
					Static94.aClass41_4.method1033(local65.aByteArray26, 4);
					local60.method1839();
					Static17.aClass43_10.method1081(local60.aLong81, local60);
					Static7.anInt228++;
					Static62.anInt1716--;
				}
				for (@Pc(170) int local170 = 0; local170 < 100; local170++) {
					@Pc(176) int local176 = Static94.aClass41_4.method1029();
					if (local176 < 0) {
						throw new IOException();
					}
					if (local176 == 0) {
						break;
					}
					@Pc(192) byte local192 = 0;
					Static28.anInt889 = 0;
					if (aClass3_Sub1_Sub10_1 == null) {
						local192 = 8;
					} else if (Static18.anInt683 == 0) {
						local192 = 1;
					}
					@Pc(215) int local215;
					@Pc(239) int local239;
					@Pc(289) int local289;
					@Pc(304) int local304;
					if (local192 > 0) {
						local215 = local192 - Static109.aClass3_Sub8_6.anInt2704;
						if (local176 < local215) {
							local215 = local176;
						}
						Static94.aClass41_4.method1032(local215, Static109.aClass3_Sub8_6.aByteArray26, Static109.aClass3_Sub8_6.anInt2704);
						if (Static102.aByte3 != 0) {
							for (local239 = 0; local239 < local215; local239++) {
								Static109.aClass3_Sub8_6.aByteArray26[Static109.aClass3_Sub8_6.anInt2704 + local239] ^= Static102.aByte3;
							}
						}
						Static109.aClass3_Sub8_6.anInt2704 += local215;
						if (Static109.aClass3_Sub8_6.anInt2704 < local192) {
							break;
						}
						if (aClass3_Sub1_Sub10_1 == null) {
							Static109.aClass3_Sub8_6.anInt2704 = 0;
							local239 = Static109.aClass3_Sub8_6.method1803();
							local289 = Static109.aClass3_Sub8_6.method1789();
							@Pc(296) long local296 = (long) ((local239 << 16) + local289);
							@Pc(300) int local300 = Static109.aClass3_Sub8_6.method1803();
							local304 = Static109.aClass3_Sub8_6.method1770();
							@Pc(310) Class3_Sub1_Sub10 local310 = (Class3_Sub1_Sub10) Static41.aClass43_4.method1079(local296);
							Static20.aBoolean36 = true;
							if (local310 == null) {
								local310 = (Class3_Sub1_Sub10) Static17.aClass43_10.method1079(local296);
								Static20.aBoolean36 = false;
							}
							if (local310 == null) {
								throw new IOException();
							}
							@Pc(337) int local337 = local300 == 0 ? 5 : 9;
							aClass3_Sub1_Sub10_1 = local310;
							Static54.aClass3_Sub8_5 = new Class3_Sub8(local304 + local337 + aClass3_Sub1_Sub10_1.aByte2);
							Static54.aClass3_Sub8_5.method1806(local300);
							Static54.aClass3_Sub8_5.method1792(local304);
							Static109.aClass3_Sub8_6.anInt2704 = 0;
							Static18.anInt683 = 8;
						} else if (Static18.anInt683 == 0) {
							if (Static109.aClass3_Sub8_6.aByteArray26[0] == -1) {
								Static109.aClass3_Sub8_6.anInt2704 = 0;
								Static18.anInt683 = 1;
							} else {
								aClass3_Sub1_Sub10_1 = null;
							}
						}
					} else {
						local239 = 512 - Static18.anInt683;
						local215 = Static54.aClass3_Sub8_5.aByteArray26.length - aClass3_Sub1_Sub10_1.aByte2;
						if (local215 - Static54.aClass3_Sub8_5.anInt2704 < local239) {
							local239 = local215 - Static54.aClass3_Sub8_5.anInt2704;
						}
						if (local176 < local239) {
							local239 = local176;
						}
						Static94.aClass41_4.method1032(local239, Static54.aClass3_Sub8_5.aByteArray26, Static54.aClass3_Sub8_5.anInt2704);
						if (Static102.aByte3 != 0) {
							for (local289 = 0; local289 < local239; local289++) {
								Static54.aClass3_Sub8_5.aByteArray26[Static54.aClass3_Sub8_5.anInt2704 + local289] ^= Static102.aByte3;
							}
						}
						Static54.aClass3_Sub8_5.anInt2704 += local239;
						Static18.anInt683 += local239;
						if (Static54.aClass3_Sub8_5.anInt2704 == local215) {
							if (aClass3_Sub1_Sub10_1.aLong81 == 16711935L) {
								Static77.aClass3_Sub8_4 = Static54.aClass3_Sub8_5;
								for (local289 = 0; local289 < 256; local289++) {
									@Pc(489) Class42_Sub1 local489 = Static105.aClass42_Sub1Array1[local289];
									if (local489 != null) {
										Static77.aClass3_Sub8_4.anInt2704 = local289 * 4 + 5;
										local304 = Static77.aClass3_Sub8_4.method1770();
										local489.method1532(local304);
									}
								}
							} else {
								Static17.aCRC32_6.reset();
								Static17.aCRC32_6.update(Static54.aClass3_Sub8_5.aByteArray26, 0, local215);
								local289 = (int) Static17.aCRC32_6.getValue();
								if (aClass3_Sub1_Sub10_1.anInt1930 != local289) {
									try {
										Static94.aClass41_4.method1025();
									} catch (@Pc(533) Exception local533) {
									}
									Static86.anInt2295++;
									Static102.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									Static94.aClass41_4 = null;
									return false;
								}
								Static17.anInt2844 = 0;
								Static86.anInt2295 = 0;
								aClass3_Sub1_Sub10_1.aClass42_Sub1_42.method1528((int) (aClass3_Sub1_Sub10_1.aLong81 & 0xFFFFL), Static20.aBoolean36, Static54.aClass3_Sub8_5.aByteArray26, (aClass3_Sub1_Sub10_1.aLong81 & 0xFF0000L) == 16711680L);
							}
							aClass3_Sub1_Sub10_1.method1852();
							Static54.aClass3_Sub8_5 = null;
							Static18.anInt683 = 0;
							aClass3_Sub1_Sub10_1 = null;
							if (Static20.aBoolean36) {
								Static102.anInt2650--;
							} else {
								Static7.anInt228--;
							}
						} else {
							if (Static18.anInt683 != 512) {
								break;
							}
							Static18.anInt683 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(613) IOException local613) {
				try {
					Static94.aClass41_4.method1025();
				} catch (@Pc(618) Exception local618) {
				}
				Static17.anInt2844++;
				Static94.aClass41_4 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!v;)Z")
	public static boolean method1085(@OriginalArg(1) Class62 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static24.anInt762; local11++) {
			if (arg0.method1680(aClass62Array10[local11])) {
				return true;
			}
		}
		return arg0.method1680(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.aClass62_570);
	}
}
