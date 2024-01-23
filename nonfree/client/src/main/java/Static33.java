import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt566 = -1;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public static int anInt577 = 0;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public static int anInt579 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBIII)V")
	public static void method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static226.method3512(arg4, Static98.anInt2007, Static213.anInt4452);
		@Pc(17) int local17 = Static226.method3512(arg2, Static98.anInt2007, Static213.anInt4452);
		@Pc(23) int local23 = Static226.method3512(arg0, Static29.anInt517, Static11.anInt170);
		@Pc(29) int local29 = Static226.method3512(arg3, Static29.anInt517, Static11.anInt170);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static273.method4257(local23, Static183.anIntArrayArray26[local31], arg1, local29);
		}
	}
}
