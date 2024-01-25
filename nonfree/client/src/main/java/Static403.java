import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!np", name = "t", descriptor = "I")
	public static int anInt7771 = 0;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
	public static int method6564() {
		return Static402.anInt7159;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method6566(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = arg0.length();
		@Pc(14) long local14 = 0L;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			local14 = (local14 << 5) + (long) arg0.charAt(local16) - local14;
		}
		return local14;
	}
}
