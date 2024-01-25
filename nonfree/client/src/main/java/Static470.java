import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Lclient!ha;")
	public static Class82 aClass82_13;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6941(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
	public static void method6946() {
		Static454.anInt7699 = 0;
		Static225.anInt4563 = 0;
		Static230.anInt4638 = 0;
		Static483.anInt8232 = 0;
	}
}
