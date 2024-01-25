import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "[Lclient!fb;")
	public static Class97[] aClass97Array1;

	@OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
	public static int anInt8828;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
	public static void method7248() {
		if (Static535.anInt9522 <= 0) {
			Static21.aString93 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static255.aStringArray29.length; local7++) {
			if (Static255.aStringArray29[local7].startsWith("--> ")) {
				local5++;
				if (local5 == Static535.anInt9522) {
					Static21.aString93 = Static255.aStringArray29[local7].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BZ)C")
	public static char method7249(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(44) char local44 = Static97.aCharArray1[local7 - 128];
			if (local44 == '\u0000') {
				local44 = '?';
			}
			local7 = local44;
		}
		return (char) local7;
	}
}
