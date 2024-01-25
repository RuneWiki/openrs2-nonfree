import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!ae;")
	public static final Class9 aClass9_2 = new Class9(2);

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_147 = new Class202("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ob;ZLclient!maa;Lclient!qa;II)Z")
	public static boolean method4012(@OriginalArg(0) Class2_Sub35 arg0, @OriginalArg(2) Class182 arg1, @OriginalArg(3) Class39 arg2) {
		@Pc(18) int local18 = Integer.MAX_VALUE;
		@Pc(20) int local20 = Integer.MIN_VALUE;
		@Pc(22) int local22 = Integer.MAX_VALUE;
		@Pc(24) int local24 = Integer.MIN_VALUE;
		if (arg1.anIntArray468 != null) {
			local18 = (arg1.anInt5328 + arg0.anInt6261 - Static201.anInt199) * (Static201.anInt209 - Static201.anInt200) / (Static201.anInt207 - Static201.anInt199) + Static201.anInt200;
			local20 = Static201.anInt200 + (Static201.anInt209 - Static201.anInt200) * (arg0.anInt6261 + arg1.anInt5340 - Static201.anInt199) / (Static201.anInt207 - Static201.anInt199);
			local22 = Static201.anInt208 - (arg1.anInt5347 + arg0.anInt6260 - Static201.anInt206) * (Static201.anInt208 + -Static201.anInt203) / (Static201.anInt204 - Static201.anInt206);
			local24 = Static201.anInt208 - (Static201.anInt208 - Static201.anInt203) * (arg1.anInt5348 + arg0.anInt6260 - Static201.anInt206) / (Static201.anInt204 - Static201.anInt206);
		}
		@Pc(109) Class35 local109 = null;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		@Pc(117) int local117 = 0;
		if (arg1.anInt5350 != -1) {
			if (arg0.aBoolean471 && arg1.anInt5331 != -1) {
				local109 = arg1.method4604(arg2, true);
			} else {
				local109 = arg1.method4604(arg2, false);
			}
			if (local109 != null) {
				local111 = arg0.anInt6265 - (local109.EA() + 1 >> 1);
				if (local111 < local18) {
					local18 = local111;
				}
				local113 = arg0.anInt6265 + (local109.EA() + 1 >> 1);
				if (local20 < local113) {
					local20 = local113;
				}
				local115 = arg0.anInt6262 - (local109.ma() + 1 >> 1);
				if (local115 < local22) {
					local22 = local115;
				}
				local117 = arg0.anInt6262 + (local109.ma() + 1 >> 1);
				if (local117 > local24) {
					local24 = local117;
				}
			}
		}
		@Pc(219) Class25 local219 = null;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(282) int local282;
		@Pc(305) int local305;
		if (arg1.aString118 != null) {
			local219 = Static349.method5499(arg1.anInt5326);
			if (local219 != null) {
				local221 = Static182.aClass52_7.method1581(Static33.aStringArray4, null, null, arg1.aString118);
				local223 = arg0.anInt6262;
				if (local109 == null) {
					local223 -= local221 * local219.method768() / 2;
				} else {
					local223 -= (local109.ma() >> 1) + local221 * local219.method762();
				}
				for (local282 = 0; local282 < local221; local282++) {
					@Pc(288) String local288 = Static33.aStringArray4[local282];
					if (local282 < local221 - 1) {
						local288 = local288.substring(0, local288.length() - 4);
					}
					local305 = local219.method766(local288);
					if (local225 < local305) {
						local225 = local305;
					}
				}
				local227 = arg0.anInt6265 - local225 / 2;
				if (local227 < local18) {
					local18 = local227;
				}
				local229 = arg0.anInt6265 + local225 / 2;
				if (local229 > local20) {
					local20 = local229;
				}
				local231 = local223;
				if (local22 > local231) {
					local22 = local231;
				}
				local233 = local221 * local219.method762() + local223;
				if (local24 < local233) {
					local24 = local233;
				}
			}
		}
		if (local20 < Static201.anInt200 || Static201.anInt209 < local18 || local24 < Static201.anInt203 || local22 > Static201.anInt208) {
			return true;
		}
		@Pc(427) int local427;
		if (arg1.anIntArray468 != null) {
			@Pc(425) int[] local425 = new int[arg1.anIntArray468.length];
			for (local427 = 0; local427 < local425.length / 2; local427++) {
				local305 = arg0.anInt6261 + arg1.anIntArray468[local427 * 2];
				@Pc(451) int local451 = arg0.anInt6260 + arg1.anIntArray468[local427 * 2 + 1];
				local425[local427 * 2] = Static201.anInt200 + (Static201.anInt209 - Static201.anInt200) * (local305 + -Static201.anInt199) / (Static201.anInt207 - Static201.anInt199);
				local425[local427 * 2 + 1] = Static201.anInt208 - (Static201.anInt208 - Static201.anInt203) * (-Static201.anInt206 + local451) / (Static201.anInt204 - Static201.anInt206);
			}
			Static506.method7429(arg2, local425, arg1.anInt5341);
			for (local305 = 0; local305 < local425.length / 2 - 1; local305++) {
				arg2.method6048(local425[local305 * 2 + 1 + 2], local425[local305 * 2 + 2], arg1.anInt5325, local425[local305 * 2], local425[local305 * 2 + 1]);
			}
			arg2.method6048(local425[1], local425[0], arg1.anInt5325, local425[local425.length - 2], local425[local425.length - 1]);
		}
		if (local109 != null) {
			if (Static277.anInt5015 > 0 && (Static276.anInt5003 != -1 && Static276.anInt5003 == arg0.anInt6264 || Static25.anInt1756 != -1 && Static25.anInt1756 == arg1.anInt5322)) {
				if (Static533.anInt9264 > 50) {
					local282 = (100 - Static533.anInt9264) * 2;
				} else {
					local282 = Static533.anInt9264 * 2;
				}
				local427 = local282 << 24 | 0xFFFF00;
				arg2.method6079(local109.c() / 2 + 7, arg0.anInt6262, arg0.anInt6265, local427);
				arg2.method6079(local109.c() / 2 + 5, arg0.anInt6262, arg0.anInt6265, local427);
				arg2.method6079(local109.c() / 2 + 3, arg0.anInt6262, arg0.anInt6265, local427);
				arg2.method6079(local109.c() / 2 + 1, arg0.anInt6262, arg0.anInt6265, local427);
				arg2.method6079(local109.c() / 2, arg0.anInt6262, arg0.anInt6265, local427);
			}
			local109.method7351(arg0.anInt6265 - (local109.EA() >> 1), arg0.anInt6262 + -(local109.ma() >> 1));
		}
		if (arg1.aString118 != null && local219 != null) {
			Static43.method830(arg2, arg0, local221, local223, local225, local219, arg1);
		}
		if (arg1.anInt5350 != -1 || arg1.aString118 != null) {
			@Pc(739) Class2_Sub48 local739 = new Class2_Sub48(arg0);
			local739.anInt9248 = local227;
			local739.anInt9246 = local113;
			local739.anInt9245 = local111;
			local739.anInt9243 = local229;
			local739.anInt9249 = local231;
			local739.anInt9251 = local115;
			local739.anInt9241 = local117;
			local739.anInt9247 = local233;
			Static411.aClass249_59.method6523(local739);
		}
		return false;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)[Lclient!fo;")
	public static Class91[] method4013() {
		return new Class91[] { Static245.aClass91_12, Static490.aClass91_25, Static394.aClass91_23, Static261.aClass91_14, Static245.aClass91_13, Static425.aClass91_21, Static465.aClass91_26, Static427.aClass91_24, Static108.aClass91_8, Static8.aClass91_1, Static69.aClass91_5, Static288.aClass91_22, Static159.aClass91_27, Static106.aClass91_7, Static517.aClass91_28 };
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!nc;B)V")
	public static void method4014(@OriginalArg(0) Class2_Sub34 arg0) {
		if (Static399.aClass262ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface6 local8 = null;
		if (arg0.anInt5723 == 0) {
			local8 = (Interface6) Static524.method7595(arg0.anInt5720, arg0.anInt5719, arg0.anInt5726);
		}
		if (arg0.anInt5723 == 1) {
			local8 = (Interface6) Static55.method1029(arg0.anInt5720, arg0.anInt5719, arg0.anInt5726);
		}
		if (arg0.anInt5723 == 2) {
			local8 = (Interface6) Static214.method3907(arg0.anInt5720, arg0.anInt5719, arg0.anInt5726, ej.class);
		}
		if (arg0.anInt5723 == 3) {
			local8 = (Interface6) Static427.method6584(arg0.anInt5720, arg0.anInt5719, arg0.anInt5726);
		}
		if (local8 == null) {
			arg0.anInt5716 = -1;
			arg0.anInt5727 = 0;
			arg0.anInt5722 = 0;
		} else {
			arg0.anInt5716 = local8.method7688();
			arg0.anInt5722 = local8.method7685();
			arg0.anInt5727 = local8.method7687();
		}
	}
}
