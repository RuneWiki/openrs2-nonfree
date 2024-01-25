import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!eh;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	public static int anInt8747;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "Lclient!gp;")
	public static Class117 aClass117_218;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
	public static final int[] anIntArray673 = new int[13];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method7107(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static545.method7424(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0 != arg1.charAt(local30); local30++) {
			}
			local15[local17++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local15[local10] = arg1.substring(local24);
		return local15;
	}
}
