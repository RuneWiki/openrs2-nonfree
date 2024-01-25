import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aq", name = "Y", descriptor = "Lclient!am;")
	public static Class11 aClass11_3;

	@OriginalMember(owner = "client!aq", name = "C", descriptor = "[I")
	public static final int[] anIntArray49 = new int[200];

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString10 = "skill: ";

	@OriginalMember(owner = "client!aq", name = "N", descriptor = "[I")
	public static final int[] anIntArray50 = new int[25];

	@OriginalMember(owner = "client!aq", name = "R", descriptor = "J")
	public static long aLong18 = 0L;

	@OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
	public static int anInt353 = -1;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method348(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(61) long local61 = arg0;
				arg0 /= 37L;
				@Pc(75) char local75 = Static112.aCharArray1[(int) (local61 - arg0 * 37L)];
				if (local75 == '_') {
					@Pc(83) int local83 = local57.length() - 1;
					local75 = ' ';
					local57.setCharAt(local83, Character.toUpperCase(local57.charAt(local83)));
				}
				local57.append(local75);
			}
			local57.reverse();
			local57.setCharAt(0, Character.toUpperCase(local57.charAt(0)));
			return local57.toString();
		}
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)V")
	public static void method350() {
		Static183.aBoolean334 = true;
	}
}
