import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "S")
	public static short aShort68 = 320;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5843(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static412.aStringArray45.length; local7++) {
			if (Static412.aStringArray45[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
	public static void method5845(@OriginalArg(1) boolean arg0) {
		if (Static52.aClass64_1 != null) {
			Static52.aClass64_1.method1812();
			Static52.aClass64_1 = null;
		}
		Static558.anInt9502 = 0;
		Static41.method1127();
		Static6.method501();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static55.aClass194Array1[local19].method4812();
		}
		Static342.method5387(false);
		System.gc();
		Static165.method3354();
		Static499.anInt8891 = -1;
		Static439.aBoolean592 = false;
		Static114.method2312(true);
		Static94.anInt2266 = 0;
		Static191.anInt4147 = 0;
		Static335.anInt6221 = 0;
		Static314.anInt8010 = 0;
		Static162.anInt3682 = 0;
		Static247.anInt5049 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static83.aClass332Array2.length; local58++) {
			Static83.aClass332Array2[local58] = null;
		}
		Static352.method5715();
		for (@Pc(73) int local73 = 0; local73 < 2048; local73++) {
			Static239.aClass11_Sub1_Sub1_Sub2Array1[local73] = null;
		}
		Static208.anInt4409 = 0;
		Static506.aClass305_36.method7440();
		Static452.anInt8286 = 0;
		Static516.aClass305_37.method7440();
		Static37.method1092();
		Static444.anInt8179 = 0;
		Static435.aClass234_1.method5835();
		Static73.method1563();
		Static440.method6725();
		Static503.aLong217 = 0L;
		Static133.aClass6_Sub47_2 = null;
		if (arg0) {
			Static145.method2683(12);
			return;
		}
		Static145.method2683(3);
		try {
			Static590.method5698("loggedout", Static87.anApplet1);
		} catch (@Pc(120) Throwable local120) {
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ICI)C")
	public static char method5846(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
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

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BIZIZ)Lclient!jo;")
	public static Class168 method5848(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Class266 local5 = null;
		if (Static473.aClass318_5 != null) {
			local5 = new Class266(arg0, Static473.aClass318_5, Static554.aClass318Array1[arg0], 1000000);
		}
		Static206.aClass164_Sub1Array1[arg0] = Static218.aClass204_1.method4915(Static311.aClass266_5, local5, arg0);
		if (arg1) {
			Static206.aClass164_Sub1Array1[arg0].method4274();
		}
		return new Class168(Static206.aClass164_Sub1Array1[arg0], arg2, 1);
	}
}
