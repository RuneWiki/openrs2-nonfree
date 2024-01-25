import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)V")
	public static void method1258(@OriginalArg(1) int arg0) {
		Static239.aLong222 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	public static void method1259() {
		@Pc(9) int[] local9 = new int[Static521.aClass273_2.anInt8075];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static521.aClass273_2.anInt8075; local13++) {
			@Pc(20) Class242 local20 = Static521.aClass273_2.method6712(local13);
			if (local20.anInt7088 >= 0 || local20.anInt7128 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static56.anIntArray34 = new int[local11];
		for (@Pc(51) int local51 = 0; local51 < local11; local51++) {
			Static56.anIntArray34[local51] = local9[local51];
		}
	}
}
