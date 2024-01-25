import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "Lclient!oaa;")
	public static Class249 aClass249_2;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public static void method4787(@OriginalArg(1) int arg0) {
		Static187.method7139();
		@Pc(15) int local15 = Static572.aClass55_1.method1098(arg0).anInt649;
		if (local15 == 0) {
			return;
		}
		@Pc(26) int local26 = Static426.aClass160_1.anIntArray276[arg0];
		if (local15 == 6) {
			Static276.anInt4780 = local26;
		}
		if (local15 == 5) {
			Static304.anInt5055 = local26;
		}
	}
}
