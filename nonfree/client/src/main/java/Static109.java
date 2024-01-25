import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "Lclient!b;")
	public static Class20 aClass20_32;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	public static int anInt2145 = -1;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "[I")
	public static final int[] anIntArray212 = new int[2048];

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray45 = new boolean[100];

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "[I")
	public static final int[] anIntArray213 = new int[100];

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_7 = new Class68(1, 7);

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
	public static final int anInt2148 = 1337;

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
	public static int anInt2149 = -1;

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_33 = new Class244(36, 8);

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_34 = new Class244(73, 8);

	@OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
	public static int anInt2151 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!vr;IZLclient!np;Lclient!qo;I)Z")
	public static boolean method1781(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(3) Class155 arg1, @OriginalArg(4) Class196 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(14) int local14 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg2.anIntArray558 != null) {
			local16 = Static42.anInt538 - (arg2.anInt5004 + arg0.anInt6277 - Static42.anInt540) * (Static42.anInt538 + -Static42.anInt543) / (Static42.anInt535 - Static42.anInt540);
			local7 = Static42.anInt533 + (Static42.anInt537 - Static42.anInt533) * (arg0.anInt6276 + arg2.anInt5005 - Static42.anInt541) / (Static42.anInt532 - Static42.anInt541);
			local18 = Static42.anInt538 - (arg2.anInt5021 + arg0.anInt6277 - Static42.anInt540) * (-Static42.anInt543 + Static42.anInt538) / (Static42.anInt535 - Static42.anInt540);
			local14 = (Static42.anInt537 - Static42.anInt533) * (arg2.anInt5022 + (arg0.anInt6276 - Static42.anInt541)) / (Static42.anInt532 - Static42.anInt541) + Static42.anInt533;
		}
		@Pc(106) Class110 local106 = null;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		if (arg2.anInt4994 != -1) {
			if (arg0.aBoolean490 && arg2.anInt5026 != -1) {
				local106 = arg2.method4508(true, arg1);
			} else {
				local106 = arg2.method4508(false, arg1);
			}
			if (local106 != null) {
				local108 = arg0.anInt6280 - (local106.method5101() + 1 >> 1);
				local110 = arg0.anInt6280 + (local106.method5101() + 1 >> 1);
				if (local108 < local7) {
					local7 = local108;
				}
				local112 = arg0.anInt6275 - (local106.method5097() + 1 >> 1);
				if (local110 > local14) {
					local14 = local110;
				}
				local114 = arg0.anInt6275 + (local106.method5097() + 1 >> 1);
				if (local16 > local112) {
					local16 = local112;
				}
				if (local114 > local18) {
					local18 = local114;
				}
			}
		}
		@Pc(211) Class111 local211 = null;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(275) int local275;
		@Pc(298) int local298;
		if (arg2.aString53 != null) {
			local211 = Static203.method3166(arg2.anInt5011);
			if (local211 != null) {
				local213 = Static316.aClass190_8.method4357(null, Static84.aStringArray13, arg2.aString53, null);
				local215 = arg0.anInt6275;
				if (local106 == null) {
					local215 -= local211.method2359() * local213 / 2;
				} else {
					local215 -= (local106.method5097() >> 1) + (local211.method2357() * local213);
				}
				for (local275 = 0; local275 < local213; local275++) {
					@Pc(281) String local281 = Static84.aStringArray13[local275];
					if (local213 - 1 > local275) {
						local281 = local281.substring(0, local281.length() - 4);
					}
					local298 = local211.method2358(local281);
					if (local217 < local298) {
						local217 = local298;
					}
				}
				local219 = arg0.anInt6280 - local217 / 2;
				if (local7 > local219) {
					local7 = local219;
				}
				local221 = local217 / 2 + arg0.anInt6280;
				if (local14 < local221) {
					local14 = local221;
				}
				local223 = local215;
				if (local16 > local223) {
					local16 = local223;
				}
				local225 = local215 + local211.method2357() * local213;
				if (local225 > local18) {
					local18 = local225;
				}
			}
		}
		if (Static42.anInt533 > local14 || Static42.anInt537 < local7 || local18 < Static42.anInt543 || Static42.anInt538 < local16) {
			return true;
		}
		@Pc(409) int local409;
		if (arg2.anIntArray558 != null) {
			@Pc(407) int[] local407 = new int[arg2.anIntArray558.length];
			for (local409 = 0; local409 < local407.length / 2; local409++) {
				local298 = arg0.anInt6276 + arg2.anIntArray558[local409 * 2];
				@Pc(434) int local434 = arg2.anIntArray558[local409 * 2 + 1] + arg0.anInt6277;
				local407[local409 * 2] = (Static42.anInt537 - Static42.anInt533) * (local298 - Static42.anInt541) / (Static42.anInt532 - Static42.anInt541) + Static42.anInt533;
				local407[local409 * 2 + 1] = Static42.anInt538 - (Static42.anInt538 - Static42.anInt543) * (local434 - Static42.anInt540) / (Static42.anInt535 - Static42.anInt540);
			}
			Static360.method5364(arg1, local407, arg2.anInt4998);
			for (local298 = 0; local298 < local407.length / 2 - 1; local298++) {
				arg1.method4942(local407[(local298 + 1) * 2 + 1], local407[local298 * 2 + 2], local407[local298 * 2 + 1], arg2.anInt5017, local407[local298 * 2]);
			}
			arg1.method4942(local407[1], local407[0], local407[local407.length - 1], arg2.anInt5017, local407[local407.length - 2]);
		}
		if (local106 != null) {
			if (Static179.anInt3177 > 0 && (Static384.anInt6421 != -1 && arg0.anInt6279 == Static384.anInt6421 || Static246.anInt4423 != -1 && Static246.anInt4423 == arg2.anInt5001)) {
				if (Static296.anInt5113 <= 50) {
					local275 = Static296.anInt5113 * 2;
				} else {
					local275 = (100 - Static296.anInt5113) * 2;
				}
				local409 = local275 << 24 | 0xFFFF00;
				arg1.method4952(arg0.anInt6275, arg0.anInt6280, local409, local106.method5091() / 2 + 7);
				arg1.method4952(arg0.anInt6275, arg0.anInt6280, local409, local106.method5091() / 2 + 5);
				arg1.method4952(arg0.anInt6275, arg0.anInt6280, local409, local106.method5091() / 2 + 3);
				arg1.method4952(arg0.anInt6275, arg0.anInt6280, local409, local106.method5091() / 2 + 1);
				arg1.method4952(arg0.anInt6275, arg0.anInt6280, local409, local106.method5091() / 2);
			}
			local106.method5094(arg0.anInt6280 - (local106.method5101() >> 1), arg0.anInt6275 + -(local106.method5097() >> 1));
		}
		if (arg2.aString53 != null && local211 != null) {
			Static156.method2402(arg0, local217, local213, arg1, arg2, local215, local211);
		}
		if (arg2.anInt4994 != -1 || arg2.aString53 != null) {
			@Pc(725) Class3_Sub27 local725 = new Class3_Sub27(arg0);
			local725.anInt3893 = local110;
			local725.anInt3897 = local108;
			local725.anInt3899 = local223;
			local725.anInt3900 = local225;
			local725.anInt3898 = local114;
			local725.anInt3903 = local112;
			local725.anInt3904 = local219;
			local725.anInt3896 = local221;
			Static299.aClass138_37.method3053(local725);
		}
		return false;
	}
}
