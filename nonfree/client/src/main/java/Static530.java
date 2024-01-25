import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static530 {

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "Lclient!om;")
	public static Class246 aClass246_248;

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "S")
	public static short aShort111 = 1;

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
	public static final int anInt8348 = 1403;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)Z")
	public static boolean method6997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
