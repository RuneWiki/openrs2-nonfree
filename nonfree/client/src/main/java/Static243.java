import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Z")
	public static boolean aBoolean363;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_11 = new Class284(11, 14);

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
	public static int anInt4815 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
	public static void method4114() {
		for (@Pc(7) int local7 = 0; local7 < Static97.aByteArrayArrayArray19.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static97.aByteArrayArrayArray19[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static97.aByteArrayArrayArray19[0][0].length; local15++) {
					Static97.aByteArrayArrayArray19[local7][local11][local15] = 0;
				}
			}
		}
	}
}
