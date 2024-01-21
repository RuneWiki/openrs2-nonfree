import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!va", name = "t", descriptor = "I")
	public static int anInt2027;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "Lclient!cg;")
	public static Class2_Sub1_Sub4_Sub1_Sub1 aClass2_Sub1_Sub4_Sub1_Sub1_4;

	@OriginalMember(owner = "client!va", name = "S", descriptor = "I")
	public static int anInt2050;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!cd;")
	public static Class10 aClass10_865 = Static51.method932("<col=80ff00>");

	@OriginalMember(owner = "client!va", name = "K", descriptor = "I")
	public static int anInt2043 = 0;

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!va", name = "lb", descriptor = "[I")
	public static int[] anIntArray221 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!va", name = "mb", descriptor = "[I")
	public static int[] anIntArray222 = new int[128];

	@OriginalMember(owner = "client!va", name = "zb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_866 = Static51.method932(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!va", name = "Bb", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!va", name = "Db", descriptor = "Lclient!cd;")
	public static Class10 aClass10_867 = Static51.method932(" <col=ffff00>");

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(IB)V")
	public static void method1471(@OriginalArg(0) int arg0) {
		Static118.anInt2685 += arg0 * 128;
		@Pc(27) int local27;
		if (Static93.anIntArray228.length < Static118.anInt2685) {
			Static118.anInt2685 -= Static93.anIntArray228.length;
			local27 = (int) (Math.random() * 12.0D);
			Static46.method875(Static96.aClass2_Sub1_Sub4_Sub3Array21[local27]);
		}
		local27 = 0;
		@Pc(38) int local38 = arg0 * 128;
		@Pc(45) int local45 = (256 - arg0) * 128;
		@Pc(72) int local72;
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			local72 = Static11.anIntArray368[local27 + local38] - arg0 * Static93.anIntArray228[Static93.anIntArray228.length - 1 & local27 - -Static118.anInt2685] / 6;
			if (local72 < 0) {
				local72 = 0;
			}
			Static11.anIntArray368[local27++] = local72;
		}
		@Pc(99) int local99;
		@Pc(101) int local101;
		@Pc(108) int local108;
		for (local72 = 256 - arg0; local72 < 256; local72++) {
			local99 = local72 * 128;
			for (local101 = 0; local101 < 128; local101++) {
				local108 = (int) (Math.random() * 100.0D);
				if (local108 < 50 && local101 > 10 && local101 < 118) {
					Static11.anIntArray368[local101 + local99] = 255;
				} else {
					Static11.anIntArray368[local99 + local101] = 0;
				}
			}
		}
		if (Static142.anInt3160 > 0) {
			Static142.anInt3160 -= arg0 * 4;
		}
		if (Static131.anInt2908 > 0) {
			Static131.anInt2908 -= arg0 * 4;
		}
		if (Static142.anInt3160 == 0 && Static131.anInt2908 == 0) {
			local99 = (int) (Math.random() * (double) (2000 / arg0));
			if (local99 == 0) {
				Static142.anInt3160 = 1024;
			}
			if (local99 == 1) {
				Static131.anInt2908 = 1024;
			}
		}
		for (local99 = 0; local99 < 256 - arg0; local99++) {
			Static59.anIntArray168[local99] = Static59.anIntArray168[arg0 + local99];
		}
		for (local101 = 256 - arg0; local101 < 256; local101++) {
			Static59.anIntArray168[local101] = (int) (Math.sin((double) Static9.anInt254 / 14.0D) * 16.0D + Math.sin((double) Static9.anInt254 / 15.0D) * 14.0D + Math.sin((double) Static9.anInt254 / 16.0D) * 12.0D);
			Static9.anInt254++;
		}
		local108 = (arg0 + (Static14.anInt386 & 0x1)) / 2;
		Static116.anInt2644 += arg0;
		if (local108 <= 0) {
			return;
		}
		@Pc(300) int local300;
		@Pc(293) int local293;
		for (@Pc(284) int local284 = 0; local284 < Static116.anInt2644 * 100; local284++) {
			local293 = (int) (Math.random() * 128.0D) + 128;
			local300 = (int) (Math.random() * 124.0D) + 2;
			Static11.anIntArray368[(local293 << 7) + local300] = 192;
		}
		Static116.anInt2644 = 0;
		@Pc(326) int local326;
		@Pc(329) int local329;
		for (local300 = 0; local300 < 256; local300++) {
			local293 = 0;
			local326 = local300 * 128;
			for (local329 = -local108; local329 < 128; local329++) {
				if (local108 + local329 < 128) {
					local293 += Static11.anIntArray368[local108 + local329 + local326];
				}
				if (local329 - local108 - 1 >= 0) {
					local293 -= Static11.anIntArray368[local326 + local329 - local108 - 1];
				}
				if (local329 >= 0) {
					Static33.anIntArray68[local329 + local326] = local293 / (local108 * 2 + 1);
				}
			}
		}
		for (local293 = 0; local293 < 128; local293++) {
			local326 = 0;
			for (local329 = -local108; local329 < 256; local329++) {
				@Pc(408) int local408 = local329 * 128;
				if (local329 + local108 < 256) {
					local326 += Static33.anIntArray68[local408 + local293 + local108 * 128];
				}
				if (local329 - local108 - 1 >= 0) {
					local326 -= Static33.anIntArray68[local408 + local293 - local108 * 128 - 128];
				}
				if (local329 >= 0) {
					Static11.anIntArray368[local408 + local293] = local326 / (local108 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V")
	public static void method1477() {
		aClass10_867 = null;
		aLongArray6 = null;
		aClass10_866 = null;
		aClass2_Sub1_Sub4_Sub1_Sub1_4 = null;
		anIntArray222 = null;
		anIntArray221 = null;
		aClass10_865 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BIIII)V")
	public static void method1481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static107.anInt2459 = 0;
		for (@Pc(9) int local9 = -1; local9 < Static54.anInt1354 + Static64.anInt1578; local9++) {
			@Pc(16) Class2_Sub1_Sub3_Sub2 local16;
			if (local9 == -1) {
				local16 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1;
			} else if (Static54.anInt1354 > local9) {
				local16 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[Static66.anIntArray175[local9]];
			} else {
				local16 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[Static8.anIntArray15[local9 - Static54.anInt1354]];
			}
			if (local16 != null && local16.method2467()) {
				@Pc(57) Class2_Sub1_Sub2 local57;
				if (local16 instanceof Class2_Sub1_Sub3_Sub2_Sub2) {
					local57 = ((Class2_Sub1_Sub3_Sub2_Sub2) local16).aClass2_Sub1_Sub2_1;
					if (local57.anIntArray5 != null) {
						local57 = local57.method57();
					}
					if (local57 == null) {
						continue;
					}
				}
				@Pc(76) int local76;
				if (Static54.anInt1354 <= local9) {
					local57 = ((Class2_Sub1_Sub3_Sub2_Sub2) local16).aClass2_Sub1_Sub2_1;
					if (local57.anIntArray5 != null) {
						local57 = local57.method57();
					}
					if (local57.anInt74 >= 0 && Static44.aClass2_Sub1_Sub4_Sub2Array3.length > local57.anInt74) {
						Static70.method1190(local16.anInt3505 + 15, local16);
						if (Static5.anInt120 > -1) {
							Static44.aClass2_Sub1_Sub4_Sub2Array3[local57.anInt74].method738(arg0 + Static5.anInt120 - 12, Static117.anInt2671 + arg1 + -30);
						}
					}
					if (Static102.anInt3607 == 1 && Static53.anInt1254 == Static8.anIntArray15[local9 - Static54.anInt1354] && Static14.anInt386 % 20 < 10) {
						Static70.method1190(local16.anInt3505 + 15, local16);
						if (Static5.anInt120 > -1) {
							Static8.aClass2_Sub1_Sub4_Sub2Array1[0].method738(Static5.anInt120 + arg0 - 12, arg1 + -28 + Static117.anInt2671);
						}
					}
				} else {
					@Pc(74) Class2_Sub1_Sub3_Sub2_Sub1 local74 = (Class2_Sub1_Sub3_Sub2_Sub1) local16;
					local76 = 30;
					if (local74.anInt1335 != -1 || local74.anInt1331 != -1) {
						Static70.method1190(local16.anInt3505 + 15, local16);
						if (Static5.anInt120 > -1) {
							if (local74.anInt1335 != -1) {
								Static158.aClass2_Sub1_Sub4_Sub2Array9[local74.anInt1335].method738(arg0 + Static5.anInt120 - 12, Static117.anInt2671 + -30 + arg1);
								local76 += 25;
							}
							if (local74.anInt1331 != -1) {
								Static44.aClass2_Sub1_Sub4_Sub2Array3[local74.anInt1331].method738(Static5.anInt120 + arg0 - 12, Static117.anInt2671 + arg1 + -local76);
								local76 += 25;
							}
						}
					}
					if (local9 >= 0 && Static102.anInt3607 == 10 && anInt2043 == Static66.anIntArray175[local9]) {
						Static70.method1190(local16.anInt3505 + 15, local16);
						if (Static5.anInt120 > -1) {
							Static8.aClass2_Sub1_Sub4_Sub2Array1[1].method738(Static5.anInt120 + arg0 - 12, -local76 + (arg1 - -Static117.anInt2671));
						}
					}
				}
				if (local16.aClass10_1514 != null && (local9 >= Static54.anInt1354 || Static66.anInt1600 == 0 || Static66.anInt1600 == 3 || Static66.anInt1600 == 1 && Static169.method2597(((Class2_Sub1_Sub3_Sub2_Sub1) local16).aClass10_598))) {
					Static70.method1190(local16.anInt3505, local16);
					if (Static5.anInt120 > -1 && Static107.anInt2459 < Static119.anInt2701) {
						Static119.anIntArray287[Static107.anInt2459] = aClass2_Sub1_Sub4_Sub1_Sub1_4.method514(local16.aClass10_1514) / 2;
						Static119.anIntArray290[Static107.anInt2459] = aClass2_Sub1_Sub4_Sub1_Sub1_4.anInt636;
						Static119.anIntArray289[Static107.anInt2459] = Static5.anInt120;
						Static119.anIntArray286[Static107.anInt2459] = Static117.anInt2671;
						Static119.anIntArray292[Static107.anInt2459] = local16.anInt3460;
						Static119.anIntArray291[Static107.anInt2459] = local16.anInt3462;
						Static119.anIntArray288[Static107.anInt2459] = local16.anInt3459;
						Static119.aClass10Array21[Static107.anInt2459] = local16.aClass10_1514;
						Static107.anInt2459++;
					}
				}
				if (Static14.anInt386 < local16.anInt3474) {
					Static70.method1190(local16.anInt3505 + 15, local16);
					if (Static5.anInt120 > -1) {
						local76 = local16.anInt3486 * 30 / local16.anInt3495;
						if (local76 > 30) {
							local76 = 30;
						}
						Static172.method2026(arg0 + Static5.anInt120 - 15, arg1 - -Static117.anInt2671 - 3, local76, 5, 65280);
						Static172.method2026(arg0 + Static5.anInt120 + local76 - 15, arg1 + Static117.anInt2671 - 3, 30 - local76, 5, 16711680);
					}
				}
				for (local76 = 0; local76 < 4; local76++) {
					if (Static14.anInt386 < local16.anIntArray369[local76]) {
						Static70.method1190(local16.anInt3505 / 2, local16);
						if (Static5.anInt120 > -1) {
							if (local76 == 1) {
								Static117.anInt2671 -= 20;
							}
							if (local76 == 2) {
								Static5.anInt120 -= 15;
								Static117.anInt2671 -= 10;
							}
							if (local76 == 3) {
								Static5.anInt120 += 15;
								Static117.anInt2671 -= 10;
							}
							Static177.aClass2_Sub1_Sub4_Sub2Array11[local16.anIntArray370[local76]].method738(arg0 + Static5.anInt120 - 12, arg1 - (-Static117.anInt2671 + 12));
							Static176.aClass2_Sub1_Sub4_Sub1_Sub1_5.method510(Static164.method2485(local16.anIntArray367[local76]), Static5.anInt120 + arg0 - 1, Static117.anInt2671 + arg1 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(542) int local542 = 0; local542 < Static107.anInt2459; local542++) {
			@Pc(548) int local548 = Static119.anIntArray289[local542];
			@Pc(552) int local552 = Static119.anIntArray287[local542];
			@Pc(556) int local556 = Static119.anIntArray286[local542];
			@Pc(560) int local560 = Static119.anIntArray290[local542];
			@Pc(562) boolean local562 = true;
			while (local562) {
				local562 = false;
				for (@Pc(568) int local568 = 0; local568 < local542; local568++) {
					if (Static119.anIntArray286[local568] - Static119.anIntArray290[local568] < local556 + 2 && Static119.anIntArray286[local568] + 2 > local556 - local560 && local548 - local552 < Static119.anIntArray287[local568] + Static119.anIntArray289[local568] && local552 + local548 > Static119.anIntArray289[local568] - Static119.anIntArray287[local568] && local556 > Static119.anIntArray286[local568] - Static119.anIntArray290[local568]) {
						local556 = Static119.anIntArray286[local568] - Static119.anIntArray290[local568];
						local562 = true;
					}
				}
			}
			Static5.anInt120 = Static119.anIntArray289[local542];
			Static117.anInt2671 = Static119.anIntArray286[local542] = local556;
			@Pc(670) Class10 local670 = Static119.aClass10Array21[local542];
			if (Static97.anInt2270 == 0) {
				@Pc(674) int local674 = 16776960;
				if (Static119.anIntArray292[local542] < 6) {
					local674 = Static16.anIntArray28[Static119.anIntArray292[local542]];
				}
				if (Static119.anIntArray292[local542] == 6) {
					local674 = Static115.anInt2612 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static119.anIntArray292[local542] == 7) {
					local674 = Static115.anInt2612 % 20 < 10 ? 255 : 65535;
				}
				if (Static119.anIntArray292[local542] == 8) {
					local674 = Static115.anInt2612 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(747) int local747;
				if (Static119.anIntArray292[local542] == 9) {
					local747 = 150 - Static119.anIntArray288[local542];
					if (local747 < 50) {
						local674 = local747 * 1280 + 16711680;
					} else if (local747 < 100) {
						local674 = 16776960 - (local747 - 50) * 327680;
					} else if (local747 < 150) {
						local674 = local747 * 5 + 65280 - 500;
					}
				}
				if (Static119.anIntArray292[local542] == 10) {
					local747 = 150 - Static119.anIntArray288[local542];
					if (local747 < 50) {
						local674 = local747 * 5 + 16711680;
					} else if (local747 < 100) {
						local674 = 16711935 - (local747 - 50) * 327680;
					} else if (local747 < 150) {
						local674 = local747 * 327680 + 500 + 255 - local747 * 5 - 32768000;
					}
				}
				if (Static119.anIntArray292[local542] == 11) {
					local747 = 150 - Static119.anIntArray288[local542];
					if (local747 < 50) {
						local674 = 16777215 - local747 * 327685;
					} else if (local747 < 100) {
						local674 = (local747 - 50) * 327685 + 65280;
					} else if (local747 < 150) {
						local674 = 16777215 - (local747 - 100) * 327680;
					}
				}
				if (Static119.anIntArray291[local542] == 0) {
					aClass2_Sub1_Sub4_Sub1_Sub1_4.method510(local670, Static5.anInt120 + arg0, Static117.anInt2671 + arg1, local674, 0);
				}
				if (Static119.anIntArray291[local542] == 1) {
					aClass2_Sub1_Sub4_Sub1_Sub1_4.method531(local670, Static5.anInt120 + arg0, arg1 + Static117.anInt2671, local674, Static115.anInt2612);
				}
				if (Static119.anIntArray291[local542] == 2) {
					aClass2_Sub1_Sub4_Sub1_Sub1_4.method526(local670, Static5.anInt120 + arg0, arg1 - -Static117.anInt2671, local674, Static115.anInt2612);
				}
				if (Static119.anIntArray291[local542] == 3) {
					aClass2_Sub1_Sub4_Sub1_Sub1_4.method520(local670, Static5.anInt120 + arg0, arg1 + Static117.anInt2671, local674, Static115.anInt2612, 150 - Static119.anIntArray288[local542]);
				}
				if (Static119.anIntArray291[local542] == 4) {
					local747 = (150 - Static119.anIntArray288[local542]) * (aClass2_Sub1_Sub4_Sub1_Sub1_4.method514(local670) + 100) / 150;
					Static172.method2017(Static5.anInt120 + arg0 - 50, arg1, arg0 + Static5.anInt120 + 50, arg1 - -arg3);
					aClass2_Sub1_Sub4_Sub1_Sub1_4.method532(local670, Static5.anInt120 + arg0 + 50 - local747, arg1 + Static117.anInt2671, local674, 0);
					Static172.method2023(arg0, arg1, arg2 + arg0, arg1 - -arg3);
				}
				if (Static119.anIntArray291[local542] == 5) {
					local747 = 150 - Static119.anIntArray288[local542];
					Static172.method2017(arg0, arg1 + Static117.anInt2671 - aClass2_Sub1_Sub4_Sub1_Sub1_4.anInt636 - 1, arg2 + arg0, Static117.anInt2671 + arg1 + 5);
					@Pc(1074) int local1074 = 0;
					if (local747 < 25) {
						local1074 = local747 - 25;
					} else if (local747 > 125) {
						local1074 = local747 - 125;
					}
					aClass2_Sub1_Sub4_Sub1_Sub1_4.method510(local670, arg0 + Static5.anInt120, arg1 - -Static117.anInt2671 + local1074, local674, 0);
					Static172.method2023(arg0, arg1, arg0 + arg2, arg3 + arg1);
				}
			} else {
				aClass2_Sub1_Sub4_Sub1_Sub1_4.method510(local670, arg0 + Static5.anInt120, Static117.anInt2671 + arg1, 16776960, 0);
			}
		}
	}
}
