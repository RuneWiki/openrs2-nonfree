import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
	public static int anInt700;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_27 = new Class107(47, 5);

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[Lclient!kr;")
	public static final Class90_Sub1[] aClass90_Sub1Array2 = new Class90_Sub1[30];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIBII)V")
	public static void method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg1);
		@Pc(17) int local17 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg6);
		@Pc(28) int local28 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5);
		@Pc(34) int local34 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg0);
		@Pc(42) int local42 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg4 + arg1);
		@Pc(51) int local51 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg6 - arg4);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static59.method1261(Static163.anIntArrayArray35[local53], local34, local28, arg3);
		}
		for (@Pc(73) int local73 = local17; local73 > local51; local73--) {
			Static59.method1261(Static163.anIntArrayArray35[local73], local34, local28, arg3);
		}
		@Pc(100) int local100 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg5 + arg4);
		@Pc(109) int local109 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg0 - arg4);
		for (@Pc(111) int local111 = local42; local111 <= local51; local111++) {
			@Pc(117) int[] local117 = Static163.anIntArrayArray35[local111];
			Static59.method1261(local117, local100, local28, arg3);
			Static59.method1261(local117, local109, local100, arg2);
			Static59.method1261(local117, local34, local109, arg3);
		}
	}
}
