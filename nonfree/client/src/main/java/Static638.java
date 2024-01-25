import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method8924(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			local10 = Static133.method1920(arg0.charAt(local18)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
