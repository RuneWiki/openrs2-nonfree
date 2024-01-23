import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static259 {

	@OriginalMember(owner = "client!sn", name = "T", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!sn", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!sn", name = "Y", descriptor = "I")
	public static int anInt4939 = 0;

	@OriginalMember(owner = "client!sn", name = "ab", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30 = new String[500];

	@OriginalMember(owner = "client!sn", name = "ib", descriptor = "I")
	public static int anInt4947 = 0;

	@OriginalMember(owner = "client!sn", name = "qb", descriptor = "I")
	public static int anInt4953 = 0;

	@OriginalMember(owner = "client!sn", name = "rb", descriptor = "I")
	public static int anInt4954 = -1;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(II)I")
	public static int method4095(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
