import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public static int anInt4198;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public static int anInt4199 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII)V")
	public static void method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg2; local12++) {
			Static567.method8614(arg0, arg4, Static186.anIntArrayArray12[local12], arg3);
		}
	}
}
