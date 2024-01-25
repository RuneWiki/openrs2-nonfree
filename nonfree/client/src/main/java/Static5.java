import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!aha;")
	public static Class3_Sub6 aClass3_Sub6_1;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!uu;")
	public static Class343 aClass343_8;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_4 = new Class194(112, -1);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method81(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
