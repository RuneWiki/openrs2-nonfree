import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
	public static int anInt369 = -1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!tj;)V")
	public static void method314(@OriginalArg(1) Class193 arg0) {
		Static259.aClass193_91 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(CBLjava/lang/String;)I")
	public static int method316(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}
}
