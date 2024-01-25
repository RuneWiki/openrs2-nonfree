import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
	public static int anInt3476 = 1;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
	public static int anInt3480 = 0;

	@OriginalMember(owner = "client!fr", name = "B", descriptor = "[I")
	public static final int[] anIntArray208 = new int[13];

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "(I)V")
	public static void method3081() {
		@Pc(5) Class166 local5 = Static3.aClass166_1;
		synchronized (Static3.aClass166_1) {
			Static3.aClass166_1.method4811();
		}
		local5 = Static553.aClass166_54;
		synchronized (Static553.aClass166_54) {
			Static553.aClass166_54.method4811();
		}
	}

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "(I)V")
	public static void method3082() {
		Static604.method8484();
		Static409.method6503(Static348.aClass6_Sub22_19.aClass15_Sub3_1.method1042() == 1);
		Static4.aClass190_6 = Static431.method6735(0, Static529.aClass112_6, 22050, Static271.aCanvas6);
		Static647.method8998(Static504.method8522((Class6_Sub3_Sub4) null));
		Static586.aClass190_7 = Static431.method6735(1, Static529.aClass112_6, 2048, Static271.aCanvas6);
		Static586.aClass190_7.method7490(Static196.aClass6_Sub3_Sub1_1);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(BI)Z")
	public static boolean method3083(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
