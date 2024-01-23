import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public static int anInt4882;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!ub;")
	public static Class163 aClass163_10;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString170 = "Loaded fonts";

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public static int anInt4885 = -1;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString171 = "wave2:";

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)I")
	public static int method3664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method3665(@OriginalArg(0) String arg0) {
		return Static248.method3691(arg0);
	}
}
