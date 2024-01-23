import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[I")
	public static int[] anIntArray412;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Z")
	public static boolean aBoolean315 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)[Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2[] method4034() {
		@Pc(4) Class1_Sub2_Sub1_Sub2[] local4 = new Class1_Sub2_Sub1_Sub2[Static94.anInt3439];
		for (@Pc(6) int local6 = 0; local6 < Static94.anInt3439; local6++) {
			@Pc(17) int local17 = Static235.anIntArray468[local6] * Static160.anIntArray267[local6];
			@Pc(21) byte[] local21 = Static69.aByteArrayArray15[local6];
			@Pc(24) int[] local24 = new int[local17];
			for (@Pc(26) int local26 = 0; local26 < local17; local26++) {
				local24[local26] = Static83.anIntArray144[local21[local26] & 0xFF];
			}
			local4[local6] = new Class1_Sub2_Sub1_Sub2(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local6], anIntArray412[local6], Static160.anIntArray267[local6], Static235.anIntArray468[local6], local24);
		}
		Static117.method2101();
		return local4;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method4035(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(26) int local26 = local17 + (arg0 ? Static162.anInt3211 : Static285.anInt5125);
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = local17; local30 < local26; local30++) {
			@Pc(37) Class1_Sub2_Sub7 local37 = Static235.method4486(local30);
			if (local37.aBoolean165 && local37.method2223().toLowerCase().indexOf(local8) != -1) {
				if (local28 >= 50) {
					Static86.aShortArray35 = null;
					Static136.anInt2742 = -1;
					return;
				}
				if (local11.length <= local28) {
					@Pc(75) short[] local75 = new short[local11.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local28; local77++) {
						local75[local77] = local11[local77];
					}
					local11 = local75;
				}
				local11[local28++] = (short) local30;
			}
		}
		Static86.aShortArray35 = local11;
		Static136.anInt2742 = local28;
		@Pc(111) String[] local111 = new String[Static136.anInt2742];
		Static169.anInt3314 = 0;
		for (@Pc(126) int local126 = 0; local126 < Static136.anInt2742; local126++) {
			local111[local126] = Static235.method4486(local11[local126]).method2223();
		}
		Static196.method3169(Static86.aShortArray35, local111);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([[I[[I[[I[[[I[[BI[[F[[II[[B[[I[[B[[F[[F[[B[[[B)[Lclient!wb;")
	private static Class1_Sub31[] method4036(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) float[][] arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) byte[][] arg13, @OriginalArg(15) byte[][][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(57) byte local57;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local18 = 1; local18 <= 103; local18++) {
				local23 = 0;
				if (arg3 != null) {
					@Pc(38) int local38 = arg3[arg7][local11 >> 3][local18 >> 3];
					local23 = local38 >> 1 & 0x3;
				}
				if (local23 == 0) {
					local57 = arg13[local11][local18];
					if (local57 == 0) {
						local57 = arg13[local11 - 1][local18];
					}
					if (local57 == 0) {
						local57 = arg13[local11][local18 - 1];
					}
					if (local57 == 0) {
						local57 = arg13[local11 - 1][local18 - 1];
					}
				} else if (local23 == 1) {
					local57 = arg13[local11][local18 - 1];
					if (local57 == 0) {
						local57 = arg13[local11][local18];
					}
					if (local57 == 0) {
						local57 = arg13[local11 - 1][local18 - 1];
					}
					if (local57 == 0) {
						local57 = arg13[local11 - 1][local18];
					}
				} else if (local23 == 2) {
					local57 = arg13[local11 - 1][local18 - 1];
					if (local57 == 0) {
						local57 = arg13[local11][local18 - 1];
					}
					if (local57 == 0) {
						local57 = arg13[local11 - 1][local18];
					}
					if (local57 == 0) {
						local57 = arg13[local11][local18];
					}
				} else {
					local57 = arg13[local11 - 1][local18];
					if (local57 == 0) {
						local57 = arg13[local11 - 1][local18 - 1];
					}
					if (local57 == 0) {
						local57 = arg13[local11][local18];
					}
					if (local57 == 0) {
						local57 = arg13[local11][local18 - 1];
					}
				}
				if (local57 != 0) {
					@Pc(261) Class74 local261 = Static75.method1479((local57 & 0xFF) - 1);
					local9[local11][local18] = (local261.anInt2482 + 1 << 16) + local261.anInt2481;
				}
			}
		}
		@Pc(287) Class142 local287 = new Class142(128);
		@Pc(341) int local341;
		@Pc(367) int local367;
		@Pc(369) int local369;
		for (local18 = 1; local18 <= 102; local18++) {
			for (local23 = 1; local23 <= 102; local23++) {
				if (arg13[local18][local23] != 0) {
					@Pc(323) int[] local323;
					if (arg10[local18][local23] == 0) {
						local323 = Static169.anIntArrayArray25[0];
					} else {
						local323 = Static244.anIntArrayArray36[arg8[local18][local23]];
						if (local323.length == 0) {
							continue;
						}
					}
					local341 = local9[local18][local23];
					@Pc(351) int local351 = local9[local18 + 1][local23 + 1];
					@Pc(359) int local359 = local9[local18][local23 + 1];
					local367 = local9[local18 + 1][local23];
					local369 = 0;
					if (arg9 != null) {
						local369 = arg9[local18][local23] & 0xFFFFFF;
					}
					@Pc(388) long local388 = (long) local369 | (long) local341 << 32;
					@Pc(396) long local396 = (long) local367 << 32 | (long) local369;
					@Pc(401) int local401 = local323.length / 2;
					@Pc(409) long local409 = (long) local351 << 32 | (long) local369;
					@Pc(415) Class1_Sub31 local415 = (Class1_Sub31) local287.method3543(local388);
					if (local415 == null) {
						local415 = new Class1_Sub31((local341 >> 16) - 1, (float) (local341 & 0xFFFF), false, arg2 != null, local369);
						local287.method3537(local415, local388);
					}
					local415.anInt5413++;
					local415.anInt5417 += local401;
					if (local396 != local388) {
						local415 = (Class1_Sub31) local287.method3543(local396);
						if (local415 == null) {
							local415 = new Class1_Sub31((local367 >> 16) - 1, (float) (local367 & 0xFFFF), false, arg2 != null, local369);
							local287.method3537(local415, local396);
						}
						local415.anInt5417 += local401;
						local415.anInt5413++;
					}
					@Pc(521) long local521 = (long) local369 | (long) local359 << 32;
					if (local409 != local388 && local396 != local409) {
						local415 = (Class1_Sub31) local287.method3543(local409);
						if (local415 == null) {
							local415 = new Class1_Sub31((local351 >> 16) - 1, (float) (local351 & 0xFFFF), false, arg2 != null, local369);
							local287.method3537(local415, local409);
						}
						local415.anInt5417 += local401;
						local415.anInt5413++;
					}
					if (local521 != local388 && local396 != local521 && local409 != local521) {
						local415 = (Class1_Sub31) local287.method3543(local521);
						if (local415 == null) {
							local415 = new Class1_Sub31((local359 >> 16) - 1, (float) (local359 & 0xFFFF), false, arg2 != null, local369);
							local287.method3537(local415, local521);
						}
						local415.anInt5413++;
						local415.anInt5417 += local401;
					}
				}
			}
		}
		@Pc(656) Class1_Sub31 local656;
		for (local656 = (Class1_Sub31) local287.method3534(); local656 != null; local656 = (Class1_Sub31) local287.method3530()) {
			local656.method4604();
		}
		for (local18 = 1; local18 <= 102; local18++) {
			for (local23 = 1; local23 <= 102; local23++) {
				local57 = arg13[local18][local23];
				if (local57 != 0) {
					if ((arg14[arg7][local18][local23] & 0x8) != 0) {
						local369 = 0;
					} else if ((arg14[1][local18][local23] & 0x2) == 2 && arg7 > 0) {
						local369 = arg7 - 1;
					} else {
						local369 = arg7;
					}
					local341 = 0;
					local367 = 128;
					if (arg9 != null) {
						local341 = arg9[local18][local23] & 0xFFFFFF;
						local367 = arg9[local18][local23] >>> 24 << 3;
					}
					@Pc(757) boolean[] local757 = null;
					@Pc(793) int local793;
					@Pc(858) int local858;
					@Pc(772) int[] local772;
					@Pc(963) byte local963;
					@Pc(820) int local820;
					@Pc(841) int local841;
					if (arg10[local18][local23] == 0) {
						local772 = Static169.anIntArrayArray25[0];
						local793 = local57 == arg13[local18 - 1][local23 - 1] ? 1 : -1;
						local820 = arg13[local18 + 1][local23 - 1] == local57 ? 1 : -1;
						local841 = arg13[local18 - 1][local23 + 1] == local57 ? 1 : -1;
						local858 = local57 == arg13[local18 + 1][local23 + 1] ? 1 : -1;
						if (arg13[local18][local23 - 1] == local57) {
							local820++;
							local793++;
						} else {
							local820--;
							local793--;
						}
						if (arg13[local18 + 1][local23] == local57) {
							local820++;
							local858++;
						} else {
							local820--;
							local858--;
						}
						if (local57 == arg13[local18][local23 + 1]) {
							local858++;
							local841++;
						} else {
							local858--;
							local841--;
						}
						if (arg13[local18 - 1][local23] == local57) {
							local793++;
							local841++;
						} else {
							local841--;
							local793--;
						}
						@Pc(938) int local938 = local820 - local841;
						if (local938 < 0) {
							local938 = -local938;
						}
						@Pc(949) int local949 = local793 - local858;
						if (local949 < 0) {
							local949 = -local949;
						}
						local963 = (byte) (local938 > local949 ? 1 : 0);
						arg4[local18][local23] = local963;
					} else {
						local757 = Static155.aBooleanArrayArray3[arg8[local18][local23]];
						local772 = Static244.anIntArrayArray36[arg8[local18][local23]];
						local963 = arg4[local18][local23];
						if (local772.length == 0) {
							continue;
						}
					}
					local820 = local9[local18 + 1][local23];
					local858 = local9[local18 + 1][local23 + 1];
					local793 = local9[local18][local23];
					local841 = local9[local18][local23 + 1];
					@Pc(1039) long local1039 = (long) local820 << 32 | (long) local341;
					@Pc(1047) long local1047 = (long) local341 | (long) local858 << 32;
					@Pc(1053) int local1053 = arg0[local18][local23];
					@Pc(1061) long local1061 = (long) local341 | (long) local793 << 32;
					@Pc(1069) int local1069 = arg0[local18 + 1][local23];
					@Pc(1077) long local1077 = (long) local841 << 32 | (long) local341;
					@Pc(1087) int local1087 = arg0[local18 + 1][local23 + 1];
					@Pc(1093) int local1093 = arg6[local18][local23];
					@Pc(1101) int local1101 = arg0[local18][local23 + 1];
					@Pc(1111) int local1111 = arg6[local18 + 1][local23 + 1];
					@Pc(1119) int local1119 = arg6[local18 + 1][local23];
					@Pc(1127) int local1127 = arg6[local18][local23 + 1];
					@Pc(1133) int local1133 = (local820 >> 16) - 1;
					@Pc(1139) int local1139 = (local793 >> 16) - 1;
					@Pc(1145) int local1145 = (local841 >> 16) - 1;
					@Pc(1151) int local1151 = (local858 >> 16) - 1;
					@Pc(1157) Class1_Sub31 local1157 = (Class1_Sub31) local287.method3543(local1061);
					Static29.method473(local757, local793 <= local793, local793 <= local820, local367, Static185.method3029(local1139, local1087, local1111), local1157, Static185.method3029(local1139, local1101, local1127), local772, arg12, local23, arg1, local963, arg5, local369, arg11, Static185.method3029(local1139, local1053, local1093), Static185.method3029(local1139, local1069, local1119), local18, arg2, local793 <= local841, local858 >= local793);
					if (local1061 != local1039) {
						local1157 = (Class1_Sub31) local287.method3543(local1039);
						Static29.method473(local757, local820 <= local793, local820 <= local820, local367, Static185.method3029(local1133, local1087, local1111), local1157, Static185.method3029(local1133, local1101, local1127), local772, arg12, local23, arg1, local963, arg5, local369, arg11, Static185.method3029(local1133, local1053, local1093), Static185.method3029(local1133, local1069, local1119), local18, arg2, local820 <= local841, local820 <= local858);
					}
					if (local1061 != local1047 && local1047 != local1039) {
						local1157 = (Class1_Sub31) local287.method3543(local1047);
						Static29.method473(local757, local858 <= local793, local858 <= local820, local367, Static185.method3029(local1151, local1087, local1111), local1157, Static185.method3029(local1151, local1101, local1127), local772, arg12, local23, arg1, local963, arg5, local369, arg11, Static185.method3029(local1151, local1053, local1093), Static185.method3029(local1151, local1069, local1119), local18, arg2, local858 <= local841, local858 <= local858);
					}
					if (local1077 != local1061 && local1039 != local1077 && local1077 != local1047) {
						local1157 = (Class1_Sub31) local287.method3543(local1077);
						Static29.method473(local757, local841 <= local793, local841 <= local820, local367, Static185.method3029(local1145, local1087, local1111), local1157, Static185.method3029(local1145, local1101, local1127), local772, arg12, local23, arg1, local963, arg5, local369, arg11, Static185.method3029(local1145, local1053, local1093), Static185.method3029(local1145, local1069, local1119), local18, arg2, local841 >= local841, local841 <= local858);
					}
				}
			}
		}
		for (local656 = (Class1_Sub31) local287.method3534(); local656 != null; local656 = (Class1_Sub31) local287.method3530()) {
			if (local656.anInt5415 == 0) {
				local656.method4779();
			} else {
				local656.method4602();
			}
		}
		local18 = local287.method3529();
		@Pc(1531) long[] local1531 = new long[local18];
		@Pc(1534) Class1_Sub31[] local1534 = new Class1_Sub31[local18];
		local287.method3540(local1534);
		for (local369 = 0; local369 < local18; local369++) {
			local1531[local369] = local1534[local369].aLong214;
		}
		Static73.method1460(local1534, local1531);
		return local1534;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([Lclient!ne;IZ[[[I)V")
	public static void method4038(@OriginalArg(0) Class118[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(13) byte local13;
		if (arg1) {
			local13 = 1;
		} else {
			local13 = 4;
		}
		@Pc(21) int local21;
		@Pc(28) int local28;
		if (!arg1) {
			for (local21 = 0; local21 < 4; local21++) {
				for (local28 = 0; local28 < 104; local28++) {
					for (@Pc(33) int local33 = 0; local33 < 104; local33++) {
						if ((Static104.aByteArrayArrayArray3[local21][local28][local33] & 0x1) == 1) {
							@Pc(52) int local52 = local21;
							if ((Static104.aByteArrayArrayArray3[1][local28][local33] & 0x2) == 2) {
								local52 = local21 - 1;
							}
							if (local52 >= 0) {
								arg0[local52].method3044(local28, local33);
							}
						}
					}
				}
			}
			Static52.anInt5632 += (int) (Math.random() * 5.0D) - 2;
			Static229.anInt4205 += (int) (Math.random() * 5.0D) - 2;
			if (Static229.anInt4205 < -16) {
				Static229.anInt4205 = -16;
			}
			if (Static229.anInt4205 > 16) {
				Static229.anInt4205 = 16;
			}
			if (Static52.anInt5632 < -8) {
				Static52.anInt5632 = -8;
			}
			if (Static52.anInt5632 > 8) {
				Static52.anInt5632 = 8;
			}
		}
		local21 = Static52.anInt5632 >> 2 << 10;
		local28 = Static229.anInt4205 >> 1;
		@Pc(148) int[][] local148 = new int[104][104];
		@Pc(152) int[][] local152 = new int[104][104];
		@Pc(154) int local154;
		@Pc(170) int local170;
		@Pc(180) int local180;
		@Pc(175) int local175;
		@Pc(196) int local196;
		@Pc(202) int local202;
		@Pc(204) int local204;
		@Pc(209) int local209;
		@Pc(300) int local300;
		@Pc(235) int local235;
		@Pc(255) int local255;
		@Pc(268) int local268;
		for (local154 = 0; local154 < local13; local154++) {
			@Pc(161) byte[][] local161 = Static174.aByteArrayArrayArray11[local154];
			@Pc(274) int local274;
			@Pc(278) int local278;
			@Pc(284) int local284;
			@Pc(349) int local349;
			if (!Static156.aBoolean211) {
				local170 = (int) Math.sqrt(5100.0D);
				local180 = local170 * 768 >> 8;
				for (local175 = 1; local175 < 103; local175++) {
					for (local196 = 1; local196 < 103; local196++) {
						local204 = Static24.anIntArrayArrayArray2[local154][local196 + 1][local175] - Static24.anIntArrayArrayArray2[local154][local196 - 1][local175];
						local209 = Static24.anIntArrayArrayArray2[local154][local196][local175 + 1] - Static24.anIntArrayArrayArray2[local154][local196][local175 - 1];
						local300 = (int) Math.sqrt((double) (local209 * local209 + local204 * local204 + 65536));
						local274 = (local161[local196][local175 - 1] >> 2) + ((local161[local196 - 1][local175] >> 2) - (-(local161[local196 + 1][local175] >> 3) - (local161[local196][local175 + 1] >> 3) - (local161[local196][local175] >> 1)));
						local268 = (local209 << 8) / local300;
						local255 = -65536 / local300;
						local235 = (local204 << 8) / local300;
						local202 = (local235 * -50 + local255 * -10 + local268 * -50) / local180 + 74;
						local152[local196][local175] = local202 - local274;
					}
				}
			} else if (Static311.aBoolean384) {
				for (local170 = 1; local170 < 103; local170++) {
					for (local180 = 1; local180 < 103; local180++) {
						local196 = (local161[local180][local170 - 1] >> 2) + (local161[local180 + 1][local170] >> 3) + (local161[local180 + -1][local170] >> 2) + (local161[local180][local170 + 1] >> 3) + (local161[local180][local170] >> 1);
						local152[local180][local170] = 74 - local196;
					}
				}
			} else {
				local170 = (int) Static283.aFloatArray26[0];
				local175 = (int) Static283.aFloatArray26[2];
				local180 = (int) Static283.aFloatArray26[1];
				local196 = (int) Math.sqrt((double) (local180 * local180 + local170 * local170 + local175 * local175));
				local202 = local196 * 1024 >> 8;
				for (local204 = 1; local204 < 103; local204++) {
					for (local209 = 1; local209 < 103; local209++) {
						local235 = Static24.anIntArrayArrayArray2[local154][local209 + 1][local204] - Static24.anIntArrayArrayArray2[local154][local209 - 1][local204];
						local255 = Static24.anIntArrayArrayArray2[local154][local209][local204 + 1] - Static24.anIntArrayArrayArray2[local154][local209][local204 - 1];
						local268 = (int) Math.sqrt((double) (local255 * local255 + local235 * local235 + 65536));
						local274 = (local235 << 8) / local268;
						local278 = -65536 / local268;
						local284 = (local255 << 8) / local268;
						local300 = (local180 * local278 + local170 * local274 + local175 * local284) / local202 + 96;
						local349 = (local161[local209][local204] >> 1) + ((local161[local209][local204 + 1] >> 3) + (local161[local209 - 1][local204] >> 2) + (local161[local209 + 1][local204] >> 3) + (local161[local209][local204 + -1] >> 2));
						local152[local209][local204] = local300 - (int) ((float) local349 * 1.7F);
					}
				}
			}
			for (local170 = 0; local170 < 104; local170++) {
				Static129.anIntArray223[local170] = 0;
				Static91.anIntArray164[local170] = 0;
				Static100.anIntArray175[local170] = 0;
				Static24.anIntArray24[local170] = 0;
				Static180.anIntArray293[local170] = 0;
			}
			for (local170 = -5; local170 < 104; local170++) {
				for (local180 = 0; local180 < 104; local180++) {
					local175 = local170 + 5;
					@Pc(729) int local729;
					if (local175 < 104) {
						local196 = Static244.aByteArrayArrayArray18[local154][local175][local180] & 0xFF;
						if (local196 > 0) {
							@Pc(693) Class74 local693 = Static75.method1479(local196 - 1);
							Static129.anIntArray223[local180] += local693.anInt2479;
							Static91.anIntArray164[local180] += local693.anInt2483;
							Static100.anIntArray175[local180] += local693.anInt2484;
							Static24.anIntArray24[local180] += local693.anInt2477;
							local729 = Static180.anIntArray293[local180]++;
						}
					}
					local196 = local170 - 5;
					if (local196 >= 0) {
						local202 = Static244.aByteArrayArrayArray18[local154][local196][local180] & 0xFF;
						if (local202 > 0) {
							@Pc(761) Class74 local761 = Static75.method1479(local202 - 1);
							Static129.anIntArray223[local180] -= local761.anInt2479;
							Static91.anIntArray164[local180] -= local761.anInt2483;
							Static100.anIntArray175[local180] -= local761.anInt2484;
							Static24.anIntArray24[local180] -= local761.anInt2477;
							local729 = Static180.anIntArray293[local180]--;
						}
					}
				}
				if (local170 >= 0) {
					local175 = 0;
					local180 = 0;
					local202 = 0;
					local204 = 0;
					local196 = 0;
					for (local209 = -5; local209 < 104; local209++) {
						local300 = local209 + 5;
						if (local300 < 104) {
							local196 += Static100.anIntArray175[local300];
							local202 += Static24.anIntArray24[local300];
							local204 += Static180.anIntArray293[local300];
							local180 += Static129.anIntArray223[local300];
							local175 += Static91.anIntArray164[local300];
						}
						local235 = local209 - 5;
						if (local235 >= 0) {
							local202 -= Static24.anIntArray24[local235];
							local204 -= Static180.anIntArray293[local235];
							local175 -= Static91.anIntArray164[local235];
							local196 -= Static100.anIntArray175[local235];
							local180 -= Static129.anIntArray223[local235];
						}
						if (local209 >= 0 && local204 > 0) {
							local148[local170][local209] = Static154.method2641(local180 * 256 / local202, local175 / local204, local196 / local204);
						}
					}
				}
			}
			for (local170 = 1; local170 < 103; local170++) {
				label763: for (local180 = 1; local180 < 103; local180++) {
					if (arg1 || Static278.method4290() || (Static104.aByteArrayArrayArray3[0][local170][local180] & 0x2) != 0 || (Static104.aByteArrayArrayArray3[local154][local170][local180] & 0x10) == 0 && Static266.method4187(local154, local180, local170) == Static43.anInt905) {
						if (Static251.anInt4555 > local154) {
							Static251.anInt4555 = local154;
						}
						local175 = Static244.aByteArrayArrayArray18[local154][local170][local180] & 0xFF;
						local196 = Static250.aByteArrayArrayArray19[local154][local170][local180] & 0xFF;
						if (local175 > 0 || local196 > 0) {
							local204 = Static24.anIntArrayArrayArray2[local154][local170 + 1][local180];
							local209 = Static24.anIntArrayArrayArray2[local154][local170 + 1][local180 + 1];
							local202 = Static24.anIntArrayArrayArray2[local154][local170][local180];
							local300 = Static24.anIntArrayArrayArray2[local154][local170][local180 + 1];
							if (local154 > 0) {
								@Pc(1075) boolean local1075 = true;
								if (local175 == 0 && Static132.aByteArrayArrayArray12[local154][local170][local180] != 0) {
									local1075 = false;
								}
								if (local196 > 0 && !Static185.method3030(local196 - 1).aBoolean263) {
									local1075 = false;
								}
								if (local1075 && local202 == local204 && local209 == local202 && local300 == local202) {
									Static190.anIntArrayArrayArray10[local154][local170][local180] |= 0x4;
								}
							}
							if (local175 <= 0) {
								local255 = 0;
								local235 = -1;
							} else {
								local235 = local148[local170][local180];
								local268 = local28 + (local235 & 0x7F);
								if (local268 < 0) {
									local268 = 0;
								} else if (local268 > 127) {
									local268 = 127;
								}
								local274 = (local235 & 0x380) + (local21 + local235 & 0xFC00) + local268;
								local255 = Static215.anIntArray340[Static180.method2983(96, local274)];
							}
							local268 = local152[local170][local180];
							local274 = local152[local170 + 1][local180];
							local278 = local152[local170 + 1][local180 + 1];
							local284 = local152[local170][local180 + 1];
							if (local196 == 0) {
								Static125.method2195(local154, local170, local180, 0, 0, -1, local202, local204, local209, local300, Static180.method2983(local268, local235), Static180.method2983(local274, local235), Static180.method2983(local278, local235), Static180.method2983(local284, local235), 0, 0, 0, 0, local255, 0);
								if (Static156.aBoolean211 && local154 > 0 && local235 != -1 && Static75.method1479(local175 - 1).aBoolean157) {
									Static150.method2539(0, 0, true, false, local170, local180, local202 - Static24.anIntArrayArrayArray2[0][local170][local180], -Static24.anIntArrayArrayArray2[0][local170 + 1][local180] + local204, local209 - Static24.anIntArrayArrayArray2[0][local170 + 1][local180 + 1], -Static24.anIntArrayArrayArray2[0][local170][local180 + 1] + local300);
								}
								if (Static156.aBoolean211 && !arg1 && Static41.anIntArrayArray5 != null && local154 == 0) {
									for (local349 = local170 - 1; local349 <= local170 + 1; local349++) {
										for (@Pc(1357) int local1357 = local180 - 1; local1357 <= local180 + 1; local1357++) {
											if ((local170 != local349 || local180 != local1357) && local349 >= 0 && local349 < 104 && local1357 >= 0 && local1357 < 104) {
												@Pc(1404) int local1404 = Static250.aByteArrayArrayArray19[local154][local349][local1357] & 0xFF;
												if (local1404 != 0) {
													@Pc(1415) Class128 local1415 = Static185.method3030(local1404 - 1);
													if (local1415.anInt3874 != -1 && Static245.method3877(Static215.anInterface5_1.method791(local1415.anInt3874))) {
														Static41.anIntArrayArray5[local170][local180] = (local1415.anInt3868 << 24) + local1415.anInt3869;
														continue label763;
													}
												}
											}
										}
									}
								}
							} else {
								@Pc(1460) byte local1460 = Static91.aByteArrayArrayArray2[local154][local170][local180];
								local349 = Static132.aByteArrayArrayArray12[local154][local170][local180] + 1;
								@Pc(1476) Class128 local1476 = Static185.method3030(local196 - 1);
								@Pc(1503) int local1503;
								@Pc(1516) int local1516;
								@Pc(1569) int local1569;
								if (Static156.aBoolean211 && !arg1 && Static41.anIntArrayArray5 != null && local154 == 0) {
									if (local1476.anInt3874 != -1 && Static245.method3877(Static215.anInterface5_1.method791(local1476.anInt3874))) {
										Static41.anIntArrayArray5[local170][local180] = (local1476.anInt3868 << 24) + local1476.anInt3869;
									} else {
										label744: for (local1503 = local170 - 1; local1503 <= local170 + 1; local1503++) {
											for (local1516 = local180 - 1; local1516 <= local180 + 1; local1516++) {
												if ((local170 != local1503 || local1516 != local180) && local1503 >= 0 && local1503 < 104 && local1516 >= 0 && local1516 < 104) {
													local1569 = Static250.aByteArrayArrayArray19[local154][local1503][local1516] & 0xFF;
													if (local1569 != 0) {
														@Pc(1579) Class128 local1579 = Static185.method3030(local1569 - 1);
														if (local1579.anInt3874 != -1 && Static245.method3877(Static215.anInterface5_1.method791(local1579.anInt3874))) {
															Static41.anIntArrayArray5[local170][local180] = (local1579.anInt3868 << 24) + local1579.anInt3869;
															break label744;
														}
													}
												}
											}
										}
									}
								}
								local1503 = local1476.anInt3874;
								if (local1503 >= 0 && !Static215.anInterface5_1.method779(local1503)) {
									local1503 = -1;
								}
								@Pc(1700) int local1700;
								@Pc(1673) int local1673;
								if (local1503 >= 0) {
									local1569 = Static215.anIntArray340[Static310.method4733(Static215.anInterface5_1.method777(local1503), 96)];
									local1516 = -1;
								} else if (local1476.anInt3878 == -1) {
									local1516 = -2;
									local1569 = 0;
								} else {
									local1516 = local1476.anInt3878;
									local1673 = local28 + (local1516 & 0x7F);
									if (local1673 < 0) {
										local1673 = 0;
									} else if (local1673 > 127) {
										local1673 = 127;
									}
									local1700 = local1673 + (local1516 + local21 & 0xFC00) + (local1516 & 0x380);
									local1569 = Static215.anIntArray340[Static310.method4733(local1700, 96)];
								}
								if (local1476.anInt3875 >= 0) {
									local1673 = local1476.anInt3875;
									local1700 = local28 + (local1673 & 0x7F);
									if (local1700 < 0) {
										local1700 = 0;
									} else if (local1700 > 127) {
										local1700 = 127;
									}
									@Pc(1753) int local1753 = (local21 + local1673 & 0xFC00) + (local1673 & 0x380) + local1700;
									local1569 = Static215.anIntArray340[Static310.method4733(local1753, 96)];
								}
								Static125.method2195(local154, local170, local180, local349, local1460, local1503, local202, local204, local209, local300, Static180.method2983(local268, local235), Static180.method2983(local274, local235), Static180.method2983(local278, local235), Static180.method2983(local284, local235), Static310.method4733(local1516, local268), Static310.method4733(local1516, local274), Static310.method4733(local1516, local278), Static310.method4733(local1516, local284), local255, local1569);
								if (Static156.aBoolean211 && local154 > 0) {
									Static150.method2539(local349, local1460, local1516 == -2 || !local1476.aBoolean264, local235 == -1 || !Static75.method1479(local175 - 1).aBoolean157, local170, local180, local202 - Static24.anIntArrayArrayArray2[0][local170][local180], -Static24.anIntArrayArrayArray2[0][local170 - -1][local180] + local204, local209 - Static24.anIntArrayArrayArray2[0][local170 + 1][local180 + 1], -Static24.anIntArrayArrayArray2[0][local170][local180 + 1] + local300);
								}
							}
						}
					}
				}
			}
			if (Static156.aBoolean211) {
				@Pc(1900) float[][] local1900 = new float[105][105];
				@Pc(1904) float[][] local1904 = new float[105][105];
				@Pc(1908) float[][] local1908 = new float[105][105];
				@Pc(1912) int[][] local1912 = Static24.anIntArrayArrayArray2[local154];
				local202 = 1;
				while (true) {
					if (local202 > 103) {
						@Pc(2034) Class1_Sub31[] local2034;
						if (arg1) {
							local2034 = method4036(local148, Static24.anIntArrayArrayArray2[local154], Static95.anIntArrayArrayArray5[0], arg2, Static91.aByteArrayArrayArray2[local154], local1900, local152, local154, Static132.aByteArrayArrayArray12[local154], Static41.anIntArrayArray5, Static250.aByteArrayArrayArray19[local154], local1908, local1904, Static244.aByteArrayArrayArray18[local154], Static104.aByteArrayArrayArray3);
							Static210.method3342(local154, local2034);
							break;
						}
						local2034 = method4036(local148, Static24.anIntArrayArrayArray2[local154], null, arg2, Static91.aByteArrayArrayArray2[local154], local1900, local152, local154, Static132.aByteArrayArrayArray12[local154], null, Static250.aByteArrayArrayArray19[local154], local1908, local1904, Static244.aByteArrayArrayArray18[local154], Static104.aByteArrayArrayArray3);
						@Pc(2092) Class1_Sub31[] local2092 = Static270.method4209(Static104.aByteArrayArrayArray3, local1908, Static24.anIntArrayArrayArray2[local154], local1904, local1900, local152, local154, Static132.aByteArrayArrayArray12[local154], Static91.aByteArrayArrayArray2[local154], Static250.aByteArrayArrayArray19[local154], Static244.aByteArrayArrayArray18[local154]);
						@Pc(2100) Class1_Sub31[] local2100 = new Class1_Sub31[local2034.length + local2092.length];
						for (local300 = 0; local300 < local2034.length; local300++) {
							local2100[local300] = local2034[local300];
						}
						for (local300 = 0; local300 < local2092.length; local300++) {
							local2100[local300 + local2034.length] = local2092[local300];
						}
						Static210.method3342(local154, local2100);
						Static296.method4520(local1900, Static24.anIntArrayArrayArray2[local154], Static132.aByteArrayArrayArray12[local154], Static101.anInt2036, local154, Static244.aByteArrayArrayArray18[local154], local1908, Static91.aByteArrayArrayArray2[local154], Static101.aClass61Array1, local1904, Static250.aByteArrayArrayArray19[local154]);
						break;
					}
					for (local204 = 1; local204 <= 103; local204++) {
						local300 = local1912[local204][local202 + 1] - local1912[local204][local202 - 1];
						local209 = local1912[local204 + 1][local202] - local1912[local204 - 1][local202];
						@Pc(1970) float local1970 = (float) Math.sqrt((double) (local300 * local300 + local209 * local209 + 65536));
						local1908[local204][local202] = (float) local209 / local1970;
						local1900[local204][local202] = -256.0F / local1970;
						local1904[local204][local202] = (float) local300 / local1970;
					}
					local202++;
				}
			}
			Static244.aByteArrayArrayArray18[local154] = null;
			Static250.aByteArrayArrayArray19[local154] = null;
			Static132.aByteArrayArrayArray12[local154] = null;
			Static91.aByteArrayArrayArray2[local154] = null;
			Static174.aByteArrayArrayArray11[local154] = null;
		}
		Static310.method4734();
		if (arg1) {
			return;
		}
		@Pc(2208) int local2208;
		for (local154 = 0; local154 < 104; local154++) {
			for (local2208 = 0; local2208 < 104; local2208++) {
				if ((Static104.aByteArrayArrayArray3[1][local154][local2208] & 0x2) == 2) {
					Static306.method4611(local154, local2208);
				}
			}
		}
		for (local154 = 0; local154 < 4; local154++) {
			for (local2208 = 0; local2208 <= 104; local2208++) {
				for (local170 = 0; local170 <= 104; local170++) {
					if ((Static190.anIntArrayArrayArray10[local154][local170][local2208] & 0x1) != 0) {
						local180 = local2208;
						local175 = local2208;
						while (local180 > 0 && (Static190.anIntArrayArrayArray10[local154][local170][local180 - 1] & 0x1) != 0) {
							local180--;
						}
						while (local175 < 104 && (Static190.anIntArrayArrayArray10[local154][local170][local175 + 1] & 0x1) != 0) {
							local175++;
						}
						label446: for (local196 = local154; local196 > 0; local196--) {
							for (local204 = local180; local204 <= local175; local204++) {
								if ((Static190.anIntArrayArrayArray10[local196 - 1][local170][local204] & 0x1) == 0) {
									break label446;
								}
							}
						}
						label434: for (local202 = local154; local202 < 3; local202++) {
							for (local204 = local180; local204 <= local175; local204++) {
								if ((Static190.anIntArrayArrayArray10[local202 + 1][local170][local204] & 0x1) == 0) {
									break label434;
								}
							}
						}
						local204 = (local202 + 1 - local196) * (local175 + -local180 + 1);
						if (local204 >= 8) {
							local300 = Static24.anIntArrayArrayArray2[local202][local170][local180] - 240;
							local235 = Static24.anIntArrayArrayArray2[local196][local170][local180];
							Static171.method2902(1, local170 * 128, local170 * 128, local180 * 128, local175 * 128 + 128, local300, local235);
							for (local255 = local196; local255 <= local202; local255++) {
								for (local268 = local180; local268 <= local175; local268++) {
									Static190.anIntArrayArrayArray10[local255][local170][local268] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static190.anIntArrayArrayArray10[local154][local170][local2208] & 0x2) != 0) {
						for (local180 = local170; local180 > 0 && (Static190.anIntArrayArrayArray10[local154][local180 - 1][local2208] & 0x2) != 0; local180--) {
						}
						local175 = local170;
						local202 = local154;
						while (local175 < 104 && (Static190.anIntArrayArrayArray10[local154][local175 + 1][local2208] & 0x2) != 0) {
							local175++;
						}
						label500: for (local196 = local154; local196 > 0; local196--) {
							for (local204 = local180; local204 <= local175; local204++) {
								if ((Static190.anIntArrayArrayArray10[local196 - 1][local204][local2208] & 0x2) == 0) {
									break label500;
								}
							}
						}
						label489: while (local202 < 3) {
							for (local204 = local180; local204 <= local175; local204++) {
								if ((Static190.anIntArrayArrayArray10[local202 + 1][local204][local2208] & 0x2) == 0) {
									break label489;
								}
							}
							local202++;
						}
						local204 = (local175 + 1 - local180) * (local202 + 1 + -local196);
						if (local204 >= 8) {
							local235 = Static24.anIntArrayArrayArray2[local196][local180][local2208];
							local300 = Static24.anIntArrayArrayArray2[local202][local180][local2208] - 240;
							Static171.method2902(2, local180 * 128, local175 * 128 + 128, local2208 * 128, local2208 * 128, local300, local235);
							for (local255 = local196; local255 <= local202; local255++) {
								for (local268 = local180; local268 <= local175; local268++) {
									Static190.anIntArrayArrayArray10[local255][local268][local2208] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static190.anIntArrayArrayArray10[local154][local170][local2208] & 0x4) != 0) {
						local180 = local170;
						local175 = local170;
						local196 = local2208;
						local202 = local2208;
						while (local196 > 0 && (Static190.anIntArrayArrayArray10[local154][local170][local196 - 1] & 0x4) != 0) {
							local196--;
						}
						while (local202 < 104 && (Static190.anIntArrayArrayArray10[local154][local170][local202 + 1] & 0x4) != 0) {
							local202++;
						}
						label555: while (local180 > 0) {
							for (local204 = local196; local204 <= local202; local204++) {
								if ((Static190.anIntArrayArrayArray10[local154][local180 - 1][local204] & 0x4) == 0) {
									break label555;
								}
							}
							local180--;
						}
						label544: while (local175 < 104) {
							for (local204 = local196; local204 <= local202; local204++) {
								if ((Static190.anIntArrayArrayArray10[local154][local175 + 1][local204] & 0x4) == 0) {
									break label544;
								}
							}
							local175++;
						}
						if ((local202 + 1 - local196) * (-local180 + (local175 - -1)) >= 4) {
							local204 = Static24.anIntArrayArrayArray2[local154][local180][local196];
							Static171.method2902(4, local180 * 128, local175 * 128 + 128, local196 * 128, local202 * 128 + 128, local204, local204);
							for (local209 = local180; local209 <= local175; local209++) {
								for (local300 = local196; local300 <= local202; local300++) {
									Static190.anIntArrayArrayArray10[local154][local209][local300] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4039(@OriginalArg(1) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(20) String local20 = arg1[arg0];
			return local20 == null ? "null" : local20.toString();
		} else {
			@Pc(33) int local33 = arg2 + arg0;
			@Pc(35) int local35 = 0;
			for (@Pc(45) int local45 = arg0; local45 < local33; local45++) {
				@Pc(52) String local52 = arg1[local45];
				if (local52 == null) {
					local35 += 4;
				} else {
					local35 += local52.length();
				}
			}
			@Pc(70) StringBuffer local70 = new StringBuffer(local35);
			for (@Pc(72) int local72 = arg0; local72 < local33; local72++) {
				@Pc(83) String local83 = arg1[local72];
				if (local83 == null) {
					local70.append("null");
				} else {
					local70.append(local83);
				}
			}
			return local70.toString();
		}
	}
}
