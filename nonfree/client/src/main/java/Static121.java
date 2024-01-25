import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Lclient!mt;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public static int anInt2062 = 0;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
	public static void method1957() {
		@Pc(9) int[] local9 = new int[Static413.aClass271_2.anInt7603];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static413.aClass271_2.anInt7603; local13++) {
			@Pc(20) Class218 local20 = Static413.aClass271_2.method6193(local13);
			if (local20.anInt6286 >= 0 || local20.anInt6313 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static202.anIntArray289 = new int[local11];
		for (@Pc(48) int local48 = 0; local48 < local11; local48++) {
			Static202.anIntArray289[local48] = local9[local48];
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIII)V")
	public static void method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static326.aByteArrayArrayArray15 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!za;)V")
	public static void method1959(@OriginalArg(1) Class75 arg0) {
		if (Static237.aBoolean264) {
			Static380.method5244(arg0);
		} else {
			Static302.method4318(arg0);
		}
	}
}
