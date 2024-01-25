import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
	public static int anInt7473 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public static void method6004() {
		for (@Pc(3) int local3 = 0; local3 < Static195.aClass169ArrayArray2.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static195.aClass169ArrayArray2[local3].length; local7++) {
				Static195.aClass169ArrayArray2[local3][local7] = Static206.aClass169_2;
			}
		}
	}
}
