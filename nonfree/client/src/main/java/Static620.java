import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!waa", name = "m", descriptor = "Lclient!gea;")
	public static final Class117 aClass117_4 = new Class117(64);

	@OriginalMember(owner = "client!waa", name = "t", descriptor = "I")
	public static int anInt10443 = 0;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(III)I")
	public static int method8486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local12;
		} else {
			return local12;
		}
	}
}
