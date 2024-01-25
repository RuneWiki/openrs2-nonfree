import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
	public static int anInt9867;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_145 = new Class216(16, 6);

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
	public static int anInt9868 = 0;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIB)V")
	public static void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg3 + 1;
		Static559.method7424(arg4, Static172.anIntArrayArray17[arg3], arg1, arg2);
		@Pc(23) int local23 = arg0 - 1;
		Static559.method7424(arg4, Static172.anIntArrayArray17[arg0], arg1, arg2);
		for (@Pc(30) int local30 = local5; local30 <= local23; local30++) {
			@Pc(36) int[] local36 = Static172.anIntArrayArray17[local30];
			local36[arg2] = local36[arg1] = arg4;
		}
	}
}
