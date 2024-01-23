import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!pk;")
	public static Class132 aClass132_90;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
	public static int anInt5451;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt5448 = 0;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public static int anInt5450 = 0;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	public static int anInt5452 = 0;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray41 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public static void method4117() {
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(16) int local16;
		@Pc(32) int local32;
		@Pc(36) int local36;
		if (Static277.anInt5667 == 67) {
			local16 = Static275.aClass8_Sub2_Sub1_6.method2358();
			local20 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local24 = local20 >> 2;
			local28 = local20 & 0x3;
			local32 = Static156.anIntArray250[local24];
			local36 = Static275.aClass8_Sub2_Sub1_6.method2338();
			local44 = (local36 >> 4 & 0x7) + Static216.anInt4456;
			local50 = (local36 & 0x7) + anInt5451;
			if (local44 >= 0 && local50 >= 0 && local44 < 104 && local50 < 104) {
				Static68.method1240(Static34.anInt770, local44, local32, -1, local16, local24, local28, 0, local50);
			}
			return;
		}
		@Pc(133) int local133;
		@Pc(124) int local124;
		@Pc(139) int local139;
		@Pc(147) int local147;
		@Pc(143) int local143;
		if (Static277.anInt5667 == 131) {
			@Pc(88) byte local88 = Static275.aClass8_Sub2_Sub1_6.method2351();
			local20 = Static275.aClass8_Sub2_Sub1_6.method2350();
			local24 = Static275.aClass8_Sub2_Sub1_6.method2348();
			local28 = Static275.aClass8_Sub2_Sub1_6.method2358();
			@Pc(104) byte local104 = Static275.aClass8_Sub2_Sub1_6.method2337();
			@Pc(108) byte local108 = Static275.aClass8_Sub2_Sub1_6.method2374();
			local44 = Static275.aClass8_Sub2_Sub1_6.method2358();
			local50 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local124 = (local50 & 0x7) + anInt5451;
			local133 = Static216.anInt4456 + (local50 >> 4 & 0x7);
			local139 = Static275.aClass8_Sub2_Sub1_6.method2338();
			local143 = local139 & 0x3;
			local147 = local139 >> 2;
			@Pc(151) byte local151 = Static275.aClass8_Sub2_Sub1_6.method2351();
			if (!Static116.aBoolean188) {
				Static190.method2980(local151, local133, local44, local104, local147, local143, local24, local124, local20, local88, local28, local108);
			}
		}
		if (Static277.anInt5667 == 26) {
			local16 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local20 = Static216.anInt4456 * 2 + (local16 >> 4 & 0xF);
			local24 = anInt5451 * 2 + (local16 & 0xF);
			local28 = Static275.aClass8_Sub2_Sub1_6.method2374() + local20;
			local32 = Static275.aClass8_Sub2_Sub1_6.method2374() + local24;
			local36 = Static275.aClass8_Sub2_Sub1_6.method2360();
			local44 = Static275.aClass8_Sub2_Sub1_6.method2360();
			local50 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local133 = Static275.aClass8_Sub2_Sub1_6.method2374();
			local124 = Static275.aClass8_Sub2_Sub1_6.method2334() * 4;
			local139 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local147 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local143 = Static275.aClass8_Sub2_Sub1_6.method2334();
			@Pc(246) int local246 = Static275.aClass8_Sub2_Sub1_6.method2334();
			if (local143 == 255) {
				local143 = -1;
			}
			if (local20 >= 0 && local24 >= 0 && local20 < 208 && local24 < 208 && local28 >= 0 && local32 >= 0 && local28 < 208 && local32 < 208 && local50 != 65535) {
				local32 = local32 * 64;
				local28 *= 64;
				local24 *= 64;
				local20 *= 64;
				if (local36 != 0) {
					@Pc(322) int local322;
					@Pc(335) Class36_Sub3 local335;
					@Pc(316) int local316;
					@Pc(326) int local326;
					if (local36 < 0) {
						local316 = -local36 - 1;
						local322 = local316 >> 11 & 0xF;
						local326 = local316 & 0x7FF;
						if (Static34.anInt765 == local326) {
							local335 = Static21.aClass36_Sub3_Sub1_1;
						} else {
							local335 = Static230.aClass36_Sub3_Sub1Array1[local326];
						}
					} else {
						local316 = local36 - 1;
						local326 = local316 & 0x7FF;
						local335 = Static48.aClass36_Sub3_Sub2Array1[local326];
						local322 = local316 >> 11 & 0xF;
					}
					if (local335 != null) {
						@Pc(368) Class12 local368 = local335.method3105();
						if (local368.anIntArrayArray2 != null && local368.anIntArrayArray2[local322] != null) {
							local133 -= local368.anIntArrayArray2[local322][1];
							local326 = local368.anIntArrayArray2[local322][0];
							@Pc(399) int local399 = Class68.anIntArray137[local335.anInt4128];
							@Pc(406) int local406 = local368.anIntArrayArray2[local322][2];
							@Pc(411) int local411 = Class68.anIntArray139[local335.anInt4128];
							@Pc(422) int local422 = local399 * local406 + local411 * local326 >> 16;
							@Pc(432) int local432 = local406 * local411 - local326 * local399 >> 16;
							local24 += local432;
							local20 += local422;
						}
					}
				}
				@Pc(469) Class36_Sub6 local469 = new Class36_Sub6(local50, Static34.anInt770, local20, local24, Static59.method927(local20, local24, Static34.anInt770) - local133, local139 + Static183.anInt3590, local147 + Static183.anInt3590, local143, local246, local44, local124);
				local469.method3582(Static183.anInt3590 + local139, local28, local32, Static59.method927(local28, local32, Static34.anInt770) - local124);
				Static123.aClass182_11.method4328(new Class8_Sub1_Sub9(local469));
			}
		} else if (Static277.anInt5667 == 203) {
			local16 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local20 = (local16 >> 4 & 0x7) + Static216.anInt4456;
			local24 = (local16 & 0x7) + anInt5451;
			local28 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local32 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local36 = local32 >> 4 & 0xF;
			if (local28 == 65535) {
				local28 = -1;
			}
			local44 = local32 & 0x7;
			local50 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local133 = Static275.aClass8_Sub2_Sub1_6.method2334();
			if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
				local124 = local36 + 1;
				if (local20 - local124 <= Static21.aClass36_Sub3_Sub1_1.anIntArray310[0] && local20 + local124 >= Static21.aClass36_Sub3_Sub1_1.anIntArray310[0] && local24 - local124 <= Static21.aClass36_Sub3_Sub1_1.anIntArray308[0] && local124 + local24 >= Static21.aClass36_Sub3_Sub1_1.anIntArray308[0] && Static106.anInt2205 != 0 && local44 > 0 && Static156.anInt3156 < 50 && local28 != -1) {
					Static113.anIntArray188[Static156.anInt3156] = local28;
					Static42.anIntArray64[Static156.anInt3156] = local44;
					Static157.anIntArray497[Static156.anInt3156] = local50;
					Static55.aClass104Array1[Static156.anInt3156] = null;
					Static102.anIntArray151[Static156.anInt3156] = (local20 << 16) + (local24 << 8) + local36;
					Static52.anIntArray81[Static156.anInt3156] = local133;
					Static156.anInt3156++;
				}
			}
		} else if (Static277.anInt5667 == 45) {
			local16 = Static275.aClass8_Sub2_Sub1_6.method2322();
			local20 = (local16 >> 4 & 0x7) + Static216.anInt4456;
			local24 = anInt5451 + (local16 & 0x7);
			local28 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local32 = local28 >> 2;
			local36 = local28 & 0x3;
			local44 = Static156.anIntArray250[local32];
			if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
				Static68.method1240(Static34.anInt770, local20, local44, -1, -1, local32, local36, 0, local24);
			}
		} else if (Static277.anInt5667 == 29) {
			local16 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local24 = (local16 & 0x7) + anInt5451;
			local20 = (local16 >> 4 & 0x7) + Static216.anInt4456;
			local28 = Static275.aClass8_Sub2_Sub1_6.method2375();
			if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
				@Pc(787) Class182 local787 = Static124.aClass182ArrayArrayArray1[Static34.anInt770][local20][local24];
				if (local787 != null) {
					for (@Pc(796) Class8_Sub1_Sub15 local796 = (Class8_Sub1_Sub15) local787.method4319(); local796 != null; local796 = (Class8_Sub1_Sub15) local787.method4329()) {
						if ((local28 & 0x7FFF) == local796.aClass36_Sub1_1.anInt1114) {
							local796.method4273();
							break;
						}
					}
					if (local787.method4319() == null) {
						Static124.aClass182ArrayArrayArray1[Static34.anInt770][local20][local24] = null;
					}
					Static115.method1856(local24, local20);
				}
			}
		} else if (Static277.anInt5667 == 237) {
			local16 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local20 = Static216.anInt4456 + (local16 >> 4 & 0x7);
			local24 = (local16 & 0x7) + anInt5451;
			local28 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local32 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local36 = Static275.aClass8_Sub2_Sub1_6.method2375();
			if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
				@Pc(891) Class182 local891 = Static124.aClass182ArrayArrayArray1[Static34.anInt770][local20][local24];
				if (local891 != null) {
					for (@Pc(901) Class8_Sub1_Sub15 local901 = (Class8_Sub1_Sub15) local891.method4319(); local901 != null; local901 = (Class8_Sub1_Sub15) local891.method4329()) {
						@Pc(907) Class36_Sub1 local907 = local901.aClass36_Sub1_1;
						if ((local28 & 0x7FFF) == local907.anInt1114 && local32 == local907.anInt1113) {
							local907.anInt1113 = local36;
							break;
						}
					}
					Static115.method1856(local24, local20);
				}
			}
		} else if (Static277.anInt5667 == 199) {
			local16 = Static275.aClass8_Sub2_Sub1_6.method2375();
			local20 = Static275.aClass8_Sub2_Sub1_6.method2348();
			local24 = Static275.aClass8_Sub2_Sub1_6.method2334();
			local32 = anInt5451 + (local24 & 0x7);
			local28 = Static216.anInt4456 + (local24 >> 4 & 0x7);
			local36 = Static275.aClass8_Sub2_Sub1_6.method2348();
			if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104 && Static34.anInt765 != local36) {
				@Pc(997) Class36_Sub1 local997 = new Class36_Sub1();
				local997.anInt1114 = local16;
				local997.anInt1113 = local20;
				if (Static124.aClass182ArrayArrayArray1[Static34.anInt770][local28][local32] == null) {
					Static124.aClass182ArrayArrayArray1[Static34.anInt770][local28][local32] = new Class182();
				}
				Static124.aClass182ArrayArrayArray1[Static34.anInt770][local28][local32].method4328(new Class8_Sub1_Sub15(local997));
				Static115.method1856(local32, local28);
			}
		} else {
			@Pc(1208) Class36_Sub6 local1208;
			if (Static277.anInt5667 == 92) {
				local16 = Static275.aClass8_Sub2_Sub1_6.method2334();
				local20 = (local16 >> 4 & 0xF) + Static216.anInt4456 * 2;
				local24 = anInt5451 * 2 + (local16 & 0xF);
				local28 = local20 + Static275.aClass8_Sub2_Sub1_6.method2374();
				local32 = Static275.aClass8_Sub2_Sub1_6.method2374() + local24;
				local36 = Static275.aClass8_Sub2_Sub1_6.method2360();
				local44 = Static275.aClass8_Sub2_Sub1_6.method2375();
				local50 = Static275.aClass8_Sub2_Sub1_6.method2334() * 4;
				local133 = Static275.aClass8_Sub2_Sub1_6.method2334() * 4;
				local124 = Static275.aClass8_Sub2_Sub1_6.method2375();
				local139 = Static275.aClass8_Sub2_Sub1_6.method2375();
				local147 = Static275.aClass8_Sub2_Sub1_6.method2334();
				local143 = Static275.aClass8_Sub2_Sub1_6.method2334();
				if (local147 == 255) {
					local147 = -1;
				}
				if (local20 >= 0 && local24 >= 0 && local20 < 208 && local24 < 208 && local28 >= 0 && local32 >= 0 && local28 < 208 && local32 < 208 && local44 != 65535) {
					local24 = local24 * 64;
					local20 *= 64;
					local32 *= 64;
					local28 = local28 * 64;
					local1208 = new Class36_Sub6(local44, Static34.anInt770, local20, local24, Static59.method927(local20, local24, Static34.anInt770) - local50, Static183.anInt3590 + local124, Static183.anInt3590 + local139, local147, local143, local36, local133);
					local1208.method3582(local124 + Static183.anInt3590, local28, local32, Static59.method927(local28, local32, Static34.anInt770) - local133);
					Static123.aClass182_11.method4328(new Class8_Sub1_Sub9(local1208));
				}
			} else if (Static277.anInt5667 == 63) {
				local16 = Static275.aClass8_Sub2_Sub1_6.method2377();
				local20 = Static275.aClass8_Sub2_Sub1_6.method2338();
				local24 = local20 >> 2;
				local32 = Static156.anIntArray250[local24];
				local28 = local20 & 0x3;
				if (local16 == 65535) {
					local16 = -1;
				}
				local36 = Static275.aClass8_Sub2_Sub1_6.method2338();
				local44 = Static216.anInt4456 + (local36 >> 4 & 0x7);
				local50 = (local36 & 0x7) + anInt5451;
				Static17.method322(local50, local24, local28, Static34.anInt770, local44, local16, local32);
			} else if (Static277.anInt5667 == 218) {
				local16 = Static275.aClass8_Sub2_Sub1_6.method2334();
				local20 = (local16 >> 4 & 0x7) + Static216.anInt4456;
				local24 = (local16 & 0x7) + anInt5451;
				local28 = Static275.aClass8_Sub2_Sub1_6.method2375();
				local32 = Static275.aClass8_Sub2_Sub1_6.method2334();
				local36 = Static275.aClass8_Sub2_Sub1_6.method2375();
				if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
					local24 = local24 * 128 + 64;
					local20 = local20 * 128 + 64;
					@Pc(1377) Class36_Sub5 local1377 = new Class36_Sub5(local28, Static34.anInt770, local20, local24, Static59.method927(local20, local24, Static34.anInt770) - local32, local36, Static183.anInt3590);
					Static164.aClass182_13.method4328(new Class8_Sub1_Sub19(local1377));
				}
			} else if (Static277.anInt5667 == 111) {
				local16 = Static275.aClass8_Sub2_Sub1_6.method2375();
				local20 = Static275.aClass8_Sub2_Sub1_6.method2334();
				Static235.method3578(local16).method1577(local20);
			} else if (Static277.anInt5667 == 134) {
				local16 = Static275.aClass8_Sub2_Sub1_6.method2377();
				local20 = Static275.aClass8_Sub2_Sub1_6.method2334();
				local24 = (local20 >> 4 & 0x7) + Static216.anInt4456;
				local28 = anInt5451 + (local20 & 0x7);
				local32 = Static275.aClass8_Sub2_Sub1_6.method2377();
				if (local24 >= 0 && local28 >= 0 && local24 < 104 && local28 < 104) {
					@Pc(1455) Class36_Sub1 local1455 = new Class36_Sub1();
					local1455.anInt1113 = local32;
					local1455.anInt1114 = local16;
					if (Static124.aClass182ArrayArrayArray1[Static34.anInt770][local24][local28] == null) {
						Static124.aClass182ArrayArrayArray1[Static34.anInt770][local24][local28] = new Class182();
					}
					Static124.aClass182ArrayArrayArray1[Static34.anInt770][local24][local28].method4328(new Class8_Sub1_Sub15(local1455));
					Static115.method1856(local28, local24);
				}
			} else if (Static277.anInt5667 == 230) {
				local16 = Static275.aClass8_Sub2_Sub1_6.method2334();
				local24 = (local16 & 0x7) + anInt5451;
				local20 = Static216.anInt4456 + (local16 >> 4 & 0x7);
				local28 = Static275.aClass8_Sub2_Sub1_6.method2374() + local20;
				local32 = Static275.aClass8_Sub2_Sub1_6.method2374() + local24;
				local36 = Static275.aClass8_Sub2_Sub1_6.method2360();
				local44 = Static275.aClass8_Sub2_Sub1_6.method2375();
				local50 = Static275.aClass8_Sub2_Sub1_6.method2334() * 4;
				local133 = Static275.aClass8_Sub2_Sub1_6.method2334() * 4;
				local124 = Static275.aClass8_Sub2_Sub1_6.method2375();
				local139 = Static275.aClass8_Sub2_Sub1_6.method2375();
				local147 = Static275.aClass8_Sub2_Sub1_6.method2334();
				local143 = Static275.aClass8_Sub2_Sub1_6.method2334();
				if (local147 == 255) {
					local147 = -1;
				}
				if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104 && local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104 && local44 != 65535) {
					local32 = local32 * 128 + 64;
					local20 = local20 * 128 + 64;
					local24 = local24 * 128 + 64;
					local1208 = new Class36_Sub6(local44, Static34.anInt770, local20, local24, Static59.method927(local20, local24, Static34.anInt770) - local50, local124 - -Static183.anInt3590, local139 + Static183.anInt3590, local147, local143, local36, local133);
					local28 = local28 * 128 + 64;
					local1208.method3582(local124 + Static183.anInt3590, local28, local32, Static59.method927(local28, local32, Static34.anInt770) - local133);
					Static123.aClass182_11.method4328(new Class8_Sub1_Sub9(local1208));
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method4118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return "<col=ff0000>";
		} else if (local4 < -6) {
			return "<col=ff3000>";
		} else if (local4 < -3) {
			return "<col=ff7000>";
		} else if (local4 < 0) {
			return "<col=ffb000>";
		} else if (local4 > 9) {
			return "<col=00ff00>";
		} else if (local4 > 6) {
			return "<col=40ff00>";
		} else if (local4 > 3) {
			return "<col=80ff00>";
		} else if (local4 <= 0) {
			return "<col=ffff00>";
		} else {
			return "<col=c0ff00>";
		}
	}
}
