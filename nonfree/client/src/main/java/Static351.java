import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
	public static int anInt5714 = 2;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method5211() {
		Static489.aClass260ArrayArray3 = new Class260[Static322.aClass15_85.method516()][];
		Static285.aClass260ArrayArray4 = new Class260[Static322.aClass15_85.method516()][];
		Static509.aBooleanArray39 = new boolean[Static322.aClass15_85.method516()];
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method5213(@OriginalArg(0) Class3_Sub11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static121.aClass21Array2 == Static108.aClass21Array1) {
			return;
		}
		@Pc(10) int local10 = Static582.aClass21Array3[arg1].method7980(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class21 local23 = Static582.aClass21Array3[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7980(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}
}
