import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[I")
	public static int[] anIntArray149;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!rf;")
	private static Class70 aClass70_484 = Static49.method1293("Connection lost)3");

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Lclient!rf;")
	public static Class70 aClass70_483 = aClass70_484;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
	public static int anInt1470 = 0;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!rf;")
	private static Class70 aClass70_485 = Static49.method1293("purple:");

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!rf;")
	public static Class70 aClass70_486 = aClass70_485;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public static int anInt1473 = 0;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "[I")
	public static int[] anIntArray150 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Lclient!rf;")
	public static Class70 aClass70_487 = aClass70_485;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	public static int anInt1474 = 0;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "Lclient!rf;")
	public static Class70 aClass70_488 = Static49.method1293("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V")
	public static void method1093(@OriginalArg(0) boolean arg0) {
		Static164.aBoolean160 = arg0;
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(65) int local65;
		@Pc(127) int local127;
		@Pc(135) int local135;
		@Pc(144) int local144;
		if (!Static164.aBoolean160) {
			local9 = Static98.aClass1_Sub9_Sub1_2.method1280();
			local13 = Static98.aClass1_Sub9_Sub1_2.method1280();
			local17 = Static98.aClass1_Sub9_Sub1_2.method1234();
			local25 = (Static69.anInt2127 - Static98.aClass1_Sub9_Sub1_2.anInt1592) / 16;
			Static56.anIntArrayArray18 = new int[local25][4];
			for (local31 = 0; local31 < local25; local31++) {
				for (local35 = 0; local35 < 4; local35++) {
					Static56.anIntArrayArray18[local31][local35] = Static98.aClass1_Sub9_Sub1_2.method1229();
				}
			}
			local35 = Static98.aClass1_Sub9_Sub1_2.method1239();
			local65 = Static98.aClass1_Sub9_Sub1_2.method1277();
			Static24.anIntArray41 = new int[local25];
			@Pc(70) boolean local70 = false;
			Static38.anIntArray124 = new int[local25];
			Static148.aByteArrayArray9 = new byte[local25][];
			Static148.aByteArrayArray8 = new byte[local25][];
			if ((local35 / 8 == 48 || local35 / 8 == 49) && (local65 / 8) == 48) {
				local70 = true;
			}
			if (local35 / 8 == 48 && local65 / 8 == 148) {
				local70 = true;
			}
			Static68.anIntArray204 = new int[local25];
			local25 = 0;
			for (local127 = (local35 - 6) / 8; local127 <= (local35 + 6) / 8; local127++) {
				for (local135 = (local65 - 6) / 8; local135 <= (local65 + 6) / 8; local135++) {
					local144 = (local127 << 8) + local135;
					if (!local70 || local135 != 49 && local135 != 149 && local135 != 147 && local127 != 50 && (local127 != 49 || local135 != 47)) {
						Static24.anIntArray41[local25] = local144;
						Static68.anIntArray204[local25] = Static67.aClass76_Sub1_6.method3309(Static160.method3210(new Class70[] { Static38.aClass70_429, Static34.method873(local127), Static107.aClass70_981, Static34.method873(local135) }));
						Static38.anIntArray124[local25] = Static67.aClass76_Sub1_6.method3309(Static160.method3210(new Class70[] { Static69.aClass70_664, Static34.method873(local127), Static107.aClass70_981, Static34.method873(local135) }));
						local25++;
					}
				}
			}
			Static167.method3343(local17, local65, local9, local13, local35);
			return;
		}
		local9 = Static98.aClass1_Sub9_Sub1_2.method1277();
		local13 = Static98.aClass1_Sub9_Sub1_2.method1268();
		local17 = Static98.aClass1_Sub9_Sub1_2.method1277();
		Static98.aClass1_Sub9_Sub1_2.method1285();
		for (local25 = 0; local25 < 4; local25++) {
			for (local31 = 0; local31 < 13; local31++) {
				for (local35 = 0; local35 < 13; local35++) {
					local65 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
					if (local65 == 1) {
						Static15.anIntArrayArrayArray1[local25][local31][local35] = Static98.aClass1_Sub9_Sub1_2.method1288(26);
					} else {
						Static15.anIntArrayArrayArray1[local25][local31][local35] = -1;
					}
				}
			}
		}
		Static98.aClass1_Sub9_Sub1_2.method1291();
		local31 = (Static69.anInt2127 - Static98.aClass1_Sub9_Sub1_2.anInt1592) / 16;
		Static56.anIntArrayArray18 = new int[local31][4];
		for (local35 = 0; local35 < local31; local35++) {
			for (local65 = 0; local65 < 4; local65++) {
				Static56.anIntArrayArray18[local35][local65] = Static98.aClass1_Sub9_Sub1_2.method1229();
			}
		}
		local65 = Static98.aClass1_Sub9_Sub1_2.method1280();
		@Pc(388) int local388 = Static98.aClass1_Sub9_Sub1_2.method1239();
		Static38.anIntArray124 = new int[local31];
		Static68.anIntArray204 = new int[local31];
		Static148.aByteArrayArray9 = new byte[local31][];
		Static24.anIntArray41 = new int[local31];
		Static148.aByteArrayArray8 = new byte[local31][];
		local31 = 0;
		for (local127 = 0; local127 < 4; local127++) {
			for (local135 = 0; local135 < 13; local135++) {
				for (local144 = 0; local144 < 13; local144++) {
					@Pc(425) int local425 = Static15.anIntArrayArrayArray1[local127][local135][local144];
					if (local425 != -1) {
						@Pc(435) int local435 = local425 >> 14 & 0x3FF;
						@Pc(441) int local441 = local425 >> 3 & 0x7FF;
						@Pc(451) int local451 = (local435 / 8 << 8) + local441 / 8;
						for (@Pc(453) int local453 = 0; local453 < local31; local453++) {
							if (local451 == Static24.anIntArray41[local453]) {
								local451 = -1;
								break;
							}
						}
						if (local451 != -1) {
							Static24.anIntArray41[local31] = local451;
							@Pc(483) int local483 = local451 & 0xFF;
							@Pc(489) int local489 = local451 >> 8 & 0xFF;
							Static68.anIntArray204[local31] = Static67.aClass76_Sub1_6.method3309(Static160.method3210(new Class70[] { Static38.aClass70_429, Static34.method873(local489), Static107.aClass70_981, Static34.method873(local483) }));
							Static38.anIntArray124[local31] = Static67.aClass76_Sub1_6.method3309(Static160.method3210(new Class70[] { Static69.aClass70_664, Static34.method873(local489), Static107.aClass70_981, Static34.method873(local483) }));
							local31++;
						}
					}
				}
			}
		}
		Static167.method3343(local13, local17, local9, local65, local388);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	public static void method1094() {
		aClass70_484 = null;
		aClass70_486 = null;
		aClass70_487 = null;
		anIntArray149 = null;
		aClass70_488 = null;
		aClass70_485 = null;
		anIntArray150 = null;
		aClass70_483 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ne;ILclient!ne;)V")
	public static void method1095(@OriginalArg(0) Class1_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub2_Sub1 arg1) {
		if (Static54.aClass1_Sub1_Sub1_Sub4Array2 == null) {
			Static54.aClass1_Sub1_Sub1_Sub4Array2 = Static158.method3172(Static156.aClass76_Sub1_15, Static33.aClass70_350, Static179.aClass70_1562);
		}
		if (Static2.aClass1_Sub1_Sub1_Sub3Array1 == null) {
			Static2.aClass1_Sub1_Sub1_Sub3Array1 = Static135.method2643(Static83.aClass70_1587, Static156.aClass76_Sub1_15, Static179.aClass70_1562);
		}
		if (Static106.aClass1_Sub1_Sub1_Sub3Array7 == null) {
			Static106.aClass1_Sub1_Sub1_Sub3Array7 = Static135.method2643(Static6.aClass70_78, Static156.aClass76_Sub1_15, Static179.aClass70_1562);
		}
		if (Static88.aClass1_Sub1_Sub1_Sub3Array6 == null) {
			Static88.aClass1_Sub1_Sub1_Sub3Array6 = Static135.method2643(Static137.aClass70_1215, Static156.aClass76_Sub1_15, Static179.aClass70_1562);
		}
		Static155.method3012(0, 23, 765, 480, 0);
		Static155.method3004(0, 0, 125, 23, 12425273, 9135624);
		Static155.method3004(125, 0, 640, 23, 5197647, 2697513);
		arg0.method2397(Static152.aClass70_695, 62, 15, 0, -1);
		if (Static88.aClass1_Sub1_Sub1_Sub3Array6 != null) {
			Static88.aClass1_Sub1_Sub1_Sub3Array6[1].method2618(140, 1);
			arg1.method2391(Static39.aClass70_442, 152, 10, 16777215, -1);
			Static88.aClass1_Sub1_Sub1_Sub3Array6[0].method2618(140, 12);
			arg1.method2391(Static20.aClass70_193, 152, 21, 16777215, -1);
		}
		if (Static106.aClass1_Sub1_Sub1_Sub3Array7 != null) {
			if (Static124.anIntArray326[0] == 0 && Static22.anIntArray35[0] == 0) {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[2].method2618(280, 4);
			} else {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[0].method2618(280, 4);
			}
			if (Static124.anIntArray326[0] == 0 && Static22.anIntArray35[0] == 1) {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[3].method2618(295, 4);
			} else {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[1].method2618(295, 4);
			}
			arg0.method2391(Static120.aClass70_1109, 312, 17, 16777215, -1);
			if (Static124.anIntArray326[0] == 1 && Static22.anIntArray35[0] == 0) {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[2].method2618(390, 4);
			} else {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[0].method2618(390, 4);
			}
			if (Static124.anIntArray326[0] == 1 && Static22.anIntArray35[0] == 1) {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[3].method2618(405, 4);
			} else {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[1].method2618(405, 4);
			}
			arg0.method2391(Static41.aClass70_457, 422, 17, 16777215, -1);
			if (Static124.anIntArray326[0] == 2 && Static22.anIntArray35[0] == 0) {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[2].method2618(500, 4);
			} else {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[0].method2618(500, 4);
			}
			if (Static124.anIntArray326[0] == 2 && Static22.anIntArray35[0] == 1) {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[3].method2618(515, 4);
			} else {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[1].method2618(515, 4);
			}
			arg0.method2391(Static25.aClass70_243, 532, 17, 16777215, -1);
			if (Static124.anIntArray326[0] == 3 && Static22.anIntArray35[0] == 0) {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[2].method2618(610, 4);
			} else {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[0].method2618(610, 4);
			}
			if (Static124.anIntArray326[0] == 3 && Static22.anIntArray35[0] == 1) {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[3].method2618(625, 4);
			} else {
				Static106.aClass1_Sub1_Sub1_Sub3Array7[1].method2618(625, 4);
			}
			arg0.method2391(Static112.aClass70_1471, 642, 17, 16777215, -1);
		}
		Static155.method3012(708, 4, 50, 16, 0);
		arg1.method2397(Static70.aClass70_676, 733, 16, 16777215, -1);
		Static132.anInt3443 = -1;
		if (Static54.aClass1_Sub1_Sub1_Sub4Array2 == null) {
			return;
		}
		@Pc(396) int local396 = 8;
		@Pc(402) int local402 = 24;
		@Pc(404) int local404;
		@Pc(406) int local406;
		do {
			local404 = local402;
			local406 = local396;
			if (Static151.anInt4019 <= (local396 - 1) * local402) {
				local396--;
			}
			if ((local402 - 1) * local396 >= Static151.anInt4019) {
				local402--;
			}
			if (Static151.anInt4019 <= local396 * (local402 - 1)) {
				local402--;
			}
		} while (local402 != local404 || local406 != local396);
		local404 = (765 - local396 * 88) / (local396 + 1);
		local406 = (480 - local402 * 19) / (local402 + 1);
		if (local404 > 5) {
			local404 = 5;
		}
		@Pc(481) int local481 = (765 - local404 * (local396 - 1) - local396 * 88) / 2;
		@Pc(483) int local483 = 0;
		if (local406 > 5) {
			local406 = 5;
		}
		@Pc(504) int local504 = (480 - (local402 - 1) * local406 - local402 * 19) / 2;
		@Pc(506) int local506 = local481;
		@Pc(510) int local510 = local504 + 23;
		for (@Pc(512) int local512 = 0; local512 < Static151.anInt4019; local512++) {
			@Pc(518) Class12 local518 = Static24.aClass12Array1[local512];
			@Pc(520) boolean local520 = true;
			@Pc(527) Class70 local527 = Static34.method873(local518.anInt598);
			if (local518.anInt598 == -1) {
				local527 = Static160.aClass70_1424;
				local520 = false;
			} else if (local518.anInt598 > 1980) {
				local527 = Static185.aClass70_1605;
				local520 = false;
			}
			if (Static21.anInt591 >= local506 && local510 <= Static70.anInt2156 && local506 + 88 > Static21.anInt591 && Static70.anInt2156 < local510 + 19 && local520) {
				Static132.anInt3443 = local512;
				Static54.aClass1_Sub1_Sub1_Sub4Array2[local518.aBoolean22 ? 1 : 0].method3023(local506, local510);
			} else {
				Static54.aClass1_Sub1_Sub1_Sub4Array2[local518.aBoolean22 ? 1 : 0].method3031(local506, local510);
			}
			if (Static2.aClass1_Sub1_Sub1_Sub3Array1 != null) {
				Static2.aClass1_Sub1_Sub1_Sub3Array1[(local518.aBoolean22 ? 8 : 0) + local518.anInt593].method2618(local506 + 29, local510);
			}
			arg0.method2397(Static34.method873(local518.anInt595), local506 + 15, local510 - -5 + 9, 0, -1);
			arg1.method2397(local527, local506 + 60, 5 + 9 + local510, 268435455, -1);
			local510 += local406 + 19;
			@Pc(660) int local660 = ~local402;
			local483++;
			if (local660 >= ~local483) {
				local506 += local404 + 88;
				local510 = local504 + 23;
				local483 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLclient!de;I)V")
	public static void method1096(@OriginalArg(1) Class1_Sub1_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt1996 > Static47.anInt1654) {
			Static93.method2009(arg0);
		} else if (Static47.anInt1654 <= arg0.anInt2048) {
			Static144.method2836(arg0);
		} else {
			Static85.method1881(arg0);
		}
		if (arg0.anInt2030 < 128 || arg0.anInt2001 < 128 || arg0.anInt2030 >= 13184 || arg0.anInt2001 >= 13184) {
			arg0.anInt2041 = -1;
			arg0.anInt2030 = arg0.anInt2004 * 64 + arg0.anIntArray197[0] * 128;
			arg0.anInt2048 = 0;
			arg0.anInt2051 = -1;
			arg0.anInt2001 = arg0.anInt2004 * 64 + arg0.anIntArray199[0] * 128;
			arg0.anInt1996 = 0;
			arg0.method1516();
		}
		if (arg0 == Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1 && (arg0.anInt2030 < 1536 || arg0.anInt2001 < 1536 || arg0.anInt2030 >= 11776 || arg0.anInt2001 >= 11776)) {
			arg0.anInt2041 = -1;
			arg0.anInt2048 = 0;
			arg0.anInt2030 = arg0.anIntArray197[0] * 128 + arg0.anInt2004 * 64;
			arg0.anInt2001 = arg0.anIntArray199[0] * 128 + arg0.anInt2004 * 64;
			arg0.anInt1996 = 0;
			arg0.anInt2051 = -1;
			arg0.method1516();
		}
		Static101.method2120(arg0);
		Static160.method3208(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!u;ILclient!u;Lclient!u;Lclient!le;)Z")
	public static boolean method1097(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(3) Class76 arg2, @OriginalArg(4) Class1_Sub8_Sub2 arg3) {
		Static101.aClass76_82 = arg1;
		Static45.aClass1_Sub8_Sub2_1 = arg3;
		Static86.aClass76_75 = arg2;
		Static63.aClass76_54 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLclient!rf;Z)V")
	public static void method1098(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class70 arg1) {
		@Pc(23) int local23 = Static113.aClass1_Sub1_Sub1_Sub2_Sub1_3.method2396(arg1, 250);
		@Pc(30) int local30 = Static113.aClass1_Sub1_Sub1_Sub2_Sub1_3.method2385(arg1, 250) * 13;
		Static155.method3012(6, 6, local23 + 4 + 4, 4 + 4 + local30, 0);
		Static155.method3016(6, 6, local23 + 4 + 4, local30 + 4 + 4, 16777215);
		Static113.aClass1_Sub1_Sub1_Sub2_Sub1_3.method2382(arg1, 10, 10, local23, local30, 16777215, -1, 1, 1, 0);
		Static169.method3346(6, 6, local30 + 4 + 4, local23 + 4 + 4);
		if (!arg0) {
			Static39.method1005(10, 10, local30, local23);
			return;
		}
		try {
			@Pc(115) Graphics local115 = Static24.aCanvas1.getGraphics();
			Static31.aClass14_1.method3221(local115);
		} catch (@Pc(123) Exception local123) {
			Static24.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)J")
	public static long method1099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass7_1 == null ? 0L : local7.aClass7_1.aLong15;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!u;Lclient!u;ILclient!u;)V")
	public static void method1100(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(3) Class76 arg2) {
		Static104.aClass76_86 = arg0;
		Static67.aClass76_58 = arg2;
		Static110.aClass76_91 = arg1;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
	public static void method1101() {
		try {
			if (Static160.anInt4192 == 1) {
				@Pc(17) int local17 = Static45.aClass1_Sub8_Sub2_1.method2165();
				if (local17 > 0 && Static45.aClass1_Sub8_Sub2_1.method2140()) {
					local17 -= Static28.anInt834;
					if (local17 < 0) {
						local17 = 0;
					}
					Static45.aClass1_Sub8_Sub2_1.method2153(local17);
				} else {
					Static45.aClass1_Sub8_Sub2_1.method2157();
					Static45.aClass1_Sub8_Sub2_1.method2149();
					Static30.aClass1_Sub7_1 = null;
					Static171.aClass6_1 = null;
					if (Static143.aClass76_111 == null) {
						Static160.anInt4192 = 0;
					} else {
						Static160.anInt4192 = 2;
					}
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static45.aClass1_Sub8_Sub2_1.method2157();
			Static143.aClass76_111 = null;
			Static171.aClass6_1 = null;
			Static30.aClass1_Sub7_1 = null;
			Static160.anInt4192 = 0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public static void method1102() {
		Static45.aClass1_Sub8_Sub2_1.method2157();
		Static143.aClass76_111 = null;
		Static160.anInt4192 = 1;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)Lclient!ig;")
	public static Class39 method1103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class39 local7 = Static128.method3227(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass39Array1 == null || arg1 >= local7.aClass39Array1.length) {
			return null;
		} else {
			return local7.aClass39Array1[arg1];
		}
	}
}
