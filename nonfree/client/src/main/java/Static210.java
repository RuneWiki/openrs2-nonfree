import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "Lclient!tj;")
	public static Class193 aClass193_76;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
	public static int anInt4363;

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_157 = new Class198(64);

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static2.aByteArrayArrayArray1[0][arg2][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static2.aByteArrayArrayArray1[arg0][arg2][arg1] & 0x10) == 0) {
			return arg3 == Static45.method920(arg1, arg2, arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)V")
	public static void method3896(@OriginalArg(1) long arg0) {
		if (Static273.aClass128ArrayArrayArray4 != null) {
			if (Static353.anInt2640 == 1 || Static353.anInt2640 == 5) {
				Static141.method2951(arg0);
			} else if (Static353.anInt2640 == 4) {
				Static73.method1856(arg0);
			}
		}
		Static242.method5188(Static274.aClass47_9, (long) Static199.anInt4137);
		if (Static357.anInt6821 != -1) {
			Static125.method2597(Static357.anInt6821);
		}
		for (@Pc(47) int local47 = 0; local47 < Static67.anInt1778; local47++) {
			if (Static172.aBooleanArray19[local47]) {
				Static353.aBooleanArray12[local47] = true;
			}
			Static89.aBooleanArray9[local47] = Static172.aBooleanArray19[local47];
			Static172.aBooleanArray19[local47] = false;
		}
		Static226.anInt4584 = Static199.anInt4137;
		if (Static274.aClass47_9.method2712()) {
			Static121.aBoolean372 = true;
		}
		if (Static357.anInt6821 != -1) {
			Static67.anInt1778 = 0;
			Static282.method4194();
		}
		Static274.aClass47_9.method2722();
		Static255.method4467(Static274.aClass47_9);
		@Pc(97) int local97 = Static247.method4389();
		if (local97 == -1) {
			local97 = Static65.anInt1680;
		}
		Static75.method1747(local97);
		Static117.method2455(Static12.anInt267, Static218.anInt4454, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701);
		Static218.anInt4454 = 0;
	}
}
