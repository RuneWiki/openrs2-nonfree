import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static147 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)Z")
	public static boolean method2181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static314.method4330(arg1, arg0) || Static105.method1658(arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method2182(@OriginalArg(1) Class30 arg0) {
		if (Static60.aBoolean103) {
			Static31.method581(arg0);
		} else {
			Static383.method5208(arg0);
		}
	}
}
