import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	public static int anInt2189 = 0;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "Lclient!g;")
	public static Class58 aClass58_11 = new Class58(16);

	@OriginalMember(owner = "client!id", name = "K", descriptor = "Lclient!th;")
	public static Class169 aClass169_65 = new Class169(64);

	@OriginalMember(owner = "client!id", name = "M", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!id", name = "N", descriptor = "I")
	public static int anInt2216 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)I")
	public static int method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 65536 - Class17.anIntArray24[arg0 * 1024 / arg1] >> 1;
		return (arg3 * (65536 - local11) >> 16) + (local11 * arg2 >> 16);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method1804(@OriginalArg(1) String[] arg0) {
		@Pc(4) String[] local4 = new String[5];
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			local4[local6] = local6 + ": ";
			if (arg0 != null && arg0[local6] != null) {
				local4[local6] = local4[local6] + arg0[local6];
			}
		}
		return local4;
	}
}
