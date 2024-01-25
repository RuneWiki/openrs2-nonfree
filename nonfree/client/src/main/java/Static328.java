import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	public static int anInt6643;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	public static int anInt6644;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!tq;")
	public static Class191 aClass191_211;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILclient!ul;Lclient!ae;II)V")
	public static void method5758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(4) Class4 arg4, @OriginalArg(6) int arg5) {
		if (Static85.anInt1831 < 100) {
			Static169.method3190(arg4, arg3);
		}
		arg4.method4252(arg1, arg0, arg1 + arg5, arg2 + arg0);
		@Pc(34) int local34;
		@Pc(44) int local44;
		if (Static85.anInt1831 < 100) {
			local34 = arg1 + arg5 / 2;
			local44 = arg0 + arg2 / 2 - 18 - 20;
			arg4.method4246(arg1, arg0, arg5, arg2, -16777216, 0);
			arg4.method4287(local34 - 152, local44, 304, 34, Static34.aColorArray1[Static95.anInt6376].getRGB(), 0);
			arg4.method4246(local34 - 150, local44 + 2, Static85.anInt1831 * 3, 30, Static187.aColorArray3[Static95.anInt6376].getRGB(), 0);
			Static56.aClass37_1.method5263(local44 + 20, Static169.aColorArray2[Static95.anInt6376].getRGB(), Static8.aClass93_1.method2819(Static21.anInt455), local34, -1);
			return;
		}
		@Pc(107) int local107 = Static210.anInt4066 - (int) ((float) arg5 / Static127.aFloat34);
		local34 = Static109.anInt2412 + (int) ((float) arg2 / Static127.aFloat34);
		local44 = Static210.anInt4066 + (int) ((float) arg5 / Static127.aFloat34);
		@Pc(134) int local134 = Static109.anInt2412 - (int) ((float) arg2 / Static127.aFloat34);
		Static178.anInt3561 = (int) ((float) (arg2 * 2) / Static127.aFloat34);
		Static175.anInt3545 = (int) ((float) (arg5 * 2) / Static127.aFloat34);
		Static196.anInt3828 = Static109.anInt2412 - (int) ((float) arg2 / Static127.aFloat34);
		Static341.anInt6839 = Static210.anInt4066 - (int) ((float) arg5 / Static127.aFloat34);
		Static127.method1630(local107 + Static127.anInt1568, local34 + Static127.anInt1567, local44 + Static127.anInt1568, local134 + Static127.anInt1567, arg1, arg0, arg5 + arg1, arg0 + 1 - -arg2);
		Static127.method1615(arg4);
		@Pc(206) Class216 local206 = Static127.method1619(arg4);
		Static121.method2511(arg4, local206);
		if (Static104.anInt5551 > 0) {
			Static203.anInt3379--;
			if (Static203.anInt3379 == 0) {
				Static104.anInt5551--;
				Static203.anInt3379 = 20;
			}
		}
		if (!Static147.aBoolean25) {
			return;
		}
		@Pc(234) int local234 = arg1 + arg5 - 5;
		@Pc(240) int local240 = arg2 + arg0 - 8;
		Static193.aClass37_2.method5259("Fps:" + Static265.anInt6827, 16776960, local240, local234);
		@Pc(255) int local255 = local240 - 15;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(266) int local266 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		@Pc(268) int local268 = 16776960;
		if (local266 > 65536) {
			local268 = 16711680;
		}
		Static193.aClass37_2.method5259("Mem:" + local266 + "k", local268, local255, local234);
		local240 = local255 - 15;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public static int method5760(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)Lclient!bj;")
	public static Class20_Sub1 method5761(@OriginalArg(1) int arg0) {
		return Static322.aBoolean573 && arg0 >= Static98.anInt2208 && arg0 <= Static161.anInt3258 ? Static181.aClass20_Sub1Array2[arg0 - Static98.anInt2208] : null;
	}
}
