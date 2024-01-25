import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public static int anInt219;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "Lclient!g;")
	public static Class83 aClass83_6;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "[I")
	public static final int[] anIntArray22 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)I")
	public static int method124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local15;
		} else {
			return local15;
		}
	}
}
