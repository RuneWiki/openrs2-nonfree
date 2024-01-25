import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Lclient!ffa;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "Lclient!ri;")
	public static Class284 aClass284_104;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
	public static int anInt6219 = 0;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
	public static int anInt6222 = 0;

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
	public static int anInt6228 = 104;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "([BIII)[B")
	public static byte[] method5013(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) byte[] local13;
		if (arg2 > 0) {
			local13 = new byte[arg1];
			for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
				local13[local15] = arg0[local15 + arg2];
			}
		} else {
			local13 = arg0;
		}
		@Pc(41) Class130 local41 = new Class130();
		local41.method3489();
		local41.method3486((long) (arg1 * 8), local13);
		@Pc(60) byte[] local60 = new byte[64];
		local41.method3485(local60);
		return local60;
	}
}
