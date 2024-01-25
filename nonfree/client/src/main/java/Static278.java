import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_66 = new Class208(69, 4);

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "[J")
	public static final long[] aLongArray12 = new long[32];

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(CBLjava/lang/String;)I")
	public static int method4025(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local12++;
			}
		}
		return local12;
	}
}
