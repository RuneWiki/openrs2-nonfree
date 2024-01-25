import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static349 {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
	public static int anInt6742;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "[I")
	public static final int[] anIntArray377 = new int[14];

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
	public static int anInt6741 = 0;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
	public static int anInt6743 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)Z")
	public static boolean method5537(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
