import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "[I")
	public static int[] anIntArray526;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_11 = new Class181(6, 4);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)I")
	public static int method6581() {
		@Pc(5) Class326 local5 = Static11.aClass326_1;
		synchronized (Static11.aClass326_1) {
			return Static11.aClass326_1.method7237();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLclient!eg;)V")
	public static void method6582(@OriginalArg(1) Class1_Sub8 arg0) {
		arg0.aBoolean522 = false;
		if (arg0.aClass1_Sub40_5 != null) {
			arg0.aClass1_Sub40_5.anInt7665 = 0;
		}
		for (@Pc(18) Class1_Sub8 local18 = arg0.method6026(); local18 != null; local18 = arg0.method6023()) {
			method6582(local18);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method6583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static487.anInt8210 <= arg3 && arg3 <= Static278.anInt5111 && Static487.anInt8210 <= arg1 && arg1 <= Static278.anInt5111 && arg5 >= Static487.anInt8210 && arg5 <= Static278.anInt5111 && Static487.anInt8210 <= arg0 && Static278.anInt5111 >= arg0 && Static126.anInt6658 <= arg6 && arg6 <= Static494.anInt8295 && Static126.anInt6658 <= arg4 && Static494.anInt8295 >= arg4 && Static126.anInt6658 <= arg8 && arg8 <= Static494.anInt8295 && arg7 >= Static126.anInt6658 && arg7 <= Static494.anInt8295) {
			Static105.method1878(arg2, arg1, arg4, arg0, arg7, arg3, arg5, arg8, arg6);
		} else {
			Static367.method5370(arg4, arg6, arg8, arg0, arg2, arg7, arg1, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
	public static void method6584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static479.aClass1_Sub7_Sub1_1.anInt3103 * arg2 >> 8;
		if (local10 != 0 && arg0 != -1) {
			Static151.method2397(Static116.aClass111_25, local10, arg0);
			Static571.aBoolean680 = true;
		}
	}
}
