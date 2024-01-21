import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!jb;")
	public static Class34 aClass34_11 = new Class34(64);

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "J")
	public static volatile long aLong27 = 0L;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!v;")
	private static Class62 aClass62_335 = Static45.method753("The server is being updated)3");

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "Lclient!v;")
	public static Class62 aClass62_336 = aClass62_335;

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "Lclient!v;")
	public static Class62 aClass62_337 = Static45.method753("redstone3");

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "Lclient!v;")
	public static Class62 aClass62_338 = Static45.method753("leuchten3:");

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
	public static final int anInt804 = 7759444;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "Lclient!v;")
	public static Class62 aClass62_339 = Static45.method753("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
	public static int anInt805 = 0;

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
	public static int anInt807 = 0;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "Lclient!v;")
	public static Class62 aClass62_340 = Static45.method753("(Z");

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "Lclient!v;")
	public static Class62 aClass62_341 = Static45.method753("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method515() {
		@Pc(14) int local14;
		if (Static33.anInt1088 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static33.anInt1088 > 768) {
					Static99.anIntArray284[local14] = Static8.method206(1024 - Static33.anInt1088, Static93.anIntArray274[local14], Static72.anIntArray206[local14]);
				} else if (Static33.anInt1088 <= 256) {
					Static99.anIntArray284[local14] = Static8.method206(256 - Static33.anInt1088, Static72.anIntArray206[local14], Static93.anIntArray274[local14]);
				} else {
					Static99.anIntArray284[local14] = Static93.anIntArray274[local14];
				}
			}
		} else if (Static92.anInt2450 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static92.anInt2450 > 768) {
					Static99.anIntArray284[local14] = Static8.method206(1024 - Static92.anInt2450, Static65.anIntArray184[local14], Static72.anIntArray206[local14]);
				} else if (Static92.anInt2450 > 256) {
					Static99.anIntArray284[local14] = Static65.anIntArray184[local14];
				} else {
					Static99.anIntArray284[local14] = Static8.method206(256 - Static92.anInt2450, Static72.anIntArray206[local14], Static65.anIntArray184[local14]);
				}
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				Static99.anIntArray284[local14] = Static72.anIntArray206[local14];
			}
		}
		for (local14 = 0; local14 < 33920; local14++) {
			Static46.aClass9_26.anIntArray81[local14] = Static80.aClass3_Sub1_Sub1_Sub4_4.anIntArray306[local14];
		}
		@Pc(173) int local173 = 0;
		@Pc(175) int local175 = 1152;
		@Pc(189) int local189;
		@Pc(193) int local193;
		@Pc(206) int local206;
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(230) int local230;
		for (@Pc(177) int local177 = 1; local177 < 255; local177++) {
			local189 = (256 - local177) * Static72.anIntArray203[local177] / 256;
			local193 = local189 + 22;
			if (local193 < 0) {
				local193 = 0;
			}
			local173 += local193;
			for (local206 = local193; local206 < 128; local206++) {
				local213 = Static72.anIntArray204[local173++];
				if (local213 == 0) {
					local175++;
				} else {
					local217 = local213;
					local221 = 256 - local213;
					local213 = Static99.anIntArray284[local213];
					local230 = Static46.aClass9_26.anIntArray81[local175];
					Static46.aClass9_26.anIntArray81[local175++] = ((local213 & 0xFF00) * local217 + local221 * (local230 & 0xFF00) & 0xFF0000) + ((local230 & 0xFF00FF) * local221 + local217 * (local213 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local175 += local193;
		}
		for (local189 = 0; local189 < 33920; local189++) {
			Static2.aClass9_1.anIntArray81[local189] = Static78.aClass3_Sub1_Sub1_Sub4_3.anIntArray306[local189];
		}
		local173 = 0;
		local175 = 1176;
		for (local193 = 1; local193 < 255; local193++) {
			local206 = (256 - local193) * Static72.anIntArray203[local193] / 256;
			local213 = 103 - local206;
			local175 += local206;
			for (local217 = 0; local217 < local213; local217++) {
				local221 = Static72.anIntArray204[local173++];
				if (local221 == 0) {
					local175++;
				} else {
					local230 = local221;
					@Pc(360) int local360 = Static2.aClass9_1.anIntArray81[local175];
					@Pc(364) int local364 = 256 - local221;
					local221 = Static99.anIntArray284[local221];
					Static2.aClass9_1.anIntArray81[local175++] = ((local360 & 0xFF00) * local364 + (local221 & 0xFF00) * local230 & 0xFF0000) + (local364 * (local360 & 0xFF00FF) + (local221 & 0xFF00FF) * local230 & 0xFF00FF00) >> 8;
				}
			}
			local173 += 128 - local213;
			local175 += 128 - local206 - local213;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
	public static void method516(@OriginalArg(0) int arg0) {
		Static56.method924();
		@Pc(12) int local12 = Static104.method1815(arg0).anInt727;
		if (local12 == 0) {
			return;
		}
		@Pc(24) int local24 = Static62.anIntArray174[arg0];
		if (local12 == 1) {
			if (local24 == 1) {
				Static66.method1126(0.9D);
				((Class15) Static66.anInterface4_1).method468(0.9D);
			}
			if (local24 == 2) {
				Static66.method1126(0.8D);
				((Class15) Static66.anInterface4_1).method468(0.8D);
			}
			if (local24 == 3) {
				Static66.method1126(0.7D);
				((Class15) Static66.anInterface4_1).method468(0.7D);
			}
			if (local24 == 4) {
				Static66.method1126(0.6D);
				((Class15) Static66.anInterface4_1).method468(0.6D);
			}
			Static9.method1149();
			Static69.aBoolean112 = true;
		}
		if (local12 == 3) {
			@Pc(86) short local86 = 0;
			if (local24 == 0) {
				local86 = 255;
			}
			if (local24 == 1) {
				local86 = 192;
			}
			if (local24 == 2) {
				local86 = 128;
			}
			if (local24 == 3) {
				local86 = 64;
			}
			if (local24 == 4) {
				local86 = 0;
			}
			if (Static44.anInt1234 != local86) {
				if (Static44.anInt1234 == 0 && Static90.anInt2425 != -1) {
					Static92.method1552(0, Static79.aClass42_Sub1_46, Static90.anInt2425, local86);
					Static55.anInt1546 = 0;
				} else if (local86 == 0) {
					Static92.method1551();
					Static55.anInt1546 = 0;
				} else {
					Static100.method1580(local86);
				}
				Static44.anInt1234 = local86;
			}
		}
		if (local12 == 9) {
			Static42.anInt1220 = local24;
		}
		if (local12 == 8) {
			anInt805 = local24;
			Static86.aBoolean137 = true;
		}
		if (local12 == 6) {
			Static51.anInt2322 = local24;
		}
		if (local12 == 5) {
			Static3.anInt156 = local24;
		}
		if (local12 != 4) {
			return;
		}
		if (local24 == 0) {
			Static46.anInt1364 = 127;
		}
		if (local24 == 1) {
			Static46.anInt1364 = 96;
		}
		if (local24 == 2) {
			Static46.anInt1364 = 64;
		}
		if (local24 == 3) {
			Static46.anInt1364 = 32;
		}
		if (local24 == 4) {
			Static46.anInt1364 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method517() {
		Static25.anImage3 = null;
		Static90.aFontMetrics1 = null;
		Static18.aFont1 = null;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public static void method518() {
		aClass62_336 = null;
		aClass62_340 = null;
		aClass62_335 = null;
		aClass62_338 = null;
		aClass62_341 = null;
		aClass34_11 = null;
		aByteArrayArray2 = null;
		aClass62_339 = null;
		aClass62_337 = null;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
	public static void method519() {
		Static40.aBoolean65 = true;
		Static52.method684();
		@Pc(32) boolean local32;
		if (Static92.anInt2448 != -1) {
			local32 = Static38.method676(0, 0, 0, Static92.anInt2448, 190, -1, 1, 261);
			if (!local32) {
				Static52.aBoolean64 = true;
			}
		} else if (Static72.anIntArray205[Static34.anInt1097] != -1) {
			local32 = Static38.method676(0, 0, 0, Static72.anIntArray205[Static34.anInt1097], 190, -1, 1, 261);
			if (!local32) {
				Static52.aBoolean64 = true;
			}
		}
		if (Static40.aBoolean66 && Static6.anInt211 == 1) {
			if (Static100.anInt2474 == 1) {
				Static109.method1880();
			} else {
				Static49.method784();
			}
		}
		Static89.method1527();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub6 local10 = (Class3_Sub6) Static77.aClass24_58.method534(); local10 != null; local10 = (Class3_Sub6) Static77.aClass24_58.method525()) {
			if (local10.anInt1201 != -1 || local10.anIntArray83 != null) {
				@Pc(25) int local25 = 0;
				if (local10.anInt1205 < arg2) {
					local25 = arg2 - local10.anInt1205;
				} else if (local10.anInt1200 > arg2) {
					local25 = local10.anInt1200 - arg2;
				}
				if (arg3 > local10.anInt1208) {
					local25 += arg3 - local10.anInt1208;
				} else if (arg3 < local10.anInt1212) {
					local25 += local10.anInt1212 - arg3;
				}
				if (local10.anInt1194 < local25 - 64 || Static46.anInt1364 == 0) {
					if (local10.aClass3_Sub4_Sub1_1 != null) {
						Static53.aClass3_Sub4_Sub2_1.method1570(local10.aClass3_Sub4_Sub1_1);
						local10.aClass3_Sub4_Sub1_1 = null;
					}
					if (local10.aClass3_Sub4_Sub1_2 != null) {
						Static53.aClass3_Sub4_Sub2_1.method1570(local10.aClass3_Sub4_Sub1_2);
						local10.aClass3_Sub4_Sub1_2 = null;
					}
				} else {
					local25 -= 64;
					if (local25 < 0) {
						local25 = 0;
					}
					@Pc(133) int local133 = (local10.anInt1194 - local25) * Static46.anInt1364 / local10.anInt1194;
					if (local10.aClass3_Sub4_Sub1_1 != null) {
						local10.aClass3_Sub4_Sub1_1.method409(local133);
					} else if (local10.anInt1201 >= 0) {
						@Pc(145) Class49 local145 = Static114.method1190(Static19.aClass42_Sub1_62, local10.anInt1201);
						if (local145 != null) {
							@Pc(152) Class3_Sub5_Sub1 local152 = local145.method1189().method554(Static104.aClass12_1);
							@Pc(157) Class3_Sub4_Sub1 local157 = Static111.method410(local152, local133);
							local157.method413(-1);
							Static53.aClass3_Sub4_Sub2_1.method1574(local157);
							local10.aClass3_Sub4_Sub1_1 = local157;
						}
					}
					if (local10.aClass3_Sub4_Sub1_2 != null) {
						local10.aClass3_Sub4_Sub1_2.method409(local133);
						if (!local10.aClass3_Sub4_Sub1_2.method406()) {
							local10.aClass3_Sub4_Sub1_2 = null;
						}
					} else if (local10.anIntArray83 != null && (local10.anInt1192 -= arg0) <= 0) {
						@Pc(197) int local197 = (int) ((double) local10.anIntArray83.length * Math.random());
						@Pc(205) Class49 local205 = Static114.method1190(Static19.aClass42_Sub1_62, local10.anIntArray83[local197]);
						if (local205 != null) {
							@Pc(212) Class3_Sub5_Sub1 local212 = local205.method1189().method554(Static104.aClass12_1);
							@Pc(217) Class3_Sub4_Sub1 local217 = Static111.method410(local212, local133);
							local217.method413(0);
							Static53.aClass3_Sub4_Sub2_1.method1574(local217);
							local10.aClass3_Sub4_Sub1_2 = local217;
						}
						local10.anInt1192 = (int) ((double) (local10.anInt1206 - local10.anInt1210) * Math.random()) + local10.anInt1210;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method521() {
		Static71.anInt1937++;
		Static86.method1408(true);
		Static18.method467(true);
		Static86.method1408(false);
		Static18.method467(false);
		Static12.method301();
		Static42.method713();
		@Pc(35) int local35;
		@Pc(33) int local33;
		if (!Static63.aBoolean147) {
			local33 = Static53.anInt1432 + Static35.anInt1106 & 0x7FF;
			local35 = Static71.anInt1947;
			if (Static83.anInt539 / 256 > local35) {
				local35 = Static83.anInt539 / 256;
			}
			if (Static16.aBooleanArray2[4] && Static86.anIntArray247[4] + 128 > local35) {
				local35 = Static86.anIntArray247[4] + 128;
			}
			Static7.method177(Static91.method1541(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887, Static27.anInt818) - 50, Static77.anInt2064, Static45.anInt1332, local35, local33, local35 * 3 + 600);
		}
		if (Static63.aBoolean147) {
			local35 = Static30.method600();
		} else {
			local35 = Static17.method1873();
		}
		@Pc(94) int local94 = Static23.anInt752;
		local33 = Static96.anInt2555;
		@Pc(98) int local98 = Static96.anInt2559;
		@Pc(100) int local100 = Static69.anInt1904;
		@Pc(102) int local102 = Static4.anInt187;
		for (@Pc(104) int local104 = 0; local104 < 5; local104++) {
			if (Static16.aBooleanArray2[local104]) {
				@Pc(147) int local147 = (int) (Math.random() * (double) (Static13.anIntArray43[local104] * 2 + 1) - (double) Static13.anIntArray43[local104] + Math.sin((double) Static32.anIntArray70[local104] / 100.0D * (double) Static63.anIntArray264[local104]) * (double) Static86.anIntArray247[local104]);
				if (local104 == 1) {
					Static23.anInt752 += local147;
				}
				if (local104 == 0) {
					Static96.anInt2555 += local147;
				}
				if (local104 == 2) {
					Static4.anInt187 += local147;
				}
				if (local104 == 3) {
					Static69.anInt1904 = Static69.anInt1904 + local147 & 0x7FF;
				}
				if (local104 == 4) {
					Static96.anInt2559 += local147;
					if (Static96.anInt2559 < 128) {
						Static96.anInt2559 = 128;
					}
					if (Static96.anInt2559 > 383) {
						Static96.anInt2559 = 383;
					}
				}
			}
		}
		Static102.method1706();
		Static57.anInt1613 = Static61.anInt1672 - 4;
		Static57.anInt1609 = Static6.anInt208 - 4;
		Static57.aBoolean86 = true;
		Static57.anInt1610 = 0;
		Static97.method1734();
		Static76.aClass1_1.method48(Static96.anInt2555, Static23.anInt752, Static4.anInt187, Static96.anInt2559, Static69.anInt1904, local35);
		Static76.aClass1_1.method18();
		Static64.method1082();
		Static58.method977();
		((Class15) Static66.anInterface4_1).method462(Static54.anInt2739);
		Static89.method1531();
		if (Static51.aBoolean140 && Static16.method435() == 0) {
			Static51.aBoolean140 = false;
		}
		if (Static51.aBoolean140) {
			Static102.method1706();
			Static97.method1734();
			Static74.method1203(null, Static93.aClass62_1129, false);
		}
		Static79.method1286();
		Static69.anInt1904 = local100;
		Static23.anInt752 = local94;
		Static4.anInt187 = local102;
		Static96.anInt2559 = local98;
		Static96.anInt2555 = local33;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
	public static void method522() {
		Static90.anInt2427 = 0;
		Static68.anInt1897 = 0;
		Static94.method1595();
		Static74.method1195();
		Static4.method161();
		Static27.method533();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static68.anInt1897; local21++) {
			local27 = Static105.anIntArray309[local21];
			if (Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local27].anInt1875 != Static12.anInt451) {
				Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local27] = null;
			}
		}
		if (Static10.aClass3_Sub8_Sub1_5.anInt2704 != Static63.anInt2386) {
			throw new RuntimeException("gpp1 pos:" + Static10.aClass3_Sub8_Sub1_5.anInt2704 + " psize:" + Static63.anInt2386);
		}
		for (local27 = 0; local27 < Static91.anInt2431; local27++) {
			if (Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[Static6.anIntArray21[local27]] == null) {
				throw new RuntimeException("gpp2 pos:" + local27 + " size:" + Static91.anInt2431);
			}
		}
	}
}
