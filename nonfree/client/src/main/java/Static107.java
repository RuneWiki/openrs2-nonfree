import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dka", name = "A", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!dka", name = "P", descriptor = "I")
	public static int anInt2234 = 0;

	@OriginalMember(owner = "client!dka", name = "X", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(Z)V")
	public static void method1893() {
		if (Static430.anInt7691 == 3) {
			Static67.method1345(4);
		} else if (Static430.anInt7691 == 7) {
			Static67.method1345(8);
		} else if (Static430.anInt7691 == 10) {
			Static67.method1345(11);
		}
	}

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "(II)V")
	public static void method1894(@OriginalArg(1) int arg0) {
		@Pc(12) Class14_Sub15 local12 = (Class14_Sub15) Static205.aClass187_31.method4078((long) arg0);
		if (local12 != null) {
			local12.aClass63_Sub1_1.method1531();
			Static169.method2766(local12.aBoolean182, local12.anInt2174);
			local12.method9315();
		}
	}
}
