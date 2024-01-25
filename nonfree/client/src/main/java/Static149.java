import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "Z")
	public static boolean aBoolean278;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public static void method2878() {
		if (Static306.anInt6192 != 2) {
			try {
				Static369.method5674(Static78.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!vm;B)V")
	public static void method2880(@OriginalArg(0) Class92 arg0) {
		@Pc(7) int local7 = Static111.anInt2449;
		@Pc(9) int local9 = Static87.anInt1931;
		@Pc(11) int local11 = Static111.anInt2450;
		@Pc(13) int local13 = Static223.anInt4637;
		arg0.method4502(local9, local11, local7, local13, -10660793);
		arg0.method4502(local9 + 1, local11 + -2, local7 + 1, 16, -16777216);
		arg0.method4522(local13 - 19, local11 - 2, local7 + 1, local9 + 18, -16777216);
		Static81.aClass78_2.method4050(-10660793, Static291.aString220, local7 + 3, -1, local9 - -14);
		@Pc(67) int local67 = Static38.anInt830;
		@Pc(77) int local77 = Static184.anInt4055;
		@Pc(79) int local79 = 0;
		for (@Pc(84) Class4_Sub18 local84 = (Class4_Sub18) Static248.aClass130_112.method3499(); local84 != null; local84 = (Class4_Sub18) Static248.aClass130_112.method3512()) {
			@Pc(99) int local99 = local9 + (Static282.anInt5713 + -1 + -local79) * 16 + 31;
			@Pc(101) short local101 = -1;
			if (local67 > local7 && local67 < local11 + local7 && local99 - 13 < local77 && local99 + 3 > local77) {
				local101 = -256;
			}
			@Pc(127) int[] local127 = null;
			if (Static184.method3416(local84.anInt2905)) {
				local127 = Static247.method4270((int) local84.aLong95).anIntArray372;
			} else if (Static156.method3018(local84.anInt2905)) {
				@Pc(151) Class2_Sub2_Sub1_Sub2 local151 = Static101.aClass2_Sub2_Sub1_Sub2Array6[(int) local84.aLong95];
				if (local151 != null) {
					local127 = local151.aClass34_1.anIntArray106;
				}
			} else if (Static13.method309(local84.anInt2905)) {
				if (local84.anInt2905 == 1010) {
					local127 = Static320.method5290((int) local84.aLong95).anIntArray153;
				} else {
					local127 = Static320.method5290((int) (local84.aLong95 >>> 32 & 0x7FFFFFFFL)).anIntArray153;
				}
			}
			@Pc(190) String local190 = Static199.method5388(local84);
			if (local127 != null) {
				local190 = local190 + Static46.method875(local127);
			}
			Static81.aClass78_2.method4056(local101, Static229.aClass60Array12, 0, local190, local7 + 3, local99, Static319.anIntArray507);
			local79++;
		}
		Static309.method5202(Static111.anInt2450, Static223.anInt4637, Static87.anInt1931, Static111.anInt2449);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lclient!we;")
	public static Class216 method2883(@OriginalArg(0) int arg0) {
		@Pc(10) Class216 local10 = (Class216) Static86.aClass154_29.method4222((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static22.aClass11_10.method288(arg0, 33);
		local10 = new Class216();
		if (local22 != null) {
			local10.method5621(new Class4_Sub7(local22), arg0);
		}
		Static86.aClass154_29.method4221((long) arg0, local10);
		return local10;
	}
}
