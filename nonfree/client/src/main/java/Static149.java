import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!dp;")
	public static Class53 aClass53_83;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
	public static int anInt2752;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "[I")
	public static final int[] anIntArray343 = new int[50];

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "[Lclient!kf;")
	public static final Class6_Sub2_Sub9[] aClass6_Sub2_Sub9Array5 = new Class6_Sub2_Sub9[14];

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
	public static int anInt2759 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZI)V")
	public static void method2899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static39.aClass187ArrayArrayArray1 == null) {
			Static289.aClass81_7.method3017(arg1, -16777216, arg4, arg2, arg0);
			return;
		}
		Static138.anInt4577++;
		if (Static253.aClass44_Sub4_Sub4_Sub1_1 != null && Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 + 64 - Static253.aClass44_Sub4_Sub4_Sub1_1.method4714() * 64 >> 7 == Static299.anInt5652 && Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 - (Static253.aClass44_Sub4_Sub4_Sub1_1.method4714() - 1) * 64 >> 7 == Static24.anInt385) {
			Static24.anInt385 = -1;
			Static299.anInt5652 = -1;
			Static98.method2027();
		}
		Static224.method3949();
		if (!arg3) {
			Static247.method4076();
		}
		Static212.method3773();
		Static223.method3939(arg4, arg0, arg2, arg1, true);
		@Pc(77) int local77 = Static220.anInt4055;
		@Pc(79) int local79 = Static147.anInt2723;
		@Pc(81) int local81 = Static250.anInt490;
		@Pc(83) int local83 = Static238.anInt5098;
		@Pc(94) int local94;
		@Pc(125) int local125;
		if (Static334.anInt6112 == 1) {
			local94 = (int) Static163.aFloat69;
			if (Static86.anInt1602 >> 8 > local94) {
				local94 = Static86.anInt1602 >> 8;
			}
			if (Static345.aBooleanArray28[4] && Static150.anIntArray346[4] + 128 > local94) {
				local94 = Static150.anIntArray346[4] + 128;
			}
			local125 = (int) Static117.aFloat58 + Static256.anInt4734 & 0x3FFF;
			Static113.method2273(Static306.method5249(Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340, Static343.anInt6225) - 50, local94, Static219.anInt4043, local79, Static304.anInt5743, local125, (local94 >> 3) * 3 + 600);
		} else if (Static334.anInt6112 == 4) {
			local94 = (int) Static163.aFloat69;
			if (Static86.anInt1602 >> 8 > local94) {
				local94 = Static86.anInt1602 >> 8;
			}
			if (Static345.aBooleanArray28[4] && Static150.anIntArray346[4] + 128 > local94) {
				local94 = Static150.anIntArray346[4] + 128;
			}
			local125 = (int) Static117.aFloat58 & 0x3FFF;
			Static113.method2273(Static306.method5249(Static277.anInt5293, Static10.anInt187, Static343.anInt6225) - 50, local94, Static219.anInt4043, local79, Static304.anInt5743, local125, (local94 >> 3) * 3 + 600);
		} else if (Static334.anInt6112 == 5) {
			Static193.method3599(local79);
		}
		local94 = Static287.anInt5405;
		local125 = Static217.anInt4016;
		@Pc(230) int local230 = Static11.anInt197;
		@Pc(232) int local232 = Static110.anInt2047;
		@Pc(234) int local234 = Static79.anInt1450;
		@Pc(278) int local278;
		for (@Pc(236) int local236 = 0; local236 < 5; local236++) {
			if (Static345.aBooleanArray28[local236]) {
				local278 = (int) ((double) -Static108.anIntArray273[local236] + (double) (Static108.anIntArray273[local236] * 2 + 1) * Math.random() + Math.sin((double) Static278.anIntArray660[local236] / 100.0D * (double) Static311.anIntArray664[local236]) * (double) Static150.anIntArray346[local236]);
				if (local236 == 0) {
					Static287.anInt5405 += local278;
				}
				if (local236 == 3) {
					Static79.anInt1450 = local278 + Static79.anInt1450 & 0x3FFF;
				}
				if (local236 == 2) {
					Static11.anInt197 += local278;
				}
				if (local236 == 1) {
					Static217.anInt4016 += local278;
				}
				if (local236 == 4) {
					Static110.anInt2047 += local278;
					if (Static110.anInt2047 < 1024) {
						Static110.anInt2047 = 1024;
					} else if (Static110.anInt2047 > 3072) {
						Static110.anInt2047 = 3072;
					}
				}
			}
		}
		if (Static287.anInt5405 < 0) {
			Static287.anInt5405 = 0;
		}
		if ((Static310.anInt5828 << 7) - 1 < Static287.anInt5405) {
			Static287.anInt5405 = (Static310.anInt5828 << 7) - 1;
		}
		if (Static11.anInt197 < 0) {
			Static11.anInt197 = 0;
		}
		if ((Static163.anInt3084 << 7) - 1 < Static11.anInt197) {
			Static11.anInt197 = (Static163.anInt3084 << 7) - 1;
		}
		Static104.method2109();
		Static115.method2323();
		Static289.aClass81_7.method3033(local83, local77, local81 + local83, local77 + local79);
		Static289.aClass81_7.method3023();
		local278 = Static292.anInt5494;
		if (Static309.aClass125_1 == null) {
			Static289.aClass81_7.method2987(local278);
		} else {
			Static309.aClass125_1.method3404(local278, local81, local79, Static289.aClass81_7, local83, local77, Static177.anInt3319 << 3, Static79.anInt1450, Static110.anInt2047);
		}
		Static24.method359();
		Static160.aClass72_3.method4077(Static287.anInt5405, Static217.anInt4016, Static11.anInt197, -Static110.anInt2047 & 0x3FFF, -Static79.anInt1450 & 0x3FFF, -Static53.anInt1017 & 0x3FFF);
		Static289.aClass81_7.method2954(Static160.aClass72_3);
		Static289.aClass81_7.method2985(local83 + local81 / 2, local79 / 2 + local77, Static313.anInt5841 << 1, Static313.anInt5841 << 1);
		Static138.method4284(Static313.anInt5841 << 1, local81 / 2 + local83, Static313.anInt5841 << 1, local77 + local79 / 2);
		Static328.method5461(-Static53.anInt1017 & 0x3FFF, Static217.anInt4016, -Static110.anInt2047 & 0x3FFF, Static287.anInt5405, Static11.anInt197, -Static79.anInt1450 & 0x3FFF);
		@Pc(504) byte local504 = Static44.method763() == 2 ? (byte) Static138.anInt4577 : 1;
		Static300.method5156(Static289.aClass81_7, Static76.anInt2853, Static220.anInt4057, Static160.aClass72_3, Static287.anInt5405, Static217.anInt4016, Static11.anInt197, Static37.aByteArrayArrayArray2, Static326.anIntArray687, Static102.anIntArray566, Static22.anIntArray36, Static36.anIntArray86, Static247.anIntArray485, Static343.anInt6225 + 1, local504, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7, !Static349.aBoolean421);
		Static24.method359();
		if (Static129.anInt2374 == 30) {
			Static101.method2073(local79, local77, local83, local81);
			Static145.method2739(local77, local81, local83, local79);
			Static9.method165(local81, local83, local77, local79);
			Static113.method2277(local77, local79, local81, local83);
		}
		Static14.method249();
		Static110.anInt2047 = local232;
		Static287.anInt5405 = local94;
		Static11.anInt197 = local230;
		Static217.anInt4016 = local125;
		Static79.anInt1450 = local234;
		if (Static51.aBoolean77 && Static124.aClass113_1.method3132() == 0) {
			Static51.aBoolean77 = false;
		}
		if (Static51.aBoolean77) {
			Static289.aClass81_7.method3017(local79, -16777216, local81, local83, local77);
			Static113.method2274(false, Static171.aString133, Static298.aClass30_4);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IJZIZIILjava/lang/String;ZLjava/lang/String;I)V")
	public static void method2907(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) String arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class6_Sub10 local30 = new Class6_Sub10(128);
		local30.method3968(10);
		local30.method4025((arg2 ? 1 : 0) | (arg8 ? 2 : 0) | (arg4 ? 4 : 0));
		local30.method3970(arg1);
		local30.method3976(local8[0]);
		local30.method3966(arg7);
		local30.method3976(local8[1]);
		local30.method4025(Static41.anInt6384);
		local30.method3968(arg3);
		local30.method3968(arg0);
		local30.method3976(local8[2]);
		local30.method4025(arg6);
		local30.method4025(arg5);
		local30.method3976(local8[3]);
		local30.method4004(Static343.aBigInteger6, Static102.aBigInteger5);
		@Pc(127) Class6_Sub10 local127 = new Class6_Sub10(350);
		local127.method3966(arg9);
		@Pc(140) int local140 = 8 - Static302.method5198(arg9) % 8;
		for (@Pc(142) int local142 = 0; local142 < local140; local142++) {
			local127.method3968((int) (Math.random() * 255.0D));
		}
		local127.method3993(local8);
		Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
		Static131.aClass6_Sub10_Sub1_2.method3968(22);
		Static131.aClass6_Sub10_Sub1_2.method4025(local127.anInt4188 + local30.anInt4188 + 2);
		Static131.aClass6_Sub10_Sub1_2.method4025(558);
		Static131.aClass6_Sub10_Sub1_2.method4014(local30.aByteArray67, local30.anInt4188);
		Static131.aClass6_Sub10_Sub1_2.method4014(local127.aByteArray67, local127.anInt4188);
		Static92.anInt1691 = -3;
		Static291.anInt5474 = 0;
		Static166.anInt3137 = 0;
		Static215.anInt3939 = 1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBLclient!mb;IIIII)V")
	public static void method2908(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1.anInt3524 == 2) {
			@Pc(7) int local7 = 99999;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg1.anInt3536; local13++) {
				for (@Pc(17) int local17 = 0; local17 < arg1.anInt3580; local17++) {
					@Pc(29) int local29 = arg3 + (arg1.anInt3511 + 32) * local17;
					@Pc(39) int local39 = arg0 + (arg1.anInt3501 + 32) * local13;
					if (local11 < 20) {
						local29 += arg1.anIntArray412[local11];
						local39 += arg1.anIntArray418[local11];
					}
					if (arg1.anIntArray414[local11] > 0 && (arg4 < local29 + 32 && arg2 > local29 && arg6 < local39 + 32 && local39 < arg5 || Static313.aClass132_18 == arg1 && Static65.anInt1207 == local11)) {
						if (local11 > local9) {
							local9 = local11;
						}
						if (local11 < local7) {
							local7 = local11;
						}
					}
					local11++;
				}
			}
			Static148.method2896(arg1, local9, local7, Static289.aClass81_7);
		} else if (arg1.anInt3524 == 5 && arg1.anInt3508 != -1) {
			Static147.method2878(Static289.aClass81_7, arg1);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIB)V")
	public static void method2911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(21) int local21 = -arg2;
		@Pc(23) int local23 = -1;
		@Pc(31) int local31 = Static6.method125(arg3 + arg2, Static265.anInt4933, Static311.anInt5837);
		@Pc(39) int local39 = Static6.method125(arg3 - arg2, Static265.anInt4933, Static311.anInt5837);
		Static14.method247(local31, arg0, Static11.anIntArrayArray11[arg1], local39);
		while (local9 > local7) {
			local23 += 2;
			local21 += local23;
			@Pc(71) int local71;
			@Pc(76) int local76;
			@Pc(95) int local95;
			@Pc(104) int local104;
			if (local21 > 0) {
				local9--;
				local21 -= local9 << 1;
				local71 = arg1 - local9;
				local76 = arg1 + local9;
				if (Static327.anInt3039 <= local76 && local71 <= Static230.anInt4308) {
					local95 = Static6.method125(arg3 + local7, Static265.anInt4933, Static311.anInt5837);
					local104 = Static6.method125(arg3 - local7, Static265.anInt4933, Static311.anInt5837);
					if (Static230.anInt4308 >= local76) {
						Static14.method247(local95, arg0, Static11.anIntArrayArray11[local76], local104);
					}
					if (local71 >= Static327.anInt3039) {
						Static14.method247(local95, arg0, Static11.anIntArrayArray11[local71], local104);
					}
				}
			}
			local7++;
			local71 = arg1 - local7;
			local76 = arg1 + local7;
			if (local76 >= Static327.anInt3039 && local71 <= Static230.anInt4308) {
				local95 = Static6.method125(local9 + arg3, Static265.anInt4933, Static311.anInt5837);
				local104 = Static6.method125(arg3 - local9, Static265.anInt4933, Static311.anInt5837);
				if (local76 <= Static230.anInt4308) {
					Static14.method247(local95, arg0, Static11.anIntArrayArray11[local76], local104);
				}
				if (Static327.anInt3039 <= local71) {
					Static14.method247(local95, arg0, Static11.anIntArrayArray11[local71], local104);
				}
			}
		}
	}
}
