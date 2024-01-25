import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static340 {

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Lclient!dp;")
	public static Class53 aClass53_27;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	public static int anInt654 = 0;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public static int anInt655 = 0;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_19 = new Class70(500);

	@OriginalMember(owner = "client!w", name = "x", descriptor = "I")
	public static int anInt657 = 0;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString26 = "Members object";

	@OriginalMember(owner = "client!w", name = "A", descriptor = "Lclient!fg;")
	public static Class70 aClass70_20 = new Class70(64);

	@OriginalMember(owner = "client!w", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(III)I")
	public static int method579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static152.anIntArray354[arg1 & 0x3] : Static49.anIntArray107[arg1 & 0x3];
	}
}
