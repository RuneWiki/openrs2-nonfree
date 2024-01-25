import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	public static final int anInt2909 = 1406;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)Z")
	public static boolean method2524() {
		@Pc(8) Class3_Sub4 local8 = (Class3_Sub4) Static47.aClass138_7.aClass3_137.aClass3_244;
		if (local8 == null || Static47.aClass138_7.aClass3_137 == local8) {
			return false;
		} else {
			if (local8.anInt808 >= 2000) {
				local8.anInt808 -= 2000;
			}
			return local8.anInt808 == 1004;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(CI)Z")
	public static boolean method2526(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
