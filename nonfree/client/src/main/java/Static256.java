import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "[[[Lclient!ne;")
	public static Class224[][][] aClass224ArrayArrayArray1;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIB)Z")
	public static boolean method4465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg4; local7++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg1; local16++) {
				if (Static238.anIntArrayArray34[local7][local16] == arg0 && Static143.anIntArrayArray20[local7][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
