import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt1302;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public static int anInt1301 = 0;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_475 = Static186.method3527(":assistreq:");

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_476 = Static186.method3527("_labels");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "()V")
	public static void method1004() {
		Static166.anInt3403 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static212.anInt4196; local3++) {
			@Pc(8) Class95 local8 = Static233.aClass95Array2[local3];
			@Pc(12) int local12;
			if (Static99.anIntArray519 != null) {
				for (local12 = 0; local12 < Static99.anIntArray519.length; local12++) {
					if (Static99.anIntArray519[local12] != -1000000 && (local8.anInt3714 <= Static99.anIntArray519[local12] || local8.anInt3705 <= Static99.anIntArray519[local12]) && (local8.anInt3698 <= Static7.anIntArray17[local12] || local8.anInt3713 <= Static7.anIntArray17[local12]) && (local8.anInt3698 >= Static185.anIntArray433[local12] || local8.anInt3713 >= Static185.anIntArray433[local12]) && (local8.anInt3711 <= Static59.anIntArray99[local12] || local8.anInt3707 <= Static59.anIntArray99[local12]) && (local8.anInt3711 >= Static17.anIntArray37[local12] || local8.anInt3707 >= Static17.anIntArray37[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt3715 == 1) {
				local12 = local8.anInt3700 + Static75.anInt1524 - Static98.anInt2000;
				if (local12 >= 0 && local12 <= Static75.anInt1524 + Static75.anInt1524) {
					local110 = local8.anInt3712 + Static75.anInt1524 - Static35.anInt740;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt3709 + Static75.anInt1524 - Static35.anInt740;
					if (local121 > Static75.anInt1524 + Static75.anInt1524) {
						local121 = Static75.anInt1524 + Static75.anInt1524;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static16.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static85.anInt1761 - local8.anInt3698;
						if (local153 > 32) {
							local8.anInt3708 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt3708 = 2;
							local153 = -local153;
						}
						local8.anInt3710 = (local8.anInt3711 - Static221.anInt4311 << 8) / local153;
						local8.anInt3699 = (local8.anInt3707 - Static221.anInt4311 << 8) / local153;
						local8.anInt3704 = (local8.anInt3714 - Static131.anInt2716 << 8) / local153;
						local8.anInt3695 = (local8.anInt3705 - Static131.anInt2716 << 8) / local153;
						Static199.aClass95Array1[Static166.anInt3403++] = local8;
					}
				}
			} else if (local8.anInt3715 == 2) {
				local12 = local8.anInt3712 + Static75.anInt1524 - Static35.anInt740;
				if (local12 >= 0 && local12 <= Static75.anInt1524 + Static75.anInt1524) {
					local110 = local8.anInt3700 + Static75.anInt1524 - Static98.anInt2000;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt3716 + Static75.anInt1524 - Static98.anInt2000;
					if (local121 > Static75.anInt1524 + Static75.anInt1524) {
						local121 = Static75.anInt1524 + Static75.anInt1524;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static16.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static221.anInt4311 - local8.anInt3711;
						if (local153 > 32) {
							local8.anInt3708 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt3708 = 4;
							local153 = -local153;
						}
						local8.anInt3703 = (local8.anInt3698 - Static85.anInt1761 << 8) / local153;
						local8.anInt3697 = (local8.anInt3713 - Static85.anInt1761 << 8) / local153;
						local8.anInt3704 = (local8.anInt3714 - Static131.anInt2716 << 8) / local153;
						local8.anInt3695 = (local8.anInt3705 - Static131.anInt2716 << 8) / local153;
						Static199.aClass95Array1[Static166.anInt3403++] = local8;
					}
				}
			} else if (local8.anInt3715 == 4) {
				local12 = local8.anInt3714 - Static131.anInt2716;
				if (local12 > 128) {
					local110 = local8.anInt3712 + Static75.anInt1524 - Static35.anInt740;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt3709 + Static75.anInt1524 - Static35.anInt740;
					if (local121 > Static75.anInt1524 + Static75.anInt1524) {
						local121 = Static75.anInt1524 + Static75.anInt1524;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt3700 + Static75.anInt1524 - Static98.anInt2000;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt3716 + Static75.anInt1524 - Static98.anInt2000;
						if (local153 > Static75.anInt1524 + Static75.anInt1524) {
							local153 = Static75.anInt1524 + Static75.anInt1524;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static16.aBooleanArrayArray1[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt3708 = 5;
							local8.anInt3703 = (local8.anInt3698 - Static85.anInt1761 << 8) / local12;
							local8.anInt3697 = (local8.anInt3713 - Static85.anInt1761 << 8) / local12;
							local8.anInt3710 = (local8.anInt3711 - Static221.anInt4311 << 8) / local12;
							local8.anInt3699 = (local8.anInt3707 - Static221.anInt4311 << 8) / local12;
							Static199.aClass95Array1[Static166.anInt3403++] = local8;
						}
					}
				}
			}
		}
	}
}
