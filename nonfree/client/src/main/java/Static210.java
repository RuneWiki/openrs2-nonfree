import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!lm;")
	public static Class134 aClass134_102;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	public static int anInt4430;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "J")
	public static long aLong126 = 0L;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	public static void method3797() {
		for (@Pc(3) int local3 = 0; local3 < Static291.aByteArrayArrayArray11.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static291.aByteArrayArrayArray11[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static291.aByteArrayArrayArray11[0][0].length; local11++) {
					Static291.aByteArrayArrayArray11[local3][local7][local11] = 0;
				}
			}
		}
	}
}
