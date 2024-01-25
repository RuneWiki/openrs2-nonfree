import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
	public static int anInt5753;

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
	public static int anInt5744 = -1;

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "[I")
	public static final int[] anIntArray450 = new int[4];

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!rm", name = "K", descriptor = "Lclient!tm;")
	public static final Class193 aClass193_8 = new Class193();

	@OriginalMember(owner = "client!rm", name = "M", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_190 = new Class221(55, 3);

	@OriginalMember(owner = "client!rm", name = "N", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!rm", name = "O", descriptor = "Z")
	public static boolean aBoolean511 = false;

	@OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
	public static int anInt5754 = 10;

	@OriginalMember(owner = "client!rm", name = "R", descriptor = "Z")
	public static boolean aBoolean512 = true;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 + arg0 > arg5 && arg5 + arg4 > arg6) {
			return arg1 < arg7 + arg3 && arg1 + arg2 > arg3;
		} else {
			return false;
		}
	}
}
