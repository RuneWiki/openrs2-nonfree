import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
	public static int anInt3187;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "Lclient!lh;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
	public static int anInt3188;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1162 = Static177.method3050("wave:");

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	public static int anInt3184 = 0;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1163 = aClass46_1162;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1164 = aClass46_1162;

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_41 = new Class66(5);

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1165 = Static177.method3050("Loaded fonts");

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1166 = Static177.method3050(" ");

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1167 = aClass46_1165;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static9.aClass4_Sub1_Sub7_Sub3Array1[0].method2642(arg3, arg1);
		Static9.aClass4_Sub1_Sub7_Sub3Array1[1].method2642(arg3, arg0 + arg1 - 16);
		@Pc(27) int local27 = arg0 * (arg0 - 32) / arg2;
		if (local27 < 8) {
			local27 = 8;
		}
		@Pc(45) int local45 = arg4 * (arg0 - local27 - 32) / (arg2 - arg0);
		Static145.method2941(arg3, arg1 + 16, 16, arg0 - 32, Static67.anInt1838);
		Static145.method2941(arg3, local45 + arg1 + 16, 16, local27, Static116.anInt2850);
		Static145.method2937(arg3, local45 + arg1 + 16, local27, Static174.anInt3903);
		Static145.method2937(arg3 + 1, arg1 + 16 + local45, local27, Static174.anInt3903);
		Static145.method2935(arg3, arg1 + local45 + 16, 16, Static174.anInt3903);
		Static145.method2935(arg3, local45 + arg1 + 17, 16, Static174.anInt3903);
		Static145.method2937(arg3 + 15, local45 + arg1 - -16, local27, Static130.anInt3131);
		Static145.method2937(arg3 + 14, arg1 + (17 - -local45), local27 - 1, Static130.anInt3131);
		Static145.method2935(arg3, local27 + arg1 + local45 + 15, 16, Static130.anInt3131);
		Static145.method2935(arg3 + 1, local27 + local45 + arg1 + 14, 15, Static130.anInt3131);
	}
}
