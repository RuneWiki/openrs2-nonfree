import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pba", name = "p", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!d;IIIIILclient!ha;)V")
	public static void method6410(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class87 arg5) {
		if (Static334.anInt6170 < 100) {
			Static411.method6323(arg5, arg0);
		}
		arg5.KA(arg4, arg3, arg1 + arg4, arg2 + arg3);
		@Pc(39) int local39;
		@Pc(59) int local59;
		if (Static334.anInt6170 < 100) {
			local39 = arg4 + arg1 / 2;
			arg5.aa(arg4, arg3, arg1, arg2, -16777216, 0);
			local59 = arg3 + arg2 / 2 - 20 - 18;
			arg5.method7954(local39 - 152, local59, 304, 34, Static642.aColorArray3[Static352.anInt6476].getRGB(), 0);
			arg5.aa(local39 - 150, local59 + 2, Static334.anInt6170 * 3, 30, Static597.aColorArray2[Static352.anInt6476].getRGB(), 0);
			Static4.aClass64_1.method7493(local39, local59 + 20, Static628.aClass369_18.method8475(Static377.anInt6756), Static419.aColorArray1[Static352.anInt6476].getRGB(), -1);
			return;
		}
		@Pc(115) int local115 = Static416.anInt7592 - (int) ((float) arg1 / Static292.aFloat211);
		local39 = Static304.anInt5622 + (int) ((float) arg2 / Static292.aFloat211);
		local59 = (int) ((float) arg1 / Static292.aFloat211) + Static416.anInt7592;
		@Pc(141) int local141 = Static304.anInt5622 - (int) ((float) arg2 / Static292.aFloat211);
		Static296.anInt5545 = (int) ((float) (arg1 * 2) / Static292.aFloat211);
		Static336.anInt6225 = (int) ((float) (arg2 * 2) / Static292.aFloat211);
		Static263.anInt5131 = Static416.anInt7592 - (int) ((float) arg1 / Static292.aFloat211);
		Static41.anInt942 = Static304.anInt5622 - (int) ((float) arg2 / Static292.aFloat211);
		Static292.method7041(Static292.anInt8373 + local115, local39 + Static292.anInt8380, Static292.anInt8373 + local59, local141 + Static292.anInt8380, arg4, arg3, arg4 + arg1, arg3 - -arg2 + 1);
		Static292.method7032(arg5);
		@Pc(204) Class238 local204 = Static292.method7035(arg5);
		Static133.method2596(arg5, local204);
		if (Static347.anInt6415 > 0) {
			Static59.anInt1226--;
			if (Static59.anInt1226 == 0) {
				Static59.anInt1226 = 20;
				Static347.anInt6415--;
			}
		}
		if (!Static465.aBoolean604) {
			return;
		}
		@Pc(235) int local235 = arg1 + arg4 - 5;
		@Pc(241) int local241 = arg2 + arg3 - 8;
		Static428.aClass64_11.method7504(local235, -1, 16776960, "Fps:" + Static93.anInt1859, local241);
		@Pc(256) int local256 = local241 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static428.aClass64_11.method7504(local235, -1, local269, "Mem:" + local267 + "k", local256);
		local241 = local256 - 15;
	}
}
