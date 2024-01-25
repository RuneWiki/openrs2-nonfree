import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
	public static int anInt5487;

	@OriginalMember(owner = "client!pt", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[100];

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILclient!ga;Lclient!ya;IBI)V")
	public static void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static69.anInt3429 < 100) {
			Static230.method3465(arg2, arg3);
		}
		arg3.OA(arg0, arg5, arg1 + arg0, arg4 + arg5);
		@Pc(33) int local33;
		@Pc(52) int local52;
		if (Static69.anInt3429 < 100) {
			local33 = arg1 / 2 + arg0;
			arg3.O(arg0, arg5, arg1, arg4, -16777216, 0);
			local52 = arg5 + arg4 / 2 - 18 - 20;
			arg3.method4312(local33 - 152, local52, 304, 34, Static164.aColorArray6[Static345.anInt5940].getRGB(), 0);
			arg3.O(local33 - 150, local52 + 2, Static69.anInt3429 * 3, 30, Static64.aColorArray3[Static345.anInt5940].getRGB(), 0);
			Static331.aClass46_10.method5056(local33, Static171.aColorArray5[Static345.anInt5940].getRGB(), local52 + 20, -1, Static96.aClass83_38.method2267(Static178.anInt3423));
			return;
		}
		@Pc(108) int local108 = Static314.anInt5471 - (int) ((float) arg1 / Static148.aFloat178);
		local33 = Static46.anInt5156 + (int) ((float) arg4 / Static148.aFloat178);
		local52 = (int) ((float) arg1 / Static148.aFloat178) + Static314.anInt5471;
		Static384.anInt6470 = (int) ((float) (arg4 * 2) / Static148.aFloat178);
		@Pc(146) int local146 = Static46.anInt5156 - (int) ((float) arg4 / Static148.aFloat178);
		Static455.anInt5537 = Static46.anInt5156 - (int) ((float) arg4 / Static148.aFloat178);
		Static17.anInt220 = (int) ((float) (arg1 * 2) / Static148.aFloat178);
		Static188.anInt5352 = Static314.anInt5471 - (int) ((float) arg1 / Static148.aFloat178);
		Static148.method4513(local108 + Static148.anInt5732, local33 + Static148.anInt5724, Static148.anInt5732 + local52, Static148.anInt5724 + local146, arg0, arg5, arg0 + arg1, arg4 + arg5 - -1);
		Static148.method4508(arg3);
		@Pc(201) Class183 local201 = Static148.method4501(arg3);
		Static382.method5042(local201, arg3);
		if (Static140.anInt2835 > 0) {
			Static274.anInt5136--;
			if (Static274.anInt5136 == 0) {
				Static274.anInt5136 = 20;
				Static140.anInt2835--;
			}
		}
		if (!Static325.aBoolean507) {
			return;
		}
		@Pc(232) int local232 = arg1 + arg0 - 5;
		@Pc(238) int local238 = arg4 + arg5 - 8;
		Static207.aClass46_9.method5059("Fps:" + Static213.anInt3956, local238, 16776960, local232);
		@Pc(253) int local253 = local238 - 15;
		@Pc(255) Runtime local255 = Runtime.getRuntime();
		@Pc(265) int local265 = (int) ((local255.totalMemory() - local255.freeMemory()) / 1024L);
		@Pc(267) int local267 = 16776960;
		if (local265 > 65536) {
			local267 = 16711680;
		}
		Static207.aClass46_9.method5059("Mem:" + local265 + "k", local253, local267, local232);
		local238 = local253 - 15;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!f;)Z")
	public static boolean method4210(@OriginalArg(1) Interface6 arg0) {
		@Pc(15) Class202 local15 = Static267.aClass262_2.method5560(arg0.method5350());
		if (local15.anInt5803 == -1) {
			return true;
		} else {
			@Pc(28) Class41 local28 = Static76.aClass265_2.method5588(local15.anInt5803);
			return local28.anInt1024 == -1 ? true : local28.method941();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZII)I")
	public static int method4212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static11.anIntArray10[arg1 & 0x3] : Static306.anIntArray359[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!fs;I)Lclient!gt;")
	public static Class89 method4213(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1) {
		@Pc(8) byte[] local8 = arg1.method2122(arg0);
		return local8 == null ? null : new Class89(local8);
	}
}
