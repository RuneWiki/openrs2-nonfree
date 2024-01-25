import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static185 {

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
	public static int anInt3399;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	public static int anInt3395 = 503;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!oda;")
	public static Class212 aClass212_1 = null;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "[I")
	public static final int[] anIntArray370 = new int[8];

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "[B")
	public static final byte[] aByteArray70 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	public static int anInt3396 = 0;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	public static int anInt3397 = 0;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[100];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!wu;I)Z")
	public static boolean method3042(@OriginalArg(0) Class320 arg0) {
		return Static141.aClass320_18 == arg0 || arg0 == Static175.aClass320_6 || arg0 == Static136.aClass320_2 || arg0 == Static260.aClass320_8;
	}
}
