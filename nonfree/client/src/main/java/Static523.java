import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static523 {

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "Lclient!it;")
	public static Class28 aClass28_30;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	public static int anInt8995 = -1;

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "Lclient!cr;")
	public static final Class63 aClass63_5 = new Class63("game3", 2);

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
	public static int anInt9001 = 0;

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "[I")
	public static final int[] anIntArray492 = new int[2048];

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "S")
	public static short aShort105 = 320;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!aia;I)Z")
	public static boolean method7736(@OriginalArg(0) Class15 arg0) {
		return Static567.aClass15_9 == arg0 || arg0 == Static33.aClass15_1 || arg0 == Static288.aClass15_5 || arg0 == Static340.aClass15_6;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)Z")
	public static boolean method7738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBI)Z")
	public static boolean method7739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
