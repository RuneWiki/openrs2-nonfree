import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Lclient!od;")
	private static Class60 aClass60_644 = Static41.method597("Please try using a different world)3");

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_641 = aClass60_644;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_642 = aClass60_644;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_643 = aClass60_644;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
	public static int anInt1670 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Lclient!od;")
	public static Class60 aClass60_645 = Static41.method597(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_646 = aClass60_644;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "Lclient!od;")
	public static Class60 aClass60_647 = aClass60_644;

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "Lclient!cb;")
	public static Class12 aClass12_12 = new Class12(64);

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "Lclient!od;")
	public static Class60 aClass60_648 = aClass60_644;

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "Lclient!od;")
	private static Class60 aClass60_649 = Static41.method597("wave2:");

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "[I")
	public static int[] anIntArray191 = new int[50];

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "Lclient!od;")
	public static Class60 aClass60_650 = aClass60_649;

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][13][13];

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "Lclient!od;")
	public static Class60 aClass60_651 = Static41.method597("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "Lclient!od;")
	public static Class60 aClass60_652 = aClass60_649;

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "Lclient!od;")
	public static Class60 aClass60_653 = Static41.method597("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method1076() {
		aClass60_647 = null;
		aClass60_645 = null;
		anIntArray191 = null;
		aClass60_644 = null;
		aClass60_650 = null;
		aClass60_653 = null;
		aClass60_643 = null;
		aClass60_648 = null;
		aClass60_646 = null;
		aClass12_12 = null;
		aClass60_651 = null;
		aClass60_641 = null;
		aClass60_649 = null;
		aClass60_652 = null;
		anIntArrayArrayArray6 = null;
		aClass60_642 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
	public static void method1077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static34.method1652(arg3, arg2, arg3 + arg1, arg2 + arg0);
		Static100.method1669();
		Static125.anInt2831++;
		Static87.method1399(true);
		Static1.method1(true);
		Static87.method1399(false);
		Static1.method1(false);
		Static9.method112();
		Static71.method1225();
		@Pc(46) int local46;
		@Pc(44) int local44;
		if (!aBoolean60) {
			local44 = Static79.anInt1896 + Static130.anInt2896 & 0x7FF;
			local46 = Static48.anInt1174;
			if (Static102.anInt2426 / 256 > local46) {
				local46 = Static102.anInt2426 / 256;
			}
			if (Static55.aBooleanArray8[4] && local46 < Static24.anIntArray86[4] + 128) {
				local46 = Static24.anIntArray86[4] + 128;
			}
			Static19.method372(Static55.method882(Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440, Static77.anInt1866) - 50, local46 * 3 + 600, local44, local46, Static83.anInt1957, Static79.anInt1902);
		}
		if (aBoolean60) {
			local46 = Static118.method1898();
		} else {
			local46 = Static61.method992();
		}
		local44 = Static98.anInt2286;
		@Pc(106) int local106 = Static23.anInt816;
		@Pc(108) int local108 = Static23.anInt806;
		@Pc(110) int local110 = Static109.anInt2592;
		@Pc(112) int local112 = Static108.anInt2581;
		@Pc(155) int local155;
		for (@Pc(114) int local114 = 0; local114 < 5; local114++) {
			if (Static55.aBooleanArray8[local114]) {
				local155 = (int) ((double) (Static49.anIntArray122[local114] * 2 + 1) * Math.random() - (double) Static49.anIntArray122[local114] + Math.sin((double) Static84.anIntArray227[local114] / 100.0D * (double) Static118.anIntArray337[local114]) * (double) Static24.anIntArray86[local114]);
				if (local114 == 4) {
					Static23.anInt806 += local155;
					if (Static23.anInt806 < 128) {
						Static23.anInt806 = 128;
					}
					if (Static23.anInt806 > 383) {
						Static23.anInt806 = 383;
					}
				}
				if (local114 == 2) {
					Static109.anInt2592 += local155;
				}
				if (local114 == 0) {
					Static98.anInt2286 += local155;
				}
				if (local114 == 3) {
					Static108.anInt2581 = Static108.anInt2581 + local155 & 0x7FF;
				}
				if (local114 == 1) {
					Static23.anInt816 += local155;
				}
			}
		}
		local155 = Static36.anInt1006;
		@Pc(228) int local228 = Static85.anInt2015;
		if (local155 >= arg3 && local155 < arg3 + arg1 && local228 >= arg2 && local228 < arg2 + arg0) {
			Static92.aBoolean77 = true;
			Static92.anInt2181 = 0;
			Static92.anInt2180 = Static85.anInt2015 - arg2;
			Static92.anInt2179 = Static36.anInt1006 - arg3;
		} else {
			Static92.aBoolean77 = false;
			Static92.anInt2181 = 0;
		}
		Static44.method1487();
		Static34.method1649(arg3, arg2, arg1, arg0, 0);
		Static44.method1487();
		Static30.aClass48_1.method1038(Static98.anInt2286, Static23.anInt816, Static109.anInt2592, Static23.anInt806, Static108.anInt2581, local46);
		Static44.method1487();
		Static30.aClass48_1.method1023();
		Static40.method583(arg0, arg3, arg1, arg2);
		Static4.method51(arg3, arg2);
		((Class68) Static100.anInterface3_1).method1571(Static116.anInt2713);
		Static66.method1070(arg1, arg2, arg0, arg3);
		Static108.anInt2581 = local112;
		Static98.anInt2286 = local44;
		Static23.anInt816 = local106;
		Static23.anInt806 = local108;
		Static109.anInt2592 = local110;
		if (Static24.aBoolean35 && Static116.method1878() == 0) {
			Static24.aBoolean35 = false;
		}
		if (Static24.aBoolean35) {
			Static34.method1649(arg3, arg2, arg1, arg0, 0);
			Static101.method1991(false, Static37.aClass60_378);
		}
		if (!Static24.aBoolean35 && !Static12.aBoolean107 && arg3 <= local155 && arg1 + arg3 > local155 && local228 >= arg2 && arg2 + arg0 > local228) {
			Static108.method1791(arg2, arg3, local228, local155);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method1078() {
		try {
			if (Static9.anInt112 == 1) {
				@Pc(10) int local10 = Static30.aClass4_Sub1_Sub1_1.method110();
				if (local10 > 0 && Static30.aClass4_Sub1_Sub1_1.method97()) {
					local10 -= Static72.anInt1827;
					if (local10 < 0) {
						local10 = 0;
					}
					Static30.aClass4_Sub1_Sub1_1.method121(local10);
					return;
				}
				Static30.aClass4_Sub1_Sub1_1.method122();
				Static30.aClass4_Sub1_Sub1_1.method103();
				if (Static82.aClass10_22 == null) {
					Static9.anInt112 = 0;
				} else {
					Static9.anInt112 = 2;
				}
				Static109.aClass4_Sub11_1 = null;
				Static27.aClass62_1 = null;
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static30.aClass4_Sub1_Sub1_1.method122();
			Static82.aClass10_22 = null;
			Static9.anInt112 = 0;
			Static109.aClass4_Sub11_1 = null;
			Static27.aClass62_1 = null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
	public static void method1079() {
		Static21.anInt737 = 0;
		Static9.anInt116 = 0;
		Static113.method812();
		Static102.method1701();
		Static50.method859();
		Static129.method681();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static21.anInt737; local21++) {
			local27 = Static3.anIntArray5[local21];
			if (Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local27].anInt1394 != Static118.anInt2741) {
				Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local27] = null;
			}
		}
		if (Static96.aClass4_Sub9_Sub1_2.anInt1312 != Static7.anInt79) {
			throw new RuntimeException("gpp1 pos:" + Static96.aClass4_Sub9_Sub1_2.anInt1312 + " psize:" + Static7.anInt79);
		}
		for (local27 = 0; local27 < Static125.anInt2830; local27++) {
			if (Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[Static118.anIntArray336[local27]] == null) {
				throw new RuntimeException("gpp2 pos:" + local27 + " size:" + Static125.anInt2830);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ia;)V")
	public static void method1080(@OriginalArg(1) Class4_Sub3_Sub1_Sub2 arg0) {
		arg0.anInt1389 = arg0.anInt1399;
		if (arg0.anInt1433 == 0) {
			arg0.anInt1387 = 0;
			return;
		}
		if (arg0.anInt1408 != -1 && arg0.anInt1411 == 0) {
			@Pc(31) Class4_Sub3_Sub10 local31 = Static7.method63(arg0.anInt1408);
			if (arg0.anInt1396 > 0 && local31.anInt1868 == 0) {
				arg0.anInt1387++;
				return;
			}
			if (arg0.anInt1396 <= 0 && local31.anInt1872 == 0) {
				arg0.anInt1387++;
				return;
			}
		}
		@Pc(66) int local66 = arg0.anInt1440;
		@Pc(69) int local69 = arg0.anInt1407;
		@Pc(84) int local84 = arg0.anInt1434 * 64 + arg0.anIntArray137[arg0.anInt1433 - 1] * 128;
		@Pc(99) int local99 = arg0.anIntArray135[arg0.anInt1433 - 1] * 128 + arg0.anInt1434 * 64;
		if (local84 - local66 > 256 || local84 - local66 < -256 || local99 - local69 > 256 || local99 - local69 < -256) {
			arg0.anInt1407 = local99;
			arg0.anInt1440 = local84;
			return;
		}
		if (local84 > local66) {
			if (local69 < local99) {
				arg0.anInt1414 = 1280;
			} else if (local69 > local99) {
				arg0.anInt1414 = 1792;
			} else {
				arg0.anInt1414 = 1536;
			}
		} else if (local84 >= local66) {
			if (local69 < local99) {
				arg0.anInt1414 = 1024;
			} else if (local69 > local99) {
				arg0.anInt1414 = 0;
			}
		} else if (local69 < local99) {
			arg0.anInt1414 = 768;
		} else if (local69 > local99) {
			arg0.anInt1414 = 256;
		} else {
			arg0.anInt1414 = 512;
		}
		@Pc(224) int local224 = arg0.anInt1429;
		@Pc(232) int local232 = arg0.anInt1414 - arg0.anInt1415 & 0x7FF;
		if (local232 > 1024) {
			local232 -= 2048;
		}
		if (local232 >= -256 && local232 <= 256) {
			local224 = arg0.anInt1410;
		} else if (local232 >= 256 && local232 < 768) {
			local224 = arg0.anInt1405;
		} else if (local232 >= -768 && local232 <= -256) {
			local224 = arg0.anInt1384;
		}
		@Pc(279) int local279 = 4;
		if (local224 == -1) {
			local224 = arg0.anInt1410;
		}
		arg0.anInt1389 = local224;
		@Pc(291) boolean local291 = true;
		if (arg0 instanceof Class4_Sub3_Sub1_Sub2_Sub2) {
			local291 = ((Class4_Sub3_Sub1_Sub2_Sub2) arg0).aClass4_Sub3_Sub13_1.aBoolean81;
		}
		if (local291) {
			if (arg0.anInt1415 != arg0.anInt1414 && arg0.anInt1438 == -1 && arg0.anInt1390 != 0) {
				local279 = 2;
			}
			if (arg0.anInt1433 > 2) {
				local279 = 6;
			}
			if (arg0.anInt1433 > 3) {
				local279 = 8;
			}
			if (arg0.anInt1387 > 0 && arg0.anInt1433 > 1) {
				arg0.anInt1387--;
				local279 = 8;
			}
		} else {
			if (arg0.anInt1433 > 1) {
				local279 = 6;
			}
			if (arg0.anInt1433 > 2) {
				local279 = 8;
			}
			if (arg0.anInt1387 > 0 && arg0.anInt1433 > 1) {
				local279 = 8;
				arg0.anInt1387--;
			}
		}
		if (arg0.aBooleanArray5[arg0.anInt1433 - 1]) {
			local279 <<= 0x1;
		}
		if (local69 < local99) {
			arg0.anInt1407 += local279;
			if (arg0.anInt1407 > local99) {
				arg0.anInt1407 = local99;
			}
		} else if (local99 < local69) {
			arg0.anInt1407 -= local279;
			if (local99 > arg0.anInt1407) {
				arg0.anInt1407 = local99;
			}
		}
		if (local66 < local84) {
			arg0.anInt1440 += local279;
			if (arg0.anInt1440 > local84) {
				arg0.anInt1440 = local84;
			}
		} else if (local66 > local84) {
			arg0.anInt1440 -= local279;
			if (arg0.anInt1440 < local84) {
				arg0.anInt1440 = local84;
			}
		}
		if (local279 >= 8 && arg0.anInt1410 == arg0.anInt1389 && arg0.anInt1406 != -1) {
			arg0.anInt1389 = arg0.anInt1406;
		}
		if (local84 == arg0.anInt1440 && arg0.anInt1407 == local99) {
			if (arg0.anInt1396 > 0) {
				arg0.anInt1396--;
			}
			arg0.anInt1433--;
		}
	}
}
