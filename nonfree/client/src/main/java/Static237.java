import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4068(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static410.method5971(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
