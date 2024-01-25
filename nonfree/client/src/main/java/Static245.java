import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BZILclient!hg;III)V")
	public static void method3411(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class109 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static126.anInt2092 >= 50 || (arg2 == null || arg2.anIntArrayArray63 == null || arg2.anIntArrayArray63.length <= arg1 || arg2.anIntArrayArray63[arg1] == null)) {
			return;
		}
		@Pc(30) int local30 = arg2.anIntArrayArray63[arg1][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(57) int local57;
		if (arg2.anIntArrayArray63[arg1].length > 1) {
			local57 = (int) ((double) arg2.anIntArrayArray63[arg1].length * Math.random());
			if (local57 > 0) {
				local34 = arg2.anIntArrayArray63[arg1][local57];
			}
		}
		@Pc(77) int local77 = local30 & 0x1F;
		if (local77 == 0) {
			if (arg0) {
				Static448.method6077(255, local40, local34, 0);
			}
		} else if (Static434.aClass165_Sub1_1.anInt4202 != 0) {
			local57 = arg3 - 64 >> 7;
			@Pc(110) int local110 = arg4 - 64 >> 7;
			Static409.aClass253Array2[Static126.anInt2092++] = new Class253((byte) 1, local34, local40, 0, 255, (local57 << 16) + (arg5 << 24) + (local110 << 8) + local77);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
	public static boolean method3413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class192 local15 = Static249.aClass39_2.method748(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local15.method4314(arg0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BC)Z")
	public static boolean method3414(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
