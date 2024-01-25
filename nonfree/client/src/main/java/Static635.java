import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "Lclient!ub;")
	public static Class336 aClass336_2;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "[I")
	public static final int[] anIntArray713 = new int[4096];

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!at;B)Lclient!at;")
	public static Class24 method9199(@OriginalArg(0) Class24 arg0) {
		@Pc(14) Class24 local14 = Static76.method2238(arg0);
		if (local14 == null) {
			local14 = arg0.aClass24_3;
		}
		return local14;
	}
}
