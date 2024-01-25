import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "J")
	public static long aLong218 = 0L;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	public static void method5915() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static118.anInt2527; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static549.anInt9482; local17++) {
				if (Static519.method7385(local11, true, local13, Static279.aClass290ArrayArrayArray7, local17)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I")
	public static int method5916() {
		if (Static228.aBoolean342) {
			return 6;
		} else if (Static495.aClass3_Sub11_4 == null) {
			return 0;
		} else {
			@Pc(22) int local22 = Static495.aClass3_Sub11_4.anInt1419;
			if (Static83.method1710(local22)) {
				return 1;
			} else if (Static95.method1856(local22)) {
				return 2;
			} else if (Static359.method5619(local22)) {
				return 3;
			} else if (Static153.method2639(local22)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
