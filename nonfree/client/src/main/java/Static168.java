import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static168 {

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "Lclient!s;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "I")
	public static int anInt3965 = -1;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method2679() {
		Static121.aClass17_16.method509();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ai;I)I")
	public static int method2680(@OriginalArg(0) Class6 arg0) {
		if (Static54.anInt1438 == 1) {
			return 7;
		} else if (arg0.method103(Static55.aClass6_415)) {
			return 1;
		} else if (arg0.method103(Static102.aClass6_709)) {
			return 1;
		} else if (arg0.method103(Static146.aClass6_1198)) {
			return 2;
		} else if (arg0.method103(Static17.aClass6_694)) {
			return 2;
		} else if (arg0.method103(Static25.aClass6_181)) {
			return 3;
		} else if (arg0.method103(Static109.aClass6_1026)) {
			return 4;
		} else if (arg0.method103(Static115.aClass6_793)) {
			return 4;
		} else if (arg0.method103(Static167.aClass6_1169)) {
			return 5;
		} else if (arg0.method103(Static65.aClass6_477)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	public static void method2681() {
		aClass67_1 = null;
	}
}
