import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static720 {

	@OriginalMember(owner = "client!wp", name = "E", descriptor = "Lclient!jj;")
	public static Class193 aClass193_10;

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
	public static int anInt11190;

	@OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
	public static int anInt11175 = 0;

	@OriginalMember(owner = "client!wp", name = "C", descriptor = "I")
	public static int anInt11176 = 0;

	@OriginalMember(owner = "client!wp", name = "J", descriptor = "S")
	public static short aShort128 = 1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!ug;)I")
	public static int method9526(@OriginalArg(1) Class372 arg0) {
		if (arg0 == Static468.aClass372_3) {
			return 7681;
		} else if (Static503.aClass372_4 == arg0) {
			return 8448;
		} else if (Static240.aClass372_6 == arg0) {
			return 34165;
		} else if (arg0 == Static666.aClass372_7) {
			return 260;
		} else if (Static503.aClass372_5 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
