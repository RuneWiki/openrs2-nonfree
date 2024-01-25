import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bia", name = "d", descriptor = "I")
	public static int anInt855;

	@OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
	public static int anInt853 = 0;

	@OriginalMember(owner = "client!bia", name = "e", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_2 = new Class118(21);

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V")
	public static void method742() {
		for (@Pc(7) int local7 = 0; local7 < Static392.aByteArrayArrayArray16.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static392.aByteArrayArrayArray16[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static392.aByteArrayArrayArray16[0][0].length; local15++) {
					Static392.aByteArrayArrayArray16[local7][local11][local15] = 0;
				}
			}
		}
	}
}
