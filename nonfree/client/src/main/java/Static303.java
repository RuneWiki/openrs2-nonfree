import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_36 = new Class264(4);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjava/lang/String;C)I")
	public static int method4445(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local7++;
			}
		}
		return local7;
	}
}
