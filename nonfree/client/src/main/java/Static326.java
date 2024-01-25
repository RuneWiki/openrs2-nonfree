import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "Lclient!nj;")
	public static Class164 aClass164_3;

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_90 = new Class217(11, -1);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([BB)Z")
	public static boolean method4406(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class3_Sub7 local13 = new Class3_Sub7(arg0);
		@Pc(17) int local17 = local13.method2582();
		if (local17 != 1) {
			return false;
		}
		@Pc(35) boolean local35 = local13.method2582() == 1;
		if (local35) {
			Static145.method4743(local13);
		}
		Static284.method4038(local13);
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4408(@OriginalArg(0) String arg0) {
		Static152.aString21 = arg0;
		if (Static66.aClass143_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(20) String local20 = Static66.aClass143_2.anApplet1.getParameter("cookieprefix");
			@Pc(25) String local25 = Static66.aClass143_2.anApplet1.getParameter("cookiehost");
			@Pc(40) String local40 = local20 + "settings=" + arg0 + "; version=1; path=/; domain=" + local25;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static96.method1702(Static118.method1934() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static456.method850("document.cookie=\"" + local40 + "\"", Static66.aClass143_2.anApplet1);
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!eg;IIIII)V")
	public static void method4409(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt2118 == -1 && arg0.anIntArray126 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = arg0.anInt2127 * Static374.aClass20_Sub1_1.anInt2349 >> 8;
		if (arg0.anInt2114 < arg2) {
			local15 = arg2 - arg0.anInt2114;
		} else if (arg2 < arg0.anInt2117) {
			local15 = arg0.anInt2117 - arg2;
		}
		if (arg1 > arg0.anInt2126) {
			local15 += arg1 - arg0.anInt2126;
		} else if (arg1 < arg0.anInt2125) {
			local15 += arg0.anInt2125 - arg1;
		}
		if (arg0.anInt2128 == 0 || local15 - 64 > arg0.anInt2128 || Static374.aClass20_Sub1_1.anInt2349 == 0 || arg4 != arg0.anInt2113) {
			if (arg0.aClass3_Sub5_Sub2_1 != null) {
				Static331.aClass3_Sub5_Sub1_42.method886(arg0.aClass3_Sub5_Sub2_1);
				arg0.aClass3_Sub5_Sub2_1 = null;
			}
			if (arg0.aClass3_Sub5_Sub2_2 != null) {
				Static331.aClass3_Sub5_Sub1_42.method886(arg0.aClass3_Sub5_Sub2_2);
				arg0.aClass3_Sub5_Sub2_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(145) int local145 = local23 * (arg0.anInt2128 - local15) / arg0.anInt2128;
		if (arg0.aClass3_Sub5_Sub2_1 != null) {
			arg0.aClass3_Sub5_Sub2_1.method2098(local145);
		} else if (arg0.anInt2118 >= 0) {
			@Pc(163) Class175 local163 = Static460.method4047(Static69.aClass32_30, arg0.anInt2118, 0);
			if (local163 != null) {
				@Pc(170) Class3_Sub6_Sub1 local170 = local163.method4046().method743(Static262.aClass174_1);
				@Pc(175) Class3_Sub5_Sub2 local175 = Static458.method2085(local170, local145);
				local175.method2100(-1);
				Static331.aClass3_Sub5_Sub1_42.method889(local175);
				arg0.aClass3_Sub5_Sub2_1 = local175;
			}
		}
		if (arg0.aClass3_Sub5_Sub2_2 != null) {
			arg0.aClass3_Sub5_Sub2_2.method2098(local145);
			if (arg0.aClass3_Sub5_Sub2_2.method5978()) {
				return;
			}
			arg0.aClass3_Sub5_Sub2_2 = null;
		} else if (arg0.anIntArray126 != null && (arg0.anInt2112 -= arg3) <= 0) {
			@Pc(206) int local206 = (int) ((double) arg0.anIntArray126.length * Math.random());
			@Pc(214) Class175 local214 = Static460.method4047(Static69.aClass32_30, arg0.anIntArray126[local206], 0);
			if (local214 != null) {
				@Pc(221) Class3_Sub6_Sub1 local221 = local214.method4046().method743(Static262.aClass174_1);
				@Pc(226) Class3_Sub5_Sub2 local226 = Static458.method2085(local221, local145);
				local226.method2100(0);
				Static331.aClass3_Sub5_Sub1_42.method889(local226);
				arg0.anInt2112 = arg0.anInt2115 + (int) ((double) (arg0.anInt2123 - arg0.anInt2115) * Math.random());
				arg0.aClass3_Sub5_Sub2_2 = local226;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(III)I")
	public static int method4410(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static292.anIntArray357[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
	public static void method4411(@OriginalArg(1) boolean arg0) {
		Static51.anInt1367 = 0;
		Static9.anInt191 = 0;
		Static105.method1821();
		Static429.method5642(arg0);
		Static9.method111();
		@Pc(29) int local29;
		for (@Pc(24) int local24 = 0; local24 < Static9.anInt191; local24++) {
			local29 = Static454.anIntArray534[local24];
			if (Static253.anInt4787 != Static139.aClass7_Sub2_Sub3_Sub1Array11[local29].anInt4357) {
				if (Static139.aClass7_Sub2_Sub3_Sub1Array11[local29].aClass47_1.method1240()) {
					Static152.method2472(Static139.aClass7_Sub2_Sub3_Sub1Array11[local29]);
				}
				Static139.aClass7_Sub2_Sub3_Sub1Array11[local29].method454(null);
				Static139.aClass7_Sub2_Sub3_Sub1Array11[local29] = null;
			}
		}
		if (Static237.aClass3_Sub7_Sub1_1.anInt3235 != Static139.anInt7585) {
			throw new RuntimeException("gnp1 pos:" + Static237.aClass3_Sub7_Sub1_1.anInt3235 + " psize:" + Static139.anInt7585);
		}
		for (local29 = 0; local29 < Static54.anInt1472; local29++) {
			if (Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local29]] == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static54.anInt1472);
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)I")
	public static int method4412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static66.anInt1702 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg0 - Static144.anInt5410;
		@Pc(24) int local24 = arg2 - Static144.anInt5420;
		for (@Pc(37) Class3_Sub26 local37 = (Class3_Sub26) Static144.aClass243_33.method5208(); local37 != null; local37 = (Class3_Sub26) Static144.aClass243_33.method5203()) {
			if (local37.anInt3892 == arg1) {
				@Pc(45) int local45 = local37.anInt3895;
				@Pc(48) int local48 = local37.anInt3891;
				@Pc(58) int local58 = Static144.anInt5410 + local45 << 14 | local48 + Static144.anInt5420;
				@Pc(77) int local77 = (local24 - local48) * (local24 + -local48) + (local19 - local45) * (local19 + -local45);
				if (local12 < 0 || local14 > local77) {
					local14 = local77;
					local12 = local58;
				}
			}
		}
		return local12;
	}
}
