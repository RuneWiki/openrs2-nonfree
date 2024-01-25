import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
	public static int anInt8790;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString95 = null;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
	public static final int[] anIntArray636 = new int[1000];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V")
	public static void method7344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg1; local15 <= arg2; local15++) {
			Static276.method3099(arg0, Static582.anIntArrayArray69[local15], arg3, arg4);
		}
	}
}
