import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	public static int anInt339;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
	public static int anInt340;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "[Lclient!rk;")
	public static Interface21[] anInterface21Array1;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_13 = new Class194(120, -1);

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIB)Z")
	public static boolean method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static236.method4024(arg1)) {
			return true;
		} else {
			return !Static236.method4024(arg0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method325(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static412.aCharArray11[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}
