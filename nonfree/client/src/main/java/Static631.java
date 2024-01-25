import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "[[Lclient!at;")
	public static Class24[][] aClass24ArrayArray2;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZB)Z")
	public static boolean method9158(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static186.aClass20_4.method7269();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static186.aClass20_4.method7313();
		} else if (!Static186.aClass20_4.method7274()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub2_1, arg0 ? 1 : 0);
			Static318.method5531();
			return true;
		}
	}
}
