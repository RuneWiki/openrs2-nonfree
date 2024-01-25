import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
	public static final int[] anIntArray393 = new int[2048];

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt4781 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!gh;I)V")
	public static void method4285(@OriginalArg(0) Class2_Sub15 arg0) {
		if (Static45.aClass188ArrayArrayArray5 == null) {
			return;
		}
		@Pc(8) Interface8 local8 = null;
		if (arg0.anInt2544 == 0) {
			local8 = (Interface8) Static94.method1598(arg0.anInt2543, arg0.anInt2548, arg0.anInt2545);
		}
		if (arg0.anInt2544 == 1) {
			local8 = (Interface8) Static204.method3744(arg0.anInt2543, arg0.anInt2548, arg0.anInt2545);
		}
		if (arg0.anInt2544 == 2) {
			local8 = (Interface8) Static278.method4615(arg0.anInt2543, arg0.anInt2548, arg0.anInt2545, td.class);
		}
		if (arg0.anInt2544 == 3) {
			local8 = (Interface8) Static266.method4518(arg0.anInt2543, arg0.anInt2548, arg0.anInt2545);
		}
		if (local8 == null) {
			arg0.anInt2537 = 0;
			arg0.anInt2540 = -1;
			arg0.anInt2546 = 0;
		} else {
			arg0.anInt2540 = local8.method6034();
			arg0.anInt2537 = local8.method6027();
			arg0.anInt2546 = local8.method6031();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
	public static void method4287() {
		Static77.method1332(Static134.aClass183_37);
		for (@Pc(22) Class2_Sub26 local22 = (Class2_Sub26) Static273.aClass243_20.method5975(); local22 != null; local22 = (Class2_Sub26) Static273.aClass243_20.method5973()) {
			if (!local22.method6126()) {
				local22 = (Class2_Sub26) Static273.aClass243_20.method5975();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt4142 == 0) {
				Static110.method2010(local22, true, true);
			}
		}
		if (Static392.aClass3_19 != null) {
			Static128.method2229(Static392.aClass3_19);
			Static392.aClass3_19 = null;
		}
	}
}
