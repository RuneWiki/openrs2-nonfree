import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static142 {

	@OriginalMember(owner = "client!im", name = "D", descriptor = "I")
	public static int anInt2769;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(III)V", line = 30)
	public static void method2758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class226.aClass50_4 == Class2_Sub3_Sub12.aClass50_1) {
			if (Static299.method5483(false, -2, arg0, 0, 1, arg1, 1, 0)) {
				return;
			}
			Static299.method5483(false, -3, arg0, 0, 1, arg1, 1, 0);
		} else if (Static299.method5483(false, -3, arg0, 0, 1, arg1, 1, 0)) {
			return;
		} else {
			Static299.method5483(false, -2, arg0, 0, 1, arg1, 1, 0);
		}
	}
}
