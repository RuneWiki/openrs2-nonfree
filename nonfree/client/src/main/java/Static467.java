import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "Lclient!oaa;")
	public static Class224 aClass224_9;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "Lclient!qaa;")
	public static final Class257 aClass257_9 = new Class257();

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray70 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "Lclient!su;")
	public static Class298 aClass298_177 = new Class298();

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_137 = new Class98(21, 7);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method6523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static502.method6952(Static52.anInt1226, arg3, Static133.anInt2531);
		@Pc(17) int local17 = Static502.method6952(Static52.anInt1226, arg5, Static133.anInt2531);
		@Pc(23) int local23 = Static502.method6952(Static205.anInt3906, arg0, Static529.anInt9806);
		@Pc(29) int local29 = Static502.method6952(Static205.anInt3906, arg2, Static529.anInt9806);
		@Pc(42) int local42 = Static502.method6952(Static52.anInt1226, arg4 + arg3, Static133.anInt2531);
		@Pc(51) int local51 = Static502.method6952(Static52.anInt1226, arg5 - arg4, Static133.anInt2531);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static264.method4006(local29, arg6, local23, Static155.anIntArrayArray32[local53]);
		}
		for (@Pc(69) int local69 = local17; local69 > local51; local69--) {
			Static264.method4006(local29, arg6, local23, Static155.anIntArrayArray32[local69]);
		}
		@Pc(91) int local91 = Static502.method6952(Static205.anInt3906, arg4 + arg0, Static529.anInt9806);
		@Pc(100) int local100 = Static502.method6952(Static205.anInt3906, arg2 - arg4, Static529.anInt9806);
		for (@Pc(102) int local102 = local42; local102 <= local51; local102++) {
			@Pc(108) int[] local108 = Static155.anIntArrayArray32[local102];
			Static264.method4006(local91, arg6, local23, local108);
			Static264.method4006(local100, arg1, local91, local108);
			Static264.method4006(local29, arg6, local100, local108);
		}
	}
}
