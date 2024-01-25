import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Lclient!sq;")
	public static Class277 aClass277_2;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!ha;")
	public static Class84 aClass84_24;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Z")
	public static boolean aBoolean628 = false;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
	public static int anInt8889 = 0;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)I")
	public static int method7313(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(37) int local37 = (arg0 & 0x7F) * 96 >> 7;
			if (local37 < 2) {
				local37 = 2;
			} else if (local37 > 126) {
				local37 = 126;
			}
			return local37 + (arg0 & 0xFF80);
		}
	}
}
