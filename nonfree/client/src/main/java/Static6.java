import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!fb;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
	public static int anInt137;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_12 = new Class56(77, -1);

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method99(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + Static253.method3901(arg0.charAt(local17)) - local15;
		}
		return local15;
	}
}
