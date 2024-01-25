import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "Lclient!uk;")
	public static Class329 aClass329_4;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	public static void method6036() {
		for (@Pc(3) int local3 = 0; local3 < Static576.aByteArrayArrayArray21.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static576.aByteArrayArrayArray21[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static576.aByteArrayArrayArray21[0][0].length; local11++) {
					Static576.aByteArrayArrayArray21[local3][local7][local11] = 0;
				}
			}
		}
	}
}
