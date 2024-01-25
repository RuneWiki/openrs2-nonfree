import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_14 = new Class363(3, 6);

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_15 = new Class363(81, 1);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZII)I")
	public static int method314(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class2_Sub23 local10 = Static124.method1801(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray233.length; local24++) {
				if (local10.anIntArray234[local24] == arg2) {
					local22 += local10.anIntArray233[local24];
				}
			}
			return local22;
		}
	}
}
