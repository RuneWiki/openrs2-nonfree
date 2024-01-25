import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static195 {

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "Lclient!lfa;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "Lclient!sj;")
	public static final Class316 aClass316_2 = new Class316("runescape", 0);

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "[I")
	public static final int[] anIntArray227 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method3950() {
		return Static65.aBoolean754 || Static74.aClass2_Sub6_Sub3_1 == null ? "" : Static74.aClass2_Sub6_Sub3_1.aString19;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZI)Z")
	public static boolean method3952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static594.method8742(arg1, arg0) || Static423.method6817(arg0, arg1);
	}
}
