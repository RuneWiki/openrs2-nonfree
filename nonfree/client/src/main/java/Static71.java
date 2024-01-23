import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
	public static int anInt1927;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	public static int anInt1924 = 0;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
	public static int anInt1930 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public static void method1366() {
		for (@Pc(15) Class1_Sub2_Sub19 local15 = (Class1_Sub2_Sub19) Static213.aClass3_21.method30(); local15 != null; local15 = (Class1_Sub2_Sub19) Static213.aClass3_21.method33()) {
			@Pc(20) Class9_Sub6 local20 = local15.aClass9_Sub6_1;
			if (Static137.anInt3321 != local20.anInt2890 || local20.aBoolean155) {
				local15.method4186();
			} else if (local20.anInt2894 <= Static156.anInt3722) {
				local20.method2227(Static37.anInt999);
				if (local20.aBoolean155) {
					local15.method4186();
				} else {
					Static164.method2853(local20.anInt2890, local20.anInt2902, local20.anInt2901, local20.anInt2908, 60, local20, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method1367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg2;
		for (@Pc(11) int local11 = arg2; local11 < local9; local11++) {
			Static147.method2681(Static29.anIntArrayArray10[local11], arg0, arg6, arg4);
		}
		@Pc(39) int local39 = arg4 - arg1;
		@Pc(43) int local43 = arg5 - arg1;
		for (@Pc(45) int local45 = arg5; local45 > local43; local45--) {
			Static147.method2681(Static29.anIntArrayArray10[local45], arg0, arg6, arg4);
		}
		@Pc(64) int local64 = arg6 + arg1;
		for (@Pc(66) int local66 = local9; local66 <= local43; local66++) {
			@Pc(72) int[] local72 = Static29.anIntArrayArray10[local66];
			Static147.method2681(local72, arg0, arg6, local64);
			Static147.method2681(local72, arg3, local64, local39);
			Static147.method2681(local72, arg0, local39, arg4);
		}
	}
}
