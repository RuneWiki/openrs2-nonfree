import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!m", name = "Tc", descriptor = "J")
	public static long aLong54;

	@OriginalMember(owner = "client!m", name = "Hc", descriptor = "I")
	public static int anInt2040 = 0;

	@OriginalMember(owner = "client!m", name = "Ic", descriptor = "Lclient!lc;")
	public static Class31 aClass31_714 = Static56.method1206("glow2:");

	@OriginalMember(owner = "client!m", name = "Jc", descriptor = "I")
	public static int anInt2041 = 1;

	@OriginalMember(owner = "client!m", name = "Kc", descriptor = "I")
	public static int anInt2042 = 0;

	@OriginalMember(owner = "client!m", name = "Mc", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!m", name = "Nc", descriptor = "[I")
	public static int[] anIntArray286 = new int[100];

	@OriginalMember(owner = "client!m", name = "Oc", descriptor = "I")
	public static int anInt2044 = 0;

	@OriginalMember(owner = "client!m", name = "Pc", descriptor = "[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array8 = new Class2_Sub1_Sub3_Sub2[1000];

	@OriginalMember(owner = "client!m", name = "Rc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_715 = Static56.method1206(")3)3)3");

	@OriginalMember(owner = "client!m", name = "Sc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_716 = Static56.method1206(":duelreq:");

	@OriginalMember(owner = "client!m", name = "Zc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_717 = Static56.method1206("Walk here @whi@");

	@OriginalMember(owner = "client!m", name = "bd", descriptor = "[I")
	public static int[] anIntArray287 = new int[50];

	@OriginalMember(owner = "client!m", name = "cd", descriptor = "Lclient!lc;")
	public static Class31 aClass31_718 = Static56.method1206("headicons_pk");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([BIIIZ)V")
	public static void method1279(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static83.anInt2318 >= 0) {
			arg1 -= 20;
			if (arg1 < 1) {
				arg1 = 1;
			}
			Static57.anInt2684 = arg1;
			if (Static83.anInt2318 == 0) {
				Static86.anInt2335 = 0;
			} else {
				@Pc(32) int local32 = Static100.method1710(Static83.anInt2318);
				@Pc(36) int local36 = local32 - Static3.anInt126;
				Static86.anInt2335 = (Static86.anInt2335 + local36 + 3600 - 1) / Static86.anInt2335;
			}
			Static45.anInt1601 = arg2;
			Static83.aByteArray21 = arg0;
			Static103.aBoolean153 = arg3;
		} else if (Static57.anInt2684 == 0) {
			Static31.method853(arg3, arg0, arg2);
		} else {
			Static83.aByteArray21 = arg0;
			Static103.aBoolean153 = arg3;
			Static45.anInt1601 = arg2;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!pd;ZLclient!qd;I)V")
	public static void method1280(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) int arg2) {
		if (Static102.aBoolean47) {
			return;
		}
		@Pc(12) Class2_Sub10 local12 = new Class2_Sub10();
		local12.anInt1270 = arg0.method665();
		local12.anInt1275 = arg0.method629();
		local12.anIntArray155 = new int[local12.anInt1270];
		local12.aClass59Array2 = new Class59[local12.anInt1270];
		local12.anIntArray156 = new int[local12.anInt1270];
		local12.anIntArray154 = new int[local12.anInt1270];
		local12.aByteArrayArrayArray16 = new byte[local12.anInt1270][][];
		local12.aClass59Array1 = new Class59[local12.anInt1270];
		for (@Pc(59) int local59 = 0; local59 < local12.anInt1270; local59++) {
			try {
				@Pc(65) int local65 = arg0.method665();
				@Pc(84) String local84;
				@Pc(93) String local93;
				@Pc(95) int local95;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local84 = new String(arg0.method670().method1217());
					local93 = new String(arg0.method670().method1217());
					local95 = 0;
					if (local65 == 1) {
						local95 = arg0.method629();
					}
					local12.anIntArray154[local59] = local65;
					local12.anIntArray156[local59] = local95;
					local12.aClass59Array1[local59] = arg1.method1468(local93, Static101.method1720(local84));
				} else if (local65 == 3 || local65 == 4) {
					local84 = new String(arg0.method670().method1217());
					local93 = new String(arg0.method670().method1217());
					local95 = arg0.method665();
					@Pc(158) String[] local158 = new String[local95];
					for (@Pc(160) int local160 = 0; local160 < local95; local160++) {
						local158[local160] = new String(arg0.method670().method1217());
					}
					@Pc(180) byte[][] local180 = new byte[local95][];
					@Pc(193) int local193;
					if (local65 == 3) {
						for (@Pc(187) int local187 = 0; local187 < local95; local187++) {
							local193 = arg0.method629();
							local180[local187] = new byte[local193];
							arg0.method635(local180[local187], local193);
						}
					}
					local12.anIntArray154[local59] = local65;
					@Pc(218) Class[] local218 = new Class[local95];
					for (local193 = 0; local193 < local95; local193++) {
						local218[local193] = Static101.method1720(local158[local193]);
					}
					local12.aClass59Array2[local59] = arg1.method1475(local93, local218, Static101.method1720(local84));
					local12.aByteArrayArrayArray16[local59] = local180;
				}
			} catch (@Pc(253) ClassNotFoundException local253) {
				local12.anIntArray155[local59] = -1;
			} catch (@Pc(260) SecurityException local260) {
				local12.anIntArray155[local59] = -2;
			} catch (@Pc(267) NullPointerException local267) {
				local12.anIntArray155[local59] = -3;
			} catch (@Pc(274) Exception local274) {
				local12.anIntArray155[local59] = -4;
			} catch (@Pc(281) Throwable local281) {
				local12.anIntArray155[local59] = -5;
			}
		}
		Static28.aClass36_3.method1362(local12);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
	public static void method1281(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static64.anIntArray84[arg0];
		@Pc(19) int local19 = Static55.anIntArray274[arg0];
		@Pc(23) int local23 = Static64.anIntArray85[arg0];
		@Pc(27) int local27 = Static63.anIntArray296[arg0];
		if (local27 >= 2000) {
			local27 -= 2000;
		}
		if (Static49.anInt2692 != 0 && local27 != 1001) {
			Static27.aBoolean65 = true;
			Static49.anInt2692 = 0;
		}
		@Pc(52) Class2_Sub1_Sub4_Sub6_Sub2 local52;
		if (local27 == 41) {
			local52 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local23];
			if (local52 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local52.anIntArray285[0], 2, local52.anIntArray281[0]);
				Static70.anInt2224 = Static105.anInt2783;
				Static17.anInt796 = 2;
				Static44.anInt1596 = Static15.anInt649;
				Static12.anInt526 = 0;
				Static20.aClass2_Sub6_Sub1_11.method684(185);
				Static20.aClass2_Sub6_Sub1_11.method651(local23);
			}
		}
		@Pc(116) int local116;
		@Pc(111) Class31 local111;
		if (local27 == 11) {
			local111 = Static85.aClass31Array14[arg0];
			local116 = local111.method1209(Static4.aClass31_57);
			if (local116 != -1) {
				if (Static42.anInt1586 == -1) {
					Static82.method1447();
					if (Static58.anInt1938 != -1) {
						Static39.aClass31_541 = local111.method1222(local116 + 5).method1220();
						Static98.anInt1189 = Static42.anInt1586 = Static58.anInt1938;
						Static77.aBoolean118 = false;
					}
				} else {
					Static74.method1397(Static85.aClass31_867, 0, Static39.aClass31_531);
				}
			}
		}
		if (local27 == 8) {
			Static20.aClass2_Sub6_Sub1_11.method684(66);
			Static20.aClass2_Sub6_Sub1_11.method658(local19);
			Static20.aClass2_Sub6_Sub1_11.method668(local15);
			Static20.aClass2_Sub6_Sub1_11.method648(local23);
			Static20.aClass2_Sub6_Sub1_11.method666(Static61.anInt2093);
			Static39.anInt1462 = local19;
			Static66.anInt2178 = local15;
			Static79.anInt2299 = 2;
			if (local15 >> 16 == Static42.anInt1586) {
				Static79.anInt2299 = 1;
			}
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
			Static96.anInt2606 = 0;
		}
		if (local27 == 55) {
			Static20.aClass2_Sub6_Sub1_11.method684(199);
			Static20.aClass2_Sub6_Sub1_11.method648(local19);
			Static20.aClass2_Sub6_Sub1_11.method666(local15);
			Static20.aClass2_Sub6_Sub1_11.method648(local23);
			Static39.anInt1462 = local19;
			Static66.anInt2178 = local15;
			Static79.anInt2299 = 2;
			if (local15 >> 16 == Static42.anInt1586) {
				Static79.anInt2299 = 1;
			}
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
			Static96.anInt2606 = 0;
		}
		@Pc(283) boolean local283;
		if (local27 == 12) {
			local283 = Static72.method865(0, 0, false, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			if (!local283) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			}
			Static70.anInt2224 = Static105.anInt2783;
			Static12.anInt526 = 0;
			Static44.anInt1596 = Static15.anInt649;
			Static17.anInt796 = 2;
			Static20.aClass2_Sub6_Sub1_11.method684(211);
			Static20.aClass2_Sub6_Sub1_11.method658(Static27.anInt1159);
			Static20.aClass2_Sub6_Sub1_11.method638(Static78.anInt2284);
			Static20.aClass2_Sub6_Sub1_11.method638(local19 + Static25.anInt1103);
			Static20.aClass2_Sub6_Sub1_11.method648(local15 + Static47.anInt1730);
			Static20.aClass2_Sub6_Sub1_11.method630(Static95.anInt2560);
			Static20.aClass2_Sub6_Sub1_11.method648(local23);
		}
		if (local27 == 20) {
			Static91.method1535(local23, local19, local15);
			Static20.aClass2_Sub6_Sub1_11.method684(139);
			Static20.aClass2_Sub6_Sub1_11.method638(Static47.anInt1730 + local15);
			Static20.aClass2_Sub6_Sub1_11.method651(Static25.anInt1103 + local19);
			Static20.aClass2_Sub6_Sub1_11.method658(local23 >> 14 & 0x7FFF);
		}
		if (local27 == 53) {
			Static91.method1535(local23, local19, local15);
			Static20.aClass2_Sub6_Sub1_11.method684(165);
			Static20.aClass2_Sub6_Sub1_11.method651(local15 + Static47.anInt1730);
			Static20.aClass2_Sub6_Sub1_11.method658(local19 + Static25.anInt1103);
			Static20.aClass2_Sub6_Sub1_11.method638(local23 >> 14 & 0x7FFF);
		}
		if (local27 == 56) {
			Static39.method1011(Static37.anInt1409);
			Static37.anInt1409 = -1;
			Static27.aBoolean65 = true;
		}
		if (local27 == 23) {
			local283 = Static72.method865(0, 0, false, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			if (!local283) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			}
			Static44.anInt1596 = Static15.anInt649;
			Static70.anInt2224 = Static105.anInt2783;
			Static17.anInt796 = 2;
			Static12.anInt526 = 0;
			Static20.aClass2_Sub6_Sub1_11.method684(219);
			Static20.aClass2_Sub6_Sub1_11.method638(local19 + Static25.anInt1103);
			Static20.aClass2_Sub6_Sub1_11.method638(local23);
			Static20.aClass2_Sub6_Sub1_11.method638(local15 + Static47.anInt1730);
		}
		if (local27 == 31) {
			local283 = Static72.method865(0, 0, false, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			if (!local283) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			}
			Static12.anInt526 = 0;
			Static17.anInt796 = 2;
			Static70.anInt2224 = Static105.anInt2783;
			Static44.anInt1596 = Static15.anInt649;
			Static20.aClass2_Sub6_Sub1_11.method684(131);
			Static20.aClass2_Sub6_Sub1_11.method648(local15 + Static47.anInt1730);
			Static20.aClass2_Sub6_Sub1_11.method658(local23);
			Static20.aClass2_Sub6_Sub1_11.method648(Static25.anInt1103 + local19);
		}
		if (local27 == 34) {
			local52 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local23];
			if (local52 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local52.anIntArray285[0], 2, local52.anIntArray281[0]);
				Static12.anInt526 = 0;
				Static17.anInt796 = 2;
				Static70.anInt2224 = Static105.anInt2783;
				Static44.anInt1596 = Static15.anInt649;
				Static20.aClass2_Sub6_Sub1_11.method684(101);
				Static20.aClass2_Sub6_Sub1_11.method666(Static61.anInt2093);
				Static20.aClass2_Sub6_Sub1_11.method651(local23);
			}
		}
		if (local27 == 16) {
			if (Static105.aBoolean154) {
				Static99.aClass64_1.method1773(local19 - 4, local15 + -4);
			} else {
				Static99.aClass64_1.method1773(Static105.anInt2783 - 4, Static15.anInt649 + -4);
			}
		}
		if (local27 == 1) {
			local283 = Static72.method865(0, 0, false, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			if (!local283) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			}
			Static70.anInt2224 = Static105.anInt2783;
			Static12.anInt526 = 0;
			Static44.anInt1596 = Static15.anInt649;
			Static17.anInt796 = 2;
			Static20.aClass2_Sub6_Sub1_11.method684(156);
			Static20.aClass2_Sub6_Sub1_11.method658(local23);
			Static20.aClass2_Sub6_Sub1_11.method648(Static25.anInt1103 + local19);
			Static20.aClass2_Sub6_Sub1_11.method658(local15 + Static47.anInt1730);
		}
		if (local27 == 51) {
			Static20.aClass2_Sub6_Sub1_11.method684(228);
			Static20.aClass2_Sub6_Sub1_11.method642(local15);
			Static20.aClass2_Sub6_Sub1_11.method651(local19);
			Static20.aClass2_Sub6_Sub1_11.method648(local23);
			Static39.anInt1462 = local19;
			Static79.anInt2299 = 2;
			Static96.anInt2606 = 0;
			if (Static42.anInt1586 == local15 >> 16) {
				Static79.anInt2299 = 1;
			}
			Static66.anInt2178 = local15;
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
		}
		if (local27 == 13) {
			local52 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local23];
			if (local52 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local52.anIntArray285[0], 2, local52.anIntArray281[0]);
				Static44.anInt1596 = Static15.anInt649;
				Static12.anInt526 = 0;
				Static17.anInt796 = 2;
				Static70.anInt2224 = Static105.anInt2783;
				Static20.aClass2_Sub6_Sub1_11.method684(164);
				Static20.aClass2_Sub6_Sub1_11.method638(local23);
			}
		}
		@Pc(894) Class2_Sub1_Sub2 local894;
		if (local27 == 35) {
			Static20.aClass2_Sub6_Sub1_11.method684(184);
			Static20.aClass2_Sub6_Sub1_11.method666(local15);
			local894 = Static7.method187(local15);
			if (local894.anIntArrayArray9 != null && local894.anIntArrayArray9[0][0] == 5) {
				local116 = local894.anIntArrayArray9[0][1];
				if (local894.anIntArray42[0] != Static8.anIntArray46[local116]) {
					Static8.anIntArray46[local116] = local894.anIntArray42[0];
					Static9.method205(local116);
					Static92.aBoolean81 = true;
				}
			}
		}
		if (local27 == 7 && !Static60.aBoolean104) {
			Static20.aClass2_Sub6_Sub1_11.method684(11);
			Static60.aBoolean104 = true;
		}
		@Pc(980) long local980;
		@Pc(982) int local982;
		if (local27 == 54) {
			local111 = Static85.aClass31Array14[arg0];
			local116 = local111.method1209(Static4.aClass31_57);
			if (local116 != -1) {
				local980 = local111.method1222(local116 + 5).method1220().method1201();
				local982 = -1;
				for (@Pc(984) int local984 = 0; local984 < Static34.anInt1312; local984++) {
					if (local980 == Static45.aLongArray4[local984]) {
						local982 = local984;
						break;
					}
				}
				if (local982 != -1 && Static41.anIntArray246[local982] > 0) {
					Static39.aClass31_542 = Static39.aClass31_531;
					Static46.anInt1612 = 3;
					Static2.aBoolean8 = true;
					Static27.aBoolean65 = true;
					Static49.anInt2692 = 0;
					Static41.aLong45 = Static45.aLongArray4[local982];
					Static39.aClass31_537 = Static37.method974(new Class31[] { Static105.aClass31_952, Static51.aClass31Array7[local982] });
				}
			}
		}
		@Pc(1048) Class2_Sub1_Sub4_Sub6_Sub1 local1048;
		if (local27 == 48) {
			local1048 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local23];
			if (local1048 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local1048.anIntArray285[0], 2, local1048.anIntArray281[0]);
				Static44.anInt1596 = Static15.anInt649;
				Static17.anInt796 = 2;
				Static12.anInt526 = 0;
				Static70.anInt2224 = Static105.anInt2783;
				Static20.aClass2_Sub6_Sub1_11.method684(36);
				Static20.aClass2_Sub6_Sub1_11.method651(local23);
			}
		}
		if (local27 == 44) {
			local894 = Static7.method187(local15);
			@Pc(1111) boolean local1111 = true;
			if (local894.anInt278 > 0) {
				local1111 = Static34.method875(local894);
			}
			if (local1111) {
				Static20.aClass2_Sub6_Sub1_11.method684(184);
				Static20.aClass2_Sub6_Sub1_11.method666(local15);
			}
		}
		if (local27 == 19) {
			Static20.aClass2_Sub6_Sub1_11.method684(193);
			Static20.aClass2_Sub6_Sub1_11.method642(local15);
			Static20.aClass2_Sub6_Sub1_11.method638(local19);
			Static20.aClass2_Sub6_Sub1_11.method658(local23);
			Static66.anInt2178 = local15;
			Static96.anInt2606 = 0;
			Static39.anInt1462 = local19;
			Static79.anInt2299 = 2;
			if (local15 >> 16 == Static42.anInt1586) {
				Static79.anInt2299 = 1;
			}
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
		}
		if (local27 == 17) {
			local1048 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local23];
			if (local1048 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local1048.anIntArray285[0], 2, local1048.anIntArray281[0]);
				Static17.anInt796 = 2;
				Static70.anInt2224 = Static105.anInt2783;
				Static44.anInt1596 = Static15.anInt649;
				Static12.anInt526 = 0;
				Static20.aClass2_Sub6_Sub1_11.method684(190);
				Static20.aClass2_Sub6_Sub1_11.method651(local23);
			}
		}
		@Pc(1278) Class31 local1278;
		if (local27 == 2 || local27 == 25) {
			local111 = Static85.aClass31Array14[arg0];
			local116 = local111.method1209(Static4.aClass31_57);
			if (local116 != -1) {
				local111 = local111.method1222(local116 + 5).method1220();
				local1278 = local111.method1212().method1196();
				@Pc(1280) boolean local1280 = false;
				for (local982 = 0; local982 < Static21.anInt1007; local982++) {
					@Pc(1290) Class2_Sub1_Sub4_Sub6_Sub1 local1290 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[Static78.anIntArray322[local982]];
					if (local1290 != null && local1290.aClass31_612 != null && local1290.aClass31_612.method1210(local1278)) {
						local1280 = true;
						Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local1290.anIntArray285[0], 2, local1290.anIntArray281[0]);
						if (local27 == 2) {
							Static20.aClass2_Sub6_Sub1_11.method684(235);
							Static20.aClass2_Sub6_Sub1_11.method658(Static78.anIntArray322[local982]);
						}
						if (local27 == 25) {
							Static20.aClass2_Sub6_Sub1_11.method684(7);
							Static20.aClass2_Sub6_Sub1_11.method651(Static78.anIntArray322[local982]);
						}
						break;
					}
				}
				if (!local1280) {
					Static74.method1397(Static37.method974(new Class31[] { Static102.aClass31_214, local1278 }), 0, Static39.aClass31_531);
				}
			}
		}
		@Pc(1409) Class31 local1409;
		if (local27 == 52) {
			local894 = Static7.method187(local15);
			local1409 = local894.aClass31_97;
			Static92.aBoolean81 = true;
			Static47.anInt1737 = 1;
			Static61.anInt2093 = local15;
			Static63.anInt2118 = 0;
			Static105.anInt2787 = local894.anInt241;
			if (local1409.method1209(Static34.aClass31_449) != -1) {
				local1409 = local1409.method1213(local1409.method1209(Static34.aClass31_449), 0);
			}
			local1278 = local894.aClass31_97;
			if (local1278.method1209(Static34.aClass31_449) != -1) {
				local1278 = local1278.method1222(local1278.method1209(Static34.aClass31_449) + 1);
			}
			Static85.aClass31_866 = Static37.method974(new Class31[] { local1409, Static34.aClass31_449, local894.aClass31_101, Static34.aClass31_449, local1278 });
			if (Static105.anInt2787 == 16) {
				Static92.aBoolean81 = true;
				Static58.aBoolean100 = true;
				Static31.anInt1279 = 3;
			}
			return;
		}
		if (local27 == 26) {
			local1048 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local23];
			if (local1048 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local1048.anIntArray285[0], 2, local1048.anIntArray281[0]);
				Static12.anInt526 = 0;
				Static17.anInt796 = 2;
				Static44.anInt1596 = Static15.anInt649;
				Static70.anInt2224 = Static105.anInt2783;
				Static20.aClass2_Sub6_Sub1_11.method684(147);
				Static20.aClass2_Sub6_Sub1_11.method668(Static61.anInt2093);
				Static20.aClass2_Sub6_Sub1_11.method648(local23);
			}
		}
		if (local27 == 14) {
			Static20.aClass2_Sub6_Sub1_11.method684(184);
			Static20.aClass2_Sub6_Sub1_11.method666(local15);
			local894 = Static7.method187(local15);
			if (local894.anIntArrayArray9 != null && local894.anIntArrayArray9[0][0] == 5) {
				local116 = local894.anIntArrayArray9[0][1];
				Static8.anIntArray46[local116] = 1 - Static8.anIntArray46[local116];
				Static9.method205(local116);
				Static92.aBoolean81 = true;
			}
		}
		if (local27 == 22) {
			Static20.aClass2_Sub6_Sub1_11.method684(79);
			Static20.aClass2_Sub6_Sub1_11.method668(local15);
			Static20.aClass2_Sub6_Sub1_11.method651(local23);
			Static20.aClass2_Sub6_Sub1_11.method648(local19);
			Static96.anInt2606 = 0;
			Static66.anInt2178 = local15;
			Static79.anInt2299 = 2;
			if (Static42.anInt1586 == local15 >> 16) {
				Static79.anInt2299 = 1;
			}
			Static39.anInt1462 = local19;
			if (Static47.anInt1736 == local15 >> 16) {
				Static79.anInt2299 = 3;
			}
		}
		if (local27 == 38 && Static91.method1535(local23, local19, local15)) {
			Static20.aClass2_Sub6_Sub1_11.method684(44);
			Static20.aClass2_Sub6_Sub1_11.method651(Static78.anInt2284);
			Static20.aClass2_Sub6_Sub1_11.method638(local23 >> 14 & 0x7FFF);
			Static20.aClass2_Sub6_Sub1_11.method648(Static27.anInt1159);
			Static20.aClass2_Sub6_Sub1_11.method648(local15 + Static47.anInt1730);
			Static20.aClass2_Sub6_Sub1_11.method642(Static95.anInt2560);
			Static20.aClass2_Sub6_Sub1_11.method651(local19 + Static25.anInt1103);
		}
		if (local27 == 9 || local27 == 10 || local27 == 6 || local27 == 4) {
			local111 = Static85.aClass31Array14[arg0];
			local116 = local111.method1209(Static4.aClass31_57);
			if (local116 != -1) {
				local980 = local111.method1222(local116 + 5).method1220().method1201();
				if (local27 == 9) {
					Static62.method1315(local980);
				}
				if (local27 == 10) {
					Static41.method1053(local980);
				}
				if (local27 == 6) {
					method1285(local980);
				}
				if (local27 == 4) {
					Static74.method1401(local980);
				}
			}
		}
		if (local27 == 39) {
			local1048 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local23];
			if (local1048 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local1048.anIntArray285[0], 2, local1048.anIntArray281[0]);
				Static44.anInt1596 = Static15.anInt649;
				Static17.anInt796 = 2;
				Static70.anInt2224 = Static105.anInt2783;
				Static12.anInt526 = 0;
				Static20.aClass2_Sub6_Sub1_11.method684(214);
				Static20.aClass2_Sub6_Sub1_11.method651(Static78.anInt2284);
				Static20.aClass2_Sub6_Sub1_11.method642(Static95.anInt2560);
				Static20.aClass2_Sub6_Sub1_11.method648(Static27.anInt1159);
				Static20.aClass2_Sub6_Sub1_11.method638(local23);
			}
		}
		if (local27 == 27) {
			local1048 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local23];
			if (local1048 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local1048.anIntArray285[0], 2, local1048.anIntArray281[0]);
				Static70.anInt2224 = Static105.anInt2783;
				Static44.anInt1596 = Static15.anInt649;
				Static12.anInt526 = 0;
				Static17.anInt796 = 2;
				Static20.aClass2_Sub6_Sub1_11.method684(235);
				Static20.aClass2_Sub6_Sub1_11.method658(local23);
			}
		}
		if (local27 == 50) {
			local283 = Static72.method865(0, 0, false, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			if (!local283) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			}
			Static12.anInt526 = 0;
			Static44.anInt1596 = Static15.anInt649;
			Static70.anInt2224 = Static105.anInt2783;
			Static17.anInt796 = 2;
			Static20.aClass2_Sub6_Sub1_11.method684(200);
			Static20.aClass2_Sub6_Sub1_11.method648(Static47.anInt1730 + local15);
			Static20.aClass2_Sub6_Sub1_11.method648(Static25.anInt1103 + local19);
			Static20.aClass2_Sub6_Sub1_11.method638(local23);
		}
		if (local27 == 15) {
			Static20.aClass2_Sub6_Sub1_11.method684(192);
			Static20.aClass2_Sub6_Sub1_11.method630(local15);
			Static20.aClass2_Sub6_Sub1_11.method658(local19);
			Static20.aClass2_Sub6_Sub1_11.method651(local23);
			Static66.anInt2178 = local15;
			Static96.anInt2606 = 0;
			Static39.anInt1462 = local19;
			Static79.anInt2299 = 2;
			if (local15 >> 16 == Static42.anInt1586) {
				Static79.anInt2299 = 1;
			}
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
		}
		if (local27 == 21) {
			Static20.aClass2_Sub6_Sub1_11.method684(135);
			Static20.aClass2_Sub6_Sub1_11.method651(local23);
			Static20.aClass2_Sub6_Sub1_11.method668(local15);
			Static20.aClass2_Sub6_Sub1_11.method658(local19);
			Static79.anInt2299 = 2;
			Static66.anInt2178 = local15;
			if (Static42.anInt1586 == local15 >> 16) {
				Static79.anInt2299 = 1;
			}
			Static39.anInt1462 = local19;
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
			Static96.anInt2606 = 0;
		}
		if (local27 == 18) {
			Static20.aClass2_Sub6_Sub1_11.method684(194);
			Static20.aClass2_Sub6_Sub1_11.method648(local23);
			Static20.aClass2_Sub6_Sub1_11.method668(local15);
			Static20.aClass2_Sub6_Sub1_11.method651(local19);
			Static66.anInt2178 = local15;
			Static96.anInt2606 = 0;
			Static39.anInt1462 = local19;
			Static79.anInt2299 = 2;
			if (Static42.anInt1586 == local15 >> 16) {
				Static79.anInt2299 = 1;
			}
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
		}
		if (local27 == 1006) {
			@Pc(2146) int local2146 = local23 >> 14 & 0x7FFF;
			@Pc(2150) Class2_Sub1_Sub16 local2150 = Static92.method1045(local2146);
			if (local2150.aClass31_936 == null) {
				local1278 = Static37.method974(new Class31[] { Static42.aClass31_571, local2150.aClass31_939, Static83.aClass31_806 });
			} else {
				local1278 = local2150.aClass31_936;
			}
			Static74.method1397(local1278, 0, Static39.aClass31_531);
		}
		if (local27 == 47) {
			local283 = Static72.method865(0, 0, false, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			if (!local283) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			}
			Static17.anInt796 = 2;
			Static12.anInt526 = 0;
			Static70.anInt2224 = Static105.anInt2783;
			Static44.anInt1596 = Static15.anInt649;
			Static20.aClass2_Sub6_Sub1_11.method684(202);
			Static20.aClass2_Sub6_Sub1_11.method648(Static47.anInt1730 + local15);
			Static20.aClass2_Sub6_Sub1_11.method658(local23);
			Static20.aClass2_Sub6_Sub1_11.method651(local19 + Static25.anInt1103);
		}
		if (local27 == 49) {
			Static82.method1447();
		}
		if (local27 == 40) {
			local283 = Static72.method865(0, 0, false, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			if (!local283) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local15, 2, local19);
			}
			Static17.anInt796 = 2;
			Static44.anInt1596 = Static15.anInt649;
			Static70.anInt2224 = Static105.anInt2783;
			Static12.anInt526 = 0;
			Static20.aClass2_Sub6_Sub1_11.method684(108);
			Static20.aClass2_Sub6_Sub1_11.method651(local19 + Static25.anInt1103);
			Static20.aClass2_Sub6_Sub1_11.method668(Static61.anInt2093);
			Static20.aClass2_Sub6_Sub1_11.method648(local23);
			Static20.aClass2_Sub6_Sub1_11.method638(Static47.anInt1730 + local15);
		}
		if (local27 == 32) {
			Static20.aClass2_Sub6_Sub1_11.method684(142);
			Static20.aClass2_Sub6_Sub1_11.method658(local19);
			Static20.aClass2_Sub6_Sub1_11.method658(Static78.anInt2284);
			Static20.aClass2_Sub6_Sub1_11.method658(local23);
			Static20.aClass2_Sub6_Sub1_11.method651(Static27.anInt1159);
			Static20.aClass2_Sub6_Sub1_11.method642(local15);
			Static20.aClass2_Sub6_Sub1_11.method642(Static95.anInt2560);
			Static66.anInt2178 = local15;
			Static39.anInt1462 = local19;
			Static96.anInt2606 = 0;
			Static79.anInt2299 = 2;
			if (local15 >> 16 == Static42.anInt1586) {
				Static79.anInt2299 = 1;
			}
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
		}
		if (local27 == 33) {
			Static78.anInt2284 = local23;
			Static63.anInt2118 = 1;
			Static95.anInt2560 = local15;
			Static27.anInt1159 = local19;
			Static40.aClass31_711 = Static7.method178(local23).aClass31_861;
			Static47.anInt1737 = 0;
			if (Static40.aClass31_711 == null) {
				Static40.aClass31_711 = Static106.aClass31_954;
			}
			Static92.aBoolean81 = true;
			return;
		}
		if (local27 == 37) {
			local52 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local23];
			if (local52 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local52.anIntArray285[0], 2, local52.anIntArray281[0]);
				Static44.anInt1596 = Static15.anInt649;
				Static17.anInt796 = 2;
				Static70.anInt2224 = Static105.anInt2783;
				Static12.anInt526 = 0;
				Static20.aClass2_Sub6_Sub1_11.method684(4);
				Static20.aClass2_Sub6_Sub1_11.method648(local23);
				Static20.aClass2_Sub6_Sub1_11.method648(Static27.anInt1159);
				Static20.aClass2_Sub6_Sub1_11.method666(Static95.anInt2560);
				Static20.aClass2_Sub6_Sub1_11.method638(Static78.anInt2284);
			}
		}
		if (local27 == 28 && Static91.method1535(local23, local19, local15)) {
			Static20.aClass2_Sub6_Sub1_11.method684(116);
			Static20.aClass2_Sub6_Sub1_11.method648(Static47.anInt1730 + local15);
			Static20.aClass2_Sub6_Sub1_11.method638(Static25.anInt1103 + local19);
			Static20.aClass2_Sub6_Sub1_11.method638(local23 >> 14 & 0x7FFF);
			Static20.aClass2_Sub6_Sub1_11.method668(Static61.anInt2093);
		}
		if (local27 == 42) {
			Static91.method1535(local23, local19, local15);
			Static20.aClass2_Sub6_Sub1_11.method684(3);
			Static20.aClass2_Sub6_Sub1_11.method648(Static25.anInt1103 + local19);
			Static20.aClass2_Sub6_Sub1_11.method651(Static47.anInt1730 + local15);
			Static20.aClass2_Sub6_Sub1_11.method638(local23 >> 14 & 0x7FFF);
		}
		@Pc(2600) Class2_Sub1_Sub13 local2600;
		if (local27 == 1005) {
			local2600 = Static7.method178(local23);
			@Pc(2604) Class2_Sub1_Sub2 local2604 = Static7.method187(local15);
			if (local2604 != null && local2604.anIntArray43[local19] >= 100000) {
				local1409 = Static37.method974(new Class31[] { Static89.method1499(local2604.anIntArray43[local19]), Static55.aClass31_664, local2600.aClass31_861 });
			} else if (local2600.aClass31_856 == null) {
				local1409 = Static37.method974(new Class31[] { Static42.aClass31_571, local2600.aClass31_861, Static83.aClass31_806 });
			} else {
				local1409 = local2600.aClass31_856;
			}
			Static74.method1397(local1409, 0, Static39.aClass31_531);
		}
		if (local27 == 3) {
			local1048 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local23];
			if (local1048 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local1048.anIntArray285[0], 2, local1048.anIntArray281[0]);
				Static17.anInt796 = 2;
				Static12.anInt526 = 0;
				Static44.anInt1596 = Static15.anInt649;
				Static70.anInt2224 = Static105.anInt2783;
				Static20.aClass2_Sub6_Sub1_11.method684(7);
				Static20.aClass2_Sub6_Sub1_11.method651(local23);
			}
		}
		if (local27 == 45) {
			local52 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local23];
			if (local52 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local52.anIntArray285[0], 2, local52.anIntArray281[0]);
				Static17.anInt796 = 2;
				Static70.anInt2224 = Static105.anInt2783;
				Static44.anInt1596 = Static15.anInt649;
				Static12.anInt526 = 0;
				Static20.aClass2_Sub6_Sub1_11.method684(133);
				Static20.aClass2_Sub6_Sub1_11.method658(local23);
			}
		}
		if (local27 == 1002) {
			Static91.method1535(local23, local19, local15);
			Static20.aClass2_Sub6_Sub1_11.method684(33);
			Static20.aClass2_Sub6_Sub1_11.method651(Static47.anInt1730 + local15);
			Static20.aClass2_Sub6_Sub1_11.method658(local19 + Static25.anInt1103);
			Static20.aClass2_Sub6_Sub1_11.method658(local23 >> 14 & 0x7FFF);
		}
		if (local27 == 46) {
			local52 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local23];
			if (local52 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local52.anIntArray285[0], 2, local52.anIntArray281[0]);
				Static12.anInt526 = 0;
				Static70.anInt2224 = Static105.anInt2783;
				Static44.anInt1596 = Static15.anInt649;
				Static17.anInt796 = 2;
				Static20.aClass2_Sub6_Sub1_11.method684(212);
				Static20.aClass2_Sub6_Sub1_11.method658(local23);
			}
		}
		if (local27 == 36) {
			Static20.aClass2_Sub6_Sub1_11.method684(220);
			Static20.aClass2_Sub6_Sub1_11.method638(local23);
			Static20.aClass2_Sub6_Sub1_11.method648(local19);
			Static20.aClass2_Sub6_Sub1_11.method668(local15);
			Static79.anInt2299 = 2;
			if (Static42.anInt1586 == local15 >> 16) {
				Static79.anInt2299 = 1;
			}
			Static96.anInt2606 = 0;
			Static39.anInt1462 = local19;
			Static66.anInt2178 = local15;
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
		}
		if (local27 == 30) {
			local52 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local23];
			if (local52 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local52.anIntArray285[0], 2, local52.anIntArray281[0]);
				Static44.anInt1596 = Static15.anInt649;
				Static17.anInt796 = 2;
				Static70.anInt2224 = Static105.anInt2783;
				Static12.anInt526 = 0;
				Static20.aClass2_Sub6_Sub1_11.method684(110);
				Static20.aClass2_Sub6_Sub1_11.method658(local23);
			}
		}
		if (local27 == 29) {
			Static20.aClass2_Sub6_Sub1_11.method684(29);
			Static20.aClass2_Sub6_Sub1_11.method638(local19);
			Static20.aClass2_Sub6_Sub1_11.method648(local23);
			Static20.aClass2_Sub6_Sub1_11.method630(local15);
			Static79.anInt2299 = 2;
			Static66.anInt2178 = local15;
			if (local15 >> 16 == Static42.anInt1586) {
				Static79.anInt2299 = 1;
			}
			if (Static47.anInt1736 == local15 >> 16) {
				Static79.anInt2299 = 3;
			}
			Static96.anInt2606 = 0;
			Static39.anInt1462 = local19;
		}
		if (local27 == 5) {
			Static20.aClass2_Sub6_Sub1_11.method684(64);
			Static20.aClass2_Sub6_Sub1_11.method666(local15);
			Static20.aClass2_Sub6_Sub1_11.method651(local19);
			Static20.aClass2_Sub6_Sub1_11.method651(local23);
			Static39.anInt1462 = local19;
			Static66.anInt2178 = local15;
			Static79.anInt2299 = 2;
			if (Static42.anInt1586 == local15 >> 16) {
				Static79.anInt2299 = 1;
			}
			Static96.anInt2606 = 0;
			if (local15 >> 16 == Static47.anInt1736) {
				Static79.anInt2299 = 3;
			}
		}
		if (local27 == 1004) {
			local2600 = Static7.method178(local23);
			if (local2600.aClass31_856 == null) {
				local1409 = Static37.method974(new Class31[] { Static42.aClass31_571, local2600.aClass31_861, Static83.aClass31_806 });
			} else {
				local1409 = local2600.aClass31_856;
			}
			Static74.method1397(local1409, 0, Static39.aClass31_531);
		}
		if (local27 == 24) {
			local1048 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local23];
			if (local1048 != null) {
				Static72.method865(0, 0, false, 0, 1, 1, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local1048.anIntArray285[0], 2, local1048.anIntArray281[0]);
				Static70.anInt2224 = Static105.anInt2783;
				Static44.anInt1596 = Static15.anInt649;
				Static17.anInt796 = 2;
				Static12.anInt526 = 0;
				Static20.aClass2_Sub6_Sub1_11.method684(58);
				Static20.aClass2_Sub6_Sub1_11.method658(local23);
			}
		}
		if (local27 == 43) {
			Static91.method1535(local23, local19, local15);
			Static20.aClass2_Sub6_Sub1_11.method684(222);
			Static20.aClass2_Sub6_Sub1_11.method638(Static47.anInt1730 + local15);
			Static20.aClass2_Sub6_Sub1_11.method651(local23 >> 14 & 0x7FFF);
			Static20.aClass2_Sub6_Sub1_11.method658(Static25.anInt1103 + local19);
		}
		if (local27 == 1003) {
			local52 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local23];
			if (local52 != null) {
				@Pc(3231) Class2_Sub1_Sub8 local3231 = local52.aClass2_Sub1_Sub8_1;
				if (local3231.anIntArray271 != null) {
					local3231 = local3231.method1189();
				}
				if (local3231 != null) {
					if (local3231.aClass31_660 == null) {
						local1278 = Static37.method974(new Class31[] { Static42.aClass31_571, local3231.aClass31_662, Static83.aClass31_806 });
					} else {
						local1278 = local3231.aClass31_660;
					}
					Static74.method1397(local1278, 0, Static39.aClass31_531);
				}
			}
		}
		if (Static63.anInt2118 != 0) {
			Static92.aBoolean81 = true;
			Static63.anInt2118 = 0;
		}
		if (Static47.anInt1737 != 0) {
			Static92.aBoolean81 = true;
			Static47.anInt1737 = 0;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!lc;)Z")
	public static boolean method1282(@OriginalArg(1) Class31 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static34.anInt1312; local16++) {
			if (arg0.method1210(Static51.aClass31Array7[local16])) {
				return true;
			}
		}
		return arg0.method1210(Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.aClass31_612);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!lc;Lclient!lc;Z)V")
	public static void method1283(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class31 arg2) {
		if (Static49.aBoolean143) {
			Static49.aBoolean143 = false;
			Static13.method378(Static18.aGraphics1);
			Static27.method777(Static18.aGraphics1);
			Static3.method88(Static18.aGraphics1);
			Static64.method417(Static18.aGraphics1);
			Static87.method1486(Static12.anInt527, Static92.anInt1560, Static18.aGraphics1, Static98.aClass2_Sub1_Sub3_Sub3_4, Static78.anInt2283);
			Static99.method1686(Static41.anIntArray245, -1, Static31.anInt1279, Static54.anInt1802 == -1, Static18.aGraphics1);
			Static89.aBoolean122 = true;
			Static75.aBoolean117 = true;
			Static85.aBoolean130 = true;
		}
		Static63.method1319();
		@Pc(48) short local48 = 151;
		@Pc(49) int local49 = local48 - 3;
		Static98.aClass2_Sub1_Sub3_Sub3_4.method962(arg1, 257, 148, 0);
		Static98.aClass2_Sub1_Sub3_Sub3_4.method962(arg1, 256, 147, 16777215);
		if (arg2 != null) {
			local49 += 15;
			if (arg0) {
				@Pc(79) int local79 = Static98.aClass2_Sub1_Sub3_Sub3_4.method961(arg2) + 4;
				Static81.method1646(257 - local79 / 2, 152, local79, 11, 0);
			}
			Static98.aClass2_Sub1_Sub3_Sub3_4.method962(arg2, 257, 163, 0);
			Static98.aClass2_Sub1_Sub3_Sub3_4.method962(arg2, 256, 162, 16777215);
		}
		Static86.method1483(Static18.aGraphics1);
	}

	@OriginalMember(owner = "client!m", name = "i", descriptor = "(I)V")
	public static void method1284() {
		aClass2_Sub1_Sub3_Sub2Array8 = null;
		anIntArray287 = null;
		anIntArray286 = null;
		aClass31_717 = null;
		aClass31_714 = null;
		aClass31_715 = null;
		aClass31_718 = null;
		aClass31_716 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IJ)V")
	public static void method1285(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static34.anInt1312; local12++) {
			if (arg0 == Static45.aLongArray4[local12]) {
				Static34.anInt1312--;
				Static92.aBoolean81 = true;
				for (@Pc(38) int local38 = local12; local38 < Static34.anInt1312; local38++) {
					Static51.aClass31Array7[local38] = Static51.aClass31Array7[local38 + 1];
					Static41.anIntArray246[local38] = Static41.anIntArray246[local38 + 1];
					Static45.aLongArray4[local38] = Static45.aLongArray4[local38 + 1];
				}
				Static20.aClass2_Sub6_Sub1_11.method684(30);
				Static20.aClass2_Sub6_Sub1_11.method626(arg0);
				return;
			}
		}
	}
}
