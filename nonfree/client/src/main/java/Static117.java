import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static117 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
	public static void method2166(@OriginalArg(1) int arg0) {
		if (-1 != arg0 && Static136.aBooleanArray55[arg0]) {
			Static265.aClass71_63.method1572(arg0);
			Static228.aClass155ArrayArray1[arg0] = null;
			Static136.aBooleanArray55[arg0] = false;
		}
	}
}
