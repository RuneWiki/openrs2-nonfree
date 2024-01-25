import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public static int anInt460;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_7 = new Class215(19, 2);

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_33 = new Class22(18, 1);

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_2 = new Class183();

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public static int anInt461 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public static void method522(@OriginalArg(0) int arg0) {
		if (anInt461 == 0) {
			Static56.aClass4_Sub15_Sub1_1.method1428(arg0);
		} else {
			Static206.anInt3920 = arg0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)I")
	public static int method523(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg6 < 1 || Static326.anInt5666 - 2 < arg1 || arg6 > Static283.anInt5187 - 2) {
			return;
		}
		@Pc(32) int local32 = arg0;
		if (arg0 < 3 && Static378.method3229(arg1, arg6)) {
			local32 = arg0 + 1;
		}
		if (!Static323.aClass50_Sub1_1.method2861(Static177.anInt2973) && !Static310.method4164(arg1, Static317.anInt5523, local32, arg6)) {
			return;
		}
		if (Static202.aClass164ArrayArrayArray5 == null) {
			return;
		}
		Static67.aClass266_Sub1_1.method5645(Static122.aClass19_16, Static175.aClass213Array1[arg0], arg7, arg0, arg6, arg1);
		if (arg5 < 0) {
			return;
		}
		@Pc(73) boolean local73 = Static323.aClass50_Sub1_1.aBoolean305;
		Static323.aClass50_Sub1_1.aBoolean305 = true;
		Static67.aClass266_Sub1_1.method5649(arg1, arg0, arg4, arg3, arg5, Static122.aClass19_16, arg2, arg6, local32, Static175.aClass213Array1[arg0]);
		Static323.aClass50_Sub1_1.aBoolean305 = local73;
		return;
	}
}
