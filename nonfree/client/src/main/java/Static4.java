import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "Lclient!rh;")
	public static Class296 aClass296_1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)I")
	public static int method112() {
		if (Static612.aClass24_17 == null) {
			if (!Static65.aBoolean754 && Static74.aClass2_Sub6_Sub3_1 != null) {
				return Static74.aClass2_Sub6_Sub3_1.anInt2632;
			}
			@Pc(23) int local23 = Static628.aClass9_1.method803();
			@Pc(27) int local27 = Static628.aClass9_1.method800();
			@Pc(57) int local57;
			@Pc(59) int local59;
			@Pc(71) int local71;
			@Pc(139) Class2_Sub6_Sub3 local139;
			if (Static374.aBoolean539) {
				@Pc(134) Class251 local134;
				if (Static274.anInt5852 < local23 && local23 < Static278.anInt5905 + Static274.anInt5852) {
					local57 = -1;
					for (local59 = 0; local59 < Static193.anInt4507; local59++) {
						if (Static292.aBoolean464) {
							local71 = Static332.anInt6717 + local59 * 16 + 33;
							if (local71 - 13 < local27 && local27 <= local71 + 3) {
								local57 = local59;
							}
						} else {
							local71 = local59 * 16 + Static332.anInt6717 + 31;
							if (local71 - 13 < local27 && local71 + 3 >= local27) {
								local57 = local59;
							}
						}
					}
					if (local57 != -1) {
						local71 = 0;
						local134 = new Class251(Static522.aClass211_7);
						for (@Pc(239) Class2_Sub6_Sub21 local239 = (Class2_Sub6_Sub21) local134.method6623(); local239 != null; local239 = (Class2_Sub6_Sub21) local134.method6626()) {
							if (local57 == local71++) {
								return ((Class2_Sub6_Sub3) local239.aClass211_12.aClass2_Sub6_48.aClass2_Sub6_66).anInt2632;
							}
						}
					}
				} else if (Static532.aClass2_Sub6_Sub21_1 != null && Static202.anInt4656 < local23 && local23 < Static40.anInt1336 + Static202.anInt4656) {
					local57 = -1;
					for (local59 = 0; local59 < Static532.aClass2_Sub6_Sub21_1.anInt10705; local59++) {
						if (Static292.aBoolean464) {
							local71 = Static169.anInt731 + local59 * 16 + 33;
							if (local71 - 13 < local27 && local27 <= local71 + 3) {
								local57 = local59;
							}
						} else {
							local71 = local59 * 16 + Static169.anInt731 + 31;
							if (local27 > local71 - 13 && local71 + 3 >= local27) {
								local57 = local59;
							}
						}
					}
					if (local57 != -1) {
						local71 = 0;
						local134 = new Class251(Static532.aClass2_Sub6_Sub21_1.aClass211_12);
						for (local139 = (Class2_Sub6_Sub3) local134.method6623(); local139 != null; local139 = (Class2_Sub6_Sub3) local134.method6626()) {
							if (local71++ == local57) {
								return local139.anInt2632;
							}
						}
					}
				}
			} else if (Static274.anInt5852 < local23 && local23 < Static274.anInt5852 + Static278.anInt5905) {
				local57 = -1;
				for (local59 = 0; local59 < Static298.anInt6262; local59++) {
					if (Static292.aBoolean464) {
						local71 = (Static298.anInt6262 - local59 - 1) * 16 + Static332.anInt6717 + 33;
						if (local27 > local71 - 13 && local27 <= local71 + 3) {
							local57 = local59;
						}
					} else {
						local71 = Static332.anInt6717 + (-local59 + (Static298.anInt6262 - 1)) * 16 + 31;
						if (local27 > local71 - 13 && local71 + 3 >= local27) {
							local57 = local59;
						}
					}
				}
				if (local57 != -1) {
					local71 = 0;
					@Pc(357) Class56 local357 = new Class56(Static216.aClass341_39);
					for (local139 = (Class2_Sub6_Sub3) local357.method2108(); local139 != null; local139 = (Class2_Sub6_Sub3) local357.method2110()) {
						if (local57 == local71++) {
							return local139.anInt2632;
						}
					}
				}
			}
		}
		return -1;
	}
}
