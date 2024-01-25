import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[Lclient!i;")
	public static Class151[] aClass151Array1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_31 = new Class349(63, 28);

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "J")
	public static long aLong46 = 0L;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
	public static void method1672(@OriginalArg(1) int arg0) {
		Static523.anIntArray556 = new int[arg0];
		Static264.anIntArray313 = new int[arg0];
		Static524.anIntArray557 = new int[arg0];
		Static100.anIntArray153 = new int[arg0];
		Static447.anIntArray484 = new int[arg0];
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZI)I")
	public static int method1673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local16;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIBI)V")
	public static void method1674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = Static290.method4092(Static48.anInt898, arg2, Static275.anInt4756);
		@Pc(25) int local25 = Static290.method4092(Static48.anInt898, arg5, Static275.anInt4756);
		@Pc(31) int local31 = Static290.method4092(Static89.anInt1576, arg3, Static130.anInt2131);
		@Pc(37) int local37 = Static290.method4092(Static89.anInt1576, arg1, Static130.anInt2131);
		@Pc(45) int local45 = Static290.method4092(Static48.anInt898, arg2 + arg4, Static275.anInt4756);
		@Pc(54) int local54 = Static290.method4092(Static48.anInt898, arg5 - arg4, Static275.anInt4756);
		for (@Pc(56) int local56 = local19; local56 < local45; local56++) {
			Static437.method5735(local31, Static238.anIntArrayArray36[local56], local37, arg0);
		}
		for (@Pc(72) int local72 = local25; local72 > local54; local72--) {
			Static437.method5735(local31, Static238.anIntArrayArray36[local72], local37, arg0);
		}
		@Pc(94) int local94 = Static290.method4092(Static89.anInt1576, arg4 + arg3, Static130.anInt2131);
		@Pc(103) int local103 = Static290.method4092(Static89.anInt1576, arg1 - arg4, Static130.anInt2131);
		for (@Pc(105) int local105 = local45; local105 <= local54; local105++) {
			@Pc(111) int[] local111 = Static238.anIntArrayArray36[local105];
			Static437.method5735(local31, local111, local94, arg0);
			Static437.method5735(local103, local111, local37, arg0);
		}
	}
}
