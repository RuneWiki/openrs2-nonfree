import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
	public static int[] anIntArray282 = null;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)I")
	public static int method2784(@OriginalArg(0) boolean arg0) {
		if (Static572.anIntArray713 == null) {
			return 0;
		} else if (arg0 || Static204.aClass185Array7 == null) {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static572.anIntArray713.length; local27++) {
				@Pc(33) int local33 = Static572.anIntArray713[local27];
				if (Static536.aClass386_115.method9206(local33)) {
					local25++;
				}
				if (Static593.aClass386_123.method9206(local33)) {
					local25++;
				}
			}
			return local25;
		} else {
			return Static572.anIntArray713.length * 2;
		}
	}
}
