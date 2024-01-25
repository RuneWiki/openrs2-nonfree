import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Lclient!ul;")
	public static Class246 aClass246_14;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V")
	public static void method350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(13, arg0);
		local8.method1778();
		local8.anInt2056 = arg1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIBI)V")
	public static void method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static108.anInt2276 <= arg2 && arg2 <= Static173.anInt3208) {
			@Pc(16) int local16 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg3);
			@Pc(22) int local22 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg1);
			Static421.method1794(arg2, local22, local16, arg0);
		}
	}
}
