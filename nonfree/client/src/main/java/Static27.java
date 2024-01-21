import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!dd;")
	public static Class19 aClass19_34 = new Class19(64);

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public static int anInt889 = -1;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
	public static int[] anIntArray138 = new int[4000];

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "[I")
	public static int[] anIntArray139 = new int[200];

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_574 = Static69.method1153("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!rd;")
	private static Class64 aClass64_575 = Static69.method1153("Friends");

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!rd;")
	private static Class64 aClass64_582 = Static69.method1153("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_576 = aClass64_582;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean59 = true;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!rd;")
	private static Class64 aClass64_577 = Static69.method1153("Service unavailable)3");

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_578 = Static69.method1153("Lade Texturen )2 ");

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "Lclient!rd;")
	public static Class64 aClass64_579 = null;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "Lclient!rd;")
	public static Class64 aClass64_580 = aClass64_575;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "Lclient!rd;")
	public static Class64 aClass64_581 = Static69.method1153("@yel@*V");

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_583 = aClass64_577;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_584 = Static69.method1153("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method671() {
		while (true) {
			if (Static64.aClass1_Sub6_Sub1_2.method1881(Static62.anInt1454) >= 27) {
				@Pc(23) int local23 = Static64.aClass1_Sub6_Sub1_2.method1873(15);
				if (local23 != 32767) {
					@Pc(28) boolean local28 = false;
					if (Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local23] == null) {
						Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local23] = new Class1_Sub1_Sub2_Sub1_Sub1();
						local28 = true;
					}
					@Pc(44) Class1_Sub1_Sub2_Sub1_Sub1 local44 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local23];
					Static13.anIntArray65[Static64.anInt1488++] = local23;
					local44.anInt2377 = Static15.anInt471;
					@Pc(60) int local60 = Static64.aClass1_Sub6_Sub1_2.method1873(5);
					local44.aClass1_Sub1_Sub15_1 = Static42.method697(Static64.aClass1_Sub6_Sub1_2.method1873(13));
					if (local60 > 15) {
						local60 -= 32;
					}
					@Pc(79) int local79 = Static13.anIntArray66[Static64.aClass1_Sub6_Sub1_2.method1873(3)];
					if (local28) {
						local44.anInt2363 = local79;
					}
					@Pc(89) int local89 = Static64.aClass1_Sub6_Sub1_2.method1873(5);
					@Pc(94) int local94 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
					if (local89 > 15) {
						local89 -= 32;
					}
					if (local94 == 1) {
						Static96.anIntArray436[Static39.anInt914++] = local23;
					}
					@Pc(114) int local114 = Static64.aClass1_Sub6_Sub1_2.method1873(1);
					local44.anInt2398 = local44.aClass1_Sub1_Sub15_1.anInt2305;
					local44.anInt2401 = local44.aClass1_Sub1_Sub15_1.anInt2303;
					local44.anInt2383 = local44.aClass1_Sub1_Sub15_1.anInt2310;
					if (local44.anInt2383 == 0) {
						local44.anInt2363 = 0;
					}
					local44.anInt2378 = local44.aClass1_Sub1_Sub15_1.anInt2314;
					local44.anInt2395 = local44.aClass1_Sub1_Sub15_1.anInt2313;
					local44.anInt2360 = local44.aClass1_Sub1_Sub15_1.anInt2308;
					local44.anInt2361 = local44.aClass1_Sub1_Sub15_1.anInt2301;
					local44.anInt2413 = local44.aClass1_Sub1_Sub15_1.anInt2319;
					local44.anInt2390 = local44.aClass1_Sub1_Sub15_1.anInt2293;
					local44.method1689(local114 == 1, local60 + Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0] + local89);
					continue;
				}
			}
			Static64.aClass1_Sub6_Sub1_2.method1878();
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
	public static int method672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) (arg1 + (arg0 << 16));
		return Static83.aClass1_Sub1_Sub16_1 != null && local6 == Static83.aClass1_Sub1_Sub16_1.aLong87 ? Static105.aClass1_Sub6_4.anInt2574 * 99 / (Static105.aClass1_Sub6_4.aByteArray27.length - Static83.aClass1_Sub1_Sub16_1.aByte4) + 1 : 0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!pb;BLclient!rd;Lclient!rd;)Lclient!gb;")
	public static Class1_Sub1_Sub5_Sub1 method674(@OriginalArg(0) Class41 arg0, @OriginalArg(2) Class64 arg1, @OriginalArg(3) Class64 arg2) {
		@Pc(9) int local9 = arg0.method1066(arg2);
		@Pc(17) int local17 = arg0.method1050(arg1, local9);
		return Static77.method1329(local9, arg0, local17);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public static void method675() {
		Static116.aByteArrayArray8 = null;
		Static98.anIntArray327 = null;
		Static91.anIntArray303 = null;
		Static23.anIntArray95 = null;
		Static116.anIntArray441 = null;
		Static25.anIntArray437 = null;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
	public static void method677() {
		@Pc(1) Object local1 = Static28.anObject6;
		synchronized (Static28.anObject6) {
			if (Static31.anInt801 != 0) {
				Static31.anInt801 = 1;
				try {
					Static28.anObject6.wait();
				} catch (@Pc(11) InterruptedException local11) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	public static void method679() {
		@Pc(3) int local3 = -1;
		if (Static121.anInt2872 == 0 && !Static103.aBoolean143) {
			Static2.method63(Static81.anInt1404, Static60.aClass64_862, Static63.anInt1474, 19, Static87.aClass64_1263, 0);
		}
		for (@Pc(21) int local21 = 0; local21 < Static111.anInt2691; local21++) {
			@Pc(27) int local27 = Static111.anIntArray409[local21];
			@Pc(31) int local31 = local27 & 0x7F;
			@Pc(37) int local37 = local27 >> 7 & 0x7F;
			@Pc(43) int local43 = local27 >> 29 & 0x3;
			@Pc(49) int local49 = local27 >> 14 & 0x7FFF;
			if (local3 != local27) {
				local3 = local27;
				@Pc(143) int local143;
				if (local43 == 2 && Static82.aClass68_1.method1760(Static15.anInt463, local31, local37, local27) >= 0) {
					@Pc(75) Class1_Sub1_Sub3 local75 = Static108.method1807(local49);
					if (local75.anIntArray61 != null) {
						local75 = local75.method248();
					}
					if (local75 == null) {
						continue;
					}
					if (Static121.anInt2872 == 1) {
						Static2.method63(local31, Static82.method1383(new Class64[] { Static13.aClass64_304, Static75.aClass64_1075, local75.aClass64_279 }), local37, 51, Static95.aClass64_1380, local27);
					} else if (!Static103.aBoolean143) {
						@Pc(133) Class64[] local133 = local75.aClass64Array5;
						if (Static86.aBoolean122) {
							local133 = Static23.method457(local133);
						}
						if (local133 != null) {
							for (local143 = 4; local143 >= 0; local143--) {
								if (local133[local143] != null) {
									@Pc(155) short local155 = 0;
									if (local143 == 0) {
										local155 = 52;
									}
									if (local143 == 1) {
										local155 = 5;
									}
									if (local143 == 2) {
										local155 = 46;
									}
									if (local143 == 3) {
										local155 = 13;
									}
									if (local143 == 4) {
										local155 = 1002;
									}
									Static2.method63(local31, Static82.method1383(new Class64[] { Static91.aClass64_1295, local75.aClass64_279 }), local37, local155, local133[local143], local27);
								}
							}
						}
						Static2.method63(local31, Static82.method1383(new Class64[] { Static91.aClass64_1295, local75.aClass64_279 }), local37, 1003, Static102.aClass64_1480, local75.anInt374 << 14);
					} else if ((Static18.anInt582 & 0x4) == 4) {
						Static2.method63(local31, Static82.method1383(new Class64[] { aClass64_579, Static75.aClass64_1075, local75.aClass64_279 }), local37, 8, Static98.aClass64_1399, local27);
					}
				}
				@Pc(296) int local296;
				@Pc(304) Class1_Sub1_Sub2_Sub1_Sub1 local304;
				@Pc(349) Class1_Sub1_Sub2_Sub1_Sub2 local349;
				if (local43 == 1) {
					@Pc(275) Class1_Sub1_Sub2_Sub1_Sub1 local275 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local49];
					if (local275.aClass1_Sub1_Sub15_1.anInt2313 == 1 && (local275.anInt2375 & 0x7F) == 64 && (local275.anInt2412 & 0x7F) == 64) {
						for (local296 = 0; local296 < Static64.anInt1488; local296++) {
							local304 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static13.anIntArray65[local296]];
							if (local304 != null && local304 != local275 && local304.aClass1_Sub1_Sub15_1.anInt2313 == 1 && local304.anInt2375 == local275.anInt2375 && local304.anInt2412 == local275.anInt2412) {
								Static41.method1908(local31, Static13.anIntArray65[local296], local37, local304.aClass1_Sub1_Sub15_1);
							}
						}
						for (local143 = 0; local143 < Static6.anInt319; local143++) {
							local349 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static90.anIntArray69[local143]];
							if (local349 != null && local275.anInt2375 == local349.anInt2375 && local349.anInt2412 == local275.anInt2412) {
								Static113.method1306(local37, local31, local349, Static90.anIntArray69[local143]);
							}
						}
					}
					Static41.method1908(local31, local49, local37, local275.aClass1_Sub1_Sub15_1);
				}
				if (local43 == 0) {
					@Pc(397) Class1_Sub1_Sub2_Sub1_Sub2 local397 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local49];
					if ((local397.anInt2375 & 0x7F) == 64 && (local397.anInt2412 & 0x7F) == 64) {
						for (local296 = 0; local296 < Static64.anInt1488; local296++) {
							local304 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static13.anIntArray65[local296]];
							if (local304 != null && local304.aClass1_Sub1_Sub15_1.anInt2313 == 1 && local304.anInt2375 == local397.anInt2375 && local304.anInt2412 == local397.anInt2412) {
								Static41.method1908(local31, Static13.anIntArray65[local296], local37, local304.aClass1_Sub1_Sub15_1);
							}
						}
						for (local143 = 0; local143 < Static6.anInt319; local143++) {
							local349 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static90.anIntArray69[local143]];
							if (local349 != null && local349 != local397 && local349.anInt2375 == local397.anInt2375 && local349.anInt2412 == local397.anInt2412) {
								Static113.method1306(local37, local31, local349, Static90.anIntArray69[local143]);
							}
						}
					}
					Static113.method1306(local37, local31, local397, local49);
				}
				if (local43 == 3) {
					@Pc(517) Class50 local517 = Static64.aClass50ArrayArrayArray1[Static15.anInt463][local31][local37];
					if (local517 != null) {
						for (@Pc(524) Class1_Sub1_Sub2_Sub4 local524 = (Class1_Sub1_Sub2_Sub4) local517.method1143(); local524 != null; local524 = (Class1_Sub1_Sub2_Sub4) local517.method1147()) {
							@Pc(531) Class1_Sub1_Sub6 local531 = Static106.method1739(local524.anInt1844);
							if (Static121.anInt2872 == 1) {
								Static2.method63(local31, Static82.method1383(new Class64[] { Static13.aClass64_304, Static20.aClass64_378, local531.aClass64_646 }), local37, 38, Static95.aClass64_1380, local524.anInt1844);
							} else if (!Static103.aBoolean143) {
								@Pc(614) Class64[] local614 = local531.aClass64Array10;
								if (Static86.aBoolean122) {
									local614 = Static23.method457(local614);
								}
								for (@Pc(622) int local622 = 4; local622 >= 0; local622--) {
									if (local614 != null && local614[local622] != null) {
										@Pc(636) byte local636 = 0;
										if (local622 == 0) {
											local636 = 58;
										}
										if (local622 == 1) {
											local636 = 44;
										}
										if (local622 == 2) {
											local636 = 3;
										}
										if (local622 == 3) {
											local636 = 56;
										}
										if (local622 == 4) {
											local636 = 18;
										}
										Static2.method63(local31, Static82.method1383(new Class64[] { Static19.aClass64_372, local531.aClass64_646 }), local37, local636, local614[local622], local524.anInt1844);
									} else if (local622 == 2) {
										Static2.method63(local31, Static82.method1383(new Class64[] { Static19.aClass64_372, local531.aClass64_646 }), local37, 3, Static16.aClass64_322, local524.anInt1844);
									}
								}
								Static2.method63(local31, Static82.method1383(new Class64[] { Static19.aClass64_372, local531.aClass64_646 }), local37, 1001, Static102.aClass64_1480, local524.anInt1844);
							} else if ((Static18.anInt582 & 0x1) == 1) {
								Static2.method63(local31, Static82.method1383(new Class64[] { aClass64_579, Static20.aClass64_378, local531.aClass64_646 }), local37, 33, Static98.aClass64_1399, local524.anInt1844);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	public static void method680() {
		aClass64_575 = null;
		aClass19_34 = null;
		aClass64_576 = null;
		aClass64_577 = null;
		anIntArray138 = null;
		aClass64_579 = null;
		aClass64_574 = null;
		aClass64_581 = null;
		aClass64_584 = null;
		aClass64_580 = null;
		aClass64_583 = null;
		aClass64_582 = null;
		anIntArray137 = null;
		aClass64_578 = null;
		anIntArray139 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BZ)[B")
	public static byte[] method681(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub6 local8 = new Class1_Sub6(arg0);
		@Pc(17) int local17 = local8.method1837();
		@Pc(21) int local21 = local8.method1817();
		if (local21 < 0 || Static66.anInt1519 != 0 && local21 > Static66.anInt1519) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(47) byte[] local47 = new byte[local21];
			local8.method1846(local21, local47);
			return local47;
		} else {
			@Pc(59) int local59 = local8.method1817();
			if (local59 < 0 || Static66.anInt1519 != 0 && local59 > Static66.anInt1519) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local59];
			if (local17 == 1) {
				Static32.method550(local79, local59, arg0, local21);
			} else {
				try {
					@Pc(104) DataInputStream local104 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local21)));
					local104.readFully(local79);
					local104.close();
				} catch (@Pc(111) IOException local111) {
				}
			}
			return local79;
		}
	}
}
