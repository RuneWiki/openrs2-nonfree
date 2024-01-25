import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_101 = new Class12(19, -1);

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString39 = null;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)Z")
	public static boolean method2760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static120.method1916(arg1, arg0) || Static374.method4953(arg1, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2761(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static443.method4044(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1.charAt(local25) != arg0; local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}
}
