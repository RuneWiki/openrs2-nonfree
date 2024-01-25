import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "Lclient!gj;")
	public static Class86 aClass86_7;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!re;")
	public static Class199 aClass199_4;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	public static int anInt4592 = 255;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_66 = new Class183(67, -1);

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	public static int anInt4595 = -2;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
	public static int anInt4596 = -1;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "[I")
	public static final int[] anIntArray380 = new int[32];

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!eg;Lclient!oj;IIB)V")
	public static void method4136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) Class48 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static344.anInt6330 < 100) {
			Static60.method1149(arg3, arg2);
		}
		arg3.method2496(arg5, arg0, arg5 + arg1, arg0 - -arg4);
		@Pc(35) int local35;
		@Pc(46) int local46;
		if (Static344.anInt6330 < 100) {
			local35 = arg5 + arg1 / 2;
			local46 = arg4 / 2 + arg0 - 20 - 18;
			arg3.method2470(arg5, arg0, arg1, arg4, -16777216, 0);
			arg3.method2534(local35 - 152, local46, 304, 34, Static330.aColorArray3[Static217.anInt4400].getRGB(), 0);
			arg3.method2470(local35 - 150, local46 - -2, Static344.anInt6330 * 3, 30, Static183.aColorArray1[Static217.anInt4400].getRGB(), 0);
			Static180.aClass44_4.method4644(Static257.aColorArray2[Static217.anInt4400].getRGB(), -1, local46 + 20, local35, Static317.aClass62_211.method1389(Static200.anInt4144));
			return;
		}
		@Pc(110) int local110 = Static375.anInt6902 - (int) ((float) arg1 / Static20.aFloat52);
		local35 = Static208.anInt4249 + (int) ((float) arg4 / Static20.aFloat52);
		local46 = Static375.anInt6902 + (int) ((float) arg1 / Static20.aFloat52);
		Static221.anInt6801 = Static208.anInt4249 - (int) ((float) arg4 / Static20.aFloat52);
		Static227.anInt4588 = (int) ((float) (arg1 * 2) / Static20.aFloat52);
		Static391.anInt7128 = (int) ((float) (arg4 * 2) / Static20.aFloat52);
		Static320.anInt7071 = Static375.anInt6902 - (int) ((float) arg1 / Static20.aFloat52);
		@Pc(182) int local182 = Static208.anInt4249 - (int) ((float) arg4 / Static20.aFloat52);
		Static20.method4151(Static20.anInt4606 + local110, local35 + Static20.anInt4611, local46 + Static20.anInt4606, local182 - -Static20.anInt4611, arg5, arg0, arg1 + arg5, arg0 - -arg4 + 1);
		Static20.method4140(arg3);
		@Pc(212) Class238 local212 = Static20.method4149(arg3);
		Static205.method3758(arg3, local212);
		if (Static11.anInt211 > 0) {
			Static313.anInt5728--;
			if (Static313.anInt5728 == 0) {
				Static11.anInt211--;
				Static313.anInt5728 = 20;
			}
		}
		if (!Static25.aBoolean303) {
			return;
		}
		@Pc(244) int local244 = arg5 + arg1 - 5;
		@Pc(250) int local250 = arg4 + arg0 - 8;
		Static31.aClass44_1.method4645("Fps:" + Static147.anInt3136, local244, 16776960, local250);
		@Pc(265) int local265 = local250 - 15;
		@Pc(267) Runtime local267 = Runtime.getRuntime();
		@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
		@Pc(278) int local278 = 16776960;
		if (local276 > 65536) {
			local278 = 16711680;
		}
		Static31.aClass44_1.method4645("Mem:" + local276 + "k", local244, local278, local265);
		local250 = local265 - 15;
	}
}
