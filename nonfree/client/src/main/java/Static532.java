import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
	public static boolean aBoolean702 = false;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "S")
	public static short aShort127 = 1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)I")
	public static int method8102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class200_Sub1.anIntArray576[arg3 * 8192 / arg2] >> 1;
		return (arg1 * local20 >> 16) + ((65536 - local20) * arg0 >> 16);
	}
}
