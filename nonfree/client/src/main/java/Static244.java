import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "F")
	public static float aFloat136;

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "[I")
	public static final int[] anIntArray303 = new int[5];

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3779(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + Static396.method4002(arg0.charAt(local17)) - local15;
		}
		return local15;
	}
}
