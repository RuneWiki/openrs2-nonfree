import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array21;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Z")
	public static boolean aBoolean497 = false;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Z")
	public static boolean aBoolean498 = true;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public static void method4488(@OriginalArg(0) int arg0) {
		Static96.anIntArray504 = new int[arg0];
		Static185.anIntArray364 = new int[arg0];
		Static137.anIntArray266 = new int[arg0];
		Static352.anIntArray531 = new int[arg0];
		Static173.anIntArray346 = new int[arg0];
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)I")
	public static int method4489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Lclient!os;")
	public static Class17_Sub2 method4491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class17_Sub2 local14 = local7.aClass17_Sub2_1;
			local7.aClass17_Sub2_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4493(@OriginalArg(1) String arg0) {
		Static158.aString33 = arg0;
		if (Static15.aClass143_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static15.aClass143_1.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static15.aClass143_1.anApplet1.getParameter("cookiehost");
			@Pc(40) String local40 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static15.method406(Static162.method3252() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static359.method1278("document.cookie=\"" + local40 + "\"", Static15.aClass143_1.anApplet1);
		} catch (@Pc(92) Throwable local92) {
		}
	}
}
