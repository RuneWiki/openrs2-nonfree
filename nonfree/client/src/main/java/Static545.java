import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static545 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
	public static int anInt9233 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIIII)V")
	public static void method7971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg1) {
			Static491.method7219(Static249.anIntArrayArray23[arg0], arg1, arg3, arg2);
		} else {
			Static491.method7219(Static249.anIntArrayArray23[arg0], arg2, arg3, arg1);
		}
	}
}
