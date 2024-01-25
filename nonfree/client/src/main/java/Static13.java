import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public static int anInt328;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public static int anInt330;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "[S")
	public static short[] aShortArray4;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "[I")
	public static final int[] anIntArray21 = new int[6];

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_1 = new Class237(61, 2);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!qa;ILclient!m;III)V")
	public static void method301(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static411.anInt7188 < 100) {
			Static233.method3449(arg3, arg1);
		}
		arg1.pa(arg2, arg4, arg2 + arg5, arg4 - -arg0);
		@Pc(35) int local35;
		@Pc(46) int local46;
		if (Static411.anInt7188 < 100) {
			local35 = arg2 + arg5 / 2;
			local46 = arg4 + arg0 / 2 - 20 - 18;
			arg1.NA(arg2, arg4, arg5, arg0, -16777216, 0);
			arg1.method4685(local35 - 152, local46, 304, 34, Static385.aColorArray4[Static15.anInt3203].getRGB(), 0);
			arg1.NA(local35 - 150, local46 + 2, Static411.anInt7188 * 3, 30, Static10.aColorArray1[Static15.anInt3203].getRGB(), 0);
			Static139.aClass129_1.method5828(local46 + 20, local35, Static317.aColorArray3[Static15.anInt3203].getRGB(), -1, Static348.aClass84_81.method1678(Static167.anInt3118));
			return;
		}
		@Pc(111) int local111 = Static46.anInt865 - (int) ((float) arg5 / Static7.aFloat39);
		local35 = Static151.anInt2577 + (int) ((float) arg0 / Static7.aFloat39);
		local46 = (int) ((float) arg5 / Static7.aFloat39) + Static46.anInt865;
		Static178.anInt3224 = (int) ((float) (arg0 * 2) / Static7.aFloat39);
		Static362.anInt6144 = Static151.anInt2577 - (int) ((float) arg0 / Static7.aFloat39);
		@Pc(152) int local152 = Static151.anInt2577 - (int) ((float) arg0 / Static7.aFloat39);
		Static246.anInt4386 = Static46.anInt865 - (int) ((float) arg5 / Static7.aFloat39);
		Static361.anInt6130 = (int) ((float) (arg5 * 2) / Static7.aFloat39);
		Static7.method2287(local111 + Static7.anInt2566, local35 + Static7.anInt2576, Static7.anInt2566 + local46, Static7.anInt2576 + local152, arg2, arg4, arg5 + arg2, arg4 - (-arg0 - 1));
		Static7.method2284(arg1);
		@Pc(198) Class266 local198 = Static7.method2277(arg1);
		Static160.method2425(local198, arg1);
		if (Static273.anInt4877 > 0) {
			Static397.anInt6910--;
			if (Static397.anInt6910 == 0) {
				Static397.anInt6910 = 20;
				Static273.anInt4877--;
			}
		}
		if (!Static195.aBoolean209) {
			return;
		}
		@Pc(230) int local230 = arg2 + arg5 - 5;
		@Pc(236) int local236 = arg4 + arg0 - 8;
		Static372.aClass129_6.method5834("Fps:" + Static14.anInt344, 16776960, local236, local230);
		@Pc(251) int local251 = local236 - 15;
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(262) int local262 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		@Pc(264) int local264 = 16776960;
		if (local262 > 65536) {
			local264 = 16711680;
		}
		Static372.aClass129_6.method5834("Mem:" + local262 + "k", local264, local251, local230);
		local236 = local251 - 15;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!jv;B)Z")
	public static boolean method302(@OriginalArg(0) Interface6 arg0) {
		@Pc(10) Class182 local10 = Static71.aClass105_6.method2336(arg0.method4665());
		if (local10.anInt5491 == -1) {
			return true;
		} else {
			@Pc(23) Class158 local23 = Static231.aClass126_3.method2905(local10.anInt5491);
			return local23.anInt4566 == -1 ? true : local23.method3739();
		}
	}
}
