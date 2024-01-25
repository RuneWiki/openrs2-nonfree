import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "Lclient!lga;")
	public static Class223 aClass223_94;

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_99 = new Class241(0, 0);

	@OriginalMember(owner = "client!qba", name = "s", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_144 = new Class322(103, 1);

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BZI)V")
	public static void method7156(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub3 local13 = Static536.method7657(arg0, arg1);
		if (local13 != null) {
			local13.method9051();
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V")
	public static void method7157() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static29.anInt380; local16++) {
			for (@Pc(20) int local20 = 0; local20 < Static327.anInt5650; local20++) {
				if (Static258.method4504(Static334.aClass243ArrayArrayArray2, true, local7, local16, local20)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
