import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	public static int anInt433;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array3;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V")
	public static void method408(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static205.method3771(arg0 - 1L);
			Static205.method3771(1L);
		} else {
			Static205.method3771(arg0);
		}
	}
}
