import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "Lclient!tr;")
	public static Class350 aClass350_1;

	@OriginalMember(owner = "client!jda", name = "j", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "Lclient!op;")
	public static final Class275 aClass275_10 = new Class275("", 12);

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "Lclient!tf;")
	public static final Class340 aClass340_37 = new Class340();

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)V")
	public static void method4638(@OriginalArg(1) int arg0) {
		if (!Static172.method3336(arg0, (byte) -31)) {
			return;
		}
		@Pc(15) Class381[] local15 = Static686.aClass381ArrayArray2[arg0];
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(32) Class381 local32 = local15[local17];
			if (local32 != null && local32.aClass104_11 != null) {
				local32.aClass104_11.method9022();
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BI)Z")
	public static boolean method4639(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
