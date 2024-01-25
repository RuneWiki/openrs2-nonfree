import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static final int anInt67 = 1337;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method53() {
		if (Static322.aBoolean623) {
			Static322.aBoolean623 = false;
			Static138.aClass6_27 = null;
			Static31.aClass6_9 = null;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	public static void method54(@OriginalArg(1) int arg0) {
		Static67.anInt1245 = arg0;
		Static284.aClass102_36.method2271();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!l;BIIILclient!za;)V")
	public static void method57(@OriginalArg(0) int arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class34 arg5) {
		if (Static442.anInt7365 < 100) {
			Static399.method5199(arg1, arg5);
		}
		arg5.ba(arg0, arg4, arg0 + arg2, arg3 + arg4);
		@Pc(33) int local33;
		@Pc(52) int local52;
		if (Static442.anInt7365 < 100) {
			local33 = arg2 / 2 + arg0;
			arg5.P(arg0, arg4, arg2, arg3, -16777216, 0);
			local52 = arg4 + arg3 / 2 - 20 - 18;
			arg5.method5769(local33 - 152, local52, 304, 34, Static257.aColorArray84[Static297.anInt5867].getRGB(), 0);
			arg5.P(local33 - 150, local52 - -2, Static442.anInt7365 * 3, 30, Static339.aColorArray104[Static297.anInt5867].getRGB(), 0);
			Static121.aClass76_2.method4594(-1, Static303.aColorArray130[Static297.anInt5867].getRGB(), local33, Static299.aClass119_178.method2673(Static394.anInt6582), local52 + 20);
			return;
		}
		@Pc(107) int local107 = Static441.anInt7355 - (int) ((float) arg2 / Static167.aFloat24);
		local33 = (int) ((float) arg3 / Static167.aFloat24) + Static169.anInt2773;
		local52 = (int) ((float) arg2 / Static167.aFloat24) + Static441.anInt7355;
		Static360.anInt6147 = (int) ((float) (arg3 * 2) / Static167.aFloat24);
		Static204.anInt3568 = Static441.anInt7355 - (int) ((float) arg2 / Static167.aFloat24);
		Static217.anInt3902 = Static169.anInt2773 - (int) ((float) arg3 / Static167.aFloat24);
		Static411.anInt6756 = (int) ((float) (arg2 * 2) / Static167.aFloat24);
		@Pc(172) int local172 = Static169.anInt2773 - (int) ((float) arg3 / Static167.aFloat24);
		Static167.method1775(local107 + Static167.anInt2089, local33 - -Static167.anInt2099, Static167.anInt2089 + local52, Static167.anInt2099 + local172, arg0, arg4, arg0 + arg2, arg4 + 1 - -arg3);
		Static167.method1763(arg5);
		@Pc(203) Class227 local203 = Static167.method1771(arg5);
		Static242.method3488(arg5, local203);
		if (Static154.anInt2613 > 0) {
			Static287.anInt5028--;
			if (Static287.anInt5028 == 0) {
				Static287.anInt5028 = 20;
				Static154.anInt2613--;
			}
		}
		if (!Static303.aBoolean817) {
			return;
		}
		@Pc(234) int local234 = arg2 + arg0 - 5;
		@Pc(241) int local241 = arg4 + arg3 - 8;
		Static437.aClass76_4.method4586(local234, "Fps:" + Static37.anInt673, local241, 16776960);
		@Pc(256) int local256 = local241 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static437.aClass76_4.method4586(local234, "Mem:" + local267 + "k", local256, local269);
		local241 = local256 - 15;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ir;Z)I")
	public static int method58(@OriginalArg(0) Class25_Sub5_Sub1_Sub1 arg0) {
		@Pc(8) Class54 local8 = arg0.aClass54_1;
		if (local8.anIntArray67 != null) {
			local8 = local8.method1148(Static320.aClass249_2);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local8.anInt1341;
		@Pc(34) Class236 local34 = arg0.method3428();
		if (arg0.aBoolean483) {
			local30 = local8.anInt1332;
		} else if (arg0.anInt4287 == local34.anInt6463 || local34.anInt6458 == arg0.anInt4287 || local34.anInt6477 == arg0.anInt4287 || local34.anInt6452 == arg0.anInt4287) {
			local30 = local8.anInt1351;
		} else if (local34.anInt6470 == arg0.anInt4287 || local34.anInt6454 == arg0.anInt4287 || arg0.anInt4287 == local34.anInt6441 || local34.anInt6466 == arg0.anInt4287) {
			local30 = local8.anInt1328;
		}
		return local30;
	}
}
