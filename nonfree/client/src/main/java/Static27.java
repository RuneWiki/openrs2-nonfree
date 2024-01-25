import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIIII)V")
	public static void method371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(10) int local10 = arg1; local10 <= arg2; local10++) {
			Static249.method6044(Static267.anIntArrayArray50[local10], arg0, arg3, arg4);
		}
	}
}
