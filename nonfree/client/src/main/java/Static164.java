import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	public static void method2700() {
		for (@Pc(7) int local7 = 0; local7 < Static85.aByteArrayArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static85.aByteArrayArrayArray1[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static85.aByteArrayArrayArray1[0][0].length; local15++) {
					Static85.aByteArrayArrayArray1[local7][local11][local15] = 0;
				}
			}
		}
	}
}
