import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
	public static int anInt6022;

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "Lclient!vn;")
	public static final Class347 aClass347_8 = new Class347();

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;BC)[Ljava/lang/String;")
	public static String[] method4750(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static477.method6937(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local19; arg0.charAt(local33) != arg1; local33++) {
			}
			local15[local17++] = arg0.substring(local19, local33);
			local19 = local33 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}
}
