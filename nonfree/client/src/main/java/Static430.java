import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "J")
	public static long aLong205;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
	public static int anInt7301 = 0;

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "[I")
	public static final int[] anIntArray498 = new int[500];

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IBIII)V")
	public static void method6122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static553.anInt9074 && arg2 <= Static249.anInt4668) {
			@Pc(11) int local11 = Static489.method6853(arg3, Static326.anInt6028, Static80.anInt1738);
			@Pc(19) int local19 = Static489.method6853(arg0, Static326.anInt6028, Static80.anInt1738);
			Static339.method2372(arg1, local19, arg2, local11);
		}
	}
}
