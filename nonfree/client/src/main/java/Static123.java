import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!go", name = "i", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!go", name = "p", descriptor = "Lclient!ko;")
	public static final Class1_Sub22 aClass1_Sub22_5 = new Class1_Sub22(0, -1);

	@OriginalMember(owner = "client!go", name = "q", descriptor = "I")
	public static int anInt5254 = -1;

	@OriginalMember(owner = "client!go", name = "x", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_136 = new Class211(15, 4);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I[[[BILclient!tq;IIIIIIIII)V")
	public static void method4612(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class164 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg10 == 0 || arg4 == 0) {
			return;
		}
		if (arg10 == 9) {
			arg7 = arg7 + 1 & 0x3;
			arg10 = 1;
		}
		if (arg10 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg10 = 1;
		}
		if (arg10 == 11) {
			arg10 = 8;
			arg7 = arg7 + 3 & 0x3;
		}
		arg3.method5354(arg5, arg2, arg11, arg6, arg9, arg8, arg1[arg10 - 1][arg7], arg4, arg0);
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V")
	public static void method4613() {
		if (Static227.anInt4752 == -1 || Static72.anInt1436 == -1) {
			return;
		}
		@Pc(24) int local24 = (Static198.anInt3500 * (Static45.anInt876 - Static43.anInt862) >> 16) + Static43.anInt862;
		Static198.anInt3500 += local24;
		if (Static198.anInt3500 < 65535) {
			Static89.aBoolean143 = false;
			Static56.aBoolean104 = false;
		} else {
			Static198.anInt3500 = 65535;
			if (Static89.aBoolean143) {
				Static56.aBoolean104 = false;
			} else {
				Static56.aBoolean104 = true;
			}
			Static89.aBoolean143 = true;
		}
		@Pc(56) float local56 = (float) Static198.anInt3500 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static356.anInt3386 * 2;
		@Pc(89) int local89;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(143) int local143;
		@Pc(160) int local160;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static215.anIntArrayArrayArray11[Static227.anInt4752][local63][local65] * 3;
			local89 = Static215.anIntArrayArrayArray11[Static227.anInt4752][local63 + 1][local65] * 3;
			local121 = (Static215.anIntArrayArrayArray11[Static227.anInt4752][local63 + 2][local65] + Static215.anIntArrayArrayArray11[Static227.anInt4752][local63 + 2][local65] - Static215.anIntArrayArrayArray11[Static227.anInt4752][local63 + 3][local65]) * 3;
			local129 = Static215.anIntArrayArrayArray11[Static227.anInt4752][local63][local65];
			local134 = local89 - local77;
			local143 = local121 + local77 - local89 * 2;
			local160 = local89 + Static215.anIntArrayArrayArray11[Static227.anInt4752][local63 + 2][local65] - local129 - local121;
			local59[local65] = (float) local129 + ((float) local134 + local56 * (local56 * (float) local160 + (float) local143)) * local56;
		}
		Static133.anInt2471 = (int) local59[2] - Static293.anInt5053 * 128;
		Static256.anInt4409 = (int) local59[0] - Static256.anInt4410 * 128;
		Static337.anInt5598 = (int) local59[1] * -1;
		@Pc(214) float[] local214 = new float[3];
		local89 = Static64.anInt1263 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static215.anIntArrayArrayArray11[Static72.anInt1436][local89][local121] * 3;
			local134 = Static215.anIntArrayArrayArray11[Static72.anInt1436][local89 + 1][local121] * 3;
			local143 = (Static215.anIntArrayArrayArray11[Static72.anInt1436][local89 + 2][local121] + Static215.anIntArrayArrayArray11[Static72.anInt1436][local89 + 2][local121] - Static215.anIntArrayArrayArray11[Static72.anInt1436][local89 + 3][local121]) * 3;
			local160 = Static215.anIntArrayArrayArray11[Static72.anInt1436][local89][local121];
			@Pc(290) int local290 = local134 - local129;
			@Pc(299) int local299 = local143 + local129 - local134 * 2;
			@Pc(316) int local316 = local134 + Static215.anIntArrayArrayArray11[Static72.anInt1436][local89 - -2][local121] - local160 - local143;
			local214[local121] = (float) local160 + local56 * (((float) local299 + (float) local316 * local56) * local56 + (float) local290);
		}
		@Pc(350) float local350 = local214[0] - local59[0];
		@Pc(360) float local360 = -1.0F * (local214[1] - local59[1]);
		@Pc(368) float local368 = local214[2] - local59[2];
		@Pc(378) double local378 = Math.sqrt((double) (local350 * local350 + local368 * local368));
		Static311.anInt5293 = (int) (Math.atan2((double) local360, local378) * 2607.5945876176133D) & 0x3FFF;
		Static155.anInt2834 = (int) (-Math.atan2((double) local350, (double) local368) * 2607.5945876176133D) & 0x3FFF;
		Static11.anInt3597 = ((Static215.anIntArrayArrayArray11[Static227.anInt4752][local63 + 2][3] - Static215.anIntArrayArrayArray11[Static227.anInt4752][local63][3]) * Static198.anInt3500 >> 16) + Static215.anIntArrayArrayArray11[Static227.anInt4752][local63][3];
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!h;ZI)V")
	public static void method4614(@OriginalArg(0) Class25_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static215.anInt3678 >= 400) {
			return;
		}
		@Pc(14) Class59 local14 = arg0.aClass59_1;
		if (local14.anIntArray186 != null) {
			local14 = local14.method1150(Static230.aClass72_3);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean125) {
			return;
		}
		@Pc(36) String local36 = local14.aString11;
		if (local14.anInt1399 != 0) {
			@Pc(55) String local55 = Static313.aClass94_8 == Static360.aClass94_7 ? Static379.aClass169_331.method3680(Static48.anInt952) : Static145.aClass169_130.method3680(Static48.anInt952);
			local36 = local36 + Static280.method4288(Static321.aClass25_Sub1_Sub1_Sub1_2.anInt607, local14.anInt1399) + " (" + local55 + local14.anInt1399 + ")";
		}
		if (!Static90.aBoolean144) {
			if (!arg1) {
				@Pc(85) String[] local85 = local14.aStringArray19;
				if (Static100.aBoolean594) {
					local85 = Static265.method4067(local85);
				}
				@Pc(95) int local95;
				if (local85 != null) {
					for (local95 = 4; local95 >= 0; local95--) {
						if (local85[local95] != null && (Static313.aClass94_8 != Static59.aClass94_3 || !local85[local95].equalsIgnoreCase(Static38.aClass169_31.method3680(Static48.anInt952)))) {
							@Pc(115) byte local115 = 0;
							@Pc(117) int local117 = Static260.anInt4514;
							if (local95 == 0) {
								local115 = 8;
							}
							if (local95 == 1) {
								local115 = 23;
							}
							if (local95 == 2) {
								local115 = 25;
							}
							if (local95 == 3) {
								local115 = 6;
							}
							if (local95 == 4) {
								local115 = 3;
							}
							if (local95 == local14.anInt1423) {
								local117 = local14.anInt1411;
							}
							if (local14.anInt1405 == local95) {
								local117 = local14.anInt1397;
							}
							Static337.method4814((long) arg0.anInt2331, local115, true, local117, "<col=ffff00>" + local36, local85[local95], 0, -1, false, 0);
						}
					}
				}
				if (Static59.aClass94_3 == Static313.aClass94_8 && local85 != null) {
					for (local95 = 4; local95 >= 0; local95--) {
						if (local85[local95] != null && local85[local95].equalsIgnoreCase(Static38.aClass169_31.method3680(Static48.anInt952))) {
							@Pc(224) short local224 = 0;
							if (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt607 < local14.anInt1399) {
								local224 = 2000;
							}
							@Pc(237) short local237 = 0;
							if (local95 == 0) {
								local237 = 8;
							}
							if (local95 == 1) {
								local237 = 23;
							}
							if (local95 == 2) {
								local237 = 25;
							}
							if (local95 == 3) {
								local237 = 6;
							}
							if (local95 == 4) {
								local237 = 3;
							}
							if (local237 != 0) {
								local237 += local224;
							}
							Static337.method4814((long) arg0.anInt2331, local237, true, local14.anInt1403, "<col=ffff00>" + local36, local85[local95], 0, -1, false, 0);
						}
					}
				}
			}
			Static337.method4814((long) arg0.anInt2331, 1012, true, Static274.anInt4782, "<col=ffff00>" + local36, Static344.aClass169_302.method3680(Static48.anInt952), 0, -1, arg1, 0);
		} else if (!arg1) {
			@Pc(346) Class24 local346 = Static236.anInt3954 == -1 ? null : Static232.aClass47_2.method888(Static236.anInt3954);
			if ((Static176.anInt3186 & 0x2) != 0) {
				if (local346 == null || local14.method1149(local346.anInt392, Static236.anInt3954) != local346.anInt392) {
					Static337.method4814((long) arg0.anInt2331, 57, true, Static215.anInt3687, Static28.aString7 + " -> <col=ffff00>" + local36, Static114.aString18, 0, -1, false, 0);
				}
				return;
			}
		}
	}
}
