import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_220 = new Class160(22, 6);

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[4];

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "(I)V")
	public static void method7629() {
		Static686.anInt11152 = 1;
		Static426.anInt7228 = -1;
		Static591.aClass347_3 = Static277.aClass347_1;
		Static56.method1003("", Static423.aString83.equals(""), Static423.aString83, true);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method7631(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(40) int local40 = 0;
			for (@Pc(42) long local42 = arg0; local42 != 0L; local42 /= 37L) {
				local40++;
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local40);
			while (arg0 != 0L) {
				@Pc(62) long local62 = arg0;
				arg0 /= 37L;
				@Pc(76) char local76 = Static144.aCharArray4[(int) (local62 - arg0 * 37L)];
				if (local76 == '_') {
					@Pc(86) int local86 = local59.length() - 1;
					local76 = ' ';
					local59.setCharAt(local86, Character.toUpperCase(local59.charAt(local86)));
				}
				local59.append(local76);
			}
			local59.reverse();
			local59.setCharAt(0, Character.toUpperCase(local59.charAt(0)));
			return local59.toString();
		}
	}
}
