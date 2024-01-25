import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "[Lclient!hc;")
	public static final Class134[] aClass134Array1 = new Class134[100];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZIIZI)I")
	public static int method8164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class4_Sub30 local10 = Static289.method4604(arg0, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray329.length; local18++) {
			if (local10.anIntArray329[local18] >= 0 && local10.anIntArray329[local18] < Static338.aClass29_1.anInt1147) {
				@Pc(43) Class236 local43 = Static338.aClass29_1.method977(local10.anIntArray329[local18]);
				@Pc(53) int local53 = local43.method5330(arg1, Static245.aClass107_2.method2503(arg1).anInt8186);
				if (arg2) {
					local16 += local53 * local10.anIntArray328[local18];
				} else {
					local16 += local53;
				}
			}
		}
		return local16;
	}
}
