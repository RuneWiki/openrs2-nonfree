import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
	public static int anInt4774;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "[I")
	public static int[] anIntArray497;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "[Lclient!kj;")
	public static Class56[] aClass56Array1 = new Class56[27];

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "Lclient!i;")
	private static Class41 aClass41_1277 = Static184.method2923("Please try again)3");

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Lclient!i;")
	public static Class41 aClass41_1278 = aClass41_1277;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)I")
	public static int method3310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub22 local12 = (Class2_Sub22) Static57.aClass70_3.method2205((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < local12.anIntArray396.length; local34++) {
				if (arg1 == local12.anIntArray397[local34]) {
					local32 += local12.anIntArray396[local34];
				}
			}
			return local32;
		}
	}
}
