import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!qh", name = "W", descriptor = "[I")
	public static int[] anIntArray647;

	@OriginalMember(owner = "client!qh", name = "Y", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_28;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "[I")
	public static int[] anIntArray646 = new int[2];

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!qh", name = "Z", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B[BIZII[Lclient!tb;IIII)V")
	public static void method3103(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class90[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(12) Class2_Sub23 local12 = new Class2_Sub23(arg0);
		@Pc(14) int local14 = -1;
		while (true) {
			@Pc(18) int local18 = local12.method2106();
			if (local18 == 0) {
				return;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local12.method2111();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local12.method2122();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (local55 == arg6 && local51 >= arg3 && local51 < arg3 + 8 && local45 >= arg7 && arg7 + 8 > local45) {
					@Pc(104) Class2_Sub3_Sub17 local104 = Static121.method3984(local14);
					@Pc(122) int local122 = arg1 + Static61.method777(local104.anInt2387, local67, local51 & 0x7, arg2, local45 & 0x7, local104.anInt2394);
					@Pc(139) int local139 = Static60.method773(local104.anInt2387, local51 & 0x7, local45 & 0x7, arg2, local67, local104.anInt2394) + arg8;
					if (local122 > 0 && local139 > 0 && local122 < 103 && local139 < 103) {
						@Pc(155) Class90 local155 = null;
						@Pc(159) int local159 = arg5;
						if ((Static133.aByteArrayArrayArray10[1][local122][local139] & 0x2) == 2) {
							local159 = arg5 - 1;
						}
						if (local159 >= 0) {
							local155 = arg4[local159];
						}
						Static90.method1591(local139, true, local122, arg5, local14, arg2 + local67 & 0x3, local155, arg5, local63);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)Lclient!lj;")
	public static Class2_Sub3_Sub19 method3105(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub3_Sub19 local6 = (Class2_Sub3_Sub19) Static183.aClass110_20.method3891((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static137.aClass72_188.method3197(arg0, 16);
		local6 = new Class2_Sub3_Sub19();
		if (local20 != null) {
			local6.method2237(new Class2_Sub23(local20));
		}
		Static183.aClass110_20.method3894(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[Lclient!mj;)V")
	public static void method3106(@OriginalArg(1) int arg0, @OriginalArg(2) Class64[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Class64 local15 = arg1[local7];
			if (local15 != null && local15.anInt3075 == arg0 && (!local15.aBoolean132 || !Static36.method472(local15))) {
				if (local15.anInt3051 == 0) {
					if (!local15.aBoolean132 && Static36.method472(local15) && local15 != Static132.aClass64_10) {
						continue;
					}
					method3106(local15.anInt3044, arg1);
					if (local15.aClass64Array2 != null) {
						method3106(local15.anInt3044, local15.aClass64Array2);
					}
					@Pc(65) Class2_Sub11 local65 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local15.anInt3044);
					if (local65 != null) {
						Static95.method1664(local65.anInt726);
					}
				}
				if (local15.anInt3051 == 6) {
					@Pc(94) int local94;
					if (local15.anInt3058 != -1 || local15.anInt2996 != -1) {
						@Pc(89) boolean local89 = Static47.method627(local15);
						if (local89) {
							local94 = local15.anInt2996;
						} else {
							local94 = local15.anInt3058;
						}
						if (local94 != -1) {
							@Pc(107) Class2_Sub3_Sub3 local107 = Static187.method3447(local94);
							if (local107 != null) {
								local15.anInt3020 += Static44.anInt797;
								while (local107.anIntArray77[local15.anInt3050] < local15.anInt3020) {
									local15.anInt3020 -= local107.anIntArray77[local15.anInt3050];
									local15.anInt3050++;
									if (local107.anIntArray76.length <= local15.anInt3050) {
										local15.anInt3050 -= local107.anInt448;
										if (local15.anInt3050 < 0 || local107.anIntArray76.length <= local15.anInt3050) {
											local15.anInt3050 = 0;
										}
									}
									Static70.method2259(local15);
								}
							}
						}
					}
					if (local15.anInt3025 != 0 && !local15.aBoolean132) {
						@Pc(186) int local186 = local15.anInt3025 >> 16;
						@Pc(190) int local190 = local186 * Static44.anInt797;
						local94 = local15.anInt3025 << 16 >> 16;
						local94 *= Static44.anInt797;
						local15.anInt3028 = local94 + local15.anInt3028 & 0x7FF;
						local15.anInt2994 = local15.anInt2994 + local190 & 0x7FF;
						Static70.method2259(local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILclient!oe;)Lclient!fe;")
	public static Class2_Sub3_Sub8_Sub1 method3107(@OriginalArg(1) int arg0, @OriginalArg(3) Class72 arg1) {
		return Static55.method713(arg0, arg1) ? Static6.method126() : null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
	public static void method3108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(20) int local20 = 0; local20 < Static109.anInt2416; local20++) {
			if (Static123.anIntArray461[local20] + Static202.anIntArray728[local20] > arg0 && Static123.anIntArray461[local20] < arg2 + arg0 && Static92.anIntArray363[local20] + Static56.anIntArray160[local20] > arg1 && arg1 + arg3 > Static56.anIntArray160[local20]) {
				Static165.aBooleanArray111[local20] = true;
			}
		}
	}
}
