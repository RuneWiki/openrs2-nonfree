import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static398 {

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "[I")
	public static final int[] anIntArray424 = new int[3];

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	public static int anInt6933 = 0;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Z")
	public static boolean method5800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
