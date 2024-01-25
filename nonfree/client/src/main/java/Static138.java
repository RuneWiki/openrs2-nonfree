import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fga", name = "x", descriptor = "I")
	public static int anInt3230 = 0;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)I")
	public static int method2836(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local5 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local5 * arg1;
		} else {
			return local5;
		}
	}
}
