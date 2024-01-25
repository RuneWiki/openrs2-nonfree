import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Lclient!c;")
	public static Class33 aClass33_2;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "J")
	public static long aLong80;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_76 = new Class107(12, 5);

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_77 = new Class107(60, 2);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	public static void method2116() {
		Static57.anInt1398 = 0;
		Static26.anInt585 = 0;
		Static182.anInt3320 = 0;
		Static56.anInt1297 = 0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2117(@OriginalArg(0) String arg0) {
		Static164.aString23 = arg0;
		if (Static77.aClass180_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static77.aClass180_1.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static77.aClass180_1.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static4.method100(Static279.method4058() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static463.method2378("document.cookie=\"" + local34 + "\"", Static77.aClass180_1.anApplet1);
		} catch (@Pc(83) Throwable local83) {
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILclient!uq;)V")
	public static void method2118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class251 arg2) {
		@Pc(16) Class133 local16 = arg2.method5550(Static415.aClass39_11);
		if (local16 == null) {
			return;
		}
		Static415.aClass39_11.OA(arg0, arg1, arg2.anInt6687 + arg0, arg1 + arg2.anInt6677);
		if (Static264.anInt4692 >= 3) {
			Static415.aClass39_11.ca(-16777216, local16, arg0, arg1);
		} else {
			Static58.aClass143_10.method5722((float) arg2.anInt6687 / 2.0F + (float) arg0, (float) arg2.anInt6677 / 2.0F + (float) arg1, ((int) -Static142.aFloat89 & 0x3FFF) << 2, local16, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Z")
	public static boolean method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static393.method5260(arg1, arg0) || Static285.method4143(arg0, arg1);
	}
}
