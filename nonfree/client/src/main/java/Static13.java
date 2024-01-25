import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Z")
	public static boolean aBoolean9;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Z")
	public static boolean method257(@OriginalArg(1) int arg0) {
		if (arg0 == 46 || arg0 == 30 || arg0 == 50 || arg0 == 11 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 59 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjava/lang/String;ZZLclient!laa;)V")
	public static void method258(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class198 arg3) {
		if (!arg0) {
			Static388.method5588(arg3, arg1, 3);
			return;
		}
		@Pc(14) String local14;
		if (Static285.aString59.startsWith("win") && arg3.aBoolean401) {
			local14 = null;
			if (Static433.anApplet2 != null) {
				local14 = Static433.anApplet2.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(32) Class191 local32 = Static388.method5588(arg3, arg1, 0);
				Static110.aClass191_2 = local32;
				Static509.aClass198_5 = arg3;
				Static552.aString72 = arg1;
				return;
			}
		}
		if (Static285.aString59.startsWith("mac")) {
			local14 = null;
			if (Static433.anApplet2 != null) {
				local14 = Static433.anApplet2.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg2) {
				Static388.method5588(arg3, arg1, 1);
				return;
			}
		}
		Static388.method5588(arg3, arg1, 2);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(ZZ)Z")
	public static boolean method259(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method260(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
