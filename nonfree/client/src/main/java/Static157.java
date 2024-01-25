import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public static int anInt3414 = -1;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public static int anInt3415 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3074(@OriginalArg(1) String arg0) {
		Static366.aString103 = arg0;
		if (Static375.aClass71_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static375.aClass71_3.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static375.aClass71_3.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static494.method7348(Static76.method1679() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static549.method684("document.cookie=\"" + local39 + "\"", Static375.aClass71_3.anApplet1);
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method3075(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg2[local12 + arg0] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(41) char local41 = Static97.aCharArray1[local22 - 128];
					if (local41 == '\u0000') {
						local41 = '?';
					}
					local22 = local41;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}
}
