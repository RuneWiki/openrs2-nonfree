import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!to", name = "g", descriptor = "Lclient!fg;")
	public static Class4_Sub18 aClass4_Sub18_3;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	public static int anInt8808 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZII)I")
	public static int method7247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg1;
		}
	}
}
