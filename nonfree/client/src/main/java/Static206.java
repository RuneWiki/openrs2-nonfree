import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	public static int anInt4549 = -1;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	public static int anInt4551 = 0;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
	public static int[] anIntArray349 = new int[200];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lclient!se;")
	public static Class122 method3444(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static80.aClass122ArrayArray1[local7] == null || Static80.aClass122ArrayArray1[local7][local11] == null) {
			@Pc(31) boolean local31 = Static156.method2772(local7);
			if (!local31) {
				return null;
			}
		}
		return Static80.aClass122ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public static void method3445() {
		Static87.aClass79_13.method2487();
		Static266.aClass79_40.method2487();
		Static210.aClass79_30.method2487();
		Static218.aClass79_33.method2487();
	}
}
