import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bg", name = "Kb", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_6;

	@OriginalMember(owner = "client!bg", name = "Cb", descriptor = "Lclient!nd;")
	public static Class59 aClass59_3 = new Class59(64);

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(ZI)V")
	public static void method365(@OriginalArg(0) boolean arg0) {
		if (Static37.anInt977 == Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040 >> 7 && Static135.anInt2049 == Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026 >> 7) {
			Static37.anInt977 = 0;
		}
		@Pc(34) int local34 = Static25.anInt645;
		if (arg0) {
			local34 = 1;
		}
		for (@Pc(40) int local40 = 0; local40 < local34; local40++) {
			@Pc(50) Class1_Sub2_Sub1_Sub3_Sub1 local50;
			@Pc(57) long local57;
			if (arg0) {
				local57 = 8791798054912L;
				local50 = Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1;
			} else {
				local50 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[Static176.anIntArray423[local40]];
				local57 = (long) Static176.anIntArray423[local40] << 32;
			}
			if (local50 != null && local50.method2363()) {
				local50.aBoolean60 = false;
				if ((Static50.aBoolean45 && Static25.anInt645 > 50 || Static25.anInt645 > 200) && !arg0 && local50.anInt3054 == local50.anInt3009) {
					local50.aBoolean60 = true;
				}
				@Pc(101) int local101 = local50.anInt3040 >> 7;
				@Pc(106) int local106 = local50.anInt3026 >> 7;
				if (local101 >= 0 && local101 < 104 && local106 >= 0 && local106 < 104) {
					if (local50.aClass1_Sub2_Sub1_Sub4_1 == null || local50.anInt1523 > Static142.anInt3104 || Static142.anInt3104 >= local50.anInt1534) {
						if ((local50.anInt3040 & 0x7F) == 64 && (local50.anInt3026 & 0x7F) == 64) {
							if (Static9.anIntArrayArray2[local101][local106] == Static92.anInt2056) {
								continue;
							}
							Static9.anIntArrayArray2[local101][local106] = Static92.anInt2056;
						}
						local50.anInt3012 = Static102.method1694(local50.anInt3040, Static44.anInt1086, local50.anInt3026);
						Static110.method1957(Static44.anInt1086, local50.anInt3040, local50.anInt3026, local50.anInt3012, 60, local50, local50.anInt3048, local57, local50.aBoolean121);
					} else {
						local50.aBoolean60 = false;
						local50.anInt3012 = Static102.method1694(local50.anInt3040, Static44.anInt1086, local50.anInt3026);
						Static66.method1198(Static44.anInt1086, local50.anInt3040, local50.anInt3026, local50.anInt3012, local50, local50.anInt3048, local57, local50.anInt1536, local50.anInt1524, local50.anInt1535, local50.anInt1520);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "(I)V")
	public static void method369() {
		aClass59_3 = null;
		aClass82_Sub1_6 = null;
		Class1_Sub8_Sub1.anIntArray16 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!rh;IZII)V")
	public static void method370(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static89.anInt4029 >= 3) {
			Static4.method2578(arg3, arg1, arg0.anIntArray344, arg0.anIntArray339);
		} else {
			Static148.aClass1_Sub2_Sub2_Sub3_10.method2140(arg3, arg1, arg0.anInt3217, arg0.anInt3245, Static148.aClass1_Sub2_Sub2_Sub3_10.anInt2737 / 2, Static148.aClass1_Sub2_Sub2_Sub3_10.anInt2736 / 2, Static35.anInt964, arg0.anIntArray344, arg0.anIntArray339);
		}
		Static119.aBooleanArray14[arg2] = true;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 < 1 || arg1 < 1 || arg0 > 102 || arg1 > 102) {
			return;
		}
		if (Static50.aBoolean45 && arg6 != Static44.anInt1086) {
			return;
		}
		@Pc(40) long local40 = 0L;
		if (arg5 == 0) {
			local40 = Static21.method421(arg6, arg0, arg1);
		}
		if (arg5 == 1) {
			local40 = Static170.method3007(arg6, arg0, arg1);
		}
		if (arg5 == 2) {
			local40 = Static104.method1707(arg6, arg0, arg1);
		}
		if (arg5 == 3) {
			local40 = Static48.method2781(arg6, arg0, arg1);
		}
		if (local40 != 0L) {
			@Pc(94) int local94 = (int) local40 >> 20 & 0x3;
			@Pc(101) int local101 = Integer.MAX_VALUE & (int) (local40 >>> 32);
			@Pc(108) int local108 = (int) local40 >> 14 & 0x1F;
			@Pc(121) Class1_Sub2_Sub8 local121;
			if (arg5 == 0) {
				Static25.method549(arg6, arg0, arg1);
				local121 = Static14.method220(local101);
				if (local121.anInt1261 != 0) {
					Static141.aClass28Array2[arg6].method1049(local108, local94, arg0, local121.aBoolean46, arg1);
				}
			}
			if (arg5 == 1) {
				Static12.method3142(arg6, arg0, arg1);
			}
			if (arg5 == 2) {
				Static52.method943(arg6, arg0, arg1);
				local121 = Static14.method220(local101);
				if (arg0 + local121.anInt1237 > 103 || arg1 + local121.anInt1237 > 103 || arg0 + local121.anInt1277 > 103 || local121.anInt1277 + arg1 > 103) {
					return;
				}
				if (local121.anInt1261 != 0) {
					Static141.aClass28Array2[arg6].method1041(arg1, local121.anInt1237, arg0, local121.aBoolean46, local94, local121.anInt1277);
				}
			}
			if (arg5 == 3) {
				Static172.method3033(arg6, arg0, arg1);
				local121 = Static14.method220(local101);
				if (local121.anInt1261 == 1) {
					Static141.aClass28Array2[arg6].method1042(arg0, arg1);
				}
			}
		}
		if (arg4 < 0) {
			return;
		}
		@Pc(237) int local237 = arg6;
		if (arg6 < 3 && (Static43.aByteArrayArrayArray2[1][arg0][arg1] & 0x2) == 2) {
			local237 = arg6 + 1;
		}
		Static122.method2147(arg3, arg0, arg6, arg4, Static141.aClass28Array2[arg6], arg2, local237, arg1);
		return;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(IZ)V")
	public static void method374(@OriginalArg(1) boolean arg0) {
		Static37.aBoolean32 = arg0;
		@Pc(17) int local17;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(153) int local153;
		@Pc(157) int local157;
		@Pc(161) int local161;
		if (!Static37.aBoolean32) {
			local17 = Static21.aClass1_Sub8_Sub1_1.method359();
			local22 = Static21.aClass1_Sub8_Sub1_1.method359();
			local26 = (Static98.anInt2162 - Static21.aClass1_Sub8_Sub1_1.anInt446) / 16;
			Static174.anIntArrayArray39 = new int[local26][4];
			for (local30 = 0; local30 < local26; local30++) {
				for (local37 = 0; local37 < 4; local37++) {
					Static174.anIntArrayArray39[local30][local37] = Static21.aClass1_Sub8_Sub1_1.method323();
				}
			}
			local37 = Static21.aClass1_Sub8_Sub1_1.method362();
			@Pc(384) boolean local384 = false;
			local126 = Static21.aClass1_Sub8_Sub1_1.method320();
			local130 = Static21.aClass1_Sub8_Sub1_1.method359();
			Static57.aByteArrayArray3 = new byte[local26][];
			if ((local126 / 8 == 48 || local126 / 8 == 49) && local22 / 8 == 48) {
				local384 = true;
			}
			if (local126 / 8 == 48 && local22 / 8 == 148) {
				local384 = true;
			}
			Static62.anIntArray127 = new int[local26];
			Static36.aByteArrayArray1 = new byte[local26][];
			Static102.anIntArray243 = new int[local26];
			Static92.anIntArray232 = new int[local26];
			local26 = 0;
			for (local153 = (local126 - 6) / 8; local153 <= (local126 + 6) / 8; local153++) {
				for (local157 = (local22 - 6) / 8; local157 <= (local22 + 6) / 8; local157++) {
					local161 = local157 + (local153 << 8);
					if (!local384 || local157 != 49 && local157 != 149 && local157 != 147 && local153 != 50 && (local153 != 49 || local157 != 47)) {
						Static92.anIntArray232[local26] = local161;
						Static62.anIntArray127[local26] = aClass82_Sub1_6.method2955(Static127.method2169(new Class81[] { Static50.aClass81_429, Static149.method2548(local153), Static49.aClass81_418, Static149.method2548(local157) }));
						Static102.anIntArray243[local26] = aClass82_Sub1_6.method2955(Static127.method2169(new Class81[] { Static93.aClass81_728, Static149.method2548(local153), Static49.aClass81_418, Static149.method2548(local157) }));
						local26++;
					}
				}
			}
			Static31.method677(local37, local126, local22, local130, local17);
			return;
		}
		local17 = Static21.aClass1_Sub8_Sub1_1.method320();
		Static21.aClass1_Sub8_Sub1_1.method371();
		for (local22 = 0; local22 < 4; local22++) {
			for (local26 = 0; local26 < 13; local26++) {
				for (local30 = 0; local30 < 13; local30++) {
					local37 = Static21.aClass1_Sub8_Sub1_1.method375(1);
					if (local37 == 1) {
						Static106.anIntArrayArrayArray3[local22][local26][local30] = Static21.aClass1_Sub8_Sub1_1.method375(26);
					} else {
						Static106.anIntArrayArrayArray3[local22][local26][local30] = -1;
					}
				}
			}
		}
		Static21.aClass1_Sub8_Sub1_1.method367();
		local26 = (Static98.anInt2162 - Static21.aClass1_Sub8_Sub1_1.anInt446) / 16;
		Static174.anIntArrayArray39 = new int[local26][4];
		for (local30 = 0; local30 < local26; local30++) {
			for (local37 = 0; local37 < 4; local37++) {
				Static174.anIntArrayArray39[local30][local37] = Static21.aClass1_Sub8_Sub1_1.method314();
			}
		}
		local37 = Static21.aClass1_Sub8_Sub1_1.method320();
		local126 = Static21.aClass1_Sub8_Sub1_1.method338();
		local130 = Static21.aClass1_Sub8_Sub1_1.method336();
		@Pc(134) int local134 = Static21.aClass1_Sub8_Sub1_1.method338();
		Static36.aByteArrayArray1 = new byte[local26][];
		Static62.anIntArray127 = new int[local26];
		Static102.anIntArray243 = new int[local26];
		Static92.anIntArray232 = new int[local26];
		Static57.aByteArrayArray3 = new byte[local26][];
		local26 = 0;
		for (local153 = 0; local153 < 4; local153++) {
			for (local157 = 0; local157 < 13; local157++) {
				for (local161 = 0; local161 < 13; local161++) {
					@Pc(171) int local171 = Static106.anIntArrayArrayArray3[local153][local157][local161];
					if (local171 != -1) {
						@Pc(180) int local180 = local171 >> 14 & 0x3FF;
						@Pc(186) int local186 = local171 >> 3 & 0x7FF;
						@Pc(196) int local196 = (local180 / 8 << 8) + local186 / 8;
						for (@Pc(198) int local198 = 0; local198 < local26; local198++) {
							if (Static92.anIntArray232[local198] == local196) {
								local196 = -1;
								break;
							}
						}
						if (local196 != -1) {
							Static92.anIntArray232[local26] = local196;
							@Pc(233) int local233 = local196 & 0xFF;
							@Pc(239) int local239 = local196 >> 8 & 0xFF;
							Static62.anIntArray127[local26] = aClass82_Sub1_6.method2955(Static127.method2169(new Class81[] { Static50.aClass81_429, Static149.method2548(local239), Static49.aClass81_418, Static149.method2548(local233) }));
							Static102.anIntArray243[local26] = aClass82_Sub1_6.method2955(Static127.method2169(new Class81[] { Static93.aClass81_728, Static149.method2548(local239), Static49.aClass81_418, Static149.method2548(local233) }));
							local26++;
						}
					}
				}
			}
		}
		Static31.method677(local130, local134, local17, local37, local126);
	}
}
