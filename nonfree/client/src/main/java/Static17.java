import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "Lclient!td;")
	public static Class318 aClass318_1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)I")
	public static int method255(@OriginalArg(1) boolean arg0) {
		if (Static65.anIntArray96 == null) {
			return 0;
		} else if (arg0 || Static133.aClass249Array30 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static65.anIntArray96.length; local22++) {
				@Pc(28) int local28 = Static65.anIntArray96[local22];
				if (Static347.aClass343_168.method8138(local28)) {
					local20++;
				}
				if (Static258.aClass343_130.method8138(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static65.anIntArray96.length * 2;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
	public static void method256(@OriginalArg(1) int arg0) {
		Static436.anInt7587 = arg0;
		Static552.aClass136_63.method3142();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIII)I")
	public static int method258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static214.anInt4427 < 100) {
			return -2;
		}
		@Pc(17) int local17 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(24) int local24 = arg2 - Static598.anInt2992;
		@Pc(29) int local29 = arg1 - Static598.anInt2995;
		for (@Pc(34) Class3_Sub47 local34 = (Class3_Sub47) Static598.aClass216_26.method5457(); local34 != null; local34 = (Class3_Sub47) Static598.aClass216_26.method5458()) {
			if (local34.anInt9169 == arg0) {
				@Pc(43) int local43 = local34.anInt9168;
				@Pc(46) int local46 = local34.anInt9165;
				@Pc(56) int local56 = local46 + Static598.anInt2995 | Static598.anInt2992 + local43 << 14;
				@Pc(75) int local75 = (local29 - local46) * (local29 - local46) + (local24 - local43) * (local24 + -local43);
				if (local17 < 0 || local75 < local19) {
					local19 = local75;
					local17 = local56;
				}
			}
		}
		return local17;
	}
}
