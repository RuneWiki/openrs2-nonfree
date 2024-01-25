import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
	public static int anInt926;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
	public static int anInt933;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!io;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_6 = new Class136(16);

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
	public static int anInt936 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
	public static void method729() {
		if (Static239.aClass3_Sub4_Sub17_1 != null) {
			Static239.aClass3_Sub4_Sub17_1 = null;
			Static485.method6262(Static614.anInt9938, Static725.anInt11302, Static382.anInt6839, Static618.anInt6014);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method732(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(33) int local33 = 0;
			for (@Pc(35) long local35 = arg0; local35 != 0L; local35 /= 37L) {
				local33++;
			}
			if (false) {
				return null;
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local33);
			while (arg0 != 0L) {
				@Pc(69) long local69 = arg0;
				arg0 /= 37L;
				@Pc(83) char local83 = Static562.aCharArray3[(int) (local69 - arg0 * 37L)];
				if (local83 == '_') {
					@Pc(91) int local91 = local65.length() - 1;
					local65.setCharAt(local91, Character.toUpperCase(local65.charAt(local91)));
					local83 = ' ';
				}
				local65.append(local83);
			}
			local65.reverse();
			local65.setCharAt(0, Character.toUpperCase(local65.charAt(0)));
			return local65.toString();
		}
	}
}
