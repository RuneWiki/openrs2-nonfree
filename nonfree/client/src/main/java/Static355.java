import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!um", name = "K", descriptor = "[I")
	public static int[] anIntArray756;

	@OriginalMember(owner = "client!um", name = "I", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_226 = new Class221("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!um", name = "J", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_188 = new Class41(28, 7);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method5385(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static235.aString41 = arg0;
		Static53.aString7 = arg2;
		Static25.anInt604 = arg1;
		if (Static53.aString7.equals("") || Static235.aString41.equals("")) {
			Static217.anInt4042 = 3;
		} else if (Static259.anInt4618 == -1) {
			Static244.anInt1016 = 0;
			Static217.anInt4042 = -3;
			Static155.anInt2780 = 0;
			Static255.anInt1792 = 1;
			@Pc(44) Class2_Sub13 local44 = new Class2_Sub13(128);
			local44.method4207(10);
			local44.method4218((int) (Math.random() * 9.9999999E7D));
			local44.method4208(Static389.method5718(Static53.aString7));
			local44.method4218((int) (Math.random() * 9.9999999E7D));
			local44.method4230(Static235.aString41);
			local44.method4218((int) (Math.random() * 9.9999999E7D));
			local44.method4233(Static41.aBigInteger1, Static318.aBigInteger5);
			Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
			Static39.aClass2_Sub13_Sub2_4.method4207(Static74.aClass101_20.anInt2534);
			Static39.aClass2_Sub13_Sub2_4.method4207(local44.anInt4788 + 2);
			Static39.aClass2_Sub13_Sub2_4.method4199(572);
			Static39.aClass2_Sub13_Sub2_4.method4191(local44.anInt4788, local44.aByteArray77);
		} else {
			Static359.method5438();
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Lclient!gu;")
	public static Class93 method5386() {
		try {
			return (Class93) Class.forName("Class93_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(CII)C")
	public static char method5387(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIB)I")
	public static int method5388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg0) {
			return arg2 < arg1 ? arg2 : arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Static134.aShort20 + local7 * (Static38.aShort13 - Static134.aShort20) / 100;
		@Pc(39) int local39 = arg6 * local33 >> 8;
		@Pc(46) int local46 = 16384 - arg3 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg4 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local39;
		if (local46 != 0) {
			local57 = -local39 * Class104.anIntArray705[local46] >> 15;
			local59 = local39 * Class104.anIntArray706[local46] >> 15;
		}
		if (local53 != 0) {
			local55 = local59 * Class104.anIntArray705[local53] >> 15;
			local59 = Class104.anIntArray706[local53] * local59 >> 15;
		}
		Static392.anInt6749 = arg4;
		Static71.anInt1354 = arg5 - local57;
		Static315.anInt5585 = 0;
		Static278.anInt1556 = arg3;
		Static160.anInt2915 = arg2 - local55;
		Static22.anInt547 = arg0 - local59;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII)V")
	public static void method5390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static298.anIntArrayArray46 != null) {
			Static298.anIntArrayArray46[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static57.aByteArrayArray14 != null) {
			Static57.aByteArrayArray14[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static354.aByteArrayArray20 != null) {
			Static354.aByteArrayArray20[arg0][arg1] = (byte) arg4;
		}
	}
}
