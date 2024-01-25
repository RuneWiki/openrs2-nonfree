import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!rda", name = "r", descriptor = "Lclient!nca;")
	public static Class254 aClass254_135;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIBII)V")
	public static void method7598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg3 <= arg1) {
			for (local18 = arg3; local18 < arg1; local18++) {
				Static449.anIntArrayArray48[local18][arg0] = arg2;
			}
		} else {
			for (local18 = arg1; local18 < arg3; local18++) {
				Static449.anIntArrayArray48[local18][arg0] = arg2;
			}
		}
	}
}
