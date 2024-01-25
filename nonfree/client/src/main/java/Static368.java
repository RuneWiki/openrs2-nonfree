import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "Lclient!l;")
	public static Class11 aClass11_19;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array10;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_134 = new Class253(105, -1);

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
	public static final int[] anIntArray542 = new int[1];

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)I")
	public static int method4722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local15 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local15 * arg0;
		} else {
			return local15;
		}
	}
}
