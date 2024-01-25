import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
	public static void method894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 * Static58.aClass6_Sub17_Sub1_1.anInt9287 >> 8;
		if (local10 != 0 && arg0 != -1) {
			Static365.method5403(arg0, Static63.aClass248_11, local10);
			Static396.aBoolean490 = true;
		}
	}
}
