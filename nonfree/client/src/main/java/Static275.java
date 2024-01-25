import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!lga;")
	public static Class223 aClass223_64;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!mq;")
	public static final Class238 aClass238_7 = new Class238();

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[6][];

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public static int anInt5075 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I")
	public static int method4633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = 255 - arg1;
		@Pc(33) int local33 = ((arg2 & 0xFF00FF) * arg1 & 0xFF00FF00 | arg1 * (arg2 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local15 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local15 & 0xFF00FF00) >>> 8) + local33;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(CBI)I")
	public static int method4634(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(24) char local24 = Character.toLowerCase(arg0);
			local13 = (local24 << 4) + 1;
		}
		return local13;
	}
}
