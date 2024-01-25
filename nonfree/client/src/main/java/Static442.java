import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!sba", name = "o", descriptor = "Lclient!pb;")
	public static Class227 aClass227_2;

	@OriginalMember(owner = "client!sba", name = "D", descriptor = "[I")
	public static int[] anIntArray584;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
	public static void method6257() {
		for (@Pc(7) int local7 = 0; local7 < Static227.aClass227ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static227.aClass227ArrayArray1[local7].length; local11++) {
				Static227.aClass227ArrayArray1[local7][local11] = Static281.aClass227_1;
			}
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BIC)I")
	public static int method6259(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IC)Z")
	public static boolean method6260(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
