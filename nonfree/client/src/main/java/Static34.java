import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static34 {

	@OriginalMember(owner = "client!cb", name = "Kb", descriptor = "I")
	public static int anInt966;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)V")
	public static void method710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static22.anIntArrayArray12 != null) {
			Static22.anIntArrayArray12[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}
}
