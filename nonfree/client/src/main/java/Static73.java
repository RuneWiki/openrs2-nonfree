import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!d", name = "e", descriptor = "[S")
	public static short[] aShortArray199;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!fh;")
	public static Class90 aClass90_20;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "[Lclient!em;")
	public static final Class75[] aClass75Array7 = new Class75[16];

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Z")
	public static final boolean aBoolean689 = false;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
	public static int method7827(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIII)I")
	public static int method7829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > arg0) {
			return arg1;
		} else if (arg2 < arg0) {
			return arg2;
		} else {
			return arg0;
		}
	}
}
