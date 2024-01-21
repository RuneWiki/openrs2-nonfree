import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!qc;")
	private static Class60 aClass60_19 = Static121.method2047("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_20 = aClass60_19;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public static int anInt55 = 0;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_21 = Static121.method2047("b12_full");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method27() {
		aClass60_19 = null;
		aClass60_21 = null;
		anIntArray4 = null;
		aClass60_20 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JZ)V")
	public static void method28(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static85.anInt2032; local18++) {
			if (Static39.aLongArray7[local18] == arg0) {
				Static85.anInt2032--;
				for (@Pc(40) int local40 = local18; local40 < Static85.anInt2032; local40++) {
					Static39.aLongArray7[local40] = Static39.aLongArray7[local40 + 1];
				}
				Static92.anInt2194 = Static63.anInt1698;
				Static56.aClass4_Sub13_Sub1_1.method1265(171);
				Static56.aClass4_Sub13_Sub1_1.method1242(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!qf;Lclient!qf;)V")
	public static void method29(@OriginalArg(1) Class4_Sub4_Sub3_Sub4 arg0, @OriginalArg(2) Class4_Sub4_Sub3_Sub4 arg1) {
		if (Static35.aClass4_Sub4_Sub3_Sub2Array3 == null) {
			Static35.aClass4_Sub4_Sub3_Sub2Array3 = Static55.method1030(Static33.aClass60_365, Static1.aClass40_Sub1_1, Static59.aClass60_552);
		}
		if (Static33.aClass4_Sub4_Sub3_Sub1Array3 == null) {
			Static33.aClass4_Sub4_Sub3_Sub1Array3 = Static28.method545(Static33.aClass60_365, Static87.aClass60_837, Static1.aClass40_Sub1_1);
		}
		if (Static31.aClass4_Sub4_Sub3_Sub1Array2 == null) {
			Static31.aClass4_Sub4_Sub3_Sub1Array2 = Static28.method545(Static33.aClass60_365, Static7.aClass60_1201, Static1.aClass40_Sub1_1);
		}
		if (Static99.aClass4_Sub4_Sub3_Sub1Array9 == null) {
			Static99.aClass4_Sub4_Sub3_Sub1Array9 = Static28.method545(Static33.aClass60_365, Static108.aClass60_1042, Static1.aClass40_Sub1_1);
		}
		Static80.method1705(0, 23, 765, 480, 0);
		Static80.method1706(0, 0, 125, 23, 12425273, 9135624);
		Static80.method1706(125, 0, 640, 23, 5197647, 2697513);
		arg1.method1729(Static17.aClass60_160, 62, 15, 0, -1);
		if (Static99.aClass4_Sub4_Sub3_Sub1Array9 != null) {
			Static99.aClass4_Sub4_Sub3_Sub1Array9[1].method431(140, 1);
			arg0.method1745(Static107.aClass60_1027, 152, 10, 16777215, -1);
			Static99.aClass4_Sub4_Sub3_Sub1Array9[0].method431(140, 12);
			arg0.method1745(Static37.aClass60_396, 152, 21, 16777215, -1);
		}
		if (Static31.aClass4_Sub4_Sub3_Sub1Array2 != null) {
			if (Static63.anIntArray169[0] == 0 && Static34.anIntArray67[0] == 0) {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[2].method431(280, 4);
			} else {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[0].method431(280, 4);
			}
			if (Static63.anIntArray169[0] == 0 && Static34.anIntArray67[0] == 1) {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[3].method431(295, 4);
			} else {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[1].method431(295, 4);
			}
			arg1.method1745(Static120.aClass60_780, 312, 17, 16777215, -1);
			if (Static63.anIntArray169[0] == 1 && Static34.anIntArray67[0] == 0) {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[2].method431(390, 4);
			} else {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[0].method431(390, 4);
			}
			if (Static63.anIntArray169[0] == 1 && Static34.anIntArray67[0] == 1) {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[3].method431(405, 4);
			} else {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[1].method431(405, 4);
			}
			arg1.method1745(Static60.aClass60_934, 422, 17, 16777215, -1);
			if (Static63.anIntArray169[0] == 2 && Static34.anIntArray67[0] == 0) {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[2].method431(500, 4);
			} else {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[0].method431(500, 4);
			}
			if (Static63.anIntArray169[0] == 2 && Static34.anIntArray67[0] == 1) {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[3].method431(515, 4);
			} else {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[1].method431(515, 4);
			}
			arg1.method1745(Static15.aClass60_1187, 532, 17, 16777215, -1);
			if (Static63.anIntArray169[0] == 3 && Static34.anIntArray67[0] == 0) {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[2].method431(610, 4);
			} else {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[0].method431(610, 4);
			}
			if (Static63.anIntArray169[0] == 3 && Static34.anIntArray67[0] == 1) {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[3].method431(625, 4);
			} else {
				Static31.aClass4_Sub4_Sub3_Sub1Array2[1].method431(625, 4);
			}
			arg1.method1745(Static95.aClass60_928, 642, 17, 16777215, -1);
		}
		Static80.method1705(708, 4, 50, 16, 0);
		arg0.method1729(Static83.aClass60_817, 733, 16, 16777215, -1);
		Static2.anInt1352 = -1;
		if (Static35.aClass4_Sub4_Sub3_Sub2Array3 != null) {
			@Pc(375) int local375 = 8;
			@Pc(381) int local381 = 24;
			@Pc(383) int local383;
			@Pc(385) int local385;
			do {
				local383 = local381;
				local385 = local375;
				if (Static43.anInt1096 <= local381 * (local375 - 1)) {
					local375--;
				}
				if (local375 * (local381 - 1) >= Static43.anInt1096) {
					local381--;
				}
				if (local375 * (local381 - 1) >= Static43.anInt1096) {
					local381--;
				}
			} while (local381 != local383 || local385 != local375);
			local383 = (765 - local375 * 88) / (local375 + 1);
			if (local383 > 5) {
				local383 = 5;
			}
			local385 = (480 - local381 * 19) / (local381 + 1);
			if (local385 > 5) {
				local385 = 5;
			}
			@Pc(470) int local470 = (480 - local385 * (local381 - 1) - local381 * 19) / 2;
			@Pc(485) int local485 = (765 - local375 * 88 - local383 * (local375 - 1)) / 2;
			@Pc(489) int local489 = local470 + 23;
			@Pc(491) int local491 = local485;
			@Pc(493) int local493 = 0;
			for (@Pc(495) int local495 = 0; local495 < Static43.anInt1096; local495++) {
				@Pc(501) Class49 local501 = Static32.aClass49Array1[local495];
				@Pc(503) boolean local503 = true;
				@Pc(508) Class60 local508 = Static120.method1450(local501.anInt1871);
				if (local501.anInt1871 == -1) {
					local508 = Static76.aClass60_740;
					local503 = false;
				} else if (local501.anInt1871 > 1980) {
					local503 = false;
					local508 = Static104.aClass60_1006;
				}
				if (Static82.anInt1962 >= local491 && local489 <= Static17.anInt452 && local491 + 88 > Static82.anInt1962 && Static17.anInt452 < local489 + 19 && local503) {
					Static2.anInt1352 = local495;
					Static35.aClass4_Sub4_Sub3_Sub2Array3[local501.aBoolean74 ? 1 : 0].method907(local491, local489);
				} else {
					Static35.aClass4_Sub4_Sub3_Sub2Array3[local501.aBoolean74 ? 1 : 0].method915(local491, local489);
				}
				if (Static33.aClass4_Sub4_Sub3_Sub1Array3 != null) {
					Static33.aClass4_Sub4_Sub3_Sub1Array3[local501.anInt1874 + (local501.aBoolean74 ? 8 : 0)].method431(local491 + 29, local489);
				}
				arg1.method1729(Static120.method1450(local501.anInt1875), local491 + 15, local489 - -14, 0, -1);
				arg0.method1729(local508, local491 + 60, local489 + 14, 268435455, -1);
				local489 += local385 + 19;
				local493++;
				if (local381 <= local493) {
					local493 = 0;
					local489 = local470 + 23;
					local491 += local383 + 88;
				}
			}
		}
		try {
			@Pc(658) Graphics local658 = Static83.aCanvas1.getGraphics();
			Static20.aClass2_1.method989(local658);
		} catch (@Pc(666) Exception local666) {
			Static83.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method30() {
		for (@Pc(7) int local7 = 0; local7 < Static114.anInt2750; local7++) {
			@Pc(18) int local18 = Static38.anIntArray72[local7];
			@Pc(22) Class4_Sub4_Sub1_Sub2_Sub1 local22 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local18];
			if (local22 != null) {
				Static33.method612(local22.aClass4_Sub4_Sub11_1.anInt2008, local22);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lclient!q;BI)V")
	public static void method31(@OriginalArg(0) Class4_Sub17[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class4_Sub17 local18 = arg0[local12];
			if (local18 != null) {
				if (local18.anInt2231 == 0) {
					if (local18.aClass4_Sub17Array3 != null) {
						method31(local18.aClass4_Sub17Array3, arg1);
					}
					@Pc(42) Class4_Sub18 local42 = (Class4_Sub18) Static111.aClass66_12.method1834((long) local18.anInt2203);
					if (local42 != null) {
						Static11.method207(local42.anInt2402, arg1);
					}
				}
				@Pc(61) Class4_Sub16 local61;
				if (arg1 == 0 && local18.anObjectArray8 != null) {
					local61 = new Class4_Sub16();
					local61.anObjectArray3 = local18.anObjectArray8;
					local61.aClass4_Sub17_9 = local18;
					Static18.method296(local61);
				}
				if (arg1 == 1 && local18.anObjectArray27 != null) {
					local61 = new Class4_Sub16();
					local61.anObjectArray3 = local18.anObjectArray27;
					local61.aClass4_Sub17_9 = local18;
					Static18.method296(local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V")
	public static void method32(@OriginalArg(0) int arg0) {
		if (Static71.anInt1828 == arg0) {
			return;
		}
		if (Static71.anInt1828 == 0) {
			Static107.method1841();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static121.anInt2882 = 0;
			Static24.anInt686 = 0;
			Static22.anInt653 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static5.aClass78_2 != null) {
			Static5.aClass78_2.method2085();
			Static5.aClass78_2 = null;
		}
		if (Static71.anInt1828 == 25) {
			Static82.anInt1959 = 1;
			Static116.anInt2781 = 1;
			Static54.anInt1376 = 0;
			Static77.anInt1904 = 0;
			Static99.anInt2414 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static108.method1849(Static110.aClass40_Sub1_18, Static1.aClass40_Sub1_1, Static83.aCanvas1);
		} else {
			Static46.method834();
		}
		Static71.anInt1828 = arg0;
	}
}
