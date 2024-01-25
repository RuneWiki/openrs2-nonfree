import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "[Lclient!ks;")
	public static Class60_Sub2_Sub1_Sub1[] aClass60_Sub2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILclient!lga;I)Lclient!hea;")
	public static Class6_Sub22 method3081(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1) {
		@Pc(14) byte[] local14 = arg1.method5275(arg0);
		return local14 == null ? null : new Class6_Sub22(local14);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIZIII)V")
	public static void method3085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static675.anInt5495 = arg1;
		Static193.anInt9225 = arg0;
		Static438.anInt7455 = arg4;
		Static414.anInt7188 = arg5;
		Static372.anInt9576 = arg3;
		if (arg2 && Static372.anInt9576 >= 100) {
			Static365.anInt6155 = Static675.anInt5495 * 512 + 256;
			Static475.anInt8090 = Static438.anInt7455 * 512 + 256;
			Static406.anInt7076 = Static248.method4318(Static365.anInt6155, Static504.anInt8428, Static475.anInt8090) - Static414.anInt7188;
		}
		Static526.anInt8626 = 2;
		Static16.anInt232 = -1;
		Static126.anInt2529 = -1;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 512 || arg4 < 512 || arg2 > Static29.anInt380 * 512 - 1024 || arg4 > Static327.anInt5650 * 512 - 1024) {
			Static609.anIntArray627[0] = Static609.anIntArray627[1] = -1;
			return;
		}
		@Pc(53) int local53 = Static248.method4318(arg4, arg0, arg2) - arg3;
		if (Static93.aBoolean113) {
			Static124.method2320(true);
		} else {
			Static373.aClass109_5.method4604(arg5, 0, 0);
			Static202.aClass75_5.method6695(Static373.aClass109_5);
		}
		if (Static490.aBoolean634) {
			Static202.aClass75_5.HA(arg2, local53, arg4, Static377.anInt6468, Static609.anIntArray627);
		} else {
			Static202.aClass75_5.da(arg2, local53, arg4, Static609.anIntArray627);
		}
		if (Static93.aBoolean113) {
			Static43.method538();
		} else {
			Static373.aClass109_5.method4604(-arg5, 0, 0);
			Static202.aClass75_5.method6695(Static373.aClass109_5);
		}
	}
}
