import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static117 {

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	public static int anInt2664;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "Lclient!wo;")
	public static Class216 aClass216_36;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
	public static int anInt2675 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BZZ)V")
	public static void method2484(@OriginalArg(2) boolean arg0) {
		if (arg0) {
			Static213.anInt4559--;
			if (Static213.anInt4559 == 0) {
				Static177.anIntArray371 = null;
			}
		}
		Static103.anInt2460--;
		if (Static103.anInt2460 == 0) {
			Static102.anIntArray226 = null;
		}
	}
}
