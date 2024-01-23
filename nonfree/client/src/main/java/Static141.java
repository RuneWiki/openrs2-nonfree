import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public static int anInt3806;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[I")
	public static int[] anIntArray428;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_33;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1236 = Static186.method3527("<col=ffb000>");

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "[S")
	public static short[] aShortArray55 = new short[] { 5, 43, 25, 57, 21, 49, 3, 38 };

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 < 0 || arg5 < 0 || arg1 >= 103 || arg5 >= 103) {
			return;
		}
		@Pc(41) int local41;
		if (arg2 == 0) {
			@Pc(31) Class29 local31 = Static156.method2578(arg4, arg1, arg5);
			if (local31 != null) {
				local41 = Integer.MAX_VALUE & (int) (local31.aLong44 >>> 32);
				if (arg0 == 2) {
					local31.aClass20_1 = new Class20_Sub1(local41, 2, arg6 + 4, arg4, arg1, arg5, arg3, false, local31.aClass20_1);
					local31.aClass20_2 = new Class20_Sub1(local41, 2, arg6 + 1 & 0x3, arg4, arg1, arg5, arg3, false, local31.aClass20_2);
				} else {
					local31.aClass20_1 = new Class20_Sub1(local41, arg0, arg6, arg4, arg1, arg5, arg3, false, local31.aClass20_1);
				}
			}
		}
		if (arg2 == 1) {
			@Pc(105) Class61 local105 = Static28.method396(arg4, arg1, arg5);
			if (local105 != null) {
				local41 = Integer.MAX_VALUE & (int) (local105.aLong89 >>> 32);
				if (arg0 == 4 || arg0 == 5) {
					local105.aClass20_3 = new Class20_Sub1(local41, 4, arg6, arg4, arg1, arg5, arg3, false, local105.aClass20_3);
				} else if (arg0 == 6) {
					local105.aClass20_3 = new Class20_Sub1(local41, 4, arg6 + 4, arg4, arg1, arg5, arg3, false, local105.aClass20_3);
				} else if (arg0 == 7) {
					local105.aClass20_3 = new Class20_Sub1(local41, 4, (arg6 + 2 & 0x3) + 4, arg4, arg1, arg5, arg3, false, local105.aClass20_3);
				} else if (arg0 == 8) {
					local105.aClass20_3 = new Class20_Sub1(local41, 4, arg6 + 4, arg4, arg1, arg5, arg3, false, local105.aClass20_3);
					local105.aClass20_4 = new Class20_Sub1(local41, 4, (arg6 + 2 & 0x3) + 4, arg4, arg1, arg5, arg3, false, local105.aClass20_4);
				}
			}
		}
		if (arg2 == 2) {
			if (arg0 == 11) {
				arg0 = 10;
			}
			@Pc(248) Class94 local248 = Static129.method2045(arg4, arg1, arg5);
			if (local248 != null) {
				local248.aClass20_5 = new Class20_Sub1((int) (local248.aLong143 >>> 32) & Integer.MAX_VALUE, arg0, arg6, arg4, arg1, arg5, arg3, false, local248.aClass20_5);
			}
		}
		if (arg2 != 3) {
			return;
		}
		@Pc(279) Class128 local279 = Static65.method3256(arg4, arg1, arg5);
		if (local279 != null) {
			local279.aClass20_10 = new Class20_Sub1(Integer.MAX_VALUE & (int) (local279.aLong169 >>> 32), 22, arg6, arg4, arg1, arg5, arg3, false, local279.aClass20_10);
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!nk;II)V")
	public static void method3012(@OriginalArg(1) Class20_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt3060 && arg1 != -1) {
			@Pc(80) Class110 local80 = Static200.method3204(arg1);
			@Pc(83) int local83 = local80.anInt4014;
			if (local83 == 1) {
				arg0.anInt3052 = 0;
				arg0.anInt3014 = arg2;
				arg0.anInt3020 = 0;
				arg0.anInt3046 = 0;
				Static80.method1140(arg0.anInt3046, arg0.anInt3008, arg0.anInt3022, false, local80);
			}
			if (local83 == 2) {
				arg0.anInt3020 = 0;
				return;
			}
		} else if (arg1 == -1 || arg0.anInt3060 == -1 || Static200.method3204(arg1).anInt4012 >= Static200.method3204(arg0.anInt3060).anInt4012) {
			arg0.anInt3014 = arg2;
			arg0.anInt3009 = arg0.anInt3041;
			arg0.anInt3060 = arg1;
			arg0.anInt3046 = 0;
			arg0.anInt3020 = 0;
			arg0.anInt3052 = 0;
			if (arg0.anInt3060 != -1) {
				Static80.method1140(arg0.anInt3046, arg0.anInt3008, arg0.anInt3022, false, Static200.method3204(arg0.anInt3060));
				return;
			}
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
	public static void method3015(@OriginalArg(1) int arg0) {
		Static95.anInt1938 = -1;
		Static177.anInt3717 = arg0;
		Static95.anInt1938 = -1;
		Static107.method1639();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[BI[Lclient!cg;IIZIB)V")
	public static void method3016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class16[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(6) Class1_Sub17 local6 = new Class1_Sub17(arg3);
		@Pc(8) int local8 = -1;
		while (true) {
			@Pc(20) int local20 = local6.method2132();
			if (local20 == 0) {
				return;
			}
			local8 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(37) int local37 = local6.method2156();
				if (local37 == 0) {
					break;
				}
				local31 += local37 - 1;
				@Pc(54) int local54 = local31 >> 6 & 0x3F;
				@Pc(58) int local58 = local31 & 0x3F;
				@Pc(62) int local62 = local31 >> 12;
				@Pc(66) int local66 = local6.method2142();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				if (arg0 == local62 && arg1 <= local54 && local54 < arg1 + 8 && local58 >= arg7 && arg7 + 8 > local58) {
					@Pc(113) Class18 local113 = Static148.method2487(local8);
					@Pc(130) int local130 = arg2 + Static147.method2480(local54 & 0x7, local113.anInt811, local74, arg4, local58 & 0x7, local113.anInt822);
					@Pc(147) int local147 = Static134.method2263(local113.anInt811, local74, arg4, local58 & 0x7, local113.anInt822, local54 & 0x7) + arg8;
					if (local130 > 0 && local147 > 0 && local130 < 103 && local147 < 103) {
						@Pc(164) Class16 local164 = null;
						@Pc(168) int local168 = arg6;
						if ((Static159.aByteArrayArrayArray13[1][local130][local147] & 0x2) == 2) {
							local168 = arg6 - 1;
						}
						if (local168 >= 0) {
							local164 = arg5[local168];
						}
						Static195.method3168(local74 + arg4 & 0x3, local8, local164, local147, local130, true, arg6, arg6, local70);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIILclient!qh;)V")
	public static void method3018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class93 arg2) {
		if (Static54.aClass93_35 != null || Static40.aBoolean44 || (arg2 == null || Static143.method2359(arg2) == null)) {
			return;
		}
		Static54.aClass93_35 = arg2;
		Static53.aClass93_34 = Static143.method2359(arg2);
		Static200.aBoolean189 = false;
		Static150.anInt3122 = 0;
		Static27.anInt540 = arg1;
		Static155.anInt3202 = arg0;
	}
}
