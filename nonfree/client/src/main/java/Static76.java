import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dq", name = "H", descriptor = "Lclient!lt;")
	public static Class158 aClass158_17;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[200];

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "(I)V")
	public static void method1440() {
		for (@Pc(7) int local7 = 0; local7 < Static179.aByteArrayArrayArray3.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static179.aByteArrayArrayArray3[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static179.aByteArrayArrayArray3[0][0].length; local15++) {
					Static179.aByteArrayArrayArray3[local7][local11][local15] = 0;
				}
			}
		}
	}
}
