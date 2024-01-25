import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "Lclient!sh;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
	public static int anInt2773;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
	public static void method2355() {
		for (@Pc(17) Class6_Sub34 local17 = (Class6_Sub34) Static60.aClass209_5.method5037(); local17 != null; local17 = (Class6_Sub34) Static60.aClass209_5.method5036()) {
			Static270.method3993(local17.anInt5400);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(CB)C")
	public static char method2359(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!sha;)Lclient!sha;")
	public static Class321 method2361(@OriginalArg(1) Class321 arg0) {
		@Pc(11) Class321 local11 = Static83.method1458(arg0);
		if (local11 == null) {
			local11 = arg0.aClass321_41;
		}
		return local11;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIBIII)V")
	public static void method2362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg0; local3 <= arg1; local3++) {
			Static270.method3998(arg3, arg2, arg4, Static173.anIntArrayArray15[local3]);
		}
	}

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "(I)V")
	public static void method2364() {
		Static340.aClass10_37.method375();
		Static229.aClass10_18.method375();
		Static217.aClass10_16.method375();
		Static336.aClass10_35.method375();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(JIZI)Ljava/lang/String;")
	public static String method2367(@OriginalArg(0) long arg0, @OriginalArg(3) int arg1) {
		Static353.method5122(arg0);
		@Pc(10) Calendar local10 = Static43.aCalendar2;
		@Pc(21) int local21 = local10.get(5);
		@Pc(27) int local27 = local10.get(2) + 1;
		@Pc(31) int local31 = local10.get(1);
		@Pc(35) int local35 = local10.get(11);
		@Pc(46) int local46 = local10.get(12);
		return Integer.toString(local21 / 10) + local21 % 10 + "/" + local27 / 10 + local27 % 10 + "/" + local31 % 100 / 10 + local31 % 10 + " " + local35 / 10 + local35 % 10 + ":" + local46 / 10 + local46 % 10;
	}
}
