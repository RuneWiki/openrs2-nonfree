import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!sia", name = "u", descriptor = "J")
	public static long aLong247;

	@OriginalMember(owner = "client!sia", name = "o", descriptor = "I")
	public static int anInt9311 = 0;

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(II)V")
	public static void method7697(@OriginalArg(1) int arg0) {
		if (arg0 == Static169.anInt3333) {
			return;
		}
		Static26.anInt462 = Static445.anInt6140 = Static625.anIntArray775[arg0];
		Static541.method8228();
		Static566.anIntArrayArray53 = new int[Static26.anInt462][Static445.anInt6140];
		Static155.anIntArrayArray17 = new int[Static26.anInt462][Static445.anInt6140];
		Static333.anIntArrayArrayArray4 = new int[4][Static26.anInt462 >> 3][Static445.anInt6140 >> 3];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static226.aClass226Array3[local36] = Static465.method6817(Static26.anInt462, Static445.anInt6140);
		}
		Static539.aByteArrayArrayArray17 = new byte[4][Static26.anInt462][Static445.anInt6140];
		Static335.method5254(Static26.anInt462, Static445.anInt6140);
		Static487.method7822(Static26.anInt462 >> 3, Static677.aClass137_47, Static445.anInt6140 >> 3);
		Static169.anInt3333 = arg0;
	}
}
