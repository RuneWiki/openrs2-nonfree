import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "I")
	public static int anInt3515;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_57 = new Class349(53, 0);

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
	public static int anInt3520 = 0;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_63 = new Class225(139, -2);

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)I")
	public static int method3083() {
		if (Static650.aClass273_17 == null) {
			if (!Static189.aBoolean301 && Static91.aClass2_Sub6_Sub20_2 != null) {
				return Static91.aClass2_Sub6_Sub20_2.anInt9595;
			}
			@Pc(23) int local23 = Static402.aClass138_1.method4767();
			@Pc(29) int local29 = Static402.aClass138_1.method4771();
			@Pc(69) int local69;
			@Pc(71) int local71;
			@Pc(85) int local85;
			@Pc(155) Class2_Sub6_Sub20 local155;
			if (Static721.aBoolean939) {
				@Pc(148) Class59 local148;
				if (local23 > Static216.anInt3440 && local23 < Static699.anInt10734 + Static216.anInt3440) {
					local69 = -1;
					for (local71 = 0; local71 < Static7.anInt82; local71++) {
						if (Static437.aBoolean603) {
							local85 = Static215.anInt3422 + local71 * 16 + 33;
							if (local85 - 13 < local29 && local29 <= local85 + 3) {
								local69 = local71;
							}
						} else {
							local85 = local71 * 16 + Static215.anInt3422 + 31;
							if (local29 > local85 - 13 && local29 <= local85 + 3) {
								local69 = local71;
							}
						}
					}
					if (local69 != -1) {
						local85 = 0;
						local148 = new Class59(Static416.aClass388_6);
						for (@Pc(276) Class2_Sub6_Sub7 local276 = (Class2_Sub6_Sub7) local148.method1202(); local276 != null; local276 = (Class2_Sub6_Sub7) local148.method1201()) {
							if (local69 == local85++) {
								return ((Class2_Sub6_Sub20) local276.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64).anInt9595;
							}
						}
					}
				} else if (Static671.aClass2_Sub6_Sub7_1 != null && Static261.anInt10711 < local23 && Static18.anInt242 + Static261.anInt10711 > local23) {
					local69 = -1;
					for (local71 = 0; local71 < Static671.aClass2_Sub6_Sub7_1.anInt4448; local71++) {
						if (Static437.aBoolean603) {
							local85 = local71 * 16 + Static555.anInt8749 + 33;
							if (local29 > local85 - 13 && local29 <= local85 + 3) {
								local69 = local71;
							}
						} else {
							local85 = Static555.anInt8749 + local71 * 16 + 31;
							if (local85 - 13 < local29 && local85 + 3 >= local29) {
								local69 = local71;
							}
						}
					}
					if (local69 != -1) {
						local85 = 0;
						local148 = new Class59(Static671.aClass2_Sub6_Sub7_1.aClass388_4);
						for (local155 = (Class2_Sub6_Sub20) local148.method1202(); local155 != null; local155 = (Class2_Sub6_Sub20) local148.method1201()) {
							if (local85++ == local69) {
								return local155.anInt9595;
							}
						}
					}
				}
			} else if (local23 > Static216.anInt3440 && local23 < Static699.anInt10734 + Static216.anInt3440) {
				local69 = -1;
				for (local71 = 0; local71 < Static535.anInt8486; local71++) {
					if (Static437.aBoolean603) {
						local85 = (Static535.anInt8486 - local71 - 1) * 16 + Static215.anInt3422 + 33;
						if (local85 - 13 < local29 && local29 <= local85 + 3) {
							local69 = local71;
						}
					} else {
						local85 = (Static535.anInt8486 - local71 - 1) * 16 + Static215.anInt3422 + 31;
						if (local29 > local85 - 13 && local85 + 3 >= local29) {
							local69 = local71;
						}
					}
				}
				if (local69 != -1) {
					local85 = 0;
					@Pc(414) Class190 local414 = new Class190(Static273.aClass60_88);
					for (local155 = (Class2_Sub6_Sub20) local414.method4065(); local155 != null; local155 = (Class2_Sub6_Sub20) local414.method4062()) {
						if (local69 == local85++) {
							return local155.anInt9595;
						}
					}
				}
			}
		}
		return -1;
	}
}
