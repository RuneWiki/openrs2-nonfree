import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "Lclient!n;")
	public static Class11 aClass11_2;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
	public static int anInt1098 = 10;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_33 = new Class163(37, 8);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Z")
	public static boolean method1096(@OriginalArg(0) int arg0) {
		if (arg0 == 17 || arg0 == 11 || arg0 == 48 || arg0 == 30 || arg0 == 5) {
			return true;
		} else {
			return arg0 == 47 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method1100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 < 128 || arg5 < 128 || arg3 > Static373.anInt6324 * 128 - 256 || arg5 > (Static291.anInt5062 - 2) * 128) {
			Static90.anIntArray75[0] = Static90.anIntArray75[1] = -1;
			return;
		}
		@Pc(44) int local44 = Static181.method4212(arg6, arg5, arg3) - arg1;
		Static359.aClass11_5.J(arg0, 0, 0);
		Static413.aClass167_11.method6012(Static359.aClass11_5);
		Static413.aClass167_11.XA(arg3, local44, arg5, Static90.anIntArray75);
		Static359.aClass11_5.J(-arg0, 0, 0);
		Static413.aClass167_11.method6012(Static359.aClass11_5);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method1103(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local29++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static301.aCharArray6[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}
}
