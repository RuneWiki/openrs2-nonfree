import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	public static int anInt1656;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public static int anInt1639 = 0;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!jd;")
	public static Class38 aClass38_11 = new Class38();

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_773 = Static9.method266("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_774 = Static9.method266("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!id;")
	private static Class34 aClass34_776 = Static9.method266("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!id;")
	public static Class34 aClass34_775 = aClass34_776;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
	public static int anInt1655 = 127;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
	public static int anInt1657 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(15) Class1_Sub3 local15 = null;
		for (@Pc(20) Class1_Sub3 local20 = (Class1_Sub3) Static48.aClass38_10.method1034(); local20 != null; local20 = (Class1_Sub3) Static48.aClass38_10.method1038()) {
			if (arg0 == local20.anInt483 && arg4 == local20.anInt469 && arg2 == local20.anInt484 && arg7 == local20.anInt474) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class1_Sub3();
			local15.anInt483 = arg0;
			local15.anInt484 = arg2;
			local15.anInt474 = arg7;
			local15.anInt469 = arg4;
			Static32.method905(local15);
			Static48.aClass38_10.method1046(local15);
		}
		local15.anInt480 = arg6;
		local15.anInt482 = arg8;
		local15.anInt468 = arg3;
		local15.anInt471 = arg5;
		local15.anInt481 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method1037() {
		Static14.aClass48_2 = new Class48(32);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	public static void method1039() {
		Static29.aClass63_7.method1665();
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
	public static void method1041() {
		if (Static106.anInt2602 > 0) {
			Static106.anInt2602--;
		}
		if (Static40.anInt1147 > 1) {
			Static40.anInt1147--;
		}
		if (Static100.aBoolean133) {
			Static100.aBoolean133 = false;
			Static85.method1457();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static120.method1911(); local27++) {
		}
		if (Static44.anInt1247 != 30) {
			return;
		}
		Static130.method928(Static21.aClass1_Sub19_Sub1_1);
		@Pc(51) Object local51 = Static48.aClass36_1.anObject2;
		@Pc(75) int local75;
		@Pc(81) int local81;
		@Pc(83) int local83;
		@Pc(99) int local99;
		@Pc(105) int local105;
		synchronized (Static48.aClass36_1.anObject2) {
			if (!Static17.aBoolean30) {
				Static48.aClass36_1.anInt1626 = 0;
			} else if (Static55.anInt1547 != 0 || Static48.aClass36_1.anInt1626 >= 40) {
				Static21.aClass1_Sub19_Sub1_1.method2105(216);
				Static21.aClass1_Sub19_Sub1_1.method2061(0);
				local75 = Static21.aClass1_Sub19_Sub1_1.anInt3111;
				local81 = 0;
				for (local83 = 0; local83 < Static48.aClass36_1.anInt1626 && Static21.aClass1_Sub19_Sub1_1.anInt3111 - local75 < 240; local83++) {
					local99 = Static48.aClass36_1.anIntArray172[local83];
					local81++;
					local105 = Static48.aClass36_1.anIntArray173[local83];
					if (local105 < 0) {
						local105 = 0;
					} else if (local105 > 764) {
						local105 = 764;
					}
					if (local99 < 0) {
						local99 = 0;
					} else if (local99 > 502) {
						local99 = 502;
					}
					@Pc(139) int local139 = local99 * 765 + local105;
					if (Static48.aClass36_1.anIntArray172[local83] == -1 && Static48.aClass36_1.anIntArray173[local83] == -1) {
						local105 = -1;
						local139 = 524287;
						local99 = -1;
					}
					if (Static80.anInt2132 != local105 || Static75.anInt2049 != local99) {
						@Pc(179) int local179 = local105 - Static80.anInt2132;
						Static80.anInt2132 = local105;
						@Pc(185) int local185 = local99 - Static75.anInt2049;
						Static75.anInt2049 = local99;
						if (Static90.anInt3107 < 8 && local179 >= -32 && local179 <= 31 && local185 >= -32 && local185 <= 31) {
							local179 += 32;
							local185 += 32;
							Static21.aClass1_Sub19_Sub1_1.method2054(local185 + (Static90.anInt3107 << 12) + (local179 << 6));
							Static90.anInt3107 = 0;
						} else if (Static90.anInt3107 < 8) {
							Static21.aClass1_Sub19_Sub1_1.method2082(local139 + (Static90.anInt3107 << 19) + 8388608);
							Static90.anInt3107 = 0;
						} else {
							Static21.aClass1_Sub19_Sub1_1.method2062(local139 + (Static90.anInt3107 << 19) - 1073741824);
							Static90.anInt3107 = 0;
						}
					} else if (Static90.anInt3107 < 2047) {
						Static90.anInt3107++;
					}
				}
				Static21.aClass1_Sub19_Sub1_1.method2087(Static21.aClass1_Sub19_Sub1_1.anInt3111 - local75);
				if (Static48.aClass36_1.anInt1626 <= local81) {
					Static48.aClass36_1.anInt1626 = 0;
				} else {
					Static48.aClass36_1.anInt1626 -= local81;
					for (local99 = 0; local99 < Static48.aClass36_1.anInt1626; local99++) {
						Static48.aClass36_1.anIntArray173[local99] = Static48.aClass36_1.anIntArray173[local99 + local81];
						Static48.aClass36_1.anIntArray172[local99] = Static48.aClass36_1.anIntArray172[local81 + local99];
					}
				}
			}
		}
		if (Static55.anInt1547 != 0) {
			local75 = Static118.anInt2830;
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 502) {
				local75 = 502;
			}
			@Pc(360) long local360 = (Static41.aLong68 - Static72.aLong100) / 50L;
			if (local360 > 4095L) {
				local360 = 4095L;
			}
			local81 = Static119.anInt2832;
			@Pc(370) byte local370 = 0;
			if (Static55.anInt1547 == 2) {
				local370 = 1;
			}
			local105 = (int) local360;
			Static72.aLong100 = Static41.aLong68;
			Static21.aClass1_Sub19_Sub1_1.method2105(170);
			if (local81 < 0) {
				local81 = 0;
			} else if (local81 > 764) {
				local81 = 764;
			}
			local83 = local75 * 765 + local81;
			Static21.aClass1_Sub19_Sub1_1.method2080((local370 << 19) + (local105 << 20) + local83);
		}
		if (Static56.aBooleanArray15[96] || Static56.aBooleanArray15[97] || Static56.aBooleanArray15[98] || Static56.aBooleanArray15[99]) {
			Static105.aBoolean140 = true;
		}
		if (Static105.anInt2601 > 0) {
			Static105.anInt2601--;
		}
		if (Static105.aBoolean140 && Static105.anInt2601 <= 0) {
			Static105.anInt2601 = 20;
			Static105.aBoolean140 = false;
			Static21.aClass1_Sub19_Sub1_1.method2105(151);
			Static21.aClass1_Sub19_Sub1_1.method2043(Static43.anInt1241);
			Static21.aClass1_Sub19_Sub1_1.method2043(Static132.anInt3154);
		}
		if (Static133.aBoolean186 && !Static31.aBoolean47) {
			Static31.aBoolean47 = true;
			Static21.aClass1_Sub19_Sub1_1.method2105(26);
			Static21.aClass1_Sub19_Sub1_1.method2061(1);
		}
		if (!Static133.aBoolean186 && Static31.aBoolean47) {
			Static31.aBoolean47 = false;
			Static21.aClass1_Sub19_Sub1_1.method2105(26);
			Static21.aClass1_Sub19_Sub1_1.method2061(0);
		}
		Static124.method1956();
		if (Static44.anInt1247 != 30) {
			return;
		}
		Static85.method1458();
		Static90.method2047();
		Static38.anInt1129++;
		if (Static38.anInt1129 > 750) {
			Static85.method1457();
			return;
		}
		Static119.method1887();
		Static76.method1346();
		Static9.method264();
		if (Static9.anInt458 != 0) {
			Static8.anInt446 += 20;
			if (Static8.anInt446 >= 400) {
				Static9.anInt458 = 0;
			}
		}
		Static67.anInt1767++;
		if (Static132.aClass1_Sub9_16 != null) {
			Static72.anInt1894++;
			if (Static72.anInt1894 >= 15) {
				Static10.method277(Static132.aClass1_Sub9_16);
				Static132.aClass1_Sub9_16 = null;
			}
		}
		@Pc(663) Class1_Sub9 local663;
		if (Static23.aClass1_Sub9_6 != null) {
			Static10.method277(Static23.aClass1_Sub9_6);
			if (Static39.anInt1143 > Static45.anInt2766 + 5 || Static45.anInt2766 - 5 > Static39.anInt1143 || Static19.anInt658 > Static26.anInt849 + 5 || Static26.anInt849 - 5 > Static19.anInt658) {
				Static110.aBoolean137 = true;
			}
			Static67.anInt1765++;
			if (Static26.anInt842 == 0) {
				if (Static110.aBoolean137 && Static67.anInt1765 >= 5) {
					if (Static41.aClass1_Sub9_8 == Static23.aClass1_Sub9_6 && Static132.anInt3159 != Static55.anInt1554) {
						local663 = Static23.aClass1_Sub9_6;
						@Pc(665) byte local665 = 0;
						if (Static35.anInt1003 == 1 && local663.anInt1030 == 206) {
							local665 = 1;
						}
						if (local663.anIntArray108[Static132.anInt3159] <= 0) {
							local665 = 0;
						}
						if (Static129.method2012(Static84.method1448(local663))) {
							local75 = Static55.anInt1554;
							local81 = Static132.anInt3159;
							local663.anIntArray108[local81] = local663.anIntArray108[local75];
							local663.anIntArray104[local81] = local663.anIntArray104[local75];
							local663.anIntArray108[local75] = -1;
							local663.anIntArray104[local75] = 0;
						} else if (local665 == 1) {
							local75 = Static55.anInt1554;
							local81 = Static132.anInt3159;
							while (local75 != local81) {
								if (local75 > local81) {
									local663.method645(local75, local75 - 1);
									local75--;
								} else if (local75 < local81) {
									local663.method645(local75, local75 + 1);
									local75++;
								}
							}
						} else {
							local663.method645(Static55.anInt1554, Static132.anInt3159);
						}
						Static21.aClass1_Sub19_Sub1_1.method2105(143);
						Static21.aClass1_Sub19_Sub1_1.method2080(Static23.aClass1_Sub9_6.anInt1050);
						Static21.aClass1_Sub19_Sub1_1.method2070(local665);
						Static21.aClass1_Sub19_Sub1_1.method2043(Static132.anInt3159);
						Static21.aClass1_Sub19_Sub1_1.method2067(Static55.anInt1554);
					}
				} else if ((Static56.anInt2386 == 1 || Static90.method2085(Static71.anInt1876 - 1)) && Static71.anInt1876 > 2) {
					Static10.method274();
				} else if (Static71.anInt1876 > 0) {
					Static118.method1878(Static71.anInt1876 - 1);
				}
				Static72.anInt1894 = 10;
				Static23.aClass1_Sub9_6 = null;
				Static55.anInt1547 = 0;
			}
		}
		Static114.aBoolean155 = false;
		Static8.aClass1_Sub9_1 = null;
		Static69.anInt1823 = 0;
		local663 = Static61.aClass1_Sub9_9;
		@Pc(805) Class1_Sub9 local805 = Static77.aClass1_Sub9_12;
		Static61.aClass1_Sub9_9 = null;
		Static77.aClass1_Sub9_12 = null;
		Static112.aBoolean152 = false;
		while (Static21.method446() && Static69.anInt1823 < 128) {
			Static121.anIntArray355[Static69.anInt1823] = Static116.anInt2808;
			Static59.anIntArray175[Static69.anInt1823] = Static127.anInt2073;
			Static69.anInt1823++;
		}
		Static94.method1609(765, 0, 503, 0, 0, Static9.anInt451, 0);
		Static70.anInt1848++;
		while (true) {
			@Pc(851) Class1_Sub5 local851 = (Class1_Sub5) Static45.aClass38_22.method1040();
			if (local851 == null) {
				while (true) {
					local851 = (Class1_Sub5) Static73.aClass38_15.method1040();
					if (local851 == null) {
						while (true) {
							local851 = (Class1_Sub5) Static118.aClass38_24.method1040();
							if (local851 == null) {
								if (Static129.aClass1_Sub9_15 != null) {
									Static99.method1664();
								}
								if (Static68.anInt1776 != -1) {
									local81 = Static68.anInt1778;
									local75 = Static68.anInt1776;
									@Pc(914) boolean local914 = Static70.method1199(Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray147[0], 0, 0, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray149[0], 0, local75, true, 0, local81, 0, 0);
									if (local914) {
										Static102.anInt2587 = Static118.anInt2830;
										Static8.anInt446 = 0;
										Static124.anInt2986 = Static119.anInt2832;
										Static9.anInt458 = 1;
									}
									Static68.anInt1776 = -1;
								}
								Static69.method1192();
								if (Static61.aClass1_Sub9_9 != local663) {
									if (local663 != null) {
										Static10.method277(local663);
									}
									if (Static61.aClass1_Sub9_9 != null) {
										Static10.method277(Static61.aClass1_Sub9_9);
									}
								}
								if (local805 != Static77.aClass1_Sub9_12 && Static42.anInt1199 == Static56.anInt2388) {
									if (local805 != null) {
										Static10.method277(local805);
									}
									if (Static77.aClass1_Sub9_12 != null) {
										Static10.method277(Static77.aClass1_Sub9_12);
									}
								}
								if (Static77.aClass1_Sub9_12 == null) {
									if (Static56.anInt2388 > 0) {
										Static56.anInt2388--;
									}
								} else if (Static42.anInt1199 > Static56.anInt2388) {
									Static56.anInt2388++;
									if (Static42.anInt1199 == Static56.anInt2388) {
										Static10.method277(Static77.aClass1_Sub9_12);
									}
								}
								Static76.method1345();
								if (Static95.aBoolean129) {
									Static69.method1188();
								}
								for (local75 = 0; local75 < 5; local75++) {
									@Pc(1001) int local1001 = Static110.anIntArray318[local75]++;
								}
								local81 = Static117.method420();
								local83 = Static87.method1484();
								if (local81 > 4500 && local83 > 4500) {
									Static106.anInt2602 = 250;
									Static8.method258(4000);
									Static21.aClass1_Sub19_Sub1_1.method2105(208);
								}
								Static24.anInt813++;
								Static116.anInt2804++;
								if (Static116.anInt2804 > 500) {
									Static116.anInt2804 = 0;
									local99 = (int) (Math.random() * 8.0D);
									if ((local99 & 0x2) == 2) {
										Static120.anInt2857 += Static4.anInt280;
									}
									if ((local99 & 0x4) == 4) {
										Static26.anInt848 += Static28.anInt3026;
									}
									if ((local99 & 0x1) == 1) {
										Static66.anInt1755 += Static133.anInt3171;
									}
								}
								if (Static26.anInt848 < -40) {
									Static28.anInt3026 = 1;
								}
								if (Static66.anInt1755 < -50) {
									Static133.anInt3171 = 2;
								}
								if (Static24.anInt813 > 500) {
									Static24.anInt813 = 0;
									local99 = (int) (Math.random() * 8.0D);
									if ((local99 & 0x1) == 1) {
										Static126.anInt2999 += Static100.anInt2518;
									}
									if ((local99 & 0x2) == 2) {
										Static122.anInt2890 += Static87.anInt2264;
									}
								}
								if (Static122.anInt2890 < -20) {
									Static87.anInt2264 = 1;
								}
								if (Static120.anInt2857 < -55) {
									Static4.anInt280 = 2;
								}
								Static14.anInt599++;
								if (Static122.anInt2890 > 10) {
									Static87.anInt2264 = -1;
								}
								if (Static26.anInt848 > 40) {
									Static28.anInt3026 = -1;
								}
								if (Static120.anInt2857 > 55) {
									Static4.anInt280 = -2;
								}
								if (Static126.anInt2999 < -60) {
									Static100.anInt2518 = 2;
								}
								if (Static66.anInt1755 > 50) {
									Static133.anInt3171 = -2;
								}
								if (Static126.anInt2999 > 60) {
									Static100.anInt2518 = -2;
								}
								if (Static14.anInt599 > 50) {
									Static21.aClass1_Sub19_Sub1_1.method2105(240);
								}
								try {
									if (Static3.aClass51_1 == null || Static21.aClass1_Sub19_Sub1_1.anInt3111 <= 0) {
										return;
									} else {
										Static3.aClass51_1.method1362(Static21.aClass1_Sub19_Sub1_1.aByteArray42, Static21.aClass1_Sub19_Sub1_1.anInt3111);
										Static14.anInt599 = 0;
										Static21.aClass1_Sub19_Sub1_1.anInt3111 = 0;
										return;
									}
								} catch (@Pc(1216) IOException local1216) {
									Static85.method1457();
									return;
								}
							}
							Static56.method1567(local851);
						}
					}
					Static56.method1567(local851);
				}
			}
			Static56.method1567(local851);
		}
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
	public static void method1045() {
		aClass34_776 = null;
		aClass38_11 = null;
		aClass34_775 = null;
		aClass34_773 = null;
		aClass34_774 = null;
		aClass1_Sub1_Sub2_Sub2_6 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ic;ILclient!pa;Z)V")
	public static void method1047(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35_Sub1 arg2) {
		@Pc(12) Class1_Sub18 local12 = new Class1_Sub18();
		local12.aClass35_Sub1_22 = arg2;
		local12.anInt2222 = 1;
		local12.aClass33_1 = arg0;
		local12.aLong162 = arg1;
		@Pc(27) Class38 local27 = Static43.aClass38_8;
		synchronized (Static43.aClass38_8) {
			Static43.aClass38_8.method1046(local12);
		}
		Static132.method2101();
	}
}
