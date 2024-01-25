import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static46 {

	@OriginalMember(owner = "client!bia", name = "B", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!bia", name = "C", descriptor = "Ljava/lang/Object;")
	public static Object anObject6;

	@OriginalMember(owner = "client!bia", name = "A", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_53 = new Class179(45, 3);

	@OriginalMember(owner = "client!bia", name = "E", descriptor = "Z")
	public static boolean aBoolean47 = true;

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)I")
	public static int method955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIB)Z")
	public static boolean method956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
