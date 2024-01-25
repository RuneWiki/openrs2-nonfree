import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
	public static int anInt8984;

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
	public static int anInt8987;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_146 = new Class337(29, 3);

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "Lclient!vj;")
	public static final Class365 aClass365_15 = new Class365(5, 1);

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
	public static int anInt8988 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)I")
	public static int method7725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}
}
