import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static72 {

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
	public static int anInt1217 = -1;

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "[I")
	public static final int[] anIntArray89 = new int[13];

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "[I")
	public static final int[] anIntArray90 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
	public static int anInt1221 = 0;

	@OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
	public static int anInt1223 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method1120(@OriginalArg(1) String arg0) {
		return Static27.method464(16, arg0);
	}
}
