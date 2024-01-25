import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "Lclient!wia;")
	public static Class386 aClass386_106;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_151 = new Class44(8, 3);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZB)V")
	public static void method7114(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static593.anInt10137++;
			Static451.method6544();
		}
		if (arg0) {
			Static18.anInt248++;
			Static102.method1820();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method7116(@OriginalArg(0) long arg0) {
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
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				@Pc(73) char local73 = Static243.aCharArray2[(int) (local59 - arg0 * 37L)];
				if (local73 == '_') {
					@Pc(83) int local83 = local55.length() - 1;
					local55.setCharAt(local83, Character.toUpperCase(local55.charAt(local83)));
					local73 = ' ';
				}
				local55.append(local73);
			}
			local55.reverse();
			local55.setCharAt(0, Character.toUpperCase(local55.charAt(0)));
			return local55.toString();
		}
	}
}
