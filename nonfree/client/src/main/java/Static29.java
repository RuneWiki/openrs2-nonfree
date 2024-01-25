import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_6 = new Class173(38, 7);

	@OriginalMember(owner = "client!baa", name = "k", descriptor = "[I")
	public static final int[] anIntArray20 = new int[8];

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method365(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + ((long) arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
	public static void method368() {
		if (Static204.aClass145_10 != Static296.aClass145_5) {
			try {
				Static604.method8248(Static430.aClient1, "tbrefresh");
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}
}
