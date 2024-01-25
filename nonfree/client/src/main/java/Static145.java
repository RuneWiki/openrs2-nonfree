import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
	public static int anInt2659 = 0;

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
	public static int anInt2665 = 100;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIZIZ)I")
	public static int method2540(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class4_Sub54 local10 = Static473.method6525(arg1, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray723.length; local23++) {
			if (local10.anIntArray723[local23] >= 0 && Static532.aClass255_2.anInt5946 > local10.anIntArray723[local23]) {
				@Pc(45) Class110 local45 = Static532.aClass255_2.method5210(local10.anIntArray723[local23]);
				@Pc(55) int local55 = local45.method2611(Static482.aClass84_2.method2152(arg2).anInt6617, arg2);
				if (arg0) {
					local16 += local10.anIntArray721[local23] * local55;
				} else {
					local16 += local55;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZII)V")
	public static void method2541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg0 >= arg2) {
			for (local15 = arg2; local15 < arg0; local15++) {
				Static172.anIntArrayArray17[local15][arg1] = arg3;
			}
		} else {
			for (local15 = arg0; local15 < arg2; local15++) {
				Static172.anIntArrayArray17[local15][arg1] = arg3;
			}
		}
	}
}
