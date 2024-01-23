import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_15;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
	public static int[] anIntArray386 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII)V")
	public static void method3589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg2 + 1;
		Static147.method2681(Static29.anIntArrayArray10[arg2], arg1, arg0, arg4);
		@Pc(23) int local23 = arg3 - 1;
		Static147.method2681(Static29.anIntArrayArray10[arg3], arg1, arg0, arg4);
		for (@Pc(30) int local30 = local14; local30 <= local23; local30++) {
			@Pc(36) int[] local36 = Static29.anIntArrayArray10[local30];
			local36[arg0] = local36[arg4] = arg1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V")
	public static void method3590() {
		Static157.aClass79_20.method2479(5);
		Static96.aClass79_14.method2479(5);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)V")
	public static void method3591() {
		Static57.aClass79_7.method2479(5);
		Static247.aClass79_37.method2479(5);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method3594() {
		Static174.aClass79_27.method2489();
	}
}
