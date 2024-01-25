import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Ljava/awt/Image;")
	public static Image anImage13;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_151 = new Class397(56, -2);

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	public static int anInt8601 = -1;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public static int anInt8603 = -1;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7348(@OriginalArg(1) String arg0) {
		@Pc(18) StringBuffer local18 = new StringBuffer();
		@Pc(21) int local21 = arg0.length();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(31) char local31 = arg0.charAt(local23);
			if (local31 == '%' && local21 > local23 + 2) {
				local31 = arg0.charAt(local23 + 1);
				@Pc(92) int local92;
				if (local31 >= '0' && local31 <= '9') {
					local92 = local31 - '0';
				} else if (local31 >= 'a' && local31 <= 'f') {
					local92 = local31 + 10 - 97;
				} else {
					if (local31 < 'A' || local31 > 'F') {
						local18.append('%');
						continue;
					}
					local92 = local31 + '\n' - 65;
				}
				local92 *= 16;
				local31 = arg0.charAt(local23 + 2);
				if (local31 >= '0' && local31 <= '9') {
					local92 += local31 - 48;
				} else if (local31 >= 'a' && local31 <= 'f') {
					local92 += local31 + '\n' - 97;
				} else {
					if (local31 < 'A' || local31 > 'F') {
						local18.append('%');
						continue;
					}
					local92 += local31 + 10 - 65;
				}
				local23 += 2;
				if (local92 != 0 && Static106.method2114((byte) local92)) {
					local18.append(Static309.method4582((byte) local92));
				}
			} else if (local31 == '+') {
				local18.append(' ');
			} else {
				local18.append(local31);
			}
		}
		return local18.toString();
	}
}
