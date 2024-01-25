import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!c", name = "c", descriptor = "[I")
	public static final int[] anIntArray140 = new int[4];

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_7 = new Class223(5);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method797(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local12; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 == '%' && local12 > local21 + 2) {
				local27 = arg0.charAt(local21 + 1);
				@Pc(61) int local61;
				if (local27 >= '0' && local27 <= '9') {
					local61 = local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local61 = local27 - 87;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local61 = local27 + '\n' - 65;
				}
				local27 = arg0.charAt(local21 + 2);
				local61 *= 16;
				if (local27 >= '0' && local27 <= '9') {
					local61 += local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local61 += local27 + '\n' - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local61 += local27 - 55;
				}
				if (local61 != 0 && Static495.method7463((byte) local61)) {
					local9.append(Static413.method5932((byte) local61));
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

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method798() {
		@Pc(10) Class4_Sub7_Sub5 local10 = Static218.method3780(15, 0);
		local10.method3062();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)V")
	public static void method799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(14, arg1);
		local8.method3066();
		local8.anInt3348 = arg0;
	}
}
