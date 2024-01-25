import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "S")
	public static short aShort43 = 256;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)Lclient!nd;")
	public static Class235_Sub1 method2474() {
		Static450.anInt10325 = 0;
		return Static96.method1572();
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!gga;I)Lclient!eha;")
	public static Class84 method2475(@OriginalArg(0) Class6_Sub23 arg0) {
		@Pc(15) int local15 = arg0.method8369();
		return new Class84(local15);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg0 < 1 || arg4 > Static491.anInt9856 - 2 || arg0 > Static393.anInt6574 - 2) {
			return;
		}
		@Pc(27) int local27 = arg1;
		if (arg1 < 3 && Static250.method3635(arg4, arg0)) {
			local27 = arg1 + 1;
		}
		if (Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 0 && !Static369.method5324(local27, Static216.anInt3669, arg0, arg4)) {
			return;
		}
		if (Static441.aClass351ArrayArrayArray1 == null) {
			return;
		}
		Static577.aClass310_Sub1_2.method7931(arg1, arg0, arg6, arg4, Static83.aClass324Array1[arg1], Static546.aClass132_13);
		if (arg3 < 0) {
			return;
		}
		@Pc(78) int local78 = Static96.aClass6_Sub22_7.aClass29_Sub9_1.method2300();
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub9_1, 1);
		Static577.aClass310_Sub1_2.method7930(arg2, local27, arg5, arg1, arg3, Static546.aClass132_13, arg4, arg0, Static83.aClass324Array1[arg1], arg7);
		Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub9_1, local78);
		return;
	}
}
