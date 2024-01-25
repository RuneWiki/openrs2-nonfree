import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public static void method4346() {
		Static343.anIntArray628 = Static282.method4480(0.4F);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Lclient!sk;")
	public static Class28_Sub2 method4347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass28_Sub2_2 == null ? null : local7.aClass28_Sub2_2;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!np;ILclient!b;Lclient!b;)V")
	public static void method4348(@OriginalArg(0) Class155 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class20 arg2) {
		Static316.aClass190_8 = Static93.method1548(arg2, Static126.anInt2390);
		Static71.aClass150_1 = arg0.method4888(Static316.aClass190_8, Static402.method2809(arg1, Static126.anInt2390));
		Static61.aClass190_1 = Static93.method1548(arg2, Static98.anInt1954);
		Static140.aClass150_3 = arg0.method4888(Static61.aClass190_1, Static402.method2809(arg1, Static98.anInt1954));
		Static366.aClass190_7 = Static93.method1548(arg2, Static120.anInt2264);
		Static95.aClass150_6 = arg0.method4888(Static366.aClass190_7, Static402.method2809(arg1, Static120.anInt2264));
	}
}
