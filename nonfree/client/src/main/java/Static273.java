import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_103 = new Class211(7, -2);

	@OriginalMember(owner = "client!np", name = "i", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_130 = new Class102(32, 7);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3660(@OriginalArg(0) String arg0) {
		Static182.aString95 = arg0;
		if (Static79.aClass183_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static79.aClass183_2.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static79.aClass183_2.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static233.method5401(Static110.method1702() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static469.method4193(Static79.aClass183_2.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3663(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static284.method3771(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static291.anInt4793; local25++) {
			@Pc(31) String local31 = Static200.aStringArray18[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static284.method3771(local31);
			if (local31 != null && local31.equals(local20)) {
				Static291.anInt4793--;
				for (@Pc(55) int local55 = local25; local55 < Static291.anInt4793; local55++) {
					Static200.aStringArray18[local55] = Static200.aStringArray18[local55 + 1];
					Static26.aStringArray4[local55] = Static26.aStringArray4[local55 + 1];
					Static417.aStringArray39[local55] = Static417.aStringArray39[local55 + 1];
					Static247.aStringArray23[local55] = Static247.aStringArray23[local55 + 1];
					Static2.aBooleanArray1[local55] = Static2.aBooleanArray1[local55 + 1];
				}
				Static336.anInt5710 = Static234.anInt3754;
				Static29.method451(Static74.aClass102_53);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static385.method4939(arg0));
				Static456.aClass2_Sub13_Sub2_2.method3590(arg0);
				return;
			}
		}
	}
}
