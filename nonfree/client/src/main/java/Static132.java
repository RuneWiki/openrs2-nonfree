import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	public static int anInt3971;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!jg;")
	public static Class1_Sub8 aClass1_Sub8_7 = new Class1_Sub8(8);

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1516 = Static169.method2903(" seconds)3");

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1515 = aClass23_1516;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Ljava/util/Random;")
	public static Random aRandom3 = new Random();

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[Lclient!qh;")
	public static Class69[] aClass69Array3 = new Class69[4];

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "[I")
	public static int[] anIntArray544 = new int[4000];

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray38 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1517 = Static169.method2903("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	public static void method2792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static4.anInt299 = 0;
		@Pc(173) int local173;
		for (@Pc(9) int local9 = -1; local9 < Static152.anInt3549 + Static86.anInt2307; local9++) {
			@Pc(24) Class1_Sub1_Sub1_Sub1 local24;
			if (local9 == -1) {
				local24 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103;
			} else if (local9 < Static152.anInt3549) {
				local24 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static112.anIntArray382[local9]];
			} else {
				local24 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static141.anIntArray476[local9 - Static152.anInt3549]];
			}
			if (local24 != null && local24.method1222()) {
				@Pc(56) Class1_Sub1_Sub9 local56;
				if (local24 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
					local56 = ((Class1_Sub1_Sub1_Sub1_Sub2) local24).aClass1_Sub1_Sub9_1;
					if (local56.anIntArray174 != null) {
						local56 = local56.method986();
					}
					if (local56 == null) {
						continue;
					}
				}
				if (Static152.anInt3549 <= local9) {
					local56 = ((Class1_Sub1_Sub1_Sub1_Sub2) local24).aClass1_Sub1_Sub9_1;
					if (local56.anIntArray174 != null) {
						local56 = local56.method986();
					}
					if (local56.anInt1531 >= 0 && Static23.aClass1_Sub1_Sub12_Sub1Array2.length > local56.anInt1531) {
						Static51.method942(local24, local24.method1223() + 15);
						if (Static176.anInt4187 > -1) {
							Static23.aClass1_Sub1_Sub12_Sub1Array2[local56.anInt1531].method1944(Static176.anInt4187 + arg3 - 12, Static16.anInt497 + arg2 - 30);
						}
					}
					if (Static7.anInt328 == 1 && Static141.anIntArray476[local9 - Static152.anInt3549] == Static153.anInt3783 && Static26.anInt845 % 20 < 10) {
						Static51.method942(local24, local24.method1223() + 15);
						if (Static176.anInt4187 > -1) {
							Static122.aClass1_Sub1_Sub12_Sub1Array9[0].method1944(Static176.anInt4187 + arg3 - 12, Static16.anInt497 + arg2 - 28);
						}
					}
				} else {
					local173 = 30;
					@Pc(176) Class1_Sub1_Sub1_Sub1_Sub1 local176 = (Class1_Sub1_Sub1_Sub1_Sub1) local24;
					if (local176.anInt209 != -1 || local176.anInt217 != -1) {
						Static51.method942(local24, local24.method1223() + 15);
						if (Static176.anInt4187 > -1) {
							if (local176.anInt209 != -1) {
								Static182.aClass1_Sub1_Sub12_Sub1Array11[local176.anInt209].method1944(arg3 + Static176.anInt4187 - 12, Static16.anInt497 + arg2 - 30);
								local173 += 25;
							}
							if (local176.anInt217 != -1) {
								Static23.aClass1_Sub1_Sub12_Sub1Array2[local176.anInt217].method1944(Static176.anInt4187 + arg3 - 12, Static16.anInt497 + arg2 + -local173);
								local173 += 25;
							}
						}
					}
					if (local9 >= 0 && Static7.anInt328 == 10 && Static147.anInt3708 == Static112.anIntArray382[local9]) {
						Static51.method942(local24, local24.method1223() + 15);
						if (Static176.anInt4187 > -1) {
							Static122.aClass1_Sub1_Sub12_Sub1Array9[1].method1944(Static176.anInt4187 + arg3 - 12, arg2 - (-Static16.anInt497 + local173));
						}
					}
				}
				if (local24.aClass23_676 != null && (Static152.anInt3549 <= local9 || Static1.anInt220 == 0 || Static1.anInt220 == 3 || Static1.anInt220 == 1 && Static118.method2077(((Class1_Sub1_Sub1_Sub1_Sub1) local24).aClass23_68))) {
					Static51.method942(local24, local24.method1223());
					if (Static176.anInt4187 > -1 && Static104.anInt2661 > Static4.anInt299) {
						Static104.anIntArray358[Static4.anInt299] = Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3056(local24.aClass23_676) / 2;
						Static104.anIntArray356[Static4.anInt299] = Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.anInt4238;
						Static104.anIntArray355[Static4.anInt299] = Static176.anInt4187;
						Static104.anIntArray351[Static4.anInt299] = Static16.anInt497;
						Static104.anIntArray350[Static4.anInt299] = local24.anInt1856;
						Static104.anIntArray353[Static4.anInt299] = local24.anInt1816;
						Static104.anIntArray357[Static4.anInt299] = local24.anInt1844;
						Static104.aClass23Array13[Static4.anInt299] = local24.aClass23_676;
						Static4.anInt299++;
					}
				}
				if (Static26.anInt845 < local24.anInt1810) {
					Static51.method942(local24, local24.method1223() + 15);
					if (Static176.anInt4187 > -1) {
						local173 = local24.anInt1852 * 30 / local24.anInt1831;
						if (local173 > 30) {
							local173 = 30;
						}
						Static150.method3024(Static176.anInt4187 + arg3 - 15, Static16.anInt497 + -3 + arg2, local173, 5, 65280);
						Static150.method3024(local173 + arg3 + Static176.anInt4187 - 15, arg2 + -3 - -Static16.anInt497, 30 - local173, 5, 16711680);
					}
				}
				for (local173 = 0; local173 < 4; local173++) {
					if (local24.anIntArray246[local173] > Static26.anInt845) {
						Static51.method942(local24, local24.method1223() / 2);
						if (Static176.anInt4187 > -1) {
							if (local173 == 1) {
								Static16.anInt497 -= 20;
							}
							if (local173 == 2) {
								Static176.anInt4187 -= 15;
								Static16.anInt497 -= 10;
							}
							if (local173 == 3) {
								Static16.anInt497 -= 10;
								Static176.anInt4187 += 15;
							}
							Static155.aClass1_Sub1_Sub12_Sub1Array8[local24.anIntArray247[local173]].method1944(Static176.anInt4187 + arg3 - 12, arg2 + Static16.anInt497 + -12);
							Static81.aClass1_Sub1_Sub12_Sub3_Sub1_3.method3039(Static27.method498(local24.anIntArray249[local173]), Static176.anInt4187 + arg3 - 1, arg2 + Static16.anInt497 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(560) int local560 = 0; local560 < Static4.anInt299; local560++) {
			@Pc(566) int local566 = Static104.anIntArray351[local560];
			local173 = Static104.anIntArray355[local560];
			@Pc(574) int local574 = Static104.anIntArray358[local560];
			@Pc(578) int local578 = Static104.anIntArray356[local560];
			@Pc(580) boolean local580 = true;
			while (local580) {
				local580 = false;
				for (@Pc(586) int local586 = 0; local586 < local560; local586++) {
					if (Static104.anIntArray351[local586] - Static104.anIntArray356[local586] < local566 + 2 && local566 - local578 < Static104.anIntArray351[local586] - -2 && Static104.anIntArray358[local586] + Static104.anIntArray355[local586] > -local574 + local173 && local173 + local574 > -Static104.anIntArray358[local586] + Static104.anIntArray355[local586] && local566 > Static104.anIntArray351[local586] - Static104.anIntArray356[local586]) {
						local580 = true;
						local566 = Static104.anIntArray351[local586] - Static104.anIntArray356[local586];
					}
				}
			}
			Static176.anInt4187 = Static104.anIntArray355[local560];
			Static16.anInt497 = Static104.anIntArray351[local560] = local566;
			@Pc(689) Class23 local689 = Static104.aClass23Array13[local560];
			if (Static148.anInt3714 == 0) {
				@Pc(707) int local707 = 16776960;
				if (Static104.anIntArray350[local560] < 6) {
					local707 = Static104.anIntArray352[Static104.anIntArray350[local560]];
				}
				if (Static104.anIntArray350[local560] == 6) {
					local707 = Static104.anInt2667 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static104.anIntArray350[local560] == 7) {
					local707 = Static104.anInt2667 % 20 < 10 ? 255 : 65535;
				}
				if (Static104.anIntArray350[local560] == 8) {
					local707 = Static104.anInt2667 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(776) int local776;
				if (Static104.anIntArray350[local560] == 9) {
					local776 = 150 - Static104.anIntArray357[local560];
					if (local776 < 50) {
						local707 = local776 * 1280 + 16711680;
					} else if (local776 < 100) {
						local707 = 16776960 - (local776 - 50) * 327680;
					} else if (local776 < 150) {
						local707 = (local776 - 100) * 5 + 65280;
					}
				}
				if (Static104.anIntArray350[local560] == 10) {
					local776 = 150 - Static104.anIntArray357[local560];
					if (local776 < 50) {
						local707 = local776 * 5 + 16711680;
					} else if (local776 < 100) {
						local707 = 33095935 - local776 * 327680;
					} else if (local776 < 150) {
						local707 = (local776 - 100) * 327680 + 255 + 500 - local776 * 5;
					}
				}
				if (Static104.anIntArray350[local560] == 11) {
					local776 = 150 - Static104.anIntArray357[local560];
					if (local776 < 50) {
						local707 = 16777215 - local776 * 327685;
					} else if (local776 < 100) {
						local707 = local776 * 327685 + 65280 - 16384250;
					} else if (local776 < 150) {
						local707 = 16777215 - (local776 - 100) * 327680;
					}
				}
				if (Static104.anIntArray353[local560] == 0) {
					Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3039(local689, Static176.anInt4187 + arg3, Static16.anInt497 + arg2, local707, 0);
				}
				if (Static104.anIntArray353[local560] == 1) {
					Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3064(local689, Static176.anInt4187 + arg3, Static16.anInt497 + arg2, local707, Static104.anInt2667);
				}
				if (Static104.anIntArray353[local560] == 2) {
					Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3035(local689, arg3 + Static176.anInt4187, arg2 - -Static16.anInt497, local707, Static104.anInt2667);
				}
				if (Static104.anIntArray353[local560] == 3) {
					Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3037(local689, Static176.anInt4187 + arg3, Static16.anInt497 + arg2, local707, Static104.anInt2667, 150 - Static104.anIntArray357[local560]);
				}
				if (Static104.anIntArray353[local560] == 4) {
					local776 = (150 - Static104.anIntArray357[local560]) * (Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3056(local689) + 100) / 150;
					Static150.method3017(arg3 + Static176.anInt4187 - 50, arg2, arg3 + Static176.anInt4187 + 50, arg2 - -arg0);
					Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3058(local689, arg3 + Static176.anInt4187 + 50 - local776, Static16.anInt497 + arg2, local707, 0);
					Static150.method3022(arg3, arg2, arg1 + arg3, arg0 + arg2);
				}
				if (Static104.anIntArray353[local560] == 5) {
					local776 = 150 - Static104.anIntArray357[local560];
					Static150.method3017(arg3, arg2 + Static16.anInt497 - Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.anInt4238 - 1, arg1 + arg3, arg2 + Static16.anInt497 + 5);
					@Pc(1100) int local1100 = 0;
					if (local776 < 25) {
						local1100 = local776 - 25;
					} else if (local776 > 125) {
						local1100 = local776 - 125;
					}
					Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3039(local689, Static176.anInt4187 + arg3, local1100 + (arg2 - -Static16.anInt497), local707, 0);
					Static150.method3022(arg3, arg2, arg1 + arg3, arg2 - -arg0);
				}
			} else {
				Static107.aClass1_Sub1_Sub12_Sub3_Sub1_6.method3039(local689, arg3 + Static176.anInt4187, Static16.anInt497 + arg2, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method2793() {
		anIntArrayArray38 = null;
		anIntArray544 = null;
		aClass69Array3 = null;
		aClass23_1516 = null;
		aClass1_Sub8_7 = null;
		aRandom3 = null;
		aClass23_1515 = null;
		aClass23_1517 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!ed;)I")
	public static int method2794(@OriginalArg(1) Class23 arg0) {
		if (Static37.anInt994 == 1) {
			return 7;
		} else if (arg0.method634(Static78.aClass23_786)) {
			return 1;
		} else if (arg0.method634(Static106.aClass23_1055)) {
			return 1;
		} else if (arg0.method634(Static43.aClass23_445)) {
			return 2;
		} else if (arg0.method634(Static125.aClass23_1217)) {
			return 2;
		} else if (arg0.method634(Static142.aClass23_1362)) {
			return 3;
		} else if (arg0.method634(Static4.aClass23_107)) {
			return 4;
		} else if (arg0.method634(Static26.aClass23_290)) {
			return 4;
		} else if (arg0.method634(Static14.aClass23_178)) {
			return 5;
		} else if (arg0.method634(Static7.aClass23_112)) {
			return 6;
		} else {
			return 0;
		}
	}
}
