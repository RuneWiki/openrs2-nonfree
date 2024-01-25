import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "Lclient!wu;")
	public static Class384 aClass384_38;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
	public static int anInt2321 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!vfa;I)V")
	public static void method2115(@OriginalArg(0) Class357 arg0) {
		@Pc(11) Class357 local11 = Static243.method3688(arg0);
		@Pc(16) int local16;
		@Pc(19) int local19;
		if (local11 == null) {
			local16 = Static254.anInt4283;
			local19 = Static438.anInt7403;
		} else {
			local16 = local11.anInt9852;
			local19 = local11.anInt9797;
		}
		Static246.method3761(arg0, false, local16, local19);
		Static268.method4075(arg0, local16, local19);
	}
}
