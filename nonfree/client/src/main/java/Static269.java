import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
	public static int anInt4155;

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray5 = new int[2][][];

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIILclient!ha;ILclient!d;)V")
	public static void method3819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface4 arg5) {
		if (Static147.anInt2696 < 100) {
			Static510.method6918(arg3, arg5);
		}
		arg3.KA(arg1, arg0, arg2 + arg1, arg0 - -arg4);
		@Pc(36) int local36;
		@Pc(55) int local55;
		if (Static147.anInt2696 < 100) {
			local36 = arg2 / 2 + arg1;
			arg3.aa(arg1, arg0, arg2, arg4, -16777216, 0);
			local55 = arg4 / 2 + arg0 - 18 - 20;
			arg3.method9403(local36 - 152, local55, 304, 34, Static166.aColorArray2[Static667.anInt10219].getRGB(), 0);
			arg3.aa(local36 - 150, local55 + 2, Static147.anInt2696 * 3, 30, Static581.aColorArray3[Static667.anInt10219].getRGB(), 0);
			Static561.aClass57_10.method9146(local36, local55 + 20, Static48.aColorArray1[Static667.anInt10219].getRGB(), Static430.aClass257_18.method5699(Static456.anInt7118), -1);
			return;
		}
		@Pc(112) int local112 = Static550.anInt8467 - (int) ((float) arg2 / Static327.aFloat32);
		local36 = Static90.anInt4562 + (int) ((float) arg4 / Static327.aFloat32);
		local55 = Static550.anInt8467 + (int) ((float) arg2 / Static327.aFloat32);
		Static353.anInt5597 = (int) ((float) (arg4 * 2) / Static327.aFloat32);
		@Pc(146) int local146 = Static90.anInt4562 - (int) ((float) arg4 / Static327.aFloat32);
		Static617.anInt9353 = Static90.anInt4562 - (int) ((float) arg4 / Static327.aFloat32);
		Static353.anInt5602 = (int) ((float) (arg2 * 2) / Static327.aFloat32);
		Static555.anInt7633 = Static550.anInt8467 - (int) ((float) arg2 / Static327.aFloat32);
		Static327.method1019(Static327.anInt1084 + local112, local36 - -Static327.anInt1076, local55 + Static327.anInt1084, local146 + Static327.anInt1076, arg1, arg0, arg1 + arg2, arg4 + arg0 - -1);
		Static327.method1006(arg3);
		@Pc(205) Class342 local205 = Static327.method1026(arg3);
		Static591.method7612(local205, arg3);
		if (Static412.anInt6360 > 0) {
			Static489.anInt10872--;
			if (Static489.anInt10872 == 0) {
				Static412.anInt6360--;
				Static489.anInt10872 = 20;
			}
		}
		if (!Static714.aBoolean755) {
			return;
		}
		@Pc(237) int local237 = arg1 + arg2 - 5;
		@Pc(243) int local243 = arg0 + arg4 - 8;
		Static480.aClass57_9.method9134(local243, -1, local237, "Fps:" + Static605.anInt9179, 16776960);
		@Pc(260) int local260 = local243 - 15;
		@Pc(262) Runtime local262 = Runtime.getRuntime();
		@Pc(271) int local271 = (int) ((local262.totalMemory() - local262.freeMemory()) / 1024L);
		@Pc(273) int local273 = 16776960;
		if (local271 > 65536) {
			local273 = 16711680;
		}
		Static480.aClass57_9.method9134(local260, -1, local237, "Mem:" + local271 + "k", local273);
		local243 = local260 - 15;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIIB)I")
	public static int method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = arg4 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(18) int local18 = arg0;
			arg0 = arg5;
			arg5 = local18;
		}
		if (local11 == 0) {
			return arg1;
		} else if (local11 == 1) {
			return arg3;
		} else if (local11 == 2) {
			return 1 + 7 - arg0 - arg1;
		} else {
			return 7 + 1 - arg3 - arg5;
		}
	}
}
