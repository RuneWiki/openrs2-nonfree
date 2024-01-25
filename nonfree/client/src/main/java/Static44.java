import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
	public static int anInt942;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "[I")
	public static int[] anIntArray119 = new int[2];

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString31 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)I")
	public static int method807(@OriginalArg(0) int arg0) {
		@Pc(7) Class25 local7 = Static60.method1054(arg0);
		@Pc(10) int local10 = local7.anInt455;
		@Pc(18) int local18 = local7.anInt453;
		@Pc(21) int local21 = local7.anInt457;
		@Pc(28) int local28 = Class163.anIntArray430[local21 - local18];
		return local28 & Static103.anIntArray295[local10] >> local18;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!fd;IIIIII)V")
	public static void method808(@OriginalArg(1) Class72 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static272.aBoolean493) {
			Static297.anInt6006 = 32;
		} else {
			Static297.anInt6006 = 0;
		}
		Static272.aBoolean493 = false;
		@Pc(136) int local136;
		if (Static136.anInt3094 != 0) {
			if (arg3 <= arg1 && arg3 + 16 > arg1 && arg2 <= arg5 && arg5 < arg2 + 16) {
				arg0.anInt1864 -= 4;
				Static238.method4097(arg0);
			} else if (arg3 <= arg1 && arg3 + 16 > arg1 && arg4 + arg2 - 16 <= arg5 && arg2 + arg4 > arg5) {
				arg0.anInt1864 += 4;
				Static238.method4097(arg0);
			} else if (arg1 >= arg3 - Static297.anInt6006 && arg3 + Static297.anInt6006 + 16 > arg1 && arg5 >= arg2 + 16 && arg4 + arg2 - 16 > arg5) {
				local136 = (arg4 - 32) * arg4 / arg6;
				if (local136 < 8) {
					local136 = 8;
				}
				@Pc(152) int local152 = arg5 - local136 / 2 - arg2 - 16;
				@Pc(159) int local159 = arg4 - local136 - 32;
				arg0.anInt1864 = (arg6 - arg4) * local152 / local159;
				Static238.method4097(arg0);
				Static272.aBoolean493 = true;
			}
		}
		if (Static32.anInt3682 == 0) {
			return;
		}
		local136 = arg0.anInt1829;
		if (arg3 - local136 <= arg1 && arg5 >= arg2 && arg3 + 16 > arg1 && arg2 + arg4 >= arg5) {
			arg0.anInt1864 += Static32.anInt3682 * 45;
			Static238.method4097(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(CB)C")
	public static char method809(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!am;)Lclient!nl;")
	public static Class4_Sub31 method810(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		@Pc(13) byte[] local13 = arg1.method300(arg0);
		return local13 == null ? null : new Class4_Sub31(local13);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!am;B)V")
	public static void method811(@OriginalArg(0) Class11 arg0) {
		Static224.aClass11_88 = arg0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
	public static void method813(@OriginalArg(1) int arg0) {
		Static200.anIntArray364 = new int[arg0];
		Static238.anIntArray408 = new int[arg0];
		anIntArray119 = new int[arg0];
		Static8.anIntArray41 = new int[arg0];
		Static211.anIntArray367 = new int[arg0];
	}
}
