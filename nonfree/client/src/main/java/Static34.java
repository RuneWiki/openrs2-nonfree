import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "D")
	public static double aDouble3;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
	public static int anInt568;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
	public static void method535() {
		@Pc(14) Class5_Sub48 local14 = Static16.method232(Static635.aClass46_109, Static276.aClass251_2);
		Static277.method4436(local14);
		for (@Pc(22) Class5_Sub27 local22 = (Class5_Sub27) Static269.aClass273_11.method6577(); local22 != null; local22 = (Class5_Sub27) Static269.aClass273_11.method6589()) {
			if (!local22.method9048()) {
				local22 = (Class5_Sub27) Static269.aClass273_11.method6577();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt4272 == 0) {
				Static609.method8688(true, local22, true);
			}
		}
		if (Static69.aClass295_5 != null) {
			Static465.method6901(Static69.aClass295_5);
			Static69.aClass295_5 = null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
	public static void method536(@OriginalArg(1) int arg0) {
		@Pc(14) Class5_Sub5_Sub21 local14 = Static101.method1629(12, arg0);
		local14.method8961();
	}
}
