import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "Z")
	public static boolean aBoolean372;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "Lclient!vh;")
	public static Class356 aClass356_1;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "Z")
	public static boolean aBoolean373 = false;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
	public static final int anInt4998 = -1;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BIII[BII)Z")
	public static boolean method4077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg0 % 8;
		@Pc(21) int local21;
		if (local14 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local14;
		}
		@Pc(34) int local34 = -((arg4 + 8 - 1) / 8);
		@Pc(43) int local43 = -((arg0 + 8 - 1) / 8);
		for (@Pc(45) int local45 = local34; local45 < 0; local45++) {
			for (@Pc(49) int local49 = local43; local49 < 0; local49++) {
				if (arg2[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local21;
			if (arg2[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg3;
		}
		return false;
	}
}
