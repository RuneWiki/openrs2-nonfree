import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "[I")
	public static int[] anIntArray362;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1199 = Static81.method1507("World");

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1200 = Static81.method1507("(U5");

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1201 = aClass24_1199;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1202 = aClass24_1199;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1203 = Static81.method1507("");

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(BII)I")
	public static int method3220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static133.method2282(arg1 + 45365, arg0 + 91923, 4) + (Static133.method2282(arg1 + 10294, arg0 + 37821, 2) + -128 >> 1) + (Static133.method2282(arg1, arg0, 1) + -128 >> 2) - 128;
		local43 = (int) ((double) local43 * 0.3D) + 35;
		if (local43 < 10) {
			local43 = 10;
		} else if (local43 > 60) {
			local43 = 60;
		}
		return local43;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ld;I)V")
	public static void method3222(@OriginalArg(0) Class5_Sub2 arg0) {
		if (arg0.anInt2454 == 0) {
			return;
		}
		@Pc(43) int local43;
		@Pc(50) int local50;
		if (arg0.anInt2500 != -1 && arg0.anInt2500 < 32768) {
			@Pc(34) Class5_Sub2_Sub2 local34 = Static148.aClass5_Sub2_Sub2Array1[arg0.anInt2500];
			if (local34 != null) {
				local43 = arg0.anInt2501 - local34.anInt2501;
				local50 = arg0.anInt2448 - local34.anInt2448;
				if (local43 != 0 || local50 != 0) {
					arg0.anInt2463 = (int) (Math.atan2((double) local43, (double) local50) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(78) int local78;
		if (arg0.anInt2500 >= 32768) {
			local78 = arg0.anInt2500 - 32768;
			if (local78 == Static111.anInt2534) {
				local78 = 2047;
			}
			@Pc(91) Class5_Sub2_Sub1 local91 = Static110.aClass5_Sub2_Sub1Array1[local78];
			if (local91 != null) {
				local50 = arg0.anInt2501 - local91.anInt2501;
				@Pc(106) int local106 = arg0.anInt2448 - local91.anInt2448;
				if (local50 != 0 || local106 != 0) {
					arg0.anInt2463 = (int) (Math.atan2((double) local50, (double) local106) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2462 != 0 || arg0.anInt2487 != 0) && (arg0.anInt2447 == 0 || arg0.anInt2502 > 0)) {
			local43 = arg0.anInt2448 + (arg0.anInt2480 - 1) * 64 - (-Static127.anInt2789 + arg0.anInt2487 + -Static127.anInt2789) * 64;
			local78 = arg0.anInt2480 * 64 + arg0.anInt2501 - (arg0.anInt2462 + (-Static196.anInt4343 - Static196.anInt4343)) * 64 - 64;
			if (local78 != 0 || local43 != 0) {
				arg0.anInt2463 = (int) (Math.atan2((double) local78, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.anInt2487 = 0;
			arg0.anInt2462 = 0;
		}
		local78 = arg0.anInt2463 - arg0.anInt2474 & 0x7FF;
		if (local78 == 0) {
			arg0.anInt2453 = 0;
			return;
		}
		arg0.anInt2453++;
		@Pc(240) boolean local240;
		if (local78 > 1024) {
			arg0.anInt2474 -= arg0.anInt2454;
			local240 = true;
			if (arg0.anInt2454 > local78 || 2048 - arg0.anInt2454 < local78) {
				arg0.anInt2474 = arg0.anInt2463;
				local240 = false;
			}
			if (arg0.anInt2449 == arg0.anInt2504 && (arg0.anInt2453 > 25 || local240)) {
				if (arg0.anInt2499 == -1) {
					arg0.anInt2504 = arg0.anInt2450;
				} else {
					arg0.anInt2504 = arg0.anInt2499;
				}
			}
		} else {
			arg0.anInt2474 += arg0.anInt2454;
			local240 = true;
			if (local78 < arg0.anInt2454 || local78 > 2048 - arg0.anInt2454) {
				arg0.anInt2474 = arg0.anInt2463;
				local240 = false;
			}
			if (arg0.anInt2504 == arg0.anInt2449 && (arg0.anInt2453 > 25 || local240)) {
				if (arg0.anInt2497 == -1) {
					arg0.anInt2504 = arg0.anInt2450;
				} else {
					arg0.anInt2504 = arg0.anInt2497;
				}
			}
		}
		arg0.anInt2474 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBIII)V")
	public static void method3223(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static13.anInt308 && arg1 <= Static52.anInt1338) {
			@Pc(15) int local15 = Static177.method3022(Static63.anInt1608, arg3, Static63.anInt1595);
			@Pc(21) int local21 = Static177.method3022(Static63.anInt1608, arg2, Static63.anInt1595);
			Static110.method1907(arg1, local21, local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method3224() {
		Static24.anInt663 = 0;
		Static160.anInt4675 = 0;
		Static197.method3331();
		Static53.method1054();
		Static37.method701();
		Static119.method2023();
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static160.anInt4675; local27++) {
			local33 = Static57.anIntArray125[local27];
			if (Static110.aClass5_Sub2_Sub1Array1[local33].anInt2489 != Static42.anInt1100) {
				Static110.aClass5_Sub2_Sub1Array1[local33] = null;
			}
		}
		if (Static192.aClass1_Sub7_Sub1_31.anInt3592 != Static80.anInt1916) {
			throw new RuntimeException("gpp1 pos:" + Static192.aClass1_Sub7_Sub1_31.anInt3592 + " psize:" + Static80.anInt1916);
		}
		for (local33 = 0; local33 < Static82.anInt1956; local33++) {
			if (Static110.aClass5_Sub2_Sub1Array1[Static41.anIntArray115[local33]] == null) {
				throw new RuntimeException("gpp2 pos:" + local33 + " size:" + Static82.anInt1956);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public static void method3225() {
		if (!Static53.aBoolean73) {
			Static98.aShortArray28[0] = 1003;
			Static156.anInt3437 = 1;
			Static27.aClass24Array4[0] = Static95.aClass24_649;
			Static66.aClass24Array11[0] = Static85.aClass24_1000;
		}
		if (Static177.anInt3924 != -1) {
			Static1.method49(Static177.anInt3924);
		}
		for (@Pc(32) int local32 = 0; local32 < Static26.anInt679; local32++) {
			if (Static62.aBooleanArray7[local32]) {
				Static163.aBooleanArray17[local32] = true;
			}
			Static185.aBooleanArray18[local32] = Static62.aBooleanArray7[local32];
			Static62.aBooleanArray7[local32] = false;
		}
		Static121.anInt2692 = -1;
		Static142.anInt3161 = Static42.anInt1100;
		Static108.anInt2435 = -1;
		Static35.aClass98_16 = null;
		if (Static177.anInt3924 != -1) {
			Static26.anInt679 = 0;
			Static28.method550(Static147.anInt3283, Static177.anInt3924, 0, Static116.anInt2589, 0, 0, -1, 0);
		}
		Static90.method3481();
		Static32.method629();
		if (Static53.aBoolean73) {
			Static198.method3352();
		} else if (Static121.anInt2692 != -1) {
			method3226(Static108.anInt2435, Static121.anInt2692);
		}
		if (Static93.anInt2158 == 3) {
			for (@Pc(106) int local106 = 0; local106 < Static26.anInt679; local106++) {
				if (Static185.aBooleanArray18[local106]) {
					Static90.method3488(Static150.anIntArray283[local106], Static145.anIntArray274[local106], Static114.anIntArray203[local106], Static138.anIntArray253[local106], 16711935, 128);
				} else if (Static163.aBooleanArray17[local106]) {
					Static90.method3488(Static150.anIntArray283[local106], Static145.anIntArray274[local106], Static114.anIntArray203[local106], Static138.anIntArray253[local106], 16711680, 128);
				}
			}
		}
		Static202.method3415(Static92.anInt2138, Static170.anInt3799, Static87.aClass5_Sub2_Sub1_1.anInt2501, Static87.aClass5_Sub2_Sub1_1.anInt2448);
		Static92.anInt2138 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)V")
	private static void method3226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static156.anInt3437 < 2 && Static36.anInt973 == 0 && !Static178.aBoolean185) {
			return;
		}
		@Pc(42) Class24 local42;
		if (Static36.anInt973 == 1 && Static156.anInt3437 < 2) {
			local42 = Static63.method1281(new Class24[] { Static163.aClass24_1053, Static123.aClass24_812, Static129.aClass24_858, Static20.aClass24_158 });
		} else if (Static178.aBoolean185 && Static156.anInt3437 < 2) {
			local42 = Static63.method1281(new Class24[] { Static102.aClass24_681, Static123.aClass24_812, Static177.aClass24_1140, Static20.aClass24_158 });
		} else {
			local42 = Static123.method2077(Static156.anInt3437 - 1);
		}
		if (Static156.anInt3437 > 2) {
			local42 = Static63.method1281(new Class24[] { local42, Static55.aClass24_379, Static175.method3020(Static156.anInt3437 - 2), Static17.aClass24_135 });
		}
		@Pc(132) int local132 = Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1262(local42, arg1 + 4, arg0 + 15, Static91.aRandom1, Static96.anInt2204);
		Static39.method726(15, arg0, arg1 + 4, Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1269(local42) + local132);
	}
}
