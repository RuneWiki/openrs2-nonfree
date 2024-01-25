import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Z")
	public static boolean aBoolean445;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public static int anInt5875 = 64;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "J")
	public static long aLong182 = -1L;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z")
	public static boolean method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
