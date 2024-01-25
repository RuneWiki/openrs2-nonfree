import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "J")
	public static long aLong169;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "Z")
	public static boolean aBoolean482;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_179 = new Class189("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_89 = new Class217(38, 3);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ICI)C")
	public static char method4394(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
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

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Lclient!rl;")
	public static Class7_Sub3 method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass7_Sub3_3;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIII)I")
	public static int method4398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static444.aClass159Array3 == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(24) int local24 = arg3 >> 7;
			@Pc(28) int local28 = arg0 >> 7;
			if (arg1 < 0 || arg2 < 0 || Static40.anInt1089 - 1 < arg1 || arg2 > Static44.anInt7276 - 1) {
				return 0;
			}
			if (local24 < 1 || local28 < 1 || Static40.anInt1089 - 1 < local24 || local28 > Static44.anInt7276 - 1) {
				return 0;
			}
			@Pc(99) boolean local99 = (Static9.aByteArrayArrayArray1[1][arg3 >> 7][arg0 >> 7] & 0x2) != 0;
			@Pc(124) boolean local124;
			@Pc(143) boolean local143;
			if ((arg3 & 0x7F) == 0) {
				local124 = (Static9.aByteArrayArrayArray1[1][local24 - 1][arg0 >> 7] & 0x2) != 0;
				local143 = (Static9.aByteArrayArrayArray1[1][local24][arg0 >> 7] & 0x2) != 0;
				if (local124 != local143) {
					local99 = (Static9.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) != 0;
				}
			}
			if ((arg0 & 0x7F) == 0) {
				local124 = (Static9.aByteArrayArrayArray1[1][arg3 >> 7][local28 - 1] & 0x2) != 0;
				local143 = (Static9.aByteArrayArrayArray1[1][arg3 >> 7][local28] & 0x2) != 0;
				if (local124 != local143) {
					local99 = (Static9.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) != 0;
				}
			}
			if (local99) {
				arg4++;
			}
		}
		return Static444.aClass159Array3[arg4].va(arg3, arg0);
	}
}
