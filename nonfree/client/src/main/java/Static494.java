import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!ro", name = "H", descriptor = "I")
	public static int anInt8752;

	@OriginalMember(owner = "client!ro", name = "I", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7229(@OriginalArg(0) Class16 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static513.aBoolean642) {
			local7 = Static550.method8313();
			local9 = Static530.method7484();
		}
		@Pc(21) int local21 = Static465.anInt8462 + local7;
		@Pc(25) int local25 = Static122.anInt3308 + local9;
		@Pc(27) int local27 = Static306.anInt6216;
		@Pc(31) int local31 = Static359.anInt6890 - 3;
		Static199.method3713(Static306.anInt6216, Static359.anInt6890, local9 + Static122.anInt3308, Static465.anInt8462 - -local7, Static121.aClass84_24.method2710(Static372.anInt7083), arg0);
		@Pc(57) int local57 = Static288.aClass35_6.method5764() + local7;
		@Pc(67) int local67 = local9 + Static288.aClass35_6.method5761();
		@Pc(71) int local71;
		@Pc(76) Class8_Sub5_Sub6 local76;
		@Pc(88) int local88;
		@Pc(182) int local182;
		@Pc(254) Class8_Sub5_Sub7 local254;
		@Pc(169) Class8_Sub5_Sub7 local169;
		if (Static577.aBoolean710) {
			local71 = 0;
			for (local76 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7327(); local76 != null; local76 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7326()) {
				local88 = local71 * 16 + local25 + 33;
				if (local57 > Static465.anInt8462 + local7 && local57 < local7 + Static465.anInt8462 + Static306.anInt6216 && local88 - 13 < local67 && local88 + 4 > local67 && (local76.anInt3391 > 1 || ((Class8_Sub5_Sub7) local76.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66).aBoolean279)) {
					arg0.aa(local7 + Static465.anInt8462, local88 + -12, Static306.anInt6216, 16, 255 - Static414.anInt7873 << 24 | Static188.anInt4405, 1);
				}
				local71++;
			}
			if (Static479.aClass8_Sub5_Sub6_1 != null) {
				local71 = 0;
				Static199.method3713(Static358.anInt6868, Static331.anInt10704, Static528.anInt9126, Static264.anInt5648, Static479.aClass8_Sub5_Sub6_1.aString37, arg0);
				for (local169 = (Class8_Sub5_Sub7) Static479.aClass8_Sub5_Sub6_1.aClass302_2.method7327(); local169 != null; local169 = (Class8_Sub5_Sub7) Static479.aClass8_Sub5_Sub6_1.aClass302_2.method7326()) {
					local182 = Static528.anInt9126 + local71 * 16 + 33;
					if (local57 > Static264.anInt5648 && Static264.anInt5648 + Static358.anInt6868 > local57 && local67 > local182 - 13 && local67 < local182 + 4 && local169.aBoolean279) {
						arg0.aa(Static264.anInt5648, local182 - 12, Static358.anInt6868, 16, Static188.anInt4405 | 255 - Static414.anInt7873 << 24, 1);
					}
					local71++;
				}
				Static46.method1365(Static264.anInt5648, Static358.anInt6868, arg0, Static528.anInt9126, Static331.anInt10704);
			}
		} else {
			local71 = 0;
			for (local254 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local254 != null; local254 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
				local88 = (Static548.anInt9471 - local71 - 1) * 16 + local25 + 20 + 13;
				if (Static465.anInt8462 + local7 < local57 && Static306.anInt6216 + Static465.anInt8462 + local7 > local57 && local67 > local88 - 13 && local88 + 4 > local67 && local254.aBoolean279) {
					arg0.aa(local7 + Static465.anInt8462, local88 + -12, Static306.anInt6216, 16, Static188.anInt4405 | 255 - Static414.anInt7873 << 24, 1);
				}
				local71++;
			}
		}
		Static46.method1365(Static465.anInt8462 + local7, Static306.anInt6216, arg0, local9 + Static122.anInt3308, Static359.anInt6890);
		if (Static577.aBoolean710) {
			local71 = 0;
			for (local76 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7327(); local76 != null; local76 = (Class8_Sub5_Sub6) Static414.aClass302_11.method7326()) {
				local88 = local9 + Static122.anInt3308 + local71 * 16 + 20 + 13;
				local71++;
				if (local76.anInt3391 == 1) {
					Static249.method4527(Static122.anInt3308 + local9, (Class8_Sub5_Sub7) local76.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66, Static220.anInt5056 | 0xFF000000, Static328.anInt9773 | 0xFF000000, local57, Static306.anInt6216, local7 + Static465.anInt8462, arg0, Static359.anInt6890, local67, local88);
				} else {
					Static97.method2224(arg0, local9 + Static122.anInt3308, local76, local88, Static328.anInt9773 | 0xFF000000, Static465.anInt8462 + local7, Static306.anInt6216, Static220.anInt5056 | 0xFF000000, Static359.anInt6890, local57, local67);
				}
			}
			if (Static479.aClass8_Sub5_Sub6_1 != null) {
				local71 = 0;
				for (local169 = (Class8_Sub5_Sub7) Static479.aClass8_Sub5_Sub6_1.aClass302_2.method7327(); local169 != null; local169 = (Class8_Sub5_Sub7) Static479.aClass8_Sub5_Sub6_1.aClass302_2.method7326()) {
					local182 = local71 * 16 + Static528.anInt9126 + 13 + 20;
					Static249.method4527(Static528.anInt9126, local169, Static220.anInt5056 | 0xFF000000, Static328.anInt9773 | 0xFF000000, local57, Static358.anInt6868, Static264.anInt5648, arg0, Static331.anInt10704, local67, local182);
					local71++;
				}
				Static436.method6738(Static358.anInt6868, Static528.anInt9126, Static331.anInt10704, Static264.anInt5648);
			}
		} else {
			local71 = 0;
			for (local254 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1422(); local254 != null; local254 = (Class8_Sub5_Sub7) Static72.aClass43_17.method1426()) {
				local88 = (Static548.anInt9471 - local71 - 1) * 16 + local25 + 13 + 20;
				Static249.method4527(local25, local254, Static220.anInt5056 | 0xFF000000, Static328.anInt9773 | 0xFF000000, local57, local27, local21, arg0, local31, local67, local88);
				local71++;
			}
		}
		Static436.method6738(Static306.anInt6216, local9 + Static122.anInt3308, Static359.anInt6890, local7 + Static465.anInt8462);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)Z")
	public static boolean method7230(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
