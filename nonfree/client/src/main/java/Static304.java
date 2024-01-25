import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static304 {

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "F")
	public static float aFloat232;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
	public static int anInt10195 = -1;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIIIBI)J")
	public static long method8639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static33.aCalendar25.clear();
		Static33.aCalendar25.set(arg1, arg2, arg0, 12, 0, 0);
		return Static33.aCalendar25.getTime().getTime();
	}
}
