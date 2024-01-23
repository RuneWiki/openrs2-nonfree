import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!hc;")
	public static Class51 aClass51_64;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
	public static int anInt4411;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
	public static int anInt4412;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString297 = "Loading title screen - ";

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ql;B)Lclient!p;")
	public static Class25_Sub4 method3324(@OriginalArg(0) Class1_Sub13 arg0) {
		return new Class25_Sub4(arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1798(), arg0.method1773(), arg0.method1773(), arg0.method1772());
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!hc;BLclient!hc;)V")
	public static void method3325(@OriginalArg(0) Class51 arg0, @OriginalArg(2) Class51 arg1) {
		Static201.aClass51_65 = arg1;
		Static82.aClass51_26 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)I")
	public static int method3326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static38.anIntArrayArrayArray6 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > 103 || local15 > 103) {
			return 0;
		}
		@Pc(34) int local34 = arg0;
		if (arg0 < 3 && (Static145.aByteArrayArrayArray13[1][local11][local15] & 0x2) == 2) {
			local34 = arg0 + 1;
		}
		@Pc(53) int local53 = arg2 & 0x7F;
		@Pc(57) int local57 = arg1 & 0x7F;
		@Pc(84) int local84 = (128 - local53) * Static38.anIntArrayArrayArray6[local34][local11][local15] + Static38.anIntArrayArrayArray6[local34][local11 + 1][local15] * local53 >> 7;
		@Pc(115) int local115 = Static38.anIntArrayArrayArray6[local34][local11 + 1][local15 + 1] * local53 + (128 - local53) * Static38.anIntArrayArrayArray6[local34][local11][local15 + 1] >> 7;
		return local115 * local57 + local84 * (128 - local57) >> 7;
	}
}
