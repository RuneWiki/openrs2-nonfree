import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method3565(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static64.anInt1206 = -1;
		Static140.anInt3152 = 1;
		Static108.method2316(arg1, false, arg0);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V")
	public static void method3567() {
		Static99.aClass223_12.method4932();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)Z")
	public static boolean method3569(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V")
	public static void method3574() {
		@Pc(5) Class223 local5 = Static476.aClass223_57;
		synchronized (Static476.aClass223_57) {
			Static476.aClass223_57.method4941();
		}
	}
}
