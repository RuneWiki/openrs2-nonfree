import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	public static int anInt243;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	public static int anInt245;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "[I")
	public static int[] anIntArray11;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_9 = new Class362(75, 0);

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
	public static int anInt242 = 0;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public static int anInt244 = 0;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[6][];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIB)V")
	public static void method191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class366[] local15 = Static532.aClass366Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class366 local23 = local15[local17];
			if (local23 != null && local23.anInt10235 == 2) {
				Static580.method2692(local23.anInt10234 * 2, arg3 >> 1, local23.anInt10239, local23.anInt10231, local23.anInt10233, arg0 >> 1);
				if (Static258.anIntArray241[0] > -1 && Static106.anInt2418 % 20 < 10) {
					Static273.aClass78Array16[local23.anInt10237].method8185(arg1 + Static258.anIntArray241[0] - 12, Static258.anIntArray241[1] + arg2 + -28);
				}
			}
		}
	}
}
