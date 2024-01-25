import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "Lclient!gq;")
	public static Class117 aClass117_1;

	@OriginalMember(owner = "client!fm", name = "E", descriptor = "Lclient!f;")
	public static Class73 aClass73_12;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "Lclient!eu;")
	public static final Class95 aClass95_4 = new Class95(9, 2);

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "[I")
	public static final int[] anIntArray134 = new int[5];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2852(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static172.aCharArray3[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(78) int local78 = local52.length() - 1;
					local52.setCharAt(local78, Character.toUpperCase(local52.charAt(local78)));
					local70 = ' ';
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}
}
