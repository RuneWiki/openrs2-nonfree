import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt3886;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray22;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Lclient!eh;")
	public static Class27 aClass27_104;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
	public static int anInt3891;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "[Lclient!sc;")
	public static Class89[] aClass89Array11 = new Class89[500];

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public static int anInt3884 = -1;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1321 = Static200.method3116("Please enter your username)3");

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1322 = aClass60_1321;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1323 = Static200.method3116("Lade Texturen )2 ");

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1324 = null;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "[I")
	public static int[] anIntArray508 = new int[128];

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
	public static void method2892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 + 1;
		Static104.method1768(arg4, arg2, arg1, Static148.anIntArrayArray78[arg0]);
		@Pc(21) int local21 = arg3 - 1;
		Static104.method1768(arg4, arg2, arg1, Static148.anIntArrayArray78[arg3]);
		for (@Pc(34) int local34 = local10; local34 <= local21; local34++) {
			@Pc(40) int[] local40 = Static148.anIntArrayArray78[local34];
			local40[arg4] = local40[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method2893() {
		Static60.aClass27_35.method963();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!kh;II)V")
	public static void method2894(@OriginalArg(0) Class60 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class60 local11 = arg0.method1792().method1812();
		@Pc(13) boolean local13 = false;
		for (@Pc(20) int local20 = 0; local20 < Static205.anInt4356; local20++) {
			@Pc(28) Class9_Sub4_Sub1 local28 = Static41.aClass9_Sub4_Sub1Array2[Static124.anIntArray353[local20]];
			if (local28 != null && local28.aClass60_414 != null && local28.aClass60_414.method1805(local11)) {
				local13 = true;
				Static149.method2551(local28.anIntArray511[0], 2, 0, false, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 1, local28.anIntArray510[0], 1, 0);
				if (arg1 == 1) {
					Static96.aClass1_Sub9_Sub1_3.method953(65);
					Static96.aClass1_Sub9_Sub1_3.method914(Static124.anIntArray353[local20]);
				} else if (arg1 == 4) {
					Static96.aClass1_Sub9_Sub1_3.method953(214);
					Static96.aClass1_Sub9_Sub1_3.method943(Static124.anIntArray353[local20]);
				} else if (arg1 == 6) {
					Static96.aClass1_Sub9_Sub1_3.method953(161);
					Static96.aClass1_Sub9_Sub1_3.method943(Static124.anIntArray353[local20]);
				} else if (arg1 == 7) {
					Static96.aClass1_Sub9_Sub1_3.method953(47);
					Static96.aClass1_Sub9_Sub1_3.method902(Static124.anIntArray353[local20]);
				}
				break;
			}
		}
		if (!local13) {
			Static13.method239(Static149.aClass60_1155, Static34.method611(new Class60[] { Static28.aClass60_981, local11 }), 0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method2895() {
		for (@Pc(10) Class1_Sub21 local10 = (Class1_Sub21) Static129.aClass19_7.method609(); local10 != null; local10 = (Class1_Sub21) Static129.aClass19_7.method615()) {
			if (local10.anInt3151 == -1) {
				local10.anInt3162 = 0;
				Static3.method59(local10);
			} else {
				local10.method3530();
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static37.anInt868 = 0;
		@Pc(301) int local301;
		@Pc(219) int local219;
		@Pc(135) int local135;
		for (@Pc(13) int local13 = -1; local13 < Static205.anInt4356 + Static56.anInt1482; local13++) {
			@Pc(21) Class9_Sub4 local21;
			if (local13 == -1) {
				local21 = Static84.aClass9_Sub4_Sub1_2;
			} else if (local13 >= Static205.anInt4356) {
				local21 = Static1.aClass9_Sub4_Sub2Array1[Static19.anIntArray73[local13 - Static205.anInt4356]];
			} else {
				local21 = Static41.aClass9_Sub4_Sub1Array2[Static124.anIntArray353[local13]];
			}
			if (local21 != null && local21.method2907()) {
				@Pc(62) Class1_Sub1_Sub9 local62;
				if (local21 instanceof Class9_Sub4_Sub2) {
					local62 = ((Class9_Sub4_Sub2) local21).aClass1_Sub1_Sub9_1;
					if (local62.anIntArray295 != null) {
						local62 = local62.method1739();
					}
					if (local62 == null) {
						continue;
					}
				}
				if (local13 >= Static205.anInt4356) {
					local62 = ((Class9_Sub4_Sub2) local21).aClass1_Sub1_Sub9_1;
					if (local62.anIntArray295 != null) {
						local62 = local62.method1739();
					}
					if (local62.anInt2315 >= 0 && local62.anInt2315 < Static52.aClass1_Sub1_Sub6Array3.length) {
						Static108.method1887(local21, arg1 >> 1, arg3 >> 1, local21.method2906() + 15);
						if (Static52.anInt1422 > -1) {
							Static52.aClass1_Sub1_Sub6Array3[local62.anInt2315].method2164(Static52.anInt1422 + arg2 - 12, Static104.anInt2368 + -30 + arg0);
						}
					}
					local135 = 0;
					@Pc(137) Class94[] local137 = Static77.aClass94Array1;
					while (local135 < local137.length) {
						@Pc(143) Class94 local143 = local137[local135];
						if (local143 != null && local143.anInt3978 == 1 && Static19.anIntArray73[local13 - Static205.anInt4356] == local143.anInt3970 && Static42.anInt910 % 20 < 10) {
							Static108.method1887(local21, arg1 >> 1, arg3 >> 1, local21.method2906() + 15);
							if (Static52.anInt1422 > -1) {
								Static122.aClass1_Sub1_Sub6Array7[local143.anInt3972].method2164(Static52.anInt1422 + arg2 - 12, Static104.anInt2368 + (arg0 - 28));
							}
						}
						local135++;
					}
				} else {
					local219 = 30;
					@Pc(222) Class9_Sub4_Sub1 local222 = (Class9_Sub4_Sub1) local21;
					if (local222.anInt1403 != -1 || local222.anInt1404 != -1) {
						Static108.method1887(local21, arg1 >> 1, arg3 >> 1, local21.method2906() + 15);
						if (Static52.anInt1422 > -1) {
							if (local222.anInt1403 != -1) {
								Static63.aClass1_Sub1_Sub6Array4[local222.anInt1403].method2164(arg2 + Static52.anInt1422 - 12, arg0 + Static104.anInt2368 - 30);
								local219 += 25;
							}
							if (local222.anInt1404 != -1) {
								Static52.aClass1_Sub1_Sub6Array3[local222.anInt1404].method2164(Static52.anInt1422 + arg2 - 12, -local219 + Static104.anInt2368 + arg0);
								local219 += 25;
							}
						}
					}
					if (local13 >= 0) {
						@Pc(299) Class94[] local299 = Static77.aClass94Array1;
						for (local301 = 0; local301 < local299.length; local301++) {
							@Pc(307) Class94 local307 = local299[local301];
							if (local307 != null && local307.anInt3978 == 10 && local307.anInt3970 == Static124.anIntArray353[local13]) {
								Static108.method1887(local21, arg1 >> 1, arg3 >> 1, local21.method2906() + 15);
								if (Static52.anInt1422 > -1) {
									Static122.aClass1_Sub1_Sub6Array7[local307.anInt3972].method2164(Static52.anInt1422 + arg2 - 12, Static104.anInt2368 + arg0 + -local219);
								}
							}
						}
					}
				}
				if (local21.aClass60_1328 != null && (Static205.anInt4356 <= local13 || Static118.anInt2663 == 0 || Static118.anInt2663 == 3 || Static118.anInt2663 == 1 && Static23.method1991(((Class9_Sub4_Sub1) local21).aClass60_414))) {
					Static108.method1887(local21, arg1 >> 1, arg3 >> 1, local21.method2906());
					if (Static52.anInt1422 > -1 && Static163.anInt3586 > Static37.anInt868) {
						Static163.anIntArray469[Static37.anInt868] = Static176.aClass1_Sub1_Sub14_2.method3307(local21.aClass60_1328) / 2;
						Static163.anIntArray471[Static37.anInt868] = Static176.aClass1_Sub1_Sub14_2.anInt4516;
						Static163.anIntArray465[Static37.anInt868] = Static52.anInt1422;
						Static163.anIntArray470[Static37.anInt868] = Static104.anInt2368;
						Static163.anIntArray468[Static37.anInt868] = local21.anInt3917;
						Static163.anIntArray466[Static37.anInt868] = local21.anInt3895;
						Static163.anIntArray467[Static37.anInt868] = local21.anInt3900;
						Static163.aClass60Array26[Static37.anInt868] = local21.aClass60_1328;
						Static37.anInt868++;
					}
				}
				if (Static42.anInt910 < local21.anInt3916) {
					Static108.method1887(local21, arg1 >> 1, arg3 >> 1, local21.method2906() + 15);
					if (Static52.anInt1422 > -1) {
						Static76.method1367(Static52.anInt1422 + arg2 - 15, Static104.anInt2368 + arg0 + -3, local21.anInt3898, 5, 65280);
						Static76.method1367(Static52.anInt1422 + arg2 + local21.anInt3898 - 15, Static104.anInt2368 + -3 + arg0, 30 - local21.anInt3898, 5, 16711680);
					}
				}
				for (local219 = 0; local219 < 4; local219++) {
					if (Static42.anInt910 < local21.anIntArray512[local219]) {
						Static108.method1887(local21, arg1 >> 1, arg3 >> 1, local21.method2906() / 2);
						if (Static52.anInt1422 > -1) {
							if (local219 == 1) {
								Static104.anInt2368 -= 20;
							}
							if (local219 == 2) {
								Static52.anInt1422 -= 15;
								Static104.anInt2368 -= 10;
							}
							if (local219 == 3) {
								Static104.anInt2368 -= 10;
								Static52.anInt1422 += 15;
							}
							Static52.aClass1_Sub1_Sub6Array2[local21.anIntArray513[local219]].method2164(Static52.anInt1422 + arg2 - 12, Static104.anInt2368 + arg0 + -12);
							Static85.aClass1_Sub1_Sub14_4.method3314(Static40.method681(local21.anIntArray509[local219]), arg2 + Static52.anInt1422 - 1, arg0 + Static104.anInt2368 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(650) int local650 = 0; local650 < Static37.anInt868; local650++) {
			local219 = Static163.anIntArray465[local650];
			@Pc(660) int local660 = Static163.anIntArray470[local650];
			@Pc(662) boolean local662 = true;
			local301 = Static163.anIntArray471[local650];
			local135 = Static163.anIntArray469[local650];
			while (local662) {
				local662 = false;
				for (@Pc(676) int local676 = 0; local676 < local650; local676++) {
					if (Static163.anIntArray470[local676] - Static163.anIntArray471[local676] < local660 - -2 && local660 - local301 < Static163.anIntArray470[local676] - -2 && local219 - local135 < Static163.anIntArray465[local676] + Static163.anIntArray469[local676] && Static163.anIntArray465[local676] - Static163.anIntArray469[local676] < local135 + local219 && Static163.anIntArray470[local676] - Static163.anIntArray471[local676] < local660) {
						local662 = true;
						local660 = Static163.anIntArray470[local676] - Static163.anIntArray471[local676];
					}
				}
			}
			Static52.anInt1422 = Static163.anIntArray465[local650];
			Static104.anInt2368 = Static163.anIntArray470[local650] = local660;
			@Pc(770) Class60 local770 = Static163.aClass60Array26[local650];
			if (Static57.anInt1494 == 0) {
				@Pc(787) int local787 = 16776960;
				if (Static163.anIntArray468[local650] < 6) {
					local787 = Static198.anIntArray551[Static163.anIntArray468[local650]];
				}
				if (Static163.anIntArray468[local650] == 6) {
					local787 = Static19.anInt471 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static163.anIntArray468[local650] == 7) {
					local787 = Static19.anInt471 % 20 >= 10 ? 65535 : 255;
				}
				if (Static163.anIntArray468[local650] == 8) {
					local787 = Static19.anInt471 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(863) int local863;
				if (Static163.anIntArray468[local650] == 9) {
					local863 = 150 - Static163.anIntArray467[local650];
					if (local863 < 50) {
						local787 = local863 * 1280 + 16711680;
					} else if (local863 < 100) {
						local787 = 33160960 - local863 * 327680;
					} else if (local863 < 150) {
						local787 = (local863 - 100) * 5 + 65280;
					}
				}
				if (Static163.anIntArray468[local650] == 10) {
					local863 = 150 - Static163.anIntArray467[local650];
					if (local863 < 50) {
						local787 = local863 * 5 + 16711680;
					} else if (local863 < 100) {
						local787 = 16711935 - (local863 - 50) * 327680;
					} else if (local863 < 150) {
						local787 = local863 * 327680 + 500 + 255 - local863 * 5 - 32768000;
					}
				}
				if (Static163.anIntArray468[local650] == 11) {
					local863 = 150 - Static163.anIntArray467[local650];
					if (local863 < 50) {
						local787 = 16777215 - local863 * 327685;
					} else if (local863 < 100) {
						local787 = (local863 - 50) * 327685 + 65280;
					} else if (local863 < 150) {
						local787 = 49545215 - local863 * 327680;
					}
				}
				if (Static163.anIntArray466[local650] == 0) {
					Static176.aClass1_Sub1_Sub14_2.method3314(local770, arg2 + Static52.anInt1422, arg0 + Static104.anInt2368, local787, 0);
				}
				if (Static163.anIntArray466[local650] == 1) {
					Static176.aClass1_Sub1_Sub14_2.method3302(local770, Static52.anInt1422 + arg2, arg0 + Static104.anInt2368, local787, Static19.anInt471);
				}
				if (Static163.anIntArray466[local650] == 2) {
					Static176.aClass1_Sub1_Sub14_2.method3303(local770, arg2 + Static52.anInt1422, arg0 + Static104.anInt2368, local787, Static19.anInt471);
				}
				if (Static163.anIntArray466[local650] == 3) {
					Static176.aClass1_Sub1_Sub14_2.method3313(local770, arg2 + Static52.anInt1422, Static104.anInt2368 + arg0, local787, Static19.anInt471, 150 - Static163.anIntArray467[local650]);
				}
				if (Static163.anIntArray466[local650] == 4) {
					local863 = (150 - Static163.anIntArray467[local650]) * (Static176.aClass1_Sub1_Sub14_2.method3307(local770) + 100) / 150;
					Static76.method1358(arg2 + Static52.anInt1422 - 50, arg0, Static52.anInt1422 + arg2 + 50, arg1 + arg0);
					Static176.aClass1_Sub1_Sub14_2.method3317(local770, Static52.anInt1422 + arg2 + 50 - local863, Static104.anInt2368 + arg0, local787, 0);
					Static76.method1363(arg2, arg0, arg3 + arg2, arg0 + arg1);
				}
				if (Static163.anIntArray466[local650] == 5) {
					local863 = 150 - Static163.anIntArray467[local650];
					@Pc(1159) int local1159 = 0;
					Static76.method1358(arg2, arg0 + Static104.anInt2368 - Static176.aClass1_Sub1_Sub14_2.anInt4516 - 1, arg3 + arg2, arg0 + Static104.anInt2368 + 5);
					if (local863 < 25) {
						local1159 = local863 - 25;
					} else if (local863 > 125) {
						local1159 = local863 - 125;
					}
					Static176.aClass1_Sub1_Sub14_2.method3314(local770, arg2 + Static52.anInt1422, local1159 + Static104.anInt2368 + arg0, local787, 0);
					Static76.method1363(arg2, arg0, arg2 + arg3, arg1 + arg0);
				}
			} else {
				Static176.aClass1_Sub1_Sub14_2.method3314(local770, arg2 + Static52.anInt1422, arg0 + Static104.anInt2368, 16776960, 0);
			}
		}
	}
}
