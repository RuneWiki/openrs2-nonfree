import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "[Lclient!waa;")
	public static final Class348[] aClass348Array1 = new Class348[6];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method2237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg6 < 1 || arg4 < 1 || Static460.anInt8640 - 2 < arg6 || arg4 > Static292.anInt7682 - 2) {
			return;
		}
		@Pc(34) int local34 = arg7;
		if (arg7 < 3 && Static503.method7578(arg6, arg4)) {
			local34 = arg7 + 1;
		}
		if (!Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823) && !Static194.method3317(local34, Static96.anInt2320, arg4, arg6)) {
			return;
		}
		if (Static580.aClass125ArrayArrayArray3 == null) {
			return;
		}
		Static231.aClass152_Sub1_1.method3667(arg0, Static546.aClass15_16, arg6, arg4, Static403.aClass350Array1[arg7], arg7);
		if (arg2 < 0) {
			return;
		}
		@Pc(80) boolean local80 = Static455.aClass3_Sub27_Sub1_1.aBoolean382;
		Static455.aClass3_Sub27_Sub1_1.aBoolean382 = true;
		Static231.aClass152_Sub1_1.method3668(arg6, local34, arg4, arg7, Static403.aClass350Array1[arg7], arg3, arg1, arg2, arg5, Static546.aClass15_16);
		Static455.aClass3_Sub27_Sub1_1.aBoolean382 = local80;
		return;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!hga;")
	public static RuntimeException_Sub1 method2238(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString40 = local9.aString40 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
