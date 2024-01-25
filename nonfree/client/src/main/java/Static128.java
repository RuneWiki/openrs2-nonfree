import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "[I")
	public static int[] anIntArray247;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "Lclient!cd;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
	public static int anInt3067;

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
	public static int anInt3069 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!faa;IZILclient!faa;IIIII)V")
	public static void method2791(@OriginalArg(0) Class47_Sub2_Sub3 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class47_Sub2_Sub3 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method4354();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class12 local20 = (Class12) Static45.aClass316_6.method7799((long) local7);
		if (local20 == null) {
			@Pc(27) Class242[] local27 = Static559.method5935(Static390.aClass160_80, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static478.aClass9_10.method7625(local27[0]);
			Static45.aClass316_6.method7792((long) local7, local20);
		}
		Static19.method827(arg5 >> 1, arg6 >> 1, arg2.anInt8189, arg2.anInt8191, arg2.method4350() * 64, arg2.aByte94, 0);
		@Pc(83) int local83 = arg1 + Static367.anIntArray490[0] - 18;
		@Pc(91) int local91 = local83 + arg4 / 4 * 18;
		@Pc(101) int local101 = Static367.anIntArray490[1] + arg3 - 16 - 54;
		@Pc(109) int local109 = local101 + arg4 % 4 * 18;
		local20.method7191(local91, local109);
		if (arg0 == arg2) {
			Static478.aClass9_10.method7599(18, 18, -256, local91 - 1, local109 + -1);
		}
		@Pc(131) Class2_Sub8 local131 = Static308.method5115();
		local131.aClass47_Sub2_Sub3_1 = arg0;
		local131.anInt9355 = local109 + 16;
		local131.anInt9353 = local91;
		local131.anInt9351 = local109;
		local131.anInt9354 = local91 + 16;
		Static326.aClass145_6.method3927(local131);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method2800() {
		if (Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926) || Static245.anInt4747 == Static435.anInt7457) {
			Static354.method5620(Static478.aClass9_10);
			if (Static485.anInt8266 != Static245.anInt4747) {
				Static418.method6217();
			}
		} else {
			Static292.method4920(Static358.anInt2386, 10, Static184.anInt3932, false);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFZF)I")
	public static int method2802(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local12 < local26 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local26 < local35) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
