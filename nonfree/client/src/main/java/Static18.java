import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!b", name = "M", descriptor = "I")
	public static int anInt359 = 0;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "[Lclient!in;")
	public static final Class5_Sub1_Sub9[] aClass5_Sub1_Sub9Array1 = new Class5_Sub1_Sub9[14];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)Z")
	public static boolean method335(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 1009 || arg0 == 5 || arg0 == 23;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(ZB)V")
	public static void method338() {
		Static125.aClass5_Sub12_Sub2_3.method5125(10);
		for (@Pc(23) Class5_Sub18 local23 = (Class5_Sub18) Static198.aClass190_21.method5471(); local23 != null; local23 = (Class5_Sub18) Static198.aClass190_21.method5465()) {
			if (!local23.method6008()) {
				local23 = (Class5_Sub18) Static198.aClass190_21.method5471();
				if (local23 == null) {
					break;
				}
			}
			if (local23.anInt1866 == 0) {
				Static78.method1417(true, true, local23);
			}
		}
		if (Static208.aClass201_9 != null) {
			Static189.method3383(Static208.aClass201_9);
			Static208.aClass201_9 = null;
		}
	}
}
