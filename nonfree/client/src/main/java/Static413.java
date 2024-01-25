import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static413 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public static int anInt9078;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "F")
	public static float aFloat369;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!ed;")
	public static final Class77 aClass77_12 = new Class77();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)I")
	public static int method7354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
