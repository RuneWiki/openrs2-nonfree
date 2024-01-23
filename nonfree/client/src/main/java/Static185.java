import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
	public static int[] anIntArray313 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "[Lclient!kj;")
	public static Class76[] aClass76Array1 = new Class76[50];

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public static boolean method3140(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		@Pc(4) int local4 = arg0.length();
		@Pc(7) int local7 = arg1.length();
		if (local7 > local4) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < local7; local22++) {
			@Pc(28) char local28 = arg0.charAt(local22);
			@Pc(32) char local32 = arg1.charAt(local22);
			if (local28 != local32 && Character.toLowerCase(local28) != Character.toLowerCase(local32) && Character.toUpperCase(local28) != Character.toUpperCase(local32)) {
				return false;
			}
		}
		return true;
	}
}
