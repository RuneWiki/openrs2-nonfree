import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array9;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!oa;")
	public static Class9 aClass9_23;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "[I")
	public static int[] anIntArray323;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "[I")
	public static int[] anIntArray325;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public static int anInt2291 = 0;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!lc;")
	private static Class31 aClass31_791 = Static56.method1206("Loading)3)3)3 ");

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_792 = Static56.method1206("From");

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_793 = Static56.method1206("shake:");

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!lc;")
	public static Class31 aClass31_794 = Static56.method1206("*6nin your message centre)3");

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "[I")
	public static int[] anIntArray324 = new int[128];

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_795 = Static56.method1206("q8_full");

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "[Lclient!lc;")
	public static Class31[] aClass31Array9 = new Class31[100];

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
	public static int anInt2299 = 0;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "Lclient!lc;")
	public static Class31 aClass31_796 = Static56.method1206("Hide");

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
	public static int anInt2303 = 0;

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "Lclient!lc;")
	public static Class31 aClass31_797 = Static56.method1206("*6n*6nRecovery Questions Last Set:*6n@gre@");

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "Lclient!lc;")
	public static Class31 aClass31_798 = aClass31_791;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "Lclient!lc;")
	public static Class31 aClass31_799 = Static56.method1206("Oct");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZIILclient!kc;II)V")
	public static synchronized void method1433(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class11 arg3) {
		Static103.anInt2774 = 10;
		Static65.anInt2162 = arg1;
		Static54.anInt1801 = -1;
		Static19.aBoolean56 = false;
		Static90.anInt2422 = arg2;
		Static90.anInt2414 = arg0;
		Static76.anInt2262 = 0;
		Static76.aClass11_14 = arg3;
		Static70.aBoolean113 = true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static synchronized void method1434() {
		Static16.method512();
		Static70.aBoolean113 = false;
		Static76.aClass11_14 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
	public static void method1435(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static57.aBooleanArray56[arg0]) {
			return;
		}
		Static58.aClass11_10.method339(arg0);
		if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < Static89.aClass2_Sub1_Sub2ArrayArray1[arg0].length; local31++) {
			if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local31] != null) {
				if (Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local31].anInt270 == 2) {
					local29 = false;
				} else {
					Static89.aClass2_Sub1_Sub2ArrayArray1[arg0][local31] = null;
				}
			}
		}
		if (local29) {
			Static89.aClass2_Sub1_Sub2ArrayArray1[arg0] = null;
		}
		Static57.aBooleanArray56[arg0] = false;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	private static void method1436(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static100.aClass2_Sub1_Sub3_Sub2_7.anIntArray89;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local42 = (52736 - local29 * 512) * 4 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static34.aByteArrayArrayArray17[arg0][local44][local29] & 0x18) == 0) {
					Static99.aClass64_1.method1800(local8, local42, arg0, local44, local29);
				}
				if (arg0 < 3 && (Static34.aByteArrayArrayArray17[arg0 + 1][local44][local29] & 0x8) != 0) {
					Static99.aClass64_1.method1800(local8, local42, arg0 + 1, local44, local29);
				}
				local42 += 4;
			}
		}
		Static100.aClass2_Sub1_Sub3_Sub2_7.method460();
		local44 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local42 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) - 10 + 238 << 8) + 238 - 10;
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 < 103; local151++) {
			for (local155 = 1; local155 < 103; local155++) {
				if ((Static34.aByteArrayArrayArray17[arg0][local155][local151] & 0x18) == 0) {
					Static77.method1423(local151, local155, local42, local44, arg0);
				}
				if (arg0 < 3 && (Static34.aByteArrayArrayArray17[arg0 + 1][local155][local151] & 0x8) != 0) {
					Static77.method1423(local151, local155, local42, local44, arg0 + 1);
				}
			}
		}
		Static68.anInt2206 = 0;
		for (local155 = 0; local155 < 104; local155++) {
			for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
				@Pc(229) int local229 = Static99.aClass64_1.method1768(Static58.anInt1945, local155, local221);
				if (local229 != 0) {
					local229 = local229 >> 14 & 0x7FFF;
					@Pc(242) int local242 = Static92.method1045(local229).anInt2730;
					if (local242 >= 0) {
						@Pc(246) int local246 = local155;
						@Pc(248) int local248 = local221;
						if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
							@Pc(282) int[][] local282 = Static77.aClass60Array1[Static58.anInt1945].anIntArrayArray69;
							for (@Pc(284) int local284 = 0; local284 < 10; local284++) {
								@Pc(291) int local291 = (int) (Math.random() * 4.0D);
								if (local291 == 0 && local246 > 0 && local155 - 3 < local246 && (local282[local246 - 1][local248] & 0x1280108) == 0) {
									local246--;
								}
								if (local291 == 1 && local246 < 103 && local246 < local155 + 3 && (local282[local246 + 1][local248] & 0x1280180) == 0) {
									local246++;
								}
								if (local291 == 2 && local248 > 0 && local221 - 3 < local248 && (local282[local246][local248 - 1] & 0x1280102) == 0) {
									local248--;
								}
								if (local291 == 3 && local248 < 103 && local248 < local221 + 3 && (local282[local246][local248 + 1] & 0x1280120) == 0) {
									local248++;
								}
							}
						}
						Static59.aClass2_Sub1_Sub3_Sub2Array8[Static68.anInt2206] = Static44.aClass2_Sub1_Sub3_Sub2Array6[local242];
						Static33.anIntArray170[Static68.anInt2206] = local246;
						Static11.anIntArray75[Static68.anInt2206] = local248;
						Static68.anInt2206++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static synchronized void method1437() {
		Static100.method1707();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIZLclient!kc;II)V")
	public static synchronized void method1438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class11 arg2, @OriginalArg(5) int arg3) {
		Static65.anInt2162 = arg1;
		Static76.aClass11_14 = arg2;
		Static54.anInt1801 = -1;
		Static70.aBoolean113 = true;
		Static19.aBoolean56 = false;
		Static90.anInt2422 = arg3;
		Static103.anInt2774 = -1;
		Static90.anInt2414 = 0;
		Static76.anInt2262 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public static void method1439() {
		if (Static10.aBoolean28 && Static58.anInt1945 != Static87.anInt2341) {
			Static38.method989(Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static103.anInt2767, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], Static76.anInt2252, Static58.anInt1945);
		} else if (Static41.anInt1578 != Static58.anInt1945) {
			Static41.anInt1578 = Static58.anInt1945;
			method1436(Static58.anInt1945);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static synchronized void method1440() {
		if (Static70.aBoolean113) {
			@Pc(18) byte[] local18 = Static53.method1155(Static76.aClass11_14, Static76.anInt2262, Static65.anInt2162, Static90.anInt2414);
			if (local18 != null) {
				if (Static103.anInt2774 >= 0) {
					Static24.method719(Static90.anInt2422, Static103.anInt2774, local18, Static19.aBoolean56);
				} else if (Static54.anInt1801 < 0) {
					Static31.method853(Static19.aBoolean56, local18, Static90.anInt2422);
				} else {
					Static59.method1279(local18, Static54.anInt1801, Static90.anInt2422, Static19.aBoolean56);
				}
				Static70.aBoolean113 = false;
				Static76.aClass11_14 = null;
			}
		}
		Static8.method203();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	public static void method1441() {
		Static85.aBoolean130 = true;
		Static62.method1317();
		if (Static2.aBoolean8) {
			Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static39.aClass31_537, 239, 40, 0);
			Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static37.method974(new Class31[] { Static39.aClass31_542, Static14.aClass31_193 }), 239, 60, 128);
		} else if (Static49.anInt2692 == 1) {
			Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static27.aClass31_384, 239, 40, 0);
			Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static37.method974(new Class31[] { Static39.aClass31_538, Static14.aClass31_193 }), 239, 60, 128);
		} else if (Static49.anInt2692 == 2) {
			Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static93.aClass31_869, 239, 40, 0);
			Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static37.method974(new Class31[] { Static39.aClass31_538, Static14.aClass31_193 }), 239, 60, 128);
		} else {
			@Pc(70) Class2_Sub1_Sub3_Sub3 local70;
			@Pc(77) int local77;
			@Pc(88) int local88;
			if (Static49.anInt2692 == 3) {
				if (Static39.aClass31_538 != Static39.aClass31_543) {
					Static90.method1521(Static39.aClass31_538);
					Static39.aClass31_543 = Static39.aClass31_538;
				}
				local70 = Static98.aClass2_Sub1_Sub3_Sub3_4;
				Static81.method1637(0, 0, 463, 77);
				for (local77 = 0; local77 < Static96.anInt2602; local77++) {
					local88 = local77 * 14 + 18 - Static66.anInt2181;
					if (local88 > 0 && local88 < 110) {
						local70.method962(aClass31Array9[local77], 239, local88, 0);
					}
				}
				Static81.method1642();
				if (Static96.anInt2602 > 5) {
					Static11.method360(Static96.anInt2602 * 14 + 7, 77, 0, 463, Static66.anInt2181);
				}
				if (Static39.aClass31_538.method1223() == 0) {
					Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static44.aClass31_579, 239, 40, 255);
				} else if (Static96.anInt2602 == 0) {
					Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static88.aClass31_822, 239, 40, 0);
				}
				local70.method962(Static37.method974(new Class31[] { Static39.aClass31_538, Static14.aClass31_193 }), 239, 90, 0);
				Static81.method1643(0, 77, 479, 0);
			} else if (Static5.aClass31_72 == null) {
				@Pc(781) boolean local781;
				if (Static47.anInt1736 != -1) {
					local781 = Static4.method91(2, 0, -1, 479, 0, Static47.anInt1736, 96, 0);
					if (!local781) {
						Static27.aBoolean65 = true;
					}
				} else if (Static37.anInt1409 == -1) {
					local70 = Static98.aClass2_Sub1_Sub3_Sub3_4;
					local77 = 0;
					Static81.method1637(0, 0, 463, 77);
					for (local88 = 0; local88 < 100; local88++) {
						if (Static28.aClass31Array6[local88] != null) {
							@Pc(215) int local215 = Static59.anIntArray286[local88];
							@Pc(219) Class31 local219 = Static8.aClass31Array5[local88];
							@Pc(221) byte local221 = 0;
							@Pc(230) int local230 = Static38.anInt1428 + 70 - local77 * 14;
							if (local219 != null && local219.method1226(Static38.aClass31_518)) {
								local221 = 1;
								local219 = local219.method1222(5);
							}
							if (local219 != null && local219.method1226(Static7.aClass31_102)) {
								local219 = local219.method1222(5);
								local221 = 2;
							}
							if (local215 == 0) {
								local77++;
								if (local230 > 0 && local230 < 110) {
									local70.method954(Static28.aClass31Array6[local88], 4, local230, 0);
								}
							}
							@Pc(311) int local311;
							if ((local215 == 1 || local215 == 2) && (local215 == 1 || Static78.anInt2283 == 0 || Static78.anInt2283 == 1 && Static59.method1282(local219))) {
								if (local230 > 0 && local230 < 110) {
									local311 = 4;
									if (local221 == 1) {
										Static56.aClass2_Sub1_Sub3_Sub1Array3[0].method291(4, local230 - 12);
										local311 += 14;
									}
									if (local221 == 2) {
										Static56.aClass2_Sub1_Sub3_Sub1Array3[1].method291(local311, local230 - 12);
										local311 += 14;
									}
									local70.method954(Static37.method974(new Class31[] { local219, Static7.aClass31_95 }), local311, local230, 0);
									local311 += local70.method961(local219) + 8;
									local70.method954(Static28.aClass31Array6[local88], local311, local230, 255);
								}
								local77++;
							}
							if ((local215 == 3 || local215 == 7) && Static100.anInt2732 == 0 && (local215 == 7 || Static12.anInt527 == 0 || Static12.anInt527 == 1 && Static59.method1282(local219))) {
								local77++;
								if (local230 > 0 && local230 < 110) {
									local70.method954(aClass31_792, 4, local230, 0);
									local311 = local70.method961(Static99.aClass31_920) + 4;
									if (local221 == 1) {
										Static56.aClass2_Sub1_Sub3_Sub1Array3[0].method291(local311, local230 - 12);
										local311 += 14;
									}
									if (local221 == 2) {
										Static56.aClass2_Sub1_Sub3_Sub1Array3[1].method291(local311, local230 - 12);
										local311 += 14;
									}
									local70.method954(Static37.method974(new Class31[] { local219, Static7.aClass31_95 }), local311, local230, 0);
									local311 += local70.method961(local219) + 8;
									local70.method954(Static28.aClass31Array6[local88], local311, local230, 8388608);
								}
							}
							if (local215 == 4 && (Static92.anInt1560 == 0 || Static92.anInt1560 == 1 && Static59.method1282(local219))) {
								local77++;
								if (local230 > 0 && local230 < 110) {
									local70.method954(Static37.method974(new Class31[] { local219, Static34.aClass31_449, Static28.aClass31Array6[local88] }), 4, local230, 8388736);
								}
							}
							if (local215 == 5 && Static100.anInt2732 == 0 && Static12.anInt527 < 2) {
								if (local230 > 0 && local230 < 110) {
									local70.method954(Static28.aClass31Array6[local88], 4, local230, 8388608);
								}
								local77++;
							}
							if (local215 == 6 && Static100.anInt2732 == 0 && Static12.anInt527 < 2) {
								local77++;
								if (local230 > 0 && local230 < 110) {
									local70.method954(Static37.method974(new Class31[] { Static90.aClass31_841, local219, Static7.aClass31_95 }), 4, local230, 0);
									local70.method954(Static28.aClass31Array6[local88], local70.method961(Static37.method974(new Class31[] { Static90.aClass31_841, local219 })) + 12, local230, 8388608);
								}
							}
							if (local215 == 8 && (Static92.anInt1560 == 0 || Static92.anInt1560 == 1 && Static59.method1282(local219))) {
								if (local230 > 0 && local230 < 110) {
									local70.method954(Static37.method974(new Class31[] { local219, Static34.aClass31_449, Static28.aClass31Array6[local88] }), 4, local230, 8270336);
								}
								local77++;
							}
						}
					}
					Static81.method1642();
					Static75.anInt2249 = local77 * 14 + 7;
					if (Static75.anInt2249 < 78) {
						Static75.anInt2249 = 78;
					}
					Static11.method360(Static75.anInt2249, 77, 0, 463, Static75.anInt2249 - Static38.anInt1428 - 77);
					@Pc(710) Class31 local710;
					if (Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1 == null || Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.aClass31_612 == null) {
						local710 = Static58.aClass31_687;
					} else {
						local710 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.aClass31_612;
					}
					local70.method954(Static37.method974(new Class31[] { local710, Static7.aClass31_95 }), 4, 90, 0);
					local70.method954(Static37.method974(new Class31[] { Static39.aClass31_534, Static14.aClass31_193 }), local70.method961(Static37.method974(new Class31[] { local710, Static70.aClass31_776 })) + 6, 90, 255);
					Static81.method1643(0, 77, 479, 0);
				} else {
					local781 = Static4.method91(3, 0, -1, 479, 0, Static37.anInt1409, 96, 0);
					if (!local781) {
						Static27.aBoolean65 = true;
					}
				}
			} else {
				Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static5.aClass31_72, 239, 40, 0);
				Static69.aClass2_Sub1_Sub3_Sub3_5.method962(Static51.aClass31_633, 239, 60, 128);
			}
		}
		if (Static105.aBoolean154 && Static64.anInt601 == 2) {
			Static17.method530();
		}
		Static27.method777(Static18.aGraphics1);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLclient!kc;ILclient!lc;Lclient!lc;II)V")
	public static synchronized void method1442(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(4) Class31 arg2, @OriginalArg(5) Class31 arg3) {
		@Pc(8) int local8 = arg1.method345(arg2);
		@Pc(18) int local18 = arg1.method334(local8, arg3);
		method1433(local18, local8, arg0, arg1);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Lclient!lb;")
	public static Class2_Sub1_Sub8 method1443(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub1_Sub8 local6 = (Class2_Sub1_Sub8) Static9.aClass17_13.method786((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static78.aClass11_17.method338(9, arg0);
		local6 = new Class2_Sub1_Sub8();
		local6.anInt1858 = arg0;
		if (local25 != null) {
			local6.method1185(new Class2_Sub6(local25));
		}
		local6.method1186();
		Static9.aClass17_13.method783(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	public static void method1444() {
		anIntArray325 = null;
		aClass31_798 = null;
		aClass31_799 = null;
		aClass31_795 = null;
		aClass31_796 = null;
		aClass2_Sub1_Sub3_Sub2Array9 = null;
		aClass31_792 = null;
		anIntArray323 = null;
		aClass9_23 = null;
		aClass31_791 = null;
		aClass31_797 = null;
		aClass31Array9 = null;
		aClass31_793 = null;
		aClass31_794 = null;
		anIntArray324 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
	public static synchronized void method1445() {
		Static96.method1621();
		Static76.aClass11_14 = null;
		Static70.aBoolean113 = false;
	}
}
