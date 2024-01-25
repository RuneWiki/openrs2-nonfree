import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	public static int anInt2379 = 0;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_68 = new Class12(100, 2);

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_69 = new Class12(61, 7);

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIBII)V")
	public static void method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static289.anInt5053 <= arg2 && Static93.anInt1676 >= arg2) {
			@Pc(19) int local19 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg3);
			@Pc(25) int local25 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg1);
			Static249.method3540(local25, local19, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)I")
	public static int method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(44) int local44 = Static228.method3786(arg0 + 45365, arg1 + 91923, 4) + (Static228.method3786(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Static228.method3786(arg0, arg1, 1) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}
}
