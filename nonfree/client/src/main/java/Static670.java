import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
	public static int anInt10763;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method8954(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			local13 = (local13 << 5) + Static651.method8726(arg0.charAt(local15)) - local13;
		}
		return local13;
	}
}
