import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hk", name = "W", descriptor = "Lclient!im;")
	public static Class118 aClass118_2;

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!hk", name = "bb", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_109 = new Class237(32, 10);

	@OriginalMember(owner = "client!hk", name = "Z", descriptor = "J")
	public static long aLong190 = 0L;

	@OriginalMember(owner = "client!hk", name = "ab", descriptor = "J")
	public static long aLong191 = 0L;

	@OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
	public static int anInt6274 = 0;

	@OriginalMember(owner = "client!hk", name = "db", descriptor = "Z")
	public static final boolean aBoolean405 = false;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5064(@OriginalArg(1) String arg0) {
		Static143.aString15 = arg0;
		if (Static119.aClass138_7.anApplet1 == null) {
			return;
		}
		try {
			@Pc(25) String local25 = Static119.aClass138_7.anApplet1.getParameter("cookieprefix");
			@Pc(30) String local30 = Static119.aClass138_7.anApplet1.getParameter("cookiehost");
			@Pc(45) String local45 = local25 + "settings=" + arg0 + "; version=1; path=/; domain=" + local30;
			if (arg0.length() == 0) {
				local45 = local45 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local45 = local45 + "; Expires=" + Static225.method3379(Static101.method1557() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static456.method695("document.cookie=\"" + local45 + "\"", Static119.aClass138_7.anApplet1);
		} catch (@Pc(97) Throwable local97) {
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZZIIILclient!vh;)V")
	public static void method5065(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class250 arg2) {
		Static32.aClass250_7 = arg2;
		Static37.anInt703 = 0;
		Static144.anInt2452 = 1;
		Static296.aBoolean145 = false;
		Static363.anInt6199 = 2;
		Static228.anInt4117 = arg1;
		Static348.anInt5981 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!ss;)Lclient!ss;")
	public static Class219 method5067(@OriginalArg(1) Class219 arg0) {
		@Pc(6) Class219 local6 = Static53.method922(arg0);
		if (local6 == null) {
			local6 = arg0.aClass219_17;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5068(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
