import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!sea", name = "P", descriptor = "I")
	public static int anInt9047;

	@OriginalMember(owner = "client!sea", name = "L", descriptor = "Z")
	public static boolean aBoolean627 = false;

	@OriginalMember(owner = "client!sea", name = "O", descriptor = "Z")
	public static boolean aBoolean628 = false;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(CBLjava/lang/String;)I")
	public static int method6937(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1.charAt(local12) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
