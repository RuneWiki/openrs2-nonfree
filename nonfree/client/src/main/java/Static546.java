import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method7740(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg1.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg1.charAt(local10) == arg0) {
				local5++;
			}
		}
		return local5;
	}
}
