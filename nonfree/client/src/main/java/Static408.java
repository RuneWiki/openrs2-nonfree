import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public static int anInt7078;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!kia;")
	public static final Class201 aClass201_8 = new Class201("LIVE", "", "", 0);

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_72 = new Class387(85, 15);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg0);
		@Pc(22) int local22 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg1);
		@Pc(28) int local28 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg2);
		@Pc(34) int local34 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg6);
		@Pc(42) int local42 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg4 + arg0);
		@Pc(51) int local51 = Static83.method1286(Static456.anInt7815, Static604.anInt10083, arg1 - arg4);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static646.method7025(Static569.anIntArrayArray54[local53], local28, local34, arg5);
		}
		for (@Pc(71) int local71 = local22; local71 > local51; local71--) {
			Static646.method7025(Static569.anIntArrayArray54[local71], local28, local34, arg5);
		}
		@Pc(97) int local97 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg4 + arg2);
		@Pc(105) int local105 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg6 - arg4);
		for (@Pc(107) int local107 = local42; local107 <= local51; local107++) {
			@Pc(115) int[] local115 = Static569.anIntArrayArray54[local107];
			Static646.method7025(local115, local28, local97, arg5);
			Static646.method7025(local115, local97, local105, arg3);
			Static646.method7025(local115, local105, local34, arg5);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)Z")
	public static boolean method6016(@OriginalArg(0) int arg0) {
		if (arg0 == 22 || arg0 == 15 || arg0 == 3 || arg0 == 16 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 51 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method6017() {
		Static659.aClass208_145 = null;
		Static496.anInt8290 = 1;
		Static609.anInt10105 = 0;
		Static622.aClass5_Sub16_Sub4_8 = null;
		Static508.anInt8709 = -1;
		Static389.aBoolean509 = false;
		Static212.anInt3461 = 2;
		Static144.anInt2320 = -1;
	}
}
