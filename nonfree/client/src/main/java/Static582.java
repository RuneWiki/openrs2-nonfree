import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString104;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Z")
	public static boolean method8054(@OriginalArg(1) int arg0) {
		return arg0 == 46 || arg0 == 50 || arg0 == 48 || arg0 == 58 || arg0 == 5 || arg0 == 57 || arg0 == 59;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)J")
	public static synchronized long method8056() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static581.aLong258 > local10) {
			Static613.aLong266 += Static581.aLong258 - local10;
		}
		Static581.aLong258 = local10;
		return Static613.aLong266 + local10;
	}
}
