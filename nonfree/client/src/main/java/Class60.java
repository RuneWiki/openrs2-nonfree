import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class60 {

	@OriginalMember(owner = "client!og", name = "r", descriptor = "I")
	private int anInt2894 = 0;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "[Lclient!pf;")
	private final Class63[] aClass63Array2 = new Class63[5000];

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	private int anInt2883 = 0;

	@OriginalMember(owner = "client!og", name = "N", descriptor = "[[I")
	private final int[][] anIntArrayArray22 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!og", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray23 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!og", name = "p", descriptor = "I")
	private final int anInt2892;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	private final int anInt2897;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "I")
	private final int anInt2890;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "[[[Lclient!fd;")
	private final Class2_Sub7[][][] aClass2_Sub7ArrayArrayArray1;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III[[[I)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2892 = arg0;
		this.anInt2897 = arg1;
		this.anInt2890 = arg2;
		this.aClass2_Sub7ArrayArrayArray1 = new Class2_Sub7[arg0][arg1][arg2];
		this.anIntArrayArrayArray4 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray5 = arg3;
		this.method2088();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)V")
	public void method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2].anInt1210 = arg3;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIILclient!ac;IZII)Z")
	private boolean method2048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub2_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2897 || local4 >= this.anInt2890) {
					return false;
				}
				@Pc(28) Class2_Sub7 local28 = this.aClass2_Sub7ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1209 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class63 local52 = new Class63();
		local52.anInt3037 = arg11;
		local52.anInt3040 = arg12;
		local52.anInt3034 = arg0;
		local52.anInt3032 = arg5;
		local52.anInt3026 = arg6;
		local52.anInt3038 = arg7;
		local52.aClass2_Sub2_Sub1_8 = arg8;
		local52.anInt3025 = arg9;
		local52.anInt3031 = arg1;
		local52.anInt3030 = arg2;
		local52.anInt3044 = arg1 + arg3 - 1;
		local52.anInt3029 = arg2 + arg4 - 1;
		for (@Pc(98) int local98 = arg1; local98 < arg1 + arg3; local98++) {
			for (@Pc(101) int local101 = arg2; local101 < arg2 + arg4; local101++) {
				@Pc(104) int local104 = 0;
				if (local98 > arg1) {
					local104++;
				}
				if (local98 < arg1 + arg3 - 1) {
					local104 += 4;
				}
				if (local101 > arg2) {
					local104 += 8;
				}
				if (local101 < arg2 + arg4 - 1) {
					local104 += 2;
				}
				for (@Pc(130) int local130 = arg0; local130 >= 0; local130--) {
					if (this.aClass2_Sub7ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub7ArrayArrayArray1[local130][local98][local101] = new Class2_Sub7(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub7 local166 = this.aClass2_Sub7ArrayArrayArray1[arg0][local98][local101];
				local166.aClass63Array1[local166.anInt1209] = local52;
				local166.anIntArray191[local166.anInt1209] = local104;
				local166.anInt1218 |= local104;
				local166.anInt1209++;
			}
		}
		if (arg10) {
			this.aClass63Array2[this.anInt2883++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Lclient!ra;")
	public Class69 method2049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass69_1 == null ? null : local8.aClass69_1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!fe;III)V")
	private void method2050(@OriginalArg(0) Class2_Sub2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub7 local14;
		@Pc(29) Class2_Sub2_Sub1_Sub3 local29;
		if (arg2 < this.anInt2897) {
			local14 = this.aClass2_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass69_1 != null && local14.aClass69_1.aClass2_Sub2_Sub1_9 instanceof Class2_Sub2_Sub1_Sub3) {
				local29 = (Class2_Sub2_Sub1_Sub3) local14.aClass69_1.aClass2_Sub2_Sub1_9;
				Static47.method862(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2897) {
			local14 = this.aClass2_Sub7ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass69_1 != null && local14.aClass69_1.aClass2_Sub2_Sub1_9 instanceof Class2_Sub2_Sub1_Sub3) {
				local29 = (Class2_Sub2_Sub1_Sub3) local14.aClass69_1.aClass2_Sub2_Sub1_9;
				Static47.method862(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2897 && arg3 < this.anInt2890) {
			local14 = this.aClass2_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass69_1 != null && local14.aClass69_1.aClass2_Sub2_Sub1_9 instanceof Class2_Sub2_Sub1_Sub3) {
				local29 = (Class2_Sub2_Sub1_Sub3) local14.aClass69_1.aClass2_Sub2_Sub1_9;
				Static47.method862(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2897 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass69_1 != null && local14.aClass69_1.aClass2_Sub2_Sub1_9 instanceof Class2_Sub2_Sub1_Sub3) {
			local29 = (Class2_Sub2_Sub1_Sub3) local14.aClass69_1.aClass2_Sub2_Sub1_9;
			Static47.method862(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IIII)Z")
	private boolean method2051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method2084(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray5[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static116.anInt2895) {
					if (!this.method2086(local11, local26, local15)) {
						return false;
					}
					if (!this.method2086(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2086(local11, local30, local15)) {
						return false;
					}
					if (!this.method2086(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2086(local11, local34, local15)) {
					return false;
				}
				if (!this.method2086(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static116.anInt2903) {
					if (!this.method2086(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method2086(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2086(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method2086(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2086(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method2086(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static116.anInt2895) {
					if (!this.method2086(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method2086(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2086(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method2086(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2086(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method2086(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static116.anInt2903) {
					if (!this.method2086(local11, local26, local15)) {
						return false;
					}
					if (!this.method2086(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2086(local11, local30, local15)) {
						return false;
					}
					if (!this.method2086(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method2086(local11, local34, local15)) {
					return false;
				}
				if (!this.method2086(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method2086(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method2086(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method2086(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method2086(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method2086(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!pc;IIIIIII)V")
	private void method2052(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static116.anInt2895;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static116.anInt2903;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray5[arg1][arg6][arg7] - Static116.anInt2893;
		@Pc(51) int local51 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static116.anInt2893;
		@Pc(66) int local66 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static116.anInt2893;
		@Pc(79) int local79 = this.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static116.anInt2893;
		@Pc(89) int local89 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(99) int local99 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(101) int local101 = local89;
		@Pc(111) int local111 = local38 * arg3 - local99 * arg2 >> 16;
		@Pc(121) int local121 = local38 * arg2 + local99 * arg3 >> 16;
		@Pc(123) int local123 = local111;
		if (local121 < 50) {
			return;
		}
		local89 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(147) int local147 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local89;
		local89 = local51 * arg3 - local147 * arg2 >> 16;
		@Pc(169) int local169 = local51 * arg2 + local147 * arg3 >> 16;
		local51 = local89;
		if (local169 < 50) {
			return;
		}
		local89 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(197) int local197 = local89;
		local89 = local66 * arg3 - local27 * arg2 >> 16;
		local27 = local66 * arg2 + local27 * arg3 >> 16;
		local66 = local89;
		if (local27 < 50) {
			return;
		}
		local89 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(243) int local243 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(245) int local245 = local89;
		local89 = local79 * arg3 - local243 * arg2 >> 16;
		@Pc(265) int local265 = local79 * arg2 + local243 * arg3 >> 16;
		if (local265 < 50) {
			return;
		}
		@Pc(279) int local279 = Static12.anInt360 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static12.anInt363 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static12.anInt360 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static12.anInt363 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static12.anInt360 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static12.anInt363 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static12.anInt360 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static12.anInt363 + (local89 << 9) / local265;
		Static12.anInt359 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			if (Static116.aBoolean115 && this.method2069(Static116.anInt2884, Static116.anInt2909, local319, local335, local303, local311, local327, local295)) {
				Static116.anInt2881 = arg6;
				Static116.anInt2886 = arg7;
			}
			Static12.aBoolean15 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static12.anInt362 || local327 > Static12.anInt362 || local295 > Static12.anInt362) {
				Static12.aBoolean15 = true;
			}
			if (arg0.anInt2971 == -1) {
				if (arg0.anInt2976 != 12345678) {
					Static12.method252(local319, local335, local303, local311, local327, local295, arg0.anInt2976, arg0.anInt2980, arg0.anInt2973);
				}
			} else if (Static116.aBoolean116) {
				local472 = Static12.anInterface2_1.method1655(arg0.anInt2971);
				Static12.method252(local319, local335, local303, local311, local327, local295, Static116.method2093(local472, arg0.anInt2976), Static116.method2093(local472, arg0.anInt2980), Static116.method2093(local472, arg0.anInt2973));
			} else if (arg0.aBoolean119) {
				Static12.method253(local319, local335, local303, local311, local327, local295, arg0.anInt2976, arg0.anInt2980, arg0.anInt2973, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2971);
			} else {
				Static12.method253(local319, local335, local303, local311, local327, local295, arg0.anInt2976, arg0.anInt2980, arg0.anInt2973, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt2971);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		if (Static116.aBoolean115 && this.method2069(Static116.anInt2884, Static116.anInt2909, local287, local303, local335, local279, local295, local327)) {
			Static116.anInt2881 = arg6;
			Static116.anInt2886 = arg7;
		}
		Static12.aBoolean15 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static12.anInt362 || local295 > Static12.anInt362 || local327 > Static12.anInt362) {
			Static12.aBoolean15 = true;
		}
		if (arg0.anInt2971 != -1) {
			if (!Static116.aBoolean116) {
				Static12.method253(local287, local303, local335, local279, local295, local327, arg0.anInt2975, arg0.anInt2973, arg0.anInt2980, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2971);
				return;
			}
			local472 = Static12.anInterface2_1.method1655(arg0.anInt2971);
			Static12.method252(local287, local303, local335, local279, local295, local327, Static116.method2093(local472, arg0.anInt2975), Static116.method2093(local472, arg0.anInt2973), Static116.method2093(local472, arg0.anInt2980));
		} else if (arg0.anInt2975 != 12345678) {
			Static12.method252(local287, local303, local335, local279, local295, local327, arg0.anInt2975, arg0.anInt2973, arg0.anInt2980);
			return;
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(IIII)V")
	public void method2053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class59 local14 = local8.aClass59_1;
		if (local14 != null) {
			local14.anInt2800 = local14.anInt2800 * arg3 / 16;
			local14.anInt2795 = local14.anInt2795 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public void method2054(@OriginalArg(0) int arg0) {
		this.anInt2894 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2897; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2890; local7++) {
				if (this.aClass2_Sub7ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub7ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub7(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([IIIIII)V")
	public void method2055(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class62 local14 = local8.aClass62_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt2974;
			if (local19 != 0) {
				for (local24 = 0; local24 < 4; local24++) {
					arg0[arg1] = local19;
					arg0[arg1 + 1] = local19;
					arg0[arg1 + 2] = local19;
					arg0[arg1 + 3] = local19;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(59) Class68 local59 = local8.aClass68_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt3289;
		@Pc(68) int local68 = local59.anInt3286;
		@Pc(71) int local71 = local59.anInt3287;
		@Pc(74) int local74 = local59.anInt3288;
		@Pc(79) int[] local79 = this.anIntArrayArray23[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray22[local68];
		@Pc(86) int local86 = 0;
		@Pc(90) int local90;
		if (local71 != 0) {
			for (local90 = 0; local90 < 4; local90++) {
				arg0[arg1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 2] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 3] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg1 += 512;
			}
			return;
		}
		for (local90 = 0; local90 < 4; local90++) {
			if (local79[local84[local86++]] != 0) {
				arg0[arg1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 2] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 3] = local74;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(IIII)Z")
	private boolean method2056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method2084(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method2086(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2] + arg3, local15 + 1) && this.method2086(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] + arg3, local15 + 1) && this.method2086(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] + arg3, local15 + 128 - 1) && this.method2086(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] + arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILclient!ac;ILclient!ac;Lclient!ac;)V")
	public void method2057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub1 arg6, @OriginalArg(7) Class2_Sub2_Sub1 arg7) {
		@Pc(3) Class54 local3 = new Class54();
		local3.aClass2_Sub2_Sub1_5 = arg4;
		local3.anInt2495 = arg1 * 128 + 64;
		local3.anInt2493 = arg2 * 128 + 64;
		local3.anInt2492 = arg3;
		local3.anInt2497 = arg5;
		local3.aClass2_Sub2_Sub1_4 = arg6;
		local3.aClass2_Sub2_Sub1_3 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(43) Class2_Sub7 local43 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1209; local47++) {
				if ((local43.aClass63Array1[local47].anInt3040 & 0x100) == 256 && local43.aClass63Array1[local47].aClass2_Sub2_Sub1_8 instanceof Class2_Sub2_Sub1_Sub2) {
					@Pc(71) Class2_Sub2_Sub1_Sub2 local71 = (Class2_Sub2_Sub1_Sub2) local43.aClass63Array1[local47].aClass2_Sub2_Sub1_8;
					local71.method592();
					if (local71.aShort32 < local34) {
						local34 = local71.aShort32;
					}
				}
			}
		}
		local3.anInt2494 = -local34;
		if (this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub7(arg0, arg1, arg2);
		}
		this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass54_1 = local3;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
	private void method2058() {
		@Pc(3) int local3 = Static116.anIntArray436[Static116.anInt2907];
		@Pc(7) Class41[] local7 = Static116.aClass41ArrayArray1[Static116.anInt2907];
		Static116.anInt2891 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class41 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt2088 == 1) {
				local27 = local16.anInt2073 + Static116.anInt2901 - Static116.anInt2900;
				if (local27 >= 0 && local27 <= Static116.anInt2901 + Static116.anInt2901) {
					local42 = local16.anInt2074 + Static116.anInt2901 - Static116.anInt2889;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2067 + Static116.anInt2901 - Static116.anInt2889;
					if (local53 > Static116.anInt2901 + Static116.anInt2901) {
						local53 = Static116.anInt2901 + Static116.anInt2901;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static116.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static116.anInt2895 - local16.anInt2069;
						if (local85 > 32) {
							local16.anInt2077 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2077 = 2;
							local85 = -local85;
						}
						local16.anInt2085 = (local16.anInt2072 - Static116.anInt2903 << 8) / local85;
						local16.anInt2065 = (local16.anInt2070 - Static116.anInt2903 << 8) / local85;
						local16.anInt2079 = (local16.anInt2076 - Static116.anInt2893 << 8) / local85;
						local16.anInt2089 = (local16.anInt2068 - Static116.anInt2893 << 8) / local85;
						Static116.aClass41Array1[Static116.anInt2891++] = local16;
					}
				}
			} else if (local16.anInt2088 == 2) {
				local27 = local16.anInt2074 + Static116.anInt2901 - Static116.anInt2889;
				if (local27 >= 0 && local27 <= Static116.anInt2901 + Static116.anInt2901) {
					local42 = local16.anInt2073 + Static116.anInt2901 - Static116.anInt2900;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2071 + Static116.anInt2901 - Static116.anInt2900;
					if (local53 > Static116.anInt2901 + Static116.anInt2901) {
						local53 = Static116.anInt2901 + Static116.anInt2901;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static116.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static116.anInt2903 - local16.anInt2072;
						if (local85 > 32) {
							local16.anInt2077 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt2077 = 4;
							local85 = -local85;
						}
						local16.anInt2082 = (local16.anInt2069 - Static116.anInt2895 << 8) / local85;
						local16.anInt2078 = (local16.anInt2083 - Static116.anInt2895 << 8) / local85;
						local16.anInt2079 = (local16.anInt2076 - Static116.anInt2893 << 8) / local85;
						local16.anInt2089 = (local16.anInt2068 - Static116.anInt2893 << 8) / local85;
						Static116.aClass41Array1[Static116.anInt2891++] = local16;
					}
				}
			} else if (local16.anInt2088 == 4) {
				local27 = local16.anInt2076 - Static116.anInt2893;
				if (local27 > 128) {
					local42 = local16.anInt2074 + Static116.anInt2901 - Static116.anInt2889;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt2067 + Static116.anInt2901 - Static116.anInt2889;
					if (local53 > Static116.anInt2901 + Static116.anInt2901) {
						local53 = Static116.anInt2901 + Static116.anInt2901;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt2073 + Static116.anInt2901 - Static116.anInt2900;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt2071 + Static116.anInt2901 - Static116.anInt2900;
						if (local85 > Static116.anInt2901 + Static116.anInt2901) {
							local85 = Static116.anInt2901 + Static116.anInt2901;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static116.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt2077 = 5;
							local16.anInt2082 = (local16.anInt2069 - Static116.anInt2895 << 8) / local27;
							local16.anInt2078 = (local16.anInt2083 - Static116.anInt2895 << 8) / local27;
							local16.anInt2085 = (local16.anInt2072 - Static116.anInt2903 << 8) / local27;
							local16.anInt2065 = (local16.anInt2070 - Static116.anInt2903 << 8) / local27;
							Static116.aClass41Array1[Static116.anInt2891++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(IIII)I")
	public int method2059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass4_1 != null && local8.aClass4_1.anInt164 == arg3) {
			return local8.aClass4_1.anInt160 & 0xFF;
		} else if (local8.aClass59_1 != null && local8.aClass59_1.anInt2799 == arg3) {
			return local8.aClass59_1.anInt2805 & 0xFF;
		} else if (local8.aClass69_1 != null && local8.aClass69_1.anInt3292 == arg3) {
			return local8.aClass69_1.anInt3294 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1209; local56++) {
				if (local8.aClass63Array1[local56].anInt3037 == arg3) {
					return local8.aClass63Array1[local56].anInt3040 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(III)V")
	public void method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static116.aBoolean115 = true;
		Static116.anInt2906 = arg0;
		Static116.anInt2884 = arg1;
		Static116.anInt2909 = arg2;
		Static116.anInt2881 = -1;
		Static116.anInt2886 = -1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!fd;Z)V")
	private void method2062(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		Static116.aClass10_81.method448(arg0);
		while (true) {
			@Pc(8) Class2_Sub7 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub7[][] local31;
			@Pc(49) Class2_Sub7 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class4 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class63 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class2_Sub7 var33;
										while (true) {
											do {
												local8 = (Class2_Sub7) Static116.aClass10_81.method449();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean61);
											local17 = local8.anInt1211;
											local20 = local8.anInt1215;
											local23 = local8.anInt1216;
											local26 = local8.anInt1208;
											local31 = this.aClass2_Sub7ArrayArrayArray1[local23];
											if (!local8.aBoolean60) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub7ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean61) {
														continue;
													}
												}
												if (local17 <= Static116.anInt2900 && local17 > Static116.anInt2905) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean61 && (local49.aBoolean60 || (local8.anInt1218 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static116.anInt2900 && local17 < Static116.anInt2899 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean61 && (local49.aBoolean60 || (local8.anInt1218 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static116.anInt2889 && local20 > Static116.anInt2882) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean61 && (local49.aBoolean60 || (local8.anInt1218 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static116.anInt2889 && local20 < Static116.anInt2888 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean61 && (local49.aBoolean60 || (local8.anInt1218 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean60 = false;
											if (local8.aClass2_Sub7_1 != null) {
												local49 = local8.aClass2_Sub7_1;
												if (local49.aClass62_1 == null) {
													if (local49.aClass68_1 != null && !this.method2084(0, local17, local20)) {
														this.method2076(local49.aClass68_1, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local17, local20);
													}
												} else if (!this.method2084(0, local17, local20)) {
													this.method2052(local49.aClass62_1, 0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local17, local20);
												}
												@Pc(225) Class4 local225 = local49.aClass4_1;
												if (local225 != null) {
													local225.aClass2_Sub2_Sub1_2.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local225.anInt162 - Static116.anInt2895, local225.anInt158 - Static116.anInt2893, local225.anInt165 - Static116.anInt2903, local225.anInt164);
												}
												for (local251 = 0; local251 < local49.anInt1209; local251++) {
													var12 = local49.aClass63Array1[local251];
													if (var12 != null) {
														var12.aClass2_Sub2_Sub1_8.method2907(var12.anInt3025, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, var12.anInt3032 - Static116.anInt2895, var12.anInt3038 - Static116.anInt2893, var12.anInt3026 - Static116.anInt2903, var12.anInt3037);
													}
												}
											}
											var22 = false;
											if (local8.aClass62_1 == null) {
												if (local8.aClass68_1 != null && !this.method2084(local26, local17, local20)) {
													var22 = true;
													this.method2076(local8.aClass68_1, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local17, local20);
												}
											} else if (!this.method2084(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass62_1.anInt2976 != 12345678 || Static116.aBoolean115 && local23 <= Static116.anInt2906) {
													this.method2052(local8.aClass62_1, local26, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class4 local350 = local8.aClass4_1;
											@Pc(353) Class59 local353 = local8.aClass59_1;
											if (local350 != null || local353 != null) {
												if (Static116.anInt2900 == local17) {
													var21++;
												} else if (Static116.anInt2900 < local17) {
													var21 += 2;
												}
												if (Static116.anInt2889 == local20) {
													var21 += 3;
												} else if (Static116.anInt2889 > local20) {
													var21 += 6;
												}
												local251 = Static116.anIntArray440[var21];
												local8.anInt1213 = Static116.anIntArray438[var21];
											}
											if (local350 != null) {
												if ((local350.anInt159 & Static116.anIntArray437[var21]) == 0) {
													local8.anInt1217 = 0;
												} else if (local350.anInt159 == 16) {
													local8.anInt1217 = 3;
													local8.anInt1214 = Static116.anIntArray442[var21];
													local8.anInt1212 = 3 - local8.anInt1214;
												} else if (local350.anInt159 == 32) {
													local8.anInt1217 = 6;
													local8.anInt1214 = Static116.anIntArray439[var21];
													local8.anInt1212 = 6 - local8.anInt1214;
												} else if (local350.anInt159 == 64) {
													local8.anInt1217 = 12;
													local8.anInt1214 = Static116.anIntArray441[var21];
													local8.anInt1212 = 12 - local8.anInt1214;
												} else {
													local8.anInt1217 = 9;
													local8.anInt1214 = Static116.anIntArray443[var21];
													local8.anInt1212 = 9 - local8.anInt1214;
												}
												if ((local350.anInt159 & local251) != 0 && !this.method2051(local26, local17, local20, local350.anInt159)) {
													local350.aClass2_Sub2_Sub1_2.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local350.anInt162 - Static116.anInt2895, local350.anInt158 - Static116.anInt2893, local350.anInt165 - Static116.anInt2903, local350.anInt164);
												}
												if ((local350.anInt157 & local251) != 0 && !this.method2051(local26, local17, local20, local350.anInt157)) {
													local350.aClass2_Sub2_Sub1_1.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local350.anInt162 - Static116.anInt2895, local350.anInt158 - Static116.anInt2893, local350.anInt165 - Static116.anInt2903, local350.anInt164);
												}
											}
											if (local353 != null && !this.method2056(local26, local17, local20, local353.aClass2_Sub2_Sub1_6.aShort32)) {
												if ((local353.anInt2798 & local251) != 0) {
													local353.aClass2_Sub2_Sub1_6.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local353.anInt2794 + local353.anInt2800 - Static116.anInt2895, local353.anInt2801 - Static116.anInt2893, local353.anInt2792 + local353.anInt2795 - Static116.anInt2903, local353.anInt2799);
												} else if (local353.anInt2798 == 256) {
													local592 = local353.anInt2794 - Static116.anInt2895;
													local597 = local353.anInt2801 - Static116.anInt2893;
													local602 = local353.anInt2792 - Static116.anInt2903;
													var17 = local353.anInt2796;
													if (var17 == 1 || var17 == 2) {
														var18 = -local592;
													} else {
														var18 = local592;
													}
													if (var17 == 2 || var17 == 3) {
														var19 = -local602;
													} else {
														var19 = local602;
													}
													if (var19 < var18) {
														local353.aClass2_Sub2_Sub1_6.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local592 + local353.anInt2800, local597, local602 + local353.anInt2795, local353.anInt2799);
													} else if (local353.aClass2_Sub2_Sub1_7 != null) {
														local353.aClass2_Sub2_Sub1_7.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local592, local597, local602, local353.anInt2799);
													}
												}
											}
											if (var22) {
												@Pc(673) Class69 local673 = local8.aClass69_1;
												if (local673 != null) {
													local673.aClass2_Sub2_Sub1_9.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local673.anInt3290 - Static116.anInt2895, local673.anInt3297 - Static116.anInt2893, local673.anInt3293 - Static116.anInt2903, local673.anInt3292);
												}
												@Pc(700) Class54 local700 = local8.aClass54_1;
												if (local700 != null && local700.anInt2494 == 0) {
													if (local700.aClass2_Sub2_Sub1_4 != null) {
														local700.aClass2_Sub2_Sub1_4.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local700.anInt2495 - Static116.anInt2895, local700.anInt2492 - Static116.anInt2893, local700.anInt2493 - Static116.anInt2903, local700.anInt2497);
													}
													if (local700.aClass2_Sub2_Sub1_3 != null) {
														local700.aClass2_Sub2_Sub1_3.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local700.anInt2495 - Static116.anInt2895, local700.anInt2492 - Static116.anInt2893, local700.anInt2493 - Static116.anInt2903, local700.anInt2497);
													}
													if (local700.aClass2_Sub2_Sub1_5 != null) {
														local700.aClass2_Sub2_Sub1_5.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local700.anInt2495 - Static116.anInt2895, local700.anInt2492 - Static116.anInt2893, local700.anInt2493 - Static116.anInt2903, local700.anInt2497);
													}
												}
											}
											local592 = local8.anInt1218;
											if (local592 != 0) {
												if (local17 < Static116.anInt2900 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean61) {
														Static116.aClass10_81.method448(var33);
													}
												}
												if (local20 < Static116.anInt2889 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean61) {
														Static116.aClass10_81.method448(var33);
													}
												}
												if (local17 > Static116.anInt2900 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean61) {
														Static116.aClass10_81.method448(var33);
													}
												}
												if (local20 > Static116.anInt2889 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean61) {
														Static116.aClass10_81.method448(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt1217 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt1209; var21++) {
												if (local8.aClass63Array1[var21].anInt3035 != Static116.anInt2896 && (local8.anIntArray191[var21] & local8.anInt1217) == local8.anInt1214) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass4_1;
												if (!this.method2051(local26, local17, local20, local919.anInt159)) {
													local919.aClass2_Sub2_Sub1_2.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local919.anInt162 - Static116.anInt2895, local919.anInt158 - Static116.anInt2893, local919.anInt165 - Static116.anInt2903, local919.anInt164);
												}
												local8.anInt1217 = 0;
											}
										}
										if (!local8.aBoolean59) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt1209;
											local8.aBoolean59 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass63Array1[local251];
												if (var12.anInt3035 != Static116.anInt2896) {
													for (local978 = var12.anInt3031; local978 <= var12.anInt3044; local978++) {
														for (local592 = var12.anInt3030; local592 <= var12.anInt3029; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean60) {
																local8.aBoolean59 = true;
																continue label558;
															}
															if (var33.anInt1217 != 0) {
																local602 = 0;
																if (local978 > var12.anInt3031) {
																	local602++;
																}
																if (local978 < var12.anInt3044) {
																	local602 += 4;
																}
																if (local592 > var12.anInt3030) {
																	local602 += 8;
																}
																if (local592 < var12.anInt3029) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt1217) == local8.anInt1212) {
																	local8.aBoolean59 = true;
																	continue label558;
																}
															}
														}
													}
													Static116.aClass63Array3[var21++] = var12;
													local592 = Static116.anInt2900 - var12.anInt3031;
													local597 = var12.anInt3044 - Static116.anInt2900;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static116.anInt2889 - var12.anInt3030;
													var17 = var12.anInt3029 - Static116.anInt2889;
													if (var17 > local602) {
														var12.anInt3028 = local592 + var17;
													} else {
														var12.anInt3028 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class63 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static116.aClass63Array3[local592];
													if (local1102.anInt3035 != Static116.anInt2896) {
														if (local1102.anInt3028 > local1093) {
															local1093 = local1102.anInt3028;
															local978 = local592;
														} else if (local1102.anInt3028 == local1093) {
															local602 = local1102.anInt3032 - Static116.anInt2895;
															var17 = local1102.anInt3026 - Static116.anInt2903;
															var18 = Static116.aClass63Array3[local978].anInt3032 - Static116.anInt2895;
															var19 = Static116.aClass63Array3[local978].anInt3026 - Static116.anInt2903;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static116.aClass63Array3[local978];
												local1102.anInt3035 = Static116.anInt2896;
												if (!this.method2066(local26, local1102.anInt3031, local1102.anInt3044, local1102.anInt3030, local1102.anInt3029, local1102.aClass2_Sub2_Sub1_8.aShort32)) {
													local1102.aClass2_Sub2_Sub1_8.method2907(local1102.anInt3025, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local1102.anInt3032 - Static116.anInt2895, local1102.anInt3038 - Static116.anInt2893, local1102.anInt3026 - Static116.anInt2903, local1102.anInt3037);
												}
												for (local602 = local1102.anInt3031; local602 <= local1102.anInt3044; local602++) {
													for (var17 = local1102.anInt3030; var17 <= local1102.anInt3029; var17++) {
														@Pc(1227) Class2_Sub7 local1227 = local31[local602][var17];
														if (local1227.anInt1217 != 0) {
															Static116.aClass10_81.method448(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean61) {
															Static116.aClass10_81.method448(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean59) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean59 = false;
											break;
										}
									}
								} while (!local8.aBoolean61);
							} while (local8.anInt1217 != 0);
							if (local17 > Static116.anInt2900 || local17 <= Static116.anInt2905) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean61);
						if (local17 < Static116.anInt2900 || local17 >= Static116.anInt2899 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean61);
					if (local20 > Static116.anInt2889 || local20 <= Static116.anInt2882) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean61);
				if (local20 < Static116.anInt2889 || local20 >= Static116.anInt2888 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean61);
			local8.aBoolean61 = false;
			Static116.anInt2904--;
			@Pc(1369) Class54 local1369 = local8.aClass54_1;
			if (local1369 != null && local1369.anInt2494 != 0) {
				if (local1369.aClass2_Sub2_Sub1_4 != null) {
					local1369.aClass2_Sub2_Sub1_4.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local1369.anInt2495 - Static116.anInt2895, local1369.anInt2492 - Static116.anInt2893 - local1369.anInt2494, local1369.anInt2493 - Static116.anInt2903, local1369.anInt2497);
				}
				if (local1369.aClass2_Sub2_Sub1_3 != null) {
					local1369.aClass2_Sub2_Sub1_3.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local1369.anInt2495 - Static116.anInt2895, local1369.anInt2492 - Static116.anInt2893 - local1369.anInt2494, local1369.anInt2493 - Static116.anInt2903, local1369.anInt2497);
				}
				if (local1369.aClass2_Sub2_Sub1_5 != null) {
					local1369.aClass2_Sub2_Sub1_5.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local1369.anInt2495 - Static116.anInt2895, local1369.anInt2492 - Static116.anInt2893 - local1369.anInt2494, local1369.anInt2493 - Static116.anInt2903, local1369.anInt2497);
				}
			}
			if (local8.anInt1213 != 0) {
				@Pc(1464) Class59 local1464 = local8.aClass59_1;
				if (local1464 != null && !this.method2056(local26, local17, local20, local1464.aClass2_Sub2_Sub1_6.aShort32)) {
					if ((local1464.anInt2798 & local8.anInt1213) != 0) {
						local1464.aClass2_Sub2_Sub1_6.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local1464.anInt2794 + local1464.anInt2800 - Static116.anInt2895, local1464.anInt2801 - Static116.anInt2893, local1464.anInt2792 + local1464.anInt2795 - Static116.anInt2903, local1464.anInt2799);
					} else if (local1464.anInt2798 == 256) {
						local251 = local1464.anInt2794 - Static116.anInt2895;
						local1093 = local1464.anInt2801 - Static116.anInt2893;
						local978 = local1464.anInt2792 - Static116.anInt2903;
						local592 = local1464.anInt2796;
						if (local592 == 1 || local592 == 2) {
							local597 = -local251;
						} else {
							local597 = local251;
						}
						if (local592 == 2 || local592 == 3) {
							local602 = -local978;
						} else {
							local602 = local978;
						}
						if (local602 >= local597) {
							local1464.aClass2_Sub2_Sub1_6.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local251 + local1464.anInt2800, local1093, local978 + local1464.anInt2795, local1464.anInt2799);
						} else if (local1464.aClass2_Sub2_Sub1_7 != null) {
							local1464.aClass2_Sub2_Sub1_7.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local251, local1093, local978, local1464.anInt2799);
						}
					}
				}
				local919 = local8.aClass4_1;
				if (local919 != null) {
					if ((local919.anInt157 & local8.anInt1213) != 0 && !this.method2051(local26, local17, local20, local919.anInt157)) {
						local919.aClass2_Sub2_Sub1_1.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local919.anInt162 - Static116.anInt2895, local919.anInt158 - Static116.anInt2893, local919.anInt165 - Static116.anInt2903, local919.anInt164);
					}
					if ((local919.anInt159 & local8.anInt1213) != 0 && !this.method2051(local26, local17, local20, local919.anInt159)) {
						local919.aClass2_Sub2_Sub1_2.method2907(0, Static116.anInt2902, Static116.anInt2898, Static116.anInt2885, Static116.anInt2887, local919.anInt162 - Static116.anInt2895, local919.anInt158 - Static116.anInt2893, local919.anInt165 - Static116.anInt2903, local919.anInt164);
					}
				}
			}
			@Pc(1689) Class2_Sub7 local1689;
			if (local23 < this.anInt2892 - 1) {
				local1689 = this.aClass2_Sub7ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean61) {
					Static116.aClass10_81.method448(local1689);
				}
			}
			if (local17 < Static116.anInt2900) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean61) {
					Static116.aClass10_81.method448(local1689);
				}
			}
			if (local20 < Static116.anInt2889) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean61) {
					Static116.aClass10_81.method448(local1689);
				}
			}
			if (local17 > Static116.anInt2900) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean61) {
					Static116.aClass10_81.method448(local1689);
				}
			}
			if (local20 > Static116.anInt2889) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean61) {
					Static116.aClass10_81.method448(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(III)I")
	public int method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1209; local14++) {
			@Pc(20) Class63 local20 = local8.aClass63Array1[local14];
			if ((local20.anInt3037 >> 29 & 0x3) == 2 && local20.anInt3031 == arg1 && local20.anInt3030 == arg2) {
				return local20.anInt3037;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!fe;IIIII)V")
	private void method2064(@OriginalArg(0) Class2_Sub2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2892) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2897) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2890 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub7 local66 = this.aClass2_Sub7ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray5[local17][local24][local34] + this.anIntArrayArrayArray5[local17][local24 + 1][local34] + this.anIntArrayArrayArray5[local17][local24][local34 + 1] + this.anIntArrayArrayArray5[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray5[arg1][arg2][arg3] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class4 local163 = local66.aClass4_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub2_Sub1_Sub3 local173;
										if (local163.aClass2_Sub2_Sub1_2 instanceof Class2_Sub2_Sub1_Sub3) {
											local173 = (Class2_Sub2_Sub1_Sub3) local163.aClass2_Sub2_Sub1_2;
											Static47.method862(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass2_Sub2_Sub1_1 instanceof Class2_Sub2_Sub1_Sub3) {
											local173 = (Class2_Sub2_Sub1_Sub3) local163.aClass2_Sub2_Sub1_1;
											Static47.method862(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt1209; local237++) {
										@Pc(243) Class63 local243 = local66.aClass63Array1[local237];
										if (local243 != null && local243.aClass2_Sub2_Sub1_8 instanceof Class2_Sub2_Sub1_Sub3) {
											@Pc(253) Class2_Sub2_Sub1_Sub3 local253 = (Class2_Sub2_Sub1_Sub3) local243.aClass2_Sub2_Sub1_8;
											@Pc(261) int local261 = local243.anInt3044 + 1 - local243.anInt3031;
											@Pc(269) int local269 = local243.anInt3029 + 1 - local243.anInt3030;
											Static47.method862(arg0, local253, (local243.anInt3031 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt3030 - arg3) * 128 + (local269 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIILclient!ac;III)Z")
	public boolean method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method2048(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)Z")
	private boolean method2066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray4[arg0][local17][local21] == -Static116.anInt2896) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray5[arg0][arg1][arg3] + arg5;
			if (!this.method2086(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method2086(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method2086(local21, local167, local195)) {
				return false;
			} else if (this.method2086(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method2084(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method2086(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3] + arg5, local21 + 1) && this.method2086(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] + arg5, local21 + 1) && this.method2086(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] + arg5, local21 + 128 - 1) && this.method2086(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] + arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(III)V")
	public void method2067() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2892; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2897; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2890; local7++) {
					@Pc(17) Class2_Sub7 local17 = this.aClass2_Sub7ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class4 local22 = local17.aClass4_1;
						if (local22 != null && local22.aClass2_Sub2_Sub1_2 instanceof Class2_Sub2_Sub1_Sub3) {
							@Pc(32) Class2_Sub2_Sub1_Sub3 local32 = (Class2_Sub2_Sub1_Sub3) local22.aClass2_Sub2_Sub1_2;
							this.method2064(local32, local1, local4, local7, 1, 1);
							if (local22.aClass2_Sub2_Sub1_1 instanceof Class2_Sub2_Sub1_Sub3) {
								@Pc(48) Class2_Sub2_Sub1_Sub3 local48 = (Class2_Sub2_Sub1_Sub3) local22.aClass2_Sub2_Sub1_1;
								this.method2064(local48, local1, local4, local7, 1, 1);
								Static47.method862(local32, local48, 0, 0, 0, false);
								local22.aClass2_Sub2_Sub1_1 = local48.method865(local48.aShort24, local48.aShort21, -50, -10, -50, false);
							}
							local22.aClass2_Sub2_Sub1_2 = local32.method865(local32.aShort24, local32.aShort21, -50, -10, -50, false);
						}
						@Pc(107) Class2_Sub2_Sub1_Sub3 local107;
						for (@Pc(91) int local91 = 0; local91 < local17.anInt1209; local91++) {
							@Pc(97) Class63 local97 = local17.aClass63Array1[local91];
							if (local97 != null && local97.aClass2_Sub2_Sub1_8 instanceof Class2_Sub2_Sub1_Sub3) {
								local107 = (Class2_Sub2_Sub1_Sub3) local97.aClass2_Sub2_Sub1_8;
								this.method2064(local107, local1, local4, local7, local97.anInt3044 + 1 - local97.anInt3031, local97.anInt3029 - local97.anInt3030 + 1);
								local97.aClass2_Sub2_Sub1_8 = local107.method865(local107.aShort24, local107.aShort21, -50, -10, -50, false);
							}
						}
						@Pc(148) Class69 local148 = local17.aClass69_1;
						if (local148 != null && local148.aClass2_Sub2_Sub1_9 instanceof Class2_Sub2_Sub1_Sub3) {
							local107 = (Class2_Sub2_Sub1_Sub3) local148.aClass2_Sub2_Sub1_9;
							this.method2050(local107, local1, local4, local7);
							local148.aClass2_Sub2_Sub1_9 = local107.method865(local107.aShort24, local107.aShort21, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(III)V")
	public void method2068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass69_1 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method2070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class62 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class62(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub7(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass62_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class62(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub7(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass62_1 = local12;
		} else {
			@Pc(140) Class68 local140 = new Class68(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub7(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass68_1 = local140;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILclient!ac;Lclient!ac;IIIIII)V")
	public void method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub1 arg4, @OriginalArg(5) Class2_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class59 local6 = new Class59();
		local6.anInt2799 = arg10;
		local6.anInt2805 = arg11;
		local6.anInt2794 = arg1 * 128 + 64;
		local6.anInt2792 = arg2 * 128 + 64;
		local6.anInt2801 = arg3;
		local6.aClass2_Sub2_Sub1_6 = arg4;
		local6.aClass2_Sub2_Sub1_7 = arg5;
		local6.anInt2798 = arg6;
		local6.anInt2796 = arg7;
		local6.anInt2800 = arg8;
		local6.anInt2795 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass2_Sub7ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass2_Sub7ArrayArrayArray1[local49][arg1][arg2] = new Class2_Sub7(local49, arg1, arg2);
			}
		}
		this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass59_1 = local6;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(III)I")
	public int method2072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass69_1 == null ? 0 : local8.aClass69_1.anInt3292;
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(III)Lclient!pf;")
	public Class63 method2073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1209; local14++) {
			@Pc(20) Class63 local20 = local8.aClass63Array1[local14];
			if ((local20.anInt3037 >> 29 & 0x3) == 2 && local20.anInt3031 == arg1 && local20.anInt3030 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(III)Lclient!oc;")
	public Class59 method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass59_1;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "()V")
	public void method2075() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2883; local1++) {
			@Pc(7) Class63 local7 = this.aClass63Array2[local1];
			this.method2090(local7);
			this.aClass63Array2[local1] = null;
		}
		this.anInt2883 = 0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	private void method2076(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray481.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray481[local5] - Static116.anInt2895;
			local20 = arg0.anIntArray491[local5] - Static116.anInt2893;
			local27 = arg0.anIntArray486[local5] - Static116.anInt2903;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray489 != null) {
				Static135.anIntArray488[local5] = local37;
				Static135.anIntArray495[local5] = local59;
				Static135.anIntArray485[local5] = local69;
			}
			Static135.anIntArray487[local5] = Static12.anInt360 + (local37 << 9) / local69;
			Static135.anIntArray493[local5] = Static12.anInt363 + (local59 << 9) / local69;
		}
		Static12.anInt359 = 0;
		local3 = arg0.anIntArray490.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray490[local13];
			local27 = arg0.anIntArray482[local13];
			local37 = arg0.anIntArray483[local13];
			@Pc(142) int local142 = Static135.anIntArray487[local20];
			@Pc(146) int local146 = Static135.anIntArray487[local27];
			@Pc(150) int local150 = Static135.anIntArray487[local37];
			@Pc(154) int local154 = Static135.anIntArray493[local20];
			@Pc(158) int local158 = Static135.anIntArray493[local27];
			@Pc(162) int local162 = Static135.anIntArray493[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static116.aBoolean115 && this.method2069(Static116.anInt2884, Static116.anInt2909, local154, local158, local162, local142, local146, local150)) {
					Static116.anInt2881 = arg5;
					Static116.anInt2886 = arg6;
				}
				Static12.aBoolean15 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static12.anInt362 || local146 > Static12.anInt362 || local150 > Static12.anInt362) {
					Static12.aBoolean15 = true;
				}
				if (arg0.anIntArray489 == null || arg0.anIntArray489[local13] == -1) {
					if (arg0.anIntArray494[local13] != 12345678) {
						Static12.method252(local154, local158, local162, local142, local146, local150, arg0.anIntArray494[local13], arg0.anIntArray484[local13], arg0.anIntArray492[local13]);
					}
				} else if (Static116.aBoolean116) {
					@Pc(364) int local364 = Static12.anInterface2_1.method1655(arg0.anIntArray489[local13]);
					Static12.method252(local154, local158, local162, local142, local146, local150, Static116.method2093(local364, arg0.anIntArray494[local13]), Static116.method2093(local364, arg0.anIntArray484[local13]), Static116.method2093(local364, arg0.anIntArray492[local13]));
				} else if (arg0.aBoolean141) {
					Static12.method253(local154, local158, local162, local142, local146, local150, arg0.anIntArray494[local13], arg0.anIntArray484[local13], arg0.anIntArray492[local13], Static135.anIntArray488[0], Static135.anIntArray488[1], Static135.anIntArray488[3], Static135.anIntArray495[0], Static135.anIntArray495[1], Static135.anIntArray495[3], Static135.anIntArray485[0], Static135.anIntArray485[1], Static135.anIntArray485[3], arg0.anIntArray489[local13]);
				} else {
					Static12.method253(local154, local158, local162, local142, local146, local150, arg0.anIntArray494[local13], arg0.anIntArray484[local13], arg0.anIntArray492[local13], Static135.anIntArray488[local20], Static135.anIntArray488[local27], Static135.anIntArray488[local37], Static135.anIntArray495[local20], Static135.anIntArray495[local27], Static135.anIntArray495[local37], Static135.anIntArray485[local20], Static135.anIntArray485[local27], Static135.anIntArray485[local37], arg0.anIntArray489[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "(III)I")
	public int method2077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass4_1 == null ? 0 : local8.aClass4_1.anInt164;
	}

	@OriginalMember(owner = "client!og", name = "j", descriptor = "(III)Lclient!ad;")
	public Class4 method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass4_1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIILclient!ac;IIIIII)Z")
	public boolean method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub2_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method2048(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "(III)V")
	public void method2080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass59_1 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILclient!ac;II)V")
	public void method2081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class69 local6 = new Class69();
		local6.aClass2_Sub2_Sub1_9 = arg4;
		local6.anInt3290 = arg1 * 128 + 64;
		local6.anInt3293 = arg2 * 128 + 64;
		local6.anInt3297 = arg3;
		local6.anInt3292 = arg5;
		local6.anInt3294 = arg6;
		if (this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub7(arg0, arg1, arg2);
		}
		this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass69_1 = local6;
	}

	@OriginalMember(owner = "client!og", name = "l", descriptor = "(III)I")
	public int method2082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass59_1 == null ? 0 : local8.aClass59_1.anInt2799;
	}

	@OriginalMember(owner = "client!og", name = "m", descriptor = "(III)V")
	public void method2083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass54_1 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "n", descriptor = "(III)Z")
	private boolean method2084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local8 == -Static116.anInt2896) {
			return false;
		} else if (local8 == Static116.anInt2896) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method2086(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2], local27 + 1) && this.method2086(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local27 + 1) && this.method2086(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method2086(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = Static116.anInt2896;
				return true;
			} else {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static116.anInt2896;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "o", descriptor = "(III)V")
	public void method2085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1209; local13++) {
			@Pc(19) Class63 local19 = local8.aClass63Array1[local13];
			if ((local19.anInt3037 >> 29 & 0x3) == 2 && local19.anInt3031 == arg1 && local19.anInt3030 == arg2) {
				this.method2090(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "p", descriptor = "(III)Z")
	private boolean method2086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static116.anInt2891; local1++) {
			@Pc(6) Class41 local6 = Static116.aClass41Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2077 == 1) {
				local15 = local6.anInt2069 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2072 + (local6.anInt2085 * local15 >> 8);
					local37 = local6.anInt2070 + (local6.anInt2065 * local15 >> 8);
					local47 = local6.anInt2076 + (local6.anInt2079 * local15 >> 8);
					local57 = local6.anInt2068 + (local6.anInt2089 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2077 == 2) {
				local15 = arg0 - local6.anInt2069;
				if (local15 > 0) {
					local27 = local6.anInt2072 + (local6.anInt2085 * local15 >> 8);
					local37 = local6.anInt2070 + (local6.anInt2065 * local15 >> 8);
					local47 = local6.anInt2076 + (local6.anInt2079 * local15 >> 8);
					local57 = local6.anInt2068 + (local6.anInt2089 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2077 == 3) {
				local15 = local6.anInt2072 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2069 + (local6.anInt2082 * local15 >> 8);
					local37 = local6.anInt2083 + (local6.anInt2078 * local15 >> 8);
					local47 = local6.anInt2076 + (local6.anInt2079 * local15 >> 8);
					local57 = local6.anInt2068 + (local6.anInt2089 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2077 == 4) {
				local15 = arg2 - local6.anInt2072;
				if (local15 > 0) {
					local27 = local6.anInt2069 + (local6.anInt2082 * local15 >> 8);
					local37 = local6.anInt2083 + (local6.anInt2078 * local15 >> 8);
					local47 = local6.anInt2076 + (local6.anInt2079 * local15 >> 8);
					local57 = local6.anInt2068 + (local6.anInt2089 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2077 == 5) {
				local15 = arg1 - local6.anInt2076;
				if (local15 > 0) {
					local27 = local6.anInt2069 + (local6.anInt2082 * local15 >> 8);
					local37 = local6.anInt2083 + (local6.anInt2078 * local15 >> 8);
					local47 = local6.anInt2072 + (local6.anInt2085 * local15 >> 8);
					local57 = local6.anInt2070 + (local6.anInt2065 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILclient!ac;Lclient!ac;IIII)V")
	public void method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub1 arg4, @OriginalArg(5) Class2_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class4 local8 = new Class4();
		local8.anInt164 = arg8;
		local8.anInt160 = arg9;
		local8.anInt162 = arg1 * 128 + 64;
		local8.anInt165 = arg2 * 128 + 64;
		local8.anInt158 = arg3;
		local8.aClass2_Sub2_Sub1_2 = arg4;
		local8.aClass2_Sub2_Sub1_1 = arg5;
		local8.anInt159 = arg6;
		local8.anInt157 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub7ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub7ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub7(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass4_1 = local8;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "()V")
	public void method2088() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2892; local1++) {
			for (local4 = 0; local4 < this.anInt2897; local4++) {
				for (local7 = 0; local7 < this.anInt2890; local7++) {
					this.aClass2_Sub7ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static116.anInt2908; local4++) {
			for (local7 = 0; local7 < Static116.anIntArray436[local4]; local7++) {
				Static116.aClass41ArrayArray1[local4][local7] = null;
			}
			Static116.anIntArray436[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2883; local7++) {
			this.aClass63Array2[local7] = null;
		}
		this.anInt2883 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static116.aClass63Array3.length; local76++) {
			Static116.aClass63Array3[local76] = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "q", descriptor = "(III)V")
	public void method2089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass4_1 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!pf;)V")
	private void method2090(@OriginalArg(0) Class63 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3031; local2 <= arg0.anInt3044; local2++) {
			for (@Pc(6) int local6 = arg0.anInt3030; local6 <= arg0.anInt3029; local6++) {
				@Pc(17) Class2_Sub7 local17 = this.aClass2_Sub7ArrayArrayArray1[arg0.anInt3034][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1209; local21++) {
						if (local17.aClass63Array1[local21] == arg0) {
							local17.anInt1209--;
							for (local36 = local21; local36 < local17.anInt1209; local36++) {
								local17.aClass63Array1[local36] = local17.aClass63Array1[local36 + 1];
								local17.anIntArray191[local36] = local17.anIntArray191[local36 + 1];
							}
							local17.aClass63Array1[local17.anInt1209] = null;
							break;
						}
					}
					local17.anInt1218 = 0;
					for (local36 = 0; local36 < local17.anInt1209; local36++) {
						local17.anInt1218 |= local17.anIntArray191[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIILclient!ac;IIZ)Z")
	public boolean method2091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return this.method2048(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)V")
	public void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub7 local8 = this.aClass2_Sub7ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub7 local31 = this.aClass2_Sub7ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub7ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1216--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1209; local41++) {
					@Pc(47) Class63 local47 = local31.aClass63Array1[local41];
					if ((local47.anInt3037 >> 29 & 0x3) == 2 && local47.anInt3031 == arg0 && local47.anInt3030 == arg1) {
						local47.anInt3034--;
					}
				}
			}
		}
		if (this.aClass2_Sub7ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub7ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub7(0, arg0, arg1);
		}
		this.aClass2_Sub7ArrayArrayArray1[0][arg0][arg1].aClass2_Sub7_1 = local8;
		this.aClass2_Sub7ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IIIIII)V")
	public void method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2897 * 128) {
			arg0 = this.anInt2897 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2890 * 128) {
			arg2 = this.anInt2890 * 128 - 1;
		}
		Static116.anInt2896++;
		Static116.anInt2902 = Class2_Sub2_Sub3_Sub1.anIntArray50[arg3];
		Static116.anInt2898 = Class2_Sub2_Sub3_Sub1.anIntArray52[arg3];
		Static116.anInt2885 = Class2_Sub2_Sub3_Sub1.anIntArray50[arg4];
		Static116.anInt2887 = Class2_Sub2_Sub3_Sub1.anIntArray52[arg4];
		Static116.aBooleanArrayArray1 = Static116.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static116.anInt2895 = arg0;
		Static116.anInt2893 = arg1;
		Static116.anInt2903 = arg2;
		Static116.anInt2900 = arg0 / 128;
		Static116.anInt2889 = arg2 / 128;
		Static116.anInt2907 = arg5;
		Static116.anInt2905 = Static116.anInt2900 - Static116.anInt2901;
		if (Static116.anInt2905 < 0) {
			Static116.anInt2905 = 0;
		}
		Static116.anInt2882 = Static116.anInt2889 - Static116.anInt2901;
		if (Static116.anInt2882 < 0) {
			Static116.anInt2882 = 0;
		}
		Static116.anInt2899 = Static116.anInt2900 + Static116.anInt2901;
		if (Static116.anInt2899 > this.anInt2897) {
			Static116.anInt2899 = this.anInt2897;
		}
		Static116.anInt2888 = Static116.anInt2889 + Static116.anInt2901;
		if (Static116.anInt2888 > this.anInt2890) {
			Static116.anInt2888 = this.anInt2890;
		}
		this.method2058();
		Static116.anInt2904 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2894; local128 < this.anInt2892; local128++) {
			@Pc(134) Class2_Sub7[][] local134 = this.aClass2_Sub7ArrayArrayArray1[local128];
			for (local136 = Static116.anInt2905; local136 < Static116.anInt2899; local136++) {
				for (local139 = Static116.anInt2882; local139 < Static116.anInt2888; local139++) {
					@Pc(146) Class2_Sub7 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1210 <= arg5 && (Static116.aBooleanArrayArray1[local136 + Static116.anInt2901 - Static116.anInt2900][local139 + Static116.anInt2901 - Static116.anInt2889] || this.anIntArrayArrayArray5[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean60 = true;
							local146.aBoolean61 = true;
							if (local146.anInt1209 > 0) {
								local146.aBoolean59 = true;
							} else {
								local146.aBoolean59 = false;
							}
							Static116.anInt2904++;
						} else {
							local146.aBoolean60 = false;
							local146.aBoolean61 = false;
							local146.anInt1217 = 0;
						}
					}
				}
			}
		}
		@Pc(242) int local242;
		@Pc(251) int local251;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(238) int local238;
		for (@Pc(224) int local224 = this.anInt2894; local224 < this.anInt2892; local224++) {
			@Pc(230) Class2_Sub7[][] local230 = this.aClass2_Sub7ArrayArrayArray1[local224];
			for (local139 = -Static116.anInt2901; local139 <= 0; local139++) {
				local238 = Static116.anInt2900 + local139;
				local242 = Static116.anInt2900 - local139;
				if (local238 >= Static116.anInt2905 || local242 < Static116.anInt2899) {
					for (local251 = -Static116.anInt2901; local251 <= 0; local251++) {
						local256 = Static116.anInt2889 + local251;
						local260 = Static116.anInt2889 - local251;
						@Pc(272) Class2_Sub7 local272;
						if (local238 >= Static116.anInt2905) {
							if (local256 >= Static116.anInt2882) {
								local272 = local230[local238][local256];
								if (local272 != null && local272.aBoolean60) {
									this.method2062(local272, true);
								}
							}
							if (local260 < Static116.anInt2888) {
								local272 = local230[local238][local260];
								if (local272 != null && local272.aBoolean60) {
									this.method2062(local272, true);
								}
							}
						}
						if (local242 < Static116.anInt2899) {
							if (local256 >= Static116.anInt2882) {
								local272 = local230[local242][local256];
								if (local272 != null && local272.aBoolean60) {
									this.method2062(local272, true);
								}
							}
							if (local260 < Static116.anInt2888) {
								local272 = local230[local242][local260];
								if (local272 != null && local272.aBoolean60) {
									this.method2062(local272, true);
								}
							}
						}
						if (Static116.anInt2904 == 0) {
							Static116.aBoolean115 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2894; local136 < this.anInt2892; local136++) {
			@Pc(363) Class2_Sub7[][] local363 = this.aClass2_Sub7ArrayArrayArray1[local136];
			for (local238 = -Static116.anInt2901; local238 <= 0; local238++) {
				local242 = Static116.anInt2900 + local238;
				local251 = Static116.anInt2900 - local238;
				if (local242 >= Static116.anInt2905 || local251 < Static116.anInt2899) {
					for (local256 = -Static116.anInt2901; local256 <= 0; local256++) {
						local260 = Static116.anInt2889 + local256;
						@Pc(393) int local393 = Static116.anInt2889 - local256;
						@Pc(405) Class2_Sub7 local405;
						if (local242 >= Static116.anInt2905) {
							if (local260 >= Static116.anInt2882) {
								local405 = local363[local242][local260];
								if (local405 != null && local405.aBoolean60) {
									this.method2062(local405, false);
								}
							}
							if (local393 < Static116.anInt2888) {
								local405 = local363[local242][local393];
								if (local405 != null && local405.aBoolean60) {
									this.method2062(local405, false);
								}
							}
						}
						if (local251 < Static116.anInt2899) {
							if (local260 >= Static116.anInt2882) {
								local405 = local363[local251][local260];
								if (local405 != null && local405.aBoolean60) {
									this.method2062(local405, false);
								}
							}
							if (local393 < Static116.anInt2888) {
								local405 = local363[local251][local393];
								if (local405 != null && local405.aBoolean60) {
									this.method2062(local405, false);
								}
							}
						}
						if (Static116.anInt2904 == 0) {
							Static116.aBoolean115 = false;
							return;
						}
					}
				}
			}
		}
		Static116.aBoolean115 = false;
	}
}
