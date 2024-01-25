import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	public static int anInt4419;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Lclient!lb;")
	public static final Class2_Sub30 aClass2_Sub30_2 = new Class2_Sub30(0, 0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIZZ)I")
	public static int method3851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) Class2_Sub43 local15 = Static95.method1915(false, arg1);
		if (local15 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local15.anIntArray671.length; local23++) {
			if (local15.anIntArray671[local23] >= 0 && local15.anIntArray671[local23] < Static470.aClass250_1.anInt6847) {
				@Pc(48) Class327 local48 = Static470.aClass250_1.method5960(local15.anIntArray671[local23]);
				@Pc(58) int local58 = local48.method7508(arg0, Static106.aClass293_1.method6807(arg0).anInt8782);
				if (arg2) {
					local21 += local15.anIntArray672[local23] * local58;
				} else {
					local21 += local58;
				}
			}
		}
		return local21;
	}
}
