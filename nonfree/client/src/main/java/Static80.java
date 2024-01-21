import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!i", name = "X", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "I")
	public static int anInt1910 = 0;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "Lclient!l;")
	public static final Class57 aClass57_19 = new Class57(4096);

	@OriginalMember(owner = "client!i", name = "U", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_579 = Static81.method1507("button near the top of that page)3");

	@OriginalMember(owner = "client!i", name = "S", descriptor = "Lclient!dj;")
	public static Class24 aClass24_578 = aClass24_579;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	public static int anInt1916 = 0;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_580 = Static81.method1507("Lade Sprites )2 ");

	@OriginalMember(owner = "client!i", name = "W", descriptor = "I")
	public static int anInt1917 = 99;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method1482(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static15.aClass37_1);
		arg0.removeFocusListener(Static15.aClass37_1);
		Static100.anInt2251 = -1;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
	public static void method1483() {
		Static121.aClass87_18 = new Class87();
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
	public static void method1484() {
		@Pc(8) int[] local8 = new int[Static148.anInt3297];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static148.anInt3297; local12++) {
			@Pc(18) Class1_Sub2_Sub23 local18 = Static168.method2886(local12);
			if (local18.anInt4197 >= 0 || local18.anInt4215 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static210.anIntArray411 = new int[local10];
		for (@Pc(53) int local53 = 0; local53 < local10; local53++) {
			Static210.anIntArray411[local53] = local8[local53];
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method1485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static96.anInt2207 = 0;
		@Pc(303) int local303;
		@Pc(221) int local221;
		@Pc(140) int local140;
		for (@Pc(14) int local14 = -1; local14 < Static138.anInt3107 + Static82.anInt1956; local14++) {
			@Pc(21) Class5_Sub2 local21;
			if (local14 == -1) {
				local21 = Static87.aClass5_Sub2_Sub1_1;
			} else if (Static82.anInt1956 <= local14) {
				local21 = Static148.aClass5_Sub2_Sub2Array1[Static138.anIntArray254[local14 - Static82.anInt1956]];
			} else {
				local21 = Static110.aClass5_Sub2_Sub1Array1[Static41.anIntArray115[local14]];
			}
			if (local21 != null && local21.method1894()) {
				@Pc(61) Class1_Sub2_Sub21 local61;
				if (local21 instanceof Class5_Sub2_Sub2) {
					local61 = ((Class5_Sub2_Sub2) local21).aClass1_Sub2_Sub21_1;
					if (local61.anIntArray337 != null) {
						local61 = local61.method3046();
					}
					if (local61 == null) {
						continue;
					}
				}
				if (Static82.anInt1956 <= local14) {
					local61 = ((Class5_Sub2_Sub2) local21).aClass1_Sub2_Sub21_1;
					if (local61.anIntArray337 != null) {
						local61 = local61.method3046();
					}
					if (local61.anInt3959 >= 0 && local61.anInt3959 < Static119.aClass1_Sub2_Sub8_Sub3Array13.length) {
						Static135.method2297(arg3 >> 1, local21, local21.method1893() + 15, arg2 >> 1);
						if (Static107.anInt2427 > -1) {
							Static119.aClass1_Sub2_Sub8_Sub3Array13[local61.anInt3959].method2347(Static107.anInt2427 + arg0 - 12, arg1 - -Static76.anInt1816 + -30);
						}
					}
					@Pc(138) Class48[] local138 = Static56.aClass48Array1;
					for (local140 = 0; local140 < local138.length; local140++) {
						@Pc(146) Class48 local146 = local138[local140];
						if (local146 != null && local146.anInt2070 == 1 && local146.anInt2072 == Static138.anIntArray254[local14 - Static82.anInt1956] && Static42.anInt1100 % 20 < 10) {
							Static135.method2297(arg3 >> 1, local21, local21.method1893() + 15, arg2 >> 1);
							if (Static107.anInt2427 > -1) {
								Static135.aClass1_Sub2_Sub8_Sub3Array16[local146.anInt2062].method2347(arg0 + Static107.anInt2427 - 12, arg1 + -28 - -Static76.anInt1816);
							}
						}
					}
				} else {
					local221 = 30;
					@Pc(224) Class5_Sub2_Sub1 local224 = (Class5_Sub2_Sub1) local21;
					if (local224.anInt626 != -1 || local224.anInt630 != -1) {
						Static135.method2297(arg3 >> 1, local21, local21.method1893() + 15, arg2 >> 1);
						if (Static107.anInt2427 > -1) {
							if (local224.anInt626 != -1) {
								Static186.aClass1_Sub2_Sub8_Sub3Array8[local224.anInt626].method2347(arg0 + Static107.anInt2427 - 12, arg1 - (-Static76.anInt1816 + 30));
								local221 += 25;
							}
							if (local224.anInt630 != -1) {
								Static119.aClass1_Sub2_Sub8_Sub3Array13[local224.anInt630].method2347(arg0 + Static107.anInt2427 - 12, Static76.anInt1816 + arg1 + -local221);
								local221 += 25;
							}
						}
					}
					if (local14 >= 0) {
						local303 = 0;
						@Pc(305) Class48[] local305 = Static56.aClass48Array1;
						while (local303 < local305.length) {
							@Pc(311) Class48 local311 = local305[local303];
							if (local311 != null && local311.anInt2070 == 10 && Static41.anIntArray115[local14] == local311.anInt2072) {
								Static135.method2297(arg3 >> 1, local21, local21.method1893() + 15, arg2 >> 1);
								if (Static107.anInt2427 > -1) {
									Static135.aClass1_Sub2_Sub8_Sub3Array16[local311.anInt2062].method2347(arg0 + Static107.anInt2427 - 12, -local221 + (arg1 - -Static76.anInt1816));
								}
							}
							local303++;
						}
					}
				}
				if (local21.aClass24_736 != null && (Static82.anInt1956 <= local14 || Static98.anInt2224 == 0 || Static98.anInt2224 == 3 || Static98.anInt2224 == 1 && Static129.method2158(((Class5_Sub2_Sub1) local21).aClass24_173))) {
					Static135.method2297(arg3 >> 1, local21, local21.method1893(), arg2 >> 1);
					if (Static107.anInt2427 > -1 && Static96.anInt2207 < Static191.anInt4294) {
						Static191.anIntArray369[Static96.anInt2207] = Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1269(local21.aClass24_736) / 2;
						Static191.anIntArray372[Static96.anInt2207] = Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.anInt1588;
						Static191.anIntArray374[Static96.anInt2207] = Static107.anInt2427;
						Static191.anIntArray371[Static96.anInt2207] = Static76.anInt1816;
						Static191.anIntArray368[Static96.anInt2207] = local21.anInt2479;
						Static191.anIntArray373[Static96.anInt2207] = local21.anInt2477;
						Static191.anIntArray370[Static96.anInt2207] = local21.anInt2483;
						Static191.aClass24Array26[Static96.anInt2207] = local21.aClass24_736;
						Static96.anInt2207++;
					}
				}
				if (local21.anInt2475 > Static42.anInt1100) {
					Static135.method2297(arg3 >> 1, local21, local21.method1893() + 15, arg2 >> 1);
					if (Static107.anInt2427 > -1) {
						Static90.method3482(arg0 + Static107.anInt2427 - 15, arg1 + -3 - -Static76.anInt1816, local21.anInt2457, 5, 65280);
						Static90.method3482(local21.anInt2457 + Static107.anInt2427 + arg0 - 15, Static76.anInt1816 + -3 + arg1, 30 - local21.anInt2457, 5, 16711680);
					}
				}
				for (local221 = 0; local221 < 4; local221++) {
					if (local21.anIntArray198[local221] > Static42.anInt1100) {
						Static135.method2297(arg3 >> 1, local21, local21.method1893() / 2, arg2 >> 1);
						if (Static107.anInt2427 > -1) {
							if (local221 == 1) {
								Static76.anInt1816 -= 20;
							}
							if (local221 == 2) {
								Static107.anInt2427 -= 15;
								Static76.anInt1816 -= 10;
							}
							if (local221 == 3) {
								Static107.anInt2427 += 15;
								Static76.anInt1816 -= 10;
							}
							Static48.aClass1_Sub2_Sub8_Sub3Array9[local21.anIntArray200[local221]].method2347(Static107.anInt2427 + arg0 - 12, arg1 - -Static76.anInt1816 + -12);
							Static18.aClass1_Sub2_Sub8_Sub1_Sub1_7.method1246(Static175.method3020(local21.anIntArray197[local221]), Static107.anInt2427 + arg0 - 1, arg1 - -Static76.anInt1816 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(642) int local642 = 0; local642 < Static96.anInt2207; local642++) {
			local221 = Static191.anIntArray374[local642];
			local303 = Static191.anIntArray372[local642];
			@Pc(654) boolean local654 = true;
			@Pc(658) int local658 = Static191.anIntArray371[local642];
			local140 = Static191.anIntArray369[local642];
			while (local654) {
				local654 = false;
				for (@Pc(668) int local668 = 0; local668 < local642; local668++) {
					if (Static191.anIntArray371[local668] - Static191.anIntArray372[local668] < local658 + 2 && Static191.anIntArray371[local668] + 2 > local658 + -local303 && local221 - local140 < Static191.anIntArray374[local668] + Static191.anIntArray369[local668] && local221 + local140 > -Static191.anIntArray369[local668] + Static191.anIntArray374[local668] && Static191.anIntArray371[local668] - Static191.anIntArray372[local668] < local658) {
						local658 = Static191.anIntArray371[local668] - Static191.anIntArray372[local668];
						local654 = true;
					}
				}
			}
			Static107.anInt2427 = Static191.anIntArray374[local642];
			Static76.anInt1816 = Static191.anIntArray371[local642] = local658;
			@Pc(778) Class24 local778 = Static191.aClass24Array26[local642];
			if (Static10.anInt1517 == 0) {
				@Pc(785) int local785 = 16776960;
				if (Static191.anIntArray368[local642] < 6) {
					local785 = Static173.anIntArray332[Static191.anIntArray368[local642]];
				}
				if (Static191.anIntArray368[local642] == 6) {
					local785 = Static39.anInt1032 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static191.anIntArray368[local642] == 7) {
					local785 = Static39.anInt1032 % 20 >= 10 ? 65535 : 255;
				}
				if (Static191.anIntArray368[local642] == 8) {
					local785 = Static39.anInt1032 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(858) int local858;
				if (Static191.anIntArray368[local642] == 9) {
					local858 = 150 - Static191.anIntArray370[local642];
					if (local858 < 50) {
						local785 = local858 * 1280 + 16711680;
					} else if (local858 < 100) {
						local785 = 16776960 + 16384000 - local858 * 327680;
					} else if (local858 < 150) {
						local785 = local858 * 5 + 65280 - 500;
					}
				}
				if (Static191.anIntArray368[local642] == 10) {
					local858 = 150 - Static191.anIntArray370[local642];
					if (local858 < 50) {
						local785 = local858 * 5 + 16711680;
					} else if (local858 < 100) {
						local785 = 33095935 - local858 * 327680;
					} else if (local858 < 150) {
						local785 = local858 * 327680 + 255 - (local858 - 100) * 5 - 32768000;
					}
				}
				if (Static191.anIntArray368[local642] == 11) {
					local858 = 150 - Static191.anIntArray370[local642];
					if (local858 < 50) {
						local785 = 16777215 - local858 * 327685;
					} else if (local858 < 100) {
						local785 = (local858 - 50) * 327685 + 65280;
					} else if (local858 < 150) {
						local785 = 32768000 + 16777215 - local858 * 327680;
					}
				}
				if (Static191.anIntArray373[local642] == 0) {
					Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1246(local778, arg0 + Static107.anInt2427, arg1 - -Static76.anInt1816, local785, 0);
				}
				if (Static191.anIntArray373[local642] == 1) {
					Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1270(local778, Static107.anInt2427 + arg0, arg1 - -Static76.anInt1816, local785, Static39.anInt1032);
				}
				if (Static191.anIntArray373[local642] == 2) {
					Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1258(local778, Static107.anInt2427 + arg0, arg1 + Static76.anInt1816, local785, Static39.anInt1032);
				}
				if (Static191.anIntArray373[local642] == 3) {
					Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1267(local778, arg0 + Static107.anInt2427, arg1 + Static76.anInt1816, local785, Static39.anInt1032, 150 - Static191.anIntArray370[local642]);
				}
				if (Static191.anIntArray373[local642] == 4) {
					local858 = (150 - Static191.anIntArray370[local642]) * (Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1269(local778) + 100) / 150;
					Static90.method3492(arg0 + Static107.anInt2427 - 50, arg1, arg0 + Static107.anInt2427 + 50, arg1 + arg3);
					Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1273(local778, arg0 + Static107.anInt2427 + 50 - local858, Static76.anInt1816 + arg1, local785, 0);
					Static90.method3501(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
				if (Static191.anIntArray373[local642] == 5) {
					local858 = 150 - Static191.anIntArray370[local642];
					Static90.method3492(arg0, Static76.anInt1816 + arg1 - Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.anInt1588 - 1, arg0 + arg2, arg1 + Static76.anInt1816 + 5);
					@Pc(1182) int local1182 = 0;
					if (local858 < 25) {
						local1182 = local858 - 25;
					} else if (local858 > 125) {
						local1182 = local858 - 125;
					}
					Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1246(local778, arg0 + Static107.anInt2427, Static76.anInt1816 + (arg1 - -local1182), local785, 0);
					Static90.method3501(arg0, arg1, arg2 + arg0, arg3 + arg1);
				}
			} else {
				Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1246(local778, arg0 + Static107.anInt2427, arg1 + Static76.anInt1816, 16776960, 0);
			}
		}
	}
}
