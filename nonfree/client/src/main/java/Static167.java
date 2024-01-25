import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
	public static int anInt3453 = 0;

	@OriginalMember(owner = "client!gk", name = "R", descriptor = "Lclient!n;")
	public static Class225 aClass225_16 = null;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public static void method3084() {
		for (@Pc(3) int local3 = 0; local3 < Static442.aClass112ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static442.aClass112ArrayArray1[local3].length; local7++) {
				Static442.aClass112ArrayArray1[local3][local7] = Static211.aClass112_5;
			}
		}
	}
}
