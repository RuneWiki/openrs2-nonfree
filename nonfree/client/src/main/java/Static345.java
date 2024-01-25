import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Lclient!jw;")
	public static Class180 aClass180_125;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "Z")
	public static boolean aBoolean411 = false;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I")
	public static int method5173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local12 * arg0;
		} else {
			return local12;
		}
	}
}
