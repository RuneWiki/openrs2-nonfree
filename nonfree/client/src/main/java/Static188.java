import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
	public static int anInt5454;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public static int anInt5447 = 0;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
	public static int anInt5450 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method4863(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(17) int local17;
		if (local9 == 0) {
			local17 = 0;
		} else {
			local17 = 8 - local9;
		}
		@Pc(31) int local31 = -((arg2 + 8 - 1) / 8);
		@Pc(40) int local40 = -((arg0 + 8 - 1) / 8);
		for (@Pc(42) int local42 = local31; local42 < 0; local42++) {
			for (@Pc(46) int local46 = local40; local46 < 0; local46++) {
				if (arg1[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local17;
			if (arg1[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(CB)C")
	public static char method4864(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
