import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Lclient!m;")
	public static Class118 aClass118_5;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2302(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2303(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static21.method523(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static21.method523(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(53) int local53 = local14 - local11;
		if (local53 < 1 || local53 > 12) {
			return null;
		}
		@Pc(73) StringBuffer local73 = new StringBuffer(local53);
		for (@Pc(75) int local75 = local11; local75 < local14; local75++) {
			@Pc(81) char local81 = arg0.charAt(local75);
			if (Static342.method5175(local81)) {
				@Pc(89) char local89 = Static411.method6099(local81);
				if (local89 != '\u0000') {
					local73.append(local89);
				}
			}
		}
		if (local73.length() == 0) {
			return null;
		} else {
			return local73.toString();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	public static byte[] method2304(@OriginalArg(0) File arg0) {
		return Static5.method241(arg0, (int) arg0.length());
	}
}
