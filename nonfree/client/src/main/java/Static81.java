import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt1750 = 0;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	public static final int[] anIntArray132 = new int[14];

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public static int anInt1753 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
	public static int method1387(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
	public static void method1388(@OriginalArg(0) int arg0) {
		Static108.anInt2418 = 1000 / arg0;
	}
}
