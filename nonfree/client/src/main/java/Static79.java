import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "Lclient!qt;")
	public static Class274 aClass274_1;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "F")
	public static float aFloat37 = 1024.0F;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Z")
	public static boolean method1641(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1644(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local12; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 == '%' && local21 + 2 < local12) {
				local27 = arg0.charAt(local21 + 1);
				@Pc(55) int local55;
				if (local27 >= '0' && local27 <= '9') {
					local55 = local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local55 = local27 + '\n' - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local55 = local27 - 55;
				}
				local27 = arg0.charAt(local21 + 2);
				local55 *= 16;
				if (local27 >= '0' && local27 <= '9') {
					local55 += local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local55 += local27 + 10 - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local55 += local27 + '\n' - 65;
				}
				if (local55 != 0 && Static248.method3988((byte) local55)) {
					local9.append(Static344.method5095((byte) local55));
				}
				local21 += 2;
			} else if (local27 == '+') {
				local9.append(' ');
			} else {
				local9.append(local27);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "()V")
	public static void method1646() {
		for (@Pc(1) int local1 = 0; local1 < Static89.aClass328Array1.length; local1++) {
			Static89.aClass328Array1[local1].method7285();
		}
		Static89.aClass328Array1 = null;
	}
}
