import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	public static int anInt1455;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "[I")
	public static final int[] anIntArray104 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static305.aClass1_Sub21_Sub2_3.method5757(168);
		Static305.aClass1_Sub21_Sub2_3.method5718(Static165.method2895(arg1) + 1);
		Static305.aClass1_Sub21_Sub2_3.method5749(arg0);
		Static305.aClass1_Sub21_Sub2_3.method5752(arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!lm;Lclient!ii;Lclient!lm;)V")
	public static void method1208(@OriginalArg(1) Class134 arg0, @OriginalArg(2) Class105 arg1, @OriginalArg(3) Class134 arg2) {
		Static273.aClass34_8 = Static140.method2320(Static142.anInt2786, arg2);
		Static294.aClass29_4 = arg1.method4264(Static273.aClass34_8, Static369.method5470(arg0, Static142.anInt2786));
		Static20.aClass34_1 = Static140.method2320(Static223.anInt1488, arg2);
		Static233.aClass29_2 = arg1.method4264(Static20.aClass34_1, Static369.method5470(arg0, Static223.anInt1488));
		Static81.aClass34_4 = Static140.method2320(Static117.anInt2266, arg2);
		Static286.aClass29_3 = arg1.method4264(Static81.aClass34_4, Static369.method5470(arg0, Static117.anInt2266));
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
	public static void method1209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass10_Sub4_2 != null) {
			local7.aClass10_Sub4_2 = null;
		}
		if (local7.aClass10_Sub4_1 != null) {
			local7.aClass10_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIBI)V")
	public static void method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg3) {
			Static139.method2312(arg3, arg4, arg0, arg2);
		} else if (arg0 - arg3 >= Static60.anInt1399 && arg0 + arg3 <= Static138.anInt6334 && arg4 - arg1 >= Static41.anInt1131 && arg1 + arg4 <= Static165.anInt3409) {
			Static346.method5793(arg1, arg3, arg4, arg2, arg0);
		} else {
			Static112.method1811(arg2, arg3, arg4, arg0, arg1);
		}
	}
}
