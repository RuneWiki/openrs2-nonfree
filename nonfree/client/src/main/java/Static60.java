import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!gd;")
	public static Class27 aClass27_22;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!we;")
	public static Class62 aClass62_10;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!ff;")
	public static Class3_Sub1_Sub5_Sub2 aClass3_Sub1_Sub5_Sub2_2;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public static int anInt1561;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	public static int anInt1556 = -1;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public static int anInt1560 = 0;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "[I")
	public static int[] anIntArray194 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method1077() {
		for (@Pc(7) int local7 = 0; local7 < Static40.anInt1185; local7++) {
			@Pc(13) int local13 = Static69.anIntArray225[local7]--;
			if (Static69.anIntArray225[local7] >= -10) {
				@Pc(82) Class72 local82 = Static51.aClass72Array1[local7];
				if (local82 == null) {
					local82 = Static133.method1705(Static125.aClass62_Sub1_18, Static5.anIntArray17[local7]);
					if (local82 == null) {
						continue;
					}
					Static69.anIntArray225[local7] += local82.method1706();
					Static51.aClass72Array1[local7] = local82;
				}
				if (Static69.anIntArray225[local7] < 0) {
					@Pc(209) int local209;
					if (Static98.anIntArray314[local7] == 0) {
						local209 = Static54.anInt2848;
					} else {
						@Pc(125) int local125 = (Static98.anIntArray314[local7] & 0xFF) * 128;
						@Pc(133) int local133 = Static98.anIntArray314[local7] >> 16 & 0xFF;
						@Pc(143) int local143 = local133 * 128 + 64 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424;
						@Pc(151) int local151 = Static98.anIntArray314[local7] >> 8 & 0xFF;
						@Pc(161) int local161 = local151 * 128 + 64 - Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427;
						if (local143 < 0) {
							local143 = -local143;
						}
						if (local161 < 0) {
							local161 = -local161;
						}
						@Pc(183) int local183 = local143 + local161 - 128;
						if (local183 > local125) {
							Static69.anIntArray225[local7] = -100;
							continue;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						local209 = (local125 - local183) * Static56.anInt1508 / local125;
					}
					if (local209 > 0) {
						@Pc(223) Class3_Sub2_Sub1 local223 = local82.method1703().method1717(Static96.aClass14_3);
						@Pc(228) Class3_Sub10_Sub3 local228 = Static132.method1585(local223, local209);
						local228.method1595(Static120.anIntArray404[local7] - 1);
						Static36.aClass3_Sub10_Sub1_1.method862(local228);
					}
					Static69.anIntArray225[local7] = -100;
				}
			} else {
				Static40.anInt1185--;
				for (@Pc(29) int local29 = local7; local29 < Static40.anInt1185; local29++) {
					Static5.anIntArray17[local29] = Static5.anIntArray17[local29 + 1];
					Static51.aClass72Array1[local29] = Static51.aClass72Array1[local29 + 1];
					Static120.anIntArray404[local29] = Static120.anIntArray404[local29 + 1];
					Static69.anIntArray225[local29] = Static69.anIntArray225[local29 + 1];
					Static98.anIntArray314[local29] = Static98.anIntArray314[local29 + 1];
				}
				local7--;
			}
		}
		if (Static58.aBoolean56 && !Static94.method1556()) {
			if (Static96.anInt1448 != 0 && Static27.anInt856 != -1) {
				Static100.method1655(0, Static109.aClass62_Sub1_17, Static96.anInt1448, Static27.anInt856);
			}
			Static58.aBoolean56 = false;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBIIII)V")
	public static void method1078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static120.aClass39_1.method1010(arg0, arg3, arg2);
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(71) int local71;
		@Pc(56) int local56;
		if (local11 != 0) {
			local28 = Static120.aClass39_1.method985(arg0, arg3, arg2, local11);
			local34 = local28 >> 6 & 0x3;
			local38 = local28 & 0x1F;
			local40 = arg1;
			if (local11 > 0) {
				local40 = arg4;
			}
			@Pc(50) int[] local50 = Static124.aClass3_Sub1_Sub5_Sub4_38.anIntArray257;
			local56 = local11 >> 14 & 0x7FFF;
			local71 = arg3 * 4 + (-arg2 + 103) * 4 * 512 + 24624;
			@Pc(75) Class3_Sub1_Sub2 local75 = Static12.method200(local56);
			if (local75.anInt288 == -1) {
				if (local38 == 0 || local38 == 2) {
					if (local34 == 0) {
						local50[local71] = local40;
						local50[local71 + 512] = local40;
						local50[local71 + 1024] = local40;
						local50[local71 + 1536] = local40;
					} else if (local34 == 1) {
						local50[local71] = local40;
						local50[local71 + 1] = local40;
						local50[local71 + 2] = local40;
						local50[local71 + 3] = local40;
					} else if (local34 == 2) {
						local50[local71 + 3] = local40;
						local50[local71 + 515] = local40;
						local50[local71 + 1027] = local40;
						local50[local71 + 3 + 1536] = local40;
					} else if (local34 == 3) {
						local50[local71 + 1536] = local40;
						local50[local71 + 1 + 1536] = local40;
						local50[local71 + 1536 + 2] = local40;
						local50[local71 + 1539] = local40;
					}
				}
				if (local38 == 3) {
					if (local34 == 0) {
						local50[local71] = local40;
					} else if (local34 == 1) {
						local50[local71 + 3] = local40;
					} else if (local34 == 2) {
						local50[local71 + 1539] = local40;
					} else if (local34 == 3) {
						local50[local71 + 1536] = local40;
					}
				}
				if (local38 == 2) {
					if (local34 == 3) {
						local50[local71] = local40;
						local50[local71 + 512] = local40;
						local50[local71 + 1024] = local40;
						local50[local71 + 1536] = local40;
					} else if (local34 == 0) {
						local50[local71] = local40;
						local50[local71 + 1] = local40;
						local50[local71 + 2] = local40;
						local50[local71 + 3] = local40;
					} else if (local34 == 1) {
						local50[local71 + 3] = local40;
						local50[local71 + 3 + 512] = local40;
						local50[local71 + 1027] = local40;
						local50[local71 + 3 + 1536] = local40;
					} else if (local34 == 2) {
						local50[local71 + 1536] = local40;
						local50[local71 + 1536 + 1] = local40;
						local50[local71 + 1536 + 2] = local40;
						local50[local71 + 1536 + 3] = local40;
					}
				}
			} else {
				@Pc(395) Class3_Sub1_Sub5_Sub3 local395 = Static31.aClass3_Sub1_Sub5_Sub3Array2[local75.anInt288];
				if (local395 != null) {
					@Pc(408) int local408 = (local75.anInt270 * 4 - local395.anInt1168) / 2;
					@Pc(419) int local419 = (local75.anInt282 * 4 - local395.anInt1167) / 2;
					local395.method813(arg3 * 4 + local408 + 48, (-arg2 + 104 + -local75.anInt282) * 4 + (48 - -local419));
				}
			}
		}
		local11 = Static120.aClass39_1.method973(arg0, arg3, arg2);
		if (local11 != 0) {
			local28 = Static120.aClass39_1.method985(arg0, arg3, arg2, local11);
			local38 = local28 & 0x1F;
			local34 = local28 >> 6 & 0x3;
			local40 = local11 >> 14 & 0x7FFF;
			@Pc(478) Class3_Sub1_Sub2 local478 = Static12.method200(local40);
			@Pc(511) int local511;
			if (local478.anInt288 != -1) {
				@Pc(487) Class3_Sub1_Sub5_Sub3 local487 = Static31.aClass3_Sub1_Sub5_Sub3Array2[local478.anInt288];
				if (local487 != null) {
					local56 = (local478.anInt270 * 4 - local487.anInt1168) / 2;
					local511 = (local478.anInt282 * 4 - local487.anInt1167) / 2;
					local487.method813(local56 + arg3 * 4 + 48, local511 + 48 + (104 - (arg2 - -local478.anInt282)) * 4);
				}
			} else if (local38 == 9) {
				local71 = 15658734;
				if (local11 > 0) {
					local71 = 15597568;
				}
				@Pc(550) int[] local550 = Static124.aClass3_Sub1_Sub5_Sub4_38.anIntArray257;
				local511 = arg3 * 4 + 4 * 512 * (-arg2 + 103) + 24624;
				if (local34 == 0 || local34 == 2) {
					local550[local511 + 1536] = local71;
					local550[local511 + 1 + 1024] = local71;
					local550[local511 + 514] = local71;
					local550[local511 + 3] = local71;
				} else {
					local550[local511] = local71;
					local550[local511 + 513] = local71;
					local550[local511 + 2 + 1024] = local71;
					local550[local511 + 1536 + 3] = local71;
				}
			}
		}
		local11 = Static120.aClass39_1.method971(arg0, arg3, arg2);
		if (local11 == 0) {
			return;
		}
		local28 = local11 >> 14 & 0x7FFF;
		@Pc(644) Class3_Sub1_Sub2 local644 = Static12.method200(local28);
		if (local644.anInt288 == -1) {
			return;
		}
		@Pc(654) Class3_Sub1_Sub5_Sub3 local654 = Static31.aClass3_Sub1_Sub5_Sub3Array2[local644.anInt288];
		if (local654 != null) {
			local40 = (local644.anInt270 * 4 - local654.anInt1168) / 2;
			@Pc(677) int local677 = (local644.anInt282 * 4 - local654.anInt1167) / 2;
			local654.method813(local40 + arg3 * 4 + 48, (-arg2 - local644.anInt282 + 104) * 4 + 48 + local677);
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method1079() {
		anIntArray194 = null;
		aClass62_10 = null;
		aClass27_22 = null;
		aClass3_Sub1_Sub5_Sub2_2 = null;
	}
}
