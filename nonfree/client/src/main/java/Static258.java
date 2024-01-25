import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lclient!lf;")
	public static Class153 method3718(@OriginalArg(0) int arg0) {
		@Pc(8) Class153[] local8 = Static114.method1981();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			@Pc(24) Class153 local24 = local8[local18];
			if (arg0 == local24.anInt4248) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3719(@OriginalArg(1) String arg0) {
		Static407.aString68 = arg0;
		if (Static171.aClass159_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static171.aClass159_1.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static171.aClass159_1.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static165.method5193(Static220.method3314() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static464.method2258("document.cookie=\"" + local39 + "\"", Static171.aClass159_1.anApplet1);
		} catch (@Pc(88) Throwable local88) {
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)Z")
	public static boolean method3720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
	public static void method3721(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(13, arg1);
		local8.method5345();
		local8.anInt6806 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIBIII)V")
	public static void method3722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg0;
		@Pc(15) int local15 = arg2 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static33.method5364(arg3, arg1, arg4, arg0);
			}
		} else if (local10 == 0) {
			Static212.method3266(arg1, arg2, arg4, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(71) boolean local71 = local10 > local15;
			@Pc(75) int local75;
			@Pc(79) int local79;
			if (local71) {
				local75 = arg1;
				arg1 = arg0;
				local79 = arg2;
				arg2 = arg3;
				arg0 = local75;
				arg3 = local79;
			}
			if (arg2 < arg1) {
				local75 = arg1;
				arg1 = arg2;
				local79 = arg0;
				arg0 = arg3;
				arg2 = local75;
				arg3 = local79;
			}
			local75 = arg0;
			local79 = arg2 - arg1;
			@Pc(116) int local116 = arg3 - arg0;
			@Pc(121) int local121 = -(local79 >> 1);
			if (local116 < 0) {
				local116 = -local116;
			}
			@Pc(137) int local137 = arg0 >= arg3 ? -1 : 1;
			@Pc(141) int local141;
			if (local71) {
				for (local141 = arg1; local141 <= arg2; local141++) {
					Class10_Sub10_Sub1.lb[local141][local75] = arg4;
					local121 += local116;
					if (local121 > 0) {
						local75 += local137;
						local121 -= local79;
					}
				}
			} else {
				for (local141 = arg1; local141 <= arg2; local141++) {
					Class10_Sub10_Sub1.lb[local75][local141] = arg4;
					local121 += local116;
					if (local121 > 0) {
						local75 += local137;
						local121 -= local79;
					}
				}
			}
		}
	}
}
