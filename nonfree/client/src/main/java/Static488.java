import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "[I")
	public static int[] anIntArray645;

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "Lclient!q;")
	public static Class134 aClass134_6;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
	public static int anInt8215;

	@OriginalMember(owner = "client!sq", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString90;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6774(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static113.method2341(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static113.method2341(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(54) int local54 = local14 - local11;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(69) StringBuffer local69 = new StringBuffer(local54);
		for (@Pc(71) int local71 = local11; local71 < local14; local71++) {
			@Pc(77) char local77 = arg0.charAt(local71);
			if (Static27.method494(local77)) {
				@Pc(87) char local87 = Static446.method6283(local77);
				if (local87 != '\u0000') {
					local69.append(local87);
				}
			}
		}
		if (local69.length() == 0) {
			return null;
		} else {
			return local69.toString();
		}
	}
}
