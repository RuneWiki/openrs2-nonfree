import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!dfa", name = "j", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_29 = new Class187(89, 8);

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!wk;III[I[I)Lclient!lga;")
	public static Class1_Sub2 method1669(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg0.method6304(Static83.aClass255_1, Static314.aClass206_12)) {
			@Pc(21) int[] local21 = new int[arg1 * arg2];
			for (local23 = 0; local23 < arg2; local23++) {
				local33 = arg3[local23] + arg1 * local23;
				for (local35 = 0; local35 < arg4[local23]; local35++) {
					local21[local33++] = -16777216;
				}
			}
			return new Class1_Sub2(arg0, arg1, arg2, local21);
		}
		@Pc(69) byte[] local69 = new byte[arg1 * arg2];
		for (local23 = 0; local23 < arg2; local23++) {
			local33 = arg3[local23] + arg1 * local23;
			for (local35 = 0; local35 < arg4[local23]; local35++) {
				local69[local33++] = -1;
			}
		}
		return new Class1_Sub2(arg0, arg1, arg2, local69);
	}
}
