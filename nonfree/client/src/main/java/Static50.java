import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static50 {

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
	public static int anInt903;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	public static void method863() {
		Static454.method5910();
		Static496.aClass17_3 = null;
		Static15.aClass162_1 = null;
		Static576.aClass17_4 = null;
		Static198.aClass17_2 = null;
		Static268.aClass75ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
	public static void method864() {
		Static152.method2100();
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method865(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZBZ)V")
	public static void method866(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static588.anInt9536++;
			Static197.method2481();
		}
		if (arg0) {
			Static120.anInt2083++;
			Static80.method1227();
		}
	}
}
