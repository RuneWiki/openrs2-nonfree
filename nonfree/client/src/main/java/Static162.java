import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ht", name = "be", descriptor = "I")
	public static int anInt2966;

	@OriginalMember(owner = "client!ht", name = "Jd", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_57 = new Class237(88, 3);

	@OriginalMember(owner = "client!ht", name = "fe", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ht", name = "he", descriptor = "I")
	public static int anInt2970 = 0;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(IIIIIIIIII)V")
	public static void method2525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static130.method1891(arg6)) {
			return;
		}
		if (Static346.aClass219ArrayArray1[arg6] == null) {
			Static53.method924(Static448.aClass219ArrayArray2[arg6], -1, arg1, arg0, arg5, arg2, arg4, arg3, arg8, arg7);
		} else {
			Static53.method924(Static346.aClass219ArrayArray1[arg6], -1, arg1, arg0, arg5, arg2, arg4, arg3, arg8, arg7);
		}
	}

	@OriginalMember(owner = "client!ht", name = "o", descriptor = "(I)Lclient!ae;")
	public static Class1_Sub2_Sub1 method2558() {
		@Pc(16) Class1_Sub2_Sub1 local16 = (Class1_Sub2_Sub1) Static124.aClass42_2.method1061();
		if (local16 != null) {
			local16.method6071();
			local16.method5883();
			return local16;
		}
		do {
			local16 = (Class1_Sub2_Sub1) Static248.aClass42_10.method1061();
			if (local16 == null) {
				return null;
			}
			if (local16.method199() > Static101.method1557()) {
				return null;
			}
			local16.method6071();
			local16.method5883();
		} while ((local16.aLong221 & Long.MIN_VALUE) == 0L);
		return local16;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIB)I")
	public static int method2596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static360.method5080(arg1 - 1, arg0 + -1) + Static360.method5080(arg1 - 1, arg0 + 1) + Static360.method5080(arg1 + 1, arg0 + -1) + Static360.method5080(arg1 + 1, arg0 + 1);
		@Pc(87) int local87 = Static360.method5080(arg1, arg0 - 1) + Static360.method5080(arg1, arg0 + 1) + Static360.method5080(arg1 - 1, arg0) + Static360.method5080(arg1 + 1, arg0);
		@Pc(92) int local92 = Static360.method5080(arg1, arg0);
		return local42 / 16 + local87 / 8 + local92 / 4;
	}
}
