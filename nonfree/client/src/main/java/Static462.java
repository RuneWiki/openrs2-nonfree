import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public static int anInt8079 = -50;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	public static int anInt8080 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z")
	public static boolean method6358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static472.method6445(arg1, arg0) | (arg0 & 0x800) != 0 || Static576.method7812(arg0, arg1);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	public static void method6359() {
		if (Static478.anInt8321 <= 0) {
			Static527.aString267 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static495.aStringArray41.length; local15++) {
			if (Static495.aStringArray41[local15].indexOf("--> ") != -1) {
				@Pc(27) int local27 = ~Static478.anInt8321;
				local13++;
				if (local27 == ~local13) {
					Static527.aString267 = Static495.aStringArray41[local15].substring(Static495.aStringArray41[local15].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
