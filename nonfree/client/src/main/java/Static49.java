import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!jn;")
	public static Class176 aClass176_18;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method636(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
