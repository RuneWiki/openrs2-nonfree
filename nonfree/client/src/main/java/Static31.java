import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!cb", name = "zc", descriptor = "Lclient!jj;")
	public static Class87 aClass87_2;

	@OriginalMember(owner = "client!cb", name = "uc", descriptor = "I")
	public static int anInt855 = 0;

	@OriginalMember(owner = "client!cb", name = "vc", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[50][];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!hb;IIIIIIIIZIILclient!mi;)Lclient!hb;")
	public static Class15_Sub5 method631(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class112 arg12) {
		@Pc(25) long local25 = ((long) arg4 << 48) + (long) (arg0 - (-(arg11 << 16) - (arg8 << 24))) + ((long) arg2 << 32);
		@Pc(37) Class15_Sub5 local37 = (Class15_Sub5) Static11.aClass157_5.method4031(local25);
		@Pc(114) int local114;
		@Pc(120) int local120;
		@Pc(127) int local127;
		@Pc(131) int local131;
		@Pc(162) int local162;
		if (local37 == null) {
			@Pc(55) int[] local55 = new int[] { 64, 96, 128 };
			@Pc(67) byte local67;
			if (arg0 == 1) {
				local67 = 9;
			} else if (arg0 == 2) {
				local67 = 12;
			} else if (arg0 == 3) {
				local67 = 15;
			} else if (arg0 == 4) {
				local67 = 18;
			} else {
				local67 = 21;
			}
			@Pc(108) Class15_Sub7 local108 = new Class15_Sub7(local67 * 3 + 1, local67 * 3 * 2 - local67, 0);
			local114 = local108.method4205(0, 0);
			@Pc(118) int[][] local118 = new int[3][local67];
			for (local120 = 0; local120 < 3; local120++) {
				local127 = local55[local120];
				local131 = local55[local120];
				for (@Pc(133) int local133 = 0; local133 < local67; local133++) {
					@Pc(142) int local142 = (local133 << 11) / local67;
					@Pc(152) int local152 = arg5 + local131 * Class1.anIntArray3[local142] >> 16;
					local162 = local127 * Class1.anIntArray4[local142] + arg3 >> 16;
					local118[local120][local133] = local108.method4205(local162, local152);
				}
			}
			for (local120 = 0; local120 < 3; local120++) {
				local127 = (local120 * 256 + 128) / 3;
				local131 = 256 - local127;
				@Pc(211) byte local211 = (byte) (local127 * arg8 + local131 * arg11 >> 8);
				@Pc(256) short local256 = (short) ((local127 * (arg4 & 0x380) + (arg2 & 0x380) * local131 & 0x38000) + ((arg4 & 0xFC00) * local127 + (arg2 & 0xFC00) * local131 & 0xFC0000) + (local131 * (arg2 & 0x7F) + (arg4 & 0x7F) * local127 & 0x7F00) >> 8);
				for (local162 = 0; local162 < local67; local162++) {
					if (local120 == 0) {
						local108.method4208(local114, local118[0][(local162 + 1) % local67], local118[0][local162], local256, local211);
					} else {
						local108.method4208(local118[local120 - 1][local162], local118[local120 - 1][(local162 + 1) % local67], local118[local120][(local162 + 1) % local67], local256, local211);
						local108.method4208(local118[local120 - 1][local162], local118[local120][(local162 + 1) % local67], local118[local120][local162], local256, local211);
					}
				}
			}
			local37 = local108.method4225(64, 768, -50, -10, -50);
			Static11.aClass157_5.method4026(local25, local37);
		}
		@Pc(374) int local374 = arg0 * 64 - 1;
		@Pc(377) int local377 = -local374;
		@Pc(380) int local380 = -local374;
		@Pc(382) int local382 = local374;
		@Pc(385) int local385 = arg1.method2359();
		local114 = local374;
		if (arg9) {
			if (arg10 > 1152 && arg10 < 1920) {
				local382 = local374 + 128;
			}
			if (arg10 > 1664 || arg10 < 384) {
				local380 -= 128;
			}
			if (arg10 > 128 && arg10 < 896) {
				local377 -= 128;
			}
			if (arg10 > 640 && arg10 < 1408) {
				local114 = local374 + 128;
			}
		}
		if (local385 < local377) {
			local385 = local377;
		}
		local120 = arg1.method2343();
		if (local382 < local120) {
			local120 = local382;
		}
		local127 = arg1.method2349();
		@Pc(449) Class2_Sub8_Sub6 local449 = null;
		if (local127 < local380) {
			local127 = local380;
		}
		local131 = arg1.method2353();
		if (arg12 != null) {
			@Pc(470) int local470 = arg12.anIntArray378[arg6];
			local449 = Static152.method2798(local470 >> 16);
			arg6 = local470 & 0xFFFF;
		}
		if (local131 > local114) {
			local131 = local114;
		}
		if (local449 == null) {
			local37 = local37.method2358(true, true, true);
			local37.method2354((local120 - local385) / 2, 128, (local131 - local127) / 2);
			local37.method2356((local120 + local385) / 2, 0, (local131 + local127) / 2);
		} else {
			local37 = local37.method2358(!local449.method1160(arg6), !local449.method1163(arg6), true);
			local37.method2354((local120 - local385) / 2, 128, (local131 - local127) / 2);
			local37.method2356((local120 + local385) / 2, 0, (local127 + local131) / 2);
			local37.method2355(local449, arg6);
		}
		if (arg10 != 0) {
			local37.method2348(arg10);
		}
		if (Static116.aBoolean184) {
			@Pc(659) Class15_Sub5_Sub2 local659 = (Class15_Sub5_Sub2) local37;
			if (arg7 != Static234.method3798(arg5 + local127, arg3 - -local385, Static32.anInt876) || arg7 != Static234.method3798(local131 + arg5, arg3 - -local120, Static32.anInt876)) {
				for (local162 = 0; local162 < local659.anInt2972; local162++) {
					local659.anIntArray287[local162] += Static234.method3798(local659.anIntArray288[local162] + arg5, local659.anIntArray285[local162] - -arg3, Static32.anInt876) - arg7;
				}
				local659.aClass12_4.aBoolean24 = false;
				local659.aClass61_1.aBoolean148 = false;
			}
		} else {
			@Pc(589) Class15_Sub5_Sub1 local589 = (Class15_Sub5_Sub1) local37;
			if (Static234.method3798(local127 + arg5, arg3 - -local385, Static32.anInt876) != arg7 || Static234.method3798(local131 + arg5, local120 + arg3, Static32.anInt876) != arg7) {
				for (local162 = 0; local162 < local589.anInt2884; local162++) {
					local589.anIntArray244[local162] += Static234.method3798(arg5 + local589.anIntArray249[local162], arg3 + local589.anIntArray251[local162], Static32.anInt876) - arg7;
				}
				local589.aBoolean197 = false;
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ek;III)Lclient!bn;")
	public static Class2_Sub8_Sub1 method632(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		return Static187.method3282(arg0, arg1, 0) ? Static74.method1404() : null;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	public static void method634() {
		if (Static280.anInt5531 == -1 || Static160.anInt5160 == -1) {
			return;
		}
		@Pc(24) int local24 = Static241.anInt4808 + (Static249.anInt4896 * (Static127.anInt2925 - Static241.anInt4808) >> 16);
		Static249.anInt4896 += local24;
		@Pc(32) int local32 = Static273.anInt5426 * 2;
		if (Static249.anInt4896 < 65535) {
			Static166.aBoolean245 = false;
			Static247.aBoolean110 = false;
		} else {
			if (Static166.aBoolean245) {
				Static247.aBoolean110 = false;
			} else {
				Static247.aBoolean110 = true;
			}
			Static166.aBoolean245 = true;
			Static249.anInt4896 = 65535;
		}
		@Pc(56) float[] local56 = new float[3];
		@Pc(61) float local61 = (float) Static249.anInt4896 / 65535.0F;
		@Pc(81) int local81;
		@Pc(93) int local93;
		@Pc(126) int local126;
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(163) int local163;
		@Pc(154) int local154;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			local81 = Static173.anIntArrayArrayArray12[Static280.anInt5531][local32][local63] * 3;
			local93 = Static173.anIntArrayArrayArray12[Static280.anInt5531][local32 + 1][local63] * 3;
			local126 = (Static173.anIntArrayArrayArray12[Static280.anInt5531][local32 + 2][local63] + Static173.anIntArrayArrayArray12[Static280.anInt5531][local32 + 2][local63] - Static173.anIntArrayArrayArray12[Static280.anInt5531][local32 + 3][local63]) * 3;
			local134 = Static173.anIntArrayArrayArray12[Static280.anInt5531][local32][local63];
			local138 = local93 - local81;
			local154 = local93 + Static173.anIntArrayArrayArray12[Static280.anInt5531][local32 + 2][local63] - local134 - local126;
			local163 = local126 + local81 - local93 * 2;
			local56[local63] = local61 * ((float) local138 + local61 * ((float) local154 * local61 + (float) local163)) + (float) local134;
		}
		Static162.anInt3612 = (int) local56[1] * -1;
		Static192.anInt4017 = (int) local56[2] - Static234.anInt4705 * 128;
		@Pc(205) float[] local205 = new float[3];
		Static80.anInt1911 = (int) local56[0] - Static160.anInt5159 * 128;
		local81 = Static271.anInt5384 * 2;
		for (local93 = 0; local93 < 3; local93++) {
			local134 = Static173.anIntArrayArrayArray12[Static160.anInt5160][local81 + 1][local93] * 3;
			local126 = Static173.anIntArrayArrayArray12[Static160.anInt5160][local81][local93] * 3;
			local154 = local134 - local126;
			local138 = (Static173.anIntArrayArrayArray12[Static160.anInt5160][local81 + 2][local93] + Static173.anIntArrayArrayArray12[Static160.anInt5160][local81 + 2][local93] - Static173.anIntArrayArrayArray12[Static160.anInt5160][local81 + 3][local93]) * 3;
			local163 = Static173.anIntArrayArrayArray12[Static160.anInt5160][local81][local93];
			@Pc(299) int local299 = local126 + local138 - local134 * 2;
			@Pc(318) int local318 = Static173.anIntArrayArrayArray12[Static160.anInt5160][local81 + 2][local93] + local134 - local163 - local138;
			local205[local93] = (float) local163 + ((float) local154 + ((float) local318 * local61 + (float) local299) * local61) * local61;
		}
		@Pc(349) float local349 = local205[0] - local56[0];
		@Pc(359) float local359 = (local205[1] - local56[1]) * -1.0F;
		@Pc(368) float local368 = local205[2] - local56[2];
		@Pc(378) double local378 = Math.sqrt((double) (local368 * local368 + local349 * local349));
		Static58.aFloat4 = (float) Math.atan2((double) local359, local378);
		Static89.aFloat9 = -((float) Math.atan2((double) local349, (double) local368));
		Static151.anInt3328 = (int) ((double) Static89.aFloat9 * 325.949D) & 0x7FF;
		Static295.anInt5738 = (int) ((double) Static58.aFloat4 * 325.949D) & 0x7FF;
	}
}
