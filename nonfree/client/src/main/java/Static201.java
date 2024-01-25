import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Lclient!qi;")
	public static Class19 aClass19_2;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Z")
	public static boolean aBoolean284 = false;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public static void method3643() {
		Static338.aClass70_106.method1405();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBIIII)V")
	public static void method3645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg4 + 1;
		Static14.method247(arg1, arg3, Static11.anIntArrayArray11[arg4], arg2);
		@Pc(28) int local28 = arg0 - 1;
		Static14.method247(arg1, arg3, Static11.anIntArrayArray11[arg0], arg2);
		for (@Pc(33) int local33 = local15; local33 <= local28; local33++) {
			@Pc(39) int[] local39 = Static11.anIntArrayArray11[local33];
			local39[arg2] = local39[arg1] = arg3;
		}
	}
}
