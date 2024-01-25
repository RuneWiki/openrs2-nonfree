import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!maa", name = "n", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!maa", name = "q", descriptor = "I")
	public static int anInt5754;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBIBLclient!ip;)V")
	public static void method5149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class4_Sub1_Sub1_Sub2_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray405[0];
		@Pc(15) int local15 = arg2.anIntArray404[0];
		if (local10 < 0 || local10 >= Static271.anInt4910 || local15 < 0 || local15 >= Static613.anInt9909 || (arg1 < 0 || Static271.anInt4910 <= arg1 || arg0 < 0 || arg0 >= Static613.anInt9909)) {
			return;
		}
		@Pc(83) int local83 = Static637.method6718(0, 0, Static53.anIntArray63, -4, 0, true, arg0, Static553.aClass169Array1[arg2.aByte139], local10, Static489.anIntArray460, local15, 83, 0, arg1, arg2.method5932());
		if (local83 >= 1 && local83 <= 3) {
			for (@Pc(102) int local102 = 0; local102 < local83 - 1; local102++) {
				arg2.method4083(Static53.anIntArray63[local102], (byte) 2, Static489.anIntArray460[local102]);
			}
		}
	}
}
