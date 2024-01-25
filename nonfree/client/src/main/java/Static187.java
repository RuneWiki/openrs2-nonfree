import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
	public static int anInt3065 = 0;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	public static int anInt3066 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)V")
	public static void method2677(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static690.anInt10620 = arg1;
		Static560.aClass221_3 = Static487.aClass221_2;
		Static25.anInt319 = 2;
		Static574.method7981(false, false, arg0, arg2);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZB)V")
	public static void method2679(@OriginalArg(0) boolean arg0) {
		Static517.aClass86_8.method7032(Static614.aClass145_14.method9716());
		@Pc(10) int[] local10 = Static614.aClass145_14.Y();
		Static84.anInt1419 = local10[0];
		Static7.anInt84 = local10[3];
		Static681.anInt10508 = local10[2];
		Static56.anInt979 = local10[1];
		if (arg0) {
			Static614.aClass145_14.DA(Static8.anInt98, Static242.anInt8798, Static290.anInt4986, Static133.anInt2222);
			Static697.method9376(Static290.aDouble28);
		} else {
			Static614.aClass145_14.DA(Static478.anInt7690, Static595.anInt7807, Static491.anInt7889, Static236.anInt3726);
			Static697.method9376(Static12.aDouble1);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2680(@OriginalArg(0) String arg0) {
		Static601.aString103 = arg0;
		if (Static214.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static214.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static214.anApplet1.getParameter("cookiehost");
			@Pc(40) String local40 = local15 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local40 = local40 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local40 = local40 + "; Expires=" + Static354.method5090(Static567.method7863() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static736.method7133("document.cookie=\"" + local40 + "\"", Static214.anApplet1);
		} catch (@Pc(106) Throwable local106) {
		}
	}
}
