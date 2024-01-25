import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "Lclient!gw;")
	public static Class86 aClass86_9;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
	public static void method7726() {
		Static581.aClass273ArrayArray2 = new Class273[Static240.aClass254_166.method6094()][];
		Static39.aClass273ArrayArray1 = new Class273[Static240.aClass254_166.method6094()][];
		Static39.aBooleanArray5 = new boolean[Static240.aClass254_166.method6094()];
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method7727(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (3816 != 3816) {
			aClass86_9 = null;
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static289.aClass191_32.method4067(Static414.anInt9485) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static289.aClass191_34.method4067(Static414.anInt9485) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
