import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_146 = new Class157(71, 4);

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
	public static int anInt4878 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(CII)C")
	public static char method4170(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!iq;I)V")
	public static void method4176(@OriginalArg(0) Class104 arg0) {
		Static149.aClass104_89 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIBIII)V")
	public static void method4178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg6 - 334;
		if (local12 < 0) {
			local12 = 0;
		} else if (local12 > 100) {
			local12 = 100;
		}
		@Pc(37) int local37 = local12 * (Static12.aShort1 - Static74.aShort63) / 100 + Static74.aShort63;
		@Pc(43) int local43 = local37 * arg2 >> 8;
		@Pc(49) int local49 = 16384 - arg4 & 0x3FFF;
		@Pc(56) int local56 = 16384 - arg1 & 0x3FFF;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = local43;
		if (local49 != 0) {
			local60 = Class101.anIntArray234[local49] * -local43 >> 15;
			local62 = Class101.anIntArray235[local49] * local43 >> 15;
		}
		if (local56 != 0) {
			local58 = local62 * Class101.anIntArray234[local56] >> 15;
			local62 = local62 * Class101.anIntArray235[local56] >> 15;
		}
		Static195.anInt4286 = arg1;
		Static51.anInt879 = arg0 - local62;
		Static23.anInt356 = arg5 - local60;
		Static166.anInt3804 = arg3 - local58;
		Static234.anInt5031 = 0;
		Static168.anInt3820 = arg4;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IB)I")
	public static int method4179(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
