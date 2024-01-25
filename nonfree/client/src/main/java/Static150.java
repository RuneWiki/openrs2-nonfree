import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIJI)Ljava/lang/String;")
	public static String method2777(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static343.method5120(arg1);
		@Pc(12) Calendar local12 = Static462.aCalendar5;
		@Pc(23) int local23 = local12.get(5);
		@Pc(27) int local27 = local12.get(2);
		@Pc(31) int local31 = local12.get(1);
		@Pc(35) int local35 = local12.get(11);
		@Pc(39) int local39 = local12.get(12);
		return arg0 == 3 ? Static660.method9069(arg1, arg0) : Integer.toString(local23 / 10) + local23 % 10 + "-" + Static558.aStringArrayArray2[arg0][local27] + "-" + local31 + " " + local35 / 10 + local35 % 10 + ":" + local39 / 10 + local39 % 10;
	}
}
