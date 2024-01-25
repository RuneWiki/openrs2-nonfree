import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_28 = new Class169(4);

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_92 = new Class215(51, 17);

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IB)I")
	public static int method4073(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/lang/String;C)I")
	public static int method4074(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local7++;
			}
		}
		return local7;
	}
}
