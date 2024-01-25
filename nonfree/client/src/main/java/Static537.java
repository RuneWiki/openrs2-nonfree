import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!tca", name = "y", descriptor = "I")
	public static int anInt9060;

	@OriginalMember(owner = "client!tca", name = "w", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_280 = new Class194(50, 17);

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method7780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		if (arg4 < 512 || arg0 < 512 || (Static399.anInt7121 - 2) * 512 < arg4 || Static24.anInt345 * 512 - 1024 < arg0) {
			Static272.anIntArray292[0] = Static272.anIntArray292[1] = -1;
			return;
		}
		@Pc(51) int local51 = Static594.method8211(arg4, arg0, arg6) - arg2;
		if (Static80.aBoolean118) {
			Static53.method975(true);
		} else {
			Static570.aClass31_14.method7930(arg3, 0, 0);
			Static266.aClass82_8.method6160(Static570.aClass31_14);
		}
		if (Static40.aBoolean34) {
			Static266.aClass82_8.HA(arg4, local51, arg0, Static562.anInt9327, Static272.anIntArray292);
		} else {
			Static266.aClass82_8.da(arg4, local51, arg0, Static272.anIntArray292);
		}
		if (Static80.aBoolean118) {
			Static645.method8655();
		} else {
			Static570.aClass31_14.method7930(-arg3, 0, 0);
			Static266.aClass82_8.method6160(Static570.aClass31_14);
		}
	}
}
