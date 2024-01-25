import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
	public static int anInt11132;

	@OriginalMember(owner = "client!ofa", name = "p", descriptor = "D")
	public static double aDouble31;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method9517(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static163.method3294(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static163.method3294(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(53) int local53 = local14 - local11;
		if (local53 < 1 || local53 > 12) {
			return null;
		}
		@Pc(68) StringBuffer local68 = new StringBuffer(local53);
		for (@Pc(70) int local70 = local11; local70 < local14; local70++) {
			@Pc(76) char local76 = arg0.charAt(local70);
			if (Static672.method9813(local76)) {
				@Pc(84) char local84 = Static158.method3197(local76);
				if (local84 != '\u0000') {
					local68.append(local84);
				}
			}
		}
		if (local68.length() == 0) {
			return null;
		} else {
			return local68.toString();
		}
	}
}
