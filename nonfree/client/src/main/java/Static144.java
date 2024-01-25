import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_84 = new Class208(32, -1);

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_103 = new Class62("M", "M", "M", "M");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V")
	public static void method2627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(27) int local27 = Static86.method1459(Static121.anInt6758, arg1 + arg2, Static179.anInt3768);
		@Pc(36) int local36 = Static86.method1459(Static121.anInt6758, arg1 - arg2, Static179.anInt3768);
		Static307.method5019(Static152.anIntArrayArray30[arg0], local27, arg3, local36);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(87) int local87;
			@Pc(95) int local95;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = arg0 - local9;
				local69 = local9 + arg0;
				if (local69 >= Static317.anInt5793 && local65 <= Static69.anInt1551) {
					local87 = Static86.method1459(Static121.anInt6758, arg1 + local7, Static179.anInt3768);
					local95 = Static86.method1459(Static121.anInt6758, arg1 - local7, Static179.anInt3768);
					if (local69 <= Static69.anInt1551) {
						Static307.method5019(Static152.anIntArrayArray30[local69], local87, arg3, local95);
					}
					if (local65 >= Static317.anInt5793) {
						Static307.method5019(Static152.anIntArrayArray30[local65], local87, arg3, local95);
					}
				}
			}
			local7++;
			local65 = arg0 - local7;
			local69 = local7 + arg0;
			if (local69 >= Static317.anInt5793 && Static69.anInt1551 >= local65) {
				local87 = Static86.method1459(Static121.anInt6758, arg1 + local9, Static179.anInt3768);
				local95 = Static86.method1459(Static121.anInt6758, arg1 - local9, Static179.anInt3768);
				if (Static69.anInt1551 >= local69) {
					Static307.method5019(Static152.anIntArrayArray30[local69], local87, arg3, local95);
				}
				if (Static317.anInt5793 <= local65) {
					Static307.method5019(Static152.anIntArrayArray30[local65], local87, arg3, local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(CIB)C")
	public static char method2628(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method2631() {
		Static48.aClass83_29.anInt2413 = 1;
		Static12.aClient1.method759();
		Static256.aBoolean363 = true;
		Static174.aBoolean267 = true;
		Static213.method3831();
		Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
		Static317.aClass208_165 = null;
		Static198.aClass208_113 = null;
		Static54.anInt1175 = 0;
		Static89.anInt1900 = 0;
		Static217.aClass208_121 = null;
		Static222.anInt4434 = 0;
		Static321.aClass2_Sub24_Sub2_34.anInt6669 = 0;
		Static178.aClass208_103 = null;
		for (@Pc(4359) int local4359 = 0; local4359 < Static16.aClass247Array1.length; local4359++) {
			Static16.aClass247Array1[local4359] = null;
		}
		for (@Pc(4382) int local4382 = 0; local4382 < 100; local4382++) {
			Static217.aStringArray25[local4382] = null;
		}
		Static378.anInt4759 = (int) (Math.random() * 100.0D) - 50;
		Static350.aFloat74 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static45.aBoolean446 = false;
		Static87.anInt1879 = 0;
		Static319.anInt5841 = (int) (Math.random() * 120.0D) - 60;
		Static347.anInt6374 = (int) (Math.random() * 80.0D) - 40;
		Static312.anInt5705 = (int) (Math.random() * 110.0D) - 55;
		Static59.anInt1283 = (int) (Math.random() * 30.0D) - 20;
		Static277.anInt5160 = 0;
		Static293.method763();
		for (@Pc(4449) int local4449 = 0; local4449 < 2048; local4449++) {
			Static42.aClass1_Sub2_Sub1_Sub1Array1[local4449] = null;
		}
		Static123.anInt5933 = 0;
		for (@Pc(4463) int local4463 = 0; local4463 < 32768; local4463++) {
			Static223.aClass1_Sub2_Sub1_Sub2Array1[local4463] = null;
		}
		Static307.aClass238_33.method5806();
		Static248.aClass238_25.method5806();
		Static119.aClass199_2.method4905();
		Static301.aClass243_24.method5970();
		Static35.aClass238_3 = new Class238();
		Static139.anInt2976 = 0;
		Static232.anInt4636 = 0;
		Static179.aClass115_1.method2783();
		Static43.method4502();
		Static181.anInt3812 = 0;
		Static78.anInt1721 = 0;
		Static178.anInt3759 = 0;
		Static226.anInt4563 = 0;
		Static115.anInt2550 = 0;
		Static120.anInt2645 = 0;
		Static311.anInt3023 = 0;
		Static182.anInt3889 = 0;
		Static141.anInt3014 = 0;
		Static177.anInt3750 = 0;
		for (@Pc(4524) int local4524 = 0; local4524 < Static318.anIntArray509.length; local4524++) {
			if (!Static137.aBooleanArray7[local4524]) {
				Static318.anIntArray509[local4524] = -1;
			}
		}
		if (Static388.anInt7080 != -1) {
			Static282.method4698(Static388.anInt7080);
		}
		for (@Pc(4554) Class2_Sub26 local4554 = (Class2_Sub26) Static273.aClass243_20.method5975(); local4554 != null; local4554 = (Class2_Sub26) Static273.aClass243_20.method5973()) {
			if (!local4554.method6126()) {
				local4554 = (Class2_Sub26) Static273.aClass243_20.method5975();
				if (local4554 == null) {
					break;
				}
			}
			Static110.method2010(local4554, false, true);
		}
		Static388.anInt7080 = -1;
		Static273.aClass243_20 = new Class243(8);
		Static34.method470();
		Static392.aClass3_19 = null;
		for (@Pc(4594) int local4594 = 0; local4594 < 8; local4594++) {
			Static209.aStringArray22[local4594] = null;
			Static312.aBooleanArray25[local4594] = false;
			Static38.anIntArray57[local4594] = -1;
		}
		Static221.method5899();
		Static260.aBoolean370 = true;
		for (@Pc(4618) int local4618 = 0; local4618 < 100; local4618++) {
			Static93.aBooleanArray10[local4618] = true;
		}
		Static29.anInt438 = 0;
		Static66.aString17 = null;
		Static43.aClass163Array2 = null;
		for (@Pc(4636) int local4636 = 0; local4636 < 6; local4636++) {
			Static146.aClass231Array1[local4636] = new Class231();
		}
		for (@Pc(4650) int local4650 = 0; local4650 < 25; local4650++) {
			Static385.anIntArray585[local4650] = 0;
			Static226.anIntArray377[local4650] = 0;
			Static140.anIntArray232[local4650] = 0;
		}
		Static370.method4288();
		Static221.aBoolean480 = true;
		Static53.aShortArray9 = Static388.aShortArray118 = Static44.aShortArray8 = Static249.aShortArray79 = new short[256];
		Static330.aString59 = Static57.aClass62_36.method1389(Static200.anInt4144);
		Static358.aBoolean467 = false;
		Static91.anInt1960 = 0;
		Static282.method4699();
		Static212.method3829();
		Static357.aClass2_Sub22_2 = null;
		Static48.aClass83_29.anInt2413 = 2;
		Static7.aLong4 = 0L;
	}
}
