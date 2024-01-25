import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static484 {

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_124 = new Class90(6, 7);

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "[S")
	public static short[] aShortArray129 = new short[256];

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	public static int anInt9199 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I")
	public static int method7066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)I")
	public static int method7068() {
		return 16;
	}
}
