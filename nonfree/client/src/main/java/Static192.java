import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
	public static int anInt3648;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIIBII)V")
	public static void method3252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(25) Class299 local25 = Static309.aClass299ArrayArrayArray3[arg2][arg4][arg0];
		if (local25 == null) {
			local25 = new Class299(arg2);
		}
		if (arg3 == 1) {
			local25.aShort124 = (short) arg1;
			local25.aShort127 = (short) arg5;
		} else if (arg3 == 2) {
			local25.aShort125 = (short) arg5;
			local25.aShort126 = (short) arg1;
		}
		if (Static442.aBoolean562) {
			Static457.method6409();
		}
	}
}
