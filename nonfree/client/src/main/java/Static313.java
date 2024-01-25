import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!lv;)V")
	public static void method4341(@OriginalArg(1) Class8_Sub6 arg0) {
		arg0.aClass8_Sub3_Sub3_Sub1_1 = null;
		if (Static122.anInt2408 < 20) {
			Static528.aClass209_8.method4190(arg0);
			Static122.anInt2408++;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[BIIIII)Z")
	public static boolean method4342(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(15) int local15;
		if (local9 == 0) {
			local15 = 0;
		} else {
			local15 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg2 + 7) / 8);
		@Pc(43) int local43 = -((arg4 + 8 - 1) / 8);
		for (@Pc(45) int local45 = local28; local45 < 0; local45++) {
			for (@Pc(49) int local49 = local43; local49 < 0; local49++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local15;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg3;
		}
		return false;
	}
}
