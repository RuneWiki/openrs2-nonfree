import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!hs", name = "I", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_152 = new Class159("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!hs", name = "K", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_153 = new Class159("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!hs", name = "L", descriptor = "[I")
	public static final int[] anIntArray260 = new int[5];

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2586(@OriginalArg(1) long arg0) {
		Static210.aCalendar2.setTime(new Date(arg0));
		@Pc(18) int local18 = Static210.aCalendar2.get(7);
		@Pc(22) int local22 = Static210.aCalendar2.get(5);
		@Pc(26) int local26 = Static210.aCalendar2.get(2);
		@Pc(30) int local30 = Static210.aCalendar2.get(1);
		@Pc(34) int local34 = Static210.aCalendar2.get(11);
		@Pc(38) int local38 = Static210.aCalendar2.get(12);
		@Pc(42) int local42 = Static210.aCalendar2.get(13);
		return Static119.aStringArray33[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static346.aStringArray84[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Lclient!qr;")
	public static Class170 method2587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class170 local7 = new Class170();
		local7.anInt5341 = -1;
		local7.anInt5332 = arg0 + 6;
		local7.anInt5337 = arg1 + 6;
		local7.anInt5336 = -1;
		local7.anIntArrayArray143 = new int[local7.anInt5337][local7.anInt5332];
		local7.method4593();
		return local7;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ICI)C")
	public static char method2594(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
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
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
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
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
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

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "(II)V")
	public static void method2597(@OriginalArg(1) int arg0) {
		if (Static166.method3253(arg0)) {
			Static340.method5461(Static271.aClass21ArrayArray1[arg0], -1);
		}
	}
}
