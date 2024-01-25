import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static562 {

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
	public static int anInt9174;

	@OriginalMember(owner = "client!vo", name = "O", descriptor = "[J")
	public static long[] aLongArray15;

	@OriginalMember(owner = "client!vo", name = "T", descriptor = "I")
	public static int anInt9184 = -2;

	@OriginalMember(owner = "client!vo", name = "V", descriptor = "I")
	public static final int anInt9186 = 1406;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(II)I")
	public static int method7586(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "(I)I")
	public static int method7589() {
		return Static411.anInt7039;
	}
}
