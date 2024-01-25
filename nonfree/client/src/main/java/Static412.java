import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
	public static int anInt6765 = 0;

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_142 = new Class83("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
	public static int anInt6770 = 0;

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_90 = new Class215(17, 0);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIII)V")
	public static void method5292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static323.aClass50_Sub1_1.anInt3448 != 0 && arg3 != 0 && Static109.anInt6886 < 50 && arg1 != -1) {
			Static86.aClass269Array1[Static109.anInt6886++] = new Class269((byte) 1, arg1, arg3, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method5293(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg0[local12 + arg2] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(38) char local38 = Static419.aCharArray7[local22 - 128];
					if (local38 == '\u0000') {
						local38 = '?';
					}
					local22 = local38;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V")
	public static void method5294() {
		for (@Pc(18) Class4_Sub23 local18 = (Class4_Sub23) Static298.aClass183_38.method4140(); local18 != null; local18 = (Class4_Sub23) Static298.aClass183_38.method4144()) {
			if (Static202.aClass164ArrayArrayArray5 == null) {
				local18.method5684();
			} else {
				@Pc(44) int local44;
				@Pc(236) Class16_Sub4 local236;
				@Pc(255) Class16_Sub4_Sub1 local255;
				@Pc(128) Class16_Sub1 local128;
				@Pc(62) Class16_Sub2 local62;
				@Pc(273) Class16_Sub5 local273;
				@Pc(98) Class16_Sub2_Sub2 local98;
				@Pc(309) Class16_Sub5_Sub1 local309;
				if (Static24.anInt5323 >= local18.anInt3202) {
					local44 = Static201.anIntArray410[local18.anInt3195];
					if (local44 == 0) {
						local273 = Static227.method3449(local18.anInt3196, local18.anInt3189, local18.anInt3193);
						if (local273 instanceof Class16_Sub5_Sub1) {
							Static354.method4777(local18.anInt3196, local18.anInt3189, local18.anInt3193);
							local309 = (Class16_Sub5_Sub1) local273;
							if (local309.aClass16_Sub5_1 != null) {
								Static18.method181(local18.anInt3196, local18.anInt3189, local18.anInt3193, local309.aClass16_Sub5_1, null);
							}
						}
					} else if (local44 == 1) {
						local62 = Static54.method918(local18.anInt3196, local18.anInt3189, local18.anInt3193);
						if (local62 instanceof Class16_Sub2_Sub2) {
							Static419.method5382(local18.anInt3196, local18.anInt3189, local18.anInt3193);
							local98 = (Class16_Sub2_Sub2) local62;
							if (local98.aClass16_Sub2_1 != null) {
								Static73.method1356(local18.anInt3196, local18.anInt3189, local18.anInt3193, local98.aClass16_Sub2_1, null);
							}
						}
					} else if (local44 == 2) {
						local128 = Static36.method648(local18.anInt3196, local18.anInt3189, local18.anInt3193, f.class);
						if (local128 instanceof Class16_Sub1_Sub1) {
							Static194.method3046(local18.anInt3196, local18.anInt3189, local18.anInt3193, f.class);
							@Pc(417) Class16_Sub1_Sub1 local417 = (Class16_Sub1_Sub1) local128;
							if (local417.aClass16_Sub1_2 != null) {
								Static324.method4385(local417.aClass16_Sub1_2, false);
							}
						}
					} else if (local44 == 3) {
						local236 = Static117.method2096(local18.anInt3196, local18.anInt3189, local18.anInt3193);
						if (local236 instanceof Class16_Sub4_Sub1) {
							Static409.method5491(local18.anInt3196, local18.anInt3189, local18.anInt3193);
							local255 = (Class16_Sub4_Sub1) local236;
							if (local255.aClass16_Sub4_1 != null) {
								Static379.method5008(local18.anInt3196, local18.anInt3189, local18.anInt3193, local255.aClass16_Sub4_1);
							}
						}
					}
					local18.method5684();
				} else if (local18.anInt3191 == Static24.anInt5323) {
					local44 = Static201.anIntArray410[local18.anInt3195];
					if (local44 == 0) {
						local273 = Static227.method3449(local18.anInt3196, local18.anInt3189, local18.anInt3193);
						if (local273 instanceof Class16_Sub5_Sub1) {
							local18.method5684();
						} else if (Static136.method2344(local18.anInt3196, local18.anInt3189, local18.anInt3193) == null) {
							local309 = new Class16_Sub5_Sub1(local18.anInt3195, local18.anInt3190, local18.anInt3198, local18.anInt3188, local18.anInt3203, local273);
							Static18.method181(local18.anInt3196, local18.anInt3189, local18.anInt3193, local309, null);
						} else {
							local18.method5684();
						}
					} else if (local44 == 1) {
						local62 = Static54.method918(local18.anInt3196, local18.anInt3189, local18.anInt3193);
						if (local62 instanceof Class16_Sub2_Sub2) {
							local18.method5684();
						} else if (Static381.method5023(local18.anInt3196, local18.anInt3189, local18.anInt3193) == null) {
							local98 = new Class16_Sub2_Sub2(local18.anInt3195, local18.anInt3190, local18.anInt3198, local18.anInt3188, local18.anInt3203, local62);
							Static73.method1356(local18.anInt3196, local18.anInt3189, local18.anInt3193, local98, null);
						} else {
							local18.method5684();
						}
					} else if (local44 == 2) {
						local128 = Static36.method648(local18.anInt3196, local18.anInt3189, local18.anInt3193, f.class);
						if (local128 instanceof Class16_Sub1_Sub1) {
							local18.method5684();
						} else {
							Static194.method3046(local18.anInt3196, local18.anInt3189, local18.anInt3193, f.class);
							@Pc(157) Class202 local157 = Static267.aClass262_2.method5560(local18.anInt3194);
							@Pc(175) int local175;
							@Pc(172) int local172;
							if (local18.anInt3190 == 1 || local18.anInt3190 == 3) {
								local172 = local157.anInt5816;
								local175 = local157.anInt5801;
							} else {
								local172 = local157.anInt5801;
								local175 = local157.anInt5816;
							}
							@Pc(217) Class16_Sub1_Sub1 local217 = new Class16_Sub1_Sub1(local18.anInt3195, local18.anInt3190, local18.anInt3196, local18.anInt3198, local18.anInt3188, local18.anInt3203, local18.anInt3189, local175 + local18.anInt3189 - 1, local18.anInt3193, local18.anInt3193 + local172 - 1, local128);
							Static324.method4385(local217, false);
						}
					} else if (local44 == 3) {
						local236 = Static117.method2096(local18.anInt3196, local18.anInt3189, local18.anInt3193);
						if (local236 instanceof Class16_Sub4_Sub1) {
							local18.method5684();
						} else {
							local255 = new Class16_Sub4_Sub1(local18.anInt3198, local18.anInt3188, local18.anInt3203, local236);
							Static379.method5008(local18.anInt3196, local18.anInt3189, local18.anInt3193, local255);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIILclient!sd;IIIII)Z")
	public static boolean method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class213 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg9 - 64;
		Static159.anIntArrayArray30[64][64] = 99;
		@Pc(28) int local28 = arg8 - 64;
		Static14.anIntArrayArray1[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static129.anIntArray182[0] = arg9;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static416.anIntArray526[0] = arg8;
		@Pc(50) int[][] local50 = arg4.anIntArrayArray48;
		while (local45 != local42) {
			local9 = Static416.anIntArray526[local42];
			local7 = Static129.anIntArray182[local42];
			@Pc(65) int local65 = local9 - local28;
			local42 = local42 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - arg4.anInt6230;
			@Pc(82) int local82 = local7 - local18;
			@Pc(88) int local88 = local9 - arg4.anInt6235;
			if (arg2 == -4) {
				if (arg3 == local7 && arg5 == local9) {
					Static102.anInt2045 = local9;
					Static389.anInt6521 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static455.method4305(1, arg5, 1, arg7, arg0, local9, local7, arg3)) {
					Static389.anInt6521 = local7;
					Static102.anInt2045 = local9;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg4.method4844(arg3, 1, arg7, local7, arg1, arg5, local9, arg0, 1)) {
					Static389.anInt6521 = local7;
					Static102.anInt2045 = local9;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg4.method4840(arg0, 1, arg3, arg1, arg7, arg5, local7, local9)) {
					Static102.anInt2045 = local9;
					Static389.anInt6521 = local7;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg4.method4842(local9, arg6, arg5, 1, local7, arg3, arg2)) {
					Static389.anInt6521 = local7;
					Static102.anInt2045 = local9;
					return true;
				}
			} else if (arg4.method4849(arg6, local7, arg2, arg3, local9, arg5, 1)) {
				Static102.anInt2045 = local9;
				Static389.anInt6521 = local7;
				return true;
			}
			@Pc(245) int local245 = Static14.anIntArrayArray1[local82][local65] + 1;
			if (local82 > 0 && Static159.anIntArrayArray30[local82 - 1][local65] == 0 && (local50[local77 - 1][local88] & 0x42240000) == 0) {
				Static129.anIntArray182[local45] = local7 - 1;
				Static416.anIntArray526[local45] = local9;
				Static159.anIntArrayArray30[local82 - 1][local65] = 2;
				local45 = local45 + 1 & 0xFFF;
				Static14.anIntArrayArray1[local82 - 1][local65] = local245;
			}
			if (local82 < 127 && Static159.anIntArrayArray30[local82 + 1][local65] == 0 && (local50[local77 + 1][local88] & 0x60240000) == 0) {
				Static129.anIntArray182[local45] = local7 + 1;
				Static416.anIntArray526[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static159.anIntArrayArray30[local82 + 1][local65] = 8;
				Static14.anIntArrayArray1[local82 + 1][local65] = local245;
			}
			if (local65 > 0 && Static159.anIntArrayArray30[local82][local65 - 1] == 0 && (local50[local77][local88 - 1] & 0x40A40000) == 0) {
				Static129.anIntArray182[local45] = local7;
				Static416.anIntArray526[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static159.anIntArrayArray30[local82][local65 - 1] = 1;
				Static14.anIntArrayArray1[local82][local65 - 1] = local245;
			}
			if (local65 < 127 && Static159.anIntArrayArray30[local82][local65 + 1] == 0 && (local50[local77][local88 + 1] & 0x48240000) == 0) {
				Static129.anIntArray182[local45] = local7;
				Static416.anIntArray526[local45] = local9 + 1;
				Static159.anIntArrayArray30[local82][local65 + 1] = 4;
				local45 = local45 + 1 & 0xFFF;
				Static14.anIntArrayArray1[local82][local65 + 1] = local245;
			}
			if (local82 > 0 && local65 > 0 && Static159.anIntArrayArray30[local82 - 1][local65 - 1] == 0 && (local50[local77 - 1][local88 - 1] & 0x43A40000) == 0 && (local50[local77 - 1][local88] & 0x42240000) == 0 && (local50[local77][local88 - 1] & 0x40A40000) == 0) {
				Static129.anIntArray182[local45] = local7 - 1;
				Static416.anIntArray526[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static159.anIntArrayArray30[local82 - 1][local65 - 1] = 3;
				Static14.anIntArrayArray1[local82 - 1][local65 - 1] = local245;
			}
			if (local82 < 127 && local65 > 0 && Static159.anIntArrayArray30[local82 + 1][local65 - 1] == 0 && (local50[local77 + 1][local88 - 1] & 0x60E40000) == 0 && (local50[local77 + 1][local88] & 0x60240000) == 0 && (local50[local77][local88 - 1] & 0x40A40000) == 0) {
				Static129.anIntArray182[local45] = local7 + 1;
				Static416.anIntArray526[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static159.anIntArrayArray30[local82 + 1][local65 - 1] = 9;
				Static14.anIntArrayArray1[local82 + 1][local65 - 1] = local245;
			}
			if (local82 > 0 && local65 < 127 && Static159.anIntArrayArray30[local82 - 1][local65 + 1] == 0 && (local50[local77 - 1][local88 + 1] & 0x4E240000) == 0 && (local50[local77 - 1][local88] & 0x42240000) == 0 && (local50[local77][local88 + 1] & 0x48240000) == 0) {
				Static129.anIntArray182[local45] = local7 - 1;
				Static416.anIntArray526[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static159.anIntArrayArray30[local82 - 1][local65 + 1] = 6;
				Static14.anIntArrayArray1[local82 - 1][local65 + 1] = local245;
			}
			if (local82 < 127 && local65 < 127 && Static159.anIntArrayArray30[local82 + 1][local65 + 1] == 0 && (local50[local77 + 1][local88 + 1] & 0x78240000) == 0 && (local50[local77 + 1][local88] & 0x60240000) == 0 && (local50[local77][local88 + 1] & 0x48240000) == 0) {
				Static129.anIntArray182[local45] = local7 + 1;
				Static416.anIntArray526[local45] = local9 + 1;
				Static159.anIntArrayArray30[local82 + 1][local65 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Static14.anIntArrayArray1[local82 + 1][local65 + 1] = local245;
			}
		}
		Static389.anInt6521 = local7;
		Static102.anInt2045 = local9;
		return false;
	}
}
