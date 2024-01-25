import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_57 = new Class267("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
	public static int anInt3941 = 0;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
	public static int anInt3944 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Lclient!hg;")
	public static Class101 method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static409.aClass101ArrayArrayArray3[0][arg1][arg2] != null && Static409.aClass101ArrayArrayArray3[0][arg1][arg2].aClass101_1 != null;
			if (local28 && arg0 >= Static295.anInt5507 - 1) {
				return null;
			}
			Static300.method4424(arg0, arg1, arg2);
		}
		return Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	public static void method3261() {
		if (Static79.aBoolean139) {
			return;
		}
		Static293.method298(Static223.aClass101ArrayArrayArray2);
		if (Static147.aClass101ArrayArrayArray1 != null) {
			Static293.method298(Static147.aClass101ArrayArrayArray1);
		}
		Static79.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg1 && arg2 == arg4 && arg5 == arg3 && arg6 == arg7) {
			Static292.method4380(arg8, arg0, arg5, arg6, arg2);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(34) int local34 = arg2;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg2 * 3;
		@Pc(46) int local46 = arg1 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg3 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(68) int local68 = local46 + arg5 - arg0 - local54;
		@Pc(77) int local77 = arg6 + local50 - local58 - arg2;
		@Pc(87) int local87 = local38 + local54 - local46 - local46;
		@Pc(98) int local98 = local58 + local42 - local50 - local50;
		@Pc(103) int local103 = local46 - local38;
		@Pc(108) int local108 = local50 - local42;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local118 * local110 >> 12;
			@Pc(128) int local128 = local124 * local68;
			@Pc(132) int local132 = local124 * local77;
			@Pc(136) int local136 = local118 * local87;
			@Pc(140) int local140 = local98 * local118;
			@Pc(144) int local144 = local103 * local110;
			@Pc(148) int local148 = local110 * local108;
			@Pc(158) int local158 = arg0 + (local144 + local128 + local136 >> 12);
			@Pc(169) int local169 = arg2 + (local148 + local140 + local132 >> 12);
			Static292.method4380(arg8, local32, local158, local169, local34);
			local32 = local158;
			local34 = local169;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IC)C")
	public static char method3263(@OriginalArg(1) char arg0) {
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
}
