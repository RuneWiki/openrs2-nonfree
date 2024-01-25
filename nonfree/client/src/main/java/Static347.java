import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rg", name = "I", descriptor = "Lclient!bi;")
	public static Class23 aClass23_6;

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_37 = new Class243();

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "[I")
	public static final int[] anIntArray389 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;B)I")
	public static int method4609(@OriginalArg(1) String arg0) {
		return Static354.method4718(arg0, 16);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method4610(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.length();
		@Pc(16) long local16 = 0L;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			local16 = (local16 << 5) + (long) arg0.charAt(local18) - local16;
		}
		return local16;
	}
}
