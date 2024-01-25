import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_2 = new Class168(9, 8);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method906(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static534.method7372(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static534.method7372(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(48) int local48 = local14 - local11;
		if (local48 < 1 || local48 > 12) {
			return null;
		}
		@Pc(63) StringBuffer local63 = new StringBuffer(local48);
		for (@Pc(65) int local65 = local11; local65 < local14; local65++) {
			@Pc(71) char local71 = arg0.charAt(local65);
			if (Static87.method1307(local71)) {
				@Pc(79) char local79 = Static115.method1715(local71);
				if (local79 != '\u0000') {
					local63.append(local79);
				}
			}
		}
		if (local63.length() == 0) {
			return null;
		} else {
			return local63.toString();
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)I")
	public static int method908() {
		if ((double) Static193.aFloat16 == 3.0D) {
			return 37;
		} else if ((double) Static193.aFloat16 == 4.0D) {
			return 50;
		} else if ((double) Static193.aFloat16 == 6.0D) {
			return 75;
		} else if ((double) Static193.aFloat16 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
