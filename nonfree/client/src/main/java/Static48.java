import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!sd;")
	public static Class2 aClass2_10;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Lclient!bb;")
	public static Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public static int anInt1321;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Lclient!ae;")
	private static Class5 aClass5_634 = Static56.method972("Private chat");

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_632 = aClass5_634;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_633 = Static56.method972("Passwort: ");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!rb;")
	public static Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_635 = Static56.method972("::fpsoff");

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	public static int anInt1320 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "Lclient!ae;")
	private static Class5 aClass5_636 = Static56.method972("Enter name of player to delete from list");

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_637 = aClass5_636;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!ae;")
	public static Class5 aClass5_638 = Static56.method972("_");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I")
	public static int method871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(11) int local11 = arg2 / arg0;
		@Pc(17) int local17 = arg0 - 1 & arg1;
		@Pc(23) int local23 = arg2 & arg0 - 1;
		@Pc(33) int local33 = Static116.method1970(local11, local7);
		@Pc(40) int local40 = Static116.method1970(local11, local7 + 1);
		@Pc(47) int local47 = Static116.method1970(local11 + 1, local7);
		@Pc(56) int local56 = Static116.method1970(local11 + 1, local7 + 1);
		@Pc(63) int local63 = Static69.method1189(local17, local40, local33, arg0);
		@Pc(70) int local70 = Static69.method1189(local17, local56, local47, arg0);
		return Static69.method1189(local23, local70, local63, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method872() {
		aClass5_635 = null;
		anIntArray153 = null;
		aClass5_634 = null;
		aClass5_636 = null;
		aClass56_2 = null;
		aClass5_638 = null;
		aClass3_Sub1_Sub2_Sub1_2 = null;
		aClass5_633 = null;
		aClass5_637 = null;
		aClass2_10 = null;
		aClass5_632 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method873() {
		Static88.aBoolean110 = true;
		Static100.method1670();
		if (Static103.aBoolean141) {
			aClass3_Sub1_Sub2_Sub1_2.method259(Static110.aClass5_1299, 239, 40, 0);
			aClass3_Sub1_Sub2_Sub1_2.method259(Static75.method1261(new Class5[] { Static110.aClass5_1301, Static33.aClass5_436 }), 239, 60, 128);
		} else if (Static68.anInt1553 == 1) {
			aClass3_Sub1_Sub2_Sub1_2.method259(Static74.aClass5_873, 239, 40, 0);
			aClass3_Sub1_Sub2_Sub1_2.method259(Static75.method1261(new Class5[] { Static110.aClass5_1300, Static33.aClass5_436 }), 239, 60, 128);
		} else if (Static68.anInt1553 == 2) {
			aClass3_Sub1_Sub2_Sub1_2.method259(Static106.aClass5_1237, 239, 40, 0);
			aClass3_Sub1_Sub2_Sub1_2.method259(Static75.method1261(new Class5[] { Static110.aClass5_1300, Static33.aClass5_436 }), 239, 60, 128);
		} else {
			@Pc(55) Class3_Sub1_Sub2_Sub1 local55;
			@Pc(62) int local62;
			@Pc(72) int local72;
			if (Static68.anInt1553 == 3) {
				if (Static110.aClass5_1302 != Static110.aClass5_1300) {
					Static3.method126(Static110.aClass5_1300);
					Static110.aClass5_1302 = Static110.aClass5_1300;
				}
				local55 = Static88.aClass3_Sub1_Sub2_Sub1_3;
				Static66.method1847(0, 0, 463, 77);
				for (local62 = 0; local62 < Static111.anInt2907; local62++) {
					local72 = local62 * 14 + 18 - Static116.anInt2991;
					if (local72 > 0 && local72 < 110) {
						local55.method259(Static50.aClass5Array10[local62], 239, local72, 0);
					}
				}
				Static66.method1843();
				if (Static111.anInt2907 > 5) {
					Static5.method175(463, Static116.anInt2991, Static111.anInt2907 * 14 + 7, 0, 77);
				}
				if (Static110.aClass5_1300.method144() == 0) {
					aClass3_Sub1_Sub2_Sub1_2.method259(Static100.aClass5_1138, 239, 40, 255);
				} else if (Static111.anInt2907 == 0) {
					aClass3_Sub1_Sub2_Sub1_2.method259(Static99.aClass5_1127, 239, 40, 0);
				}
				local55.method259(Static75.method1261(new Class5[] { Static110.aClass5_1300, Static33.aClass5_436 }), 239, 90, 0);
				Static66.method1844(0, 77, 479, 0);
			} else if (Static30.aClass5_396 == null) {
				@Pc(200) boolean local200;
				if (Static88.anInt2255 != -1) {
					local200 = Static82.method1302(96, 479, Static88.anInt2255, 2);
					if (!local200) {
						Static15.aBoolean22 = true;
					}
				} else if (Static100.anInt2515 == -1) {
					local55 = Static88.aClass3_Sub1_Sub2_Sub1_3;
					Static66.method1847(0, 0, 463, 77);
					local62 = 0;
					for (local72 = 0; local72 < 100; local72++) {
						if (Static3.aClass5Array2[local72] != null) {
							@Pc(227) int local227 = Static16.anIntArray64[local72];
							@Pc(231) Class5 local231 = Static89.aClass5Array15[local72];
							@Pc(241) int local241 = Static60.anInt2986 + 70 - local62 * 14;
							@Pc(243) byte local243 = 0;
							if (local231 != null && local231.method139(Static58.aClass5_775)) {
								local231 = local231.method159(5);
								local243 = 1;
							}
							if (local231 != null && local231.method139(Static91.aClass5_1071)) {
								local231 = local231.method159(5);
								local243 = 2;
							}
							if (local227 == 0) {
								local62++;
								if (local241 > 0 && local241 < 110) {
									local55.method277(Static3.aClass5Array2[local72], 4, local241, 0);
								}
							}
							@Pc(314) int local314;
							if ((local227 == 1 || local227 == 2) && (local227 == 1 || Static99.anInt2488 == 0 || Static99.anInt2488 == 1 && Static4.method134(local231))) {
								if (local241 > 0 && local241 < 110) {
									local314 = 4;
									if (local243 == 1) {
										Static93.aClass3_Sub1_Sub2_Sub4Array6[0].method1857(4, local241 - 12);
										local314 += 14;
									}
									if (local243 == 2) {
										Static93.aClass3_Sub1_Sub2_Sub4Array6[1].method1857(local314, local241 - 12);
										local314 += 14;
									}
									local55.method277(Static75.method1261(new Class5[] { local231, Static30.aClass5_400 }), local314, local241, 0);
									local314 += local55.method267(local231) + 8;
									local55.method277(Static3.aClass5Array2[local72], local314, local241, 255);
								}
								local62++;
							}
							if ((local227 == 3 || local227 == 7) && Static3.anInt292 == 0 && (local227 == 7 || Static12.anInt479 == 0 || Static12.anInt479 == 1 && Static4.method134(local231))) {
								local62++;
								if (local241 > 0 && local241 < 110) {
									local55.method277(Static101.aClass5_1156, 4, local241, 0);
									local314 = local55.method267(Static101.aClass5_1156) + 4;
									local314 += local55.method275(32);
									if (local243 == 1) {
										Static93.aClass3_Sub1_Sub2_Sub4Array6[0].method1857(local314, local241 - 12);
										local314 += 14;
									}
									if (local243 == 2) {
										Static93.aClass3_Sub1_Sub2_Sub4Array6[1].method1857(local314, local241 - 12);
										local314 += 14;
									}
									local55.method277(Static75.method1261(new Class5[] { local231, Static30.aClass5_400 }), local314, local241, 0);
									local314 += local55.method267(local231) + 8;
									local55.method277(Static3.aClass5Array2[local72], local314, local241, 8388608);
								}
							}
							if (local227 == 4 && (Static9.anInt428 == 0 || Static9.anInt428 == 1 && Static4.method134(local231))) {
								if (local241 > 0 && local241 < 110) {
									local55.method277(Static75.method1261(new Class5[] { local231, Static67.aClass5_825, Static3.aClass5Array2[local72] }), 4, local241, 8388736);
								}
								local62++;
							}
							if (local227 == 5 && Static3.anInt292 == 0 && Static12.anInt479 < 2) {
								if (local241 > 0 && local241 < 110) {
									local55.method277(Static3.aClass5Array2[local72], 4, local241, 8388608);
								}
								local62++;
							}
							if (local227 == 6 && Static3.anInt292 == 0 && Static12.anInt479 < 2) {
								if (local241 > 0 && local241 < 110) {
									local55.method277(Static75.method1261(new Class5[] { Static116.aClass5_1365, Static67.aClass5_825, local231, Static30.aClass5_400 }), 4, local241, 0);
									local55.method277(Static3.aClass5Array2[local72], local55.method267(Static75.method1261(new Class5[] { Static116.aClass5_1365, Static67.aClass5_825, local231 })) + 12, local241, 8388608);
								}
								local62++;
							}
							if (local227 == 8 && (Static9.anInt428 == 0 || Static9.anInt428 == 1 && Static4.method134(local231))) {
								local62++;
								if (local241 > 0 && local241 < 110) {
									local55.method277(Static75.method1261(new Class5[] { local231, Static67.aClass5_825, Static3.aClass5Array2[local72] }), 4, local241, 8270336);
								}
							}
						}
					}
					Static66.method1843();
					Static82.anInt2010 = local62 * 14 + 7;
					if (Static82.anInt2010 < 78) {
						Static82.anInt2010 = 78;
					}
					Static5.method175(463, Static82.anInt2010 - Static60.anInt2986 - 77, Static82.anInt2010, 0, 77);
					@Pc(714) Class5 local714;
					if (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1 == null || Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass5_765 == null) {
						local714 = Static88.aClass5_1015;
					} else {
						local714 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass5_765;
					}
					local55.method277(Static75.method1261(new Class5[] { local714, Static30.aClass5_400 }), 4, 90, 0);
					local55.method277(Static75.method1261(new Class5[] { Static110.aClass5_1303, Static33.aClass5_436 }), local55.method267(Static75.method1261(new Class5[] { local714, Static47.aClass5_623 })) + 6, 90, 255);
					Static66.method1844(0, 77, 479, 0);
				} else {
					local200 = Static82.method1302(96, 479, Static100.anInt2515, 3);
					if (!local200) {
						Static15.aBoolean22 = true;
					}
				}
			} else {
				aClass3_Sub1_Sub2_Sub1_2.method255(Static30.aClass5_396, 10, 20, 459, 40, 0, false, 1, 1, 0);
				aClass3_Sub1_Sub2_Sub1_2.method259(Static27.aClass5_365, 239, 80, 128);
			}
		}
		if (Static103.aBoolean142 && Static58.anInt1603 == 2) {
			Static1.method5();
		}
		Static7.method200();
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)I")
	public static int method874() {
		return Static108.anInt2860++;
	}
}
