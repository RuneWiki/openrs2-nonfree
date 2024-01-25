import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!em;")
	public static final Class83 aClass83_200 = new Class83(60, 3);

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Lclient!tp;")
	public static final Class322 aClass322_7 = new Class322();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIBI)V")
	public static void method7528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg1;
		@Pc(16) int local16 = -arg1;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1 + arg2);
		@Pc(34) int local34 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg2 - arg1);
		Static329.method4871(local34, local26, Static280.anIntArrayArray25[arg3], arg0);
		while (local7 < local13) {
			local18 += 2;
			local16 += local18;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(85) int local85;
			@Pc(94) int local94;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local63 = arg3 - local13;
				local67 = local13 + arg3;
				if (local67 >= Static120.anInt2491 && Static71.anInt1350 >= local63) {
					local85 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg2 + local7);
					local94 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg2 - local7);
					if (Static71.anInt1350 >= local67) {
						Static329.method4871(local94, local85, Static280.anIntArrayArray25[local67], arg0);
					}
					if (Static120.anInt2491 <= local63) {
						Static329.method4871(local94, local85, Static280.anIntArrayArray25[local63], arg0);
					}
				}
			}
			local7++;
			local63 = arg3 - local7;
			local67 = local7 + arg3;
			if (local67 >= Static120.anInt2491 && local63 <= Static71.anInt1350) {
				local85 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg2 + local13);
				local94 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg2 - local13);
				if (local67 <= Static71.anInt1350) {
					Static329.method4871(local94, local85, Static280.anIntArrayArray25[local67], arg0);
				}
				if (local63 >= Static120.anInt2491) {
					Static329.method4871(local94, local85, Static280.anIntArrayArray25[local63], arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
	public static void method7529() {
		if (Static432.anInterface24Array1 == null) {
			return;
		}
		@Pc(12) Interface24[] local12 = Static432.anInterface24Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Interface24 local20 = local12[local14];
			local20.method2170();
		}
	}
}
