import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	public static int anInt3435;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	public static int anInt3430 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public static void method2818() {
		@Pc(10) Class26 local10 = Static154.aClass26_25;
		synchronized (Static154.aClass26_25) {
			Static154.aClass26_25.method329(5);
		}
		local10 = Static261.aClass26_47;
		synchronized (Static261.aClass26_47) {
			Static261.aClass26_47.method329(5);
		}
		local10 = Static174.aClass26_31;
		synchronized (Static174.aClass26_31) {
			Static174.aClass26_31.method329(5);
		}
		local10 = Static83.aClass26_10;
		synchronized (Static83.aClass26_10) {
			Static83.aClass26_10.method329(5);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)I")
	public static int method2819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}
}
