import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ue", name = "ec", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!ue", name = "uc", descriptor = "I")
	public static int anInt3006;

	@OriginalMember(owner = "client!ue", name = "gc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1607 = Static28.method504("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ue", name = "hc", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1608 = Static28.method504("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!ue", name = "kc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1609 = Static28.method504("titlebox");

	@OriginalMember(owner = "client!ue", name = "nc", descriptor = "Z")
	public static volatile boolean aBoolean149 = true;

	@OriginalMember(owner = "client!ue", name = "sc", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1610 = aClass39_1608;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	public static void method2074() {
		aClass39_1610 = null;
		anIntArray320 = null;
		aClass39_1609 = null;
		aClass39_1607 = null;
		aClass39_1608 = null;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(II)V")
	public static void method2075(@OriginalArg(1) int arg0) {
		Static42.anInt1070 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
	public static void method2076() {
		Static49.aClass42_7 = new Class42(32);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	private static void method2078() {
		@Pc(17) int local17;
		for (@Pc(7) int local7 = -1; local7 < Static122.anInt3021; local7++) {
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static116.anIntArray312[local7];
			}
			@Pc(25) Class4_Sub2_Sub1_Sub1_Sub1 local25 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local17];
			if (local25 != null && local25.anInt2672 > 0) {
				local25.anInt2672--;
				if (local25.anInt2672 == 0) {
					local25.aClass39_1411 = null;
				}
			}
		}
		for (local17 = 0; local17 < Static72.anInt799; local17++) {
			@Pc(64) int local64 = Static33.anIntArray94[local17];
			@Pc(68) Class4_Sub2_Sub1_Sub1_Sub2 local68 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local64];
			if (local68 != null && local68.anInt2672 > 0) {
				local68.anInt2672--;
				if (local68.anInt2672 == 0) {
					local68.aClass39_1411 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!q;)V")
	public static void method2079(@OriginalArg(1) Class4_Sub2_Sub3_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static64.anIntArray177.length; local7++) {
			Static64.anIntArray177[local7] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(23) int local23 = 0; local23 < 5000; local23++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static64.anIntArray177[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(59) int local59;
		for (local32 = 0; local32 < 20; local32++) {
			for (local48 = 1; local48 < 255; local48++) {
				for (local51 = 1; local51 < 127; local51++) {
					local59 = local51 + (local48 << 7);
					Static1.anIntArray2[local59] = (Static64.anIntArray177[local59 + 1] + Static64.anIntArray177[local59 - 1] + Static64.anIntArray177[local59 - 128] + Static64.anIntArray177[local59 + 128]) / 4;
				}
			}
			@Pc(100) int[] local100 = Static64.anIntArray177;
			Static64.anIntArray177 = Static1.anIntArray2;
			Static1.anIntArray2 = local100;
		}
		if (arg0 == null) {
			return;
		}
		local48 = 0;
		for (local51 = 0; local51 < arg0.anInt2266; local51++) {
			for (local59 = 0; local59 < arg0.anInt2267; local59++) {
				if (arg0.aByteArray25[local48++] != 0) {
					@Pc(136) int local136 = local51 + arg0.anInt2262 + 16;
					@Pc(143) int local143 = arg0.anInt2265 + local59 + 16;
					@Pc(149) int local149 = local143 + (local136 << 7);
					Static64.anIntArray177[local149] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!pd;II)Lclient!mf;")
	public static Class4_Sub2_Sub3_Sub3 method2080(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static55.method977(arg2, arg1, arg0) ? Static71.method1191() : null;
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V")
	public static void method2081() {
		Static120.aClass12_82.method233();
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "(B)V")
	public static void method2082() {
		if (Static44.anInt1128 > 0) {
			Static44.anInt1128--;
		}
		if (Static23.anInt653 > 1) {
			Static23.anInt653--;
		}
		if (Static46.aBoolean53) {
			Static46.aBoolean53 = false;
			Static43.method738();
			return;
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static84.method1516(); local35++) {
		}
		if (Static88.anInt2205 != 30) {
			return;
		}
		Static26.method435(Static114.aClass4_Sub16_Sub1_3);
		@Pc(59) Object local59 = Static104.aClass70_1.anObject4;
		@Pc(90) int local90;
		@Pc(96) int local96;
		@Pc(98) int local98;
		@Pc(113) int local113;
		@Pc(118) int local118;
		synchronized (Static104.aClass70_1.anObject4) {
			if (!Static83.aBoolean105) {
				Static104.aClass70_1.anInt2598 = 0;
			} else if (Static62.anInt1637 != 0 || Static104.aClass70_1.anInt2598 >= 40) {
				Static114.aClass4_Sub16_Sub1_3.method1499(238);
				Static114.aClass4_Sub16_Sub1_3.method1459(0);
				local90 = Static114.aClass4_Sub16_Sub1_3.anInt2019;
				local96 = 0;
				for (local98 = 0; local98 < Static104.aClass70_1.anInt2598 && Static114.aClass4_Sub16_Sub1_3.anInt2019 - local90 < 240; local98++) {
					local113 = Static104.aClass70_1.anIntArray288[local98];
					local118 = Static104.aClass70_1.anIntArray289[local98];
					local96++;
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 502) {
						local113 = 502;
					}
					if (local118 < 0) {
						local118 = 0;
					} else if (local118 > 764) {
						local118 = 764;
					}
					@Pc(150) int local150 = local113 * 765 + local118;
					if (Static104.aClass70_1.anIntArray288[local98] == -1 && Static104.aClass70_1.anIntArray289[local98] == -1) {
						local118 = -1;
						local150 = 524287;
						local113 = -1;
					}
					if (local118 != Static102.anInt2552 || Static74.anInt1782 != local113) {
						@Pc(191) int local191 = local118 - Static102.anInt2552;
						@Pc(196) int local196 = local113 - Static74.anInt1782;
						Static74.anInt1782 = local113;
						Static102.anInt2552 = local118;
						if (Static74.anInt1775 < 8 && local191 >= -32 && local191 <= 31 && local196 >= -32 && local196 <= 31) {
							local196 += 32;
							local191 += 32;
							Static114.aClass4_Sub16_Sub1_3.method1488(local196 + (Static74.anInt1775 << 12) + (local191 << 6));
							Static74.anInt1775 = 0;
						} else if (Static74.anInt1775 < 8) {
							Static114.aClass4_Sub16_Sub1_3.method1452(local150 + (Static74.anInt1775 << 19) + 8388608);
							Static74.anInt1775 = 0;
						} else {
							Static114.aClass4_Sub16_Sub1_3.method1489((Static74.anInt1775 << 19) + local150 - 1073741824);
							Static74.anInt1775 = 0;
						}
					} else if (Static74.anInt1775 < 2047) {
						Static74.anInt1775++;
					}
				}
				Static114.aClass4_Sub16_Sub1_3.method1482(Static114.aClass4_Sub16_Sub1_3.anInt2019 - local90);
				if (Static104.aClass70_1.anInt2598 <= local96) {
					Static104.aClass70_1.anInt2598 = 0;
				} else {
					Static104.aClass70_1.anInt2598 -= local96;
					for (local113 = 0; local113 < Static104.aClass70_1.anInt2598; local113++) {
						Static104.aClass70_1.anIntArray289[local113] = Static104.aClass70_1.anIntArray289[local113 + local96];
						Static104.aClass70_1.anIntArray288[local113] = Static104.aClass70_1.anIntArray288[local96 + local113];
					}
				}
			}
		}
		if (Static62.anInt1637 != 0) {
			@Pc(347) long local347 = (Static38.aLong40 - Static9.aLong16) / 50L;
			local90 = Static1.anInt9;
			if (local90 < 0) {
				local90 = 0;
			} else if (local90 > 502) {
				local90 = 502;
			}
			if (local347 > 4095L) {
				local347 = 4095L;
			}
			Static9.aLong16 = Static38.aLong40;
			local96 = Static27.anInt741;
			@Pc(376) byte local376 = 0;
			local118 = (int) local347;
			if (Static62.anInt1637 == 2) {
				local376 = 1;
			}
			Static114.aClass4_Sub16_Sub1_3.method1499(213);
			if (local96 < 0) {
				local96 = 0;
			} else if (local96 > 764) {
				local96 = 764;
			}
			local98 = local96 + local90 * 765;
			Static114.aClass4_Sub16_Sub1_3.method1468((local376 << 19) + (local118 << 20) + local98);
		}
		if (Static96.aBooleanArray11[96] || Static96.aBooleanArray11[97] || Static96.aBooleanArray11[98] || Static96.aBooleanArray11[99]) {
			Static50.aBoolean68 = true;
		}
		if (Static40.anInt998 > 0) {
			Static40.anInt998--;
		}
		if (Static50.aBoolean68 && Static40.anInt998 <= 0) {
			Static50.aBoolean68 = false;
			Static40.anInt998 = 20;
			Static114.aClass4_Sub16_Sub1_3.method1499(249);
			Static114.aClass4_Sub16_Sub1_3.method1446(Static54.anInt1446);
			Static114.aClass4_Sub16_Sub1_3.method1441(Static53.anInt1401);
		}
		if (Static102.aBoolean124 && !Static83.aBoolean106) {
			Static83.aBoolean106 = true;
			Static114.aClass4_Sub16_Sub1_3.method1499(191);
			Static114.aClass4_Sub16_Sub1_3.method1459(1);
		}
		if (!Static102.aBoolean124 && Static83.aBoolean106) {
			Static83.aBoolean106 = false;
			Static114.aClass4_Sub16_Sub1_3.method1499(191);
			Static114.aClass4_Sub16_Sub1_3.method1459(0);
		}
		Static122.method2092();
		if (Static88.anInt2205 != 30) {
			return;
		}
		Static68.method1173();
		Static75.method1226();
		Static117.anInt2947++;
		if (Static117.anInt2947 > 750) {
			Static43.method738();
			return;
		}
		Static84.method1518();
		Static60.method1068();
		method2078();
		if (Static67.anInt1693 != 0) {
			Static85.anInt2127 += 20;
			if (Static85.anInt2127 >= 400) {
				Static67.anInt1693 = 0;
			}
		}
		Static39.anInt952++;
		if (Static25.aClass4_Sub5_74 != null) {
			Static114.anInt2849++;
			if (Static114.anInt2849 >= 15) {
				Static19.method344(Static25.aClass4_Sub5_74);
				Static25.aClass4_Sub5_74 = null;
			}
		}
		@Pc(671) Class4_Sub5 local671;
		if (Static63.aClass4_Sub5_36 != null) {
			Static19.method344(Static63.aClass4_Sub5_36);
			if (Static88.anInt2198 > Static108.anInt2699 + 5 || Static108.anInt2699 - 5 > Static88.anInt2198 || Static73.anInt1769 > Static44.anInt1129 + 5 || Static73.anInt1769 < Static44.anInt1129 - 5) {
				Static30.aBoolean34 = true;
			}
			Static23.anInt649++;
			if (Static62.anInt1639 == 0) {
				if (Static30.aBoolean34 && Static23.anInt649 >= 5) {
					if (Static100.aClass4_Sub5_54 == Static63.aClass4_Sub5_36 && Static72.anInt800 != Static126.anInt3160) {
						@Pc(665) byte local665 = 0;
						local671 = Static63.aClass4_Sub5_36;
						if (Static129.anInt3149 == 1 && local671.anInt1241 == 206) {
							local665 = 1;
						}
						if (local671.anIntArray130[Static72.anInt800] <= 0) {
							local665 = 0;
						}
						if (Static70.method1189(Static20.method385(local671))) {
							local90 = Static126.anInt3160;
							local96 = Static72.anInt800;
							local671.anIntArray130[local96] = local671.anIntArray130[local90];
							local671.anIntArray134[local96] = local671.anIntArray134[local90];
							local671.anIntArray130[local90] = -1;
							local671.anIntArray134[local90] = 0;
						} else if (local665 == 1) {
							local96 = Static72.anInt800;
							local90 = Static126.anInt3160;
							while (local90 != local96) {
								if (local90 > local96) {
									local671.method795(local90 - 1, local90);
									local90--;
								} else if (local90 < local96) {
									local671.method795(local90 + 1, local90);
									local90++;
								}
							}
						} else {
							local671.method795(Static72.anInt800, Static126.anInt3160);
						}
						Static114.aClass4_Sub16_Sub1_3.method1499(119);
						Static114.aClass4_Sub16_Sub1_3.method1454(Static63.aClass4_Sub5_36.anInt1230);
						Static114.aClass4_Sub16_Sub1_3.method1441(Static72.anInt800);
						Static114.aClass4_Sub16_Sub1_3.method1446(Static126.anInt3160);
						Static114.aClass4_Sub16_Sub1_3.method1459(local665);
					}
				} else if ((Static2.anInt19 == 1 || Static72.method532(Static105.anInt2033 - 1)) && Static105.anInt2033 > 2) {
					Static88.method1612();
				} else if (Static105.anInt2033 > 0) {
					Static67.method1166(Static105.anInt2033 - 1);
				}
				Static114.anInt2849 = 10;
				Static62.anInt1637 = 0;
				Static63.aClass4_Sub5_36 = null;
			}
		}
		local671 = Static83.aClass4_Sub5_43;
		Static2.aClass4_Sub5_1 = null;
		Static83.aClass4_Sub5_43 = null;
		Static74.anInt1773 = 0;
		Static26.aBoolean27 = false;
		@Pc(817) Class4_Sub5 local817 = Static35.aClass4_Sub5_16;
		Static35.aClass4_Sub5_16 = null;
		Static62.aBoolean92 = false;
		while (Static48.method783() && Static74.anInt1773 < 128) {
			Static75.anIntArray197[Static74.anInt1773] = Static35.anInt904;
			Static94.anIntArray249[Static74.anInt1773] = Static55.anInt1496;
			Static74.anInt1773++;
		}
		Static28.method506(0, 765, 0, 0, 0, 503, Static115.anInt2882);
		Static129.anInt3153++;
		Static118.aBoolean146 = false;
		while (true) {
			@Pc(861) Class4_Sub17 local861 = (Class4_Sub17) Static48.aClass61_8.method1641();
			if (local861 == null) {
				while (true) {
					local861 = (Class4_Sub17) Static54.aClass61_9.method1641();
					if (local861 == null) {
						while (true) {
							local861 = (Class4_Sub17) Static116.aClass61_14.method1641();
							if (local861 == null) {
								if (Static129.aClass4_Sub5_72 != null) {
									Static98.method684();
								}
								if (Static61.anInt1609 != -1) {
									local90 = Static61.anInt1609;
									local96 = Static61.anInt1618;
									@Pc(924) boolean local924 = Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local96, local90, 0, 0, true, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
									if (local924) {
										Static67.anInt1693 = 1;
										Static84.anInt2111 = Static1.anInt9;
										Static85.anInt2127 = 0;
										Static59.anInt1568 = Static27.anInt741;
									}
									Static61.anInt1609 = -1;
								}
								Static22.method423();
								if (local671 != Static83.aClass4_Sub5_43) {
									if (local671 != null) {
										Static19.method344(local671);
									}
									if (Static83.aClass4_Sub5_43 != null) {
										Static19.method344(Static83.aClass4_Sub5_43);
									}
								}
								if (local817 != Static35.aClass4_Sub5_16 && Static52.anInt1359 == Static19.anInt524) {
									if (local817 != null) {
										Static19.method344(local817);
									}
									if (Static35.aClass4_Sub5_16 != null) {
										Static19.method344(Static35.aClass4_Sub5_16);
									}
								}
								if (Static35.aClass4_Sub5_16 == null) {
									if (Static52.anInt1359 > 0) {
										Static52.anInt1359--;
									}
								} else if (Static19.anInt524 > Static52.anInt1359) {
									Static52.anInt1359++;
									if (Static52.anInt1359 == Static19.anInt524) {
										Static19.method344(Static35.aClass4_Sub5_16);
									}
								}
								Static59.method1059();
								if (Static42.aBoolean48) {
									Static85.method1524();
								}
								for (local90 = 0; local90 < 5; local90++) {
									@Pc(1015) int local1015 = Static127.anIntArray360[local90]++;
								}
								local96 = Static78.method1302();
								local98 = Static111.method1971();
								if (local96 > 4500 && local98 > 4500) {
									Static44.anInt1128 = 250;
									method2075(4000);
									Static114.aClass4_Sub16_Sub1_3.method1499(179);
								}
								Static127.anInt3133++;
								Static85.anInt2126++;
								if (Static85.anInt2126 > 500) {
									Static85.anInt2126 = 0;
									local113 = (int) (Math.random() * 8.0D);
									if ((local113 & 0x1) == 1) {
										Static62.anInt1628 += Static49.anInt1282;
									}
									if ((local113 & 0x4) == 4) {
										Static83.anInt2078 += Static32.anInt831;
									}
									if ((local113 & 0x2) == 2) {
										Static84.anInt2098 += Static78.anInt1859;
									}
								}
								if (Static84.anInt2098 < -55) {
									Static78.anInt1859 = 2;
								}
								if (Static84.anInt2098 > 55) {
									Static78.anInt1859 = -2;
								}
								if (Static127.anInt3133 > 500) {
									Static127.anInt3133 = 0;
									local113 = (int) (Math.random() * 8.0D);
									if ((local113 & 0x2) == 2) {
										Static105.anInt2051 += Static130.anInt3180;
									}
									if ((local113 & 0x1) == 1) {
										Static45.anInt1164 += Static111.anInt2781;
									}
								}
								if (Static105.anInt2051 < -20) {
									Static130.anInt3180 = 1;
								}
								if (Static83.anInt2078 < -40) {
									Static32.anInt831 = 1;
								}
								if (Static83.anInt2078 > 40) {
									Static32.anInt831 = -1;
								}
								if (Static105.anInt2051 > 10) {
									Static130.anInt3180 = -1;
								}
								Static10.anInt329++;
								if (Static62.anInt1628 < -50) {
									Static49.anInt1282 = 2;
								}
								if (Static62.anInt1628 > 50) {
									Static49.anInt1282 = -2;
								}
								if (Static45.anInt1164 < -60) {
									Static111.anInt2781 = 2;
								}
								if (Static45.anInt1164 > 60) {
									Static111.anInt2781 = -2;
								}
								if (Static10.anInt329 > 50) {
									Static114.aClass4_Sub16_Sub1_3.method1499(47);
								}
								try {
									if (Static49.aClass69_3 == null || Static114.aClass4_Sub16_Sub1_3.anInt2019 <= 0) {
										return;
									} else {
										Static49.aClass69_3.method1860(Static114.aClass4_Sub16_Sub1_3.anInt2019, Static114.aClass4_Sub16_Sub1_3.aByteArray22);
										Static114.aClass4_Sub16_Sub1_3.anInt2019 = 0;
										Static10.anInt329 = 0;
										return;
									}
								} catch (@Pc(1225) IOException local1225) {
									Static43.method738();
									return;
								}
							}
							Static104.method1857(local861);
						}
					}
					Static104.method1857(local861);
				}
			}
			Static104.method1857(local861);
		}
	}
}
