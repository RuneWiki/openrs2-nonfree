import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "[Lclient!taa;")
	public static Class185_Sub1[] aClass185_Sub1Array2;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!im;")
	public static Class140 aClass140_86;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Lclient!im;")
	public static final Class140 aClass140_84 = new Class140(44, -2);

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "Lclient!im;")
	public static final Class140 aClass140_85 = new Class140(77, 3);

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public static int anInt5858 = -1;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V")
	public static void method4981(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static544.aClass1_Sub22_Sub1_1.anInt5439 * arg0 >> 8;
		if (local6 != 0 && arg1 != -1) {
			Static71.method1273(Static7.aClass171_5, local6, arg1);
			Static316.aBoolean424 = true;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	public static void method4983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(15, 0);
		local8.method4946();
		local8.anInt5821 = arg1;
		local8.anInt5822 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static204.method3515(arg7)) {
			return;
		}
		if (Static520.aClass156ArrayArray2[arg7] == null) {
			Static67.method1233(Static396.aClass156ArrayArray1[arg7], -1, arg1, arg8, arg0, arg4, arg5, arg3, arg6, arg2);
		} else {
			Static67.method1233(Static520.aClass156ArrayArray2[arg7], -1, arg1, arg8, arg0, arg4, arg5, arg3, arg6, arg2);
		}
	}
}
