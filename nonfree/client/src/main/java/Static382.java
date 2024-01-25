import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static382 {

	@OriginalMember(owner = "client!nr", name = "w", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5610(@OriginalArg(1) Class133 arg0) {
		if (Static186.aBoolean231) {
			Static162.method2339(arg0);
		} else {
			Static485.method7191(arg0);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)Z")
	public static boolean method5614(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
