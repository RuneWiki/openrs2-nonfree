import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "I")
	public static int anInt9049;

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "Lclient!eq;")
	public static Class97 aClass97_135;

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_87 = new Class269(23, 2);

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(III)I")
	public static int method7608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local10 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local10;
		} else {
			return local10;
		}
	}
}
