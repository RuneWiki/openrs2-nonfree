import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "Lclient!ek;")
	public static final Class67 aClass67_18 = new Class67(512);

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "Lclient!up;")
	public static final Class250 aClass250_12 = new Class250(9, 18);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method2253(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0.charAt(local12) == arg1) {
				local7++;
			}
		}
		return local7;
	}
}
