import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "Lclient!nh;")
	public static Class92 aClass92_8;

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_164 = new Class151(16, 1);

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_165 = new Class151(58, 7);

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "J")
	public static volatile long aLong228 = 0L;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
	public static int anInt7688 = -1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIBLclient!ha;ILclient!d;)V")
	public static void method6677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class33 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface9 arg5) {
		if (Static532.anInt8252 < 100) {
			Static436.method6561(arg3, arg5);
		}
		arg3.KA(arg1, arg2, arg0 + arg1, arg2 + arg4);
		@Pc(35) int local35;
		@Pc(54) int local54;
		if (Static532.anInt8252 < 100) {
			local35 = arg1 + arg0 / 2;
			arg3.aa(arg1, arg2, arg0, arg4, -16777216, 0);
			local54 = arg4 / 2 + arg2 - 38;
			arg3.method8142(local35 - 152, local54, 304, 34, Static197.aColorArray3[Static16.anInt306].getRGB(), 0);
			arg3.aa(local35 - 150, local54 + 2, Static532.anInt8252 * 3, 30, Static582.aColorArray4[Static16.anInt306].getRGB(), 0);
			Static344.aClass56_10.method8054(Static279.aClass179_18.method4066(Static164.anInt2984), -1, Static657.aColorArray5[Static16.anInt306].getRGB(), local54 + 20, local35);
			return;
		}
		@Pc(115) int local115 = Static253.anInt4127 - (int) ((float) arg0 / Static154.aFloat9);
		local35 = (int) ((float) arg4 / Static154.aFloat9) + Static379.anInt5638;
		local54 = (int) ((float) arg0 / Static154.aFloat9) + Static253.anInt4127;
		@Pc(140) int local140 = Static379.anInt5638 - (int) ((float) arg4 / Static154.aFloat9);
		Static601.anInt9245 = (int) ((float) (arg4 * 2) / Static154.aFloat9);
		Static644.anInt10134 = Static379.anInt5638 - (int) ((float) arg4 / Static154.aFloat9);
		Static635.anInt9893 = Static253.anInt4127 - (int) ((float) arg0 / Static154.aFloat9);
		Static642.anInt10085 = (int) ((float) (arg0 * 2) / Static154.aFloat9);
		Static154.method452(Static154.anInt437 + local115, local35 + Static154.anInt439, local54 + Static154.anInt437, local140 - -Static154.anInt439, arg1, arg2, arg1 + arg0, arg4 + (arg2 - -1));
		Static154.method466(arg3);
		@Pc(205) Class163 local205 = Static154.method455(arg3);
		Static361.method4809(arg3, local205);
		if (Static215.anInt3479 > 0) {
			Static300.anInt4711--;
			if (Static300.anInt4711 == 0) {
				Static300.anInt4711 = 20;
				Static215.anInt3479--;
			}
		}
		if (!Static492.aBoolean603) {
			return;
		}
		@Pc(237) int local237 = arg1 + arg0 - 5;
		@Pc(243) int local243 = arg2 + arg4 - 8;
		Static189.aClass56_5.method8057("Fps:" + Static555.anInt8559, local243, local237, 16776960, -1);
		@Pc(258) int local258 = local243 - 15;
		@Pc(260) Runtime local260 = Runtime.getRuntime();
		@Pc(269) int local269 = (int) ((local260.totalMemory() - local260.freeMemory()) / 1024L);
		@Pc(271) int local271 = 16776960;
		if (local269 > 65536) {
			local271 = 16711680;
		}
		Static189.aClass56_5.method8057("Mem:" + local269 + "k", local258, local237, local271, -1);
		local243 = local258 - 15;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBILclient!pc;I)Lclient!qt;")
	public static Class116_Sub2_Sub1 method6678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class33_Sub3 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean571 || Static211.method8993(arg2) && Static211.method8993(arg1)) {
			return new Class116_Sub2_Sub1(arg3, 3553, arg4, arg0, arg2, arg1, true);
		} else if (arg3.aBoolean568) {
			return new Class116_Sub2_Sub1(arg3, 34037, arg4, arg0, arg2, arg1, true);
		} else {
			return new Class116_Sub2_Sub1(arg3, arg4, arg0, arg2, arg1, Static162.method2593(arg2), Static162.method2593(arg1), true);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(JI)V")
	public static void method6679(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static207.method8099(arg0 - 1L);
			Static207.method8099(1L);
		} else {
			Static207.method8099(arg0);
		}
	}
}
