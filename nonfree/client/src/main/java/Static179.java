import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!mja;")
	public static final Class234 aClass234_2 = new Class234("runescape", "RuneScape", 0);

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
	public static int anInt3120 = 0;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
	public static final int[] anIntArray228 = new int[1];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2892(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
