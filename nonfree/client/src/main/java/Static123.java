import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "Lclient!qh;")
	public static Class5_Sub2_Sub10_Sub1 aClass5_Sub2_Sub10_Sub1_4;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
	public static int anInt2609 = -1;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_26 = new Class8(64);

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
	public static int anInt2610 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "[I")
	public static int[] anIntArray289 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_948 = Static161.method2452("M");

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
	public static void method1943() {
		Static143.aClass91_13 = new Class91();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIB)I")
	public static int method1944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(19) int local19 = arg5 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(28) int local28 = arg3;
			arg3 = arg4;
			arg4 = local28;
		}
		if (local19 == 0) {
			return arg2;
		} else if (local19 == 1) {
			return 7 + 1 - arg0 - arg3;
		} else if (local19 == 2) {
			return 1 + 7 - arg4 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static171.method2627(Static173.anInt3464, arg6, Static174.anInt3493);
		@Pc(17) int local17 = Static171.method2627(Static173.anInt3464, arg3, Static174.anInt3493);
		@Pc(23) int local23 = Static171.method2627(Static27.anInt493, arg2, Static72.anInt1572);
		@Pc(29) int local29 = Static171.method2627(Static27.anInt493, arg1, Static72.anInt1572);
		@Pc(37) int local37 = Static171.method2627(Static173.anInt3464, arg6 + arg5, Static174.anInt3493);
		@Pc(45) int local45 = Static171.method2627(Static173.anInt3464, arg3 - arg5, Static174.anInt3493);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static27.method409(local29, arg0, Static9.anIntArrayArray1[local47], local23);
		}
		for (@Pc(67) int local67 = local17; local67 > local45; local67--) {
			Static27.method409(local29, arg0, Static9.anIntArrayArray1[local67], local23);
		}
		@Pc(91) int local91 = Static171.method2627(Static27.anInt493, arg2 + arg5, Static72.anInt1572);
		@Pc(100) int local100 = Static171.method2627(Static27.anInt493, arg1 - arg5, Static72.anInt1572);
		for (@Pc(102) int local102 = local37; local102 <= local45; local102++) {
			@Pc(108) int[] local108 = Static9.anIntArrayArray1[local102];
			Static27.method409(local91, arg0, local108, local23);
			Static27.method409(local100, arg4, local108, local91);
			Static27.method409(local29, arg0, local108, local100);
		}
	}
}
