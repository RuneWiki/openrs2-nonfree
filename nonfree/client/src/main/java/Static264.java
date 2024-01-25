import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "Lclient!vd;")
	public static Class353 aClass353_48;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_88 = new Class268(47, 6);

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
	public static void method4688() {
		@Pc(9) int[] local9 = new int[Static266.aClass138_1.anInt4296];
		@Pc(11) int local11 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static266.aClass138_1.anInt4296; local17++) {
			@Pc(24) Class347 local24 = Static266.aClass138_1.method3730(local17);
			if (local24.anInt9779 >= 0 || local24.anInt9730 >= 0) {
				local9[local11++] = local17;
			}
		}
		Static583.anIntArray596 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static583.anIntArray596[local52] = local9[local52];
		}
	}
}
