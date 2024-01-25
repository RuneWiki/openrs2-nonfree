import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!au", name = "c", descriptor = "I")
	public static int anInt358;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "I")
	public static int anInt359;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "I")
	public static int anInt364;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "I")
	public static int anInt365;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "[I")
	public static int[] anIntArray13 = new int[1];

	@OriginalMember(owner = "client!au", name = "j", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_6 = new Class46(48, -1);

	@OriginalMember(owner = "client!au", name = "m", descriptor = "Z")
	public static boolean aBoolean15 = true;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZII)I")
	public static int method314(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}
}
