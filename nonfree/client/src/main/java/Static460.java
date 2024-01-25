import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "[Lclient!ci;")
	public static Class50[] aClass50Array4;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Lclient!ga;")
	public static Class111 aClass111_108;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "[Lclient!pm;")
	public static final Class259[] aClass259Array1 = new Class259[35];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Z")
	public static boolean method6537(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
	public static void method6538() {
		Static328.aClass365Array1 = null;
		Static121.method2073(Static300.anInt5516, 0, Static443.anInt7718, 0, -1, 0, Static219.anInt4263, 0);
		if (Static328.aClass365Array1 != null) {
			Static66.method1434(0, Static291.anInt5362, Static300.anInt5516, Static443.anInt7718, -1412584499, Static482.anInt8056, Static328.aClass365Array1, 0, Static394.aClass365_11.anInt9600);
			Static328.aClass365Array1 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(JIII)V")
	public static void method6539(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(24) int local24 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static493.method6900(0, 0, arg2, true, local17, local10, arg1, 0);
			return;
		}
		@Pc(59) Class306 local59 = Static146.aClass214_1.method4897(local24);
		@Pc(72) int local72;
		@Pc(69) int local69;
		if (local17 == 0 || local17 == 2) {
			local72 = local59.anInt8385;
			local69 = local59.anInt8414;
		} else {
			local69 = local59.anInt8385;
			local72 = local59.anInt8414;
		}
		@Pc(83) int local83 = local59.anInt8383;
		if (local17 != 0) {
			local83 = (local83 << local17 & 0xF) + (local83 >> 4 - local17);
		}
		Static493.method6900(local69, local83, arg2, true, 0, 0, arg1, local72);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIILclient!ia;Lclient!ia;)V")
	public static void method6541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub2_Sub2 arg3, @OriginalArg(4) Class20_Sub2_Sub2 arg4) {
		@Pc(4) Class293 local4 = Static528.method7221(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass20_Sub2_Sub2_2 = arg3;
		local4.aClass20_Sub2_Sub2_1 = arg4;
		@Pc(19) int local19 = Static20.aClass17Array1 == Static499.aClass17Array3 ? 1 : 0;
		if (!arg3.method7249()) {
			Static379.aClass20_Sub2ArrayArray2[local19][Static431.anIntArray499[local19]++] = arg3;
		} else if (arg3.method7256()) {
			Static386.aClass20_Sub2ArrayArray3[local19][Static288.anIntArray327[local19]++] = arg3;
		} else {
			Static166.aClass20_Sub2ArrayArray1[local19][Static464.anIntArray526[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7249()) {
			if (arg4.method7256()) {
				Static386.aClass20_Sub2ArrayArray3[local19][Static288.anIntArray327[local19]++] = arg4;
				return;
			}
			Static166.aClass20_Sub2ArrayArray1[local19][Static464.anIntArray526[local19]++] = arg4;
			return;
		}
		Static379.aClass20_Sub2ArrayArray2[local19][Static431.anIntArray499[local19]++] = arg4;
	}
}
