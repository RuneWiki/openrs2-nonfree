import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!pt", name = "S", descriptor = "Z")
	public static boolean aBoolean513 = false;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!uo;I)Ljava/lang/String;")
	public static String method6604(@OriginalArg(0) Class5_Sub1_Sub20 arg0) {
		return arg0.aString114 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!hga;Lclient!hga;)V")
	public static void method6605(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_65 != null) {
			arg1.method8570();
		}
		arg1.aClass4_65 = arg0.aClass4_65;
		arg1.aClass4_66 = arg0;
		arg1.aClass4_65.aClass4_66 = arg1;
		arg1.aClass4_66.aClass4_65 = arg1;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIIILclient!ffa;I)V")
	public static void method6606(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub20 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt2979 == -1 && arg3.anIntArray139 == null) {
			return;
		}
		@Pc(18) int local18 = 0;
		@Pc(28) int local28 = arg3.anInt2974 * Static577.aClass5_Sub19_25.aClass17_Sub15_3.method5251() >> 8;
		if (arg0 > arg3.anInt2982) {
			local18 = arg0 - arg3.anInt2982;
		} else if (arg0 < arg3.anInt2972) {
			local18 = arg3.anInt2972 - arg0;
		}
		if (arg4 > arg3.anInt2968) {
			local18 += arg4 - arg3.anInt2968;
		} else if (arg4 < arg3.anInt2983) {
			local18 += arg3.anInt2983 - arg4;
		}
		if (arg3.anInt2976 == 0 || arg3.anInt2976 < local18 - 256 || Static577.aClass5_Sub19_25.aClass17_Sub15_3.method5251() == 0 || arg3.anInt2975 != arg1) {
			if (arg3.aClass5_Sub4_Sub4_1 != null) {
				Static265.aClass5_Sub4_Sub1_2.method332(arg3.aClass5_Sub4_Sub4_1);
				arg3.aClass5_Sub22_1 = null;
				arg3.aClass5_Sub4_Sub4_1 = null;
				arg3.aClass5_Sub27_Sub1_2 = null;
			}
			if (arg3.aClass5_Sub4_Sub4_2 != null) {
				Static265.aClass5_Sub4_Sub1_2.method332(arg3.aClass5_Sub4_Sub4_2);
				arg3.aClass5_Sub4_Sub4_2 = null;
				arg3.aClass5_Sub22_2 = null;
				arg3.aClass5_Sub27_Sub1_1 = null;
			}
			return;
		}
		local18 -= 256;
		if (local18 < 0) {
			local18 = 0;
		}
		@Pc(171) int local171 = arg3.anInt2976 - arg3.anInt2973;
		if (local171 < 0) {
			local171 = arg3.anInt2976;
		}
		@Pc(178) int local178 = local28;
		@Pc(183) int local183 = local18 - arg3.anInt2973;
		if (local183 > 0 && local171 > 0) {
			local178 = local28 * (local171 - local183) / local171;
		}
		Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932();
		@Pc(219) int local219 = 8192;
		@Pc(229) int local229 = (arg3.anInt2972 + arg3.anInt2982) / 2 - arg0;
		@Pc(240) int local240 = (arg3.anInt2968 + arg3.anInt2983) / 2 - arg4;
		@Pc(265) int local265;
		@Pc(277) int local277;
		if (local229 != 0 || local240 != 0) {
			local265 = -Static542.anInt8612 - (int) (Math.atan2((double) local229, (double) local240) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local265 > 8192) {
				local265 = 16384 - local265;
			}
			if (local18 <= 0) {
				local277 = 8192;
			} else if (local18 < 4096) {
				local277 = local18 * 8192 / 4096 + 8192;
			} else {
				local277 = 16384;
			}
			local219 = local277 * local265 / 8192 + (16384 - local277 >> 1);
		}
		@Pc(438) Class5_Sub4_Sub4 local438;
		if (arg3.aClass5_Sub4_Sub4_1 != null) {
			arg3.aClass5_Sub4_Sub4_1.method4158(local178);
			arg3.aClass5_Sub4_Sub4_1.method4175(local219);
		} else if (arg3.anInt2979 >= 0) {
			local265 = arg3.anInt2971 == 256 && arg3.anInt2981 == 256 ? 256 : Static629.method8579(arg3.anInt2981, arg3.anInt2971);
			if (arg3.aBoolean222) {
				if (arg3.aClass5_Sub22_1 == null) {
					arg3.aClass5_Sub22_1 = Static182.method3149(Static612.aClass126_279, arg3.anInt2979);
				}
				if (arg3.aClass5_Sub22_1 != null) {
					if (arg3.aClass5_Sub27_Sub1_2 == null) {
						arg3.aClass5_Sub27_Sub1_2 = arg3.aClass5_Sub22_1.method3147(new int[] { 22050 });
					}
					if (arg3.aClass5_Sub27_Sub1_2 != null) {
						local438 = Static688.method4172(arg3.aClass5_Sub27_Sub1_2, local265, local178 << 6, local219);
						local438.method4168(-1);
						Static265.aClass5_Sub4_Sub1_2.method334(local438);
						arg3.aClass5_Sub4_Sub4_1 = local438;
					}
				}
			} else {
				@Pc(366) Class115 local366 = Static685.method2837(Static543.aClass126_247, arg3.anInt2979, 0);
				if (local366 != null) {
					@Pc(373) Class5_Sub27_Sub1 local373 = local366.method2836().method4336(Static354.aClass355_1);
					@Pc(381) Class5_Sub4_Sub4 local381 = Static688.method4172(local373, local265, local178 << 6, local219);
					local381.method4168(-1);
					Static265.aClass5_Sub4_Sub1_2.method334(local381);
					arg3.aClass5_Sub4_Sub4_1 = local381;
				}
			}
		}
		if (arg3.aClass5_Sub4_Sub4_2 != null) {
			arg3.aClass5_Sub4_Sub4_2.method4158(local178);
			arg3.aClass5_Sub4_Sub4_2.method4175(local219);
			if (!arg3.aClass5_Sub4_Sub4_2.method9219()) {
				arg3.aClass5_Sub4_Sub4_2 = null;
				arg3.aClass5_Sub22_2 = null;
				arg3.aClass5_Sub27_Sub1_1 = null;
			}
		} else if (arg3.anIntArray139 != null && (arg3.anInt2984 -= arg2) <= 0) {
			local265 = arg3.anInt2971 == 256 && arg3.anInt2981 == 256 ? 256 : (int) ((double) (arg3.anInt2971 - arg3.anInt2981) * Math.random()) + arg3.anInt2981;
			if (arg3.aBoolean223) {
				if (arg3.aClass5_Sub22_2 == null) {
					local277 = (int) (Math.random() * (double) arg3.anIntArray139.length);
					arg3.aClass5_Sub22_2 = Static182.method3149(Static612.aClass126_279, arg3.anIntArray139[local277]);
				}
				if (arg3.aClass5_Sub22_2 != null) {
					if (arg3.aClass5_Sub27_Sub1_1 == null) {
						arg3.aClass5_Sub27_Sub1_1 = arg3.aClass5_Sub22_2.method3147(new int[] { 22050 });
					}
					if (arg3.aClass5_Sub27_Sub1_1 != null) {
						local438 = Static688.method4172(arg3.aClass5_Sub27_Sub1_1, local265, local178 << 6, local219);
						local438.method4168(0);
						Static265.aClass5_Sub4_Sub1_2.method334(local438);
						arg3.aClass5_Sub4_Sub4_2 = local438;
						arg3.anInt2984 = arg3.anInt2980 + (int) (Math.random() * (double) (arg3.anInt2977 - arg3.anInt2980));
						return;
					}
				}
				return;
			}
			local277 = (int) ((double) arg3.anIntArray139.length * Math.random());
			@Pc(621) Class115 local621 = Static685.method2837(Static543.aClass126_247, arg3.anIntArray139[local277], 0);
			if (local621 != null) {
				@Pc(628) Class5_Sub27_Sub1 local628 = local621.method2836().method4336(Static354.aClass355_1);
				@Pc(636) Class5_Sub4_Sub4 local636 = Static688.method4172(local628, local265, local178 << 6, local219);
				local636.method4168(0);
				Static265.aClass5_Sub4_Sub1_2.method334(local636);
				arg3.aClass5_Sub4_Sub4_2 = local636;
				arg3.anInt2984 = arg3.anInt2980 + (int) ((double) (arg3.anInt2977 - arg3.anInt2980) * Math.random());
				return;
			}
		}
	}
}
