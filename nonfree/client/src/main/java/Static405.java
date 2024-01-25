import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
	public static int anInt6657;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_113 = new Class349(60, -1);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILclient!ps;)V")
	public static void method5516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class273 arg2) {
		if (Static355.aBoolean473) {
			@Pc(14) Class57 local14 = Static401.anInt6603 == -1 ? null : Static537.aClass191_2.method3971(Static401.anInt6603);
			if (Static70.method1164(arg2).method2768() && (Static277.anInt4787 & 0x20) != 0 && (local14 == null || arg2.method5642(Static401.anInt6603, local14.anInt1160) != local14.anInt1160)) {
				Static438.method5750(Static434.aString105, arg2.anInt6810, 46, 0L, arg2.anInt6800, Static196.aString39 + " -> " + arg2.aString103, false, arg2.anInt6805, Static251.anInt4193, true);
			}
		}
		@Pc(79) String local79;
		for (@Pc(72) int local72 = 9; local72 >= 5; local72--) {
			local79 = Static347.method5020(arg2, local72);
			if (local79 != null) {
				Static438.method5750(local79, arg2.anInt6810, 1008, (long) (local72 + 1), arg2.anInt6800, arg2.aString103, false, arg2.anInt6805, Static448.method1150(local72, arg2), true);
			}
		}
		local79 = Static522.method6727(arg2);
		if (local79 != null) {
			Static438.method5750(local79, arg2.anInt6810, 2, 0L, arg2.anInt6800, arg2.aString103, false, arg2.anInt6805, arg2.anInt6818, true);
		}
		for (@Pc(142) int local142 = 4; local142 >= 0; local142--) {
			@Pc(149) String local149 = Static347.method5020(arg2, local142);
			if (local149 != null) {
				Static438.method5750(local149, arg2.anInt6810, 15, (long) (local142 + 1), arg2.anInt6800, arg2.aString103, false, arg2.anInt6805, Static448.method1150(local142, arg2), true);
			}
		}
		if (!Static70.method1164(arg2).method2766()) {
			return;
		}
		if (arg2.aString100 == null) {
			Static438.method5750(Static229.aClass159_11.method2776(Static261.anInt4297), arg2.anInt6810, 23, 0L, arg2.anInt6800, "", false, arg2.anInt6805, -1, true);
		} else {
			Static438.method5750(arg2.aString100, arg2.anInt6810, 23, 0L, arg2.anInt6800, "", false, arg2.anInt6805, -1, true);
		}
	}
}
