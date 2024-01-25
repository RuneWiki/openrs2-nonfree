import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!ha;")
	public static Class2 aClass2_51;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Lclient!rl;")
	public static Class258 aClass258_1;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
	public static int anInt9167 = 0;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "Lclient!im;")
	public static final Class140 aClass140_153 = new Class140(1, 3);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method7543(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static23.aCharArray49[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public static void method7544() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static313.aClass50Array1[local11] = null;
		}
		Static301.anInt5567 = 0;
	}
}
