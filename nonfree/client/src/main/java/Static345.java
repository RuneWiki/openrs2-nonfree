import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!ro", name = "T", descriptor = "Lclient!f;")
	public static Class3 aClass3_19;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method4814(@OriginalArg(1) String arg0) {
		return Static38.method711(16, arg0);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method4817(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			for (@Pc(39) long local39 = arg0; local39 != 0L; local39 /= 37L) {
				local37++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local37);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				local55.append(Static329.aCharArray6[(int) (local59 - arg0 * 37L)]);
			}
			return local55.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg5 < 128 || arg1 < 128 || arg5 > Static126.anInt2569 * 128 - 256 || arg1 > (Static190.anInt3697 - 2) * 128) {
			Static370.anIntArray573[0] = Static370.anIntArray573[1] = -1;
			return;
		}
		@Pc(47) int local47 = Static222.method3109(arg5, arg6, arg1) - arg4;
		Static248.aClass116_3.ZA(arg3, 0, 0);
		Static16.aClass30_11.m(Static248.aClass116_3);
		Static16.aClass30_11.ia(arg5, local47, arg1, Static370.anIntArray573);
		Static248.aClass116_3.ZA(-arg3, 0, 0);
		Static16.aClass30_11.m(Static248.aClass116_3);
	}
}
