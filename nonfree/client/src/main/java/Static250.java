import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "[Lclient!kf;")
	public static Class14_Sub1[] aClass14_Sub1Array2;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public static int anInt4221 = -2;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_7 = new Class186(12, 0, 1, 0);

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_16 = new Class306();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method3883(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static127.method1904(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static127.method1904(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(53) int local53 = local14 - local11;
		if (local53 < 1 || local53 > 12) {
			return null;
		}
		@Pc(68) StringBuffer local68 = new StringBuffer(local53);
		for (@Pc(75) int local75 = local11; local75 < local14; local75++) {
			@Pc(81) char local81 = arg0.charAt(local75);
			if (Static138.method2077(local81)) {
				@Pc(89) char local89 = Static218.method3311(local81);
				if (local89 != '\u0000') {
					local68.append(local89);
				}
			}
		}
		if (local68.length() == 0) {
			return null;
		} else {
			return local68.toString();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method3889(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static170.method2647(arg1);
		@Pc(10) int local10 = Static222.aCalendar1.get(5);
		@Pc(21) int local21 = Static222.aCalendar1.get(2) + 1;
		@Pc(25) int local25 = Static222.aCalendar1.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local21 / 10 + local21 % 10 + "/" + local25 % 100 / 10 + local25 % 10;
	}
}
