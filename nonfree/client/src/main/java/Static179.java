import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
	public static int anInt4933 = 0;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_73 = new Class67(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString36 = "";

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_15 = new Class117(6, 14);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4141(@OriginalArg(1) long arg0) {
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
			@Pc(47) StringBuffer local47 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				@Pc(65) char local65 = Static352.aCharArray8[(int) (local51 - arg0 * 37L)];
				if (local65 == '_') {
					@Pc(73) int local73 = local47.length() - 1;
					local47.setCharAt(local73, Character.toUpperCase(local47.charAt(local73)));
					local65 = ' ';
				}
				local47.append(local65);
			}
			local47.reverse();
			local47.setCharAt(0, Character.toUpperCase(local47.charAt(0)));
			return local47.toString();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public static void method4143(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(arg0, 9);
		local8.method6212();
	}
}
