import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
	public static int anInt7851 = 0;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "Lclient!kp;")
	public static Class196 aClass196_8 = null;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I")
	public static int method6458() {
		return Static232.anInt4323++;
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)V")
	public static void method6460() {
		Static84.aClass162_12.method3518();
		Static262.aClass162_22.method3518();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZB)I")
	public static int method6461(@OriginalArg(0) boolean arg0) {
		if (Static510.anIntArray605 == null) {
			return 0;
		} else if (arg0 || Static231.aClass40Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static510.anIntArray605.length; local22++) {
				@Pc(28) int local28 = Static510.anIntArray605[local22];
				if (Static290.aClass259_87.method5988(local28)) {
					local20++;
				}
				if (Static312.aClass259_97.method5988(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static510.anIntArray605.length * 2;
		}
	}
}
