import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!oca;")
	public static Class234 aClass234_1;

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public static int anInt7934 = 0;

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
	public static int anInt7935 = 0;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	public static final int anInt7936 = 0;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
	public static int anInt7938 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZI)I")
	public static int method6646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) Class6_Sub15 local10 = Static519.method7596(arg0, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray174.length; local23++) {
				if (arg1 == local10.anIntArray173[local23]) {
					local21 += local10.anIntArray174[local23];
				}
			}
			return local21;
		}
	}
}
