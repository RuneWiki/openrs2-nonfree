import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "Lclient!si;")
	public static final Class338 aClass338_56 = new Class338(8);

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "[I")
	public static final int[] anIntArray536 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZB)Z")
	public static boolean method8158(@OriginalArg(1) byte arg0) {
		@Pc(13) int local13 = arg0 & 0xFF;
		if (local13 == 0) {
			return false;
		} else {
			return local13 < 128 || local13 >= 160 || Static38.aCharArray1[local13 - 128] != '\u0000';
		}
	}
}
