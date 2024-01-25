import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "z", descriptor = "Lclient!ha;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!aca", name = "B", descriptor = "I")
	public static int anInt111;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!rg;I)Lclient!lca;")
	public static Class182 method106(@OriginalArg(0) Class6_Sub40 arg0) {
		@Pc(12) String local12 = arg0.method8611();
		@Pc(19) Class238 local19 = Static613.method8515()[arg0.method8604()];
		@Pc(26) Class79 local26 = Static23.method3614()[arg0.method8604()];
		@Pc(30) int local30 = arg0.method8615();
		@Pc(34) int local34 = arg0.method8615();
		@Pc(38) int local38 = arg0.method8604();
		@Pc(42) int local42 = arg0.method8604();
		@Pc(46) int local46 = arg0.method8604();
		@Pc(50) int local50 = arg0.method8571();
		@Pc(54) int local54 = arg0.method8571();
		@Pc(58) int local58 = arg0.method8579();
		@Pc(64) int local64 = arg0.method8579();
		@Pc(68) int local68 = arg0.method8579();
		return new Class182(local12, local19, local26, local30, local34, local38, local42, local46, local50, local54, local58, local64, local68);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!bs;I)V")
	public static void method107(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub1 arg0) {
		@Pc(16) Class6_Sub49 local16 = (Class6_Sub49) Static554.aClass128_8.method3560((long) arg0.anInt5567);
		if (local16 == null) {
			Static474.method7154(arg0, arg0.anIntArray335[0], arg0.anIntArray336[0], 0, (Class20_Sub2_Sub2_Sub1_Sub2) null, arg0.aByte131, (Class312) null);
		} else {
			local16.method8168();
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ICI)C")
	public static char method108(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}
}
