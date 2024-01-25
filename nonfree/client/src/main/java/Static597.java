import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_140 = new Class218(32, 20);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
	public static int method8172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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
