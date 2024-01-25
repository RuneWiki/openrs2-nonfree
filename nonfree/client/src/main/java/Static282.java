import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!k", name = "f", descriptor = "Lclient!qn;")
	public static Class114 aClass114_2;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public static int anInt5926 = -1;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public static int anInt5928 = 0;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "[I")
	public static final int[] anIntArray264 = new int[2];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method4942(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (long) arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4944(@OriginalArg(1) String arg0) {
		if (Class28.aString7.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class28.aString7.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class28.aString7.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}
}
