import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!ln", name = "M", descriptor = "Lclient!tj;")
	public static Class193 aClass193_68;

	@OriginalMember(owner = "client!ln", name = "N", descriptor = "[I")
	public static final int[] anIntArray328 = new int[3];

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "J")
	public static long aLong115 = 0L;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(BII)Z")
	public static boolean method3551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class18 local12 = Static113.method2380(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local12.method420(arg0);
	}
}
