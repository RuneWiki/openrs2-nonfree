import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bga", name = "k", descriptor = "Lclient!aq;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
	public static int anInt1429;

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_3 = new Class129(9, 2);

	@OriginalMember(owner = "client!bga", name = "j", descriptor = "I")
	public static int anInt1428 = 1;

	@OriginalMember(owner = "client!bga", name = "m", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_13 = new Class73(1, -1);

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1345(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local29++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static18.aCharArray1[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(80) int local80 = local52.length() - 1;
					local52.setCharAt(local80, Character.toUpperCase(local52.charAt(local80)));
					local70 = ' ';
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZIZ)V")
	public static void method1346(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static141.anInt3351--;
			if (Static141.anInt3351 == 0) {
				Static376.anIntArray336 = null;
			}
		}
		if (arg1) {
			Static224.anInt5037--;
			if (Static224.anInt5037 == 0) {
				Static396.anIntArray370 = null;
			}
		}
	}
}
