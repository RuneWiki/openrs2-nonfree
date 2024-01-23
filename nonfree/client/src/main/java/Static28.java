import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lclient!km;")
	public static Class94 method611(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = (Class94) Static173.aClass89_24.method2268((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static222.aClass168_161.method4058(Static299.method4563(arg0), Static283.method4312(arg0));
		local6 = new Class94();
		local6.anInt3362 = arg0;
		if (local28 != null) {
			local6.method2424(new Class1_Sub14(local28));
		}
		Static173.aClass89_24.method2272((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method612(@OriginalArg(0) String arg0) {
		Static210.aString313 = arg0;
		if (Static142.aClass112_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(23) String local23 = Static142.aClass112_2.anApplet1.getParameter("cookieprefix");
			@Pc(28) String local28 = Static142.aClass112_2.anApplet1.getParameter("cookiehost");
			@Pc(43) String local43 = local23 + "settings=" + arg0 + "; version=1; path=/; domain=" + local28;
			if (arg0.length() == 0) {
				local43 = local43 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local43 = local43 + "; Expires=" + Static105.method1736(Static258.method3967() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static317.method294(Static142.aClass112_2.anApplet1, "document.cookie=\"" + local43 + "\"");
		} catch (@Pc(94) Throwable local94) {
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Lclient!ob;")
	public static Class119 method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class119 local14 = local7.aClass119_1;
			local7.aClass119_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
	public static void method614(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static111.aClass186_7.method4570((long) arg0);
		if (local14 != null) {
			local14.method4767();
		}
	}
}
