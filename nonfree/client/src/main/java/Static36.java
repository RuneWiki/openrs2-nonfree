import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!br", name = "K", descriptor = "I")
	public static int anInt706 = 0;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(III)I")
	public static int method559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = arg0 & 0x1 | local15 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local15;
	}

	@OriginalMember(owner = "client!br", name = "h", descriptor = "(I)V")
	public static void method560() {
		Static137.aClass117ArrayArray1 = new Class117[Static383.aClass230_87.method4969()][];
		Static286.aClass117ArrayArray2 = new Class117[Static383.aClass230_87.method4969()][];
		Static277.aBooleanArray25 = new boolean[Static383.aClass230_87.method4969()];
	}
}
