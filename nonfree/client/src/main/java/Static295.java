import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
	public static int anInt5332 = 1;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(CI)Z")
	public static boolean method4394(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BLclient!ac;)Lclient!pe;")
	public static Class23_Sub1 method4395(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(7) Class23 local7 = Static551.method7500(arg0);
		@Pc(11) int local11 = arg0.method7945();
		@Pc(15) int local15 = arg0.method7945();
		@Pc(19) int local19 = arg0.method7945();
		@Pc(23) int local23 = arg0.method7945();
		@Pc(32) int local32 = arg0.method7945();
		@Pc(36) int local36 = arg0.method7945();
		return new Class23_Sub1(local7.aClass259_12, local7.aClass216_12, local7.anInt8315, local7.anInt8308, local7.anInt8314, local7.anInt8309, local7.anInt8312, local7.anInt8311, local7.anInt8310, local11, local15, local19, local23, local32, local36);
	}
}
