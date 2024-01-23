import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!hc;")
	public static Class51 aClass51_56;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
	public static int anInt3818 = 0;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString244 = "Face here";

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZII)I")
	public static int method2832(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}
}
