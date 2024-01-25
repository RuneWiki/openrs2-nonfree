import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!no", name = "Q", descriptor = "Lclient!la;")
	public static Class35 aClass35_10;

	@OriginalMember(owner = "client!no", name = "mb", descriptor = "I")
	public static int anInt6293;

	@OriginalMember(owner = "client!no", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray44 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!no", name = "R", descriptor = "Z")
	public static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I")
	public static int method5256(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
