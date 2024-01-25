import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!pq", name = "R", descriptor = "I")
	public static int anInt4981;

	@OriginalMember(owner = "client!pq", name = "T", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
	public static int anInt4969 = 0;

	@OriginalMember(owner = "client!pq", name = "W", descriptor = "Lclient!dt;")
	public static final Class55 aClass55_6 = new Class55(128);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIZIZ)I")
	public static int method4345(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class2_Sub16 local10 = Static108.method2083(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray273.length; local18++) {
			if (local10.anIntArray273[local18] >= 0 && Static106.aClass250_1.anInt6708 > local10.anIntArray273[local18]) {
				@Pc(44) Class117 local44 = Static106.aClass250_1.method5735(local10.anIntArray273[local18]);
				@Pc(54) int local54 = local44.method2631(Static82.aClass184_1.method4403(arg0).anInt1488, arg0);
				if (arg2) {
					local16 += local54 * local10.anIntArray272[local18];
				} else {
					local16 += local54;
				}
			}
		}
		return local16;
	}
}
