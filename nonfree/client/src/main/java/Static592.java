import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!wt", name = "G", descriptor = "F")
	public static float aFloat230;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
	public static int anInt10215 = -1;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public static void method8361() {
		if (Static113.aClass282_1 != null) {
			Static113.aClass282_1.method6816();
		}
		if (Static313.aThread4 == null) {
			return;
		}
		while (true) {
			try {
				Static313.aThread4.join();
				return;
			} catch (@Pc(22) InterruptedException local22) {
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
	public static void method8362() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static428.anInt8046; local9++) {
			for (@Pc(18) int local18 = 0; local18 < Static119.anInt2717; local18++) {
				if (Static203.method3443(local18, Static60.aClass53ArrayArrayArray1, true, local9, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
