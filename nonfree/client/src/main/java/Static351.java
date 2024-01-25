import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static351 {

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
	public static int anInt6168;

	@OriginalMember(owner = "client!rv", name = "Q", descriptor = "Lclient!pc;")
	public static Class188 aClass188_97;

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "[I")
	public static final int[] anIntArray416 = new int[4096];

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "Lclient!cr;")
	public static Class41 aClass41_13 = null;

	@OriginalMember(owner = "client!rv", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[200];

	@OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
	public static int anInt6176 = 100;

	@OriginalMember(owner = "client!rv", name = "N", descriptor = "[I")
	public static final int[] anIntArray417 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!rv", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!rv", name = "X", descriptor = "I")
	public static int anInt6183 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!pc;)V")
	public static void method4906(@OriginalArg(1) Class188 arg0) {
		Static191.anInt3766 = arg0.method4279("p11_full");
		Static205.anInt3959 = arg0.method4279("p12_full");
		Static77.anInt7118 = arg0.method4279("b12_full");
		Static119.anInt2385 = arg0.method4279("hitmarks");
		Static419.anInt7349 = arg0.method4279("hitbar_default");
		Static352.anInt7235 = arg0.method4279("timerbar_default");
		Static406.anInt7052 = arg0.method4279("headicons_pk");
		Static99.anInt1741 = arg0.method4279("headicons_prayer");
		Static397.anInt6958 = arg0.method4279("hint_headicons");
		Static139.anInt2700 = arg0.method4279("hint_mapmarkers");
		Static151.anInt2929 = arg0.method4279("mapflag");
		Static339.anInt5985 = arg0.method4279("cross");
		Static294.anInt4185 = arg0.method4279("mapdots");
		Static358.anInt6320 = arg0.method4279("scrollbar");
		Static369.anInt6559 = arg0.method4279("name_icons");
		Static312.anInt2864 = arg0.method4279("floorshadows");
		Static143.anInt7606 = arg0.method4279("compass");
		Static447.anInt4686 = arg0.method4279("otherlevel");
		Static439.anInt7664 = arg0.method4279("hint_mapedge");
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)I")
	public static int method4908(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(CII)C")
	public static char method4910(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)Lclient!kl;")
	public static Class2_Sub2_Sub11 method4911() {
		return Static169.aClass2_Sub2_Sub11_3;
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)[Lclient!fr;")
	public static Class90[] method4912() {
		return new Class90[] { Static378.aClass90_27, Static129.aClass90_31, Static345.aClass90_16 };
	}
}
