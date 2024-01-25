import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray15 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString334 = "Loaded interfaces";

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	public static int anInt5768 = 999999;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!en;ILclient!gk;Lclient!lm;Lclient!gp;ZI)V")
	public static void method5097(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub18 arg3, @OriginalArg(4) Class121 arg4, @OriginalArg(5) Class75 arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = arg3.anInt2291 - arg2 / 2 - 5;
		@Pc(23) int local23 = arg0 + 2;
		if (arg4.anInt3582 != 0) {
			arg1.method4835(local23, local19, arg6 * arg5.method2158() + arg0 + 1 - local23, arg2 - -10, arg4.anInt3582);
		}
		if (arg4.anInt3571 != 0) {
			arg1.method4830(arg4.anInt3571, local23, local19, arg6 * arg5.method2158() + arg0 + 1 - local23, arg2 + 10);
		}
		@Pc(73) int local73 = arg4.anInt3580;
		if (arg3.aBoolean148 && arg4.anInt3577 != -1) {
			local73 = arg4.anInt3577;
		}
		for (@Pc(85) int local85 = 0; local85 < arg6; local85++) {
			@Pc(91) String local91 = Static122.aStringArray14[local85];
			if (local85 < arg6 - 1) {
				local91 = local91.substring(0, local91.length() - 4);
			}
			arg5.method2161(arg1, local91, arg3.anInt2291, arg0, local73);
			arg0 += arg5.method2158();
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
	public static void method5098() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static183.aBooleanArray16[local7] = false;
		}
		Static179.anInt3574 = -1;
		Static111.anInt2403 = -1;
		Static215.anInt4279 = 1;
		Static328.anInt6217 = 0;
		Static341.anInt6374 = 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method5099(@OriginalArg(0) long arg0) {
		Static290.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static290.aCalendar2.get(7);
		@Pc(22) int local22 = Static290.aCalendar2.get(5);
		@Pc(26) int local26 = Static290.aCalendar2.get(2);
		@Pc(30) int local30 = Static290.aCalendar2.get(1);
		@Pc(34) int local34 = Static290.aCalendar2.get(11);
		@Pc(38) int local38 = Static290.aCalendar2.get(12);
		@Pc(42) int local42 = Static290.aCalendar2.get(13);
		return Static163.aStringArray21[local13 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static140.aStringArray16[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public static void method5100() {
		@Pc(6) Class66 local6 = Static222.aClass66_76;
		synchronized (Static222.aClass66_76) {
			Static222.aClass66_76.method1944(5);
		}
	}
}
