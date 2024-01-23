import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "[Lclient!ne;")
	public static Class78[] aClass78Array5;

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "Lclient!pa;")
	public static Class86 aClass86_58;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
	public static int anInt3200 = 0;

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "[I")
	public static int[] anIntArray332 = new int[50];

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1069 = Static186.method3527("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
	public static int anInt3202 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BIIIII)V")
	public static void method2574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg1 + 1;
		Static107.method1641(arg2, arg3, Static139.anIntArrayArray21[arg1], arg0);
		@Pc(20) int local20 = arg4 - 1;
		Static107.method1641(arg2, arg3, Static139.anIntArrayArray21[arg4], arg0);
		for (@Pc(30) int local30 = local11; local30 <= local20; local30++) {
			@Pc(36) int[] local36 = Static139.anIntArrayArray21[local30];
			local36[arg2] = local36[arg0] = arg3;
		}
	}
}
