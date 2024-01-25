import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
	public static int anInt3771 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)V")
	public static void method3410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static61.anInt1534 <= arg3 && arg3 <= Static168.anInt3509) {
			@Pc(15) int local15 = Static270.method4496(Static314.anInt6030, arg1, Static142.anInt3103);
			@Pc(21) int local21 = Static270.method4496(Static314.anInt6030, arg2, Static142.anInt3103);
			Static96.method1985(local15, local21, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)I")
	public static int method3411() {
		return 15;
	}
}
