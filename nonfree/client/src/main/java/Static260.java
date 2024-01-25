import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "[I")
	public static final int[] anIntArray694 = new int[13];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method8772(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static410.method6167(arg1, arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(CI)Z")
	public static boolean method8774(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8775(@OriginalArg(0) String arg0) {
		Static245.aString52 = arg0;
		if (Static180.anApplet6 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static180.anApplet6.getParameter("cookieprefix");
			@Pc(16) String local16 = Static180.anApplet6.getParameter("cookiehost");
			@Pc(31) String local31 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local31 = local31 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local31 = local31 + "; Expires=" + Static530.method7379(Static566.method7936() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static683.method5175("document.cookie=\"" + local31 + "\"", Static180.anApplet6);
		} catch (@Pc(83) Throwable local83) {
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
	public static void method8777() {
		Static367.aClass132_7.method7517(Static32.aClass207_6);
		Static367.aClass132_7.DA(Static484.anInt8272, Static62.anInt1176, Static627.anInt10198, Static654.anInt2125);
	}
}
