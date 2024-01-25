import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!in", name = "g", descriptor = "I")
	public static int anInt3111 = 16777215;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	public static int anInt3113 = -1;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I")
	public static int method2382(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!hd;Lclient!hd;)V")
	public static void method2386(@OriginalArg(1) Class110 arg0, @OriginalArg(2) Class110 arg1) {
		Static448.method5935(Static57.aClass146_19);
		Static247.aClass4_Sub9_Sub2_2.method5047(arg1.anInt2675);
		Static247.aClass4_Sub9_Sub2_2.method5018(arg1.anInt2585);
		Static247.aClass4_Sub9_Sub2_2.method5055(arg0.anInt2588);
		Static247.aClass4_Sub9_Sub2_2.method5023(arg0.anInt2675);
		Static247.aClass4_Sub9_Sub2_2.method5029(arg1.anInt2588);
		Static247.aClass4_Sub9_Sub2_2.method5018(arg0.anInt2585);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!ga;Lclient!ya;IIIII)V")
	public static void method2387(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class135 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static69.anInt3214 < 100) {
			Static439.method5853(arg0, arg1);
		}
		arg1.OA(arg5, arg4, arg3 + arg5, arg2 + arg4);
		@Pc(34) int local34;
		@Pc(53) int local53;
		if (Static69.anInt3214 < 100) {
			local34 = arg5 + arg3 / 2;
			arg1.O(arg5, arg4, arg3, arg2, -16777216, 0);
			local53 = arg2 / 2 + arg4 - 18 - 20;
			arg1.method5354(local34 - 152, local53, 304, 34, Static428.aColorArray3[Static268.anInt4436].getRGB(), 0);
			arg1.O(local34 - 150, local53 + 2, Static69.anInt3214 * 3, 30, Static338.aColorArray2[Static268.anInt4436].getRGB(), 0);
			Static49.aClass123_1.method5788(local53 + 20, local34, -1, Static450.aClass15_133.method180(Static429.anInt6999), Static2.aColorArray1[Static268.anInt4436].getRGB());
			return;
		}
		@Pc(109) int local109 = Static54.anInt860 - (int) ((float) arg3 / Static292.aFloat74);
		local34 = Static458.anInt6588 + (int) ((float) arg2 / Static292.aFloat74);
		local53 = (int) ((float) arg3 / Static292.aFloat74) + Static54.anInt860;
		Static337.anInt5499 = Static458.anInt6588 - (int) ((float) arg2 / Static292.aFloat74);
		Static14.anInt195 = (int) ((float) (arg3 * 2) / Static292.aFloat74);
		@Pc(151) int local151 = Static458.anInt6588 - (int) ((float) arg2 / Static292.aFloat74);
		Static47.anInt737 = Static54.anInt860 - (int) ((float) arg3 / Static292.aFloat74);
		Static394.anInt2524 = (int) ((float) (arg2 * 2) / Static292.aFloat74);
		Static292.method4934(local109 + Static292.anInt6142, Static292.anInt6148 + local34, Static292.anInt6142 + local53, Static292.anInt6148 + local151, arg5, arg4, arg3 + arg5, arg4 + 1 - -arg2);
		Static292.method4950(arg1);
		@Pc(197) Class244 local197 = Static292.method4931(arg1);
		Static130.method1855(arg1, local197);
		if (Static90.anInt1730 > 0) {
			Static373.anInt6112--;
			if (Static373.anInt6112 == 0) {
				Static373.anInt6112 = 20;
				Static90.anInt1730--;
			}
		}
		if (!Static397.aBoolean449) {
			return;
		}
		@Pc(239) int local239 = arg5 + arg3 - 5;
		@Pc(245) int local245 = arg2 + arg4 - 8;
		Static283.aClass123_6.method5799("Fps:" + Static418.anInt7060, local245, 16776960, local239);
		@Pc(260) int local260 = local245 - 15;
		@Pc(262) Runtime local262 = Runtime.getRuntime();
		@Pc(271) int local271 = (int) ((local262.totalMemory() - local262.freeMemory()) / 1024L);
		@Pc(273) int local273 = 16776960;
		if (local271 > 65536) {
			local273 = 16711680;
		}
		Static283.aClass123_6.method5799("Mem:" + local271 + "k", local260, local273, local239);
		local245 = local260 - 15;
	}
}
