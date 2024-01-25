import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public static int anInt4516;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!eaa;")
	public static Class76 aClass76_3;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public static int anInt4517 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method3789(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(17) long local17 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local17 = (long) arg0.charAt(local19) + (local17 << 5) - local17;
		}
		return local17;
	}
}
