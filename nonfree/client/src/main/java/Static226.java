import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString98 = "glow2:";

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
	public static int anInt1976 = -1;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZIIIIILclient!og;)Lclient!rj;")
	public static Class2_Sub3_Sub1 method1672(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class126 arg5) {
		@Pc(18) int local18 = (arg4 << 17) + ((arg0 ? 65536 : 0) + arg2 + (arg3 << 19));
		@Pc(28) long local28 = (long) local18 * 3849834839L + (long) arg1 * 3147483667L;
		@Pc(38) Class2_Sub3_Sub1 local38 = (Class2_Sub3_Sub1) Static39.aClass46_6.method1074(local28);
		if (local38 != null) {
			return local38;
		}
		Static93.aBoolean161 = false;
		local38 = Static150.method2610(arg2, arg0, arg1, arg4, false, arg3, arg5, false);
		if (local38 != null && !Static93.aBoolean161) {
			Static39.aClass46_6.method1071(local38, local28);
		}
		return local38;
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
	public static void method1673() {
		if (Static42.aClass45_1 != null) {
			Static42.aClass45_1.method1045();
			Static42.aClass45_1 = null;
		}
		Static150.method2608();
		Static4.method120();
		@Pc(20) int local20;
		for (local20 = 0; local20 < 4; local20++) {
			Static98.aClass52Array1[local20].method1243();
		}
		Static150.method2607(false);
		System.gc();
		Static224.method3752();
		Static145.aBoolean257 = false;
		Static149.anInt3177 = -1;
		Static151.method2612(true);
		Static68.anInt1503 = 0;
		Static136.aBoolean237 = false;
		Static203.anInt4236 = 0;
		Static125.anInt5772 = 0;
		Static246.anInt5145 = 0;
		for (local20 = 0; local20 < Static289.aClass180Array1.length; local20++) {
			Static289.aClass180Array1[local20] = null;
		}
		Static68.anInt1507 = 0;
		Static71.anInt1550 = 0;
		for (local20 = 0; local20 < 2048; local20++) {
			Static212.aClass36_Sub3_Sub2Array1[local20] = null;
			Static294.aClass2_Sub26Array1[local20] = null;
		}
		for (local20 = 0; local20 < 32768; local20++) {
			Static201.aClass36_Sub3_Sub1Array1[local20] = null;
		}
		for (local20 = 0; local20 < 4; local20++) {
			for (@Pc(113) int local113 = 0; local113 < 104; local113++) {
				for (@Pc(118) int local118 = 0; local118 < 104; local118++) {
					Static208.aClass1ArrayArrayArray1[local20][local113][local118] = null;
				}
			}
		}
		Static181.method3135();
		Static65.anInt1459 = 0;
		Static180.method3132();
		Static254.method4108(true);
		try {
			Static303.method484("loggedout", Static299.aClass177_5.anApplet1);
		} catch (@Pc(161) Throwable local161) {
		}
	}
}
