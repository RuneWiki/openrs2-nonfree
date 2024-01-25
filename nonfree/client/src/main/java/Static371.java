import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "Lclient!nf;")
	public static Class102 aClass102_24;

	@OriginalMember(owner = "client!mj", name = "I", descriptor = "[I")
	public static final int[] anIntArray406 = new int[3];

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(III)V")
	public static void method5493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static332.aClass247ArrayArrayArray1[0][arg1][arg2] != null && Static332.aClass247ArrayArrayArray1[0][arg1][arg2].aClass247_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static332.aClass247ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(44) Class247 local44 = Static332.aClass247ArrayArrayArray1[local22][arg1][arg2] = new Class247(local22);
				if (local20) {
					local44.aByte94++;
				}
			}
		}
	}
}
