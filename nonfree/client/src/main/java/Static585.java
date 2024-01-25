import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "Lclient!ga;")
	public static Class111 aClass111_126;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public static int anInt9461;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
	public static int[] anIntArray630;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "[J")
	public static final long[] aLongArray16 = new long[32];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Lclient!ah;")
	public static Class1_Sub3_Sub1 method7823() {
		@Pc(13) Class1_Sub3_Sub1 local13 = (Class1_Sub3_Sub1) Static132.aClass117_2.method2549();
		if (local13 != null) {
			local13.method7878();
			local13.method7811();
			return local13;
		}
		do {
			local13 = (Class1_Sub3_Sub1) Static412.aClass117_8.method2549();
			if (local13 == null) {
				return null;
			}
			if (local13.method490() > Static255.method4035()) {
				return null;
			}
			local13.method7878();
			local13.method7811();
		} while ((Long.MIN_VALUE & local13.aLong420) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBI)V")
	public static void method7824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1004) {
			Static145.method2360(Static214.aClass37_2, arg2, arg0);
		} else if (arg1 == 1012) {
			Static145.method2360(Static473.aClass37_6, arg2, arg0);
		} else if (arg1 == 1002) {
			Static145.method2360(Static579.aClass37_8, arg2, arg0);
		} else if (arg1 == 1009) {
			Static145.method2360(Static593.aClass37_9, arg2, arg0);
		} else if (arg1 == 1008) {
			Static145.method2360(Static346.aClass37_4, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	public static void method7825() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static500.anInt6888; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static573.anInt9325; local13++) {
				if (Static109.method1958(local7, Static118.aClass293ArrayArrayArray14, local13, true, local9)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
