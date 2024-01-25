import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static417 {

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
	public static int anInt6837;

	@OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
	public static int anInt6845;

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "[I")
	public static final int[] anIntArray498 = new int[4096];

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BII)Z")
	public static boolean method5343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static408.method5247(arg1, arg0) || Static120.method1956(arg0, arg1);
	}
}
