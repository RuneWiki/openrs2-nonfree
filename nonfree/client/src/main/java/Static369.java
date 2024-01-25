import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	public static int anInt7338;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!mi;")
	public static Class46 aClass46_24;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public static int anInt7335 = -1;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public static int anInt7337 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)I")
	public static int method6236(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static66.anInt10075;
		if (local5 == 0) {
			return arg0 ? 0 : Static114.anInt3048;
		} else if (local5 == 1) {
			return Static114.anInt3048;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ha;IBIII)V")
	public static void method6237(@OriginalArg(0) Class20 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		Static214.aClass20_7 = arg0;
		Static251.aClass30_9 = Static214.aClass20_7.method7257();
		Static244.aClass30_8 = Static214.aClass20_7.method7257();
		Static475.aClass30_12 = Static214.aClass20_7.method7257();
		Static83.anInt2550 = 100;
		Static66.anInt10075 = 0;
		Static495.anInt9127 = 100;
		Static380.anIntArray468 = null;
		Static326.anInterface14Array1 = null;
		Static317.method5512(arg1, arg2);
		Static224.anInt4987 = -1;
		Static619.anInt10830 = -1;
		Static293.anInt6193 = -1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method6238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg3 + arg1;
		@Pc(12) int local12 = arg0 + arg4;
		@Pc(16) int local16 = arg2 + arg5;
		if (!Static549.method8195(arg3, local8, arg2, arg3, local16, local12, local12, local12, local16)) {
			return false;
		} else if (Static549.method8195(arg3, local8, arg2, local8, local16, local12, local12, local12, arg2)) {
			if (Static393.anInt7549 > arg3) {
				if (!Static549.method8195(arg3, arg3, local16, arg3, local16, local12, local12, arg4, arg2)) {
					return false;
				}
				if (!Static549.method8195(arg3, arg3, local16, arg3, arg2, local12, arg4, arg4, arg2)) {
					return false;
				}
			} else if (!Static549.method8195(local8, local8, local16, local8, local16, local12, local12, arg4, arg2)) {
				return false;
			} else if (!Static549.method8195(local8, local8, local16, local8, arg2, local12, arg4, arg4, arg2)) {
				return false;
			}
			if (arg2 >= Static574.anInt10281) {
				if (!Static549.method8195(arg3, local8, local16, arg3, local16, local12, local12, arg4, local16)) {
					return false;
				}
				if (!Static549.method8195(arg3, local8, local16, local8, local16, local12, arg4, arg4, local16)) {
					return false;
				}
			} else if (!Static549.method8195(arg3, local8, arg2, arg3, arg2, local12, local12, arg4, arg2)) {
				return false;
			} else if (!Static549.method8195(arg3, local8, arg2, local8, arg2, local12, arg4, arg4, arg2)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
