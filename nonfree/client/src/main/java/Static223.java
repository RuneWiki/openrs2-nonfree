import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static223 {

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "Lclient!mf;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "Lclient!of;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "F")
	public static float aFloat111 = 1.0F;

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "[I")
	public static final int[] anIntArray342 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString46 = "";

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	public static int anInt3931 = 0;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I")
	public static int method3122() {
		return 16;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z")
	public static boolean method3123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
