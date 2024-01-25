import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!da;")
	public static Class80 aClass80_10;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!fs;")
	public static Class134 aClass134_33;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_50 = new Class391(8);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_98 = new Class387(40, 16);

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!el;")
	public static final Class109 aClass109_189 = new Class109(89, -1);

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!el;")
	public static final Class109 aClass109_190 = new Class109(86, 4);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method7890(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(13) int local13 = arg0.indexOf("--> ");
		if (local13 >= 0) {
			local7 = arg0.substring(0, local13 + 4);
			arg0 = arg0.substring(local13 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(52) int local52 = arg0.indexOf(" ", "directlogin ".length());
			if (local52 >= 0) {
				@Pc(57) int local57 = arg0.length();
				arg0 = arg0.substring(0, local52) + " ";
				for (@Pc(73) int local73 = local52 + 1; local73 < local57; local73++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z")
	public static boolean method7891(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
