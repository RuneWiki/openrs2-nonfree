import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[[Lclient!ua;")
	public static Class1_Sub28[][] aClass1_Sub28ArrayArray3;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	public static int anInt5273 = 1;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "J")
	public static long aLong202 = 0L;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method3994() {
		Static7.aClass89_1.method2265();
		Static192.aClass89_28.method2265();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIBIII)V")
	public static void method3995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg2;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(30) int local30 = arg1 - arg2;
		@Pc(34) int local34 = local30 * local30;
		@Pc(38) int local38 = arg6 * arg6;
		@Pc(42) int local42 = local16 * local16;
		@Pc(46) int local46 = local38 << 1;
		@Pc(50) int local50 = arg6 << 1;
		@Pc(54) int local54 = local25 << 1;
		@Pc(58) int local58 = local34 << 1;
		@Pc(62) int local62 = local42 << 1;
		@Pc(66) int local66 = local16 << 1;
		@Pc(75) int local75 = local62 + local34 * (1 - local66);
		@Pc(84) int local84 = local46 + (1 - local50) * local25;
		@Pc(93) int local93 = local42 - local58 * (local66 - 1);
		@Pc(97) int local97 = local38 << 2;
		@Pc(106) int local106 = local38 - local54 * (local50 - 1);
		@Pc(110) int local110 = local25 << 2;
		@Pc(114) int local114 = local34 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(124) int local124 = (local50 - 3) * local54;
		@Pc(128) int local128 = local46 * 3;
		@Pc(132) int local132 = local62 * 3;
		@Pc(138) int local138 = (local66 - 3) * local58;
		@Pc(140) int local140 = local97;
		@Pc(142) int local142 = local118;
		@Pc(148) int local148 = local114 * (local16 - 1);
		@Pc(154) int local154 = (arg6 - 1) * local110;
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(195) int local195;
		@Pc(203) int local203;
		if (arg0 >= Static206.anInt4449 && Static90.anInt2088 >= arg0) {
			@Pc(168) int[] local168 = Static121.anIntArrayArray33[arg0];
			local177 = Static131.method2259(Static310.anInt6206, arg5 - arg1, Static170.anInt3814);
			local185 = Static131.method2259(Static310.anInt6206, arg1 + arg5, Static170.anInt3814);
			local195 = Static131.method2259(Static310.anInt6206, arg5 - local30, Static170.anInt3814);
			local203 = Static131.method2259(Static310.anInt6206, local30 + arg5, Static170.anInt3814);
			Static98.method3942(local195, local168, arg4, local177);
			Static98.method3942(local203, local168, arg3, local195);
			Static98.method3942(local185, local168, arg4, local203);
		}
		while (local9 > 0) {
			if (local84 < 0) {
				while (local84 < 0) {
					local106 += local140;
					local84 += local128;
					local7++;
					local140 += local97;
					local128 += local97;
				}
			}
			if (local106 < 0) {
				local7++;
				local106 += local140;
				local140 += local97;
				local84 += local128;
				local128 += local97;
			}
			local106 += -local124;
			@Pc(283) boolean local283 = local9 <= local16;
			local124 -= local110;
			if (local283) {
				if (local75 < 0) {
					while (local75 < 0) {
						local75 += local132;
						local11++;
						local132 += local118;
						local93 += local142;
						local142 += local118;
					}
				}
				if (local93 < 0) {
					local75 += local132;
					local11++;
					local93 += local142;
					local142 += local118;
					local132 += local118;
				}
				local75 += -local148;
				local148 -= local114;
				local93 += -local138;
				local138 -= local114;
			}
			local9--;
			local84 += -local154;
			local154 -= local110;
			local185 = local9 + arg0;
			local177 = arg0 - local9;
			if (Static206.anInt4449 <= local185 && Static90.anInt2088 >= local177) {
				local195 = Static131.method2259(Static310.anInt6206, arg5 + local7, Static170.anInt3814);
				local203 = Static131.method2259(Static310.anInt6206, arg5 - local7, Static170.anInt3814);
				if (local283) {
					@Pc(442) int local442 = Static131.method2259(Static310.anInt6206, arg5 + local11, Static170.anInt3814);
					@Pc(451) int local451 = Static131.method2259(Static310.anInt6206, arg5 - local11, Static170.anInt3814);
					@Pc(462) int[] local462;
					if (Static206.anInt4449 <= local177) {
						local462 = Static121.anIntArrayArray33[local177];
						Static98.method3942(local451, local462, arg4, local203);
						Static98.method3942(local442, local462, arg3, local451);
						Static98.method3942(local195, local462, arg4, local442);
					}
					if (Static90.anInt2088 >= local185) {
						local462 = Static121.anIntArrayArray33[local185];
						Static98.method3942(local451, local462, arg4, local203);
						Static98.method3942(local442, local462, arg3, local451);
						Static98.method3942(local195, local462, arg4, local442);
					}
				} else {
					if (local177 >= Static206.anInt4449) {
						Static98.method3942(local195, Static121.anIntArrayArray33[local177], arg4, local203);
					}
					if (Static90.anInt2088 >= local185) {
						Static98.method3942(local195, Static121.anIntArrayArray33[local185], arg4, local203);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
	public static void method3996() {
		Static255.aClass89_39.method2273(5);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method3997(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static22.anInt613 = arg0;
		Static161.aString215 = arg2;
		Static68.aString88 = arg1;
		if (Static161.aString215.equals("") || Static68.aString88.equals("")) {
			Static271.anInt5421 = 3;
		} else if (Static96.anInt2210 == -1) {
			Static31.anInt770 = 1;
			Static225.anInt4810 = 0;
			Static58.anInt1271 = 0;
			Static271.anInt5421 = -3;
			@Pc(41) Class1_Sub14 local41 = new Class1_Sub14(128);
			local41.method2191(10);
			local41.method2236((int) (Math.random() * 9.9999999E7D));
			local41.method2193(Static247.method3809(Static161.aString215));
			local41.method2236((int) (Math.random() * 9.9999999E7D));
			local41.method2188(Static68.aString88);
			local41.method2236((int) (Math.random() * 9.9999999E7D));
			local41.method2231(Static65.aBigInteger1, Static142.aBigInteger2);
			Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
			Static2.aClass1_Sub14_Sub1_1.method2191(24);
			Static2.aClass1_Sub14_Sub1_1.method2191(local41.anInt3000 + 2);
			Static2.aClass1_Sub14_Sub1_1.method2208(551);
			Static2.aClass1_Sub14_Sub1_1.method2201(local41.anInt3000, local41.aByteArray55);
		} else {
			Static222.method3478();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!wf;B)I")
	public static int method3998(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1) {
		if (arg1.anIntArrayArray78 == null || arg1.anIntArrayArray78.length <= arg0) {
			return -2;
		}
		try {
			@Pc(22) int local22 = 0;
			@Pc(27) int[] local27 = arg1.anIntArrayArray78[arg0];
			@Pc(29) int local29 = 0;
			@Pc(38) byte local38 = 0;
			while (true) {
				@Pc(43) int local43 = local27[local29++];
				@Pc(45) int local45 = 0;
				@Pc(47) byte local47 = 0;
				if (local43 == 0) {
					return local22;
				}
				if (local43 == 15) {
					local47 = 1;
				}
				if (local43 == 1) {
					local45 = Static269.anIntArray483[local27[local29++]];
				}
				if (local43 == 2) {
					local45 = Static55.anIntArray155[local27[local29++]];
				}
				if (local43 == 16) {
					local47 = 2;
				}
				if (local43 == 17) {
					local47 = 3;
				}
				if (local43 == 3) {
					local45 = Static189.anIntArray363[local27[local29++]];
				}
				@Pc(121) int local121;
				@Pc(134) Class191 local134;
				@Pc(139) int local139;
				@Pc(152) int local152;
				if (local43 == 4) {
					local121 = local27[local29++] << 16;
					@Pc(128) int local128 = local121 + local27[local29++];
					local134 = Static171.method2789(local128);
					local139 = local27[local29++];
					if (local139 != -1 && (!Static56.method1050(local139).aBoolean124 || Static160.aBoolean229)) {
						for (local152 = 0; local152 < local134.anIntArray561.length; local152++) {
							if (local139 + 1 == local134.anIntArray561[local152]) {
								local45 += local134.anIntArray553[local152];
							}
						}
					}
				}
				if (local43 == 5) {
					local45 = Static296.anIntArray530[local27[local29++]];
				}
				if (local43 == 6) {
					local45 = Class1_Sub7.anIntArray163[Static55.anIntArray155[local27[local29++]] - 1];
				}
				if (local43 == 7) {
					local45 = Static296.anIntArray530[local27[local29++]] * 100 / 46875;
				}
				if (local43 == 8) {
					local45 = Static56.aClass2_Sub4_Sub2_1.anInt2867;
				}
				if (local43 == 9) {
					for (local121 = 0; local121 < 25; local121++) {
						if (Static49.aBooleanArray12[local121]) {
							local45 += Static55.anIntArray155[local121];
						}
					}
				}
				if (local43 == 10) {
					local121 = local27[local29++] << 16;
					local121 += local27[local29++];
					local134 = Static171.method2789(local121);
					local139 = local27[local29++];
					if (local139 != -1 && (!Static56.method1050(local139).aBoolean124 || Static160.aBoolean229)) {
						for (local152 = 0; local152 < local134.anIntArray561.length; local152++) {
							if (local134.anIntArray561[local152] == local139 + 1) {
								local45 = 999999999;
								break;
							}
						}
					}
				}
				if (local43 == 11) {
					local45 = Static132.anInt3053;
				}
				if (local43 == 12) {
					local45 = Static281.anInt2795;
				}
				if (local43 == 13) {
					local121 = Static296.anIntArray530[local27[local29++]];
					@Pc(345) int local345 = local27[local29++];
					local45 = (0x1 << local345 & local121) == 0 ? 0 : 1;
				}
				if (local43 == 14) {
					local121 = local27[local29++];
					local45 = Static138.method2304(local121);
				}
				if (local43 == 18) {
					local45 = Static159.anInt3527 + (Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7);
				}
				if (local43 == 19) {
					local45 = (Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7) + Static217.anInt4673;
				}
				if (local43 == 20) {
					local45 = local27[local29++];
				}
				if (local47 == 0) {
					if (local38 == 0) {
						local22 += local45;
					}
					if (local38 == 1) {
						local22 -= local45;
					}
					if (local38 == 2 && local45 != 0) {
						local22 /= local45;
					}
					if (local38 == 3) {
						local22 *= local45;
					}
					local38 = 0;
				} else {
					local38 = local47;
				}
			}
		} catch (@Pc(453) Exception local453) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZIII)V")
	public static void method3999(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static83.method1427(false);
		Static210.anInt4563 = arg3;
		Static80.anInt1844 = arg2;
		Static135.aBoolean190 = arg0;
		Static268.method2003(arg1);
		Static255.aClass186_22 = new Class186(8);
		Static31.aClass186_3 = new Class186(8);
	}
}
