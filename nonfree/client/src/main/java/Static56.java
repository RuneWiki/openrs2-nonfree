import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Lclient!fi;")
	public static Class66 aClass66_19 = new Class66(64);

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public static int anInt1365 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII)V")
	public static void method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg3 + 1;
		Static247.method3552(arg2, arg1, Static332.anIntArrayArray56[arg3], arg4);
		@Pc(25) int local25 = arg0 - 1;
		Static247.method3552(arg2, arg1, Static332.anIntArrayArray56[arg0], arg4);
		for (@Pc(30) int local30 = local7; local30 <= local25; local30++) {
			@Pc(36) int[] local36 = Static332.anIntArrayArray56[local30];
			local36[arg1] = local36[arg4] = arg2;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIZ)V")
	public static void method1201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static286.aLong188 = 0L;
		@Pc(12) int local12 = Static315.method5371();
		if (arg2 == 3 || local12 == 3) {
			arg3 = true;
		}
		if (!Static15.aClass59_1.method4786()) {
			arg3 = true;
		}
		Static331.method5534(local12, arg1, arg2, arg3, arg0);
	}
}
