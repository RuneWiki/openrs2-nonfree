import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lfa", name = "o", descriptor = "Lclient!rb;")
	public static Class297 aClass297_4;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_183 = new Class196(108, -1);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/lang/String;CILjava/lang/String;)Ljava/lang/String;")
	public static String method5133(@OriginalArg(0) String arg0, @OriginalArg(3) String arg1) {
		@Pc(6) int local6 = arg0.length();
		@Pc(9) int local9 = arg1.length();
		@Pc(11) int local11 = local6;
		@Pc(15) int local15 = local9 - 1;
		if (local15 != 0) {
			@Pc(22) int local22 = 0;
			while (true) {
				local22 = arg0.indexOf(13, local22);
				if (local22 < 0) {
					break;
				}
				local22++;
				local11 += local15;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local11);
		@Pc(45) int local45 = 0;
		while (true) {
			@Pc(50) int local50 = arg0.indexOf(13, local45);
			if (local50 < 0) {
				local43.append(arg0.substring(local45));
				return local43.toString();
			}
			local43.append(arg0.substring(local45, local50));
			local43.append(arg1);
			local45 = local50 + 1;
		}
	}
}
