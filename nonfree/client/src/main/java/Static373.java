import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "Lclient!sw;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
	public static int anInt5588 = 0;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZZI)V")
	public static void method4918(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static296.anInt4681--;
			if (Static296.anInt4681 == 0) {
				Static84.anIntArray114 = null;
			}
		}
		if (arg0) {
			Static242.anInt4001--;
			if (Static242.anInt4001 == 0) {
				Static411.anIntArray448 = null;
			}
		}
	}
}
