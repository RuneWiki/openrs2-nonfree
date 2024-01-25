import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "Lclient!mba;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "Z")
	public static final boolean aBoolean393 = false;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
	public static void method4387() {
		Static433.anInt7164 = 0;
		Static373.anInt6340 = 0;
		Static124.anInt3632 = 0;
		Static160.anInt3208 = 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4389(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(19) int local19 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 == '%' && local19 > local21 + 2) {
				local27 = arg0.charAt(local21 + 1);
				@Pc(59) int local59;
				if (local27 >= '0' && local27 <= '9') {
					local59 = local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local59 = local27 + 10 - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local59 = local27 + '\n' - 65;
				}
				local27 = arg0.charAt(local21 + 2);
				local59 *= 16;
				if (local27 >= '0' && local27 <= '9') {
					local59 += local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local59 += local27 + '\n' - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local59 += local27 + 10 - 65;
				}
				if (local59 != 0 && Static394.method5792((byte) local59)) {
					local9.append(Static88.method1974((byte) local59));
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
}
