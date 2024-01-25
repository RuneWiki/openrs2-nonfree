import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static15 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!fc;")
	public static Class71 aClass71_2;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!fc;")
	public static Class71 aClass71_3;

	@OriginalMember(owner = "client!be", name = "H", descriptor = "I")
	public static int anInt364 = 503;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
	public static int method440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static257.anIntArray789[arg0 & 0x3] : 256;
	}
}
