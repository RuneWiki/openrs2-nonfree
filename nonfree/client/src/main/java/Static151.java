import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!be;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_878 = Static231.method3737("leuchten3:");

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	public static int anInt3334 = 0;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "[I")
	public static int[] anIntArray292 = new int[200];

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Z")
	public static boolean aBoolean291 = false;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	public static int anInt3341 = 0;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!sc;")
	public static Class107 aClass107_879 = null;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public static void method2477() {
		if (Static24.aFloat2 > Static4.aFloat10) {
			Static4.aFloat10 = (float) ((double) Static4.aFloat10 + (double) Static4.aFloat10 / 30.0D);
			if (Static24.aFloat2 < Static4.aFloat10) {
				Static4.aFloat10 = Static24.aFloat2;
			}
			Static25.method458();
		} else if (Static4.aFloat10 > Static24.aFloat2) {
			Static4.aFloat10 = (float) ((double) Static4.aFloat10 - (double) Static4.aFloat10 / 30.0D);
			if (Static4.aFloat10 < Static24.aFloat2) {
				Static4.aFloat10 = Static24.aFloat2;
			}
			Static25.method458();
		}
		if (Static199.anInt4323 == -1 || Static194.anInt4290 == -1) {
			return;
		}
		@Pc(60) int local60 = Static199.anInt4323 - Static10.anInt284;
		if (local60 < 2 || local60 > 2) {
			local60 >>= 0x4;
		}
		Static10.anInt284 += local60;
		@Pc(81) int local81 = Static194.anInt4290 - Static114.anInt2509;
		if (local81 < 2 || local81 > 2) {
			local81 >>= 0x4;
		}
		if (local60 == 0 && local81 == 0) {
			Static199.anInt4323 = -1;
			Static194.anInt4290 = -1;
		}
		Static114.anInt2509 += local81;
		Static25.method458();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg5);
		@Pc(22) int local22 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg2);
		@Pc(28) int local28 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0);
		@Pc(34) int local34 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg3);
		@Pc(42) int local42 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg1 + arg5);
		@Pc(50) int local50 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg2 - arg1);
		for (@Pc(52) int local52 = local16; local52 < local42; local52++) {
			Static162.method2605(Static231.anIntArrayArray44[local52], local28, arg4, local34);
		}
		for (@Pc(68) int local68 = local22; local68 > local50; local68--) {
			Static162.method2605(Static231.anIntArrayArray44[local68], local28, arg4, local34);
		}
		@Pc(90) int local90 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg0 + arg1);
		@Pc(99) int local99 = Static123.method2091(Static38.anInt784, Static99.anInt915, arg3 - arg1);
		for (@Pc(101) int local101 = local42; local101 <= local50; local101++) {
			@Pc(107) int[] local107 = Static231.anIntArrayArray44[local101];
			Static162.method2605(local107, local28, arg4, local90);
			Static162.method2605(local107, local99, arg4, local34);
		}
	}
}
