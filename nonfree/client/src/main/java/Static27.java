import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
	public static int anInt421;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "F")
	public static float aFloat4 = 1024.0F;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII)I")
	public static int method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > arg0) {
			return arg1;
		} else if (arg2 < arg0) {
			return arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V")
	public static void method394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(12, (long) arg0);
		local9.method630();
		local9.anInt803 = arg1;
	}
}
