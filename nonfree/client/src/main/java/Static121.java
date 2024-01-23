import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
	public static int anInt2429;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	public static int anInt2437 = 0;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "[J")
	public static long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1945(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			@Pc(39) long local39 = arg0;
			while (local39 != 0L) {
				local39 /= 37L;
				local37++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local37);
			while (arg0 != 0L) {
				@Pc(63) long local63 = arg0;
				arg0 /= 37L;
				@Pc(77) char local77 = Static64.aCharArray1[(int) (local63 - arg0 * 37L)];
				if (local77 == '_') {
					local77 = ' ';
					@Pc(88) int local88 = local55.length() - 1;
					local55.setCharAt(local88, Character.toUpperCase(local55.charAt(local88)));
				}
				local55.append(local77);
			}
			local55.reverse();
			local55.setCharAt(0, Character.toUpperCase(local55.charAt(0)));
			return local55.toString();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method1946() {
		Static180.aClass61_30.method1378();
		Static293.aClass61_53.method1378();
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1947() {
		Static190.aClass61_33.method1379();
	}
}
