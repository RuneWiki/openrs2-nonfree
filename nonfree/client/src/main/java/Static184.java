import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Lclient!uaa;")
	public static Class337 aClass337_2;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "Lclient!gj;")
	public static final Class115 aClass115_2 = new Class115();

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Lclient!gj;")
	public static final Class115 aClass115_5 = new Class115();

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "Lclient!gj;")
	public static final Class115 aClass115_3 = new Class115();

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Lclient!gj;")
	public static final Class115 aClass115_4 = new Class115();

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "Lclient!cda;")
	public static final Class47 aClass47_4 = new Class47("RC", 1);

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public static int anInt3781 = 0;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg3 && arg6 == arg7 && arg1 == arg0 && arg2 == arg5) {
			Static169.method3110(arg5, arg8, arg3, arg1, arg7);
			return;
		}
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg7;
		@Pc(37) int local37 = arg3 * 3;
		@Pc(41) int local41 = arg7 * 3;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(49) int local49 = arg6 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(57) int local57 = arg2 * 3;
		@Pc(68) int local68 = arg1 + local45 - arg3 - local53;
		@Pc(77) int local77 = local49 + arg5 - local57 - arg7;
		@Pc(88) int local88 = local53 + local37 - local45 - local45;
		@Pc(98) int local98 = local57 + local41 - local49 - local49;
		@Pc(102) int local102 = local45 - local37;
		@Pc(107) int local107 = local49 - local41;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(117) int local117 = local109 * local109 >> 12;
			@Pc(123) int local123 = local117 * local109 >> 12;
			@Pc(127) int local127 = local123 * local68;
			@Pc(131) int local131 = local77 * local123;
			@Pc(135) int local135 = local117 * local88;
			@Pc(139) int local139 = local117 * local98;
			@Pc(143) int local143 = local109 * local102;
			@Pc(147) int local147 = local109 * local107;
			@Pc(159) int local159 = arg3 + (local143 + local127 + local135 >> 12);
			@Pc(169) int local169 = (local147 + local139 + local131 >> 12) + arg7;
			Static169.method3110(local169, arg8, local31, local159, local33);
			local31 = local159;
			local33 = local169;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([BI)[B")
	public static byte[] method3349(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static655.method5836(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "([BI)Z")
	public static boolean method3350(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class6_Sub40 local13 = new Class6_Sub40(arg0);
		@Pc(17) int local17 = local13.method8604();
		if (local17 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method8604() == 1;
		if (local33) {
			Static169.method3107(local13);
		}
		Static12.method220(local13);
		return true;
	}
}
