import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt5314;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "[S")
	public static final short[] aShortArray70 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBZ)I")
	public static int method4375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) Class3_Sub32 local15 = Static457.method6232(arg2, arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local15.anIntArray275.length; local29++) {
				if (local15.anIntArray274[local29] == arg0) {
					local27 += local15.anIntArray275[local29];
				}
			}
			return local27;
		}
	}
}
