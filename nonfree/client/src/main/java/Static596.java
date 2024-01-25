import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!uba", name = "E", descriptor = "D")
	public static double aDouble31;

	@OriginalMember(owner = "client!uba", name = "G", descriptor = "[I")
	public static final int[] anIntArray824 = new int[16];

	@OriginalMember(owner = "client!uba", name = "H", descriptor = "I")
	public static final int anInt9584 = Static673.method9349(1600);

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(JZ)V")
	public static void method8386(@OriginalArg(0) long arg0) {
		if (Static15.aClass164ArrayArrayArray5 != null) {
			if (Static428.anInt6834 == 1 || Static428.anInt6834 == 5) {
				Static375.method5440(arg0);
			} else if (Static428.anInt6834 == 4) {
				Static81.method1581(arg0);
			}
		}
		Static329.method5010((long) Static588.anInt9467, Static674.aClass13_22);
		if (Static110.anInt2265 != -1) {
			Static548.method7838(Static110.anInt2265);
		}
		for (@Pc(44) int local44 = 0; local44 < Static329.anInt5472; local44++) {
			if (Static200.aBooleanArray21[local44]) {
				Static454.aBooleanArray31[local44] = true;
			}
			Static157.aBooleanArray15[local44] = Static200.aBooleanArray21[local44];
			Static200.aBooleanArray21[local44] = false;
		}
		Static187.anInt3786 = Static588.anInt9467;
		Static655.method9119(-1, -1, (Class260) null);
		Static208.method3665(-1, (Class260) null, -1);
		if (Static110.anInt2265 != -1) {
			Static329.anInt5472 = 0;
			Static620.method8733();
		}
		Static674.aClass13_22.la();
		Static115.method2166(Static674.aClass13_22);
		@Pc(95) int local95 = Static292.method4567();
		if (local95 == -1) {
			local95 = Static21.anInt510;
		}
		if (local95 == -1) {
			local95 = Static508.anInt8219;
		}
		Static124.method2350(local95);
		@Pc(116) int local116 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314() << 8;
		Static506.method6784(Static619.anInt10674, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 + local116, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 - -local116);
		Static619.anInt10674 = 0;
	}
}
