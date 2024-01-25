import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!ra;")
	public static Class170 aClass170_117;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	public static int anInt6205;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Z")
	public static boolean method5513(@OriginalArg(1) int arg0) {
		if (arg0 == 50 || arg0 == 10 || arg0 == 16 || arg0 == 35 || arg0 == 14) {
			return true;
		} else if (arg0 == 43 || arg0 == 18 || arg0 == 1007) {
			return true;
		} else if (arg0 == 26 || arg0 == 34 || arg0 == 22 || arg0 == 49 || arg0 == 44) {
			return true;
		} else {
			return arg0 == 47 || arg0 == 60 || arg0 == 1012 || arg0 == 41;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
	public static void method5514(@OriginalArg(0) int arg0) {
		Static233.anInt4553 = arg0;
		@Pc(7) Class66 local7 = Static162.aClass66_58;
		synchronized (Static162.aClass66_58) {
			Static162.aClass66_58.method1933();
		}
		local7 = Static177.aClass66_38;
		synchronized (Static177.aClass66_38) {
			Static177.aClass66_38.method1933();
		}
	}
}
