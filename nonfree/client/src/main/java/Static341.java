import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
	public static int anInt6839;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
	public static int anInt6833 = 0;

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "[[I")
	public static final int[][] anIntArrayArray188 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!wa", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString64 = "";

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V")
	public static void method5888(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static281.anInt5700 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!li;)Z")
	public static boolean method5889(@OriginalArg(1) Class120 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean323) {
			return false;
		} else if (!arg0.method3337()) {
			return false;
		} else if (Static327.aClass199_30.method5751((long) arg0.anInt3635) == null) {
			return Static214.aClass199_21.method5751((long) arg0.anInt3637) == null;
		} else {
			return false;
		}
	}
}
