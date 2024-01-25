import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
	public static int anInt1723;

	@OriginalMember(owner = "client!bfa", name = "d", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_4 = new Class370(11, 2);

	@OriginalMember(owner = "client!bfa", name = "k", descriptor = "Lclient!el;")
	public static final Class109 aClass109_42 = new Class109(28, 6);

	@OriginalMember(owner = "client!bfa", name = "h", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZII)V")
	public static void method1537(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			@Pc(6) Class5_Sub50 local6 = Static457.method6722(Static185.aClass387_35, Static80.aClass313_1);
			local6.aClass5_Sub23_Sub2_2.method8480(arg1);
			Static494.method7120(local6);
		} else {
			Static173.method2509(Static118.aClass354_3, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIILclient!hw;I)V")
	public static void method1538(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub22 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt3954 == -1 && arg3.anIntArray227 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(29) int local29 = arg3.anInt3955 * Static637.aClass5_Sub20_31.aClass24_Sub12_1.method3413() >> 8;
		if (arg4 > arg3.anInt3947) {
			local19 = arg4 - arg3.anInt3947;
		} else if (arg3.anInt3948 > arg4) {
			local19 = arg3.anInt3948 - arg4;
		}
		if (arg2 > arg3.anInt3950) {
			local19 += arg2 - arg3.anInt3950;
		} else if (arg2 < arg3.anInt3951) {
			local19 += arg3.anInt3951 - arg2;
		}
		if (arg3.anInt3946 == 0 || local19 - 256 > arg3.anInt3946 || Static637.aClass5_Sub20_31.aClass24_Sub12_1.method3413() == 0 || arg3.anInt3959 != arg1) {
			if (arg3.aClass5_Sub16_Sub3_2 != null) {
				Static91.aClass5_Sub16_Sub1_1.method2554(arg3.aClass5_Sub16_Sub3_2);
				arg3.aClass5_Sub16_Sub3_2 = null;
				arg3.aClass5_Sub24_Sub1_2 = null;
				arg3.aClass5_Sub37_2 = null;
			}
			if (arg3.aClass5_Sub16_Sub3_3 != null) {
				Static91.aClass5_Sub16_Sub1_1.method2554(arg3.aClass5_Sub16_Sub3_3);
				arg3.aClass5_Sub16_Sub3_3 = null;
				arg3.aClass5_Sub37_3 = null;
				arg3.aClass5_Sub24_Sub1_3 = null;
			}
			return;
		}
		local19 -= 256;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(177) int local177 = arg3.anInt3946 - arg3.anInt3944;
		if (local177 < 0) {
			local177 = arg3.anInt3946;
		}
		@Pc(187) int local187 = local29;
		@Pc(193) int local193 = local19 - arg3.anInt3944;
		if (local193 > 0 && local177 > 0) {
			local187 = (local177 - local193) * local29 / local177;
		}
		Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993();
		@Pc(223) int local223 = 8192;
		@Pc(233) int local233 = (arg3.anInt3948 + arg3.anInt3947) / 2 - arg4;
		@Pc(244) int local244 = (arg3.anInt3950 + arg3.anInt3951) / 2 - arg2;
		@Pc(269) int local269;
		@Pc(288) int local288;
		if (local233 != 0 || local244 != 0) {
			local269 = -Static159.anInt2475 - (int) (Math.atan2((double) local233, (double) local244) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local269 > 8192) {
				local269 = 16384 - local269;
			}
			if (local19 <= 0) {
				local288 = 8192;
			} else if (local19 >= 4096) {
				local288 = 16384;
			} else {
				local288 = local19 * 8192 / 4096 + 8192;
			}
			local223 = (16384 - local288 >> 1) + local288 * local269 / 8192;
		}
		@Pc(410) Class5_Sub16_Sub3 local410;
		if (arg3.aClass5_Sub16_Sub3_2 != null) {
			arg3.aClass5_Sub16_Sub3_2.method6134(local187);
			arg3.aClass5_Sub16_Sub3_2.method6164(local223);
		} else if (arg3.anInt3954 >= 0) {
			local269 = arg3.anInt3945 == 256 && arg3.anInt3958 == 256 ? 256 : Static104.method1522(arg3.anInt3945, arg3.anInt3958);
			if (arg3.aBoolean307) {
				if (arg3.aClass5_Sub37_2 == null) {
					arg3.aClass5_Sub37_2 = Static406.method5950(Static307.aClass208_70, arg3.anInt3954);
				}
				if (arg3.aClass5_Sub37_2 != null) {
					if (arg3.aClass5_Sub24_Sub1_2 == null) {
						arg3.aClass5_Sub24_Sub1_2 = arg3.aClass5_Sub37_2.method5949(new int[] { 22050 });
					}
					if (arg3.aClass5_Sub24_Sub1_2 != null) {
						local410 = Static688.method6163(arg3.aClass5_Sub24_Sub1_2, local269, local187 << 6, local223);
						local410.method6140(-1);
						Static91.aClass5_Sub16_Sub1_1.method2555(local410);
						arg3.aClass5_Sub16_Sub3_2 = local410;
					}
				}
			} else {
				@Pc(427) Class206 local427 = Static685.method4947(Static274.aClass208_64, arg3.anInt3954, 0);
				if (local427 != null) {
					@Pc(434) Class5_Sub24_Sub1 local434 = local427.method4949().method6765(Static90.aClass393_1);
					@Pc(442) Class5_Sub16_Sub3 local442 = Static688.method6163(local434, local269, local187 << 6, local223);
					local442.method6140(-1);
					Static91.aClass5_Sub16_Sub1_1.method2555(local442);
					arg3.aClass5_Sub16_Sub3_2 = local442;
				}
			}
		}
		if (arg3.aClass5_Sub16_Sub3_3 != null) {
			arg3.aClass5_Sub16_Sub3_3.method6134(local187);
			arg3.aClass5_Sub16_Sub3_3.method6164(local223);
			if (!arg3.aClass5_Sub16_Sub3_3.method9326()) {
				arg3.aClass5_Sub16_Sub3_3 = null;
				arg3.aClass5_Sub37_3 = null;
				arg3.aClass5_Sub24_Sub1_3 = null;
			}
		} else if (arg3.anIntArray227 != null && (arg3.anInt3949 -= arg0) <= 0) {
			local269 = arg3.anInt3945 == 256 && arg3.anInt3958 == 256 ? 256 : (int) (Math.random() * (double) (arg3.anInt3945 - arg3.anInt3958)) + arg3.anInt3958;
			if (!arg3.aBoolean309) {
				local288 = (int) (Math.random() * (double) arg3.anIntArray227.length);
				@Pc(546) Class206 local546 = Static685.method4947(Static274.aClass208_64, arg3.anIntArray227[local288], 0);
				if (local546 != null) {
					@Pc(553) Class5_Sub24_Sub1 local553 = local546.method4949().method6765(Static90.aClass393_1);
					@Pc(561) Class5_Sub16_Sub3 local561 = Static688.method6163(local553, local269, local187 << 6, local223);
					local561.method6140(0);
					Static91.aClass5_Sub16_Sub1_1.method2555(local561);
					arg3.anInt3949 = arg3.anInt3953 + (int) ((double) (arg3.anInt3952 - arg3.anInt3953) * Math.random());
					arg3.aClass5_Sub16_Sub3_3 = local561;
					return;
				}
				return;
			}
			if (arg3.aClass5_Sub37_3 == null) {
				local288 = (int) (Math.random() * (double) arg3.anIntArray227.length);
				arg3.aClass5_Sub37_3 = Static406.method5950(Static307.aClass208_70, arg3.anIntArray227[local288]);
			}
			if (arg3.aClass5_Sub37_3 != null) {
				if (arg3.aClass5_Sub24_Sub1_3 == null) {
					arg3.aClass5_Sub24_Sub1_3 = arg3.aClass5_Sub37_3.method5949(new int[] { 22050 });
				}
				if (arg3.aClass5_Sub24_Sub1_3 != null) {
					local410 = Static688.method6163(arg3.aClass5_Sub24_Sub1_3, local269, local187 << 6, local223);
					local410.method6140(0);
					Static91.aClass5_Sub16_Sub1_1.method2555(local410);
					arg3.aClass5_Sub16_Sub3_3 = local410;
					arg3.anInt3949 = arg3.anInt3953 + (int) (Math.random() * (double) (arg3.anInt3952 - arg3.anInt3953));
					return;
				}
			}
		}
	}
}
