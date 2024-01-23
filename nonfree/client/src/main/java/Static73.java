import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "Lclient!ib;")
	public static Class5_Sub1_Sub1 aClass5_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "Lclient!mb;")
	public static Class70 aClass70_21;

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "[I")
	public static int[] anIntArray105;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "Lclient!ia;")
	private static Class51 aClass51_556 = Static64.method1101("Drop");

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "[[I")
	public static int[][] anIntArrayArray9 = new int[104][104];

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "Lclient!ia;")
	public static Class51 aClass51_557 = aClass51_556;

	@OriginalMember(owner = "client!ha", name = "O", descriptor = "Lclient!ia;")
	private static Class51 aClass51_559 = Static64.method1101("Discard");

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "Lclient!ia;")
	public static Class51 aClass51_558 = aClass51_559;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "Lclient!sc;")
	public static Class102 aClass102_9 = new Class102(512);

	@OriginalMember(owner = "client!ha", name = "S", descriptor = "Lclient!ia;")
	public static Class51 aClass51_560 = Static64.method1101(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
	public static int anInt1666 = 0;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public static void method1281() {
		if (!Static156.aBoolean164) {
			Static21.aClass51Array3[0] = Static93.aClass51_670;
			Static227.aShortArray59[0] = 1001;
			Static168.aClass51Array27[0] = Static81.aClass51_607;
			Static202.anInt4289 = 1;
		}
		if (Static9.anInt179 != -1) {
			Static125.method2776(Static9.anInt179);
		}
		for (@Pc(29) int local29 = 0; local29 < Static127.anInt2862; local29++) {
			if (aBooleanArray10[local29]) {
				Static22.aBooleanArray8[local29] = true;
			}
			Static74.aBooleanArray11[local29] = aBooleanArray10[local29];
			aBooleanArray10[local29] = false;
		}
		Static164.anInt3641 = -1;
		Static66.anInt1481 = Static109.anInt2430;
		Static5.aClass71_29 = null;
		Static138.anInt3088 = -1;
		if (Static9.anInt179 != -1) {
			Static127.anInt2862 = 0;
			Static119.method3321(0, Static9.anInt179, Static185.anInt4016, -1, 0, Static90.anInt4701, 0, 0);
		}
		Static96.method1611();
		Static80.method1384();
		if (Static156.aBoolean164) {
			Static22.method467();
		} else if (Static164.anInt3641 != -1) {
			Static165.method2802(Static164.anInt3641, Static138.anInt3088);
		}
		if (Static36.anInt871 == 3) {
			for (@Pc(106) int local106 = 0; local106 < Static127.anInt2862; local106++) {
				if (Static74.aBooleanArray11[local106]) {
					Static96.method1621(Static33.anIntArray48[local106], Static62.anIntArray93[local106], Static187.anIntArray305[local106], Static164.anIntArray239[local106], 16711935, 128);
				} else if (Static22.aBooleanArray8[local106]) {
					Static96.method1621(Static33.anIntArray48[local106], Static62.anIntArray93[local106], Static187.anIntArray305[local106], Static164.anIntArray239[local106], 16711680, 128);
				}
			}
		}
		Static9.method135(Static48.anInt1156, aClass5_Sub1_Sub1_1.anInt3624, Static197.anInt2422, aClass5_Sub1_Sub1_1.anInt3598);
		Static48.anInt1156 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method1283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static134.anInt3026++;
		Static66.anInt1485 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(30) int local30;
		@Pc(33) int local33;
		@Pc(184) int local184;
		for (@Pc(23) int local23 = Static125.anInt3565; local23 < Static174.anInt3861; local23++) {
			@Pc(28) Class1_Sub7[][] local28 = Static22.aClass1_Sub7ArrayArrayArray1[local23];
			for (local30 = Static163.anInt3523; local30 < Static41.anInt972; local30++) {
				for (local33 = Static127.anInt2831; local33 < Static230.anInt4880; local33++) {
					@Pc(40) Class1_Sub7 local40 = local28[local30][local33];
					if (local40 != null) {
						if (local40.anInt1126 <= Static197.anInt2420 && Static165.aBooleanArrayArray1[local30 + Static62.anInt1432 - Static72.anInt1643][local33 + Static62.anInt1432 - Static220.anInt4646] && (arg3 == null || local23 < arg4 || arg3[local23][local30][local33] != arg5)) {
							local40.aBoolean53 = true;
							local40.aBoolean55 = true;
							if (local40.anInt1124 > 0) {
								local40.aBoolean54 = true;
							} else {
								local40.aBoolean54 = false;
							}
							Static66.anInt1485++;
						} else {
							local40.aBoolean53 = false;
							local40.aBoolean55 = false;
							local40.anInt1128 = 0;
							if (local30 >= local9 && local30 <= local13 && local33 >= local17 && local33 <= local21) {
								if (local40.aClass62_1 != null) {
									@Pc(101) Class62 local101 = local40.aClass62_1;
									local101.aClass5_2.method3676(local101.anInt2400, local101.anInt2400, local101.anInt2407, local101.anInt2407);
									if (local101.aClass5_1 != null) {
										local101.aClass5_1.method3676(local101.anInt2400, local101.anInt2400, local101.anInt2407, local101.anInt2407);
									}
								}
								if (local40.aClass65_1 != null) {
									@Pc(134) Class65 local134 = local40.aClass65_1;
									local134.aClass5_3.method3676(local134.anInt2434, local134.anInt2434, local134.anInt2432, local134.anInt2432);
									if (local134.aClass5_4 != null) {
										local134.aClass5_4.method3676(local134.anInt2434, local134.anInt2434, local134.anInt2432, local134.anInt2432);
									}
								}
								if (local40.aClass119_1 != null) {
									@Pc(167) Class119 local167 = local40.aClass119_1;
									local167.aClass5_9.method3676(local167.anInt4588, local167.anInt4588, local167.anInt4591, local167.anInt4591);
								}
								if (local40.aClass83Array3 != null) {
									for (local184 = 0; local184 < local40.anInt1124; local184++) {
										@Pc(190) Class83 local190 = local40.aClass83Array3[local184];
										local190.aClass5_5.method3676(local190.anInt3336, local190.anInt3346, local190.anInt3340, local190.anInt3342);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(247) boolean local247 = Static20.anIntArrayArrayArray2 == Static103.anIntArrayArrayArray13;
		@Pc(275) int local275;
		@Pc(280) int local280;
		@Pc(284) int local284;
		@Pc(266) int local266;
		for (local30 = Static125.anInt3565; local30 < Static174.anInt3861; local30++) {
			@Pc(254) Class1_Sub7[][] local254 = Static22.aClass1_Sub7ArrayArrayArray1[local30];
			for (@Pc(257) int local257 = -Static62.anInt1432; local257 <= 0; local257++) {
				local184 = Static72.anInt1643 + local257;
				local266 = Static72.anInt1643 - local257;
				if (local184 >= Static163.anInt3523 || local266 < Static41.anInt972) {
					for (local275 = -Static62.anInt1432; local275 <= 0; local275++) {
						local280 = Static220.anInt4646 + local275;
						local284 = Static220.anInt4646 - local275;
						@Pc(296) Class1_Sub7 local296;
						if (local184 >= Static163.anInt3523) {
							if (local280 >= Static127.anInt2831) {
								local296 = local254[local184][local280];
								if (local296 != null && local296.aBoolean53) {
									Static156.method2676(local296, true);
								}
							}
							if (local284 < Static230.anInt4880) {
								local296 = local254[local184][local284];
								if (local296 != null && local296.aBoolean53) {
									Static156.method2676(local296, true);
								}
							}
						}
						if (local266 < Static41.anInt972) {
							if (local280 >= Static127.anInt2831) {
								local296 = local254[local266][local280];
								if (local296 != null && local296.aBoolean53) {
									Static156.method2676(local296, true);
								}
							}
							if (local284 < Static230.anInt4880) {
								local296 = local254[local266][local284];
								if (local296 != null && local296.aBoolean53) {
									Static156.method2676(local296, true);
								}
							}
						}
						if (Static66.anInt1485 == 0) {
							if (!local247) {
								Static74.aBoolean75 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local33 = Static125.anInt3565; local33 < Static174.anInt3861; local33++) {
			@Pc(382) Class1_Sub7[][] local382 = Static22.aClass1_Sub7ArrayArrayArray1[local33];
			for (local184 = -Static62.anInt1432; local184 <= 0; local184++) {
				local266 = Static72.anInt1643 + local184;
				local275 = Static72.anInt1643 - local184;
				if (local266 >= Static163.anInt3523 || local275 < Static41.anInt972) {
					for (local280 = -Static62.anInt1432; local280 <= 0; local280++) {
						local284 = Static220.anInt4646 + local280;
						@Pc(412) int local412 = Static220.anInt4646 - local280;
						@Pc(424) Class1_Sub7 local424;
						if (local266 >= Static163.anInt3523) {
							if (local284 >= Static127.anInt2831) {
								local424 = local382[local266][local284];
								if (local424 != null && local424.aBoolean53) {
									Static156.method2676(local424, false);
								}
							}
							if (local412 < Static230.anInt4880) {
								local424 = local382[local266][local412];
								if (local424 != null && local424.aBoolean53) {
									Static156.method2676(local424, false);
								}
							}
						}
						if (local275 < Static41.anInt972) {
							if (local284 >= Static127.anInt2831) {
								local424 = local382[local275][local284];
								if (local424 != null && local424.aBoolean53) {
									Static156.method2676(local424, false);
								}
							}
							if (local412 < Static230.anInt4880) {
								local424 = local382[local275][local412];
								if (local424 != null && local424.aBoolean53) {
									Static156.method2676(local424, false);
								}
							}
						}
						if (Static66.anInt1485 == 0) {
							if (!local247) {
								Static74.aBoolean75 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static74.aBoolean75 = false;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)I")
	public static int method1284(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
