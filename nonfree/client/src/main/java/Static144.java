import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!eha", name = "l", descriptor = "I")
	public static int anInt2744;

	@OriginalMember(owner = "client!eha", name = "g", descriptor = "I")
	public static int anInt2745;

	@OriginalMember(owner = "client!eha", name = "h", descriptor = "F")
	public static float aFloat56 = 0.0F;

	@OriginalMember(owner = "client!eha", name = "j", descriptor = "[I")
	public static final int[] anIntArray132 = new int[13];

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(CBLjava/lang/String;)I")
	public static int method2390(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(18) int local18 = 0; local18 < local10; local18++) {
			if (arg1.charAt(local18) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
