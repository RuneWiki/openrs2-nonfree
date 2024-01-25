import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Z")
	public static boolean aBoolean446;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "Lclient!de;")
	public static Class70 aClass70_2;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "[I")
	public static final int[] anIntArray488 = new int[14];

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)I")
	public static int method5035(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (arg0 * local19 >> 12) + 40960;
		return local13 * local27 >> 12;
	}
}
