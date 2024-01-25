import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "[Lclient!fn;")
	public static final Class65[] aClass65Array1 = new Class65[4];

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V")
	public static void method1893(@OriginalArg(1) int arg0) {
		Static250.anInt4833 = arg0;
		Static120.aClass11_60.method213();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIII)V")
	public static void method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg3 * (arg3 - 32) / arg2;
		if (local11 < 8) {
			local11 = 8;
		}
		@Pc(30) int local30 = arg0 * (arg3 - local11 - 32) / (arg2 - arg3);
		Static250.aClass2Array15[0].method2642(arg1, arg4);
		Static250.aClass2Array15[1].method2642(arg1, arg3 + arg4 - 16);
		Static218.aClass46_5.method5108(16, arg1, arg3 - 32, Static317.anInt6130, arg4 + 16);
		Static218.aClass46_5.method5108(16, arg1, local11, Static288.anInt5581, arg4 + local30 + 16);
		Static218.aClass46_5.method5099(arg1, local11, arg4 + local30 + 16, Static355.anInt6760);
		Static218.aClass46_5.method5099(arg1 + 1, local11, local30 + arg4 + 16, Static355.anInt6760);
		Static218.aClass46_5.method5113(Static355.anInt6760, arg4 + local30 + 16, arg1, 16);
		Static218.aClass46_5.method5113(Static355.anInt6760, local30 + arg4 + 17, arg1, 16);
		Static218.aClass46_5.method5099(arg1 + 15, local11, arg4 + local30 + 16, Static294.anInt5655);
		Static218.aClass46_5.method5099(arg1 + 14, local11 + -1, local30 + arg4 + 17, Static294.anInt5655);
		Static218.aClass46_5.method5113(Static294.anInt5655, local11 + local30 + arg4 + 15, arg1, 16);
		Static218.aClass46_5.method5113(Static294.anInt5655, local11 + local30 + arg4 + 14, arg1 + 1, 15);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1895(@OriginalArg(0) String arg0) {
		return Static93.method2166(10, arg0);
	}
}
