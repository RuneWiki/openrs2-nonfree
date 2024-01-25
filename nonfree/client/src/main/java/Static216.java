import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!pp;")
	public static Class166 aClass166_2;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	public static int anInt4585;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public static void method4126() {
		Static329.aClass87_59.method2473(5);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	public static void method4128() {
		if (Static89.anInt2231 == -1) {
			return;
		}
		@Pc(19) int local19 = Static222.aClass84_1.method5408();
		@Pc(23) int local23 = Static222.aClass84_1.method5406();
		if (Static305.aClass1_Sub21_1 != null) {
			local19 = Static305.aClass1_Sub21_1.method2704();
			local23 = Static305.aClass1_Sub21_1.method2703();
		}
		Static227.method4237(0, Static194.anInt4145, 0, local23, 0, Static89.anInt2231, local19, Static271.anInt5530, 0);
		if (Static72.aClass12_4 != null) {
			Static93.method2018(local23, local19);
		}
	}
}
