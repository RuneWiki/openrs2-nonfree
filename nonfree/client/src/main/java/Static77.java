import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "Lclient!vd;")
	public static Class353 aClass353_14;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
	public static int method1323() {
		if (Static478.aClass302_56 == null) {
			if (!Static71.aBoolean94 && Static482.aClass6_Sub2_Sub4_4 != null) {
				return Static482.aClass6_Sub2_Sub4_4.anInt1736;
			}
			@Pc(18) int local18 = Static429.aClass71_1.method7701();
			@Pc(22) int local22 = Static429.aClass71_1.method7702();
			@Pc(43) int local43;
			@Pc(45) int local45;
			@Pc(62) int local62;
			@Pc(132) Class6_Sub2_Sub4 local132;
			if (Static165.aBoolean249) {
				@Pc(249) Class134 local249;
				if (Static29.anInt622 < local18 && local18 < Static29.anInt622 + Static400.anInt7476) {
					local43 = -1;
					for (local45 = 0; local45 < Static608.anInt10066; local45++) {
						if (Static270.aBoolean364) {
							local62 = Static94.anInt1854 + local45 * 16 + 33;
							if (local62 - 13 < local22 && local62 + 3 >= local22) {
								local43 = local45;
							}
						} else {
							local62 = local45 * 16 + Static94.anInt1854 + 31;
							if (local62 - 13 < local22 && local62 + 3 >= local22) {
								local43 = local45;
							}
						}
					}
					if (local43 != -1) {
						local62 = 0;
						local249 = new Class134(Static603.aClass286_12);
						for (@Pc(254) Class6_Sub2_Sub12 local254 = (Class6_Sub2_Sub12) local249.method3651(); local254 != null; local254 = (Class6_Sub2_Sub12) local249.method3649()) {
							if (local43 == local62++) {
								return ((Class6_Sub2_Sub4) local254.aClass286_6.aClass6_Sub2_56.aClass6_Sub2_66).anInt1736;
							}
						}
					}
				} else if (Static72.aClass6_Sub2_Sub12_1 != null && Static195.anInt3962 < local18 && local18 < Static282.anInt5632 + Static195.anInt3962) {
					local43 = -1;
					for (local45 = 0; local45 < Static72.aClass6_Sub2_Sub12_1.anInt5417; local45++) {
						if (Static270.aBoolean364) {
							local62 = Static617.anInt10189 + local45 * 16 + 33;
							if (local62 - 13 < local22 && local22 <= local62 + 3) {
								local43 = local45;
							}
						} else {
							local62 = local45 * 16 + Static617.anInt10189 + 31;
							if (local62 - 13 < local22 && local62 + 3 >= local22) {
								local43 = local45;
							}
						}
					}
					if (local43 != -1) {
						local62 = 0;
						local249 = new Class134(Static72.aClass6_Sub2_Sub12_1.aClass286_6);
						for (local132 = (Class6_Sub2_Sub4) local249.method3651(); local132 != null; local132 = (Class6_Sub2_Sub4) local249.method3649()) {
							if (local43 == local62++) {
								return local132.anInt1736;
							}
						}
					}
				}
			} else if (Static29.anInt622 < local18 && local18 < Static29.anInt622 + Static400.anInt7476) {
				local43 = -1;
				for (local45 = 0; local45 < Static462.anInt8179; local45++) {
					if (Static270.aBoolean364) {
						local62 = Static94.anInt1854 + (-local45 + -1 + Static462.anInt8179) * 16 + 33;
						if (local22 > local62 - 13 && local62 + 3 >= local22) {
							local43 = local45;
						}
					} else {
						local62 = Static94.anInt1854 + (Static462.anInt8179 + -1 + -local45) * 16 + 31;
						if (local62 - 13 < local22 && local62 + 3 >= local22) {
							local43 = local45;
						}
					}
				}
				if (local43 != -1) {
					local62 = 0;
					@Pc(127) Class91 local127 = new Class91(Static298.aClass8_34);
					for (local132 = (Class6_Sub2_Sub4) local127.method2338(); local132 != null; local132 = (Class6_Sub2_Sub4) local127.method2335()) {
						if (local62++ == local43) {
							return local132.anInt1736;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)Z")
	public static boolean method1324() {
		if (Static215.aClass6_Sub2_Sub4_2 == null) {
			return false;
		} else {
			if (Static215.aClass6_Sub2_Sub4_2.anInt1738 >= 2000) {
				Static215.aClass6_Sub2_Sub4_2.anInt1738 -= 2000;
			}
			return Static215.aClass6_Sub2_Sub4_2.anInt1738 == 1003;
		}
	}
}
