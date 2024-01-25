import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "[I")
	public static final int[] anIntArray148 = new int[2048];

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZ)Z")
	public static boolean method1527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIZI)I")
	public static int method1529(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class2_Sub36 local15 = Static382.method4911(arg1, arg0);
		if (local15 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local15.anIntArray396.length; local29++) {
				if (arg2 == local15.anIntArray395[local29]) {
					local27 += local15.anIntArray396[local29];
				}
			}
			return local27;
		}
	}
}
