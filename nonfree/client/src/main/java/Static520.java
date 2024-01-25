import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
	public static int anInt8806;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)V")
	public static void method7576(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub7_Sub5 local11 = Static138.method2377(17, arg0);
		local11.method1473();
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIILclient!ha;ILclient!d;)V")
	public static void method7577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class82 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface5 arg5) {
		if (Static214.anInt4427 < 100) {
			Static171.method2836(arg3, arg5);
		}
		arg3.KA(arg4, arg0, arg2 + arg4, arg1 + arg0);
		@Pc(36) int local36;
		@Pc(55) int local55;
		if (Static214.anInt4427 < 100) {
			local36 = arg4 + arg2 / 2;
			arg3.aa(arg4, arg0, arg2, arg1, -16777216, 0);
			local55 = arg0 + arg1 / 2 - 18 - 20;
			arg3.method6179(local36 - 152, local55, 304, 34, Static210.aColorArray2[Static192.anInt3598].getRGB(), 0);
			arg3.aa(local36 - 150, local55 - -2, Static214.anInt4427 * 3, 30, Static521.aColorArray3[Static192.anInt3598].getRGB(), 0);
			Static374.aClass63_9.method7754(Static369.aClass235_21.method5893(Static455.anInt7738), local55 + 20, Static158.aColorArray1[Static192.anInt3598].getRGB(), -1, local36);
			return;
		}
		@Pc(114) int local114 = Static122.anInt2649 - (int) ((float) arg2 / Static598.aFloat67);
		local36 = Static168.anInt3275 + (int) ((float) arg1 / Static598.aFloat67);
		local55 = Static122.anInt2649 + (int) ((float) arg2 / Static598.aFloat67);
		@Pc(139) int local139 = Static168.anInt3275 - (int) ((float) arg1 / Static598.aFloat67);
		Static192.anInt3594 = (int) ((float) (arg2 * 2) / Static598.aFloat67);
		Static3.anInt26 = Static122.anInt2649 - (int) ((float) arg2 / Static598.aFloat67);
		Static255.anInt4981 = Static168.anInt3275 - (int) ((float) arg1 / Static598.aFloat67);
		Static124.anInt2655 = (int) ((float) (arg1 * 2) / Static598.aFloat67);
		Static598.method2549(Static598.anInt2992 + local114, Static598.anInt2995 + local36, local55 + Static598.anInt2992, local139 + Static598.anInt2995, arg4, arg0, arg4 + arg2, arg0 + 1 - -arg1);
		Static598.method2536(arg3);
		@Pc(207) Class216 local207 = Static598.method2544(arg3);
		Static634.method8545(local207, arg3);
		if (Static476.anInt8998 > 0) {
			Static156.anInt3180--;
			if (Static156.anInt3180 == 0) {
				Static156.anInt3180 = 20;
				Static476.anInt8998--;
			}
		}
		if (!Static196.aBoolean264) {
			return;
		}
		@Pc(235) int local235 = arg4 + arg2 - 5;
		@Pc(241) int local241 = arg0 + arg1 - 8;
		Static232.aClass63_6.method7752(local235, 16776960, local241, "Fps:" + Static557.anInt9262, -1);
		@Pc(256) int local256 = local241 - 15;
		@Pc(258) Runtime local258 = Runtime.getRuntime();
		@Pc(268) int local268 = (int) ((local258.totalMemory() - local258.freeMemory()) / 1024L);
		@Pc(270) int local270 = 16776960;
		if (local268 > 65536) {
			local270 = 16711680;
		}
		Static232.aClass63_6.method7752(local235, local270, local256, "Mem:" + local268 + "k", -1);
		local241 = local256 - 15;
	}
}
