import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array15;

	@OriginalMember(owner = "client!sk", name = "rb", descriptor = "I")
	public static int anInt5554 = 0;

	@OriginalMember(owner = "client!sk", name = "wb", descriptor = "J")
	public static long aLong180 = 0L;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4916(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
