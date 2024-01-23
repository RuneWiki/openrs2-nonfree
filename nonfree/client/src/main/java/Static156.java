import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array4;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
	public static int anInt1710;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public static int anInt1708 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)V")
	public static void method1490(@OriginalArg(0) boolean arg0) {
		Static236.method3749(Static166.anInt3046, arg0, Static121.anInt2350, Static145.anInt2690);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static245.anInt1237 && Static28.anInt606 >= arg2 && arg0 >= Static245.anInt1237 && Static28.anInt606 >= arg0 && arg3 >= Static245.anInt1237 && Static28.anInt606 >= arg3 && arg1 >= Static245.anInt1237 && arg1 <= Static28.anInt606 && Static24.anInt556 <= arg6 && arg6 <= Static284.anInt5643 && arg4 >= Static24.anInt556 && Static284.anInt5643 >= arg4 && Static24.anInt556 <= arg5 && Static284.anInt5643 >= arg5 && Static24.anInt556 <= arg7 && arg7 <= Static284.anInt5643) {
			Static2.method58(arg0, arg1, arg2, arg6, arg4, arg8, arg7, arg3, arg5);
		} else {
			Static285.method4358(arg7, arg2, arg3, arg1, arg6, arg0, arg8, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIFIIIZ)[I")
	public static int[] method1492(@OriginalArg(3) float arg0) {
		@Pc(7) Class1_Sub1_Sub9 local7 = new Class1_Sub1_Sub9();
		local7.anInt1112 = (int) (arg0 * 4096.0F);
		local7.anInt1103 = 35;
		local7.aBoolean94 = true;
		local7.anInt1114 = 8;
		@Pc(31) int[] local31 = new int[2048];
		local7.anInt1106 = 4;
		local7.anInt1109 = 8;
		local7.method4454();
		Static130.method2052(2048, 1);
		local7.method902(local31, 0);
		return local31;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	public static void method1494(@OriginalArg(0) int arg0) {
		@Pc(12) Class112 local12 = Static179.aClass112_1;
		synchronized (Static179.aClass112_1) {
			Static113.anInt2117 = arg0;
		}
	}
}
