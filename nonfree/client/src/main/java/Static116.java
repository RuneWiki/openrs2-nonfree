import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2 aClass4_Sub4_Sub3_Sub2_4;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1116 = Static121.method2047(" ");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1114 = aClass60_1116;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	public static int anInt2781 = 1;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "[Lclient!ad;")
	public static Class5[] aClass5Array1 = new Class5[50];

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public static int anInt2785 = 0;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1115 = Static121.method2047("Einloggen");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1951() {
		if (Static3.anInt33 > 0) {
			Static3.anInt33--;
		}
		if (Static77.anInt1906 > 1) {
			Static77.anInt1906--;
		}
		if (Static10.aBoolean8) {
			Static10.aBoolean8 = false;
			Static58.method1050();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < 100 && Static28.method536(); local30++) {
		}
		if (Static71.anInt1828 != 30) {
			return;
		}
		Static26.method508(Static56.aClass4_Sub13_Sub1_1);
		@Pc(52) Object local52 = Static30.aClass22_1.anObject1;
		@Pc(77) int local77;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(98) int local98;
		@Pc(103) int local103;
		synchronized (Static30.aClass22_1.anObject1) {
			if (!Static123.aBoolean119) {
				Static30.aClass22_1.anInt917 = 0;
			} else if (Static3.anInt28 != 0 || Static30.aClass22_1.anInt917 >= 40) {
				Static56.aClass4_Sub13_Sub1_1.method1265(68);
				Static56.aClass4_Sub13_Sub1_1.method1209(0);
				local77 = Static56.aClass4_Sub13_Sub1_1.anInt1643;
				local79 = 0;
				for (local81 = 0; local81 < Static30.aClass22_1.anInt917 && Static56.aClass4_Sub13_Sub1_1.anInt1643 - local77 < 240; local81++) {
					local79++;
					local98 = Static30.aClass22_1.anIntArray69[local81];
					local103 = Static30.aClass22_1.anIntArray70[local81];
					if (local103 < 0) {
						local103 = 0;
					} else if (local103 > 764) {
						local103 = 764;
					}
					if (local98 < 0) {
						local98 = 0;
					} else if (local98 > 502) {
						local98 = 502;
					}
					@Pc(134) int local134 = local98 * 765 + local103;
					if (Static30.aClass22_1.anIntArray69[local81] == -1 && Static30.aClass22_1.anIntArray70[local81] == -1) {
						local134 = 524287;
						local103 = -1;
						local98 = -1;
					}
					if (local103 != Static78.anInt1912 || local98 != Static119.anInt2864) {
						@Pc(176) int local176 = local98 - Static119.anInt2864;
						Static119.anInt2864 = local98;
						@Pc(183) int local183 = local103 - Static78.anInt1912;
						Static78.anInt1912 = local103;
						if (Static3.anInt30 < 8 && local183 >= -32 && local183 <= 31 && local176 >= -32 && local176 <= 31) {
							local183 += 32;
							local176 += 32;
							Static56.aClass4_Sub13_Sub1_1.method1252(local176 + (local183 << 6) + (Static3.anInt30 << 12));
							Static3.anInt30 = 0;
						} else if (Static3.anInt30 < 8) {
							Static56.aClass4_Sub13_Sub1_1.method1245((Static3.anInt30 << 19) + local134 + 8388608);
							Static3.anInt30 = 0;
						} else {
							Static56.aClass4_Sub13_Sub1_1.method1221((Static3.anInt30 << 19) + local134 - 1073741824);
							Static3.anInt30 = 0;
						}
					} else if (Static3.anInt30 < 2047) {
						Static3.anInt30++;
					}
				}
				Static56.aClass4_Sub13_Sub1_1.method1204(Static56.aClass4_Sub13_Sub1_1.anInt1643 - local77);
				if (local79 < Static30.aClass22_1.anInt917) {
					Static30.aClass22_1.anInt917 -= local79;
					for (local98 = 0; local98 < Static30.aClass22_1.anInt917; local98++) {
						Static30.aClass22_1.anIntArray70[local98] = Static30.aClass22_1.anIntArray70[local98 + local79];
						Static30.aClass22_1.anIntArray69[local98] = Static30.aClass22_1.anIntArray69[local98 + local79];
					}
				} else {
					Static30.aClass22_1.anInt917 = 0;
				}
			}
		}
		if (Static3.anInt28 != 0) {
			local77 = Static22.anInt652;
			@Pc(347) long local347 = (Static26.aLong22 - Static60.aLong82) / 50L;
			if (local347 > 4095L) {
				local347 = 4095L;
			}
			if (local77 < 0) {
				local77 = 0;
			} else if (local77 > 502) {
				local77 = 502;
			}
			local79 = Static128.anInt2648;
			Static60.aLong82 = Static26.aLong22;
			@Pc(372) byte local372 = 0;
			local103 = (int) local347;
			if (Static3.anInt28 == 2) {
				local372 = 1;
			}
			if (local79 < 0) {
				local79 = 0;
			} else if (local79 > 764) {
				local79 = 764;
			}
			local81 = local79 + local77 * 765;
			Static56.aClass4_Sub13_Sub1_1.method1265(149);
			Static56.aClass4_Sub13_Sub1_1.method1218((local372 << 19) + (local103 << 20) + local81);
		}
		if (Static37.anInt932 > 0) {
			Static37.anInt932--;
		}
		if (Static10.aBooleanArray1[96] || Static10.aBooleanArray1[97] || Static10.aBooleanArray1[98] || Static10.aBooleanArray1[99]) {
			Static25.aBoolean21 = true;
		}
		if (Static25.aBoolean21 && Static37.anInt932 <= 0) {
			Static25.aBoolean21 = false;
			Static37.anInt932 = 20;
			Static56.aClass4_Sub13_Sub1_1.method1265(175);
			Static56.aClass4_Sub13_Sub1_1.method1208(Static69.anInt1774);
			Static56.aClass4_Sub13_Sub1_1.method1207(Static52.anInt1339);
		}
		if (Static32.aBoolean25 && !Static13.aBoolean14) {
			Static13.aBoolean14 = true;
			Static56.aClass4_Sub13_Sub1_1.method1265(107);
			Static56.aClass4_Sub13_Sub1_1.method1209(1);
		}
		if (!Static32.aBoolean25 && Static13.aBoolean14) {
			Static13.aBoolean14 = false;
			Static56.aClass4_Sub13_Sub1_1.method1265(107);
			Static56.aClass4_Sub13_Sub1_1.method1209(0);
		}
		Static125.method2070();
		if (Static71.anInt1828 != 30) {
			return;
		}
		Static115.method1947();
		Static24.method470();
		Static83.anInt1979++;
		if (Static83.anInt1979 > 750) {
			Static58.method1050();
			return;
		}
		Static109.method1887();
		Static4.method30();
		Static36.method634();
		if (Static14.anInt3005 != 0) {
			Static35.anInt914 += 20;
			if (Static35.anInt914 >= 400) {
				Static14.anInt3005 = 0;
			}
		}
		Static15.anInt2962++;
		if (Static32.aClass4_Sub17_4 != null) {
			Static89.anInt2075++;
			if (Static89.anInt2075 >= 15) {
				Static130.method2133(Static32.aClass4_Sub17_4);
				Static32.aClass4_Sub17_4 = null;
			}
		}
		@Pc(668) Class4_Sub17 local668;
		if (Static113.aClass4_Sub17_14 != null) {
			Static130.method2133(Static113.aClass4_Sub17_14);
			if (Static78.anInt1908 + 5 < Static82.anInt1962 || Static82.anInt1962 < Static78.anInt1908 - 5 || Static117.anInt2794 + 5 < Static17.anInt452 || Static17.anInt452 < Static117.anInt2794 - 5) {
				Static90.aBoolean88 = true;
			}
			Static2.anInt1353++;
			if (anInt2785 == 0) {
				if (Static90.aBoolean88 && Static2.anInt1353 >= 5) {
					if (Static30.aClass4_Sub17_3 == Static113.aClass4_Sub17_14 && Static95.anInt2331 != Static11.anInt248) {
						local668 = Static113.aClass4_Sub17_14;
						@Pc(670) byte local670 = 0;
						if (Static2.anInt1356 == 1 && local668.anInt2227 == 206) {
							local670 = 1;
						}
						if (local668.anIntArray224[Static11.anInt248] <= 0) {
							local670 = 0;
						}
						if (Static57.method323(Static73.method1384(local668))) {
							local77 = Static95.anInt2331;
							local79 = Static11.anInt248;
							local668.anIntArray224[local79] = local668.anIntArray224[local77];
							local668.anIntArray225[local79] = local668.anIntArray225[local77];
							local668.anIntArray224[local77] = -1;
							local668.anIntArray225[local77] = 0;
						} else if (local670 == 1) {
							local77 = Static95.anInt2331;
							local79 = Static11.anInt248;
							while (local79 != local77) {
								if (local79 < local77) {
									local668.method1622(local77, local77 - 1);
									local77--;
								} else if (local79 > local77) {
									local668.method1622(local77, local77 + 1);
									local77++;
								}
							}
						} else {
							local668.method1622(Static95.anInt2331, Static11.anInt248);
						}
						Static56.aClass4_Sub13_Sub1_1.method1265(225);
						Static56.aClass4_Sub13_Sub1_1.method1238(local670);
						Static56.aClass4_Sub13_Sub1_1.method1252(Static95.anInt2331);
						Static56.aClass4_Sub13_Sub1_1.method1256(Static113.aClass4_Sub17_14.anInt2203);
						Static56.aClass4_Sub13_Sub1_1.method1252(Static11.anInt248);
					}
				} else if ((Static61.anInt1533 == 1 || Static111.method1898(Static25.anInt693 - 1)) && Static25.anInt693 > 2) {
					Static120.method1449();
				} else if (Static25.anInt693 > 0) {
					Static38.method647(Static25.anInt693 - 1);
				}
				Static113.aClass4_Sub17_14 = null;
				Static89.anInt2075 = 10;
				Static3.anInt28 = 0;
			}
		}
		Static11.aBoolean9 = false;
		Static73.aBoolean73 = false;
		local668 = Static119.aClass4_Sub17_16;
		Static119.anInt2863 = 0;
		Static119.aClass4_Sub17_16 = null;
		@Pc(821) Class4_Sub17 local821 = Static88.aClass4_Sub17_10;
		Static88.aClass4_Sub17_10 = null;
		Static23.aClass4_Sub17_2 = null;
		while (Static61.method1127() && Static119.anInt2863 < 128) {
			Static45.anIntArray109[Static119.anInt2863] = Static111.anInt2685;
			Static58.anIntArray150[Static119.anInt2863] = Static13.anInt427;
			Static119.anInt2863++;
		}
		Static25.method481(0, 765, 0, 0, 0, Static23.anInt664, 503);
		Static63.anInt1698++;
		while (true) {
			@Pc(863) Class4_Sub16 local863 = (Class4_Sub16) Static86.aClass70_6.method1932();
			if (local863 == null) {
				while (true) {
					local863 = (Class4_Sub16) Static72.aClass70_15.method1932();
					if (local863 == null) {
						while (true) {
							local863 = (Class4_Sub16) Static86.aClass70_5.method1932();
							if (local863 == null) {
								if (Static60.aClass4_Sub17_12 != null) {
									Static25.method479();
								}
								if (Static44.anInt1133 != -1) {
									local77 = Static44.anInt1133;
									local79 = Static44.anInt1153;
									@Pc(926) boolean local926 = Static99.method1760(0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, local79, 0, 0, local77, true);
									Static44.anInt1133 = -1;
									if (local926) {
										Static94.anInt2308 = Static22.anInt652;
										Static14.anInt3005 = 1;
										Static35.anInt914 = 0;
										Static120.anInt1936 = Static128.anInt2648;
									}
								}
								Static25.method482();
								if (Static119.aClass4_Sub17_16 != local668) {
									if (local668 != null) {
										Static130.method2133(local668);
									}
									if (Static119.aClass4_Sub17_16 != null) {
										Static130.method2133(Static119.aClass4_Sub17_16);
									}
								}
								if (local821 != Static88.aClass4_Sub17_10 && Static121.anInt2897 == Static14.anInt3006) {
									if (local821 != null) {
										Static130.method2133(local821);
									}
									if (Static88.aClass4_Sub17_10 != null) {
										Static130.method2133(Static88.aClass4_Sub17_10);
									}
								}
								if (Static88.aClass4_Sub17_10 == null) {
									if (Static121.anInt2897 > 0) {
										Static121.anInt2897--;
									}
								} else if (Static121.anInt2897 < Static14.anInt3006) {
									Static121.anInt2897++;
									if (Static14.anInt3006 == Static121.anInt2897) {
										Static130.method2133(Static88.aClass4_Sub17_10);
									}
								}
								Static32.method608();
								if (Static110.aBoolean115) {
									Static117.method1962();
								}
								for (local77 = 0; local77 < 5; local77++) {
									@Pc(1010) int local1010 = Static74.anIntArray192[local77]++;
								}
								local79 = Static107.method1832();
								local81 = Static10.method204();
								if (local79 > 4500 && local81 > 4500) {
									Static3.anInt33 = 250;
									Static63.method1268(4000);
									Static56.aClass4_Sub13_Sub1_1.method1265(45);
								}
								Static82.anInt1971++;
								Static7.anInt2987++;
								if (Static7.anInt2987 > 500) {
									Static7.anInt2987 = 0;
									local98 = (int) (Math.random() * 8.0D);
									if ((local98 & 0x4) == 4) {
										Static9.anInt159 += Static46.anInt1196;
									}
									if ((local98 & 0x2) == 2) {
										Static83.anInt1976 += Static35.anInt915;
									}
									if ((local98 & 0x1) == 1) {
										Static69.anInt1768 += Static76.anInt1891;
									}
								}
								if (Static83.anInt1976 < -55) {
									Static35.anInt915 = 2;
								}
								if (Static9.anInt159 < -40) {
									Static46.anInt1196 = 1;
								}
								if (Static83.anInt1976 > 55) {
									Static35.anInt915 = -2;
								}
								Static69.anInt1771++;
								if (Static69.anInt1768 < -50) {
									Static76.anInt1891 = 2;
								}
								if (Static69.anInt1771 > 500) {
									Static69.anInt1771 = 0;
									local98 = (int) (Math.random() * 8.0D);
									if ((local98 & 0x2) == 2) {
										Static17.anInt453 += Static52.anInt1349;
									}
									if ((local98 & 0x1) == 1) {
										Static129.anInt3002 += Static62.anInt1692;
									}
								}
								if (Static9.anInt159 > 40) {
									Static46.anInt1196 = -1;
								}
								if (Static129.anInt3002 < -60) {
									Static62.anInt1692 = 2;
								}
								if (Static17.anInt453 < -20) {
									Static52.anInt1349 = 1;
								}
								if (Static17.anInt453 > 10) {
									Static52.anInt1349 = -1;
								}
								if (Static129.anInt3002 > 60) {
									Static62.anInt1692 = -2;
								}
								if (Static69.anInt1768 > 50) {
									Static76.anInt1891 = -2;
								}
								if (Static82.anInt1971 > 50) {
									Static56.aClass4_Sub13_Sub1_1.method1265(132);
								}
								try {
									if (Static7.aClass78_6 == null || Static56.aClass4_Sub13_Sub1_1.anInt1643 <= 0) {
										return;
									} else {
										Static7.aClass78_6.method2081(Static56.aClass4_Sub13_Sub1_1.aByteArray68, Static56.aClass4_Sub13_Sub1_1.anInt1643);
										Static56.aClass4_Sub13_Sub1_1.anInt1643 = 0;
										Static82.anInt1971 = 0;
										return;
									}
								} catch (@Pc(1217) IOException local1217) {
									Static58.method1050();
									return;
								}
							}
							Static18.method296(local863);
						}
					}
					Static18.method296(local863);
				}
			}
			Static18.method296(local863);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!kd;Lclient!oa;II)V")
	public static void method1952(@OriginalArg(0) Class40_Sub1 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) byte[] local11 = null;
		@Pc(13) Class70 local13 = Static60.aClass70_16;
		synchronized (Static60.aClass70_16) {
			for (@Pc(20) Class4_Sub6 local20 = (Class4_Sub6) Static60.aClass70_16.method1939(); local20 != null; local20 = (Class4_Sub6) Static60.aClass70_16.method1936()) {
				if (local20.aLong100 == (long) arg2 && local20.aClass54_1 == arg1 && local20.anInt669 == 0) {
					local11 = local20.aByteArray27;
					break;
				}
			}
		}
		if (local11 == null) {
			@Pc(67) byte[] local67 = arg1.method1457(arg2);
			arg0.method1131(local67, arg2, true, arg1);
		} else {
			arg0.method1131(local11, arg2, true, arg1);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method1953() {
		aClass5Array1 = null;
		aClass60_1114 = null;
		aClass4_Sub4_Sub3_Sub2_4 = null;
		aClass60_1115 = null;
		aClass60_1116 = null;
	}
}
