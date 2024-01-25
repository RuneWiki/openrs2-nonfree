import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	public static void method3039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class196 local9 = Static277.aClass196ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static247.anInt3977 = local9.anInt5071;
			Static44.anInt788 = local9.anInt5065;
			Static12.anInt240 = local9.anInt5066;
		}
		Static367.method4754();
	}
}
