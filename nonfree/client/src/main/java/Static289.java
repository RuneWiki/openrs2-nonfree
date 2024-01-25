import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public static void method7945() {
		Static636.aClass299_1 = new Class299(8);
		Static376.anInt6647 = 0;
		for (@Pc(15) Class23_Sub5 local15 = (Class23_Sub5) Static663.aClass105_12.method2444(); local15 != null; local15 = (Class23_Sub5) Static663.aClass105_12.method2448()) {
			local15.method2594();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I")
	public static int method7950(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local10 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local10 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local10 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return arg0 + local10;
	}
}
