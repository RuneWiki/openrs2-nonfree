import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_7;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "[[Lclient!me;")
	public static Class5_Sub1_Sub11[][] aClass5_Sub1_Sub11ArrayArray1;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_460 = Static38.method736("Abbrechen");

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!vc;")
	private static Class71 aClass71_461 = Static38.method736("Add ignore");

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!r;")
	private static Class5_Sub11_Sub1 aClass5_Sub11_Sub1_4 = new Class5_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_462 = aClass71_461;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "Lclient!vc;")
	private static Class71 aClass71_463 = Static38.method736("Enter name:");

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Lclient!ib;")
	public static Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!f", name = "w", descriptor = "I")
	public static int anInt799 = -1;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "I")
	public static int anInt800 = 0;

	@OriginalMember(owner = "client!f", name = "A", descriptor = "Lclient!vc;")
	public static Class71 aClass71_464 = aClass71_463;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "Lclient!vc;")
	public static Class71 aClass71_465 = Static38.method736(":tradereq:");

	@OriginalMember(owner = "client!f", name = "C", descriptor = "Lclient!qa;")
	public static Class54 aClass54_19 = new Class54(64);

	@OriginalMember(owner = "client!f", name = "D", descriptor = "Lclient!vc;")
	public static Class71 aClass71_466 = Static38.method736("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!f", name = "F", descriptor = "Lclient!vc;")
	public static Class71 aClass71_467 = Static38.method736("Sprites geladen)3");

	@OriginalMember(owner = "client!f", name = "H", descriptor = "Lclient!vc;")
	public static Class71 aClass71_468 = Static38.method736("Stufe)2");

	@OriginalMember(owner = "client!f", name = "I", descriptor = "Lclient!vc;")
	public static Class71 aClass71_469 = Static38.method736("null");

	@OriginalMember(owner = "client!f", name = "J", descriptor = "[I")
	public static int[] anIntArray100 = new int[50];

	@OriginalMember(owner = "client!f", name = "K", descriptor = "[I")
	public static int[] anIntArray101 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!la;)V")
	public static void method581(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub1_Sub3 arg1) {
		if (arg1.anInt2474 < 128 || arg1.anInt2452 < 128 || arg1.anInt2474 >= 13184 || arg1.anInt2452 >= 13184) {
			arg1.anInt2474 = arg1.anInt2475 * 64 + arg1.anIntArray264[0] * 128;
			arg1.anInt2452 = arg1.anInt2475 * 64 + arg1.anIntArray261[0] * 128;
			arg1.anInt2447 = 0;
			arg1.anInt2460 = 0;
			arg1.anInt2459 = -1;
			arg1.anInt2458 = -1;
			arg1.method1677();
		}
		if (arg1 == Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1 && (arg1.anInt2474 < 1536 || arg1.anInt2452 < 1536 || arg1.anInt2474 >= 11776 || arg1.anInt2452 >= 11776)) {
			arg1.anInt2447 = 0;
			arg1.anInt2459 = -1;
			arg1.anInt2458 = -1;
			arg1.anInt2452 = arg1.anIntArray261[0] * 128 + arg1.anInt2475 * 64;
			arg1.anInt2460 = 0;
			arg1.anInt2474 = arg1.anInt2475 * 64 + arg1.anIntArray264[0] * 128;
			arg1.method1677();
		}
		if (arg1.anInt2447 > Static95.anInt2285) {
			Static74.method665(arg1);
		} else if (Static95.anInt2285 <= arg1.anInt2460) {
			Static53.method973(arg1);
		} else {
			Static73.method1209(arg1);
		}
		Static51.method966(arg1);
		Static81.method1342(arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZII)V")
	public static void method582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static7.anInt273 != 0 && arg1 != -1) {
			Static10.method211(Static7.anInt273, Static78.aClass24_Sub1_10, arg1, 1);
			Static76.anInt1881 = arg0;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method583() {
		@Pc(10) int local10 = Static86.aClass5_Sub11_Sub1_12.method1555(8);
		@Pc(15) int local15;
		if (Static37.anInt594 > local10) {
			for (local15 = local10; local15 < Static37.anInt594; local15++) {
				Static27.anIntArray95[Static47.anInt1293++] = Static116.anIntArray285[local15];
			}
		}
		if (local10 > Static37.anInt594) {
			throw new RuntimeException("gppov1");
		}
		Static37.anInt594 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(57) int local57 = Static116.anIntArray285[local15];
			@Pc(61) Class5_Sub1_Sub1_Sub3_Sub2 local61 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local57];
			@Pc(66) int local66 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
			if (local66 == 0) {
				Static116.anIntArray285[Static37.anInt594++] = local57;
				local61.anInt2469 = Static95.anInt2285;
			} else {
				@Pc(86) int local86 = Static86.aClass5_Sub11_Sub1_12.method1555(2);
				if (local86 == 0) {
					Static116.anIntArray285[Static37.anInt594++] = local57;
					local61.anInt2469 = Static95.anInt2285;
					Static72.anIntArray224[Static57.anInt1493++] = local57;
				} else {
					@Pc(131) int local131;
					@Pc(141) int local141;
					if (local86 == 1) {
						Static116.anIntArray285[Static37.anInt594++] = local57;
						local61.anInt2469 = Static95.anInt2285;
						local131 = Static86.aClass5_Sub11_Sub1_12.method1555(3);
						local61.method1679(false, local131);
						local141 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
						if (local141 == 1) {
							Static72.anIntArray224[Static57.anInt1493++] = local57;
						}
					} else if (local86 == 2) {
						Static116.anIntArray285[Static37.anInt594++] = local57;
						local61.anInt2469 = Static95.anInt2285;
						local131 = Static86.aClass5_Sub11_Sub1_12.method1555(3);
						local61.method1679(true, local131);
						local141 = Static86.aClass5_Sub11_Sub1_12.method1555(3);
						local61.method1679(true, local141);
						@Pc(193) int local193 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
						if (local193 == 1) {
							Static72.anIntArray224[Static57.anInt1493++] = local57;
						}
					} else if (local86 == 3) {
						Static27.anIntArray95[Static47.anInt1293++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method584() {
		aClass71_460 = null;
		aClass71_463 = null;
		anIntArray98 = null;
		aClass54_19 = null;
		aClass71_461 = null;
		aClass5_Sub1_Sub11ArrayArray1 = null;
		anIntArray101 = null;
		aClass24_Sub1_7 = null;
		aClass71_465 = null;
		anIntArray99 = null;
		aClass71_469 = null;
		aClass71_468 = null;
		aClass5_Sub11_Sub1_4 = null;
		aClass71_464 = null;
		anIntArray100 = null;
		aClass32_1 = null;
		aClass71_466 = null;
		aClass71_467 = null;
		aClass71_462 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!ia;)V")
	public static void method585(@OriginalArg(1) Class5_Sub1_Sub10_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static46.anIntArray138.length; local3++) {
			Static46.anIntArray138[local3] = 0;
		}
		@Pc(37) int local37;
		for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
			local37 = (int) ((double) 256 * Math.random() * 128.0D);
			Static46.anIntArray138[local37] = (int) (Math.random() * 256.0D);
		}
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(66) int local66;
		for (local37 = 0; local37 < 20; local37++) {
			for (local54 = 1; local54 < 255; local54++) {
				for (local58 = 1; local58 < 127; local58++) {
					local66 = (local54 << 7) + local58;
					Static34.anIntArray118[local66] = (Static46.anIntArray138[local66 - 1] + Static46.anIntArray138[local66 + 1] + Static46.anIntArray138[local66 + -128] + Static46.anIntArray138[local66 + 128]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static46.anIntArray138;
			Static46.anIntArray138 = Static34.anIntArray118;
			Static34.anIntArray118 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local54 = 0;
		for (local58 = 0; local58 < arg0.anInt1351; local58++) {
			for (local66 = 0; local66 < arg0.anInt1350; local66++) {
				if (arg0.aByteArray8[local54++] != 0) {
					@Pc(145) int local145 = arg0.anInt1355 + local58 + 16;
					@Pc(152) int local152 = arg0.anInt1352 + local66 + 16;
					@Pc(158) int local158 = (local145 << 7) + local152;
					Static46.anIntArray138[local158] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public static void method586() {
		while (true) {
			@Pc(9) Class52 local9 = Static89.aClass52_11;
			@Pc(18) Class5_Sub10 local18;
			synchronized (Static89.aClass52_11) {
				local18 = (Class5_Sub10) Static42.aClass52_5.method1355();
			}
			if (local18 == null) {
				return;
			}
			local18.aClass24_Sub1_16.method684(local18.aByteArray21, false, local18.aClass14_3, (int) local18.aLong118);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!tc;IB)V")
	public static void method587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub1_Sub3_Sub2 arg2, @OriginalArg(3) int arg3) {
		if (arg2 == Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1 || Static49.anInt1394 >= 400) {
			return;
		}
		@Pc(60) Class71 local60;
		if (arg2.anInt2504 == 0) {
			local60 = Static74.method677(new Class71[] { arg2.aClass71_1236, Static112.method1749(arg2.anInt2496, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2496), Static24.aClass71_422, Static7.aClass71_196, Static51.method962(arg2.anInt2496), Static38.aClass71_562 });
		} else {
			local60 = Static74.method677(new Class71[] { arg2.aClass71_1236, Static24.aClass71_422, Static9.aClass71_221, Static51.method962(arg2.anInt2504), Static38.aClass71_562 });
		}
		@Pc(136) int local136;
		if (Static81.anInt1990 == 1) {
			Static60.method1040(26, Static74.method677(new Class71[] { Static94.aClass71_1106, Static29.aClass71_453, local60 }), arg1, arg0, arg3, Static31.aClass71_480);
		} else if (!Static33.aBoolean40) {
			for (local136 = 4; local136 >= 0; local136--) {
				if (Static23.aClass71Array7[local136] != null) {
					@Pc(148) short local148 = 0;
					if (Static23.aClass71Array7[local136].method1785(Static34.aClass71_539)) {
						if (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2496 < arg2.anInt2496) {
							local148 = 2000;
						}
						if (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2498 != 0 && arg2.anInt2498 != 0) {
							if (arg2.anInt2498 == Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2498) {
								local148 = 2000;
							} else {
								local148 = 0;
							}
						}
					} else if (Static21.aBooleanArray5[local136]) {
						local148 = 2000;
					}
					@Pc(192) int local192 = 0;
					if (local136 == 0) {
						local192 = local148 + 18;
					}
					if (local136 == 1) {
						local192 = local148 + 45;
					}
					if (local136 == 2) {
						local192 = local148 + 40;
					}
					if (local136 == 3) {
						local192 = local148 + 44;
					}
					if (local136 == 4) {
						local192 = local148 + 34;
					}
					Static60.method1040(local192, Static74.method677(new Class71[] { Static68.aClass71_824, local60 }), arg1, arg0, arg3, Static23.aClass71Array7[local136]);
				}
			}
		} else if ((Static24.anInt741 & 0x8) == 8) {
			Static60.method1040(50, Static74.method677(new Class71[] { Static10.aClass71_222, Static29.aClass71_453, local60 }), arg1, arg0, arg3, Static82.aClass71_991);
		}
		for (local136 = 0; local136 < Static49.anInt1394; local136++) {
			if (Static66.anIntArray191[local136] == 39) {
				Static24.aClass71Array8[local136] = Static74.method677(new Class71[] { Static117.aClass71_1362, Static91.aClass71_1058, Static68.aClass71_824, local60 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public static void method588() {
		Static25.method556();
		if (Static90.anInt3001 != 10) {
			return;
		}
		@Pc(17) int local17 = anInt800 - 202;
		@Pc(27) int local27 = Static66.anInt1652;
		@Pc(31) int local31 = Static32.anInt847 - 171;
		if (Static7.anInt269 == 0) {
			if (local27 == 1 && local17 >= 25 && local17 <= 175 && local31 >= 100 && local31 <= 140) {
				Static7.anInt269 = 3;
				Static106.anInt2520 = 0;
			}
			if (local27 != 1 || local17 < 185 || local17 > 335 || local31 < 100 || local31 > 140) {
				return;
			}
			Static106.anInt2520 = 0;
			Static98.aClass71_945 = Static3.aClass71_67;
			Static98.aClass71_948 = Static3.aClass71_69;
			Static98.aClass71_949 = Static100.aClass71_1170;
			Static7.anInt269 = 2;
			return;
		}
		if (Static7.anInt269 == 2) {
			@Pc(41) byte local41 = 60;
			@Pc(42) int local42 = local41 + 30;
			if (local27 == 1 && local31 >= 75 && local31 < 90) {
				Static106.anInt2520 = 0;
			}
			local42 += 15;
			if (local27 == 1 && local31 >= 90 && local31 < 105) {
				Static106.anInt2520 = 1;
			}
			local42 += 15;
			if (local27 == 1 && local17 >= 25 && local17 <= 175 && local31 >= 130 && local31 <= 170) {
				Static98.aClass71_943 = Static98.aClass71_943.method1796().method1803();
				Static101.method1643(Static3.aClass71_53, Static3.aClass71_48, Static46.aClass71_625);
				Static27.method571(20);
				return;
			}
			if (local27 == 1 && local17 >= 185 && local17 <= 335 && local31 >= 130 && local31 <= 170) {
				Static98.aClass71_946 = Static98.aClass71_947;
				Static98.aClass71_943 = Static98.aClass71_947;
				Static7.anInt269 = 0;
			}
			while (true) {
				@Pc(175) boolean local175;
				label138: do {
					while (Static25.method560()) {
						local175 = false;
						for (@Pc(177) int local177 = 0; local177 < Static29.aClass71_455.method1784(); local177++) {
							if (Static90.anInt3004 == Static29.aClass71_455.method1804(local177)) {
								local175 = true;
								break;
							}
						}
						if (Static106.anInt2520 != 0) {
							continue label138;
						}
						if (Static10.anInt312 == 85 && Static98.aClass71_943.method1784() > 0) {
							Static98.aClass71_943 = Static98.aClass71_943.method1800(Static98.aClass71_943.method1784() - 1, 0);
						}
						if (Static10.anInt312 == 84 || Static10.anInt312 == 80) {
							Static106.anInt2520 = 1;
						}
						if (local175 && Static98.aClass71_943.method1784() < 12) {
							Static98.aClass71_943 = Static98.aClass71_943.method1791(Static90.anInt3004);
						}
					}
					return;
				} while (Static106.anInt2520 != 1);
				if (Static10.anInt312 == 85 && Static98.aClass71_946.method1784() > 0) {
					Static98.aClass71_946 = Static98.aClass71_946.method1800(Static98.aClass71_946.method1784() - 1, 0);
				}
				if (Static10.anInt312 == 84 || Static10.anInt312 == 80) {
					Static106.anInt2520 = 0;
				}
				if (local175 && Static98.aClass71_946.method1784() < 20) {
					Static98.aClass71_946 = Static98.aClass71_946.method1791(Static90.anInt3004);
				}
			}
		}
		if (Static7.anInt269 == 3 && local27 == 1 && local17 >= 105 && local17 <= 255 && local31 >= 130 && local31 <= 170) {
			Static7.anInt269 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public static void method589() {
		Static65.anInt1637 = 0;
		@Pc(12) int local12 = Static48.anInt1367 + (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 >> 7);
		@Pc(19) int local19 = Static76.anInt1884 + (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 >> 128537543);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static65.anInt1637 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static65.anInt1637 = 1;
		}
		if (Static65.anInt1637 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static65.anInt1637 = 0;
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public static void method592() {
		try {
			if (Static74.anInt913 == 0) {
				if (Static58.aClass35_2 != null) {
					Static58.aClass35_2.method961();
					Static58.aClass35_2 = null;
				}
				Static74.anInt913 = 1;
				Static39.aClass70_2 = null;
				Static23.anInt731 = 0;
				Static114.aBoolean120 = false;
			}
			if (Static74.anInt913 == 1) {
				if (Static39.aClass70_2 == null) {
					Static39.aClass70_2 = Static111.aClass29_3.method776(Static99.anInt2334);
				}
				if (Static39.aClass70_2.anInt2692 == 2) {
					throw new IOException();
				}
				if (Static39.aClass70_2.anInt2692 == 1) {
					Static58.aClass35_2 = new Class35((Socket) Static39.aClass70_2.anObject3, Static111.aClass29_3);
					Static74.anInt913 = 2;
					Static39.aClass70_2 = null;
				}
			}
			if (Static74.anInt913 == 2) {
				@Pc(72) long local72 = Static57.aLong54 = Static98.aClass71_943.method1817();
				@Pc(79) int local79 = (int) (local72 >> 16 & 0x1FL);
				Static61.aClass5_Sub11_Sub1_8.anInt2233 = 0;
				Static61.aClass5_Sub11_Sub1_8.method1545(14);
				Static61.aClass5_Sub11_Sub1_8.method1545(local79);
				Static58.aClass35_2.method967(2, Static61.aClass5_Sub11_Sub1_8.aByteArray23);
				Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
				Static74.anInt913 = 3;
			}
			@Pc(115) int local115;
			if (Static74.anInt913 == 3) {
				local115 = Static58.aClass35_2.method960();
				if (local115 != 0) {
					Static108.method1736(local115);
					return;
				}
				Static74.anInt913 = 4;
				Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
			}
			if (Static74.anInt913 == 4) {
				if (Static86.aClass5_Sub11_Sub1_12.anInt2233 < 8) {
					local115 = Static58.aClass35_2.method965();
					if (local115 > 8 - Static86.aClass5_Sub11_Sub1_12.anInt2233) {
						local115 = 8 - Static86.aClass5_Sub11_Sub1_12.anInt2233;
					}
					if (local115 > 0) {
						Static58.aClass35_2.method968(Static86.aClass5_Sub11_Sub1_12.anInt2233, Static86.aClass5_Sub11_Sub1_12.aByteArray23, local115);
						Static86.aClass5_Sub11_Sub1_12.anInt2233 += local115;
					}
				}
				if (Static86.aClass5_Sub11_Sub1_12.anInt2233 == 8) {
					Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
					Static106.aLong97 = Static86.aClass5_Sub11_Sub1_12.method1537();
					Static74.anInt913 = 5;
				}
			}
			if (Static74.anInt913 == 5) {
				Static61.aClass5_Sub11_Sub1_8.anInt2233 = 0;
				@Pc(202) int[] local202 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static106.aLong97 >> 32), (int) Static106.aLong97 };
				Static61.aClass5_Sub11_Sub1_8.method1545(10);
				Static61.aClass5_Sub11_Sub1_8.method1525(local202[0]);
				Static61.aClass5_Sub11_Sub1_8.method1525(local202[1]);
				Static61.aClass5_Sub11_Sub1_8.method1525(local202[2]);
				Static61.aClass5_Sub11_Sub1_8.method1525(local202[3]);
				Static61.aClass5_Sub11_Sub1_8.method1525(Static111.aClass29_3.anInt1084);
				Static61.aClass5_Sub11_Sub1_8.method1548(Static98.aClass71_943.method1817());
				Static61.aClass5_Sub11_Sub1_8.method1534(Static98.aClass71_946);
				Static61.aClass5_Sub11_Sub1_8.method1517(Static16.aBigInteger1, Static64.aBigInteger4);
				aClass5_Sub11_Sub1_4.anInt2233 = 0;
				if (Static90.anInt3001 == 40) {
					aClass5_Sub11_Sub1_4.method1545(18);
				} else {
					aClass5_Sub11_Sub1_4.method1545(16);
				}
				aClass5_Sub11_Sub1_4.method1545(Static61.aClass5_Sub11_Sub1_8.anInt2233 + 61);
				aClass5_Sub11_Sub1_4.method1525(448);
				aClass5_Sub11_Sub1_4.method1545(Static21.aBoolean28 ? 1 : 0);
				aClass5_Sub11_Sub1_4.method1525(Static16.aClass24_Sub1_4.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static88.aClass24_Sub1_18.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static70.aClass24_Sub1_15.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static60.aClass24_Sub1_14.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static88.aClass24_Sub1_19.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static18.aClass24_Sub1_5.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static19.aClass24_Sub1_6.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static81.aClass24_Sub1_17.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static48.aClass24_Sub1_13.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static64.aClass24_Sub1_20.anInt917);
				aClass5_Sub11_Sub1_4.method1525(aClass24_Sub1_7.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static78.aClass24_Sub1_10.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static4.aClass24_Sub1_1.anInt917);
				aClass5_Sub11_Sub1_4.method1525(Static32.aClass24_Sub1_9.anInt917);
				aClass5_Sub11_Sub1_4.method1527(Static61.aClass5_Sub11_Sub1_8.aByteArray23, Static61.aClass5_Sub11_Sub1_8.anInt2233);
				Static58.aClass35_2.method967(aClass5_Sub11_Sub1_4.anInt2233, aClass5_Sub11_Sub1_4.aByteArray23);
				Static61.aClass5_Sub11_Sub1_8.method1551(local202);
				for (@Pc(421) int local421 = 0; local421 < 4; local421++) {
					local202[local421] += 50;
				}
				Static86.aClass5_Sub11_Sub1_12.method1551(local202);
				Static74.anInt913 = 6;
			}
			if (Static74.anInt913 == 6 && Static58.aClass35_2.method965() > 0) {
				local115 = Static58.aClass35_2.method960();
				if (local115 == 21 && Static90.anInt3001 == 20) {
					Static74.anInt913 = 7;
				} else if (local115 == 2) {
					Static74.anInt913 = 9;
				} else if (local115 == 15 && Static90.anInt3001 == 40) {
					Static14.method411();
					return;
				} else if (local115 == 23 && Static105.anInt2401 < 1) {
					Static105.anInt2401++;
					Static74.anInt913 = 0;
				} else {
					Static108.method1736(local115);
					return;
				}
			}
			if (Static74.anInt913 == 7 && Static58.aClass35_2.method965() > 0) {
				Static100.anInt2367 = Static58.aClass35_2.method960() * 60 + 180;
				Static74.anInt913 = 8;
			}
			if (Static74.anInt913 == 8) {
				Static23.anInt731 = 0;
				Static101.method1643(Static74.method677(new Class71[] { Static51.method962(Static100.anInt2367 / 60), Static26.aClass71_733 }), Static106.aClass71_1234, Static73.aClass71_891);
				if (--Static100.anInt2367 <= 0) {
					Static74.anInt913 = 0;
				}
			} else {
				if (Static74.anInt913 == 9 && Static58.aClass35_2.method965() >= 8) {
					Static9.anInt302 = Static58.aClass35_2.method960();
					Static38.aBoolean43 = Static58.aClass35_2.method960() == 1;
					Static6.anInt222 = Static58.aClass35_2.method960();
					Static6.anInt222 <<= 0x8;
					Static6.anInt222 += Static58.aClass35_2.method960();
					Static24.anInt739 = Static58.aClass35_2.method960();
					Static58.aClass35_2.method968(0, Static86.aClass5_Sub11_Sub1_12.aByteArray23, 1);
					Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
					Static8.anInt283 = Static86.aClass5_Sub11_Sub1_12.method1561();
					Static58.aClass35_2.method968(0, Static86.aClass5_Sub11_Sub1_12.aByteArray23, 2);
					Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
					Static57.anInt1482 = Static86.aClass5_Sub11_Sub1_12.method1543();
					Static74.anInt913 = 10;
				}
				if (Static74.anInt913 != 10) {
					Static23.anInt731++;
					if (Static23.anInt731 > 2000) {
						if (Static105.anInt2401 < 1) {
							if (Static114.anInt2667 == Static99.anInt2334) {
								Static99.anInt2334 = Static112.anInt2649;
							} else {
								Static99.anInt2334 = Static114.anInt2667;
							}
							Static105.anInt2401++;
							Static74.anInt913 = 0;
						} else {
							Static108.method1736(-3);
						}
					}
				} else if (Static58.aClass35_2.method965() >= Static57.anInt1482) {
					Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
					Static58.aClass35_2.method968(0, Static86.aClass5_Sub11_Sub1_12.aByteArray23, Static57.anInt1482);
					Static106.method1684();
					Static112.anInt2660 = -1;
					Static14.method406(false);
					Static8.anInt283 = -1;
				}
			}
		} catch (@Pc(720) IOException local720) {
			if (Static105.anInt2401 < 1) {
				Static105.anInt2401++;
				if (Static114.anInt2667 == Static99.anInt2334) {
					Static99.anInt2334 = Static112.anInt2649;
				} else {
					Static99.anInt2334 = Static114.anInt2667;
				}
				Static74.anInt913 = 0;
			} else {
				Static108.method1736(-2);
			}
		}
	}
}
