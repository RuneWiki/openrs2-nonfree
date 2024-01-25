import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static476 {

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "Lclient!qaa;")
	public static Class271 aClass271_5;

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "Lclient!qba;")
	public static Class4_Sub6_Sub16 aClass4_Sub6_Sub16_1;

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "[I")
	public static final int[] anIntArray527 = new int[32];

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!is;I)Ljava/lang/String;")
	public static String method6911(@OriginalArg(0) Class155 arg0) {
		if (Static70.method1542(arg0).method6330() == 0) {
			return null;
		} else if (arg0.aString96 == null || arg0.aString96.trim().length() == 0) {
			return Static80.aBoolean170 ? "Hidden-use" : null;
		} else {
			return arg0.aString96;
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Z")
	public static boolean method6917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
