import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!up", name = "k", descriptor = "Lclient!nq;")
	public static Class144 aClass144_103;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "[S")
	public static final short[] aShortArray105 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!up", name = "l", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_109 = new Class117(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!up", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[8];

	@OriginalMember(owner = "client!up", name = "n", descriptor = "I")
	public static final int anInt6287 = 0;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BIIII)V")
	public static void method5383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static271.anInt4338 / (float) Static271.anInt4331;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg0 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(40) int local40 = arg1 - (arg0 - local11) / 2;
		@Pc(48) int local48 = arg2 - (arg3 - local13) / 2;
		Static247.anInt4959 = local40 * Static271.anInt4331 / local11;
		Static155.anInt2944 = -1;
		Static140.anInt2591 = Static271.anInt4338 - local48 * Static271.anInt4338 / local13;
		Static307.anInt4795 = -1;
		Static32.method457();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IILclient!ja;ILclient!uo;IZ)V")
	public static void method5386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class129 arg4, @OriginalArg(5) int arg5) {
		if (Static145.anInt2660 < 100) {
			Static307.method4214(arg2, arg4);
		}
		arg4.method4952(arg1, arg0, arg1 + arg3, arg5 + arg0);
		@Pc(33) int local33;
		@Pc(53) int local53;
		if (Static145.anInt2660 < 100) {
			local33 = arg1 + arg3 / 2;
			arg4.method4945(arg1, arg0, arg3, arg5, -16777216, 0);
			local53 = arg0 + arg5 / 2 - 38;
			arg4.method5015(local33 - 152, local53, 304, 34, Static120.aColorArray2[Static186.anInt3765].getRGB(), 0);
			arg4.method4945(local33 - 150, local53 - -2, Static145.anInt2660 * 3, 30, Static224.aColorArray5[Static186.anInt3765].getRGB(), 0);
			Static106.aClass9_2.method3570(local33, local53 + 20, -1, Static257.aClass117_88.method2684(Static230.anInt4634), Static354.aColorArray6[Static186.anInt3765].getRGB());
			return;
		}
		@Pc(108) int local108 = Static247.anInt4959 - (int) ((float) arg3 / Static271.aFloat47);
		local33 = (int) ((float) arg5 / Static271.aFloat47) + Static140.anInt2591;
		local53 = (int) ((float) arg3 / Static271.aFloat47) + Static247.anInt4959;
		Static153.anInt2895 = (int) ((float) (arg3 * 2) / Static271.aFloat47);
		Static112.anInt2071 = Static247.anInt4959 - (int) ((float) arg3 / Static271.aFloat47);
		@Pc(150) int local150 = Static140.anInt2591 - (int) ((float) arg5 / Static271.aFloat47);
		Static195.anInt4518 = (int) ((float) (arg5 * 2) / Static271.aFloat47);
		Static175.anInt3454 = Static140.anInt2591 - (int) ((float) arg5 / Static271.aFloat47);
		Static271.method3805(Static271.anInt4332 + local108, Static271.anInt4339 + local33, local53 + Static271.anInt4332, Static271.anInt4339 + local150, arg1, arg0, arg3 + arg1, arg0 + (arg5 - -1));
		Static271.method3818(arg4);
		@Pc(205) Class16 local205 = Static271.method3810(arg4);
		Static98.method1460(local205, arg4);
		if (Static247.anInt4961 > 0) {
			Static292.anInt5791--;
			if (Static292.anInt5791 == 0) {
				Static292.anInt5791 = 20;
				Static247.anInt4961--;
			}
		}
		if (!Static215.aBoolean293) {
			return;
		}
		@Pc(233) int local233 = arg1 + arg3 - 5;
		@Pc(240) int local240 = arg0 + arg5 - 8;
		Static30.aClass9_1.method3571(local233, local240, 16776960, "Fps:" + Static347.anInt6638);
		@Pc(255) int local255 = local240 - 15;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		@Pc(269) int local269 = 16776960;
		if (local267 > 65536) {
			local269 = 16711680;
		}
		Static30.aClass9_1.method3571(local233, local255, local269, "Mem:" + local267 + "k");
		local240 = local255 - 15;
	}
}
