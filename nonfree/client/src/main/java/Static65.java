import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_12 = new Class94(9, 7);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method1859(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg0, 2);
		local8.method4716();
		local8.aString57 = arg1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method1861(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(36) int local36 = 0;
			@Pc(38) long local38 = arg0;
			while (local38 != 0L) {
				local38 /= 37L;
				local36++;
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local36);
			while (arg0 != 0L) {
				@Pc(60) long local60 = arg0;
				arg0 /= 37L;
				local56.append(Static442.aCharArray11[(int) (local60 - arg0 * 37L)]);
			}
			return local56.reverse().toString();
		}
	}
}
