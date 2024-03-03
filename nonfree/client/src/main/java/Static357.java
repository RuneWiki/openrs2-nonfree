import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 7)
	public static void method6380(@OriginalArg(0) String arg0) {
		Class59.aString17 = arg0;
		if (Static305.aClass152_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(20) String local20 = Static305.aClass152_5.anApplet1.getParameter("cookieprefix");
			@Pc(25) String local25 = Static305.aClass152_5.anApplet1.getParameter("cookiehost");
			@Pc(40) String local40 = local20 + "settings=" + arg0 + "; version=1; path=/; domain=" + local25;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static15.method393(Static190.method3686() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static391.method4630("document.cookie=\"" + local40 + "\"", Static305.aClass152_5.anApplet1);
		} catch (@Pc(89) Throwable local89) {
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIII)V", line = 45)
	public static void method6381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static24.method861(Class2_Sub40.anInt6819, arg2, Class2_Sub20.anInt2951);
		@Pc(17) int local17 = Static24.method861(Class2_Sub40.anInt6819, arg5, Class2_Sub20.anInt2951);
		@Pc(23) int local23 = Static24.method861(Class25_Sub1.anInt675, arg4, Class61.anInt1835);
		@Pc(29) int local29 = Static24.method861(Class25_Sub1.anInt675, arg0, Class61.anInt1835);
		@Pc(38) int local38 = Static24.method861(Class2_Sub40.anInt6819, arg2 + arg3, Class2_Sub20.anInt2951);
		@Pc(46) int local46 = Static24.method861(Class2_Sub40.anInt6819, arg5 - arg3, Class2_Sub20.anInt2951);
		for (@Pc(48) int local48 = local11; local48 < local38; local48++) {
			Static94.method2165(local29, Static332.anIntArrayArray58[local48], arg1, local23);
		}
		for (@Pc(72) int local72 = local17; local72 > local46; local72--) {
			Static94.method2165(local29, Static332.anIntArrayArray58[local72], arg1, local23);
		}
		@Pc(96) int local96 = Static24.method861(Class25_Sub1.anInt675, arg3 + arg4, Class61.anInt1835);
		@Pc(105) int local105 = Static24.method861(Class25_Sub1.anInt675, arg0 - arg3, Class61.anInt1835);
		for (@Pc(107) int local107 = local38; local107 <= local46; local107++) {
			@Pc(113) int[] local113 = Static332.anIntArrayArray58[local107];
			Static94.method2165(local96, local113, arg1, local23);
			Static94.method2165(local105, local113, arg6, local96);
			Static94.method2165(local29, local113, arg1, local105);
		}
	}
}
