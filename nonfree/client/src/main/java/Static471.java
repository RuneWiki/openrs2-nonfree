import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
	public static int anInt5158;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public static void method4221() {
		Static237.aClass380_17.method8751();
		Static537.aClass231_12.method6049();
		Static625.aClass231_13.method6049();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method4227(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static148.aClass245Array1 == Static152.aClass245Array3) {
			return;
		}
		@Pc(10) int local10 = Static150.aClass245Array2[arg1].method7580(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class245 local23 = Static150.aClass245Array2[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7580(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
