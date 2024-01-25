import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
	public static int anInt9701;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIBIII)V")
	public static void method7610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(15) Class25_Sub4 local15 = (Class25_Sub4) Static6.aClass269_1.method5974(); local15 != null; local15 = (Class25_Sub4) Static6.aClass269_1.method5979()) {
			if (Static397.anInt6998 >= local15.anInt2714) {
				local15.method6959();
			} else {
				Static320.method4731(local15.anInt2720 * 2, arg3 >> 1, (local15.anInt2715 << 9) + 256, (local15.anInt2718 << 9) - -256, local15.anInt2722, arg1 >> 1);
				Static465.aClass63_10.method6878(Static468.anIntArray481[1] + arg2, 0, local15.anInt2717 | 0xFF000000, local15.aString62, arg0 + Static468.anIntArray481[0]);
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
	public static void method7611() {
		if (Static122.aClass309_3 == null) {
			return;
		}
		if (Static122.aClass309_3.anInt8650 == 1) {
			Static122.aClass309_3 = null;
			return;
		}
		if (Static122.aClass309_3.anInt8650 == 2) {
			Static56.method1376(Static521.aClass168_16, Static505.aString234, 2);
			Static122.aClass309_3 = null;
			return;
		}
	}
}
