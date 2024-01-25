import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static471 {

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "Z")
	public static boolean aBoolean586 = false;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "Z")
	public static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_158 = new Class151(75, 1);

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "Lclient!mja;")
	public static final Class234 aClass234_6 = new Class234("game3", "Game 3", 2);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)Z")
	public static boolean method6507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static345.method4661(arg1, arg0) || Static638.method8538(arg0, arg1);
	}
}
