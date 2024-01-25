import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray42;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "Lclient!wu;")
	public static Class384 aClass384_95;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
	public static int anInt6379 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5654(@OriginalArg(0) int arg0) {
		@Pc(20) Class5_Sub25 local20 = (Class5_Sub25) Static587.aClass81_67.method1599((long) arg0);
		if (local20 != null) {
			@Pc(27) Class5_Sub5_Sub3 local27 = local20.aClass103_Sub1_1.method6153();
			if (local27 != null) {
				@Pc(34) double local34 = local20.aClass103_Sub1_1.method6165();
				if ((double) local27.method4932() <= local34 && (double) local27.method4930() >= local34) {
					return local27.method4929();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!wr;IIIII)V")
	public static void method5655(@OriginalArg(0) Class5_Sub52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt10410 == -1 && arg0.anIntArray838 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(26) int local26 = arg0.anInt10425 * Static627.aClass5_Sub46_31.aClass11_Sub17_1.method5908() >> 8;
		if (arg1 > arg0.anInt10421) {
			local16 = arg1 - arg0.anInt10421;
		} else if (arg0.anInt10413 > arg1) {
			local16 = arg0.anInt10413 - arg1;
		}
		if (arg0.anInt10420 < arg4) {
			local16 += arg4 - arg0.anInt10420;
		} else if (arg0.anInt10409 > arg4) {
			local16 += arg0.anInt10409 - arg4;
		}
		if (arg0.anInt10411 == 0 || local16 - 256 > arg0.anInt10411 || Static627.aClass5_Sub46_31.aClass11_Sub17_1.method5908() == 0 || arg0.anInt10424 != arg3) {
			if (arg0.aClass5_Sub16_Sub2_4 != null) {
				Static287.aClass5_Sub16_Sub3_1.method6144(arg0.aClass5_Sub16_Sub2_4);
				arg0.aClass5_Sub11_Sub1_4 = null;
				arg0.aClass5_Sub38_3 = null;
				arg0.aClass5_Sub16_Sub2_4 = null;
			}
			if (arg0.aClass5_Sub16_Sub2_3 != null) {
				Static287.aClass5_Sub16_Sub3_1.method6144(arg0.aClass5_Sub16_Sub2_3);
				arg0.aClass5_Sub16_Sub2_3 = null;
				arg0.aClass5_Sub11_Sub1_3 = null;
				arg0.aClass5_Sub38_2 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(154) int local154 = arg0.anInt10411 - arg0.anInt10412;
		if (local154 < 0) {
			local154 = arg0.anInt10411;
		}
		@Pc(161) int local161 = local26;
		@Pc(167) int local167 = local16 - arg0.anInt10412;
		if (local167 > 0 && local154 > 0) {
			local161 = local26 * (local154 - local167) / local154;
		}
		Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509();
		@Pc(189) int local189 = 8192;
		@Pc(201) int local201 = (arg0.anInt10421 + arg0.anInt10413) / 2 - arg1;
		@Pc(212) int local212 = (arg0.anInt10409 + arg0.anInt10420) / 2 - arg4;
		@Pc(233) int local233;
		@Pc(253) int local253;
		if (local201 != 0 || local212 != 0) {
			local233 = -Static608.anInt9971 - (int) (Math.atan2((double) local201, (double) local212) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local233 > 8192) {
				local233 = 16384 - local233;
			}
			if (local16 <= 0) {
				local253 = 8192;
			} else if (local16 >= 4096) {
				local253 = 16384;
			} else {
				local253 = local16 * 8192 / 4096 + 8192;
			}
			local189 = local253 * local233 / 8192 + (16384 - local253 >> 1);
		}
		@Pc(381) Class5_Sub16_Sub2 local381;
		if (arg0.aClass5_Sub16_Sub2_4 != null) {
			arg0.aClass5_Sub16_Sub2_4.method3335(local161);
			arg0.aClass5_Sub16_Sub2_4.method3334(local189);
		} else if (arg0.anInt10410 >= 0) {
			local233 = arg0.anInt10419 == 256 && arg0.anInt10423 == 256 ? 256 : Static329.method5124(arg0.anInt10419, arg0.anInt10423);
			if (arg0.aBoolean837) {
				if (arg0.aClass5_Sub38_3 == null) {
					arg0.aClass5_Sub38_3 = Static412.method6277(Static340.aClass384_85, arg0.anInt10410);
				}
				if (arg0.aClass5_Sub38_3 != null) {
					if (arg0.aClass5_Sub11_Sub1_4 == null) {
						arg0.aClass5_Sub11_Sub1_4 = arg0.aClass5_Sub38_3.method6282(new int[] { 22050 });
					}
					if (arg0.aClass5_Sub11_Sub1_4 != null) {
						local381 = Static653.method3341(arg0.aClass5_Sub11_Sub1_4, local233, local161 << 6, local189);
						local381.method3352(-1);
						Static287.aClass5_Sub16_Sub3_1.method6140(local381);
						arg0.aClass5_Sub16_Sub2_4 = local381;
					}
				}
			} else {
				@Pc(317) Class322 local317 = Static657.method7709(Static61.aClass384_23, arg0.anInt10410, 0);
				if (local317 != null) {
					@Pc(324) Class5_Sub11_Sub1 local324 = local317.method7710().method1276(Static156.aClass325_1);
					@Pc(332) Class5_Sub16_Sub2 local332 = Static653.method3341(local324, local233, local161 << 6, local189);
					local332.method3352(-1);
					Static287.aClass5_Sub16_Sub3_1.method6140(local332);
					arg0.aClass5_Sub16_Sub2_4 = local332;
				}
			}
		}
		if (arg0.aClass5_Sub16_Sub2_3 != null) {
			arg0.aClass5_Sub16_Sub2_3.method3335(local161);
			arg0.aClass5_Sub16_Sub2_3.method3334(local189);
			if (!arg0.aClass5_Sub16_Sub2_3.method8913()) {
				arg0.aClass5_Sub16_Sub2_3 = null;
				arg0.aClass5_Sub38_2 = null;
				arg0.aClass5_Sub11_Sub1_3 = null;
			}
		} else if (arg0.anIntArray838 != null && (arg0.anInt10416 -= arg2) <= 0) {
			local233 = arg0.anInt10419 == 256 && arg0.anInt10423 == 256 ? 256 : arg0.anInt10423 + (int) (Math.random() * (double) (arg0.anInt10419 - arg0.anInt10423));
			if (arg0.aBoolean835) {
				if (arg0.aClass5_Sub38_2 == null) {
					local253 = (int) ((double) arg0.anIntArray838.length * Math.random());
					arg0.aClass5_Sub38_2 = Static412.method6277(Static340.aClass384_85, arg0.anIntArray838[local253]);
				}
				if (arg0.aClass5_Sub38_2 != null) {
					if (arg0.aClass5_Sub11_Sub1_3 == null) {
						arg0.aClass5_Sub11_Sub1_3 = arg0.aClass5_Sub38_2.method6282(new int[] { 22050 });
					}
					if (arg0.aClass5_Sub11_Sub1_3 != null) {
						local381 = Static653.method3341(arg0.aClass5_Sub11_Sub1_3, local233, local161 << 6, local189);
						local381.method3352(0);
						Static287.aClass5_Sub16_Sub3_1.method6140(local381);
						arg0.anInt10416 = (int) ((double) (arg0.anInt10417 - arg0.anInt10422) * Math.random()) + arg0.anInt10422;
						arg0.aClass5_Sub16_Sub2_3 = local381;
						return;
					}
				}
				return;
			}
			local253 = (int) (Math.random() * (double) arg0.anIntArray838.length);
			@Pc(557) Class322 local557 = Static657.method7709(Static61.aClass384_23, arg0.anIntArray838[local253], 0);
			if (local557 != null) {
				@Pc(564) Class5_Sub11_Sub1 local564 = local557.method7710().method1276(Static156.aClass325_1);
				@Pc(572) Class5_Sub16_Sub2 local572 = Static653.method3341(local564, local233, local161 << 6, local189);
				local572.method3352(0);
				Static287.aClass5_Sub16_Sub3_1.method6140(local572);
				arg0.aClass5_Sub16_Sub2_3 = local572;
				arg0.anInt10416 = (int) ((double) (arg0.anInt10417 - arg0.anInt10422) * Math.random()) + arg0.anInt10422;
				return;
			}
		}
	}
}
