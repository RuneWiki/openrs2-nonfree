import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ua", name = "pb", descriptor = "Lclient!jf;")
	public static Class42 aClass42_12 = new Class42(4096);

	@OriginalMember(owner = "client!ua", name = "Ib", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1538 = Static28.method504("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ua", name = "Ab", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1537 = aClass39_1538;

	@OriginalMember(owner = "client!ua", name = "Nb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1539 = Static28.method504("K");

	@OriginalMember(owner = "client!ua", name = "Ob", descriptor = "Lclient!pb;")
	public static Class61 aClass61_15 = new Class61();

	@OriginalMember(owner = "client!ua", name = "Pb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1540 = Static28.method504("::gc");

	@OriginalMember(owner = "client!ua", name = "Qb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1541 = aClass39_1539;

	@OriginalMember(owner = "client!ua", name = "Rb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1542 = Static28.method504("null");

	@OriginalMember(owner = "client!ua", name = "Sb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1543 = aClass39_1539;

	@OriginalMember(owner = "client!ua", name = "Tb", descriptor = "I")
	public static int anInt2947 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZJ)V")
	public static void method2038(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static48.anInt1254; local17++) {
			if (arg0 == Static80.aLongArray4[local17]) {
				Static48.anInt1254--;
				for (@Pc(39) int local39 = local17; local39 < Static48.anInt1254; local39++) {
					Static131.aClass39Array23[local39] = Static131.aClass39Array23[local39 + 1];
					Static114.anIntArray307[local39] = Static114.anIntArray307[local39 + 1];
					Static80.aLongArray4[local39] = Static80.aLongArray4[local39 + 1];
					Static32.anIntArray93[local39] = Static32.anIntArray93[local39 + 1];
				}
				Static4.anInt88 = Static129.anInt3153;
				Static114.aClass4_Sub16_Sub1_3.method1499(236);
				Static114.aClass4_Sub16_Sub1_3.method1457(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!he;I)I")
	public static int method2039(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub5 arg1) {
		if (arg1.anIntArrayArray8 == null || arg0 >= arg1.anIntArrayArray8.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray8[arg0];
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(36) int local36 = local20[local31++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local22;
				}
				if (local36 == 1) {
					local38 = Static1.anIntArray1[local20[local31++]];
				}
				if (local36 == 2) {
					local38 = Static39.anIntArray105[local20[local31++]];
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 3) {
					local38 = Static35.anIntArray99[local20[local31++]];
				}
				if (local36 == 16) {
					local40 = 2;
				}
				@Pc(102) int local102;
				@Pc(113) Class4_Sub5 local113;
				@Pc(118) int local118;
				@Pc(131) int local131;
				if (local36 == 4) {
					local102 = local20[local31++] << 16;
					@Pc(109) int local109 = local102 + local20[local31++];
					local113 = Static54.method949(local109);
					local118 = local20[local31++];
					if (local118 != -1 && (!Static119.method2166(local118).aBoolean25 || Static99.aBoolean121)) {
						for (local131 = 0; local131 < local113.anIntArray130.length; local131++) {
							if (local118 + 1 == local113.anIntArray130[local131]) {
								local38 += local113.anIntArray134[local131];
							}
						}
					}
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 5) {
					local38 = Static22.anIntArray64[local20[local31++]];
				}
				if (local36 == 6) {
					local38 = Class4_Sub2_Sub11.anIntArray220[Static39.anIntArray105[local20[local31++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static22.anIntArray64[local20[local31++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2439;
				}
				if (local36 == 9) {
					for (local102 = 0; local102 < 25; local102++) {
						if (Static38.aBooleanArray9[local102]) {
							local38 += Static39.anIntArray105[local102];
						}
					}
				}
				if (local36 == 10) {
					local102 = local20[local31++] << 16;
					local102 += local20[local31++];
					local113 = Static54.method949(local102);
					local118 = local20[local31++];
					if (local118 != -1 && (!Static119.method2166(local118).aBoolean25 || Static99.aBoolean121)) {
						for (local131 = 0; local131 < local113.anIntArray130.length; local131++) {
							if (local118 + 1 == local113.anIntArray130[local131]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static2.anInt18;
				}
				if (local36 == 12) {
					local38 = Static122.anInt3024;
				}
				if (local36 == 13) {
					local102 = Static22.anIntArray64[local20[local31++]];
					@Pc(320) int local320 = local20[local31++];
					local38 = (local102 & 0x1 << local320) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local102 = local20[local31++];
					local38 = Static3.method15(local102);
				}
				if (local36 == 18) {
					local38 = (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 >> 7) + Static36.anInt909;
				}
				if (local36 == 19) {
					local38 = Static24.anInt503 + (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 >> 7);
				}
				if (local36 == 20) {
					local38 = local20[local31++];
				}
				if (local40 == 0) {
					if (local24 == 0) {
						local22 += local38;
					}
					if (local24 == 1) {
						local22 -= local38;
					}
					if (local24 == 2 && local38 != 0) {
						local22 /= local38;
					}
					if (local24 == 3) {
						local22 *= local38;
					}
					local24 = 0;
				} else {
					local24 = local40;
				}
			}
		} catch (@Pc(424) Exception local424) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)V")
	public static void method2041() {
		Static25.method2194();
		Static100.method1812();
		Static39.method645();
		Static82.method1364();
		Static94.method1692();
		Static9.method190();
		Static118.method2048();
		Static120.method2050();
		Static121.method2081();
		Static110.method1957();
		Static50.method818();
		Static31.method543();
		((Class10) Static57.anInterface1_1).method227();
		Static29.aClass12_20.method233();
		Static120.aClass20_Sub1_17.method480();
		Static41.aClass20_Sub1_6.method480();
		Static55.aClass20_Sub1_9.method480();
		Static75.aClass20_Sub1_13.method480();
		Static16.aClass20_Sub1_2.method480();
		Static29.aClass20_Sub1_3.method480();
		Static65.aClass20_Sub1_11.method480();
		Static127.aClass20_Sub1_20.method480();
		Static113.aClass20_Sub1_16.method480();
		Static67.aClass20_Sub1_12.method480();
		Static47.aClass20_Sub1_8.method480();
		Static62.aClass20_Sub1_10.method480();
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(B)V")
	public static void method2045() {
		aClass39_1539 = null;
		aClass39_1537 = null;
		aClass39_1538 = null;
		aClass39_1540 = null;
		aClass61_15 = null;
		aClass39_1542 = null;
		aClass39_1541 = null;
		aClass39_1543 = null;
		aClass42_12 = null;
	}
}
