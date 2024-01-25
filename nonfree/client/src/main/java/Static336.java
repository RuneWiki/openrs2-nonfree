import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "Lclient!hn;")
	public static Class161 aClass161_6;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_132 = new Class376(33, 4);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method7821(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static478.method6828(arg1);
		@Pc(15) int local15 = Static635.aCalendar2.get(5);
		@Pc(21) int local21 = Static635.aCalendar2.get(2) + 1;
		@Pc(25) int local25 = Static635.aCalendar2.get(1);
		@Pc(29) int local29 = Static635.aCalendar2.get(11);
		@Pc(33) int local33 = Static635.aCalendar2.get(12);
		return Integer.toString(local15 / 10) + local15 % 10 + "/" + local21 / 10 + local21 % 10 + "/" + local25 % 100 / 10 + local25 % 10 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10;
	}

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "(I)V")
	public static void method7822() {
		Static83.method1771((long) Static621.anInt9665, Static582.aClass16_12);
		if (Static277.anInt5201 != -1) {
			Static190.method3054(Static277.anInt5201);
		}
		for (@Pc(21) int local21 = 0; local21 < Static47.anInt1250; local21++) {
			if (Static119.aBooleanArray10[local21]) {
				Static496.aBooleanArray23[local21] = true;
			}
			Static389.aBooleanArray18[local21] = Static119.aBooleanArray10[local21];
			Static119.aBooleanArray10[local21] = false;
		}
		Static618.anInt9583 = Static621.anInt9665;
		if (Static277.anInt5201 != -1) {
			Static47.anInt1250 = 0;
			Static52.method1372();
		}
		Static582.aClass16_12.la();
		Static358.method5375(Static582.aClass16_12);
		@Pc(67) int local67 = Static128.method2245();
		if (local67 == -1) {
			local67 = Static267.anInt5035;
		}
		if (local67 == -1) {
			local67 = Static503.anInt8458;
		}
		Static445.method6441(local67);
		Static527.anInt8716 = 0;
	}
}
