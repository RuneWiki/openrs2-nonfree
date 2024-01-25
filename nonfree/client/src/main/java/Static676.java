import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "[I")
	public static int[] anIntArray669 = new int[2];

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method8726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!fca;I)Lclient!ng;")
	public static Class3_Sub2 method8727(@OriginalArg(0) Class3_Sub17 arg0) {
		arg0.method4888();
		@Pc(18) int local18 = arg0.method4888();
		@Pc(22) Class3_Sub2 local22 = Static34.method1088(local18);
		local22.anInt10292 = arg0.method4888();
		@Pc(31) int local31 = arg0.method4888();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method4888();
			local22.method8709(arg0, local39);
		}
		local22.method8712();
		return local22;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Lclient!kh;")
	public static Class208 method8728(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static562.aClass208ArrayArray3[local7] == null || Static562.aClass208ArrayArray3[local7][local11] == null) {
			@Pc(30) boolean local30 = Static368.method5461(local7);
			if (!local30) {
				return null;
			}
		}
		return Static562.aClass208ArrayArray3[local7][local11];
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V")
	public static void method8729(@OriginalArg(1) boolean arg0) {
		if (Static337.aString75.length() == 0) {
			return;
		}
		Static339.method5160("--> " + Static337.aString75);
		Static145.method2526(Static337.aString75, arg0, false);
		Static337.aString75 = "";
		Static280.anInt5243 = 0;
		Static22.anInt708 = 0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BCI)C")
	public static char method8731(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
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
}
