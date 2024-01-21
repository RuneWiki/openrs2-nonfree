import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	public static int anInt697 = 2;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!sc;")
	private static Class66 aClass66_439 = Static106.method1849("Loading)3)3)3");

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
	public static int[] anIntArray102 = new int[1000];

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public static int anInt698 = 0;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!sc;")
	public static Class66 aClass66_440 = aClass66_439;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public static int anInt700 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method533() {
		if (Static123.aClass36_1 != null) {
			@Pc(15) Class36 local15 = Static123.aClass36_1;
			synchronized (Static123.aClass36_1) {
				Static123.aClass36_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method534() {
		aClass66_439 = null;
		aClass66_440 = null;
		anIntArray102 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)I")
	public static int method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static35.method637(arg0 - 1, arg1 - 1) + Static35.method637(arg0 - 1, arg1 - -1) + Static35.method637(arg0 + 1, arg1 + -1) + Static35.method637(arg0 + 1, arg1 - -1);
		@Pc(72) int local72 = Static35.method637(arg0, arg1 - 1) + Static35.method637(arg0, arg1 + 1) + Static35.method637(arg0 - 1, arg1) + Static35.method637(arg0 + 1, arg1);
		@Pc(77) int local77 = Static35.method637(arg0, arg1);
		return local77 / 4 + local72 / 8 + local42 / 16;
	}
}
