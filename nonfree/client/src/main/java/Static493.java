import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!ria", name = "u", descriptor = "Lclient!hu;")
	public static Class44 aClass44_21;

	@OriginalMember(owner = "client!ria", name = "v", descriptor = "Lclient!on;")
	public static Class262 aClass262_7;

	@OriginalMember(owner = "client!ria", name = "D", descriptor = "I")
	public static int anInt8446 = 1;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IBLclient!aba;)Z")
	public static boolean method7266(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		Static630.aClass117_10.method7250(arg1.anIntArray5[arg0], arg1.anIntArray4[arg0], arg1.anIntArray3[arg0], Static511.anIntArray674);
		@Pc(22) int local22 = Static511.anIntArray674[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray1[arg0] = (short) (Static511.anIntArray674[0] * Static376.anInt6613 / local22 + Static378.anInt6647);
			arg1.aShortArray3[arg0] = (short) (Static153.anInt2441 + Static511.anIntArray674[1] * Static254.anInt4286 / local22);
			arg1.aShortArray2[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(II)V")
	public static void method7267(@OriginalArg(1) int arg0) {
		if (Static567.method8019(arg0)) {
			Static468.method6876(Static441.aClass357ArrayArray1[arg0], -1);
		}
	}
}
