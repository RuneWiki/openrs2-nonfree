import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public static int anInt4555;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	public static int anInt4558;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	public static int anInt4557 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZBI)V")
	public static void method3513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static435.aLong217 = 0L;
		@Pc(8) int local8 = Static86.method1531();
		if (arg1 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static30.aClass106_3.method5925()) {
			arg2 = true;
		}
		Static383.method5306(arg2, arg1, arg0, local8, arg3);
	}
}
