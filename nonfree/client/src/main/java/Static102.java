import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
	public static int anInt2078;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZI)I")
	public static int method1869(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class3_Sub45 local10 = Static162.method826(arg2, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray510.length; local24++) {
				if (local10.anIntArray511[local24] == arg0) {
					local22 += local10.anIntArray510[local24];
				}
			}
			return local22;
		}
	}
}
