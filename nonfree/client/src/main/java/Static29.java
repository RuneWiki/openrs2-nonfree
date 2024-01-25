import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "[I")
	public static int[] anIntArray35;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_11 = new Class231("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt445 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)I")
	public static int method364(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(39) int local39 = (arg0 & 0x7F) * 96 >> 7;
			if (local39 < 2) {
				local39 = 2;
			} else if (local39 > 126) {
				local39 = 126;
			}
			return (arg0 & 0xFF80) + local39;
		}
	}
}
