import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "[I")
	public static int[] anIntArray383;

	@OriginalMember(owner = "client!t", name = "J", descriptor = "I")
	public static int anInt4133 = 0;

	@OriginalMember(owner = "client!t", name = "K", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1059 = Static8.method128(" loggt sich aus)3");

	@OriginalMember(owner = "client!t", name = "O", descriptor = "[I")
	public static int[] anIntArray382 = new int[32768];

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public static void method2829() {
		aClass18_1059 = null;
		anIntArray382 = null;
		anIntArray383 = null;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IIII)Lclient!ee;")
	public static Class1_Sub8 method2830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = new Class1_Sub8();
		local7.anInt1188 = arg1;
		local7.anInt1186 = arg0;
		Static155.aClass14_14.method570(local7, (long) arg2);
		Static48.method1039(arg1);
		Static175.method3162(arg1);
		@Pc(38) Class20 local38 = Static84.method1826(arg2);
		if (local38 != null) {
			Static152.method2858(local38);
		}
		if (Static161.aClass20_13 != null) {
			Static152.method2858(Static161.aClass20_13);
			Static161.aClass20_13 = null;
		}
		Static80.anInt2478 = 0;
		Static149.aBoolean185 = false;
		Static41.method817(Static132.anInt3760, Static124.anInt3518, Static110.anInt3236, Static32.anInt1094);
		if (Static73.anInt1882 != -1) {
			Static58.method1198(Static73.anInt1882, 1);
		}
		return local7;
	}
}
