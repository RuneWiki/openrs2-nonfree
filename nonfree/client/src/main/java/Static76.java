import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!em", name = "q", descriptor = "I")
	public static int anInt1623;

	@OriginalMember(owner = "client!em", name = "t", descriptor = "I")
	public static int anInt1626 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IBI)I")
	public static int method1677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local16 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local16 * arg1;
		} else {
			return local16;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IBIII)V")
	public static void method1678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static2.anInt65 == 0 || arg2 == 0 || Static99.anInt2257 >= 50 || arg0 == -1) {
			return;
		}
		Static135.anIntArray240[Static99.anInt2257] = arg0;
		Static99.anIntArray216[Static99.anInt2257] = arg2;
		Static71.anIntArray160[Static99.anInt2257] = arg3;
		Static285.aClass134Array1[Static99.anInt2257] = null;
		Static333.anIntArray497[Static99.anInt2257] = 0;
		Static163.anIntArray156[Static99.anInt2257] = arg1;
		Static99.anInt2257++;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V")
	public static void method1679() {
		@Pc(1) Class119 local1 = Static282.aClass119_171;
		synchronized (Static282.aClass119_171) {
			Static282.aClass119_171.method3315(5);
		}
		local1 = Static296.aClass119_182;
		synchronized (Static296.aClass119_182) {
			Static296.aClass119_182.method3315(5);
		}
		local1 = Static290.aClass119_174;
		synchronized (Static290.aClass119_174) {
			Static290.aClass119_174.method3315(5);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!mm;III[Z)V")
	public static void method1680(@OriginalArg(0) Class2_Sub11_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static301.aClass73Array31 == Static313.aClass73Array39) {
			return;
		}
		@Pc(9) int local9 = Static265.aClass73Array44[arg1].method4932(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class73 local22 = Static265.aClass73Array44[local11];
				if (local22 != null) {
					local22.method4941(arg0, arg2, local9 - local22.method4932(arg2, arg3), arg3);
				}
			}
		}
	}
}
