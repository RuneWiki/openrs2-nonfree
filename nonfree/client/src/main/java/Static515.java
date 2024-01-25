import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "Lclient!em;")
	public static final Class83 aClass83_189 = new Class83(55, 4);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7170(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + arg0.charAt(local17) - local15;
		}
		return local15;
	}
}
