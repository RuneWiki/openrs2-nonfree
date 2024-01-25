import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!u;")
	public static Class239 aClass239_5;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	public static int anInt6970 = 503;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZIII)Z")
	public static boolean method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg0; local7++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg4; local16++) {
				if (Static34.anIntArrayArray5[local7][local16] == arg2 && Static275.anIntArrayArray60[local7][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILclient!gv;Lclient!gv;)V")
	public static void method5461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub4 arg3, @OriginalArg(4) Class4_Sub4 arg4) {
		@Pc(4) Class113 local4 = Static363.method5062(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass4_Sub4_2 = arg3;
			local4.aClass4_Sub4_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZC)C")
	public static char method5462(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIB)V")
	public static void method5464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1011) {
			Static290.method4226(Static104.aClass222_2, arg2, arg1);
		} else if (arg0 == 1002) {
			Static290.method4226(Static159.aClass222_4, arg2, arg1);
		} else if (arg0 == 1008) {
			Static290.method4226(Static27.aClass222_10, arg2, arg1);
		} else if (arg0 == 1001) {
			Static290.method4226(Static120.aClass222_3, arg2, arg1);
		} else if (arg0 == 1006) {
			Static290.method4226(Static284.aClass222_6, arg2, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!tk;IILclient!qa;Lclient!fh;Lclient!df;)V")
	public static void method5466(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub38 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class26 arg4, @OriginalArg(6) Class83 arg5, @OriginalArg(7) Class49 arg6) {
		@Pc(15) int local15 = arg1.anInt6766 - arg2 / 2 - 5;
		@Pc(19) int local19 = arg3 + 2;
		if (arg5.anInt2331 != 0) {
			arg4.method2245(arg0 * arg6.method1276() + arg3 + 1 - local19, local15, local19, arg2 + 10, arg5.anInt2331);
		}
		if (arg5.anInt2314 != 0) {
			arg4.method2278(local15, arg2 + 10, local19, arg5.anInt2314, arg6.method1276() * arg0 + arg3 + 1 - local19);
		}
		@Pc(82) int local82 = arg5.anInt2335;
		if (arg1.aBoolean577 && arg5.anInt2310 != -1) {
			local82 = arg5.anInt2310;
		}
		for (@Pc(94) int local94 = 0; local94 < arg0; local94++) {
			@Pc(100) String local100 = Static238.aStringArray22[local94];
			if (arg0 - 1 > local94) {
				local100 = local100.substring(0, local100.length() - 4);
			}
			arg6.method1277(arg4, local100, arg1.anInt6766, arg3, local82);
			arg3 += arg6.method1276();
		}
	}
}
