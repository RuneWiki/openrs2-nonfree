import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static199 {

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "Lclient!ic;")
	public static Class113 aClass113_64;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	public static void method2715(@OriginalArg(1) int arg0) {
		if (-1 != arg0 && Static332.aBooleanArray26[arg0]) {
			Static142.aClass113_47.method2261(arg0);
			Static369.aClass250ArrayArray5[arg0] = null;
			Static11.aClass250ArrayArray1[arg0] = null;
			Static332.aBooleanArray26[arg0] = false;
		}
	}
}
