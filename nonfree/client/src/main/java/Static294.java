import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
	public static int anInt5311;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "[J")
	public static final long[] aLongArray10 = new long[100];

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
	public static int anInt5309 = 0;

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "Z")
	public static boolean aBoolean394 = true;

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)I")
	public static int method4654() {
		@Pc(13) int local13 = Static247.aClass48_23.method1309();
		if (Static368.aClass48Array1.length - 1 > local13) {
			Static247.aClass48_23 = Static368.aClass48Array1[local13 + 1];
		}
		return 100;
	}
}
