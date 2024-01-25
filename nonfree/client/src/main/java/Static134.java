import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "Lclient!dk;")
	public static Class54 aClass54_39;

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_46 = new Class134("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
	public static void method1993() {
		Static142.method2087();
		Static233.method5398(Static2.aClass148_Sub1_1.aBoolean249);
		Static356.aClass38_1 = Static209.method2803(Static286.aCanvas4, 22050, Static79.aClass183_2, 0);
		Static356.aClass38_1.method1487(Static37.aClass2_Sub1_Sub2_6);
		Static385.aClass38_2 = Static209.method2803(Static286.aCanvas4, 2048, Static79.aClass183_2, 1);
		Static385.aClass38_2.method1487(Static421.aClass2_Sub1_Sub4_2);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1995(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(53) StringBuffer local53 = new StringBuffer(local35);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local53.append(Static164.aCharArray7[(int) (local57 - arg0 * 37L)]);
			}
			return local53.reverse().toString();
		}
	}
}
