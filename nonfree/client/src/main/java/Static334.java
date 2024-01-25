import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!qn", name = "Q", descriptor = "[I")
	public static int[] anIntArray577 = new int[2];

	@OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
	public static final int anInt6138 = 52;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!co;ILclient!mo;ILclient!za;I)Z")
	public static boolean method4720(@OriginalArg(0) Class47 arg0, @OriginalArg(2) Class1_Sub28 arg1, @OriginalArg(4) Class106 arg2) {
		@Pc(5) int local5 = Integer.MAX_VALUE;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		@Pc(9) int local9 = Integer.MAX_VALUE;
		@Pc(11) int local11 = Integer.MIN_VALUE;
		if (arg0.anIntArray135 != null) {
			local7 = Static377.anInt5033 + (Static377.anInt5041 - Static377.anInt5033) * (arg0.anInt1542 + arg1.anInt4938 - Static377.anInt5037) / (Static377.anInt5035 - Static377.anInt5037);
			local9 = Static377.anInt5034 - (Static377.anInt5034 - Static377.anInt5039) * (-Static377.anInt5036 + arg1.anInt4936 + arg0.anInt1553) / (Static377.anInt5038 - Static377.anInt5036);
			local5 = (arg1.anInt4938 + arg0.anInt1541 - Static377.anInt5037) * (Static377.anInt5041 - Static377.anInt5033) / (Static377.anInt5035 - Static377.anInt5037) + Static377.anInt5033;
			local11 = Static377.anInt5034 - (Static377.anInt5034 - Static377.anInt5039) * (arg1.anInt4936 + arg0.anInt1559 - Static377.anInt5036) / (Static377.anInt5038 - Static377.anInt5036);
		}
		@Pc(111) Class137 local111 = null;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		@Pc(117) int local117 = 0;
		@Pc(119) int local119 = 0;
		if (arg0.anInt1560 != -1) {
			if (arg1.aBoolean312 && arg0.anInt1533 != -1) {
				local111 = arg0.method1078(true, arg2);
			} else {
				local111 = arg0.method1078(false, arg2);
			}
			if (local111 != null) {
				local113 = arg1.anInt4941 - (local111.RA() + 1 >> 1);
				local115 = arg1.anInt4941 + (local111.RA() + 1 >> 1);
				if (local113 < local5) {
					local5 = local113;
				}
				local117 = arg1.anInt4934 - (local111.Q() + 1 >> 1);
				if (local115 > local7) {
					local7 = local115;
				}
				local119 = arg1.anInt4934 + (local111.Q() + 1 >> 1);
				if (local117 < local9) {
					local9 = local117;
				}
				if (local119 > local11) {
					local11 = local119;
				}
			}
		}
		@Pc(217) Class122 local217 = null;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(279) int local279;
		@Pc(305) int local305;
		if (arg0.aString11 != null) {
			local217 = Static396.method5457(arg0.anInt1529);
			if (local217 != null) {
				local219 = Static67.aClass209_3.method4692(null, arg0.aString11, null, Static162.aStringArray23);
				local221 = arg1.anInt4934;
				if (local111 == null) {
					local221 -= local219 * local217.method3063() / 2;
				} else {
					local221 -= (local111.Q() >> 1) + local217.method3064() * local219;
				}
				for (local279 = 0; local279 < local219; local279++) {
					@Pc(284) String local284 = Static162.aStringArray23[local279];
					if (local279 < local219 - 1) {
						local284 = local284.substring(0, local284.length() - 4);
					}
					local305 = local217.method3058(local284);
					if (local305 > local223) {
						local223 = local305;
					}
				}
				local225 = arg1.anInt4941 - local223 / 2;
				local227 = local223 / 2 + arg1.anInt4941;
				if (local225 < local5) {
					local5 = local225;
				}
				if (local227 > local7) {
					local7 = local227;
				}
				local229 = local221;
				if (local9 > local229) {
					local9 = local229;
				}
				local231 = local221 + local217.method3064() * local219;
				if (local231 > local11) {
					local11 = local231;
				}
			}
		}
		if (Static377.anInt5033 > local7 || Static377.anInt5041 < local5 || Static377.anInt5039 > local11 || local9 > Static377.anInt5034) {
			return true;
		}
		@Pc(412) int local412;
		if (arg0.anIntArray135 != null) {
			@Pc(410) int[] local410 = new int[arg0.anIntArray135.length];
			for (local412 = 0; local412 < local410.length / 2; local412++) {
				local305 = arg1.anInt4938 + arg0.anIntArray135[local412 * 2];
				@Pc(435) int local435 = arg1.anInt4936 + arg0.anIntArray135[local412 * 2 + 1];
				local410[local412 * 2] = Static377.anInt5033 + (local305 - Static377.anInt5037) * (Static377.anInt5041 - Static377.anInt5033) / (Static377.anInt5035 - Static377.anInt5037);
				local410[local412 * 2 + 1] = Static377.anInt5034 - (local435 - Static377.anInt5036) * (Static377.anInt5034 - Static377.anInt5039) / (Static377.anInt5038 - Static377.anInt5036);
			}
			Static202.method3252(arg2, local410, arg0.anInt1536);
			for (local305 = 0; local305 < local410.length / 2 - 1; local305++) {
				arg2.method5981(arg0.anInt1556, local410[local305 * 2 + 1], local410[(local305 + 1) * 2], local410[local305 * 2 + 3], local410[local305 * 2]);
			}
			arg2.method5981(arg0.anInt1556, local410[local410.length - 1], local410[0], local410[1], local410[local410.length - 2]);
		}
		if (local111 != null) {
			if (Static305.anInt5723 > 0 && (Static140.anInt3084 != -1 && arg1.anInt4940 == Static140.anInt3084 || Static331.anInt6090 != -1 && Static331.anInt6090 == arg0.anInt1531)) {
				if (Static9.anInt3081 > 50) {
					local279 = (100 - Static9.anInt3081) * 2;
				} else {
					local279 = Static9.anInt3081 * 2;
				}
				local412 = local279 << 24 | 0xFFFF00;
				arg2.method5909(arg1.anInt4934, local111.YA() / 2 + 7, local412, arg1.anInt4941);
				arg2.method5909(arg1.anInt4934, local111.YA() / 2 + 5, local412, arg1.anInt4941);
				arg2.method5909(arg1.anInt4934, local111.YA() / 2 + 3, local412, arg1.anInt4941);
				arg2.method5909(arg1.anInt4934, local111.YA() / 2 + 1, local412, arg1.anInt4941);
				arg2.method5909(arg1.anInt4934, local111.YA() / 2, local412, arg1.anInt4941);
			}
			local111.method5708(arg1.anInt4941 - (local111.RA() >> 1), arg1.anInt4934 - (local111.Q() >> 1));
		}
		if (arg0.aString11 != null && local217 != null) {
			Static233.method3560(local223, arg0, local221, arg1, arg2, local217, local219);
		}
		if (arg0.anInt1560 != -1 || arg0.aString11 != null) {
			@Pc(727) Class1_Sub43 local727 = new Class1_Sub43(arg1);
			local727.anInt7322 = local231;
			local727.anInt7318 = local229;
			local727.anInt7319 = local227;
			local727.anInt7320 = local115;
			local727.anInt7315 = local117;
			local727.anInt7316 = local113;
			local727.anInt7321 = local225;
			local727.anInt7324 = local119;
			Static140.aClass203_19.method4551(local727);
		}
		return false;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)V")
	public static void method4722(@OriginalArg(1) int arg0) {
		Static305.anInt5723 = 3;
		Static9.anInt3081 = 100;
		Static331.anInt6090 = -1;
		Static140.anInt3084 = arg0;
	}
}
