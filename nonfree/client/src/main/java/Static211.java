import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
	public static int anInt4227;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
	public static void method3896() {
		Static368.aClass21_182.method844(5);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V")
	public static void method3897() {
		if (Static195.anInt3950 != 2) {
			try {
				Static381.method4930(Static48.aClient2, "tbrefresh");
			} catch (@Pc(25) Throwable local25) {
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILclient!ic;Lclient!fp;II)V")
	public static void method3898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) Class63 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static141.anInt3042 < 100) {
			Static343.method5737(arg3, arg2);
		}
		arg3.method4566(arg5, arg4, arg0 + arg5, arg1 + arg4);
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (Static141.anInt3042 < 100) {
			local40 = arg0 / 2 + arg5;
			arg3.method4653(arg5, arg4, arg0, arg1, -16777216, 0);
			local58 = arg1 / 2 + arg4 - 18 - 20;
			arg3.method4645(local40 - 152, local58, 304, 34, Static273.aColorArray2[Static240.anInt4896].getRGB(), 0);
			arg3.method4653(local40 - 150, local58 - -2, Static141.anInt3042 * 3, 30, Static137.aColorArray1[Static240.anInt4896].getRGB(), 0);
			Static340.aClass33_3.method6036(Static336.aColorArray3[Static240.anInt4896].getRGB(), local58 + 20, Static218.aClass106_149.method2927(Static254.anInt5172), -1, local40);
			return;
		}
		@Pc(113) int local113 = Static207.anInt4093 - (int) ((float) arg0 / Static269.aFloat26);
		local40 = Static299.anInt4033 + (int) ((float) arg1 / Static269.aFloat26);
		local58 = (int) ((float) arg0 / Static269.aFloat26) + Static207.anInt4093;
		Static64.anInt6831 = (int) ((float) (arg1 * 2) / Static269.aFloat26);
		Static87.anInt1922 = Static207.anInt4093 - (int) ((float) arg0 / Static269.aFloat26);
		Static120.anInt2631 = (int) ((float) (arg0 * 2) / Static269.aFloat26);
		@Pc(164) int local164 = Static299.anInt4033 - (int) ((float) arg1 / Static269.aFloat26);
		Static13.anInt335 = Static299.anInt4033 - (int) ((float) arg1 / Static269.aFloat26);
		Static269.method3039(Static269.anInt3320 + local113, Static269.anInt3314 + local40, Static269.anInt3320 + local58, local164 + Static269.anInt3314, arg5, arg4, arg5 + arg0, arg4 - -arg1 + 1);
		Static269.method3061(arg3);
		@Pc(202) Class42 local202 = Static269.method3046(arg3);
		Static101.method2226(arg3, local202);
		if (Static368.anInt7056 > 0) {
			Static227.anInt4587--;
			if (Static227.anInt4587 == 0) {
				Static227.anInt4587 = 20;
				Static368.anInt7056--;
			}
		}
		if (!Static291.aBoolean428) {
			return;
		}
		@Pc(235) int local235 = arg0 + arg5 - 5;
		@Pc(242) int local242 = arg4 + arg1 - 8;
		Static24.aClass33_1.method6025(local242, local235, 16776960, "Fps:" + Static45.anInt1172);
		@Pc(257) int local257 = local242 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(269) int local269 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(271) int local271 = 16776960;
		if (local269 > 65536) {
			local271 = 16711680;
		}
		Static24.aClass33_1.method6025(local257, local235, local271, "Mem:" + local269 + "k");
		local242 = local257 - 15;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ct;B)V")
	public static void method3899(@OriginalArg(0) Class30 arg0) {
		Static152.aClass30_43 = arg0;
		Static188.anInt3800 = Static152.aClass30_43.method1180(4);
	}
}
