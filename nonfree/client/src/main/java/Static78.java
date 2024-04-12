import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!sa", name = "ub", descriptor = "I")
	public static int anInt2027;

	@OriginalMember(owner = "client!sa", name = "wb", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!sa", name = "Gb", descriptor = "I")
	public static int anInt2035;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V", line = 85)
	public static void method1382() {
		Class2_Sub2_Sub12_Sub5.aClass40_586 = null;
		Class2_Sub2_Sub12_Sub5.aClass40_591 = null;
		Class2_Sub2_Sub12_Sub5.aByteArray17 = null;
		anIntArrayArray20 = null;
		Class2_Sub2_Sub12_Sub5.aClass40_587 = null;
		Class2_Sub2_Sub12_Sub5.aClass40_592 = null;
		Class2_Sub2_Sub12_Sub5.aClass40_584 = null;
		Class2_Sub2_Sub12_Sub5.aClass40_588 = null;
		Class2_Sub2_Sub12_Sub5.aClass40_590 = null;
		Class2_Sub2_Sub12_Sub5.aClass40_589 = null;
		Class2_Sub2_Sub12_Sub5.aClass40_593 = null;
		Class2_Sub2_Sub12_Sub5.aClass40_585 = null;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)I", line = 107)
	public static int method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(29) int local29 = arg0;
		if (arg0 < 3 && (Class34.aByteArrayArrayArray7[1][local11][local7] & 0x2) == 2) {
			local29 = arg0 + 1;
		}
		@Pc(50) int local50 = arg1 & 0x7F;
		@Pc(54) int local54 = arg2 & 0x7F;
		@Pc(81) int local81 = (128 - local50) * Class57.anIntArrayArrayArray8[local29][local11][local7] + Class57.anIntArrayArrayArray8[local29][local11 + 1][local7] * local50 >> 7;
		@Pc(113) int local113 = Class57.anIntArrayArrayArray8[local29][local11][local7 + 1] * (128 - local50) + local50 * Class57.anIntArrayArrayArray8[local29][local11 + 1][local7 + 1] >> 7;
		return local54 * local113 + local81 * (128 - local54) >> 7;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[B)V", line = 144)
	public static void method1384(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg0);
		local10.anInt2546 = arg0.length - 2;
		Static28.anInt727 = local10.method1704();
		Static83.aByteArrayArray10 = new byte[Static28.anInt727][];
		Static61.anIntArray338 = new int[Static28.anInt727];
		Static89.anIntArray503 = new int[Static28.anInt727];
		Static18.anIntArray86 = new int[Static28.anInt727];
		Static75.anIntArray430 = new int[Static28.anInt727];
		local10.anInt2546 = arg0.length - Static28.anInt727 * 8 - 7;
		Static41.anInt1079 = local10.method1704();
		Static96.anInt2513 = local10.method1704();
		@Pc(64) int local64 = (local10.method1708() & 0xFF) + 1;
		for (@Pc(66) int local66 = 0; local66 < Static28.anInt727; local66++) {
			Static75.anIntArray430[local66] = local10.method1704();
		}
		for (@Pc(80) int local80 = 0; local80 < Static28.anInt727; local80++) {
			Static89.anIntArray503[local80] = local10.method1704();
		}
		for (@Pc(98) int local98 = 0; local98 < Static28.anInt727; local98++) {
			Static61.anIntArray338[local98] = local10.method1704();
		}
		for (@Pc(116) int local116 = 0; local116 < Static28.anInt727; local116++) {
			Static18.anIntArray86[local116] = local10.method1704();
		}
		local10.anInt2546 = arg0.length - (local64 - 1) * 3 - Static28.anInt727 * 8 - 7;
		Static19.anIntArray92 = new int[local64];
		for (@Pc(154) int local154 = 1; local154 < local64; local154++) {
			Static19.anIntArray92[local154] = local10.method1718();
			if (Static19.anIntArray92[local154] == 0) {
				Static19.anIntArray92[local154] = 1;
			}
		}
		local10.anInt2546 = 0;
		for (@Pc(179) int local179 = 0; local179 < Static28.anInt727; local179++) {
			@Pc(185) int local185 = Static61.anIntArray338[local179];
			@Pc(189) int local189 = Static18.anIntArray86[local179];
			@Pc(193) int local193 = local185 * local189;
			@Pc(196) byte[] local196 = new byte[local193];
			Static83.aByteArrayArray10[local179] = local196;
			@Pc(206) int local206 = local10.method1708();
			@Pc(213) int local213;
			if (local206 == 0) {
				for (local213 = 0; local213 < local193; local213++) {
					local196[local213] = local10.method1696();
				}
			} else if (local206 == 1) {
				for (local213 = 0; local213 < local185; local213++) {
					for (@Pc(236) int local236 = 0; local236 < local189; local236++) {
						local196[local185 * local236 + local213] = local10.method1696();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V", line = 284)
	public static void method1385() {
		if (Class2_Sub2_Sub16.anInt2473 == 0) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (Class52.anInt1973 != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Class2_Sub2_Sub13.aClass40Array30[local21] != null) {
				@Pc(31) int local31 = Class45.anIntArray469[local21];
				@Pc(35) Class40 local35 = Class2_Sub3_Sub1.aClass40Array40[local21];
				if (local35 != null && local35.method1168(Class2_Sub2_Sub10.aClass40_323)) {
					local35 = local35.method1185(5);
				}
				if (local35 != null && local35.method1168(Class45_Sub1.aClass40_622)) {
					local35 = local35.method1185(5);
				}
				if ((local31 == 3 || local31 == 7) && (local31 == 7 || Class63.anInt2515 == 0 || Class63.anInt2515 == 1 && Static36.method729(local35))) {
					@Pc(85) int local85 = 329 - local15 * 13;
					if (Class2_Sub5.anInt742 > 4 && local85 - 10 < Class2_Sub2_Sub15.anInt2394 + -4 && local85 + 3 >= Class2_Sub2_Sub15.anInt2394 + -4) {
						@Pc(129) int local129 = Static95.aClass2_Sub2_Sub2_Sub2_5.method568(Static72.method1334(new Class40[] { Class4.aClass40_18, local35, Class2_Sub2_Sub13.aClass40Array30[local21] })) + 25;
						if (local129 > 450) {
							local129 = 450;
						}
						if (local129 + 4 > Class2_Sub5.anInt742) {
							if (Class34.anInt1550 >= 1) {
								Static20.method402(Static72.method1334(new Class40[] { client.aClass40_111, local35 }), 2042, 0, 0, 0);
							}
							Static20.method402(Static72.method1334(new Class40[] { Class54.aClass40_604, local35 }), 2012, 0, 0, 0);
							Static20.method402(Static72.method1334(new Class40[] { Class12_Sub1.aClass40_535, local35 }), 2051, 0, 0, 0);
						}
					}
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
				if ((local31 == 5 || local31 == 6) && Class63.anInt2515 < 2) {
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V", line = 400)
	public static void method1386() {
		if (Class2_Sub2_Sub12_Sub1_Sub2.anInt2328 != 0 || Class2_Sub2_Sub12_Sub5.anInt2030 != 1) {
			return;
		}
		@Pc(17) int local17 = Class56.anInt2133 - 9;
		@Pc(23) int local23 = Class24.anInt2500 - 25 - 550;
		if (local23 < 0 || local17 < 0 || local23 >= 146 || local17 >= 151) {
			return;
		}
		local23 -= 73;
		local17 -= 75;
		@Pc(45) int local45 = Class38.anInt1669 + Class52.anInt1978 & 0x7FF;
		@Pc(49) int local49 = Class2_Sub2_Sub2_Sub1.anIntArray59[local45];
		@Pc(57) int local57 = (Class12_Sub1.anInt1857 + 256) * local49 >> 8;
		@Pc(61) int local61 = Class2_Sub2_Sub2_Sub1.anIntArray58[local45];
		@Pc(69) int local69 = local61 * (Class12_Sub1.anInt1857 + 256) >> 8;
		@Pc(79) int local79 = local23 * local69 + local17 * local57 >> 11;
		@Pc(90) int local90 = local69 * local17 - local57 * local23 >> 11;
		@Pc(98) int local98 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284 - local90 >> 7;
		@Pc(106) int local106 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275 + local79 >> 7;
		@Pc(126) boolean local126 = Static75.method1349(local98, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 1, true, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local106);
		if (!local126) {
			return;
		}
		Class47.aClass2_Sub3_Sub1_4.method1703(local23);
		Class47.aClass2_Sub3_Sub1_4.method1703(local17);
		Class47.aClass2_Sub3_Sub1_4.method1694(Class38.anInt1669);
		Class47.aClass2_Sub3_Sub1_4.method1703(57);
		Class47.aClass2_Sub3_Sub1_4.method1703(Class52.anInt1978);
		Class47.aClass2_Sub3_Sub1_4.method1703(Class12_Sub1.anInt1857);
		Class47.aClass2_Sub3_Sub1_4.method1703(89);
		Class47.aClass2_Sub3_Sub1_4.method1694(Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275);
		Class47.aClass2_Sub3_Sub1_4.method1694(Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284);
		Class47.aClass2_Sub3_Sub1_4.method1703(Class61.anInt2400);
		Class47.aClass2_Sub3_Sub1_4.method1703(63);
		return;
	}
}
