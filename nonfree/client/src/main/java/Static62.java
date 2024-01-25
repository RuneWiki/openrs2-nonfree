import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_17 = new Class198(64);

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public static int anInt1293 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static19.anInt533 <= arg1 && Static4.anInt75 >= arg4 && Static236.anInt4721 <= arg2 && arg5 <= Static73.anInt1425) {
			Static298.method5059(arg6, arg4, arg3, arg5, arg2, arg0, arg1);
		} else {
			Static156.method2486(arg5, arg6, arg2, arg3, arg1, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public static void method1012() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static162.anInt2152; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static122.anInt2632; local13++) {
				if (Static158.method2508(true, local13, local7, local9, Static256.aClass45ArrayArrayArray2)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
