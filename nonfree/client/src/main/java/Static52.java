import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
	public static int anInt1185;

	@OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
	public static int anInt1182 = 0;

	@OriginalMember(owner = "client!dm", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString68 = "flash1:";

	@OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
	public static int anInt1186 = -1;

	@OriginalMember(owner = "client!dm", name = "S", descriptor = "[I")
	public static int[] anIntArray125 = new int[1000];

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
	public static void method1025() {
		if (Static107.anInt2505 > 0) {
			Static107.anInt2505--;
		}
		if (Static69.anInt1462 > 1) {
			Static69.anInt1462--;
			Static63.anInt1344 = Static23.anInt471;
		}
		if (Static23.aBoolean38) {
			Static23.aBoolean38 = false;
			Static136.method3363();
			return;
		}
		@Pc(34) int local34;
		for (local34 = 0; local34 < 100 && Static104.method1932(); local34++) {
		}
		if (Static194.anInt4017 != 30) {
			return;
		}
		Static82.method1388(Static283.aClass1_Sub11_Sub1_3);
		@Pc(57) Object local57 = Static218.aClass173_1.anObject7;
		@Pc(80) int local80;
		@Pc(85) int local85;
		@Pc(110) int local110;
		@Pc(131) int local131;
		@Pc(196) int local196;
		@Pc(201) int local201;
		synchronized (Static218.aClass173_1.anObject7) {
			if (!Static3.aBoolean8) {
				Static218.aClass173_1.anInt5393 = 0;
			} else if (Static123.anInt2804 != 0 || Static218.aClass173_1.anInt5393 >= 40) {
				Static283.aClass1_Sub11_Sub1_3.method2697(143);
				Static283.aClass1_Sub11_Sub1_3.method2655(0);
				local80 = 0;
				@Pc(83) int local83 = Static283.aClass1_Sub11_Sub1_3.anInt3264;
				for (local85 = 0; local85 < Static218.aClass173_1.anInt5393 && Static283.aClass1_Sub11_Sub1_3.anInt3264 - local83 < 240; local85++) {
					local80++;
					local110 = Static218.aClass173_1.anIntArray536[local85];
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > 65534) {
						local110 = 65534;
					}
					@Pc(126) boolean local126 = false;
					local131 = Static218.aClass173_1.anIntArray535[local85];
					if (local131 < 0) {
						local131 = 0;
					} else if (local131 > 65534) {
						local131 = 65534;
					}
					if (Static218.aClass173_1.anIntArray536[local85] == -1 && Static218.aClass173_1.anIntArray535[local85] == -1) {
						local131 = -1;
						local110 = -1;
						local126 = true;
					}
					if (Static214.anInt4262 != local131 || Static259.anInt5085 != local110) {
						local196 = local131 - Static214.anInt4262;
						local201 = local110 - Static259.anInt5085;
						Static259.anInt5085 = local110;
						Static214.anInt4262 = local131;
						if (Static38.anInt1008 < 8 && local196 >= -32 && local196 <= 31 && local201 >= -32 && local201 <= 31) {
							local196 += 32;
							local201 += 32;
							Static283.aClass1_Sub11_Sub1_3.method2660(local201 + (local196 << 6) + (Static38.anInt1008 << 12));
							Static38.anInt1008 = 0;
						} else if (Static38.anInt1008 < 32 && local196 >= -128 && local196 <= 127 && local201 >= -128 && local201 <= 127) {
							Static283.aClass1_Sub11_Sub1_3.method2655(Static38.anInt1008 + 128);
							local201 += 128;
							local196 += 128;
							Static283.aClass1_Sub11_Sub1_3.method2660((local196 << 8) + local201);
							Static38.anInt1008 = 0;
						} else if (Static38.anInt1008 >= 32) {
							Static283.aClass1_Sub11_Sub1_3.method2660(Static38.anInt1008 + 57344);
							if (local126) {
								Static283.aClass1_Sub11_Sub1_3.method2659(Integer.MIN_VALUE);
							} else {
								Static283.aClass1_Sub11_Sub1_3.method2659(local131 | local110 << 16);
							}
							Static38.anInt1008 = 0;
						} else {
							Static283.aClass1_Sub11_Sub1_3.method2655(Static38.anInt1008 + 192);
							if (local126) {
								Static283.aClass1_Sub11_Sub1_3.method2659(Integer.MIN_VALUE);
							} else {
								Static283.aClass1_Sub11_Sub1_3.method2659(local131 | local110 << 16);
							}
							Static38.anInt1008 = 0;
						}
					} else if (Static38.anInt1008 < 2047) {
						Static38.anInt1008++;
					}
				}
				Static283.aClass1_Sub11_Sub1_3.method2641(Static283.aClass1_Sub11_Sub1_3.anInt3264 - local83);
				if (Static218.aClass173_1.anInt5393 > local80) {
					Static218.aClass173_1.anInt5393 -= local80;
					for (local85 = 0; local85 < Static218.aClass173_1.anInt5393; local85++) {
						Static218.aClass173_1.anIntArray535[local85] = Static218.aClass173_1.anIntArray535[local80 + local85];
						Static218.aClass173_1.anIntArray536[local85] = Static218.aClass173_1.anIntArray536[local85 + local80];
					}
				} else {
					Static218.aClass173_1.anInt5393 = 0;
				}
			}
		}
		if (Static123.anInt2804 != 0) {
			local80 = Static40.anInt1015;
			local85 = Static249.anInt4936;
			@Pc(433) byte local433 = 0;
			@Pc(440) long local440 = (Static183.aLong160 - Static118.aLong104) / 50L;
			Static118.aLong104 = Static183.aLong160;
			if (Static123.anInt2804 == 2) {
				local433 = 1;
			}
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 65535) {
				local85 = 65535;
			}
			if (local80 < 0) {
				local80 = 0;
			} else if (local80 > 65535) {
				local80 = 65535;
			}
			if (local440 > 32767L) {
				local440 = 32767L;
			}
			local131 = (int) local440;
			Static283.aClass1_Sub11_Sub1_3.method2697(103);
			Static283.aClass1_Sub11_Sub1_3.method2660(local433 << 15 | local131);
			Static283.aClass1_Sub11_Sub1_3.method2659(local80 << 16 | local85);
		}
		if (Static119.anInt2756 > 0) {
			Static119.anInt2756--;
		}
		if (Static192.aBoolean301 && Static119.anInt2756 <= 0) {
			Static192.aBoolean301 = false;
			Static119.anInt2756 = 20;
			Static283.aClass1_Sub11_Sub1_3.method2697(123);
			Static283.aClass1_Sub11_Sub1_3.method2660((int) Static298.aFloat58);
			Static283.aClass1_Sub11_Sub1_3.method2648((int) Static125.aFloat20);
		}
		if (Static59.aBoolean304 && !Static282.aBoolean424) {
			Static282.aBoolean424 = true;
			Static283.aClass1_Sub11_Sub1_3.method2697(67);
			Static283.aClass1_Sub11_Sub1_3.method2655(1);
		}
		if (!Static59.aBoolean304 && Static282.aBoolean424) {
			Static282.aBoolean424 = false;
			Static283.aClass1_Sub11_Sub1_3.method2697(67);
			Static283.aClass1_Sub11_Sub1_3.method2655(0);
		}
		if (!Static21.aBoolean32) {
			Static283.aClass1_Sub11_Sub1_3.method2697(214);
			Static283.aClass1_Sub11_Sub1_3.method2651(Static209.method3325());
			Static21.aBoolean32 = true;
		}
		if (Static16.aBoolean25) {
			Static16.aBoolean25 = false;
		} else {
			Static3.aFloat1 /= 2.0F;
		}
		if (Static203.aBoolean318) {
			Static203.aBoolean318 = false;
		} else {
			Static88.aFloat10 /= 2.0F;
		}
		Static284.method4273();
		if (Static194.anInt4017 != 30) {
			return;
		}
		Static262.method4024();
		Static97.method1784();
		Static75.method1310();
		Static175.anInt3720++;
		if (Static175.anInt3720 > 750) {
			Static136.method3363();
			return;
		}
		Static118.method2112();
		Static161.method2790();
		Static89.method1561();
		if (Static170.aClass71_15 != null) {
			Static258.method3974();
		}
		for (local34 = Static133.method2241(true); local34 != -1; local34 = Static133.method2241(false)) {
			Static250.method3857(local34);
			Static179.anIntArray337[Static129.anInt2878++ & 0x1F] = local34;
		}
		@Pc(788) int local788;
		for (@Pc(696) Class1_Sub2_Sub18 local696 = Static151.method4457(); local696 != null; local696 = Static151.method4457()) {
			local80 = local696.method3901();
			local85 = local696.method3908();
			if (local80 == 1) {
				Static8.anIntArray21[local85] = local696.anInt5005;
				Static93.anIntArray186[Static138.anInt4591++ & 0x1F] = local85;
			} else if (local80 == 2) {
				Static115.aStringArray32[local85] = local696.aString296;
				Static71.anIntArray145[Static291.anInt5517++ & 0x1F] = local85;
			} else {
				@Pc(831) Class71 local831;
				if (local80 == 3) {
					local831 = Static56.method1058(local85);
					if (!local696.aString296.equals(local831.aString157)) {
						local831.aString157 = local696.aString296;
						Static160.method2779(local831);
					}
				} else if (local80 == 4) {
					local831 = Static56.method1058(local85);
					local131 = local696.anInt5005;
					local196 = local696.anInt5004;
					local788 = local696.anInt5000;
					if (local831.anInt2705 != local131 || local831.anInt2651 != local788 || local831.anInt2671 != local196) {
						local831.anInt2671 = local196;
						local831.anInt2705 = local131;
						local831.anInt2651 = local788;
						Static160.method2779(local831);
					}
				} else if (local80 == 5) {
					local831 = Static56.method1058(local85);
					if (local831.anInt2687 != local696.anInt5005 || local696.anInt5005 == -1) {
						local831.anInt2687 = local696.anInt5005;
						local831.anInt2717 = 1;
						local831.anInt2654 = 0;
						local831.anInt2668 = 0;
						Static160.method2779(local831);
					}
				} else if (local80 == 6) {
					local110 = local696.anInt5005;
					local131 = local110 >> 10 & 0x1F;
					local196 = local110 & 0x1F;
					local788 = local110 >> 5 & 0x1F;
					local201 = (local196 << 3) + (local788 << 11) + (local131 << 19);
					@Pc(806) Class71 local806 = Static56.method1058(local85);
					if (local201 != local806.anInt2691) {
						local806.anInt2691 = local201;
						Static160.method2779(local806);
					}
				} else if (local80 == 7) {
					local831 = Static56.method1058(local85);
					@Pc(841) boolean local841 = local696.anInt5005 == 1;
					if (local831.aBoolean203 != local841) {
						local831.aBoolean203 = local841;
						Static160.method2779(local831);
					}
				} else if (local80 == 8) {
					local831 = Static56.method1058(local85);
					if (local831.anInt2635 != local696.anInt5005 || local696.anInt5000 != local831.anInt2672 || local831.anInt2634 != local696.anInt5004) {
						local831.anInt2635 = local696.anInt5005;
						local831.anInt2672 = local696.anInt5000;
						local831.anInt2634 = local696.anInt5004;
						if (local831.anInt2703 != -1) {
							if (local831.anInt2645 > 0) {
								local831.anInt2634 = local831.anInt2634 * 32 / local831.anInt2645;
							} else if (local831.anInt2706 > 0) {
								local831.anInt2634 = local831.anInt2634 * 32 / local831.anInt2706;
							}
						}
						Static160.method2779(local831);
					}
				} else if (local80 == 9) {
					local831 = Static56.method1058(local85);
					if (local831.anInt2703 != local696.anInt5005 || local831.anInt2661 != local696.anInt5000) {
						local831.anInt2661 = local696.anInt5000;
						local831.anInt2703 = local696.anInt5005;
						Static160.method2779(local831);
					}
				} else if (local80 == 10) {
					local831 = Static56.method1058(local85);
					if (local831.anInt2718 != local696.anInt5005 || local696.anInt5000 != local831.anInt2728 || local831.anInt2637 != local696.anInt5004) {
						local831.anInt2728 = local696.anInt5000;
						local831.anInt2637 = local696.anInt5004;
						local831.anInt2718 = local696.anInt5005;
						Static160.method2779(local831);
					}
				} else if (local80 == 11) {
					local831 = Static56.method1058(local85);
					local831.aByte9 = 0;
					local831.anInt2641 = local831.anInt2714 = local696.anInt5005;
					local831.anInt2711 = local831.anInt2695 = local696.anInt5000;
					local831.aByte10 = 0;
					Static160.method2779(local831);
				} else if (local80 == 12) {
					local831 = Static56.method1058(local85);
					local131 = local696.anInt5005;
					if (local831 != null && local831.anInt2712 == 0) {
						if (local831.anInt2650 - local831.anInt2698 < local131) {
							local131 = local831.anInt2650 - local831.anInt2698;
						}
						if (local131 < 0) {
							local131 = 0;
						}
						if (local131 != local831.anInt2646) {
							local831.anInt2646 = local131;
							Static160.method2779(local831);
						}
					}
				} else if (local80 == 13) {
					local831 = Static56.method1058(local85);
					local831.anInt2710 = local696.anInt5005;
				}
			}
		}
		if (Static127.anInt2837 != 0) {
			Static216.anInt4283 += 20;
			if (Static216.anInt4283 >= 400) {
				Static127.anInt2837 = 0;
			}
		}
		Static129.anInt2881++;
		if (Static199.aClass71_18 != null) {
			Static93.anInt2134++;
			if (Static93.anInt2134 >= 15) {
				Static160.method2779(Static199.aClass71_18);
				Static199.aClass71_18 = null;
			}
		}
		@Pc(1344) Class71 local1344;
		if (Static185.aClass71_16 != null) {
			Static160.method2779(Static185.aClass71_16);
			if (Static258.anInt5075 + 5 < Static224.anInt4445 || Static224.anInt4445 < Static258.anInt5075 - 5 || Static8.anInt226 > Static191.anInt3931 + 5 || Static8.anInt226 < Static191.anInt3931 - 5) {
				Static166.aBoolean262 = true;
			}
			Static190.anInt3912++;
			if (Static66.anInt1384 == 0) {
				if (Static166.aBoolean262 && Static190.anInt3912 >= 5) {
					if (Static185.aClass71_16 == Static222.aClass71_19 && Static242.anInt4793 != Static53.anInt5279) {
						local1344 = Static185.aClass71_16;
						@Pc(1346) byte local1346 = 0;
						if (Static228.anInt4520 == 1 && local1344.anInt2713 == 206) {
							local1346 = 1;
						}
						if (local1344.anIntArray243[Static53.anInt5279] <= 0) {
							local1346 = 0;
						}
						if (Static36.method769(local1344).method1369()) {
							local110 = Static242.anInt4793;
							local131 = Static53.anInt5279;
							local1344.anIntArray243[local131] = local1344.anIntArray243[local110];
							local1344.anIntArray239[local131] = local1344.anIntArray239[local110];
							local1344.anIntArray243[local110] = -1;
							local1344.anIntArray239[local110] = 0;
						} else if (local1346 == 1) {
							local110 = Static242.anInt4793;
							local131 = Static53.anInt5279;
							while (local110 != local131) {
								if (local131 < local110) {
									local1344.method2097(local110 - 1, local110);
									local110--;
								} else if (local110 < local131) {
									local1344.method2097(local110 + 1, local110);
									local110++;
								}
							}
						} else {
							local1344.method2097(Static53.anInt5279, Static242.anInt4793);
						}
						Static283.aClass1_Sub11_Sub1_3.method2697(168);
						Static283.aClass1_Sub11_Sub1_3.method2645(local1346);
						Static283.aClass1_Sub11_Sub1_3.method2658(Static185.aClass71_16.anInt2655);
						Static283.aClass1_Sub11_Sub1_3.method2677(Static53.anInt5279);
						Static283.aClass1_Sub11_Sub1_3.method2648(Static242.anInt4793);
					}
				} else if ((Static1.anInt4243 == 1 || Static102.method1910(Static134.anInt2945 - 1)) && Static134.anInt2945 > 2) {
					Static270.method4085();
				} else if (Static134.anInt2945 > 0) {
					Static193.method3192();
				}
				Static93.anInt2134 = 10;
				Static185.aClass71_16 = null;
				Static123.anInt2804 = 0;
			}
		}
		Static68.aBoolean105 = false;
		Static29.aClass71_2 = null;
		Static62.aBoolean94 = false;
		local1344 = Static247.aClass71_21;
		Static247.aClass71_21 = null;
		Static53.anInt5284 = 0;
		@Pc(1495) Class71 local1495 = Static48.aClass71_6;
		Static48.aClass71_6 = null;
		while (Static71.method1267() && Static53.anInt5284 < 128) {
			Static216.anIntArray383[Static53.anInt5284] = Static49.anInt1134;
			Static265.anIntArray460[Static53.anInt5284] = Static125.aChar2;
			Static53.anInt5284++;
		}
		Static170.aClass71_15 = null;
		if (Static116.anInt5593 != -1) {
			Static123.method2169(Static148.anInt3206, 0, Static116.anInt5593, 0, 0, Static3.anInt122, 0);
		}
		Static23.anInt471++;
		while (true) {
			@Pc(1558) Class71 local1558;
			@Pc(1549) Class71 local1549;
			@Pc(1544) Class1_Sub14 local1544;
			do {
				local1544 = (Class1_Sub14) Static170.aClass61_19.method1850();
				if (local1544 == null) {
					while (true) {
						do {
							local1544 = (Class1_Sub14) Static108.aClass61_13.method1850();
							if (local1544 == null) {
								while (true) {
									do {
										local1544 = (Class1_Sub14) Static276.aClass61_16.method1850();
										if (local1544 == null) {
											if (Static170.aClass71_15 == null) {
												Static220.anInt4370 = 0;
											}
											if (Static84.aClass71_11 != null) {
												Static43.method759();
											}
											if (Static31.anInt745 > 0 && Static175.aBooleanArray34[82] && Static175.aBooleanArray34[81] && Static160.anInt3450 != 0) {
												local110 = Static140.anInt3034 - Static160.anInt3450;
												if (local110 < 0) {
													local110 = 0;
												} else if (local110 > 3) {
													local110 = 3;
												}
												Static259.method3977(Static197.aClass14_Sub2_Sub1_2.anIntArray415[0] + Static53.anInt5288, Static197.aClass14_Sub2_Sub1_2.anIntArray418[0] + Static83.anInt1875, local110);
											}
											if (Static31.anInt745 > 0 && Static175.aBooleanArray34[82] && Static175.aBooleanArray34[81]) {
												if (Static258.anInt5067 != -1) {
													Static259.method3977(Static53.anInt5288 + Static258.anInt5067, Static83.anInt1875 + Static296.anInt5586, Static140.anInt3034);
												}
												Static205.anInt4155 = 0;
												Static117.anInt2670 = 0;
											} else if (Static117.anInt2670 == 2) {
												if (Static258.anInt5067 != -1) {
													Static283.aClass1_Sub11_Sub1_3.method2697(142);
													Static283.aClass1_Sub11_Sub1_3.method2648(Static258.anInt5067 + Static53.anInt5288);
													Static283.aClass1_Sub11_Sub1_3.method2648(Static296.anInt5586 + Static83.anInt1875);
													Static283.aClass1_Sub11_Sub1_3.method2648(Static291.anInt5525);
													Static283.aClass1_Sub11_Sub1_3.method2670(Static90.anInt2022);
													Static216.anInt4283 = 0;
													Static225.anInt4483 = Static249.anInt4936;
													Static127.anInt2837 = 1;
													Static170.anInt3632 = Static40.anInt1015;
												}
												Static117.anInt2670 = 0;
											} else if (Static205.anInt4155 == 2) {
												if (Static258.anInt5067 != -1) {
													Static283.aClass1_Sub11_Sub1_3.method2697(94);
													Static283.aClass1_Sub11_Sub1_3.method2648(Static53.anInt5288 + Static258.anInt5067);
													Static283.aClass1_Sub11_Sub1_3.method2677(Static83.anInt1875 + Static296.anInt5586);
													Static225.anInt4483 = Static249.anInt4936;
													Static127.anInt2837 = 1;
													Static170.anInt3632 = Static40.anInt1015;
													Static216.anInt4283 = 0;
												}
												Static205.anInt4155 = 0;
											} else if (Static258.anInt5067 != -1 && Static117.anInt2670 == 0 && Static205.anInt4155 == 0) {
												Static25.method523((Static296.anInt5586 << 1) + 1 - Static197.aClass14_Sub2_Sub1_2.method3656() >> 1, (Static258.anInt5067 << 1) + 1 - Static197.aClass14_Sub2_Sub1_2.method3656() >> 1, 0);
												Static170.anInt3632 = Static40.anInt1015;
												Static216.anInt4283 = 0;
												Static127.anInt2837 = 1;
												Static225.anInt4483 = Static249.anInt4936;
											}
											Static258.anInt5067 = -1;
											Static3.method145();
											if (local1344 != Static247.aClass71_21) {
												if (local1344 != null) {
													Static160.method2779(local1344);
												}
												if (Static247.aClass71_21 != null) {
													Static160.method2779(Static247.aClass71_21);
												}
											}
											if (local1495 != Static48.aClass71_6 && Static212.anInt4225 == Static176.anInt3731) {
												if (local1495 != null) {
													Static160.method2779(local1495);
												}
												if (Static48.aClass71_6 != null) {
													Static160.method2779(Static48.aClass71_6);
												}
											}
											if (Static48.aClass71_6 == null) {
												if (Static176.anInt3731 > 0) {
													Static176.anInt3731--;
												}
											} else if (Static212.anInt4225 > Static176.anInt3731) {
												Static176.anInt3731++;
												if (Static176.anInt3731 == Static212.anInt4225) {
													Static160.method2779(Static48.aClass71_6);
												}
											}
											for (local110 = 0; local110 < 5; local110++) {
												@Pc(1990) int local1990 = Static246.anIntArray427[local110]++;
											}
											local110 = Static35.method1452();
											local131 = Static45.method910();
											if (local110 > 15000 && local131 > 15000) {
												Static107.anInt2505 = 250;
												Static278.method4236(14500);
												Static283.aClass1_Sub11_Sub1_3.method2697(199);
											}
											if (Static244.aClass116_5 != null && Static244.aClass116_5.anInt3812 == 1) {
												if (Static244.aClass116_5.anObject5 != null) {
													Static85.method1482(Static196.aBoolean168, Static262.aString303);
												}
												Static244.aClass116_5 = null;
												Static262.aString303 = null;
												Static196.aBoolean168 = false;
											}
											Static73.anInt1550++;
											Static241.anInt4779++;
											if (Static73.anInt1550 > 500) {
												local788 = (int) (Math.random() * 8.0D);
												if ((local788 & 0x1) == 1) {
													anInt1182 += Static169.anInt3624;
												}
												Static73.anInt1550 = 0;
												if ((local788 & 0x2) == 2) {
													Static78.anInt1744 += Static89.anInt1997;
												}
												if ((local788 & 0x4) == 4) {
													Static118.anInt2738 += Static273.anInt5327;
												}
											}
											if (Static118.anInt2738 < -40) {
												Static273.anInt5327 = 1;
											}
											Static26.anInt628++;
											if (Static26.anInt628 > 500) {
												local788 = (int) (Math.random() * 8.0D);
												if ((local788 & 0x2) == 2) {
													Static1.anInt4245 += Static270.anInt5277;
												}
												if ((local788 & 0x1) == 1) {
													Static245.anInt4881 += Static25.anInt620;
												}
												Static26.anInt628 = 0;
											}
											if (Static245.anInt4881 < -60) {
												Static25.anInt620 = 2;
											}
											if (Static1.anInt4245 < -20) {
												Static270.anInt5277 = 1;
											}
											if (anInt1182 < -50) {
												Static169.anInt3624 = 2;
											}
											if (Static245.anInt4881 > 60) {
												Static25.anInt620 = -2;
											}
											if (Static118.anInt2738 > 40) {
												Static273.anInt5327 = -1;
											}
											if (Static78.anInt1744 < -55) {
												Static89.anInt1997 = 2;
											}
											if (Static1.anInt4245 > 10) {
												Static270.anInt5277 = -1;
											}
											if (Static78.anInt1744 > 55) {
												Static89.anInt1997 = -2;
											}
											if (anInt1182 > 50) {
												Static169.anInt3624 = -2;
											}
											if (Static241.anInt4779 > 50) {
												Static283.aClass1_Sub11_Sub1_3.method2697(242);
											}
											if (Static179.aBoolean285) {
												Static128.method2193();
												Static179.aBoolean285 = false;
											}
											try {
												if (Static87.aClass113_1 != null && Static283.aClass1_Sub11_Sub1_3.anInt3264 > 0) {
													Static87.aClass113_1.method3017(Static283.aClass1_Sub11_Sub1_3.anInt3264, Static283.aClass1_Sub11_Sub1_3.aByteArray47);
													Static241.anInt4779 = 0;
													Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
												}
											} catch (@Pc(2251) IOException local2251) {
												Static136.method3363();
											}
											return;
										}
										local1549 = local1544.aClass71_8;
										if (local1549.anInt2689 < 0) {
											break;
										}
										local1558 = Static56.method1058(local1549.anInt2674);
									} while (local1558 == null || local1558.aClass71Array1 == null || local1549.anInt2689 >= local1558.aClass71Array1.length || local1549 != local1558.aClass71Array1[local1549.anInt2689]);
									Static188.method3144(local1544);
								}
							}
							local1549 = local1544.aClass71_8;
							if (local1549.anInt2689 < 0) {
								break;
							}
							local1558 = Static56.method1058(local1549.anInt2674);
						} while (local1558 == null || local1558.aClass71Array1 == null || local1558.aClass71Array1.length <= local1549.anInt2689 || local1558.aClass71Array1[local1549.anInt2689] != local1549);
						Static188.method3144(local1544);
					}
				}
				local1549 = local1544.aClass71_8;
				if (local1549.anInt2689 < 0) {
					break;
				}
				local1558 = Static56.method1058(local1549.anInt2674);
			} while (local1558 == null || local1558.aClass71Array1 == null || local1549.anInt2689 >= local1558.aClass71Array1.length || local1549 != local1558.aClass71Array1[local1549.anInt2689]);
			Static188.method3144(local1544);
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)I")
	public static int method1026(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			local1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local1++;
		}
		return local1 + arg0;
	}
}
