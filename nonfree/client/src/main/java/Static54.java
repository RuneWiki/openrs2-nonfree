import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!ia;")
	public static Class51 aClass51_381 = Static64.method1101(" <col=ffffff>");

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!ia;")
	public static Class51 aClass51_382 = Static64.method1101("hint_headicons");

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
	public static int anInt1263 = 0;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
	public static int anInt1264 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public static boolean method933(@OriginalArg(0) int arg0) {
		if (Static122.aBooleanArray18[arg0]) {
			return true;
		} else if (Static111.aClass70_26.method3534(arg0)) {
			@Pc(23) int local23 = Static111.aClass70_26.method3532(arg0);
			if (local23 == 0) {
				Static122.aBooleanArray18[arg0] = true;
				return true;
			}
			if (Static64.aClass71ArrayArray1[arg0] == null) {
				Static64.aClass71ArrayArray1[arg0] = new Class71[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static64.aClass71ArrayArray1[arg0][local45] == null) {
					@Pc(61) byte[] local61 = Static111.aClass70_26.method3509(local45, arg0);
					if (local61 != null) {
						Static64.aClass71ArrayArray1[arg0][local45] = new Class71();
						Static64.aClass71ArrayArray1[arg0][local45].anInt2807 = (arg0 << 16) + local45;
						if (local61[0] == -1) {
							Static64.aClass71ArrayArray1[arg0][local45].method2213(new Class1_Sub16(local61));
						} else {
							Static64.aClass71ArrayArray1[arg0][local45].method2210(new Class1_Sub16(local61));
						}
					}
				}
			}
			Static122.aBooleanArray18[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lclient!ia;")
	public static Class51 method936(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static27.method511(arg0) : Static82.aClass51_610;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method938() {
		if (Static90.anInt4704 > 1) {
			Static90.anInt4704--;
			Static149.anInt3253 = Static27.anInt651;
		}
		if (Static116.anInt1292 > 0) {
			Static116.anInt1292--;
		}
		if (Static200.aBoolean192) {
			Static200.aBoolean192 = false;
			Static127.method2209();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static87.method1503(); local32++) {
		}
		if (Static47.anInt1142 != 30) {
			return;
		}
		Static219.method3610(Static167.aClass1_Sub16_Sub1_2);
		@Pc(54) Object local54 = Static3.aClass26_1.anObject1;
		@Pc(84) int local84;
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(102) int local102;
		@Pc(119) int local119;
		@Pc(134) boolean local134;
		@Pc(175) int local175;
		synchronized (Static3.aClass26_1.anObject1) {
			if (!Static223.aBoolean211) {
				Static3.aClass26_1.anInt711 = 0;
			} else if (Static15.anInt371 != 0 || Static3.aClass26_1.anInt711 >= 40) {
				Static167.aClass1_Sub16_Sub1_2.method3823(102);
				Static167.aClass1_Sub16_Sub1_2.method3765(0);
				local81 = 0;
				local84 = Static167.aClass1_Sub16_Sub1_2.anInt4860;
				for (local86 = 0; Static3.aClass26_1.anInt711 > local86 && Static167.aClass1_Sub16_Sub1_2.anInt4860 - local84 < 240; local86++) {
					local102 = Static3.aClass26_1.anIntArray47[local86];
					local81++;
					if (local102 < 0) {
						local102 = 0;
					} else if (local102 > 65534) {
						local102 = 65534;
					}
					local119 = Static3.aClass26_1.anIntArray46[local86];
					if (local119 < 0) {
						local119 = 0;
					} else if (local119 > 65534) {
						local119 = 65534;
					}
					local134 = false;
					if (Static3.aClass26_1.anIntArray47[local86] == -1 && Static3.aClass26_1.anIntArray46[local86] == -1) {
						local119 = -1;
						local102 = -1;
						local134 = true;
					}
					if (local119 != Static216.anInt4585 || local102 != Static229.anInt4872) {
						local175 = local119 - Static216.anInt4585;
						Static216.anInt4585 = local119;
						@Pc(182) int local182 = local102 - Static229.anInt4872;
						Static229.anInt4872 = local102;
						if (Static207.anInt4437 < 8 && local175 >= -32 && local175 <= 31 && local182 >= -32 && local182 <= 31) {
							local182 += 32;
							local175 += 32;
							Static167.aClass1_Sub16_Sub1_2.method3807((local175 << 6) + (Static207.anInt4437 << 12) + local182);
							Static207.anInt4437 = 0;
						} else if (Static207.anInt4437 < 32 && local175 >= -128 && local175 <= 127 && local182 >= -128 && local182 <= 127) {
							local182 += 128;
							Static167.aClass1_Sub16_Sub1_2.method3765(Static207.anInt4437 + 128);
							local175 += 128;
							Static167.aClass1_Sub16_Sub1_2.method3807((local175 << 8) + local182);
							Static207.anInt4437 = 0;
						} else if (Static207.anInt4437 < 32) {
							Static167.aClass1_Sub16_Sub1_2.method3765(Static207.anInt4437 + 192);
							if (local134) {
								Static167.aClass1_Sub16_Sub1_2.method3808(Integer.MIN_VALUE);
							} else {
								Static167.aClass1_Sub16_Sub1_2.method3808(local119 | local102 << 16);
							}
							Static207.anInt4437 = 0;
						} else {
							Static167.aClass1_Sub16_Sub1_2.method3807(Static207.anInt4437 + 57344);
							if (local134) {
								Static167.aClass1_Sub16_Sub1_2.method3808(Integer.MIN_VALUE);
							} else {
								Static167.aClass1_Sub16_Sub1_2.method3808(local102 << 16 | local119);
							}
							Static207.anInt4437 = 0;
						}
					} else if (Static207.anInt4437 < 2047) {
						Static207.anInt4437++;
					}
				}
				Static167.aClass1_Sub16_Sub1_2.method3816(Static167.aClass1_Sub16_Sub1_2.anInt4860 - local84);
				if (local81 < Static3.aClass26_1.anInt711) {
					Static3.aClass26_1.anInt711 -= local81;
					for (local102 = 0; local102 < Static3.aClass26_1.anInt711; local102++) {
						Static3.aClass26_1.anIntArray46[local102] = Static3.aClass26_1.anIntArray46[local81 + local102];
						Static3.aClass26_1.anIntArray47[local102] = Static3.aClass26_1.anIntArray47[local81 + local102];
					}
				} else {
					Static3.aClass26_1.anInt711 = 0;
				}
			}
		}
		if (Static15.anInt371 != 0) {
			@Pc(401) long local401 = (Static150.aLong116 - Static139.aLong110) / 50L;
			local84 = Static106.anInt2346;
			local81 = Static148.anInt3214;
			Static139.aLong110 = Static150.aLong116;
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > 65535) {
				local81 = 65535;
			}
			@Pc(422) byte local422 = 0;
			if (local401 > 32767L) {
				local401 = 32767L;
			}
			local102 = (int) local401;
			if (Static15.anInt371 == 2) {
				local422 = 1;
			}
			Static167.aClass1_Sub16_Sub1_2.method3823(241);
			if (local84 < 0) {
				local84 = 0;
			} else if (local84 > 65535) {
				local84 = 65535;
			}
			Static167.aClass1_Sub16_Sub1_2.method3808(local81 | local84 << 16);
			Static167.aClass1_Sub16_Sub1_2.method3796(local422 << 15 | local102);
		}
		if (Static45.anInt1102 > 0) {
			Static45.anInt1102--;
		}
		if (Static208.aBooleanArray25[96] || Static208.aBooleanArray25[97] || Static208.aBooleanArray25[98] || Static208.aBooleanArray25[99]) {
			Static57.aBoolean68 = true;
		}
		if (Static57.aBoolean68 && Static45.anInt1102 <= 0) {
			Static45.anInt1102 = 20;
			Static57.aBoolean68 = false;
			Static167.aClass1_Sub16_Sub1_2.method3823(226);
			Static167.aClass1_Sub16_Sub1_2.method3796(Static20.anInt552);
			Static167.aClass1_Sub16_Sub1_2.method3807(Static16.anInt379);
		}
		if (Static24.aBoolean25 && !Static207.aBoolean201) {
			Static207.aBoolean201 = true;
			Static167.aClass1_Sub16_Sub1_2.method3823(173);
			Static167.aClass1_Sub16_Sub1_2.method3765(1);
		}
		if (!Static24.aBoolean25 && Static207.aBoolean201) {
			Static207.aBoolean201 = false;
			Static167.aClass1_Sub16_Sub1_2.method3823(173);
			Static167.aClass1_Sub16_Sub1_2.method3765(0);
		}
		if (!Static151.aBoolean158) {
			Static167.aClass1_Sub16_Sub1_2.method3823(57);
			Static167.aClass1_Sub16_Sub1_2.method3772(Static21.method466());
			Static151.aBoolean158 = true;
		}
		Static6.method97();
		if (Static47.anInt1142 != 30) {
			return;
		}
		Static10.method160();
		Static201.method3306();
		Static135.anInt3042++;
		if (Static135.anInt3042 > 750) {
			Static127.method2209();
			return;
		}
		Static185.method3103();
		Static149.method2569();
		Static192.method3222();
		if (Static218.aClass71_21 != null) {
			Static184.method3096();
		}
		for (@Pc(630) int local630 = Static224.method3672(true); local630 != -1; local630 = Static224.method3672(false)) {
			Static99.method1646(local630);
			Static123.anIntArray163[Static119.anInt4278++ & 0x1F] = local630;
		}
		for (@Pc(655) Class1_Sub2_Sub10 local655 = Static122.method2153(); local655 != null; local655 = Static122.method2153()) {
			local84 = local655.method1526();
			local81 = local655.method1529();
			if (local84 == 1) {
				Static7.anIntArray9[local81] = local655.anInt2036;
				Static88.anIntArray126[Static221.anInt4648++ & 0x1F] = local81;
			} else if (local84 == 2) {
				Static107.aClass51Array12[local81] = local655.aClass51_654;
				Static56.anIntArray229[Static176.anInt3865++ & 0x1F] = local81;
			}
		}
		Static48.anInt1156++;
		if (Static68.anInt1547 != 0) {
			Static12.anInt320 += 20;
			if (Static12.anInt320 >= 400) {
				Static68.anInt1547 = 0;
			}
		}
		if (Static61.aClass71_13 != null) {
			Static61.anInt1427++;
			if (Static61.anInt1427 >= 15) {
				Static82.method1438(Static61.aClass71_13);
				Static61.aClass71_13 = null;
			}
		}
		@Pc(837) Class71 local837;
		if (Static229.aClass71_31 != null) {
			Static82.method1438(Static229.aClass71_31);
			Static151.anInt3327++;
			if (Static205.anInt4361 > Static169.anInt3805 + 5 || Static169.anInt3805 - 5 > Static205.anInt4361 || Static15.anInt373 > Static36.anInt866 + 5 || Static15.anInt373 < Static36.anInt866 - 5) {
				Static36.aBoolean44 = true;
			}
			if (Static71.anInt1636 == 0) {
				if (Static36.aBoolean44 && Static151.anInt3327 >= 5) {
					if (Static229.aClass71_31 == Static5.aClass71_29 && Static71.anInt1631 != Static46.anInt1132) {
						@Pc(835) byte local835 = 0;
						local837 = Static229.aClass71_31;
						if (Static11.anInt236 == 1 && local837.anInt2815 == 206) {
							local835 = 1;
						}
						if (local837.anIntArray177[Static71.anInt1631] <= 0) {
							local835 = 0;
						}
						if (Static119.method3322(Static33.method587(local837))) {
							local86 = Static46.anInt1132;
							local102 = Static71.anInt1631;
							local837.anIntArray177[local102] = local837.anIntArray177[local86];
							local837.anIntArray184[local102] = local837.anIntArray184[local86];
							local837.anIntArray177[local86] = -1;
							local837.anIntArray184[local86] = 0;
						} else if (local835 == 1) {
							local86 = Static46.anInt1132;
							local102 = Static71.anInt1631;
							while (local86 != local102) {
								if (local86 > local102) {
									local837.method2208(local86 - 1, local86);
									local86--;
								} else if (local86 < local102) {
									local837.method2208(local86 + 1, local86);
									local86++;
								}
							}
						} else {
							local837.method2208(Static71.anInt1631, Static46.anInt1132);
						}
						Static167.aClass1_Sub16_Sub1_2.method3823(84);
						Static167.aClass1_Sub16_Sub1_2.method3813(Static229.aClass71_31.anInt2807);
						Static167.aClass1_Sub16_Sub1_2.method3760(Static71.anInt1631);
						Static167.aClass1_Sub16_Sub1_2.method3807(Static46.anInt1132);
						Static167.aClass1_Sub16_Sub1_2.method3765(local835);
					}
				} else if ((Static179.anInt3918 == 1 || Static62.method1084(Static202.anInt4289 - 1)) && Static202.anInt4289 > 2) {
					Static58.method1031();
				} else if (Static202.anInt4289 > 0) {
					Static179.method3039(Static202.anInt4289 - 1);
				}
				Static229.aClass71_31 = null;
				Static15.anInt371 = 0;
				Static61.anInt1427 = 10;
			}
		}
		Static125.anInt3560 = 0;
		Static32.aBoolean27 = false;
		Static100.aBoolean91 = false;
		local837 = Static86.aClass71_18;
		Static75.aClass71_11 = null;
		@Pc(977) Class71 local977 = Static93.aClass71_19;
		Static93.aClass71_19 = null;
		Static86.aClass71_18 = null;
		while (Static13.method276() && Static125.anInt3560 < 128) {
			Static187.anIntArray306[Static125.anInt3560] = Static16.anInt385;
			Static13.anIntArray15[Static125.anInt3560] = Static199.anInt4229;
			Static125.anInt3560++;
		}
		Static218.aClass71_21 = null;
		if (Static9.anInt179 != -1) {
			Static147.method2525(0, Static9.anInt179, Static185.anInt4016, 0, 0, Static90.anInt4701, 0);
		}
		Static27.anInt651++;
		while (true) {
			@Pc(1024) Class1_Sub21 local1024;
			@Pc(1040) Class71 local1040;
			@Pc(1029) Class71 local1029;
			do {
				local1024 = (Class1_Sub21) Static39.aClass105_5.method3117();
				if (local1024 == null) {
					while (true) {
						do {
							local1024 = (Class1_Sub21) Static68.aClass105_8.method3117();
							if (local1024 == null) {
								while (true) {
									do {
										local1024 = (Class1_Sub21) Static152.aClass105_17.method3117();
										if (local1024 == null) {
											if (Static115.aBoolean102 && Static218.aClass71_21 == null) {
												Static115.aBoolean102 = false;
											}
											if (Static111.aClass71_22 != null) {
												Static124.method3527();
											}
											if (Static36.anInt872 != -1) {
												local102 = Static36.anInt872;
												local119 = Static66.anInt1486;
												local134 = Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local102, 0, 0, 0, local119, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, true, 0, 0);
												Static36.anInt872 = -1;
												if (local134) {
													Static12.anInt320 = 0;
													Static160.anInt3453 = Static148.anInt3214;
													Static68.anInt1547 = 1;
													Static83.anInt1948 = Static106.anInt2346;
												}
											}
											Static74.method1294();
											if (Static86.aClass71_18 != local837) {
												if (local837 != null) {
													Static82.method1438(local837);
												}
												if (Static86.aClass71_18 != null) {
													Static82.method1438(Static86.aClass71_18);
												}
											}
											if (local977 != Static93.aClass71_19 && Static158.anInt3439 == Static46.anInt1125) {
												if (local977 != null) {
													Static82.method1438(local977);
												}
												if (Static93.aClass71_19 != null) {
													Static82.method1438(Static93.aClass71_19);
												}
											}
											if (Static93.aClass71_19 == null) {
												if (Static158.anInt3439 > 0) {
													Static158.anInt3439--;
												}
											} else if (Static158.anInt3439 < Static46.anInt1125) {
												Static158.anInt3439++;
												if (Static158.anInt3439 == Static46.anInt1125) {
													Static82.method1438(Static93.aClass71_19);
												}
											}
											if (Static70.anInt1624 == 1) {
												Static182.method3077();
											} else if (Static70.anInt1624 == 2) {
												Static5.method2789();
											} else {
												Static85.method1494();
											}
											for (local102 = 0; local102 < 5; local102++) {
												@Pc(1315) int local1315 = Static112.anIntArray142[local102]++;
											}
											local119 = Static202.method3326();
											@Pc(1328) int local1328 = Static2.method63();
											if (local119 > 4500 && local1328 > 4500) {
												Static116.anInt1292 = 250;
												Static183.method3085(4000);
												Static167.aClass1_Sub16_Sub1_2.method3823(208);
											}
											Static200.anInt4250++;
											Static2.anInt73++;
											if (Static2.anInt73 > 500) {
												Static2.anInt73 = 0;
												local175 = (int) (Math.random() * 8.0D);
												if ((local175 & 0x1) == 1) {
													Static76.anInt1703 += Static138.anInt3087;
												}
												if ((local175 & 0x4) == 4) {
													Static36.anInt870 += Static129.anInt2893;
												}
												if ((local175 & 0x2) == 2) {
													Static13.anInt321 += Static123.anInt2713;
												}
											}
											if (Static13.anInt321 < -55) {
												Static123.anInt2713 = 2;
											}
											Static192.anInt4170++;
											if (Static13.anInt321 > 55) {
												Static123.anInt2713 = -2;
											}
											if (Static76.anInt1703 < -50) {
												Static138.anInt3087 = 2;
											}
											if (Static76.anInt1703 > 50) {
												Static138.anInt3087 = -2;
											}
											if (Static36.anInt870 < -40) {
												Static129.anInt2893 = 1;
											}
											if (Static200.anInt4250 > 500) {
												local175 = (int) (Math.random() * 8.0D);
												if ((local175 & 0x2) == 2) {
													Static151.anInt3331 += Static104.anInt2295;
												}
												Static200.anInt4250 = 0;
												if ((local175 & 0x1) == 1) {
													Static45.anInt1100 += Static207.anInt4424;
												}
											}
											if (Static45.anInt1100 < -60) {
												Static207.anInt4424 = 2;
											}
											if (Static36.anInt870 > 40) {
												Static129.anInt2893 = -1;
											}
											if (Static45.anInt1100 > 60) {
												Static207.anInt4424 = -2;
											}
											if (Static151.anInt3331 < -20) {
												Static104.anInt2295 = 1;
											}
											if (Static151.anInt3331 > 10) {
												Static104.anInt2295 = -1;
											}
											if (Static192.anInt4170 > 50) {
												Static167.aClass1_Sub16_Sub1_2.method3823(138);
											}
											Static147.method2524();
											try {
												if (Static192.aClass11_36 != null && Static167.aClass1_Sub16_Sub1_2.anInt4860 > 0) {
													Static192.aClass11_36.method269(Static167.aClass1_Sub16_Sub1_2.anInt4860, Static167.aClass1_Sub16_Sub1_2.aByteArray62);
													Static167.aClass1_Sub16_Sub1_2.anInt4860 = 0;
													Static192.anInt4170 = 0;
													return;
												}
												return;
											} catch (@Pc(1525) IOException local1525) {
												Static127.method2209();
												return;
											}
										}
										local1029 = local1024.aClass71_25;
										if (local1029.anInt2788 < 0) {
											break;
										}
										local1040 = Static7.method102(local1029.anInt2785);
									} while (local1040 == null || local1040.aClass71Array2 == null || local1029.anInt2788 >= local1040.aClass71Array2.length || local1040.aClass71Array2[local1029.anInt2788] != local1029);
									Static65.method1119(local1024);
								}
							}
							local1029 = local1024.aClass71_25;
							if (local1029.anInt2788 < 0) {
								break;
							}
							local1040 = Static7.method102(local1029.anInt2785);
						} while (local1040 == null || local1040.aClass71Array2 == null || local1029.anInt2788 >= local1040.aClass71Array2.length || local1029 != local1040.aClass71Array2[local1029.anInt2788]);
						Static65.method1119(local1024);
					}
				}
				local1029 = local1024.aClass71_25;
				if (local1029.anInt2788 < 0) {
					break;
				}
				local1040 = Static7.method102(local1029.anInt2785);
			} while (local1040 == null || local1040.aClass71Array2 == null || local1040.aClass71Array2.length <= local1029.anInt2788 || local1040.aClass71Array2[local1029.anInt2788] != local1029);
			Static65.method1119(local1024);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public static void method941() {
		Static225.aClass1_Sub4_Sub1_3.method379();
		Static3.aClass70_1 = null;
		Static198.anInt4222 = 1;
	}
}
