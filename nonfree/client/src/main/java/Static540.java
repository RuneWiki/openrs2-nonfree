import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static540 {

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	public static int anInt9540;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "[I")
	public static int[] anIntArray837;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "[I")
	public static final int[] anIntArray838 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)Z")
	public static boolean method8221(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static514.method7863(arg1, arg0) || Static319.method5470(arg0, arg1);
	}
}
