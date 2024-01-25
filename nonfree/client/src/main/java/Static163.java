import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!id", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	public static int anInt3039 = 1;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_101 = new Class107(9, 2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(CII)C")
	public static char method2638(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIII[BI)V")
	public static void method2640(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(26) int local26 = arg1 - arg3 >> 2;
		arg0 += arg3;
		while (true) {
			local26--;
			if (local26 < 0) {
				local26 = arg1 - arg3 & 0x3;
				while (true) {
					local26--;
					if (local26 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(35) int local35 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg2[local35] = 1;
			@Pc(45) int local45 = local40 + 1;
			arg2[local40] = 1;
			arg0 = local45 + 1;
			arg2[local45] = 1;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I")
	public static int method2641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (local7 + arg1) / arg0 - local7;
	}
}
