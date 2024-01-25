import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!nia", name = "f", descriptor = "Lclient!fa;")
	public static final Class89 aClass89_28 = new Class89(12, 0, 1, 0);

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)V")
	public static void method7183() {
		Static560.aClass166_55.method4811();
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)Z")
	public static boolean method7189() {
		return Static96.method1571("jaclib") ? Static96.method1571("hw3d") : false;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Ljava/lang/String;CILjava/lang/String;)Ljava/lang/String;")
	public static String method7191(@OriginalArg(0) String arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(21) int local21 = 0;
			while (true) {
				local21 = arg1.indexOf(13, local21);
				if (local21 < 0) {
					break;
				}
				local13 += local17;
				local21++;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local13);
		@Pc(45) int local45 = 0;
		while (true) {
			@Pc(50) int local50 = arg1.indexOf(13, local45);
			if (local50 < 0) {
				local43.append(arg1.substring(local45));
				return local43.toString();
			}
			local43.append(arg1.substring(local45, local50));
			local43.append(arg0);
			local45 = local50 + 1;
		}
	}
}
