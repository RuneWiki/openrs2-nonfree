import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "I")
	public static int anInt911;

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
	public static int anInt914;

	@OriginalMember(owner = "client!be", name = "Ab", descriptor = "J")
	public static long aLong30;

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "Z")
	public static boolean aBoolean53;

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
	public static int anInt903 = -1;

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "Lclient!cp;")
	public static final Class60 aClass60_1 = new Class60();

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "Z")
	public static final boolean aBoolean52 = true;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZIBII)V")
	public static void method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static278.anInt5148 = arg3;
		Static362.anInt9575 = arg0;
		Static339.anInt6006 = arg4;
		Static99.anInt1769 = arg1;
		Static428.anInt7848 = arg5;
		if (arg2 && Static428.anInt7848 >= 100) {
			Static598.anInt10387 = Static362.anInt9575 * 512 + 256;
			Static108.anInt1987 = Static99.anInt1769 * 512 + 256;
			Static229.anInt4615 = Static10.method154(Static598.anInt10387, Static108.anInt1987, Static547.anInt9550) - Static278.anInt5148;
		}
		Static484.anInt8685 = 2;
		Static533.anInt9359 = -1;
		Static5.anInt83 = -1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method913(@OriginalArg(0) String arg0) {
		Static188.aString98 = arg0;
		if (Static637.anApplet2 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static637.anApplet2.getParameter("cookieprefix");
			@Pc(16) String local16 = Static637.anApplet2.getParameter("cookiehost");
			@Pc(35) String local35 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local16;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static483.method7666(Static99.method1701() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static675.method1326("document.cookie=\"" + local35 + "\"", Static637.anApplet2);
		} catch (@Pc(83) Throwable local83) {
		}
	}
}
