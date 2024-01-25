import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array2;

	@OriginalMember(owner = "client!afa", name = "w", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_4 = new Class349(44, 8);

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(III)Z")
	public static boolean method208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
