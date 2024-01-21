import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
	public static int anInt1443;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
	public static int anInt1437 = 0;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_561 = Static120.method1824("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_562 = Static120.method1824("Login");

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Lclient!af;")
	public static final Class5 aClass5_19 = new Class5(50);

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "[Lclient!pd;")
	public static final Class74[] aClass74Array1 = new Class74[23];

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "Lclient!rd;")
	public static Class80 aClass80_563 = aClass80_562;

	@OriginalMember(owner = "client!hc", name = "J", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_564 = Static120.method1824("<col=ffb000>");

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z")
	public static boolean method979() {
		@Pc(5) Class37 local5 = Static13.aClass37_1;
		synchronized (Static13.aClass37_1) {
			if (Static22.anInt540 == Static180.anInt4008) {
				return false;
			} else {
				Static109.anInt2443 = Static197.anIntArray527[Static180.anInt4008];
				Static122.anInt2662 = Static59.anIntArray173[Static180.anInt4008];
				Static180.anInt4008 = Static180.anInt4008 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method980() {
		if (Static10.anInt247 > 1) {
			Static10.anInt247--;
		}
		if (Static57.anInt1252 > 0) {
			Static57.anInt1252--;
		}
		if (Static140.aBoolean117) {
			Static140.aBoolean117 = false;
			Static9.method169();
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < 100 && Static157.method2501(); local33++) {
		}
		if (Static21.anInt516 != 30) {
			return;
		}
		Static29.method492(Static146.aClass3_Sub17_Sub1_3);
		@Pc(57) Object local57 = Static142.aClass2_1.anObject1;
		@Pc(92) int local92;
		@Pc(89) int local89;
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(132) int local132;
		synchronized (Static142.aClass2_1.anObject1) {
			if (!Static135.aBoolean115) {
				Static142.aClass2_1.anInt89 = 0;
			} else if (Static107.anInt2370 != 0 || Static142.aClass2_1.anInt89 >= 40) {
				Static146.aClass3_Sub17_Sub1_3.method2146(11);
				Static146.aClass3_Sub17_Sub1_3.method2108(0);
				local89 = 0;
				local92 = Static146.aClass3_Sub17_Sub1_3.anInt2923;
				for (local94 = 0; Static142.aClass2_1.anInt89 > local94 && Static146.aClass3_Sub17_Sub1_3.anInt2923 - local92 < 240; local94++) {
					local89++;
					local111 = Static142.aClass2_1.anIntArray13[local94];
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 502) {
						local111 = 502;
					}
					local132 = Static142.aClass2_1.anIntArray14[local94];
					if (local132 < 0) {
						local132 = 0;
					} else if (local132 > 764) {
						local132 = 764;
					}
					@Pc(151) int local151 = local111 * 765 + local132;
					if (Static142.aClass2_1.anIntArray13[local94] == -1 && Static142.aClass2_1.anIntArray14[local94] == -1) {
						local151 = 524287;
						local111 = -1;
						local132 = -1;
					}
					if (local132 != Static99.anInt2091 || local111 != Static134.anInt3311) {
						@Pc(192) int local192 = local132 - Static99.anInt2091;
						@Pc(197) int local197 = local111 - Static134.anInt3311;
						Static99.anInt2091 = local132;
						Static134.anInt3311 = local111;
						if (Static89.anInt1872 < 8 && local192 >= -32 && local192 <= 31 && local197 >= -32 && local197 <= 31) {
							local197 += 32;
							local192 += 32;
							Static146.aClass3_Sub17_Sub1_3.method2092((local192 << 6) + (Static89.anInt1872 << 12) + local197);
							Static89.anInt1872 = 0;
						} else if (Static89.anInt1872 < 8) {
							Static146.aClass3_Sub17_Sub1_3.method2096((Static89.anInt1872 << 19) + local151 + 8388608);
							Static89.anInt1872 = 0;
						} else {
							Static146.aClass3_Sub17_Sub1_3.method2131((Static89.anInt1872 << 19) + local151 - 1073741824);
							Static89.anInt1872 = 0;
						}
					} else if (Static89.anInt1872 < 2047) {
						Static89.anInt1872++;
					}
				}
				Static146.aClass3_Sub17_Sub1_3.method2142(Static146.aClass3_Sub17_Sub1_3.anInt2923 - local92);
				if (local89 < Static142.aClass2_1.anInt89) {
					Static142.aClass2_1.anInt89 -= local89;
					for (local111 = 0; local111 < Static142.aClass2_1.anInt89; local111++) {
						Static142.aClass2_1.anIntArray14[local111] = Static142.aClass2_1.anIntArray14[local111 + local89];
						Static142.aClass2_1.anIntArray13[local111] = Static142.aClass2_1.anIntArray13[local89 + local111];
					}
				} else {
					Static142.aClass2_1.anInt89 = 0;
				}
			}
		}
		if (Static107.anInt2370 != 0) {
			@Pc(352) long local352 = (Static38.aLong29 - Static153.aLong22) / 50L;
			local92 = Static20.anInt497;
			if (local352 > 4095L) {
				local352 = 4095L;
			}
			Static153.aLong22 = Static38.aLong29;
			local89 = Static37.anInt855;
			if (local89 < 0) {
				local89 = 0;
			} else if (local89 > 764) {
				local89 = 764;
			}
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 502) {
				local92 = 502;
			}
			local94 = local92 * 765 + local89;
			@Pc(406) byte local406 = 0;
			local132 = (int) local352;
			if (Static107.anInt2370 == 2) {
				local406 = 1;
			}
			Static146.aClass3_Sub17_Sub1_3.method2146(252);
			Static146.aClass3_Sub17_Sub1_3.method2097(local94 + (local406 << 19) + (local132 << 20));
		}
		if (Static11.aBooleanArray2[96] || Static11.aBooleanArray2[97] || Static11.aBooleanArray2[98] || Static11.aBooleanArray2[99]) {
			Static104.aBoolean89 = true;
		}
		if (Static53.anInt1163 > 0) {
			Static53.anInt1163--;
		}
		if (Static104.aBoolean89 && Static53.anInt1163 <= 0) {
			Static53.anInt1163 = 20;
			Static104.aBoolean89 = false;
			Static146.aClass3_Sub17_Sub1_3.method2146(35);
			Static146.aClass3_Sub17_Sub1_3.method2134(Static181.anInt4047);
			Static146.aClass3_Sub17_Sub1_3.method2118(Static126.anInt2704);
		}
		if (Static122.aBoolean105 && !Static15.aBoolean21) {
			Static15.aBoolean21 = true;
			Static146.aClass3_Sub17_Sub1_3.method2146(37);
			Static146.aClass3_Sub17_Sub1_3.method2108(1);
		}
		if (!Static122.aBoolean105 && Static15.aBoolean21) {
			Static15.aBoolean21 = false;
			Static146.aClass3_Sub17_Sub1_3.method2146(37);
			Static146.aClass3_Sub17_Sub1_3.method2108(0);
		}
		Static14.method243();
		if (Static21.anInt516 != 30) {
			return;
		}
		Static181.method2902();
		Static147.method2356();
		Static124.anInt2671++;
		if (Static124.anInt2671 > 750) {
			Static9.method169();
			return;
		}
		Static191.method3095();
		Static94.method1434();
		Static58.method866();
		Static152.anInt3407++;
		if (Static138.anInt2981 != 0) {
			Static143.anInt3080 += 20;
			if (Static143.anInt3080 >= 400) {
				Static138.anInt2981 = 0;
			}
		}
		if (Static68.aClass77_3 != null) {
			Static2.anInt81++;
			if (Static2.anInt81 >= 15) {
				Static186.method3014(Static68.aClass77_3);
				Static68.aClass77_3 = null;
			}
		}
		@Pc(648) Class77 local648;
		if (Static158.aClass77_14 != null) {
			Static186.method3014(Static158.aClass77_14);
			if (Static157.anInt3506 + 5 < Static190.anInt4379 || Static157.anInt3506 - 5 > Static190.anInt4379 || Static175.anInt3944 + 5 < Static3.anInt153 || Static175.anInt3944 - 5 > Static3.anInt153) {
				Static183.aBoolean164 = true;
			}
			Static159.anInt3558++;
			if (Static129.anInt2784 == 0) {
				if (Static183.aBoolean164 && Static159.anInt3558 >= 5) {
					if (Static158.aClass77_14 == Static94.aClass77_9 && Static27.anInt4463 != Static153.anInt657) {
						local648 = Static158.aClass77_14;
						@Pc(650) byte local650 = 0;
						if (Static167.anInt3752 == 1 && local648.anInt3256 == 206) {
							local650 = 1;
						}
						if (local648.anIntArray418[Static27.anInt4463] <= 0) {
							local650 = 0;
						}
						if (Static169.method691(Static71.method1062(local648))) {
							local92 = Static153.anInt657;
							local89 = Static27.anInt4463;
							local648.anIntArray418[local89] = local648.anIntArray418[local92];
							local648.anIntArray417[local89] = local648.anIntArray417[local92];
							local648.anIntArray418[local92] = -1;
							local648.anIntArray417[local92] = 0;
						} else if (local650 == 1) {
							local92 = Static153.anInt657;
							local89 = Static27.anInt4463;
							while (local89 != local92) {
								if (local92 > local89) {
									local648.method2325(local92 - 1, local92);
									local92--;
								} else if (local92 < local89) {
									local648.method2325(local92 + 1, local92);
									local92++;
								}
							}
						} else {
							local648.method2325(Static27.anInt4463, Static153.anInt657);
						}
						Static146.aClass3_Sub17_Sub1_3.method2146(161);
						Static146.aClass3_Sub17_Sub1_3.method2108(local650);
						Static146.aClass3_Sub17_Sub1_3.method2134(Static27.anInt4463);
						Static146.aClass3_Sub17_Sub1_3.method2131(Static158.aClass77_14.anInt3237);
						Static146.aClass3_Sub17_Sub1_3.method2118(Static153.anInt657);
					}
				} else if ((Static44.anInt1007 == 1 || Static77.method1276(Static173.anInt3892 - 1)) && Static173.anInt3892 > 2) {
					Static144.method2295();
				} else if (Static173.anInt3892 > 0) {
					Static144.method2296(Static173.anInt3892 - 1);
				}
				Static2.anInt81 = 10;
				Static107.anInt2370 = 0;
				Static158.aClass77_14 = null;
			}
		}
		Static95.anInt3658 = 0;
		Static79.aBoolean67 = false;
		local648 = Static85.aClass77_5;
		Static155.aBoolean142 = false;
		Static94.aClass77_8 = null;
		Static85.aClass77_5 = null;
		@Pc(832) Class77 local832 = Static93.aClass77_7;
		Static93.aClass77_7 = null;
		while (method979() && Static95.anInt3658 < 128) {
			Static3.anIntArray25[Static95.anInt3658] = Static109.anInt2443;
			Static7.anIntArray31[Static95.anInt3658] = Static122.anInt2662;
			Static95.anInt3658++;
		}
		if (Static121.anInt2651 != -1) {
			Static142.method2214(765, 0, 503, Static121.anInt2651, 0, 0, 0);
		}
		Static31.anInt747++;
		while (true) {
			@Pc(878) Class3_Sub16 local878;
			@Pc(894) Class77 local894;
			@Pc(883) Class77 local883;
			do {
				local878 = (Class3_Sub16) Static78.aClass70_5.method1957();
				if (local878 == null) {
					while (true) {
						do {
							local878 = (Class3_Sub16) Static165.aClass70_23.method1957();
							if (local878 == null) {
								while (true) {
									do {
										local878 = (Class3_Sub16) Static132.aClass70_19.method1957();
										if (local878 == null) {
											if (Static64.aClass77_2 != null) {
												Static11.method197();
											}
											if (Static103.anInt2178 != -1) {
												local89 = Static125.anInt2695;
												local92 = Static103.anInt2178;
												@Pc(1040) boolean local1040 = Static27.method3147(0, local89, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local92, true, 0, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, 0);
												if (local1040) {
													Static17.anInt442 = Static37.anInt855;
													Static29.anInt730 = Static20.anInt497;
													Static143.anInt3080 = 0;
													Static138.anInt2981 = 1;
												}
												Static103.anInt2178 = -1;
											}
											Static101.method1502();
											if (local648 != Static85.aClass77_5) {
												if (local648 != null) {
													Static186.method3014(local648);
												}
												if (Static85.aClass77_5 != null) {
													Static186.method3014(Static85.aClass77_5);
												}
											}
											if (Static93.aClass77_7 != local832 && Static50.anInt1092 == Static168.anInt3768) {
												if (local832 != null) {
													Static186.method3014(local832);
												}
												if (Static93.aClass77_7 != null) {
													Static186.method3014(Static93.aClass77_7);
												}
											}
											if (Static93.aClass77_7 == null) {
												if (Static50.anInt1092 > 0) {
													Static50.anInt1092--;
												}
											} else if (Static50.anInt1092 < Static168.anInt3768) {
												Static50.anInt1092++;
												if (Static168.anInt3768 == Static50.anInt1092) {
													Static186.method3014(Static93.aClass77_7);
												}
											}
											Static44.method680();
											if (Static100.aBoolean86) {
												Static120.method1825();
											}
											for (local92 = 0; local92 < 5; local92++) {
												@Pc(1131) int local1131 = Static111.anIntArray326[local92]++;
											}
											local89 = Static194.method3138();
											local94 = Static63.method919();
											if (local89 > 4500 && local94 > 4500) {
												Static57.anInt1252 = 250;
												Static148.method2367(4000);
												Static146.aClass3_Sub17_Sub1_3.method2146(247);
											}
											Static133.anInt2869++;
											Static23.anInt545++;
											Static153.anInt672++;
											if (Static23.anInt545 > 500) {
												Static23.anInt545 = 0;
												local111 = (int) (Math.random() * 8.0D);
												if ((local111 & 0x2) == 2) {
													Static18.anInt458 += Static11.anInt307;
												}
												if ((local111 & 0x4) == 4) {
													Static29.anInt735 += Static170.anInt3813;
												}
												if ((local111 & 0x1) == 1) {
													Static82.anInt1743 += Static94.anInt2015;
												}
											}
											if (Static82.anInt1743 < -50) {
												Static94.anInt2015 = 2;
											}
											if (Static82.anInt1743 > 50) {
												Static94.anInt2015 = -2;
											}
											if (Static29.anInt735 < -40) {
												Static170.anInt3813 = 1;
											}
											if (Static18.anInt458 < -55) {
												Static11.anInt307 = 2;
											}
											if (Static29.anInt735 > 40) {
												Static170.anInt3813 = -1;
											}
											if (Static18.anInt458 > 55) {
												Static11.anInt307 = -2;
											}
											if (Static133.anInt2869 > 500) {
												Static133.anInt2869 = 0;
												local111 = (int) (Math.random() * 8.0D);
												if ((local111 & 0x2) == 2) {
													Static148.anInt3314 += Static162.anInt3642;
												}
												if ((local111 & 0x1) == 1) {
													Static126.anInt2707 += Static28.anInt691;
												}
											}
											if (Static148.anInt3314 < -20) {
												Static162.anInt3642 = 1;
											}
											if (Static126.anInt2707 < -60) {
												Static28.anInt691 = 2;
											}
											if (Static148.anInt3314 > 10) {
												Static162.anInt3642 = -1;
											}
											if (Static126.anInt2707 > 60) {
												Static28.anInt691 = -2;
											}
											if (Static153.anInt672 > 50) {
												Static146.aClass3_Sub17_Sub1_3.method2146(193);
											}
											try {
												if (Static31.aClass78_1 != null && Static146.aClass3_Sub17_Sub1_3.anInt2923 > 0) {
													Static31.aClass78_1.method2419(Static146.aClass3_Sub17_Sub1_3.aByteArray40, Static146.aClass3_Sub17_Sub1_3.anInt2923);
													Static153.anInt672 = 0;
													Static146.aClass3_Sub17_Sub1_3.anInt2923 = 0;
													return;
												}
												return;
											} catch (@Pc(1344) IOException local1344) {
												Static9.method169();
												return;
											}
										}
										local883 = local878.aClass77_10;
										if (local883.anInt3258 < 0) {
											break;
										}
										local894 = Static92.method2208(local883.anInt3201);
									} while (local894 == null || local894.aClass77Array1 == null || local883.anInt3258 >= local894.aClass77Array1.length || local894.aClass77Array1[local883.anInt3258] != local883);
									Static168.method2710(local878);
								}
							}
							local883 = local878.aClass77_10;
							if (local883.anInt3258 < 0) {
								break;
							}
							local894 = Static92.method2208(local883.anInt3201);
						} while (local894 == null || local894.aClass77Array1 == null || local894.aClass77Array1.length <= local883.anInt3258 || local883 != local894.aClass77Array1[local883.anInt3258]);
						Static168.method2710(local878);
					}
				}
				local883 = local878.aClass77_10;
				if (local883.anInt3258 < 0) {
					break;
				}
				local894 = Static92.method2208(local883.anInt3201);
			} while (local894 == null || local894.aClass77Array1 == null || local894.aClass77Array1.length <= local883.anInt3258 || local894.aClass77Array1[local883.anInt3258] != local883);
			Static168.method2710(local878);
		}
	}
}
