import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
	public static int anInt5082;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIBII)V")
	public static void method4570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg0; local12++) {
			Static491.method7219(Static249.anIntArrayArray23[local12], arg1, arg4, arg2);
		}
	}
}
