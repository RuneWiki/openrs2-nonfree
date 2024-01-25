import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!f", name = "N", descriptor = "I")
	public static int anInt2054;

	@OriginalMember(owner = "client!f", name = "O", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array5;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_35 = new Class134("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
	public static void method1676() {
		Static419.aClass132_57.method2708();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIII)I")
	public static int method1677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg1;
		@Pc(32) int local32 = (arg0 & 0x7F) * local13 + (arg2 & 0x7F) * arg1 >> 7;
		@Pc(46) int local46 = (arg2 & 0x380) * arg1 + (arg0 & 0x380) * local13 >> 7;
		@Pc(60) int local60 = arg1 * (arg2 & 0xFC00) + (arg0 & 0xFC00) * local13 >> 7;
		return local60 & 0xFC00 | local46 & 0x380 | local32 & 0x7F;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIC)C")
	public static char method1678(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public static void method1679() {
		if (Static276.anInt4560 == 1 || Static276.anInt4560 == 3 || Static276.anInt4560 != Static84.anInt1558 && (Static276.anInt4560 == 0 || Static84.anInt1558 == 0)) {
			Static351.anInt5969 = 0;
			Static384.anInt6329 = 0;
			Static49.aClass72_11.method1650();
		}
		Static84.anInt1558 = Static276.anInt4560;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public static void method1680(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(8, arg0);
		local8.method3101();
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
	public static void method1681() {
		if (Static379.anInt6865 < 0) {
			Static435.anInt7039 = -1;
			Static379.anInt6865 = 0;
			Static49.anInt857 = -1;
		}
		if (Static379.anInt6865 > Static282.anInt3468) {
			Static435.anInt7039 = -1;
			Static49.anInt857 = -1;
			Static379.anInt6865 = Static282.anInt3468;
		}
		if (Static301.anInt3360 < 0) {
			Static435.anInt7039 = -1;
			Static301.anInt3360 = 0;
			Static49.anInt857 = -1;
		}
		if (Static301.anInt3360 > Static282.anInt3475) {
			Static301.anInt3360 = Static282.anInt3475;
			Static435.anInt7039 = -1;
			Static49.anInt857 = -1;
		}
	}
}
