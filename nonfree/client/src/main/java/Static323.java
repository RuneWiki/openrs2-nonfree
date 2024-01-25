import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static323 {

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
	public static int anInt6144;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "[I")
	public static int[] anIntArray464 = new int[1];

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "J")
	public static final long aLong173 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)Z")
	public static boolean method5119(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}
}
