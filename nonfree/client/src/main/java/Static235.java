import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lu", name = "W", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_101 = new Class7("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	public static void method3555() {
		for (@Pc(15) Class1_Sub2_Sub12 local15 = (Class1_Sub2_Sub12) Static64.aClass181_13.method4112(); local15 != null; local15 = (Class1_Sub2_Sub12) Static64.aClass181_13.method4104()) {
			@Pc(20) Class31_Sub2_Sub2 local20 = local15.aClass31_Sub2_Sub2_1;
			if (local20.aBoolean91) {
				local15.method6020();
				local20.method1398();
			} else if (Static378.anInt4244 >= local20.anInt1590) {
				local20.method1397(Static4.anInt115);
				if (local20.aBoolean91) {
					local15.method6020();
				} else {
					Static162.method2630(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3561(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(33) int local33 = 0;
			for (@Pc(35) long local35 = arg0; local35 != 0L; local35 /= 37L) {
				local33++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local33);
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				@Pc(67) char local67 = Static271.aCharArray5[(int) (local53 - arg0 * 37L)];
				if (local67 == '_') {
					@Pc(75) int local75 = local50.length() - 1;
					local67 = ' ';
					local50.setCharAt(local75, Character.toUpperCase(local50.charAt(local75)));
				}
				local50.append(local67);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}
}
