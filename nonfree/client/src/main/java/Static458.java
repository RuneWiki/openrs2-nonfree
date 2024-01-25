import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "Lclient!ps;")
	public static final Class193 aClass193_69 = new Class193();

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
	public static int anInt7716 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)I")
	public static int method6235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static153.method2357(arg0 + 45365, 4, arg1 + 91923) + (Static153.method2357(arg0 + 10294, 2, arg1 + 37821) - 128 >> 1) + (Static153.method2357(arg0, 1, arg1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII)V")
	public static void method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static316.anInt5349 && Static418.anInt7030 >= arg0) {
			@Pc(27) int local27 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg1);
			@Pc(33) int local33 = Static140.method2151(Static399.anInt2866, Static372.anInt6316, arg3);
			Static126.method1988(local27, arg0, local33, arg2);
		}
	}
}
