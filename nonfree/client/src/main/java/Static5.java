import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!tj;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!h;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Z")
	public static boolean aBoolean9 = true;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Z")
	public static boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public static int anInt50 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method36() {
		Static290.method5074((long) Static282.anInt3516, Static217.aClass105_5);
		if (Static129.anInt2569 != -1) {
			Static46.method938(Static129.anInt2569);
		}
		for (@Pc(18) int local18 = 0; local18 < Static344.anInt6649; local18++) {
			if (Static19.aBooleanArray1[local18]) {
				Static78.aBooleanArray7[local18] = true;
			}
			Static75.aBooleanArray6[local18] = Static19.aBooleanArray1[local18];
			Static19.aBooleanArray1[local18] = false;
		}
		Class1_Sub5_Sub19.lb = Static282.anInt3516;
		if (Static217.aClass105_5.method4259()) {
			Static282.aBoolean269 = true;
		}
		Static242.aClass163_16 = null;
		if (Static129.anInt2569 != -1) {
			Static344.anInt6649 = 0;
			Static87.method1404();
		}
		Static217.aClass105_5.method4233();
		Static187.method3327(Static304.anInt6088);
		Static41.anInt1126 = 0;
	}
}
