import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mt", name = "O", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(CB)Z")
	public static boolean method3861(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(29) char[] local29 = Static127.aCharArray3;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(37) char local37 = local29[local31];
				if (local37 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "(B)V")
	public static void method3862() {
		Static151.aClass2_Sub18_Sub2_1.method2903();
		Static391.aClass188_113 = null;
		Static415.anInt7247 = 1;
	}
}
